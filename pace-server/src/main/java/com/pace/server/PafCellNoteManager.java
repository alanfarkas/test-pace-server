/*
 *	File: @(#)PafCellNoteManager.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Jul 18, 2007  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.db.Application;
import com.pace.base.db.DataSource;
import com.pace.base.db.Dimension;
import com.pace.base.db.cellnotes.CellNote;
import com.pace.base.db.cellnotes.CellNoteMapping;
import com.pace.base.db.cellnotes.CellNotesInformation;
import com.pace.base.db.cellnotes.SimpleCellNote;

/**
 * A Cell Note Manager that persist cell notes to/from the db using
 * Hibernate.
 * 
 * @author javaj
 * @version	2.00
 *
 */
public class PafCellNoteManager extends PafClientDbManager {

	//logger
	private static final Logger logger = Logger.getLogger(PafCellNoteManager.class);
	
	//reference to itself
	private static PafCellNoteManager _instance;

	//use single session or multi session when getSession() is called
	//private static boolean singleSession = false;
	
	//max db text length for derby
	private static final int CELL_NOTE_DB_TEXT_LENGTH = 32672;
	
	//instance of session factory
	//private static SessionFactory sessionFactory = null;
	
		
	/**
	 *	Singleton method.  If session is null, creates new one. If instance is null, creates
	 *  a new one.
	 *
	 * @return PafDataService
	 */
	public static PafCellNoteManager getInstance() {
				
		if (_instance == null) {

			_instance = new PafCellNoteManager();
			
		}
		return _instance;
	}
	
	/**
	 *	Singleton method
	 * 
	 * @param session used to override the default session behavior. ONLY USED in unit testing. 
	 *
	 * @return PafDataService
	 */
	public static PafCellNoteManager getInstance(Session session) {

		setSession(session);
						
		return PafCellNoteManager.getInstance();
	}
	
	/**
	 * Private constructor
	 * 
	 */
	private PafCellNoteManager() {

		logger.debug("Creating new PafCellNoteManager @ " + new Date());
				
	}
		
	/**
	 * 
	 * Returns the current hibernate session.
	 *
	 * @return Current hibernate session
	 * @throws PafException 
	 */
	public static Session getSession() throws PafException {
		
		Session session = null;
		
		//if single session, set session using client cache, otherwise open new session
		if ( isSingleSession() ) {			
			
			if ( PafClientDbManager.getSession() == null ) {
				
				setSession(PafMetaData.currentPafClientCacheDBSession());
				
			}
			
			session = PafClientDbManager.getSession();
			
		} else {
			
			logger.debug("Opening new hibernate session");
			
			//if session factory exists, open new session
			if ( getSessionFactory() != null ) {
				
				session = getSessionFactory().openSession();
				
			} else {
				
				logger.error("Couldn't get an instance of the client cache db session factory");
				
			}
			
		}
				
		return session;
	}
	

	/**
	 * 
	 * Returns an array of cell notes depending on application id, data source id and dimension/member combos.
	 * For example: 
	 * 		app id: 		"App1"
	 * 		data source id: "DS1"
	 * 		map: Product,  { "Div09", "Div03" }
	 * 			 Location, { "Store1" } 
	 * 			 Measures, { "SLS_AUR", "SLS_DLR" }
	 * 			 Version,  { "WP" }
	 * 
	 * 		Then the cell note array would contain any combination of those dimensions and members 
	 * 
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @param dimensionMemberMapSet Dimension Member Map Set, A map keyed off of dimension name, value of set (unique
	 * 									set of dimension members)
	 * @return cell note array of cell note search results based on app id, datasource id and dimension member set.
	 * @throws PafException 
	 */

	public CellNote[] getCellNotes(String applicationId, String dataSourceId, Map<String, Set<String>> dimensionMemberMapSet) throws PafException {
	
		return getCellNotes(applicationId, dataSourceId, dimensionMemberMapSet, null);
		
	}
	
	/**
	 * 
	 * Returns an array of cell notes depending on application id, data source id and dimension/member combos.
	 * For example: 
	 * 		app id: 		"App1"
	 * 		data source id: "DS1"
	 * 		map: Product,  { "Div09", "Div03" }
	 * 			 Location, { "Store1" } 
	 * 			 Measures, { "SLS_AUR", "SLS_DLR" }
	 * 			 Version,  { "WP" }
	 * 
	 * 		Then the cell note array would contain any combination of those dimensions and members 
	 * 
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @param dimensionMemberMapSet Dimension Member Map Set, A map keyed off of dimension name, value of set (unique
	 * 									set of dimension members)
	 * @param overrideSession used to override the default session
	 * 
	 * @return cell note array of cell note search results based on app id, datasource id and dimension member set.
	 * @throws PafException 
	 */

