/*
 *	File: @(#)PafMemberTagManager.java 		Package: com.pace.base.server 	Project: PafServer
 *	Created: Dec 26, 2007  					By: afarkas
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
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.comm.SimpleCoordList;
import com.pace.base.data.Intersection;
import com.pace.base.db.Application;
import com.pace.base.db.Dimension;
import com.pace.base.db.membertags.*;
import com.pace.base.utility.StringUtils;
import com.pace.server.comm.PafGetMemberTagInfoResponse;
import com.pace.server.comm.PafMbrTagFilter;

/**
 * Supports all Service Provider Member Tag requests including the persisting, updating, and retrieval 
 * of Member Tag data.
 *
 * @version	1.00
 * @author AFarkas
 *
 */
public class PafMemberTagManager extends PafClientDbManager {

	// logger
	private static final Logger logger = Logger.getLogger(PafMemberTagManager.class);

	// reference to itself
	private static PafMemberTagManager _instance;

	// other services
	private PafAppService pafAppService = PafAppService.getInstance();

	// constants
	private static final int TRANSACTION_LIMIT = 150;
	private static final int MEMBER_TAG_DB_VALUE_MAX_LENGTH = 1024;

	/**
	 * Default constructor is set to private to prevent external methods from directly
	 * instantiating this class. 
	 * 
	 */
	private PafMemberTagManager() {}

	/**
	 *	Singleton method.  If session is null, creates new one. If instance is null, creates
	 *  a new one.
	 *
	 * @return PafMemberTagManager
	 * @throws PafException 
	 */
	public static PafMemberTagManager getInstance() throws PafException {

		if (_instance == null) {
			_instance = new PafMemberTagManager();
		}

		// Return instance
		return _instance;
	}

	/**
	 *	Singleton method
	 * 
	 * @param session used to override the default session behavior. Used in unit testing. 
	 *
	 * @return PafMemberTagManager
	 * @throws PafException 
	 */
	public static PafMemberTagManager getInstance(Session session) throws PafException {

		setSession(session);

		// Return instance
		return PafMemberTagManager.getInstance();
	}


	/**
	 *	Clear all member tag database entries for the specified application 
	 *  ids and/or member tag names
	 *
	 * @param memberTagFilters An array of member tag filters 
	 * @throws PafException 
	 */
	public synchronized void clearMemberTagData(PafMbrTagFilter[] memberTagFilters) throws PafException {

		logger.debug("DEBUG - Start clearMemberTagData() - " + new Date());

		PafMbrTagFilter[] filters;
		List<MemberTagId> memberTagIdDeleteList = new ArrayList<MemberTagId>();
		Session session = null;
		Transaction tx = null;


		try {
			
			session = getSession();

			// Get the list of applications to query
			if (memberTagFilters == null || memberTagFilters.length == 0) {	
				// No supplied filter - create filter using all apps in db
				List<String> appList = getAppNames(session);
				filters = new PafMbrTagFilter[appList.size()];
				for (int i = 0; i < appList.size(); i++) {
					filters[i] = new PafMbrTagFilter(appList.get(i));
				}
			} else {
				filters = memberTagFilters;
			}	

			// Retrieve all the member tag id objects that will be deleted based
			// on the supplied member tag filter
			for (PafMbrTagFilter filter:filters) {
				String appName = filter.getAppName();
				String[] memberTagNames = filter.getMemberTagNames();
				if (memberTagNames.length == 0) {
					List<MemberTagId> memberTagIds = getMemberTagIds(appName, session);
					memberTagIdDeleteList.addAll(memberTagIds);
				} else {
					for (String memberTagName:memberTagNames) {
						MemberTagId memberTagId = getMemberTagId(appName, memberTagName, session);
						if (memberTagId != null) {
							memberTagIdDeleteList.add(memberTagId);					
						} else {
							// Data not found - issue warning message
							String errMsg = "Unable to delete member tag: [" + memberTagName + "] in application ["
								+ appName + "] - member tag not found";
							logger.warn(errMsg);
						}
					}
				}
			}

	logger.info("About to delete member tag ids: "); 
	String idList = "";
	for (MemberTagId memberTagId : memberTagIdDeleteList) {
		idList = idList + memberTagId.getId() + "-" + memberTagId.getApplication().getName() + ",";
	}
	logger.info(idList);
			// Delete member tag ids
			if (memberTagIdDeleteList.size() > 0) {
				tx = session.beginTransaction();
				for (MemberTagId memberTagId:memberTagIdDeleteList) {
					logger.info("ID: " + memberTagId.getId());
					session.delete(memberTagId);	
				}

				// Commit work
				tx.commit();
				logger.info("All data for " + memberTagIdDeleteList.size() + " member tag(s) was deleted");
			}
			
		} catch (RuntimeException e) {

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
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error clearing member tag data", e, PafErrSeverity.Error);

		} finally {
						
			// Terminate the hibernate session
			terminateSession(session);

		} 		

		logger.debug("DEBUG - End clearMemberTagData() - " + new Date());
	}

	/**
	 *  Delete data for specified member tags
	 *
	 * @param simpleMemberTags Array of simple member tags
	 * @param session 
	 * @throws PafException 
	 */
	public synchronized void deleteMemberTags(SimpleMemberTagData[] simpleMemberTags, Session session) throws PafException {
				
		List<MemberTagData> memberTagDeleteList = new ArrayList<MemberTagData>();


		// Exit if there are no member tags to delete
		if (simpleMemberTags == null) {
			return;
		}

		logger.debug("DEBUG - Start deleteMemberTags(SimpleMemberTagData[], session) - " + new Date());

		// Find member tag data to be deleted
		for (SimpleMemberTagData simpleMemberTag:simpleMemberTags) {
			MemberTagData[] memberTagDataArray = getMemberTagData(simpleMemberTag.getApplicationName(), 
					simpleMemberTag.getMemberTagName(), simpleMemberTag.getSimpleCoordList(), session);
			for (MemberTagData memberTagData:memberTagDataArray) {
				if (memberTagData != null) {
					memberTagDeleteList.add(memberTagData);					
				} else {
					// Data not found - issue warning message
					String errMsg = "Unable to delete data for member tag: [" + simpleMemberTag.getMemberTagName()
					+ "] at coordinates: " + simpleMemberTag.getSimpleCoordList().toString()
					+ " - data not found";
					logger.warn(errMsg);
				}
			}
		}

		// Delete member tag data
		if (memberTagDeleteList.size() > 0) {
			for (MemberTagData memberTagData:memberTagDeleteList) {
				session.delete(memberTagData);				
			}
			logger.info(memberTagDeleteList.size() + " member tag intersection(s) deleted");
		}


		logger.debug("DEBUG - End deleteMemberTags(SimpleMemberTagData[], session) - " + new Date());

	}

