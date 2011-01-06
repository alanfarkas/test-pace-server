/*
 *	File: @(#)EsbMetaData.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Jul 30, 2005  		By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.mdb.essbase;

import java.lang.reflect.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.base.IEssIterator;
import com.essbase.api.dataquery.IEssMdAxis;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.essbase.api.dataquery.IEssMdMember;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.metadata.IEssCubeOutline;
import com.essbase.api.metadata.IEssDimension;
import com.essbase.api.metadata.IEssMember;
import com.essbase.api.metadata.IEssMemberSelection;
import com.essbase.api.metadata.IEssMember.EEssShareOption;
import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.IMdbMetaData;
import com.palladium.paf.mdb.PafAttributeMember;
import com.palladium.paf.mdb.PafAttributeMemberProps;
import com.palladium.paf.mdb.PafAttributeTree;
import com.palladium.paf.mdb.PafBaseTree;
import com.palladium.paf.mdb.PafBaseMember;
import com.palladium.paf.mdb.PafBaseMemberProps;
import com.palladium.paf.mdb.PafDimMember;
import com.palladium.paf.mdb.PafMdbProps;
import com.palladium.utility.StringUtils;

/**
 * Provides access to the Essbase meta-data layer
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbMetaData implements IMdbMetaData {
	
	private EsbConnMgr esbConnMgr = null;
	private EsbCubeConn esbCubeConn = null;
	private Properties connectionProps = null;
	private String esbConnAlias = null;
	private static Method getMemberTypeMethod = null, getFormatStringMethod = null;
	private static Logger logger = Logger.getLogger(EsbMetaData.class);
	
	static {
		// Use java reflection to initialize Essbase JAPI methods that were only
		// available as of Essbase 11.x.
		Class<?> cls = null;
		try {
			cls = Class.forName("com.essbase.api.metadata.IEssMember");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		}
		
		try {
			getMemberTypeMethod = cls.getMethod("getMemberType");
		} catch(NoSuchMethodException ex){
			// Prior to Essbase 11.x there was no such method
		}

		try {
			getFormatStringMethod = cls.getMethod("getFormatString");
		} catch(NoSuchMethodException ex){
			// Prior to Essbase 11.x there was no such method
		}

	}

	
	/**
	 * @param connectionProps Connection property string
	 * @throws PafException 
	 */
	public EsbMetaData(Properties connectionProps) throws PafException {
		
		// Create Logger Message
		String esbConnAlias = "[" + connectionProps.getProperty("SERVER") + "/" 
		+ connectionProps.getProperty("APPLICATION") + "/" 
		+ connectionProps.getProperty("DATABASE") + "]";
		logger.info("Creating instance of EsbData - Connection Alias: " + esbConnAlias);
		this.esbConnAlias  = esbConnAlias;
		this.connectionProps = connectionProps;

		// Connect to Essbase cube
		esbConnMgr = new EsbConnMgr(connectionProps);
		esbCubeConn = (EsbCubeConn) esbConnMgr.getConnection(connectionProps);
		

	}

	/**
	 *	Import an Essbase attribute tree and member properties.
	 *
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param dimeionsion Attribute dimension
	 * @param mdbProps Multidimensional database properties
	 * 
	 * @return PafAttributeTree
	 * @throws PafException 
	 */
	public PafAttributeTree getAttributeDimension(int essNetTimeOut, String dimension, PafMdbProps mdbProps) throws PafException  {
		
		int toLevel = 0;
		String errMsg = "Error encountered when getting attirbute dimension branch: [" + dimension +"] - ";
		String baseDimName = "";
		String cubeViewName = null;
		String[] aliasTableNames = null;
		IEssCubeOutline essCubeOutline = null;
		EsbCubeView esbCubeView = null;
		IEssMember essRootMember = null;
		PafAttributeMember root = null;
		PafAttributeMemberProps pafAttributeMemberProps = null;
		PafAttributeTree pafAttributeTree = null;
		Map<Integer, List<IEssMember>> genMap = new TreeMap<Integer, List<IEssMember>>();


		logger.info("Getting attribute dimension: [" + dimension + "] down to level: " + toLevel);
		try {
			
			// Open cube outline (read-only mode)
			IEssCube essCube = esbCubeConn.getEssCube();
			essCubeOutline = EsbUtility.essOpenOutline(essCube, essNetTimeOut);
			
			// Open a cube view
			cubeViewName = "Paf View - " + esbConnAlias;
			logger.info("Opening cube view: " + cubeViewName);   
			esbCubeView = new EsbCubeView(cubeViewName,  esbConnMgr, connectionProps, true);				

			// Get the list of alias tables
			aliasTableNames = EsbUtility.essGetAliasTableNames(essCubeOutline, essNetTimeOut);
			
			// Set root member properties
			essRootMember = EsbUtility.essFindOtlMember(essCubeOutline, dimension, essNetTimeOut);
			root = new PafAttributeMember(dimension);
			pafAttributeMemberProps = getEsbAttributeMemberProps(esbCubeView, essRootMember, aliasTableNames, dimension, essNetTimeOut);
			root.setMemberProps(pafAttributeMemberProps);
			
			// Create PafAttributeTree - traverse outline and get descendant members and their properties
			pafAttributeTree = new PafAttributeTree(root, aliasTableNames);
			baseDimName = mdbProps.getAssociatedBaseDim(dimension);
		    pafAttributeTree.setBaseDimName(baseDimName);

		    // Retrieve all descendants of root, along with selected properties, from Essbase
		    //  - down to specified level.
			String fieldSelection = "<OutputType Binary <SelectMbrInfo ("
				+ " ParentMemberName"
				+ ", MemberName"
				+ ", MemberNumber"
				+ ", MemberLevel"
				+ ", MemberGeneration"
				+ ", Consolidation"
				+ ", MemberAliasName"
				+ ")";
			String rootKey = root.getKey();
			String mbrSelection = "@DESC(" + StringUtils.doubleQuotes(rootKey) + ", "+ toLevel + ")";
			IEssMemberSelection mbrSelQry = EsbUtility.essOpenMemberSelection(essCube, rootKey + " Query", essNetTimeOut);
			EsbUtility.essExecuteQuery(mbrSelQry, fieldSelection, mbrSelection, essNetTimeOut);
            IEssIterator descendants = mbrSelQry.getMembers();

			// Organize Essbase members by generation. Queried descendants come back sorted in 
			// post-traversal order. However, these members need to processed in generation order,
            // when added to the dimension tree. This ensures that all parents are added to the tree
            // before any of their children.
            genMap = createEsbMemberGenTree(descendants, essNetTimeOut);	
		
            // Add Essbase members to dimension tree in generation order
            for (int gen : genMap.keySet()) {
            	List<IEssMember> members = genMap.get(gen);
            	for (IEssMember member : members) {
					// Format new attribute member
					PafAttributeMember pafAttributeMember = new PafAttributeMember(member.getName());
					pafAttributeMemberProps = getEsbAttributeMemberProps(esbCubeView, member, aliasTableNames, dimension, essNetTimeOut);
					pafAttributeMember.setMemberProps(pafAttributeMemberProps);
					String parentKey = member.getParentMemberName();
					pafAttributeTree.addChild(parentKey, pafAttributeMember);
				}
            }

            // Close member selection
            EsbUtility.essCloseMemberSelection(mbrSelQry, essNetTimeOut);


		} catch (EssException esx) {
			// throw Paf Exception
			errMsg += esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			pfe.setStackTrace(esx.getStackTrace());
			throw pfe;


		} finally {
			try {
				// Close outline
				if (essCubeOutline != null) {
					EsbUtility.essCloseOutline(essCubeOutline, essNetTimeOut);
				}
			} catch (EssException esx) {
				// throw Paf Exception
				errMsg += esx.getMessage();
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
				throw pfe;
			} finally {
				// Close cube view
				logger.info("Closing cube view...");            
				if (esbCubeView != null) {
					esbCubeView.disconnect();
				}
			}
		}

		// Return the fully loaded PafAttributeTree
		return pafAttributeTree;
	}

	
	/**
	 *	Return a tree structure containing an Essbase dimension member, it's descendants,
	 *  and any member properties. This method will in-turn call getBaseDimension(0, branch, 0).
	 *
	 * @param branch
	 * @return PafBaseTree
	 * @throws PafException 
	 */
	public PafBaseTree getBaseDimension(String branch) throws PafException  {
		
		// Get the specified dimension tree using "0" as the default "to level" and
		// 0 as the Essbase net timeout setting
		return getBaseDimension(0, branch, 0);
	}
	
	/**
	 *	Return a tree structure containing an Essbase dimension member, it's descendants,
	 *  and any member properties. This method will in-turn call getBaseDimension(essTimeOut, branch, 0).
	 *
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param branch
	 * 
	 * @return PafBaseTree
	 * @throws PafException 
	 */
	public PafBaseTree getBaseDimension(int essNetTimeOut, String branch) throws PafException {
		return getBaseDimension(essNetTimeOut, branch, 0);
		//TODO Change back to getBaseDimension(essNetTimeOut, branch, 0);
	}
	
	/**
	 *	Return a tree structure containing an Essbase dimension member, it's descendants,
	 *  and any member properties - down to the specified Essbase level. This method will 
	 *  in-turn call getBaseDimension(0, branch, 0).
	 *
	 * @param branch
	 * 
	 * @return PafBaseTree
	 * @throws PafException 
	 */
	public PafBaseTree getBaseDimension(String branch, int toLevel) throws PafException {
		return getBaseDimension(0, branch, toLevel);
	}

	/**
	 *	Return a tree structure containing an Essbase dimension member, it's descendants,
	 *  and any member properties - down to the specified Essbase level.
	 *
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param branch Outline branch being returned
	 * @param toLevel Bottom requested Essbase level
	 * 
	 * @return PafBaseTree
	 * @throws PafException 
	 */
	public PafBaseTree getBaseDimension(int essNetTimeOut, String branch, int toLevel) throws PafException  {
		
		String errMsg = "Error encountered when getting dimension branch: [" + branch +"] - ";
		String fieldSelection = null;
		String[] aliasTableNames = null;
		IEssCubeOutline essCubeOutline = null;
		PafBaseMember baseRoot = null;
		PafBaseTree baseTree = null;
		Map<Integer, List<IEssMember>> genMap = null;;

		
		logger.info("Getting dimension for branch: [" + branch + "] down to level: " + toLevel);
		try {
			
			// Open cube outline (read-only mode)
			IEssCube essCube = esbCubeConn.getEssCube();
			essCubeOutline = EsbUtility.essOpenOutline(essCube, essNetTimeOut);
			
			// Determine number of alias tables used in this outline
			aliasTableNames = EsbUtility.essGetAliasTableNames(essCubeOutline, essNetTimeOut);
			
			// Set root member properties. Create baseRoot using actual root member name in outline
			// in case "branch" parameter is not correctly cased.
			IEssMember essRootMember = EsbUtility.essFindOtlMember(essCubeOutline, branch, essNetTimeOut);
			baseRoot = new PafBaseMember(essRootMember.getName());  
			PafBaseMemberProps rootProps = getEsbBaseMemberProps(baseRoot.getKey(), essCubeOutline, essRootMember, aliasTableNames, essNetTimeOut);
			baseRoot.setMemberProps(rootProps);
			
			// Create PafBaseTree
			baseTree = new PafBaseTree(baseRoot, aliasTableNames);
			
			// Retrieve all descendants of root, along with selected properties, from
			// Essbase - down to specified level.
			fieldSelection = "<OutputType Binary <SelectMbrInfo ("
				+ " ParentMemberName"
				+ ", MemberName"
				+ ", MemberNumber"
				+ ", MemberLevel"
				+ ", MemberGeneration"
				+ ", Consolidation"
				+ ", ShareOption"
				+ ", MemberAliasName"
				+ ")";
//					MemberName (Member name), MemberLevel (Member level number), MemberGeneration (Member generation number), 
//					Consolidation (Whether this member is consolidated), TwoPass (Whether this member undergoes a two pass operation), 
//					Expense (Whether this is an expense member), CurrencyConvType (Currency conversion type), CurrencyMember (Whether this is a currency member),
//					TimeBalance (Time balance measure), SkipOption (Whether this member skips the time balance operation), 
//					ShareOption (Whether this is a shared member), StorageType (Dimension's storage type), 
//					DimensionCategory (Dimension category: accounts, time, currency, etc.), 
//					DimensionStorageCategory (Dimension storage category: time, units, scenario, etc.), Comment (Member comment), 
//					ChildrenCount (Number of children), MemberNumber (Member number), DimensionName (Dimension name), 
//					DimensionNumber (Dimension number), MemberAliasName (Alias for this member), ParentMemberName (Parent's name), 
//					ChildMemberName (Child's name), PreviousMemberName (Left sibling's name), NextMemberName (Right sibling's name), 
//					CurrencyConversionDatabase (Whether this database has currency conversion), MemberStatus (Member status), 
//					UDAList (List of UDAs attached to this member), MemberFormula (Formula for this member), 
//					MemberValidity (Whether this member is valid), AttrDimensionNames (Attribute dimensions associated with this member's dimension), 
//					MemberAttributed (Whether this member is attributed), AttributeDataType (Attribute data type for this member), 
//					AttributeDataValue (Attribute data value for this member).
			String rootKey = baseRoot.getKey();
			String mbrSelection = "@DESC(" + StringUtils.doubleQuotes(rootKey) + ", "+ toLevel + ")";
			IEssMemberSelection mbrSelQry = EsbUtility.essOpenMemberSelection(essCube, rootKey + " Query", essNetTimeOut);
			EsbUtility.essExecuteQuery(mbrSelQry, fieldSelection, mbrSelection, essNetTimeOut);
			IEssIterator descendants = mbrSelQry.getMembers();

			// Organize Essbase members by generation. Queried descendants come back sorted in 
			// post-traversal order. However, these members need to processed in generation order,
            // when added to the dimension tree. This ensures that all parents are added to the tree
            // before any of their children.
            genMap = createEsbMemberGenTree(descendants, essNetTimeOut);

            // Add Essbase members to base dimension tree in generation order
            Set<String> invalidMemberNames = new HashSet<String>();
            for (int gen : genMap.keySet()) {
            	List<IEssMember> essMembers = genMap.get(gen);
            	for (IEssMember essMember : essMembers) {        		
              		addEssMemberToBaseTree (essNetTimeOut, essMember, baseTree, essCubeOutline, aliasTableNames, invalidMemberNames);	
				}
            }

            // Close member selection
            EsbUtility.essCloseMemberSelection(mbrSelQry, essNetTimeOut);

            
            // Process shared Essbase members. This entails: fully expanding the shared member down
            // to all of its descendants; adjusting the level and generation properties in the tree, 
            // and ensuring that each member in a shared hierarchy is flagged as SHARED.
            //
            // This extra processing is necessary as Essbase internally represents all shared
            // members as level 0 members without any descendants. 
            //
            List<PafDimMember> sharedMembers = new ArrayList<PafDimMember>(baseTree.getSharedMembers());
            for (PafDimMember sharedDimMember : sharedMembers) {
            	
            	PafBaseMember sharedMember = (PafBaseMember) sharedDimMember;
               	String memberKey = sharedMember.getKey();
          		PafBaseMemberProps origMemberProps = null;
             	PafBaseMember firstOccurence = baseTree.getMember(memberKey);
            	
            	// If the original occurrence of this shared member exists in this tree...
             	if (!firstOccurence.isShared())  {
             		
             		// Expand out all descendants of the shared member by cloning the original
             		// member branch that exists higher in the base tree. 
             		baseTree.addChildCopies(baseTree, firstOccurence, sharedMember, 0);	// TTN-1347
             		origMemberProps = firstOccurence.clone().getMemberProps();			// TTN-1347              		
              		
            	} else { 
            	// ELSE - The original occurrence of this shared members does not already exist in the tree. In
            	// this case, we run a separate Essbase outline query to get the descendants of the shared node
            	//
            	// This condition should only occur in the following situations:
            	// 1) The current dimension is the Measures dimension and the MEASURE ROOT parameter specifies the top
            	//	  of an alternate Hierarchy.
            	// 2) The shared member occurs before it's original member in the Essbase outline (bad design).
            	//
             		// Get original member 
             		IEssMember origEssMember = EsbUtility.essFindOtlMember(essCubeOutline, memberKey, essNetTimeOut);
             		origMemberProps = getEsbBaseMemberProps(memberKey, essCubeOutline, origEssMember, aliasTableNames, essNetTimeOut);
             		
             		// Get descendants of original occurrence of base member
        			String sharedMbrSelection = "@DESC(" + StringUtils.doubleQuotes(memberKey) + ", "+ toLevel + ")";
        			IEssMemberSelection sharedMbrSelQry = EsbUtility.essOpenMemberSelection(essCube, memberKey + " Query", essNetTimeOut);
        			EsbUtility.essExecuteQuery(sharedMbrSelQry, fieldSelection, sharedMbrSelection, essNetTimeOut);
        			IEssIterator sharedDescendants = sharedMbrSelQry.getMembers();

					// Add these shared descendants to base tree
        			if (sharedDescendants != null) {

        				// Organize shared descendants by generation. (TTN-1347)
         	            Map<Integer, List<IEssMember>> sharedGenMap = createEsbMemberGenTree(sharedDescendants, essNetTimeOut);

         	            // Add shared descendants to base dimension tree in generation order (TTN-1347)
         	            for (int gen : sharedGenMap.keySet()) {
         	            	List<IEssMember> essMembers = sharedGenMap.get(gen);
         	            	for (IEssMember essMember : essMembers) {        		
							addEssMemberToBaseTree(essNetTimeOut, essMember, baseTree, essCubeOutline, aliasTableNames, invalidMemberNames, true);
						}
					}
					}
        			
					// Close member selection
                    EsbUtility.essCloseMemberSelection(sharedMbrSelQry, essNetTimeOut);
            	}

          		// Adjust level of shared node to be same as original occurrence
          		baseTree.changeMemberLevel(sharedMember, origMemberProps.getLevelNumber());  
          		
          		// Propagate level number change along all the ancestors of the current shared
          		// member. The level number of any member should be one higher than the 
          		// highest level of any of its children.
          		PafDimMember sharedChild = sharedMember;
          		List<PafDimMember> sharedAncestors = baseTree.getAncestors(sharedMember);
          		int parentMemberLevel, childMemberLevel, newMemberLevel;
          		for (PafDimMember sharedParent : sharedAncestors) {
           			parentMemberLevel = sharedParent.getMemberProps().getLevelNumber();
          			childMemberLevel = sharedChild.getMemberProps().getLevelNumber();
          			newMemberLevel = Math.max(parentMemberLevel, childMemberLevel + 1);
          			baseTree.changeMemberLevel(sharedParent, newMemberLevel);
          			sharedChild = sharedParent;
          		}
    			
           }
            
		} catch (EssException esx) {
			// throw Paf Exception
			errMsg += esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			pfe.setStackTrace(esx.getStackTrace());
			throw pfe;

		} catch (CloneNotSupportedException e) {
			// throw Paf Exception
			errMsg += e.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, e);	
			pfe.setStackTrace(e.getStackTrace());
			throw pfe;

//		} catch (Exception e) {
//			// throw Paf Exception
//			errMsg += e.getMessage();
//			logger.error(errMsg);

		} finally {
			try {
				// Close outline
				if (essCubeOutline != null) {
					EsbUtility.essCloseOutline(essCubeOutline, essNetTimeOut);
				}
			} catch (EssException esx) {
				// throw Paf Exception
				errMsg += esx.getMessage();
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
				throw pfe;
			}
		}

		// Return the fully loaded PafBaseTree
		return baseTree;
	}


	/**
	 * Add Essbase member to base tree, filtering out any invalid members and
	 * their descendants.
	 * 
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param essMember Essbase member to add 
	 * @param baseTree Base tree being appended
	 * @param essCubeOutline Essbase cube outline
	 * @param aliasTableNames Essbase alias table names
	 * @param invalidMemberNames Growing list of invalid member names
	 * 
	 * @throws EssException 
	 * @throws PafException 
	 */
	private void addEssMemberToBaseTree(int essNetTimeOut, IEssMember essMember, PafBaseTree baseTree, IEssCubeOutline essCubeOutline, 
			String[] aliasTableNames, Set<String> invalidMemberNames) throws EssException, PafException {

		addEssMemberToBaseTree(essNetTimeOut, essMember, baseTree, essCubeOutline, aliasTableNames, invalidMemberNames, false);

	}

	/**
	 * Add Essbase member to base tree, filtering out any invalid members and
	 * their descendants.
	 * 
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param essMember Essbase member to add 
	 * @param baseTree Base tree being appended
	 * @param essCubeOutline Essbase cube outline
	 * @param aliasTableNames Essbase alias table names
	 * @param invalidMemberNames Growing list of invalid member names
	 * @param isSharedOverride Indicates if child should be forcibly set to shared member
	 * 
	 * @throws EssException 
	 * @throws PafException 
	 */
	private void addEssMemberToBaseTree(int essNetTimeOut, IEssMember essMember, PafBaseTree baseTree, IEssCubeOutline essCubeOutline, 
			String[] aliasTableNames, Set<String> invalidMemberNames, boolean isSharedOverride) throws EssException, PafException {

		// Get simple properties
		String memberKey = EsbUtility.essGetMemberName(essMember, essNetTimeOut);
		String parentKey = EsbUtility.essGetParentMemberName(essMember, essNetTimeOut);

		// Skip invalid members or descendants of invalid members
		if (invalidMemberNames.contains(memberKey)) {
			// Shared occurrence of an invalid member
			return;
		}
		if (invalidMemberNames.contains(parentKey)) {
			// Descendant of an invalid member
			invalidMemberNames.add(memberKey);
			return;
		}
		if (isNonNumericMember(essMember)) {
			// Non-numeric member
			invalidMemberNames.add(memberKey);
			logger.warn("Member: [" + memberKey +"] and its descendants filtered from base tree because it is a non-numeric type.");
			return;
		}
		if (hasFormatString(essMember)) {
			// Member has format string
			logger.warn("Member: [" + memberKey +"] and its descendants filtered from base tree because it has a formatString.");
			invalidMemberNames.add(memberKey);
			return;
		}
		
		// Format new base member and add to tree
		PafBaseMember childNode = new PafBaseMember(memberKey);
		PafBaseMemberProps childMemberProps = getEsbBaseMemberProps(memberKey, essCubeOutline, essMember, aliasTableNames, essNetTimeOut);
		if (isSharedOverride) {
			childMemberProps.setShareOption(EEssShareOption.SHARED_MEMBER);
		}
		childNode.setMemberProps(childMemberProps);
		baseTree.addChild(parentKey, childNode);							
	}

	/**
	 *	Checks if Essbase member is defined with a "format string".
	 *
	 * @param essMember Essbase member
	 * 
	 * @return boolean
	 * @throws PafException 
	 */
	private boolean hasFormatString(IEssMember essMember) {

		if (getFormatStringMethod != null) {
			try {
				String formatString = (String) getFormatStringMethod.invoke(essMember);
				if (formatString != null && formatString.length() > 0){
					return true;
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
			}
		}

		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *	Checks if Essbase member is a non-numeric member.
	 *
	 * @param essMember Essbase member
	 * 
	 * @return boolean
	 * @throws PafException 
	 */
	private boolean isNonNumericMember(IEssMember essMember) {

		if (getMemberTypeMethod != null) {
			try {
				Short typeNumber = (Short) getMemberTypeMethod.invoke(essMember);
				if (typeNumber != 0){
					return true;
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
			}
		}

		// TODO Auto-generated method stub
		return false;	
	}


	/**
	 *  Create Essbase Member Generation Tree
	 *
	 * @param members Essbase members
	 * @param essNetTimeOut Essbase network timeout
	 * 
	 * @return Map<Integer, List<IEssMember>>
	 * @throws EssException
	 */
	private Map<Integer, List<IEssMember>> createEsbMemberGenTree(IEssIterator members, int essNetTimeOut) throws EssException {
		
		Map<Integer, List<IEssMember>> genTree = new TreeMap<Integer, List<IEssMember>>();
		
		for (int i = 0; i < members.getCount(); i++) {
            IEssMember member = (IEssMember)members.getAt(i);
            int gen = EsbUtility.essGetGenerationNumber(member, essNetTimeOut);
            if (!genTree.containsKey(gen)) {
            	genTree.put(gen, new ArrayList<IEssMember>());
            }
            genTree.get(gen).add(member);
        }
				
		return genTree;
	}

	
	/**
	 *	Get Essbase member properties
	 *
	 * @param member name 
	 * @param essCubeOutline Essbase outline
	 * @param essMember Essbase member
	 * @param aliasTableNames List of Essbase alias tables in corresponding database
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase properties object
	 * @throws EssException 
	 * @throws PafException 
	 */
	private PafBaseMemberProps getEsbBaseMemberProps(String memberName, IEssCubeOutline essCubeOutline, IEssMember essMember, String[] aliasTableNames, int essNetTimeOut) throws EssException, PafException {
//		aliasTableNames = new String[]{"Default"};		
		String memberAlias = null;
		PafBaseMemberProps pafBaseMemberProps = null;
		
		// Create new instance of PafBaseMemberProps
		pafBaseMemberProps = new PafBaseMemberProps();
				
		// Check for null member
		if (essMember == null) {
			String errMsg = "Null member passed to getEsbBaseMemberProps";
			logger.error(errMsg);
			throw new PafException(errMsg, PafErrSeverity.Error);
		}
		
		// Add simple Essbase properties
		pafBaseMemberProps.setGenerationNumber(EsbUtility.essGetGenerationNumber(essMember, essNetTimeOut));
		pafBaseMemberProps.setLevelNumber(EsbUtility.essGetLevelNumber(essMember, essNetTimeOut));
		pafBaseMemberProps.setMemberNumber(EsbUtility.essGetMemberNumber(essMember, essNetTimeOut));
		pafBaseMemberProps.setShareOption(EsbUtility.essGetShareOption(essMember, essNetTimeOut));

		// Add Essbase aliases
		for (String aliasTable:aliasTableNames) {
			memberAlias = EsbUtility.essGetMemberAlias(essMember, aliasTable, essNetTimeOut);
			// If no alias defined then use member name
			if (memberAlias == null || memberAlias.equals("")) {
				memberAlias = memberName;
			}
			pafBaseMemberProps.addMemberAlias(aliasTable, memberAlias);
		}

		
		// Return member properties
		return pafBaseMemberProps;
	}

	
	/**
	 *	Determine if varying attributes exist
	 *
	 * @param dims String array of dimension names
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * @param mdbProps Properties
	 * 
	 * @returns boolean
	 * @throws PafException 
	 */
	public boolean varyingAttributesExist(String[] dims, PafMdbProps mdbProps, int essNetTimeOut)throws PafException{
		String errMsg = "Error encountered when determining if varying attributes exist - ";
		IEssCubeOutline essCubeOutline = null;
		
		Method isIndependentDim = null;
		Class<?> cls = null;
	
		try {
			cls = Class.forName("com.essbase.api.metadata.IEssMember");
			isIndependentDim = cls.getMethod("isIndependentDim");
		}catch(ClassNotFoundException ex){
			//Prior to 11 there was no method
			return false;
		}catch(NoSuchMethodException ex){
			//Prior to 11 there was no method
			return false;
		}

		try {
			//Open cube outline (read-only mode)
			IEssCube essCube = esbCubeConn.getEssCube();
			essCubeOutline = EsbUtility.essOpenOutline(essCube, essNetTimeOut);
			
			for (String dim : dims){
				IEssDimension dimension = essCubeOutline.findDimension(dim);
				IEssMember root = dimension.getDimensionRootMember();
				
				try{
					Boolean independentCheck = (Boolean) isIndependentDim.invoke(root);
					if(independentCheck == true){
						return true;
					}
				}catch(InvocationTargetException ex){
					//Prior to 11 there was no method
					return false;
				}catch(IllegalAccessException ex){
					//Prior to 11 there was no method
					return false;
				}
			}
			
			for (String dim : mdbProps.getBaseDims()){
				IEssDimension dimension = essCubeOutline.findDimension(dim);
				IEssMember root = dimension.getDimensionRootMember();

				try{
					Boolean independentCheck = (Boolean) isIndependentDim.invoke(root);
					if(independentCheck == true){
						return true;
					}
				}catch(InvocationTargetException ex){
					//Prior to 11 there was no method
					return false;
				}catch(IllegalAccessException ex){
					//Prior to 11 there was no method
					return false;
				}
			}

			return false;
			
		} catch (EssException esx) {
			// throw Paf Exception
			errMsg += esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;

		}finally {
			try {
				// Close outline
				if (essCubeOutline != null) {
					EsbUtility.essCloseOutline(essCubeOutline, essNetTimeOut);
				}
			} catch (EssException esx) {
				// throw Paf Exception
				errMsg += esx.getMessage();
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
				throw pfe;
			}
		}
	}

	
				
	/**
	 *	Get Essbase related properties
	 *
	 * @param esbCubeView Essbase cube view
	 * @param essMember Essbase member
	 * @param aliasTableNames List of Essbase alias tables in corresponding database
	 * @param attrDimName Attribute dimension name
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Essbase properties object
	 * @throws PafException 
	 * @throws EssException 
	 */
	private PafAttributeMemberProps getEsbAttributeMemberProps(EsbCubeView esbCubeView, IEssMember essMember, String[] aliasTableNames, String attrDimName, int essNetTimeOut) throws PafException, EssException {
		
		String memberName = null, memberAlias = null;
		PafAttributeMemberProps pafAttributeMemberProps = null;
		
		// Create new instance of PafBaseMemberProps
		pafAttributeMemberProps = new PafAttributeMemberProps();
		
		// Add simple Essbase properties
		pafAttributeMemberProps.setConsolidationType(EsbUtility.essGetConsolidationType(essMember, essNetTimeOut));
		pafAttributeMemberProps.setGenerationNumber(EsbUtility.essGetGenerationNumber(essMember, essNetTimeOut));
		pafAttributeMemberProps.setLevelNumber(EsbUtility.essGetLevelNumber(essMember, essNetTimeOut));

		// Add Essbase aliases
		memberName = EsbUtility.essGetMemberName(essMember, essNetTimeOut);
		for (String aliasTable:aliasTableNames) {
			memberAlias = EsbUtility.essGetMemberAlias(essMember, aliasTable, essNetTimeOut);
			// If no alias is found then use member name
			if (memberAlias == null || memberAlias.equals("")) {
				memberAlias = memberName;
			}
			pafAttributeMemberProps.addMemberAlias(aliasTable, memberAlias);
		}
		
		//if this is a level 0 member, then set the base mbr propery
		if(EsbUtility.essGetLevelNumber(essMember, essNetTimeOut) == 0){
			Set<String> baseMembers = findAssociatedBaseMembers(esbCubeView, memberName, attrDimName, essNetTimeOut);
			pafAttributeMemberProps.setBaseMembers(baseMembers);
		}
		
		return pafAttributeMemberProps;
	}

	/**
	 *	Get a set of base members that are assigned to an attribute member
	 *
	 * @param esbCubeView Essbase cube view
	 * @param memberName Name of the attribute member.
	 * @param attrDimName Name of the attribute dimension.
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return A set of base members.
	 * @throws EssException 
	 */
	private Set<String> findAssociatedBaseMembers(EsbCubeView esbCubeView, String memberName, String attrDimName, int essNetTimeOut) throws EssException {
		Set<String> baseMembers = new HashSet<String>();
		String[] members = null;
		
		//create an mdx query string.
		String mdx = "SELECT Withattr([" + attrDimName + "], \"==\", \"" + 
			memberName + "\" ) ON AXIS(0)";
		//run the query string.
		members = getQueriedMembers(esbCubeView, mdx, essNetTimeOut);
		//loop thru the array and create the set.
		if(members != null){
			for(String member : members){
				baseMembers.add(member);
			}
		}

		return baseMembers;
	}
	
	/**
	 * Returns dimension information about the Essbase outline.
	 * 
	 * @return PafMdbProps object
	 * @throws PafException
	 */
	public PafMdbProps getMdbProps() throws PafException {
		IEssCubeOutline essCubeOutline = null;
		IEssDimension essDim = null;
		PafMdbProps pafMdbProps = new PafMdbProps();
		ArrayList<String> attributeDims = new ArrayList<String>();
		ArrayList<String> baseDims = new ArrayList<String>();
		Map<String,String> baseDimLookup = new HashMap<String,String>();
		
		try {
			// Open cube outline (read-only mode)
			IEssCube essCube = esbCubeConn.getEssCube();
			essCubeOutline = essCube.openOutline();
			
			//Iterate through dims
			IEssIterator dimIter = essCubeOutline.getDimensions();
			for (int i = 0; i < dimIter.getCount(); i++) {
				essDim = (IEssDimension)dimIter.getAt(i);
				//check to see if the dim is an attribute, if not it's a base dim.
				if(essDim.getCategory() == IEssDimension.EEssDimensionCategory.ATTRIBUTE){
					attributeDims.add(essDim.getName());	
				}else if(essDim.getCategory() != IEssDimension.EEssDimensionCategory.ATTRIBUTE_CALC){
					//add the base dim name to the list.
					baseDims.add(essDim.getName());
					//get the base member, from the outline.
					IEssMember baseMbr = essCubeOutline.findMember(essDim.getName());
					//get a list of it's associated attributes, and add them to the map.
					IEssIterator asocAtrIter = baseMbr.getAssociatedAttributes();
					if(asocAtrIter != null){
						for(int j = 0; j < asocAtrIter.getCount(); j++){
							IEssMember attrMbr = (IEssMember)asocAtrIter.getAt(j);
							baseDimLookup.put(attrMbr.getName(), baseMbr.getName());
						}
					}
				}
			}	
			
			// Create baseDim lookup, taking the map apart so it can pass thru WSDL.
			pafMdbProps.setBaseDimLookupKeys(baseDimLookup.keySet().toArray(new String[0]));
			pafMdbProps.setBaseDimLookupValues(baseDimLookup.values().toArray(new String[0]));
			//set the alias table names.
			pafMdbProps.setAliasTables(essCubeOutline.getAliasTableNames());
			//set the attribute dimensions
			pafMdbProps.setAttributeDims(attributeDims.toArray(new String[0]));
			//set the base dimension names.
			pafMdbProps.setBaseDims(baseDims.toArray(new String[0]));

			return pafMdbProps;
			
		} catch (EssException esx) {
			// Essbase error - throw Paf Exception
			logger.error(esx.getMessage());
			PafException pfe = new PafException(esx.getMessage(), PafErrSeverity.Error, esx);	
			throw pfe;
			
		} finally {
			try {
				// Close outline
				if (essCubeOutline != null) {
					essCubeOutline.close();
				}
			} catch (EssException esx) {
				// Essbase error - throw Paf Exception
				logger.error(esx.getMessage());
				PafException pfe = new PafException(esx.getMessage(), PafErrSeverity.Error, esx);	
				throw pfe;
			}
		}
	}

	/**
	 *	Get the list of Essbase members matching the specified single-axis mdx query
	 *
	 * @param esbCubeView Essbase cube view
	 * @param mdxSelect Mdx select statement
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return List of Essbase members
	 * @throws EssException 
	 */
	public String[] getQueriedMembers(EsbCubeView esbCubeView, String mdxSelect, int essNetTimeOut) throws EssException {
		return getQueriedMembers(esbCubeView, mdxSelect, "", essNetTimeOut);
	}

	/**
	 *	Get the list of Essbase members matching the specified single-axis mdx query
	 *
	 * @param esbCubeView 
	 * @param mdxSelect Mdx select statement
	 * @param mdxWhere Mdx where statement
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return List of Essbase members
	 * @throws EssException 
	 */
	public String[] getQueriedMembers(EsbCubeView esbCubeView, String mdxSelect, String mdxWhere, int essNetTimeOut) throws EssException {

		String[] members = null;

		int axisCount = 0, dimCount = 0, memberCount = 0;
		String esbApp = null, esbDb = null;
		String mdxFrom = null, mdxQuery = null;

		IEssMdAxis memberAxis = null;
		IEssMdAxis[] axes = null;
		IEssMdDataSet essMdDataSet = null;
		IEssMdMember[] essMdMembers = null;

		logger.debug("Preparing meta-data query: " + mdxSelect + " " + mdxWhere);        

		// Run mdx query with the "Dataless" option set to true. 
		esbApp = esbCubeView.getEsbApp();
		esbDb = esbCubeView.getEsbDb(); 
		mdxFrom = " FROM " + esbApp + "." + esbDb;
		mdxQuery = mdxSelect + mdxFrom + mdxWhere; 
		logger.debug("Running meta-data query: " + mdxQuery);
		essMdDataSet = esbCubeView.runMdxQuery(mdxQuery, true, false, essNetTimeOut);
		

		// Determine basic result set statistics.
		axes = essMdDataSet.getAllAxes();
		memberAxis = axes[1];
		axisCount = axes.length;

		// Check for an axis count greater than 2 (Axis 0 will be reservered for unused dimensions)
		if (axisCount > 2) {
			// Throw Illegal Argument Exception
			String errMsg = "Illegal meta-data query - More than 1 axis specified";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);	
			throw iae;
		}

		// Check for more than one dimension in returned tuples
		dimCount = memberAxis.getDimensionCount();
		if (dimCount > 1) {
			// Throw Illegal Argument Exception
			String errMsg = "Illegal meta-data query - More than 1 dimension specified";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);	
			throw iae;
		}

		// Get list of members
		memberCount = memberAxis.getTupleCount();
		logger.debug("Members returned from meta-data query: " + memberCount);
		members = new String[memberCount];
		for (int i = 0; i < memberCount; i++) {		
			essMdMembers = memberAxis.getAllTupleMembers(i);
			members[i] = essMdMembers[0].getName();
		}

		return members;

	}

	/**
	 * Disconnect from Essbase
	 * 
	 * @throws PafException  
	 */
	public void disconnect() throws PafException {
		
		// Clean-up any open connections
		esbConnMgr.cleanup();
		esbConnMgr = null;
		
	}

}