	public CellNote[] getCellNotes(String applicationId, String dataSourceId, Map<String, Set<String>> dimensionMemberMapSet, Session overrideSession) throws PafException {

		logger.debug("DEBUG - Start getCellNotes(String, String, Map<String, Set<String>>) - " + new Date());
		
		if ( applicationId == null || dataSourceId == null || dimensionMemberMapSet == null || dimensionMemberMapSet.size() == 0 ) {
			return null;
		}
		
		//holds list of cell notes to be returned
		List<CellNote> cellNoteList = null;
		
		StringBuffer strBuff = new StringBuffer(1000);
		
		strBuff.append("select * from cell_notes cn, (");
								
		Set<String> dimensionNameSet = dimensionMemberMapSet.keySet();
				
		String[] dynamicColumnNames = new String[dimensionNameSet.size()];
		
		int dimensionCnt = 0;
		
		//populate dynamic Column Name set
		for (String dimensionName : dimensionNameSet ) {
		
			String dynamicColumnName = "query_" + dimensionCnt;
			
			dynamicColumnNames[dimensionCnt++] = dynamicColumnName;
			
		}
	
		strBuff.append("select id, ");
		
		dimensionCnt = 0;
		
		for (String dynamicColumnName : dynamicColumnNames ) {
			
			strBuff.append(dynamicColumnName);
			
			if ( ++dimensionCnt == dynamicColumnNames.length ) {
				strBuff.append(' ');
			} else {
				strBuff.append(", ");
			}
			
		}
		
		strBuff.append(" from ( ");
		strBuff.append("SELECT cn.id, ");
		
		dimensionCnt = 0;
		
		for (String dimensionName : dimensionNameSet ) {
			
			Set<String> memberNameSet = dimensionMemberMapSet.get(dimensionName);
											
			strBuff.append("max(case when d.name = '" + dimensionName + "' and cnm.member_name in ( ");
			
			int memberCnt = 0;
			
			for (String memberName : memberNameSet ) {
				
				strBuff.append("'" + memberName + "'");
				
				if ( ++memberCnt != memberNameSet.size()) {
					strBuff.append(", ");
				}									
				
			}
							
			strBuff.append(") then 1 else 0 end) AS " + dynamicColumnNames[dimensionCnt]);
			
			if ( ++dimensionCnt != dimensionNameSet.size()) {
				strBuff.append(", ");
			} else {
				strBuff.append(' ');
			}
			
		}
		
		strBuff.append("FROM cell_notes cn, cell_note_mappings cnm, DIMENSIONS d, applications a, datasources ds ");
		strBuff.append("Where cn.ID = cnm.cell_note_id ");
		strBuff.append("AND cnm.dimension_id=d.ID ");
		strBuff.append("AND cn.application_id = a.id ");
		strBuff.append("AND cn.data_source_id = ds.id ");
		strBuff.append("and a.name = '"+ applicationId +"' ");
		strBuff.append("and ds.name = '" + dataSourceId + "' ");
		strBuff.append("and d.enabled = 'T' ");
		strBuff.append("group by cn.id) tmpTable ");
		
		int dynamicColumnCount = 0;
		
		for (String dynamicColumnName : dynamicColumnNames ) {
			
			if ( dynamicColumnCount == 0 ) {
				strBuff.append("where ");
			} else {
				strBuff.append("and ");
			}
			
			strBuff.append(dynamicColumnName + " = 1 ");
			
			
			dynamicColumnCount++;
			
		}
		
		strBuff.append(") filtered_table ");
		strBuff.append("where cn.id = filtered_table.id");		
									
				
		logger.debug(strBuff.toString());		
		
		Session session = null;
			
		try {
		
			//if override use, otherwise use session from manager
			if ( overrideSession != null ) {
				
				session = overrideSession;
				
			} else {
				
				session = getSession();
				
			}
		
			cellNoteList = session.createSQLQuery(strBuff.toString()).addEntity(CellNote.class).list();
		
		} catch (RuntimeException re ) {
							
			//log exception
			PafErrHandler.handleException(re, PafErrSeverity.Error);
			
		} finally {
			
			if ( overrideSession == null ) {
				
				//try to Close session if not single session
				tryToCloseSession(session);
				
			}

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}
			
		}