	/**
	 *	Return all member tag data for the specified application 
	 *  ids and/or member tag names
	 *  
	 * @param memberTagFilters An array of member tag filters 
	 * @return SimpleMemberTagData[]
	 * @throws PafException 
	 */
	public SimpleMemberTagData[] exportMemberTagData(PafMbrTagFilter[] memberTagFilters) throws PafException {
		
		logger.debug("DEBUG - Start exportMemberTagData() - " + new Date());

		PafMbrTagFilter[] filters;
		List<MemberTagData> memberTagDataList = new ArrayList<MemberTagData>();
		SimpleMemberTagData[] simpleMemberTagData = null;
		Session session = null;


		try {
			
			session = getSession();

			// Get the list of applications to query
			if (memberTagFilters == null || memberTagFilters.length == 0) {	
				// No supplied filter - create filter using all apps in db
				List<String> appList = getAppNames(session);
				filters = new PafMbrTagFilter[appList.size()];
				for (int i = 0; i < appList.size(); i++) {
					filters[i] = new PafMbrTagFilter(appList.get(i));
				}
			} else {
				filters = memberTagFilters;
			}	

			// Retrieve all the member tag data based on the supplied app/member tag filter
			// and convert to simple member tag data
			for (PafMbrTagFilter filter:filters) {
				
				// Get filtered member tag data
				String appName = filter.getAppName();
				String[] memberTagNames = filter.getMemberTagNames();
				if (memberTagNames.length == 0) {
					List<MemberTagData> memberTagData = getMemberTagData(appName, session);
					memberTagDataList.addAll(memberTagData);
				} else {
					for (String memberTagName:memberTagNames) {
						List<MemberTagData> memberTagData = getMemberTagData(appName, memberTagName, session);
						memberTagDataList.addAll(memberTagData);
					}
				}

			}

			// Convert retrieved member tag data to simple member tag data
			simpleMemberTagData = new SimpleMemberTagData[memberTagDataList.size()];
			for (int i = 0; i < memberTagDataList.size(); i++) {
				simpleMemberTagData[i] = memberTagDataList.get(i).getSimpleMemberTagData();
			}
			
		} catch (RuntimeException e) {

			//log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error exporting member tag data", e, PafErrSeverity.Error);

		} finally {
			
			// Terminate the hibernate session
			terminateSession(session);

		} 		

		logger.debug("DEBUG - End exportMemberTagData() - " + new Date());
		
		return simpleMemberTagData;
	}