		logger.debug("DEBUG - End getCellNotes(String, String, Map<String, Set<String>>) - " + new Date());
		
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			
			return null;
			
		}		
		
		return cellNoteList.toArray(new CellNote[0]);
	}

	/**
	 * 
	 * Returns an array of cell notes depending on application id, data source id and dimension/member combos.
	 * For example: 
	 * 		app id: 		"App1"
	 * 		data source id: "DS1"
	 *      dimensionName:  "Years"
	 * 		map: Product,  { "Div09", "Div03" }
	 * 			 Location, { "Store1" } 
	 * 			 Measures, { "SLS_AUR", "SLS_DLR" }
	 * 			 Version,  { "WP" }
	 * 			 Years,    { "FY2006" }
	 * 
	 * 		Then the cell note array would contain any combination of those dimensions and members 
	 * 
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @param dimensionName Dimension to be searched on in query
	 * @param dimensionMemberMapSet Dimension Member Map Set, A map keyed off of dimension name, value of set (unique
	 * 									set of dimension members)
	 * @return cell note array of cell note search results based on app id, datasource id and dimension member set.
	 * @throws PafException 
	 */
	public CellNote[] getCellNotesByDimension(String applicationId, String dataSourceId, String dimensionName, Map<String, Set<String>> dimensionMemberMapSet) throws PafException {

		logger.debug("DEBUG - Start getCellNotesByDimension(String, String, String, Map<String, Set<String>>) - " + new Date());
		
		//holds list of cell notes to be returned
		List<CellNote> cellNoteList = null;
			
		if ( dimensionMemberMapSet.containsKey(dimensionName)) {
			
			Set<String> dimensionMemberSet = dimensionMemberMapSet.get(dimensionName); 
		
			Session session = getSession();
			
			try {				
						
				//build hql
				StringBuffer strBuff = new StringBuffer("select c from CellNote c, CellNoteMapping m, Dimension d ");
				
				strBuff.append("where c.id = m.cellNote and m.dimension = d.id ");
								
				strBuff.append("and d.name = '" + dimensionName + "' and m.memberName in ( ");
												
				int memberCnt = 0;
				
				Map<String, String> memberKeyMap = new HashMap<String, String>();
				
				//loop thorugh member set and build hql place holders, we'll replace with data values later
				for (String member : dimensionMemberSet ) {
									
					//create tmp member key
					// cleanup - and space characters w _
				
					String memberKey = dimensionName+"_"+member;
					
					memberKey = generateKey(memberKey);					
					
					//add member key to hql
					strBuff.append(":" + memberKey);

					memberKeyMap.put(memberKey, member);
			
					//add , if not last one
					if ( ++memberCnt != dimensionMemberSet.size() ) {
						
						strBuff.append(", ");
						
					}
				}
				
				strBuff.append(" ) and d.enabled = 'T'");
				strBuff.append(" and c.application.name = '" + applicationId + "' ");
				strBuff.append(" and c.dataSource.name = '" + dataSourceId + "' ");
				//strBuff.append(" group by c.id, c.application, c.dataSource, c.creator, c.lastUpdated, c.text, c.visible");
								
				logger.debug(strBuff.toString());
				
				//create hql query from dynamic string buffer
				Query q = session.createQuery(strBuff.toString());								
				
				//for each member place holder, replace with actual value
				for (String memberKey : memberKeyMap.keySet()) {
	
					q.setString(memberKey, memberKeyMap.get(memberKey));
					
				}				
				
				//perform query
				List<CellNote> cellNotesByDimensionMembers = q.list();
				
				if ( cellNotesByDimensionMembers != null ) {
					
					cell_note_loop:					
					for (CellNote cellNote : cellNotesByDimensionMembers ) {
						
						for (CellNoteMapping cellNoteMapping : cellNote.getCellNoteMappingSet() ) {
							
							//continue to next cell note if dimension is disabled 
							if ( ! cellNoteMapping.getDimension().isEnabled() ) {
								continue cell_note_loop;
							}
							
							String cellNoteMappingDimension = cellNoteMapping.getDimension().getName();
							
							//if dimension is not in uow dim member map, continue
							if ( ! dimensionMemberMapSet.containsKey(cellNoteMappingDimension)) {
								continue cell_note_loop;
							}
							
							String cellNoteMappingMember = cellNoteMapping.getMemberName();
							
							//continue to next cell note if member is not in member map
							if ( ! dimensionMemberMapSet.get(cellNoteMappingDimension).contains(cellNoteMappingMember) ) {
								continue cell_note_loop;
							}
							
						}
						
						//if null, create new
						if ( cellNoteList == null ) {
							cellNoteList = new ArrayList<CellNote>();
						}
						
						//add matched cell note to list
						cellNoteList.add(cellNote);
						
					}
					
				}
				
			} catch (RuntimeException ex) {
	
				//log exception
				PafErrHandler.handleException(ex, PafErrSeverity.Error);
	
			} finally {
							
				//try to Close session if not single session
				tryToCloseSession(session);

				//if session is not null and session is still open (single session = true)
				if ( session != null && session.isOpen() ) {
					
					session.flush();
					
				}	
				
			}
		}
		
		logger.debug("DEBUG - End getCellNotesByDimension(String, String, String, Map<String, Set<String>>) - " + new Date());
		
		//if null or 0, return null
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			
			return null;
			
		}
						
		return cellNoteList.toArray(new CellNote[0]);

	}
	
	public synchronized void processCellNotes(CellNote[] cellNotesToSave, CellNote[] cellNotesToDelete) throws PafException {
		
		logger.info("DEBUG - Start processCellNotes(CellNote[], CellNote[]) - " + new Date());
		
		Session session = null;
		
		Transaction tx = null;

		try {
			
			session = getSession();
			
			tx = session.beginTransaction();
			
			if ( cellNotesToSave != null && cellNotesToSave.length > 0 ) {
						
				saveCellNotes(session, tx, cellNotesToSave);
												
			}
			
			int deletedCellNoteCnt = 0;
			
			if ( cellNotesToDelete != null && cellNotesToDelete.length > 0 ) {
				
				deletedCellNoteCnt = deleteCellNotes(session, tx, cellNotesToDelete);
				
			}
			
			tx.commit();
			
			if ( cellNotesToSave != null ) {
				logger.info("Successfully saved " + cellNotesToSave.length + " cell notes.");
			}
									
			if ( cellNotesToDelete != null ) {
				
				logger.info("Successfully deleted " + deletedCellNoteCnt + " cell notes.");
				
			}
				
			
		} catch (RuntimeException ex) {

			try {
				
				if ( tx != null ) {
					
					//rollback if runtime exception occurred					
					tx.rollback();
					
					logger.info("Problem adding/updating/deleting cell notes. All actions have been rolled back.");
					
				}
				
			} catch (RuntimeException rbEx) {
				
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);
				
			}
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
			throw new PafException("Error saving notes.", ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}	
			
		}

		
		
		logger.info("DEBUG - End processCellNotes(CellNote[], CellNote[]) - " + new Date());
		
		
	}

	/**
	 * 
	 * @param session
	 * @param cellNotesToDelete
	 * @param commitChanges
	 */
	private int deleteCellNotes(Session session, Transaction tx, CellNote[] cellNotesToDelete) {
		
		logger.debug("DEBUG - Start deleteCellNotes(Session, Transaction, CellNote[]) - " + new Date());
	
		int deletedCellNoteCnt = 0;
		
		if ( session != null && tx != null && cellNotesToDelete != null ) {
								
			//for each cell note, delete
			for (CellNote cellNote : cellNotesToDelete ) {
				
				//cell not has already been tied to db
				if ( cellNote.getId() >= 0 ) {
					
					//try to get cellnote from session
					cellNote = (CellNote) session.get(CellNote.class, cellNote.getId());
					
					//if cell note is not null, delete
					if ( cellNote != null ) {
						
						session.delete(cellNote);
											
						cellNote.setCellNoteMappingSet(new HashSet<CellNoteMapping>(cellNote.getCellNoteMappingSet()));
						
						deletedCellNoteCnt++;
						
					}
					
				}
			}
			
		}				
		
		logger.debug("DEBUG - End deleteCellNotes(Session, Transaction, CellNote[]) - " + new Date());
		
		return deletedCellNoteCnt;
	}

	private void saveCellNotes(Session session, Transaction tx, CellNote[] cellNotesToSave) throws PafException {


		if ( session != null && tx != null && cellNotesToSave != null ) {
			
			//key = <app name>|<data source name>, value = list of cell notes matching that criteria
			Map<String, List<CellNote>> applicationDataSourceCellNoteMap = createApplicationDataSourceCellNoteMap(cellNotesToSave);
			
			//get application, datasource and dimension map
			Map<String, Application> applicationMap = getApplicationMap(session);
	
			Map<String, DataSource> dataSourceMap = getDataSourceMap(session);
			
			Map<String, Dimension> dimensionMap = getDimensionMap(session);
	
			session.flush();
			
			List<PafApplicationDef> pafApps = PafMetaData.getPaceProject().getApplicationDefinitions();
				
			int cellNoteCnt = 0;	
			
			if ( pafApps != null && pafApps.size() > 0 ) {
			
				//get current paf application definition
				PafApplicationDef pafApp = pafApps.get(0);
				
				String loadedAppId = pafApp.getAppId();
				
				String loadedDataSourceId = pafApp.getMdbDef().getDataSourceId();
																				
				for (String applicaitonDataSourceKey : applicationDataSourceCellNoteMap.keySet()) {
				
					String yearDimensionName = null;
					
					//if match is found in app/ds map, get current year [ used for filtering ]
					if ( applicaitonDataSourceKey.equals(loadedAppId + '|' + loadedDataSourceId) ) {
						
						yearDimensionName = pafApp.getMdbDef().getYearDim();
						
					}
					
					List<CellNote> cellNotesList = applicationDataSourceCellNoteMap.get(applicaitonDataSourceKey);
					
					//key = dimension name, value = set of dimension member names
					Map<String, Set<String>> cellNoteDimensionMemberMap = createDimensionMemberMap(cellNotesList.toArray(new CellNote[0]));
					
					CellNote[] duplicateCellNotes = getCellNotes(cellNotesToSave[0].getApplication().getName(), cellNotesToSave[0].getDataSource().getName(), 
							cellNoteDimensionMemberMap, session);
					
					Map<String, Integer> duplicateCellNoteMap = new HashMap<String, Integer>();
					
					//if not null, populate duplicate cell note map
					if ( duplicateCellNotes != null ) {
						
						for ( CellNote duplicateCellNote : duplicateCellNotes ) {
							
							logger.debug("Found duplicate cell note: " + duplicateCellNote.getKey());
							duplicateCellNoteMap.put(duplicateCellNote.getKey(), duplicateCellNote.getId());
							
						}
						
					}
					
					
					//for each cell note to save
					for (CellNote cellNote : cellNotesToSave ) {
															
						//if duplicate cell note map has cell note key, get duplicate cell note can compare with current cell note
						if ( duplicateCellNoteMap.containsKey(cellNote.getKey())) {
							
							logger.debug("Duplicate cell note found: " + cellNote.getKey());
							
							Integer id = duplicateCellNoteMap.get(cellNote.getKey());
							
							//get dup from map
							CellNote duplicateCellNote = (CellNote) session.get(CellNote.class, id);
							
							//if cell note not equal to duplicate
							if ( duplicateCellNote != null && cellNote.equals(duplicateCellNote)) {
							
								logger.debug("Update duplicate cell note with key: " + cellNote.getKey());
								
								//save updated cell note text							
								String updatedCellNoteText = cellNote.getText();
								
								String creator = cellNote.getCreator();
								
								//set the current cell not to the dup
								cellNote = duplicateCellNote;
								
								//set text
								cellNote.setText(updatedCellNoteText);
								
								cellNote.setCreator(creator);
								
							}
							
						//if not duplicate cell note
						} else {
						
							//not dup, but id exists 
							if ( cellNote.getId() != -1 ) {
								
								//try to get cell not from session
								CellNote loadedCellNote = (CellNote) session.get(CellNote.class, cellNote.getId());
								
								//if null, means cell note was already deleted.  Recreate cell not without ID's
								if ( loadedCellNote == null ) {
	
									//create simple cell not to clear references
									SimpleCellNote scn = cellNote.getSimpleCellNote();
									
									//set simpleCellNote to -1
									scn.setId(-1);
									
									//recreate cell note
									cellNote = new CellNote(scn);
									
								//else if address in memory are not the same
								} else if ( loadedCellNote.equals(cellNote) ) {
									
									loadedCellNote.setCreator(cellNote.getCreator());
									loadedCellNote.setText(cellNote.getText());
									
									cellNote = loadedCellNote;
									
								}
																	
							}
							
						}
						
						
						//get app id from cell note
						String appId = cellNote.getApplication().getName();
	
	//					if in application map, use, othewise add to map as new.
						if ( appId != null && applicationMap.containsKey(appId)) {
							
							cellNote.setApplication(applicationMap.get(appId));
							
						} else {
							
							applicationMap.put(appId, cellNote.getApplication());
							
						}
	
						//get data source id from cell note
						String dataSourceId = cellNote.getDataSource().getName();
						
						//if in data source map, use, othewise add to map as new.
						if ( dataSourceId != null && dataSourceMap.containsKey(dataSourceId)) {
							
							cellNote.setDataSource(dataSourceMap.get(dataSourceId));
							
						} else {
							
							dataSourceMap.put(dataSourceId, cellNote.getDataSource());
							
						}
												
						//if cell note mapping set is not null
						if ( cellNote.getCellNoteMappingSet() != null ) {
													
							//loop over mappings
							for ( CellNoteMapping cellNoteMapping : cellNote.getCellNoteMappingSet() ) {
								
								//get dimension name
								String dimensionName = cellNoteMapping.getDimension().getName();
							
								logger.debug("Configuring dimension: " + dimensionName);
								
								//if dimension map contains entry, use map value otherwise use cell note dimension
								if ( dimensionName != null && dimensionMap.containsKey(dimensionName)) {
									
									cellNoteMapping.setDimension(dimensionMap.get(dimensionName));
									
								} else {
									
									dimensionMap.put(dimensionName, cellNoteMapping.getDimension());
									
								}
																
								//set cell note ref again	
								cellNoteMapping.setCellNote(cellNote);
																															
							}
							
						}
						
						//update last updated to now
						cellNote.setLastUpdated(new Date());
						
						//truncate text if too long.
						if ( cellNote.getText().length() > CELL_NOTE_DB_TEXT_LENGTH ) {
							cellNote.setText(cellNote.getText().substring(0, CELL_NOTE_DB_TEXT_LENGTH-1));
						}
						
						logger.debug("About to save cell note: " + cellNote);
													
						//save cell note
						session.saveOrUpdate(cellNote);
						//session.save(cellNote);
												
						if ( ++cellNoteCnt % 150 == 0 ) {
							
							session.flush();
							session.clear();
							
	//							get applicaiton, datasource and dimension map
							applicationMap = getApplicationMap(session);
				
							dataSourceMap = getDataSourceMap(session);
							
							dimensionMap = getDimensionMap(session);
							
						}
						
					}
				}
				
				
			}	
				
		}
		
	}

	/**
	 * 
	 * Save cell notes to the database.  Adds if new, Updates if already exist.
	 * 
	 * @param cellNotes Cell notes to save.  
	 */
	public synchronized void saveCellNotes(CellNote[] cellNotes) throws PafException {
				
		logger.debug("DEBUG - Start saveCellNotes(CellNote[]) - " + new Date());
		
		Session session = null;
		
		Transaction tx = null;

		try {
			
			if ( cellNotes != null && cellNotes.length > 0 ) {
												
				session = getSession();
				
				tx = session.beginTransaction();
				
				saveCellNotes(session, tx, cellNotes);
				
				tx.commit();
				
				logger.info("Successfully saved " + cellNotes.length + " cell notes.");
			}
			
		} catch (RuntimeException ex) {

			try {
				
				if ( tx != null ) {
					
					//rollback if runtime exception occurred					
					tx.rollback();
					
				}
				
			} catch (RuntimeException rbEx) {
				
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);
				
			}
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
			throw new PafException("Error saving notes.", ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}	
			
		}
		
		logger.debug("DEBUG - End saveCellNotes(CellNote[]) - " + new Date());
		
	}
	

	/**
	 * 
	 * Creates a map keyed off of <app name>|<data source name> and value of a list of cell notes per that
	 * unique combination
	 *
	 * @param cellNotes cell notes used when making map
	 * @return Map
	 */
	private Map<String, List<CellNote>> createApplicationDataSourceCellNoteMap(CellNote[] cellNotes) {

		logger.debug("DEBUG - Start createApplicationDataSourceCellNoteMap(CellNote[]) - " + new Date());
		
		Map<String, List<CellNote>> applicationDataSourceCellNoteMap = new HashMap<String, List<CellNote>>();
		
		String appDsKey = null;
		
		/* Populate map keyed off of app and data source names.  the value will be a list of cell notes
		 * that belong to the application/data source combination
		 */
		for (CellNote cellNote : cellNotes ) {
			
			//create key using cell note app and data source name vlaues
			appDsKey = cellNote.getApplication().getName() + '|' + cellNote.getDataSource().getName();
						
			List<CellNote> appDsCellNoteList = null;
			
			//if map already contains key, get list of of map
			if ( applicationDataSourceCellNoteMap.containsKey(appDsKey)) {
				
				appDsCellNoteList = applicationDataSourceCellNoteMap.get(appDsKey);
										
			}
			
			//if list is null, create new list
			if ( appDsCellNoteList == null ) {
				
				appDsCellNoteList = new ArrayList<CellNote>();
				
			}
			
			//add cell note to list
			appDsCellNoteList.add(cellNote);
			
			//push list back into map
			applicationDataSourceCellNoteMap.put(appDsKey, appDsCellNoteList);
			
		}
		
		logger.debug("DEBUG - End createApplicationDataSourceCellNoteMap(CellNote[]) - " + new Date());
		
		//return populated map
		return applicationDataSourceCellNoteMap;
		
	}

	/**
	 * 
	 * Creates a map keyed off of dimension name and a set of member names as the value
	 *
	 * @param cellNotes Cell notes to use to populate dimension Member map
	 * @return Map of dimensions and value of member names.
	 */
	private Map<String, Set<String>> createDimensionMemberMap(CellNote[] cellNotes) {
	
		logger.debug("DEBUG - Start createDimensionMemberMap(CellNote[]) - " + new Date());
		
		Map<String, Set<String>> dimensionMemberMap = new HashMap<String, Set<String>>();
		
		if ( cellNotes != null ) {
			
			for (CellNote cellNote : cellNotes ) {
			
				//loop cell note mappings
				for ( CellNoteMapping cellNoteMapping : cellNote.getCellNoteMappingSet() ) {
					
					//get dimenesion name
					String dimensionName = cellNoteMapping.getDimension().getName();
					
					Set<String> memberSet = null;
					
					//if dimension member map contains dimension, try to get member set
					if ( dimensionMemberMap.containsKey(dimensionName) ) {
						
						memberSet = dimensionMemberMap.get(dimensionName);
						
					}
					
					//if member set is null, create empty set
					if ( memberSet == null ) {
						
						memberSet = new HashSet<String>();
					}
					
					//add member name to set
					memberSet.add(cellNoteMapping.getMemberName());
					
					// add/replace dimension member set with current member set
					dimensionMemberMap.put(dimensionName, memberSet);
					
				}				
				
			}		
			
		}
		
		logger.debug("DEBUG - Start createDimensionMemberMap(CellNote[]) - " + new Date());
		
		return dimensionMemberMap;
	
	}

	/**
	 * 
	 * Deletes all cell notes and cell note related tables
	 * @throws PafException 
	 * 
	 */
	public void deleteCellNotes() throws PafException {

		logger.debug("DEBUG - Start deleteCellNotes() - " + new Date());
		
		logger.info("Clearing cell notes for all applications and all data sources.");		

		Session session = null;
		
		Transaction tx = null;
		
		try {
			
			session = getSession();
			
			tx = session.beginTransaction();
		
			int recordsUpdated = session.createQuery("delete CellNoteMapping").executeUpdate();
			logger.info("Cleared " + recordsUpdated + " CellNoteMapping records.");

			recordsUpdated = session.createQuery("delete CellNote").executeUpdate();
			logger.info("Cleared " + recordsUpdated + " CellNote records.");
			
			recordsUpdated = session.createQuery("delete DataSource").executeUpdate();
			logger.info("Cleared " + recordsUpdated + " DataSource records.");
			
		/*	
		 *  The following tables are also referenced by member tags, so
		 *  they will no longer be deleted when cell notes are deleted. {AF}
		 *  		
			recordsUpdated = getSession().createQuery("delete Application").executeUpdate();
			logger.info("Cleared " + recordsUpdated + " Application records.");
			
			recordsUpdated = getSession().createQuery("delete Dimension").executeUpdate();
			logger.info("Cleared " + recordsUpdated + " Dimension records.");
		 */
			
			tx.commit();
			
		} catch (RuntimeException ex) {

			try {
				
				if ( tx != null ) {
					//rollback if runtime exception occurred
					tx.rollback();
				}
				
			} catch (RuntimeException rbEx) {
				
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);
				
			}
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
//			try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}	
			
		}
		
		logger.debug("DEBUG - End deleteCellNotes() - " + new Date());

	}

	/**
	 * 
	 * Deletes the array of cell notes.
	 *  
	 * @param cellNotes
	 */
	public void deleteCellNotes(CellNote[] cellNotes) throws PafException {

		logger.debug("DEBUG - Start deleteCellNotes(CellNote[]) - " + new Date());
		
		Session session = null;
		
		Transaction tx = null;

		try {
	
			if ( cellNotes != null ) {

				session = getSession();
				
				tx = session.beginTransaction();
				
				deleteCellNotes(session, tx, cellNotes);
				
				tx.commit();
				
				logger.info("Successfully deleted " + cellNotes.length + " cell notes.");
				
			}
									
		} catch (RuntimeException ex) {

			try {
				
				if ( tx != null ) {
					//rollback if runtime exception occurred
					tx.rollback();
				}
				
			} catch (RuntimeException rbEx) {
				
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);
				
			}
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
			
			throw new PafException("Error deleting notes.", ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}	
			
		}
		
		logger.debug("DEBUG - End deleteCellNotes(CellNote[]) - " + new Date());
		
	}


	/**
	 * 
	 * Sets the current cell note dimensions.  1st, disables all cell
	 * note dimensions.  2nd, loops through dimension names and either
	 * reenables dimension or adds as new and enables.
	 * 
	 * @param dimensionNames array of dimensions (base + cached attributes) to be enabled
	 * @throws PafException 
	 */
	public void setCurrentDimensions(String[] dimensionNames) throws PafException {
		
		logger.debug("DEBUG - Start setCurrentDimensions(String[]) - " + new Date());
		
		Session session = null;
		
		Transaction tx = null;
		
		try {
			
			session = getSession();
			
			tx = session.beginTransaction();
			
			//get dimension map
			Map<String, Dimension> dimensionMap = getDimensionMap(session);
			
			//disable all dimensions
			for ( Dimension dimension : dimensionMap.values() ) {
				
				dimension.setEnabled(false);
				
				session.saveOrUpdate(dimension);
				
			}
			
			//if dimension names exists and more than one exist
			if ( dimensionNames != null && dimensionNames.length > 0 ) {
												
				//loop dims
				for (String dimensionName : dimensionNames ) {
					
					//if dim is in map, enable dimension
					if ( dimensionMap.containsKey(dimensionName) ) {
						
						Dimension dimension = dimensionMap.get(dimensionName);
						
						if ( dimension != null ) {
							
							dimension.setEnabled(true);
							
						}
					
					//if dim is not in map, create new, enabled and add to map
					} else {
						
						Dimension dimension = new Dimension(dimensionName, true);
						
						dimensionMap.put(dimension.getName(), dimension);
					}
					
					
				}
				
				//for each dimension, save
				for ( Dimension dimension : dimensionMap.values() ) {
					
					session.saveOrUpdate(dimension);
					
				}
			

			}
			
			//commit work
			tx.commit();

		} catch (RuntimeException ex) {

			try {
				
				if ( tx != null ) {
					//rollback if runtime exception occurred
					tx.rollback();
				}
				
			} catch (RuntimeException rbEx) {
				
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);
				
			}
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}	
			
			
		}
		
		logger.debug("DEBUG - End setCurrentDimensions(String[]) - " + new Date());
		
	}

	/**
	 * 
	 *  Gets all cell notes in the database.
	 *
	 * @return All Cell Notes in the database.
	 * @throws PafException 
	 */
	public CellNote[] getCellNotes() throws PafException {
		
		logger.debug("DEBUG - Start getCellNotes() - " + new Date());
		
		List<CellNote> cellNoteList = null;
					
		Session session = null;
		
		try {
		
			session = getSession();
			
			//get trimed down list of cell notes based on application and data source
			cellNoteList = session.createQuery("from CellNote").list();
			
		} catch (RuntimeException ex) {
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}				
			
		}
		
		logger.debug("DEBUG - End getCellNotes() - " + new Date());
		
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			return null;			
		}
		
		return cellNoteList.toArray(new CellNote[0]);

	}

	/**
	 * 
	 *  Gets the cell notes for a given application id and data source id
	 *
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @return	Cell notes array for appId and dataSourceId
	 * @throws PafException 
	 */
	public CellNote[] getCellNotes(String applicationId, String dataSourceId) throws PafException {
	
		return getCellNotesWithSession(applicationId, dataSourceId, null);
			
	}
	
	/**
	 * 
	 *  Gets the cell notes for a given application id and data source id
	 *
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @param overrideSession overrides the default session
	 * 
	 * @return	Cell notes array for appId and dataSourceId
	 * @throws PafException 
	 */
	public CellNote[] getCellNotesWithSession(String applicationId, String dataSourceId, Session overrideSession) throws PafException {
		
		logger.debug("DEBUG - Start getCellNotes(String, String) - " + new Date());
		
		List<CellNote> cellNoteList = null;
				
		Session session = null;
		
		try {
		
			if ( overrideSession != null ) {
				
				session = overrideSession;
				
			} else {
				
				session = getSession();	
				
			}			
			
			//get trimed down list of cell notes based on application and data source
			cellNoteList = (List<CellNote>) session.createCriteria(CellNote.class)
				.createAlias("application", "a").createAlias("dataSource", "d")
				.add(Restrictions.eq("a.name", applicationId))
				.add(Restrictions.eq("d.name", dataSourceId)).list();
			
		} catch (RuntimeException ex) {
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
			if ( overrideSession == null ) {
				
				//try to Close session if not single session
				tryToCloseSession(session);
			
			}

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}				
			
		} 
		
		logger.debug("DEBUG - End getCellNotes(String, String) - " + new Date());
		
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			return null;			
		}
		
		return cellNoteList.toArray(new CellNote[0]);

	}

	/**
	 * 
	 *  Deletes cell notes for a given application id and data source id. 
	 *  Doesn't delete cell note related tables, just cell notes and 
	 *  cell note mappings.
	 *
	 * @param applicationId Application Id
	 * @param dataSourceId	Data Source Id
	 * @throws PafException 
	 */
	public void deleteCellNotes(String applicationId, String dataSourceId) throws PafException {
		
		logger.debug("DEBUG - Start deleteCellNotes(String, String) - " + new Date());

		logger.info("Clearing cell notes for application: " + applicationId + " and data source: " + dataSourceId + ".");
		
		Session session = null;
		
		Transaction tx = null;
		
		try {

			session = getSession();
			
			tx = session.beginTransaction();
			
			//get cell note for app and data source
			CellNote[] cellNotesAr = getCellNotesWithSession(applicationId, dataSourceId, session);
						
			if ( cellNotesAr != null ) {
												
				//loop through cell notes and delete
				for (CellNote cellNote : cellNotesAr ) {
					
					logger.debug("Deleting cell note: " + cellNote);
					
					try {
							
						session.delete(cellNote);
																								
					} catch (RuntimeException re ) {
												
						PafErrHandler.handleException(re, PafErrSeverity.Error);
						
					}
										
				}
				
				//commit changes
				tx.commit();
				
			}
						
		} catch (RuntimeException ex) {
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);

			//if session is not null and session is still open (single session = true)
			if ( session != null && session.isOpen() ) {
				
				session.flush();
				
			}				
			
		} 

	
		logger.debug("DEBUG - End deleteCellNotes(String, String) - " + new Date());
		
	}

	/**
	 * 
	 * Creates an array of Cell Note Information objects.  This METHOD queries the
	 * cache db and will return the number of cell note records per application and data source.
	 *
	 * @return array of CellNotesInformation 
	 * @throws PafException 
	 */
	public CellNotesInformation[] getCellNotesInformation() throws PafException {
						
		logger.debug("DEBUG - Start getCellNotesInformation() - " + new Date());
		
		List<CellNotesInformation> cellNotesInfromationList = null;
		
		Session session = null;
		
		try {
			
			session = getSession();
		
			//create buffer
			StringBuffer strBuff = new StringBuffer("select new com.pace.base.db.cellnotes.CellNotesInformation ( cellNote.application.name, cellNote.dataSource.name, count(cellNote) ) ");
			strBuff.append("from CellNote cellNote group by cellNote.application.name, cellNote.dataSource.name");
			
			logger.debug(strBuff.toString());
			
			//run query
			cellNotesInfromationList = session.createQuery(strBuff.toString()).list();
		
		} catch (RuntimeException ex) {
			
			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} finally {
			
			//try to Close session if not single session
			tryToCloseSession(session);
		
		} 
		
		logger.debug("DEBUG - End getCellNotesInformation() - " + new Date());
		
		//send back null if null or if list is 0 in size
		if ( cellNotesInfromationList == null || cellNotesInfromationList.size() == 0 ) {
			
			return null;
			
		}
		
		return cellNotesInfromationList.toArray(new CellNotesInformation[0]);
		
	}
	
	/**
	 * 
	 *  Converts simple cell notes into cell notes and then saves.
	 *
	 * @param simpleCellNotes	Notes to save
	 * @throws PafException
	 */
	public synchronized void saveCellNotes(SimpleCellNote[] simpleCellNotes) throws PafException {
		
		logger.debug("DEBUG - Start saveCellNotes(SimpleCellNote[]) - " + new Date());
		
		if ( simpleCellNotes != null ) {
		
			List<CellNote> cellNotes = new ArrayList<CellNote>();
			
			//loop through simple cell notes, create cell note(simple cell note), 
			//init id's, then add to list
			for (SimpleCellNote simpleCellNote : simpleCellNotes) {
				
				//clear out simple cell note id
				simpleCellNote.setId(-1);
				
				CellNote cellNote = new CellNote(simpleCellNote);
				
				cellNote.getApplication().setId(-1);
				cellNote.getDataSource().setId(-1);
				
				cellNotes.add(cellNote);
				
			}
			
			//save cell notes
			saveCellNotes(cellNotes.toArray(new CellNote[0]));			
			
			
		}		
		
		logger.debug("DEBUG - End saveCellNotes(SimpleCellNote[]) - " + new Date());
		
	}

/*	public static boolean isSingleSession() {
		return singleSession;
	}

	public static void setSingleSession(boolean singleSession) {
		PafCellNoteManager.singleSession = singleSession;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		PafCellNoteManager.sessionFactory = sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		
		if ( sessionFactory == null ) {
			
			sessionFactory = HibernateUtil.getSessionFactory(SessionFactoryType.PafClientCacheDB);
			
		}
		
		return sessionFactory;
	}
	
*/	
	/*
	public CellNote[] getCellNotes(String applicationId, String dataSourceId, Map<String, Set<String>> dimensionMemberMapSet) {

		logger.debug("DEBUG - Start getCellNotes(String, String, Map<String, Set<String>>) - " + new Date());
		
		//holds list of cell notes to be returned
		List<CellNote> cellNoteList = null;
		
		StringBuffer strBuff = new StringBuffer(1000);
		
		strBuff.append("select * from cell_notes where id in ( ");
		
		Set<String> dimensionNameSet = dimensionMemberMapSet.keySet();
		
		int dimensionCnt = 0;
		
		for (String dimensionName : dimensionNameSet ) {
			
			strBuff.append("select cn.id from  cell_notes cn, cell_note_mappings cnm, DIMENSIONS d, applications a, datasources ds ");
			strBuff.append("where cn.ID=cnm.cell_note_id and cnm.dimension_id=d.ID and cn.application_id = a.id and cn.data_source_id = ds.id ");
			strBuff.append("and d.name = '" + dimensionName + "' ");
			
			Set<String> dimensionMemberSet = dimensionMemberMapSet.get(dimensionName);
			
			if ( dimensionMemberSet != null ) {
				
				strBuff.append("and cnm.member_name in ( ");
				
				int memberCnt = 0;
				
				for (String memberName : dimensionMemberSet ) {
					
					strBuff.append("'" + memberName + "'");
					
					if ( ++memberCnt != dimensionMemberSet.size()) {
						strBuff.append(", ");
					}
					
				}
				strBuff.append(" ) ");
			}
			strBuff.append("and a.name = '"+ applicationId +"' ");
			strBuff.append("and ds.name = '" + dataSourceId + "' ");
			strBuff.append("and d.enabled = 'T' ");
			
			if ( ++dimensionCnt != dimensionNameSet.size()) {
				strBuff.append(" intersect ");
			}
			
			
		}
		strBuff.append(" )");
				
		logger.info(strBuff.toString());
		
		cellNoteList = getSession().createSQLQuery(strBuff.toString()).addEntity(CellNote.class).list();
			
		getSession().flush();
	
		logger.debug("DEBUG - End getCellNotes(String, String, Map<String, Set<String>>) - " + new Date());
		
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			
			return null;
			
		}		
		
		return cellNoteList.toArray(new CellNote[0]);
	}
	*/
	
	/*
	public CellNote[] getCellNotes(String applicationId, String dataSourceId, Map<String, Set<String>> dimensionMemberMapSet) {

		//holds list of cell notes to be returned
		List<CellNote> cellNoteList = null;
			
		try {
			
					
			//build hql
			StringBuffer strBuff = new StringBuffer("select c from CellNote c, CellNoteMapping m, Dimension d ");
			
			strBuff.append("where c.id = m.cellNote and m.dimension = d.id ");
					
			Map<String, String> memberKeyMap = new LinkedHashMap<String, String>();
			
			//key = dim key, value u= modified dim key
			Map<String, String> dimKeyModifiedMap = new LinkedHashMap<String, String>();
			
			Set<String> applicationKeySet = new HashSet<String>();
			Set<String> dataSourceKeySet = new HashSet<String>();
			
			int dimensionCount = 0;
			
			//loop over dimensions
			for (String dimKey : dimensionMemberMapSet.keySet()	) {
			
				String modifiedDimKey = dimKey;
				
				//replace . with _, this will ensure hibernate doesn't break.  can't have . in parm name.
				modifiedDimKey = generateKey(modifiedDimKey);
				
				//push modified key to map
				dimKeyModifiedMap.put(dimKey, modifiedDimKey);
				
				//get unique set of dimension members
				Set<String> memberSet = dimensionMemberMapSet.get(dimKey);
				
				strBuff.append(" and c.id in (select c.id from CellNote c, CellNoteMapping m, Dimension d ");
				
				strBuff.append("where c.id = m.cellNote and m.dimension = d.id and d.name = :"+ modifiedDimKey + " and m.memberName in ( ");
				
				int memberCnt = 0;
				
				//loop thorugh member set and build hql place holders, we'll replace with data values later
				for (String member : memberSet ) {
									
					//create tmp member key
					// cleanup - and space characters w _

				
					String memberKey = modifiedDimKey+"_"+member;
					memberKey = generateKey(memberKey);					
					
					//add member key to hql
					strBuff.append(":" + memberKey);
							
					//put into map
					memberKeyMap.put(memberKey, member);
				
					//add , if not last one
					if ( ++memberCnt != memberSet.size() ) {
						
						strBuff.append(", ");
						
					}
				}
			
				strBuff.append(" ) and d.enabled = 'T'");
				
				
				String applicationKey = generateKey(applicationId) + dimensionCount;
								
				strBuff.append(" and c.application.name = :" + applicationKey);
				
				applicationKeySet.add(applicationKey);
				
				String dataSourceKey = generateKey(dataSourceId) + dimensionCount++;
				
				strBuff.append(" and c.dataSource.name = :" + dataSourceKey);
				
				dataSourceKeySet.add(dataSourceKey);
				
				
				strBuff.append(" )");
			}		
			
			strBuff.append(" group by c.id, c.application, c.dataSource, c.creator, c.lastUpdated, c.text, c.visible");
			
			//strBuff.append(" and c.application.name = '" + applicationId + "'");
			
			//strBuff.append(" and c.dataSource.name = '" + dataSourceId + "'");
			
			logger.error(strBuff.toString());
			
			//create hql query from dynamic string buffer
			Query q = getSession().createQuery(strBuff.toString());
			
			//for each modified dimension, replace dim place holder
			for (String modifiedDimKey : dimKeyModifiedMap.values()	) {
												
				q.setString(modifiedDimKey, modifiedDimKey);
				
			}
			
			//for each member place holder, replace with actual value
			for (String memberKey : memberKeyMap.keySet()) {

				q.setString(memberKey, memberKeyMap.get(memberKey));
				
			}				

			for (String applicationKey : applicationKeySet) {
				
				q.setString(applicationKey, applicationId);
				
			}
			
			for (String dataSourceKey : dataSourceKeySet ) {
				
				q.setString(dataSourceKey, dataSourceId);
				
			}
			
			//perform query
			cellNoteList = q.list();
			
		} catch (RuntimeException ex) {

			//log exception
			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		} 
		
		if ( cellNoteList == null || cellNoteList.size() == 0 ) {
			
			return null;
			
		}
		
		return cellNoteList.toArray(new CellNote[0]);

	}
	*/
}