	/**
	 *	Return the member tag intersection counts for selected application
	 *
	 * @param appName Application name
	 * @param session Hibernate session
	 * 
	 * @return MemberTagInformation
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked")
	private MemberTagInformation getMemberTagCounts(String appName, Session session) throws PafException {

		MemberTagInformation memberTagInfo = null; 
		String query = null;
		int appMemberTagCount = 0;
		List<Object[]> results = null;

		// Create hibernate query to get all the member tag counts for app - parameter(s): appname
		StringBuffer strBuff = new StringBuffer("select coord.memberTagId.memberTagName, count(distinct coord.memberTagData) ");
		strBuff.append("from MemberTagCoord coord where coord.memberTagId.application.name = :appname ");
		strBuff.append("group by coord.memberTagId.memberTagName");
		query = strBuff.toString();

		// Execute hibernate query
		try {
			logger.debug(query + "---- parameter(s): appname = [" + appName + "]");
			results = session.createQuery(query).setParameter("appname", appName).list();
		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error getting member tag counts", e, PafErrSeverity.Error);
		}

		// Inspect each result tuple for member tag name and corresponding count.
		// result[0] - memberTagName, result[1] - memberTagCount
		int memberTagNameCount = results.size();  
		String[] memberTagNames = new String[memberTagNameCount];
		int[] memberTagCounts = new int[memberTagNameCount];
		for (int i = 0; i < memberTagNameCount; i++) {
			Object[] result = results.get(i);
			memberTagNames[i] = (String) result[0];
			memberTagCounts[i] = new Long((Long) result[1]).intValue();
			appMemberTagCount += memberTagCounts[i];
		}

		// Create new member tag information object with these properties
		memberTagInfo = new MemberTagInformation(appName, appMemberTagCount, memberTagNames, memberTagCounts);

		// Return member tag information
		return memberTagInfo;
	}

	/**
	 *	Return the member tag intersection count for selected application and member tag names
	 *
	 * @param appName Application name
	 * @param memberTagNames Member tag names
	 * @param session Hibernate session
	 * 
	 * @return MemberTagInformation
	 * @throws PafException 
	 */
	private MemberTagInformation getMemberTagCounts(String appName, String[] memberTagNames, Session session) throws PafException {

		MemberTagInformation memberTagInfo = null; 
		String query = null;
		int appMemberTagCount = 0, memberTagNameCount = memberTagNames.length;
		int[] memberTagCounts = new int[memberTagNameCount];

		// Create hibernate query to get the member tag counts for app & member tag name - parameter(s): appname, tagname
		StringBuffer strBuff = new StringBuffer("select count(distinct coord.memberTagData) ");
		strBuff.append("from MemberTagCoord coord where coord.memberTagId.application.name = :appname ");
		strBuff.append("and coord.memberTagId.memberTagName = :tagname ");
		query = strBuff.toString();

		// Get individual member tag counts
		for (int i = 0; i < memberTagNameCount; i++) {

			// Execute hibernate query
			Long memberTagCount = 0L;
			try {
				logger.debug(query + "---- parameter(s): appname = [" + appName + "], tagname = [" + memberTagNames[i] + "]");
				memberTagCount = (Long) session.createQuery(query)
													.setParameter("appname", appName)
													.setParameter("tagname", memberTagNames[i])
													.uniqueResult();
			} catch (HibernateException e) {
				// Log exception
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
			memberTagCounts[i] = memberTagCount.intValue();
			appMemberTagCount += memberTagCounts[i];
		}

		// Create new member tag information object with these properties
		memberTagInfo = new MemberTagInformation(appName, appMemberTagCount, memberTagNames, memberTagCounts);

		// Return member tag information
		return memberTagInfo;
	}

	/**
	 *	Return all the member tag data for the specified application name
	 *
	 * @param appName Application name
	 * @param session Hibernate session
	 * 
	 * @return List<MemberTagData>
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked")
	public List<MemberTagData> getMemberTagData(String appName, Session session) throws PafException {

		List<MemberTagData> memberTagData = null; 
		String query = null;

		// Create hibernate query to get the list of member tag data for the specified
		// application name - parameter(s): appname
//		from MemberTagData mtData where mtData.id in (
//				select distinct coord.memberTagData.id
//				from MemberTagCoord coord
//				where coord.memberTagId.application.name = 'TitanCopy'
//				and coord.memberTagId.memberTagName = 'Dept_Desc'
//				)
		StringBuffer strBuff = new StringBuffer("from MemberTagData mtData where mtData.id in (");
		strBuff.append("select distinct coord.memberTagData.id");
		strBuff.append(" from MemberTagCoord coord");
		strBuff.append(" where coord.memberTagId.application.name = :appname ");
		strBuff.append(')');
		query = strBuff.toString();

		// Execute hibernate query
		try {
			logger.debug(query + "---- parameter(s): appname = [" + appName + "]");
			memberTagData = session.createQuery(query)
									.setParameter("appname", appName)
									.list();
		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}

		// Return empty arraylist if no member tag data was found
		if (memberTagData != null) {
			return memberTagData;
		} else {
			return new ArrayList<MemberTagData>();
		}
	}

	/**
	 *	Return the member tag data for the specified app and member tag name
	 *
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param session Hibernate session
	 * 
	 * @return List<MemberTagDat>
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked")
	public List<MemberTagData> getMemberTagData(String appName, String memberTagName, Session session) throws PafException {

		List<MemberTagData> memberTagData = null; 
		String query = null;

		// Create hibernate query to get the member tag data for the specified application
		// and member tag name
		StringBuffer strBuff = new StringBuffer("from MemberTagData mtData where mtData.id in (");
		strBuff.append("select distinct coord.memberTagData.id");
		strBuff.append(" from MemberTagCoord coord");
		strBuff.append(" where coord.memberTagId.application.name = :appname ");
		strBuff.append(" and coord.memberTagId.memberTagName = :tagname ");
		strBuff.append(')');
		query = strBuff.toString();

		// Execute hibernate query
		try {
			logger.debug(query + "---- parameter(s): appname = [" + appName + "], tagname = [" + memberTagName + "]");
			memberTagData = session.createQuery(query)
									.setParameter("appname", appName)
									.setParameter("tagname", memberTagName)
									.list();
		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}

		// Return empty arraylist if no member tag data was found
		if (memberTagData != null) {
			return memberTagData;
		} else {
			return new ArrayList<MemberTagData>();
		}
	}

	/**
	 *	Return the member tag data for the specified application name, member tag 
	 *  name and multidimensional database coordinates.
	 *  
	 *  This is a convenience method for getMemberTagData(appName, memberTagName, simpleCoordList, session, isSuppressMissing)
	 *  where isSuppressMissing is set to 'false'.
	 *  
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param simpleCoordList One or more multidimensional database coordinates
	 * @param session Hibernate session
	 *
	 * @return MemberTagData[]
	 * @throws PafException 
	 */
	public MemberTagData[] getMemberTagData(String appName, String memberTagName, SimpleCoordList simpleCoordList, Session session) throws PafException {
		return getMemberTagData(appName, memberTagName, simpleCoordList, session, false);
	}
	
	/**
	 *	Return the member tag data for the specified application name, member tag 
	 *  name and multidimensional database coordinates.
	 *  
	 *  This is a convenience method for getMemberTagData(appName, memberTagName, simpleCoordList, session, isSuppressMissing)
	 *  where isSuppressMissing is set to 'false'.
	 *  
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param simpleCoordList One or more multidimensional database coordinates
	 * @param session Hibernate session
	 * @param isSuppressMissing Indicates that missing data is suppressed
	 * 
	 * @return MemberTagData[]
	 * @throws PafException 
	 */
	public MemberTagData[] getMemberTagData(String appName, String memberTagName, SimpleCoordList simpleCoordList, Session session, boolean isSuppressMissing) throws PafException {
		return getMemberTagData(appName, memberTagName, simpleCoordList, session, isSuppressMissing, null);
	}
	
	/**
	 *	Return the member tag data for the specified application name, member tag 
	 *  name and multidimensional database coordinates.
	 *  
	 *  This is a convenience method for getMemberTagData(appName, memberTagName, simpleCoordList, session, isSuppressMissing)
	 *  where isSuppressMissing is set to 'false'.
	 *  
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param simpleCoordList One or more multidimensional database coordinates
	 * @param session Hibernate session
	 * @param memberTags is a Member tag cache
	 * 
	 * @return MemberTagData[]
	 * @throws PafException 
	 */
	public MemberTagData[] getMemberTagData(String appName, String memberTagName, SimpleCoordList simpleCoordList, Session session, Map<SimpleMemberTagId,Map<Intersection, MemberTagData>> memberTags) throws PafException {
		return getMemberTagData(appName, memberTagName, simpleCoordList, session, false, memberTags);
	}
	
	/**
	 *	Return the member tag data for the specified application name, member tag 
	 *  name and multidimensional database coordinates
	 *  
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param simpleCoordList One or more multidimensional database coordinates
	 * @param session Hibernate session
	 * @param isSuppressMissing Indicates that missing data is suppressed
	 * @param memberTags is a Member tag cache
	 *
	 * @return MemberTagData[]
	 * @throws PafException 
	 */
	public MemberTagData[] getMemberTagData(String appName, String memberTagName, SimpleCoordList simpleCoordList, Session session, boolean isSuppressMissing, Map<SimpleMemberTagId,Map<Intersection, MemberTagData>> memberTags) throws PafException {
		MemberTagData[] memberTagArray = null;

		try {
			// Get the memberTagData objects for the member tag.
			Map<Intersection, MemberTagData> memberTagMap = getMemberTagMap(appName, memberTagName, session);
			
			// The memberTags map caches the member tag and its data
			// This currently allows for the population of Member tag comments without re-querying the DB
			if (memberTags != null && memberTagMap != null){

				SimpleMemberTagId simpleMTId = new SimpleMemberTagId(appName, memberTagName);

				if ( ! memberTags.containsKey(simpleMTId)){
					memberTags.put(simpleMTId, memberTagMap);
				}
			}
			
			// Get an array of memberTagData objects found in the memberTagMap for the coordinate List
			memberTagArray = getDataFromMemberTagMap(memberTagMap, simpleCoordList, isSuppressMissing);
			
		}catch (RuntimeException e) {

			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error getting member tag data", e, PafErrSeverity.Error);
		}
		
		return memberTagArray;

	}
		
	/**
	 *	Return the member tag data for the specified application name and member tag 
	 *  name
	 *  
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param session Hibernate session
	 *
	 * @return Map<Intersection, MemberTagData>
	 * @throws PafException 
	 */
	public Map<Intersection, MemberTagData> getMemberTagMap(String appName, String memberTagName, Session session) throws PafException {
		int memberTagId = 0;
		Map<Intersection, MemberTagData> memberTagMap = new HashMap<Intersection, MemberTagData>();
		
		try {
						
			// Get member tag id and dimension ids required by main get data query. This will maximize 
			// query efficiency, by reducing the amount of required joins that would have been necessary
			// to resolve the required member tag and dimension ids for each queried data intersection.
			MemberTagId memberTagIdInstance = getMemberTagId(appName, memberTagName, session);
			if (memberTagIdInstance != null) {
				memberTagId = memberTagIdInstance.getId();
			} else {
				// No data found for app and member tag name
				return null;
			}
			
			String query = "from MemberTagData where MEMBER_TAG_ID_INT = " + memberTagId;

			//Execute hibernate query
			List<MemberTagData> memberTagDataList = session.createQuery(query).list();

			//Build a map of MemberTagData objects for the member tag.  Each object will be keyed by an Intersection Object
			for(MemberTagData mtData : memberTagDataList){
				
				if (mtData.getMemberTagCoordSet() != null && mtData.getMemberTagCoordSet().size() > 0){

					String[] dimensions = new String[mtData.getMemberTagCoordSet().size()];
					String[] coordinates = new String[mtData.getMemberTagCoordSet().size()];

					//Construct Intersection object
					int counter = 0;
					for(MemberTagCoord mtCoord : mtData.getMemberTagCoordSet()){
						
						dimensions[counter] = mtCoord.getDimension().getName();
						coordinates[counter] = mtCoord.getMemberName();
						counter++;
					}


					//Add the Intersection object and its corresponding MemberTagData object to the map
					memberTagMap.put(new Intersection(dimensions, coordinates), mtData);
				}
			}
		}
		catch (RuntimeException e) {

			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error getting member tag data", e, PafErrSeverity.Error);
		}

		return memberTagMap;
	}
	
	/**
	 *	Return the member tag data for the specified application name, member tag 
	 *  name and multidimensional database coordinates
	 *  
	 * @param memberTagMap A collection of member tag data points keyed by intersection
	 * @param simpleCoordList One or more multidimensional database coordinates
	 * @param isSuppressMissing Indicates that missing data is suppressed
	 *
	 * @return MemberTagData[]
	 * @throws PafException 
	 */
	public MemberTagData[] getDataFromMemberTagMap(Map<Intersection, MemberTagData> memberTagMap, SimpleCoordList simpleCoordList, boolean isSuppressMissing) throws PafException {
		List<MemberTagData> foundMTDataList = new ArrayList<MemberTagData>();
		MemberTagData[] emptySet;
		int intersectionCount = 0;
		
		// Check for null coordinate list
		if (simpleCoordList == null || simpleCoordList.getCoordinates().length == 0) {
			String errMsg = "Null or empty coordinate list passed to getMemberTagData()";
			logger.error(errMsg);
			//throw new IllegalArgumentException(errMsg);
		}
		
		// Validate that a complete set of coordinates was received
		String[] dimNames = simpleCoordList.getAxis();
		String[] coords = simpleCoordList.getCoordinates();
		int dimCount = dimNames.length;
		int coordCount = coords.length;
		if (coordCount % dimCount != 0) {
			String errMsg = "An incomplete set of coordinates was passed to getMemberTagData()";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);			
		}
		// Initialization
		if (isSuppressMissing) {
			emptySet = new MemberTagData[0];
		} else {
			intersectionCount = coordCount / dimCount;
			emptySet = new MemberTagData[intersectionCount];
		}
		
		// Check for null memberTagMap
		if (memberTagMap == null){
			return emptySet;
		}
		
		//The interesections in the memberTagMap are populated by dimensions in alpha order.  The coordinate list dimensions are also by default in alpha order.
		//This allows the intersections to be directly compared.
		try {
			String[] sortedAxisArray = simpleCoordList.getAxis().clone();
			//A quick alpha sort in case a Member tag is built or modified outside of the Admin Console.  The AC ensures alpha sort ordering
			Arrays.sort(sortedAxisArray);  
			
			int i = 0;
			while (i < simpleCoordList.getCoordinates().length)
			{
				//Construct Intersection object
				Intersection intersectionToFind = new Intersection(sortedAxisArray);
				
				for(int j = 0; j < simpleCoordList.getAxis().length; j++){
					intersectionToFind.setCoordinate(simpleCoordList.getAxis()[j], simpleCoordList.getCoordinates()[i]);
					i++;
				}
				 // Find the intersections from the coordinate list that are in the member tag map consisting of data points for a member tag id)
				// i.e - getting the data for each populated intersection.
				if (memberTagMap.containsKey(intersectionToFind)){
					MemberTagData foundMTData = memberTagMap.get(intersectionToFind);
					foundMTDataList.add(foundMTData);
				}else if (isSuppressMissing == false){  // Empty MemberTagData object.  These show up as blank member tag cells in the grid.
					MemberTagData emptyMemberTag = new MemberTagData();
					emptyMemberTag.setData("");
					foundMTDataList.add(emptyMemberTag);
				}
			}
		}
		catch (RuntimeException e) {

			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error getting member tag data", e, PafErrSeverity.Error);
		}

		if(foundMTDataList.size() > 0){
			return foundMTDataList.toArray(new MemberTagData[0]);
		}else{
			return emptySet;
		}
	}

//	/**
//	 *	Return the member tag data for the specified application name, member tag 
//	 *  name and multidimensional database coordinates
//	 *  
//	 * @param appName Application name
//	 * @param memberTagName Member tag name
//	 * @param simpleCoordList One or more multidimensional database coordinates
//	 * @param session Hibernate session
//	 * @param isSuppressMissing Indicates that missing data is suppressed
//	 *
//	 * @return MemberTagData[]
//	 * @throws PafException 
//	 */
//	public MemberTagData[] getMemberTagData_old(String appName, String memberTagName, SimpleCoordList simpleCoordList, Session session, boolean isSuppressMissing) throws PafException {
//
//		List<MemberTagData> memberTagDataList = new ArrayList<MemberTagData>();
//		MemberTagData[] emptySet = null;
//		StringBuffer strBuff = null;
//		int memberTagId = 0;
//		int[] dimIds = null;
//		String query = null, queryStart = null, queryMiddle = null, queryEnd = null;
//		int intersectionCount = 0;
//
//		// Check for null coordinate list
//		if (simpleCoordList == null) {
//			String errMsg = "Null coordinate list passed to getMemberTagData()";
//			logger.error(errMsg);
//			throw new IllegalArgumentException(errMsg);
//		}
//
//		// Validate that a complete set of coordinates was received
//		String[] dimNames = simpleCoordList.getAxis();
//		String[] coordinates = simpleCoordList.getCoordinates();
//		int dimCount = dimNames.length, coordCount = coordinates.length;
//		if (coordCount % dimCount != 0) {
//			String errMsg = "An incomplete set of coordinates was passed to getMemberTagData()";
//			logger.error(errMsg);
//			throw new IllegalArgumentException(errMsg);			
//		}
//
//		// Initialization
//		intersectionCount = coordCount / dimCount;
//		dimIds = new int[dimCount];
//		if (isSuppressMissing) {
//			emptySet = new MemberTagData[0];
//		} else {
//			emptySet = new MemberTagData[intersectionCount];
//		}
//
//		try {
//
//			// Get member tag id and dimension ids required by main get data query. This will maximize 
//			// query efficiency, by reducing the amount of required joins that would have been necessary
//			// to resolve the required member tag and dimension ids for each queried data intersection.
//			MemberTagId memberTagIdInstance = getMemberTagId(appName, memberTagName, session);
//			if (memberTagIdInstance != null) {
//				memberTagId = memberTagIdInstance.getId();
//			} else {
//				// No data found for app and member tag name - return empty set
//				return emptySet;
//			}
//
//			Map <String,Dimension> dimensionMap = getDimensionMap(session);
//			for (int i = 0; i < dimCount; i++) {
//				Dimension dimension = dimensionMap.get(dimNames[i]);
//				if (dimension != null) {
//					dimIds[i] = dimension.getId();				
//				} else {
//					// No data found for dimension - return empty set
//					return emptySet;
//				}
//			}
//
//			// Create hibernate query to get the member tag data object for selected app, member tag name,
//			// and coordinates - parameter(s): tagid, dimcount. The query will find any member tag data 
//			// matching the selected member tag id, and containing coordinate matches in all dimensions
//			// of this particular member tag. In the example below, we look for a count of 2, since the
//			// example member tag has 2 dimensions.
//			//
//			// 
//			// Sample query:
//			//		from MemberTagData mtData where mtData.id in (
//			//				select max(coord.memberTagData.id)
//			//				from MemberTagCoord coord
//			//				where coord.memberTagId = 3
//			//				and (coord.dimension = 14 and coord.memberName = 'Pos3'
//			//				or coord.dimension = 15 and coord.memberName = 'F04')
//			//				group by coord.memberTagData.id
//			//				having count(coord.memberTagData.id) = 2
//			//				)	
//			strBuff = new StringBuffer("from MemberTagData mtData where mtData.id in (");
//			strBuff.append("select max(coord.memberTagData.id) ");
//			strBuff.append("from MemberTagCoord coord ");
//			strBuff.append("where coord.memberTagId.id = :tagid ");
//			queryStart = strBuff.toString();
//
//			strBuff = new StringBuffer("group by coord.memberTagData.id ");
//			strBuff.append("having count(coord.memberTagData.id) = :dimcount)");
//			queryEnd = strBuff.toString();
//
//
//			// Retrieve member tag values for each data intersection, from RDB
//			int coordInx = 0;
//			for (int i = 0; i < intersectionCount; i++) {
//
//				// Create query middle (contains coordinate criteria)
//				strBuff = new StringBuffer("and (");
//				for (int dimInx = 0; dimInx < dimCount; dimInx++) {
//					String coordinate = coordinates[coordInx++];
//					strBuff.append("coord.dimension = " + dimIds[dimInx] + " and coord.memberName = '" + coordinate + "'");
//					if (dimInx < dimCount - 1) {
//						strBuff.append(" or ");
//					}
//				}
//				strBuff.append(") ");
//				queryMiddle = strBuff.toString();
//
//				// Execute hibernate query
//				query = queryStart + queryMiddle + queryEnd;
//				logger.debug(query + "---- parameter(s): tagid = [" + memberTagId + "], dimCount = [" + dimCount +"]");
//				MemberTagData memberTagData = (MemberTagData) session.createQuery(query)
//																	.setParameter("tagid", memberTagId, Hibernate.INTEGER)
//																	.setParameter("dimcount", dimCount, Hibernate.INTEGER)
//																	.uniqueResult();
//
//				// If data is found or if missing values are not suppressed, add query results to return list
//				if (memberTagData != null || !isSuppressMissing) {
//					memberTagDataList.add(memberTagData);
//				}
//
//			}
//
//		} catch (RuntimeException e) {
//			
//			// Log exception
//			PafErrHandler.handleException(e, PafErrSeverity.Error);
//			throw new PafException("Error getting member tag data", e, PafErrSeverity.Error);
//		}
//
//		return memberTagDataList.toArray(new MemberTagData[0]);
//	}

	/**
	 *	Return the member tag id object for the specified app and member tag name
	 *
	 * @param appName Application name
	 * @param memberTagName Member tag name
	 * @param session Hibernate session
	 * 
	 * @return MemberTagId
	 * @throws PafException 
	 */
	private MemberTagId getMemberTagId(String appName, String memberTagName, Session session) throws PafException {

		MemberTagId memberTagId = null; 
		String query = null;

		// Create hibernate query to get the member tag id object for app & member tag name - parameter(s): appname, tagname
		StringBuffer strBuff = new StringBuffer("from MemberTagId mtId ");
		strBuff.append("where application.name = :appname ");
		strBuff.append("and memberTagName = :tagname ");
		query = strBuff.toString();

		// Execute hibernate query
		try {
			logger.debug(query + "---- parameter(s): appname = [" + appName + "], tagname = [" + memberTagName + "]");
			memberTagId = (MemberTagId) session.createQuery(query)
												.setParameter("appname", appName)
												.setParameter("tagname", memberTagName)
												.uniqueResult();
		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}

		// Return member tag id
		return memberTagId;
	}

	/**
	 *	Return all the member tag id objects for the specified application name
	 *
	 * @param appName Application name
	 * @param session Hibernate session
	 * 
	 * @return List<MemberTagId>
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked")
	private List<MemberTagId> getMemberTagIds(String appName, Session session) throws PafException {

		List<MemberTagId> memberTagIds = null; 
		String query = null;

		// Create hibernate query to get all member tag id objects for the specified 
		// application name - parameter(s): appname
		StringBuffer strBuff = new StringBuffer("from MemberTagId mtId ");
		strBuff.append("where application.name = :appname ");
		query = strBuff.toString();

		// Execute hibernate query
		try {
			logger.debug(query + "---- parameter(s): appname = [" + appName + "]");
			memberTagIds = session.createQuery(query)
													.setParameter("appname", appName)
													.list();
		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}

		// Return empty arraylist if no member tag ids were found
		if (memberTagIds != null) {
			return memberTagIds;
		} else {
			return new ArrayList<MemberTagId>();
		}
	}

	/**
	 *	Return all the member tag ids
	 *
	 * @param session Hibernate session
	 * 
	 * @return List<MemberTagId>
	 */
	@SuppressWarnings("unchecked")
	public static List<MemberTagId> getMemberTagIds(Session session) {

		List<MemberTagId> memberTagIds = null;
		try {
			memberTagIds = session.createQuery("from MemberTagId").list();
		} catch (HibernateException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		
		// Return empty arraylist if no items were returned
		if (memberTagIds != null) {
			return memberTagIds;
		} else {
			return new ArrayList<MemberTagId>();
		}
		
	}

	/**
	 * 
	 *  Returns a map of member tag id's <appName.memberTagName, memberTagId>
	 *
	 * @param session Session to use
	 * @return Map<String, MemberTagId>
	 */
	public static Map<String, MemberTagId> getMemberTagIdMap (Session session) {
		
		logger.debug("DEBUG - Start getMemberTagMap(Session) - " + new Date());
		
		Map<String, MemberTagId> memberTagIdMap = new HashMap<String, MemberTagId>();
		
		// Get list of member tag id's
		List<MemberTagId> memberTagIdList = getMemberTagIds(session);
		
		// Create map
		if (memberTagIdList != null ) {
			for (MemberTagId memberTagId:memberTagIdList) {
				memberTagIdMap.put(memberTagId.generateKey(), memberTagId);
			}
		}		
		
		logger.debug("DEBUG - End getMemberTagIdMap(Session) - " + new Date());
		
		return memberTagIdMap;
		
	}

	/**
	 *	Return member tag data record counts for the specified appId/member tag 
	 *  combinations
	 *  
	 * @param memberTagFilters An array of member tag filters that specify which apps/member tags should be queried 
	 * 
	 * @return PafGetMemberTagInfoResponse
	 * @throws PafException 
	 */
	public PafGetMemberTagInfoResponse getMemberTagInfo(PafMbrTagFilter[] memberTagFilters) throws PafException {

		logger.debug("DEBUG - Start getMemberTagInfo() - " + new Date());

		PafGetMemberTagInfoResponse response = new PafGetMemberTagInfoResponse();
		PafMbrTagFilter[] filters;
		MemberTagInformation[] memberTagInfoArray = null;
		Session session = null;
		int totalMemberTagCount = 0;


		try {

			// Get new hibernate session
			session = getSession();

			// Get the list of applications to query
			if (memberTagFilters == null || memberTagFilters.length == 0) {	
				// No supplied filter - create filter using all apps in db
				List<String> appList = getAppNames(session);
				filters = new PafMbrTagFilter[appList.size()];
				for (int i = 0; i < appList.size(); i++) {
					filters[i] = new PafMbrTagFilter(appList.get(i));
				}
			} else {
				filters = memberTagFilters;
			}	

			// Get individual member tag counts for each application
			int appCount = filters.length;
			memberTagInfoArray = new MemberTagInformation[appCount];
			for (int appInx = 0; appInx < appCount; appInx++) {
				PafMbrTagFilter filter = filters[appInx];
				String appName = filter.getAppName();
				MemberTagInformation memberTagInfo = null;
				String[] memberTagNames = filter.getMemberTagNames();
				if (memberTagNames.length == 0) {
					// No individual member tag filters - just get all member tag counts for app
					memberTagInfo = getMemberTagCounts(appName, session);
				} else {
					// Get individual member tag counts
					memberTagInfo = getMemberTagCounts(appName, memberTagNames, session);
				}
				totalMemberTagCount += memberTagInfo.getAppMemberTagCount();
				memberTagInfoArray[appInx] = memberTagInfo;
			}

			// Populate response object	
			response = new PafGetMemberTagInfoResponse(totalMemberTagCount, memberTagInfoArray);

		} catch (RuntimeException e) {
			// Log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			
		} finally {
			// Terminate hibernate session
			terminateSession(session);
		}

		logger.debug("DEBUG - End getMemberTagInfo() - " + new Date());

		// Return member tag information
		return response;

	}

	/**
	 *  Import member tag data
	 *
	 * @param importMemberTags Array of simple member tags to import
	 * @throws PafException 
	 */
	public synchronized void importMemberTagData(SimpleMemberTagData[] importMemberTags) throws PafException {

		Session session = null;		
		Transaction tx = null;

		logger.debug("DEBUG - Start importMemberTags(SimpleMemberTagData[]) - " + new Date());

		
		try {
			
			// Establish session and start transaction
			session = getSession();			
			tx = session.beginTransaction();
			
			// Import the member tags
			logger.info("Importing member tag data...");
			saveOrUpdateMemberTags(importMemberTags, session);
			
			// Commit database updates
			tx.commit();
	
		} catch (RuntimeException e) {

			try {				
				if (tx != null) {
					// Rollback if runtime exception occurred
					tx.rollback();
				}			
			} catch (RuntimeException rbEx) {			
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);				
			}

			//log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error saving member tag data", e, PafErrSeverity.Error);

		} finally {
			
			// Terminate the hibernate session
			terminateSession(session);

		}
		

		logger.debug("DEBUG - End importMemberTags(SimpleMemberTagData[]) - " + new Date());
	}
	
	/**
	 *  Process updates to member tag data
	 *
	 * @param addMemberTags Member tag data to add
	 * @param updateMemberTags Member tag data to update
	 * @param deleteMemberTags Member tag data to delete
	 * 
	 * @throws PafException 
	 */
	public synchronized void saveMemberTagData(SimpleMemberTagData[] addMemberTags, SimpleMemberTagData[] updateMemberTags, SimpleMemberTagData[] deleteMemberTags) throws PafException {

		Session session = null;		
		Transaction tx = null;

		logger.debug("DEBUG - Start saveMemberTags(SimpleMemberTagData[], SimpleMemberTagData[], SimpleMemberTagData[]) - " + new Date());

		
		try {
			
			// Establish session and start transaction
			session = getSession();			
			tx = session.beginTransaction();
			
			// Process the member tag updates
			logger.info("Processing member tag deletions...");
			deleteMemberTags(deleteMemberTags, session);
			logger.info("Processing member tag additions...");
			saveOrUpdateMemberTags(addMemberTags, session);
			logger.info("Processing member tag updates...");
			saveOrUpdateMemberTags(updateMemberTags, session);
			
			// Commit database updates
			tx.commit();
	
		} catch (RuntimeException e) {

			try {				
				if (tx != null) {
					// Rollback if runtime exception occurred
					tx.rollback();
				}			
			} catch (RuntimeException rbEx) {			
				//log exception
				PafErrHandler.handleException(rbEx, PafErrSeverity.Error);				
			}

			//log exception
			PafErrHandler.handleException(e, PafErrSeverity.Error);
			throw new PafException("Error saving member tag data", e, PafErrSeverity.Error);

		} finally {
			
			// Terminate the hibernate session
			terminateSession(session);

		}
		
		logger.debug("DEBUG - End saveMemberTags(SimpleMemberTagData[], SimpleMemberTagData[], SimpleMemberTagData[]) - " + new Date());
		
	}
	/**
	 *	Remap all member tag database entries for the specified application 
	 *  ids and member tag names to different member tag names
	 *
	 * @param memberTagFilters An array of member tag filters containing rename specifications 
	 */
	public synchronized void renameMemberTagData(PafMbrTagFilter[] memberTagFilters) {
	}

	/**
	 *  Save or update specified member tags
	 *
	 * @param simpleMemberTags Array of simple member tags
	 * @param session Hibernate session
	 * 
	 * @throws PafException 
	 */
	private synchronized void saveOrUpdateMemberTags(SimpleMemberTagData[] simpleMemberTags, Session session) throws PafException {

		Map<String, Application> applicationMap = null;
		Map<String, Dimension> dimensionMap = null;
		Map<String, MemberTagId> memberTagIdMap = null;
		int addCount = 0, updateCount = 0, transCount = 0;
		
		// Exit if there are no member tags to add/update
		if (simpleMemberTags == null) {
			return;
		}
		
		logger.debug("DEBUG - Start saveOrUpdateMemberTags(SimpleMemberTagData[], session) - " + new Date());
		
		// Initialize application and dimension maps
		applicationMap = getApplicationMap(session);
		dimensionMap = getDimensionMap(session);
		memberTagIdMap = getMemberTagIdMap(session);
		
//		Member Tag Data cache
		Map<SimpleMemberTagId,Map<Intersection, MemberTagData>> memberTags = new HashMap<SimpleMemberTagId,Map<Intersection, MemberTagData>>();


		// Iterate through each simple member tag, adding the member tag data record to the 
		// database if it is new, or updating pre-existing data if the member tag intersection
		// already exists.
		for (SimpleMemberTagData simpleMemberTag:simpleMemberTags) {

			// Initialization
			String appName = simpleMemberTag.getApplicationName();
			MemberTagData memberTagData = null;

			// Validate member tag coordinates if member tag app matches loaded app.
			// Otherwise, this validation can't be done.
			String loadedApp = pafAppService.getApplications().get(0).getAppId();
			if (loadedApp.equals(appName)) {
				String[] memberTagNames = new String[]{simpleMemberTag.getMemberTagName()}; 
				MemberTagDef memberTagDefs[] = pafAppService.getMemberTagDefs(appName, memberTagNames);
				List<String> requiredDims = Arrays.asList(memberTagDefs[0].getDims());
				List<String> mtDims = Arrays.asList(simpleMemberTag.getSimpleCoordList().getAxis());
				if (requiredDims.size() != mtDims.size() || !mtDims.containsAll(requiredDims)) {
					String errMsg = "Unable to save or update member tag ["
						+ simpleMemberTag.getMemberTagName() + "], at coordinates " 
						+ StringUtils.arrayToString(simpleMemberTag.getSimpleCoordList().getCoordinates()) 
						+ " - specified dimension list does not conform to member tag definition";
					logger.error(errMsg);
					throw new IllegalArgumentException(errMsg);
				}
			}
			
			//get cached member tag map or load from db
			Map<Intersection, MemberTagData> memberTagMap = null;
			SimpleMemberTagId simpleMTId = new SimpleMemberTagId(simpleMemberTag.getApplicationName(), 
					simpleMemberTag.getMemberTagName());
			if (memberTags.containsKey(simpleMTId)){
				memberTagMap = memberTags.get(simpleMTId);
			}else{
				//Get all the memberTagData data objects for the member tag.
				memberTagMap = getMemberTagMap(simpleMemberTag.getApplicationName(), simpleMemberTag.getMemberTagName(), session);
				//cache the member tag and its data objects
				memberTags.put(simpleMTId, memberTagMap);
			}
						
			//Get an array of memberTagData data objects found in the memberTagMap for the coordinate List
			MemberTagData[] memberTagDataArray = getDataFromMemberTagMap(memberTagMap, simpleMemberTag.getSimpleCoordList(), true);

//			// Search member tag database for a record that matches the current simple member tag
//			MemberTagData[] memberTagDataArray = getMemberTagData(simpleMemberTag.getApplicationName(), 
//					simpleMemberTag.getMemberTagName(), simpleMemberTag.getSimpleCoordList(), session, true);
			
			int recordCount = memberTagDataArray.length;

			// If member tag data record was not found, then format new record
			if (recordCount == 0) {

				// Convert simple member tag data to member tag data
				simpleMemberTag.setId(-1);
				memberTagData = new MemberTagData(simpleMemberTag);
				
				// Check embedded objects in each coordinate set record to see if they already exist
				Set<MemberTagCoord> memberTagCoordSet = memberTagData.getMemberTagCoordSet();
				for (MemberTagCoord memberTagCoord:memberTagCoordSet) {

					// Check if member tag id exists
					MemberTagId memberTagId = memberTagCoord.getMemberTagId();
					String memberTagIdKey = memberTagId.generateKey();
					if (memberTagIdMap.containsKey(memberTagIdKey)) {
						// Use existing member tag id object
						memberTagCoord.setMemberTagId(memberTagIdMap.get(memberTagIdKey));
					} else {
						// New member tag id - place it on map (the id field will get
						// resolved after the saveOrUpdate operation)
						memberTagIdMap.put(memberTagIdKey, memberTagId);

						// Check if application on member tag id exists
						if (applicationMap.containsKey(appName)) {
							// Use existing application object
							memberTagId.setApplication(applicationMap.get(appName));
						} else {
							// New application - place it on map (the id field will get
							// resolved after the saveOrUpdate operation)
							applicationMap.put(appName, memberTagId.getApplication());								
						}
					}
					
					memberTagData.setMemberTagId(memberTagIdMap.get(memberTagIdKey));

					// Check if dimension exists
					String dimName = memberTagCoord.getDimension().getName();
					if (dimensionMap.containsKey(dimName)) {
						// Use existing dimension object
						memberTagCoord.setDimension(dimensionMap.get(dimName));
					} else {
						// New dimension - place it on map (the id field will get
						// resolved after the saveOrUpdate operation)
						dimensionMap.put(dimName, memberTagCoord.getDimension());								
					}
					
				}

				logger.debug("Saving member tag: " + memberTagData.toString());
				addCount++;

			} else if (recordCount == 1) {

				// Else, if record was found - update it with new information
				memberTagData = memberTagDataArray[0];
				memberTagData.setCreator(simpleMemberTag.getCreator());
				memberTagData.setData(simpleMemberTag.getData());
				memberTagData.setLastUpdated(simpleMemberTag.getLastUpdated());
				memberTagData.setMemberTagType(simpleMemberTag.getMemberTagType());
				
				logger.debug("Updating member tag: " + memberTagData.toString());
				updateCount++;

			} else {

				// Else, one or more duplicate records found
				String errMsg = recordCount + " instances of member tag intersection found - unable to proceed";
				logger.error(errMsg);
				throw new PafException(errMsg,PafErrSeverity.Error);
			}

			// Truncate member tag value if too long
			if (memberTagData.getData().length() > MEMBER_TAG_DB_VALUE_MAX_LENGTH ) {
				memberTagData.setData(memberTagData.getData().substring(0, MEMBER_TAG_DB_VALUE_MAX_LENGTH - 1));
			}

			// Save or update member tag data
			session.saveOrUpdate(memberTagData);	

			// Flush session after a specfic number of transactions
			if (++transCount % TRANSACTION_LIMIT == 0 ) {	

				session.flush();
				session.clear();

				//	Refresh	application, dimension, and member tag id maps
				applicationMap = getApplicationMap(session);	
				dimensionMap = getDimensionMap(session);
				memberTagIdMap = getMemberTagIdMap(session);
				
				//Refresh Cache
				memberTags = new HashMap<SimpleMemberTagId,Map<Intersection, MemberTagData>>();
			}

		}		

		// Log transaction counts
		if (addCount > 0) {
			logger.info(addCount + " member tag intersection(s) added");
		}			
		if (updateCount > 0) {
			logger.info(updateCount + " member tag intersection(s) updated");
		}			


		logger.debug("DEBUG - End saveOrUpdateMemberTags(SimpleMemberTagData[], session) - " + new Date());

	}



}


