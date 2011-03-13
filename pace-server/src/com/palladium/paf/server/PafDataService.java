/*
 *  File: @(#)PafDataService.java   Package: com.pace.base.server  Project: PafServer
 *  Created: Jun 26, 2005        By: JWatkins
 *  Version: x.xx
 *
 *  Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Palladium Group, Inc.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Palladium Group, Inc.
 *
 *
 *
 Date            Author          Version         Changes
 xx/xx/xx        xxxxxxxx        x.xx            ..............
 * 
 */
package com.palladium.paf.server;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.*;
import com.pace.base.comm.EvaluateViewRequest;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.data.ExpOperation;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.data.PafDataSlice;
import com.pace.base.db.Application;
import com.pace.base.db.SecurityGroup;
import com.pace.base.mdb.*;
import com.pace.base.rules.RuleSet;
import com.pace.base.state.EvalState;
import com.pace.base.state.PafClientState;
import com.pace.base.state.SliceState;
import com.pace.base.utility.*;
import com.pace.base.view.*;
import com.palladium.paf.eval.IEvalStrategy;
import com.palladium.paf.eval.PafDataSliceCacheCalc;
import com.palladium.paf.eval.RuleBasedEvalStrategy;


/**
 * This class is the gate keeper to all data services. It holds a 
 * hash table of data caches by client id.
 *
 * @version x.xx
 * @author JWatkins
 *
 */

public class PafDataService {
	private static Logger logger = Logger.getLogger(PafDataService.class);

	private static PafDataService _instance = null;
	private ConcurrentHashMap <String, PafUowCache> uowCache = new ConcurrentHashMap <String, PafUowCache>();
	private Map <String, PafBaseTree> baseTrees = new HashMap<String, PafBaseTree>();
	private Map <String, PafAttributeTree> attributeTrees = new HashMap<String, PafAttributeTree>();
//	private HashMap<String, HashMap<String, Integer>> memberIndexLists = new HashMap<String, HashMap<String, Integer>>();
//	private Map <String, HashMap<String,PafBaseTree>> uowCacheSubTrees = new HashMap<String, HashMap<String,PafBaseTree>>();
	private Map <String, Set<Intersection>> systemLockedIntersections = new HashMap<String, Set<Intersection>> ();

	/**
	 *	Load uow cache for selected client state, application definition, and unit-of-work
	 *
	 * @param clientState Client state
	 * @param appDef Application definition
	 * @param uow Unit of work
	 * 
	 * @throws PafException
	 */
	public void loadUowCache(PafClientState clientState, PafApplicationDef appDef, UnitOfWork uow) throws PafException {
		String clientId = clientState.getClientId();
		logger.info("Loading uow cache for client: " + clientId);
		logger.info("Unit of Work: " + uow.toString() );

		// at this point save the connection props for this application id into the client state
		String dsId = appDef.getMdbDef().getDataSourceId();
		IPafConnectionProps connProps = (IPafConnectionProps) PafMetaData.getAppContext().getBean(dsId);
		clientState.getDataSources().put(dsId, connProps);

//		TTN-1406
//		IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//		IMdbData mdbData = mdbClassLoader.getMdbDataProvider();
		IMdbData mdbData = getMdbDataProvider(connProps);
		//Convert unit of work to a Map
		Map<Integer, List<String>> expandedUow = new HashMap<Integer, List<String>>();
		int i = 0;
		for (String dim : uow.getDimensions()){
			expandedUow.put(i++, Arrays.asList(uow.getDimMembers(dim)));	
		}
		
		//Map<Integer, List<String>> expandedUow = expandUow(uow, clientState);


		//BEGIN - TTN-584
		// create empty locked time set
		Set<String> lockedTimeSet = new HashSet<String>();

		// if paf planner is stetup to not calculate elapsed periods

		if ( ! clientState.getPlannerConfig().isCalcElapsedPeriods() ) {

			logger.info("Calculate Elapsed Periods: " + clientState.getPlannerConfig().isCalcElapsedPeriods());

			//get current planning version
			String currentVersion = clientState.getPlanningVersion().getName();

			//if current planning version exists
			if ( currentVersion != null ) {

				//get verstion type map.
				Map<String, VersionType> versionsTypeMap = PafMetaData.getVersionTypeMap();

				//if version type map contains planning version
				if ( versionsTypeMap != null && versionsTypeMap.containsKey(currentVersion) ) {

					//get version type
					VersionType versionType = versionsTypeMap.get(currentVersion);

					//if version type is foward plannable, check to see if in current year
					if ( versionType != null && versionType.equals(VersionType.ForwardPlannable)) {

						PafApplicationDef pafApp = clientState.getApp(); 

						//get elapsed year
						String elapsedYear = pafApp.getCurrentYear();

						//get year dimension name
						String yearDim = pafApp.getMdbDef().getYearDim();

						//get year members, should only be 1
						String[] yearMembers = clientState.getUnitOfWork().getDimMembers(yearDim);

						//if year members exists and there are more then 0
						if ( yearMembers != null && yearMembers.length > 0) {

							//get 1st year member
							String yearMember = yearMembers[0]; 

							//see if uow year member equals elapsed year member and if so, get locked time members
							if ( yearMember.equalsIgnoreCase(elapsedYear) ) {

								lockedTimeSet.addAll(PafAppService.getInstance().getLockedList(clientState));

							}

						}
					}

				}

			}            

		}        
		//END - TTN-584


		PafUowCache cache = mdbData.getUowCache(expandedUow, appDef, new String[]{ clientState.getPlanningVersion().getName()}, lockedTimeSet);          
		uowCache.put(clientId, cache);           

		logger.info("Data cache loaded, cached object count: " + uowCache.size());

	}


	/**
	 * Refresh selected versions of the client's current uow cache. If a null 
	 * or empty version filter is specified, then all versions will be updated.
	 * 
	 * @param clientState Client state
	 * @param appDef Application definition
	 * @param unitOfWork Unit of work
	 * @param versionFilter Versions to update
	 *
	 * @return List of updated versions
	 * @throws PafException 
	 */
	public List<String> refreshUowCache(PafClientState clientState,PafApplicationDef appDef, UnitOfWork uow, 
			List <String> versionFilter) throws PafException {
	
		List<String> validatedVersionFilter = new ArrayList<String>();
		List<String> updatedVersions = null;
	
		// Get client id
		String clientId = clientState.getClientId();

		// Get uow cache
//		PafUowCache cache = mdbData.getUowCache(expandedUow, appDef, new String[]{ clientState.getPlanningVersion().getName()}, lockedTimeSet);          
		logger.info("Updating uow cache for client: " + clientId);
		PafUowCache cache = uowCache.get(clientId);         
		if (cache == null) {
			throw new IllegalArgumentException("Uow cache not found for client: [" + clientId + "]");
		}
		
		// Validate version filter, resolving tokens and case differences
		if (versionFilter != null && versionFilter.size() > 0) {
			String planVersion = cache.getActiveVersions()[0];
			String versionDim = cache.getVersionDim();
			StringBuffer foundVersion = new StringBuffer(); 
//			validatedVersionFilter = new String[versionFilter.length];
			for (String version : versionFilter) {
				// Check for plan version token and resolve it
				if (version.equalsIgnoreCase(PafBaseConstants.PLAN_VERSION)) {
					validatedVersionFilter.add(planVersion);
				} else {
					// Validate filter version, ignoring case
					if (cache.isMemberIgnoresCase(versionDim, version, foundVersion)) {
						validatedVersionFilter.add(foundVersion.toString());
					} else {
						throw new IllegalArgumentException("Illegal filter version: [" + version + "] is not contained in the unit of work.");
					}
				}
			}
		}
		
		//Convert unit of work to a Map
		Map<Integer, List<String>> expandedUow = new HashMap<Integer, List<String>>();
		int i = 0;
		for (String dim : uow.getDimensions()){
			expandedUow.put(i++, Arrays.asList(uow.getDimMembers(dim)));	
		}
		
		// Get mdb data provider corresponding to application data source id
		String dsId = appDef.getMdbDef().getDataSourceId();
//		IPafConnectionProps connProps = (IPafConnectionProps) PafMetaData.getAppContext().getBean(dsId);
		IPafConnectionProps connProps =	clientState.getDataSources().get(dsId);
		IMdbData mdbData = getMdbDataProvider(connProps);
// 		TTN-1406
//		IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//		IMdbData mdbData = mdbClassLoader.getMdbDataProvider();
		
		// Update filtered versions
		updatedVersions = mdbData.refreshDataCache(cache, expandedUow, validatedVersionFilter);
		logger.info("Data cache updated for versions: " + StringUtils.listToString(validatedVersionFilter));
		logger.info("Cached object count: " + uowCache.size());

		return updatedVersions;
	}

	/**
	 * Create an ordered list of year members
	 * 
	 * 
	 * @return list of year members
	 */
	/*
	private List<String> getListofYearMembers(String yearDim) {

		PafBaseTree yearTree = PafDataService.getInstance().getBaseTree(yearDim);

		List<PafDimMember> yearTreeList = yearTree.getMembersAtLevel(yearTree
				.getRootNode().getKey(), (short) 0);

		List<String> yearTreeStrList = null;

		if (yearTreeList != null) {

			yearTreeStrList = new ArrayList<String>(yearTreeList.size());

			for (PafDimMember member : yearTreeList) {
				yearTreeStrList.add(member.getKey());
			}

		}

		return yearTreeStrList;
	}
	 */

	/**
	 *	Expand out the members in a unit of work using the base trees
	 *
	 * @param uow Unit of work object
	 * @param clientState Client state object
	 * 
	 * @return Hash Map containing the expanded members for each dimension
	 * @throws PafException 
	 */
	private Map<Integer, List<String>> expandUow(UnitOfWork uow, PafClientState clientState) throws PafException {

		int axis = 0;
		String versionDim = clientState.getApp().getMdbDef().getVersionDim();
		String[] terms = null;
		Map<Integer, List<String>> expandedUow = new HashMap<Integer, List<String>>();

		// Get the list of expanded members for each dimension
		for (String dim : uow.getDimensions() ) {
			terms = uow.getDimMembers(dim);
			List<String> members = new ArrayList<String>();
			for (String term : terms) {
				members.addAll(Arrays.asList(expandExpression(term, true, dim, null)));
			}
			// Special logic for version dimension - filter out version dimension root
			// and any derived versions
			if (dim.equalsIgnoreCase(versionDim)) {
				members.remove(versionDim);
				members.removeAll(clientState.getApp().getDerivedVersions());     	
			}
			expandedUow.put(axis++, members);
		}
		return expandedUow;
	}
	
	
	/**
	 *	Expand out the members in a unit of work uing the base trees
	 *
	 * @param uow Unit of work object
	 * @param clientState Client state object
	 * 
	 * @return UnitOfWork containing the expanded members for each dimension
	 * @throws PafException 
	 */
	public UnitOfWork expandUOW(UnitOfWork uow, PafClientState clientState) throws PafException{
		//Call expandUOW
		Map<Integer, List<String>> expandedUow = this.expandUow(uow, clientState);
		
		String[] dimensions = new String[expandedUow.size()];
		String[][] dimensionMembers = new String[expandedUow.size()][];

		for(Integer axisIndex : expandedUow.keySet()){
			dimensions[axisIndex] = uow.getAxisIndices().get(axisIndex);
			
			dimensionMembers[axisIndex] = expandedUow.get(axisIndex).toArray(new String[0]);
		}

		return new UnitOfWork(dimensions, dimensionMembers);
	}

	public PafBaseMember getUowRoot(PafClientState clientState, String dim, UnitOfWork uow) {
		TreeMap<Integer, ArrayList<PafBaseMember>> treeMap = getMembersByLevel(clientState, dim);
		PafBaseMember root = treeMap.get(treeMap.lastKey()).get(0);
		return root;
	}

	/**
	 *	Method_description_goes_here
	 *
	 * @param clientId 
	 * @param dim 
	 * 
	 * @return TreeMap<Integer, ArrayList<PafBaseMember>>
	 */
	public TreeMap<Integer, ArrayList<PafBaseMember>> getMembersByLevel(PafClientState clientState, String dim) {

		TreeMap<Integer, ArrayList<PafBaseMember>> membersByLevel = new TreeMap<Integer, ArrayList<PafBaseMember>>();
		PafBaseMember memberDtl;
		int lvl;

		//PafUowCache cache = uowCache.get(clientId);
		PafBaseTree dimTree = baseTrees.get(dim);

		//String[] dimMembers = cache.getAxisMembers(cache.getAxisIndex(dimTree.getRootNode().getKey()));
		String[] dimMembers = clientState.getUnitOfWork().getDimMembers(dimTree.getRootNode().getKey());

		for (String member : dimMembers) {
			memberDtl = dimTree.getMember(member);
			lvl =  memberDtl.getMemberProps().getLevelNumber();
			if (!membersByLevel.containsKey(lvl)) {
				membersByLevel.put(lvl, new ArrayList<PafBaseMember>());
			}
			membersByLevel.get(lvl).add(memberDtl);  
		}       

		return membersByLevel;
	}

	/**
	 *  Return a tree map of members organized by generation
	 *  
	 * @param dim UOW Dimension
	 * @param dimMembers UOW dimension members
	 * @param isVersionDim Indicates if selected dimension is the "Version" dimension.
	 *
	 * @return TreeMap<Integer, ArrayList<PafBaseMember>>
	 * @throws PafException 
	 */
	private TreeMap<Integer, List<PafBaseMember>> getMembersByGen(String dim, String[] dimMembers, MdbDef mdbDef ) throws PafException {

		TreeMap<Integer, List<PafBaseMember>> membersByGen = new TreeMap<Integer, List<PafBaseMember>>();
		PafBaseTree dimTree = null;
		PafBaseMember memberDtl = null;
		DimType dimType = null;
		int gen = 0;

		// Determine the dimension type (TTN-1347)
		dimType = mdbDef.getDimType(dim);

		// Get base tree for selected dimension in order to look up generation
		// property by member. 
		dimTree = baseTrees.get(dim);
		
		// To support shared hierarchies, we need to get a subtree that only contains
		// the branch that is part of the selected UOW. We need to weed out multiple
		// occurrences of the same member, so that we can get the correct generation
		// properties of the members that make up the UOW. (TTN-1347)
		//
		// This logic only applies to hierarchy, measure, or time dimensions that
		// contain shared members.
		//
		if (dimTree.hasSharedMembers() &&
				(dimType == DimType.Hier || dimType == DimType.Measure || dimType == DimType.Time) ) {
			
			// Determine which dimension member is the intended root of the UOW branch
			String root = null;
			if (dimType != DimType.Measure) {
				// Look for candidate root by first discounting any shared members
				Set<String> candidateRoots = new HashSet<String>(Arrays.asList(dimMembers));
				Set<String> sharedMemberNames = dimTree.getSharedMemberNames();
				candidateRoots.removeAll(sharedMemberNames);

				// Root is the non-shared member with lowest generation (if all UOW members
				// in dimension are shared then no pruning is needed).
				int lowestGen = 9999;
				for (String candidateRoot : candidateRoots) {
					PafDimMember candidateRootMember = dimTree.getMember(candidateRoot);
					int candidateGen = candidateRootMember.getMemberProps().getGenerationNumber();
					if (candidateGen  < lowestGen) {
						lowestGen = candidateGen;
						root = candidateRoot;
					}
				}

			} else {
				// Measure dimension - use the measure root
				root = mdbDef.getMeasureRoot();
			}

			// Prune tree (if root was found)
			if (root != null) {
				dimTree = dimTree.getSubTreeCopy(root);
			}
		}
		
		// Build tree map
		for (String member : dimMembers) {
			memberDtl = dimTree.getMember(member);
			gen =  memberDtl.getMemberProps().getGenerationNumber();
			if (!membersByGen.containsKey(gen)) {
				membersByGen.put(gen, new ArrayList<PafBaseMember>());
			}
			membersByGen.get(gen).add(memberDtl);  
		}       

		// "Special" logic for version dimension. Add in version dimension root 
		//  as it is not contained in the data cache
		if (dimType == DimType.Version) {
			PafBaseMember versionRoot = dimTree.getRootNode();
			gen = versionRoot.getMemberProps().getGenerationNumber();
			membersByGen.put(gen, new ArrayList<PafBaseMember>());
			membersByGen.get(gen).add(versionRoot);  
		}

		// Return generation map
		return membersByGen;
	}    



	/**
	 *	Method_description_goes_here
	 *
	 * @param clientId
	 * @return Set<Intersection>
	 */
	public Set<Intersection> getSystemLockedIntersections(String clientId) {
		return systemLockedIntersections.get(clientId);
	}

	/**
	 *	Method_description_goes_here
	 *
	 * @param clientId
	 * @param isSet
	 */
	public void setSystemLockedIntersections(String clientId, Set<Intersection> isSet) {
		systemLockedIntersections.put(clientId, isSet); 
	}


	/**
	 *	Creates a copy of a tree based upon the UOW specification
	 *
	 * @param clientId
	 * @param dim
	 * @param optionalWorkUnit
	 * @return PafBaseTree
	 * @throws PafException 
	 */
	private PafBaseTree calculateDataCacheSubTree(PafClientState clientState, String dim, UnitOfWork optionalWorkUnit) throws PafException {

		PafBaseTree baseTree, copy;
		MdbDef mdbDef = clientState.getMdbDef();
		String measureDim = mdbDef.getMeasureDim();
		String versionDim = mdbDef.getVersionDim();
		String[] mbrNames = null;
		
		//Get the dimension members.  Use the optional workUnit parameter if it is not null
		if(optionalWorkUnit != null){
			mbrNames = optionalWorkUnit.getDimMembers(dim);
		}
		else{
			mbrNames = clientState.getUnitOfWork().getDimMembers(dim);
		}

		// Version dimension special logic - Prune out any shared members and versions
		// not contained in the version filter. 
		baseTree = baseTrees.get(dim);
		if (dim.equalsIgnoreCase(versionDim)) {
			
			//get version filters from client state
			String[] versionFilters = clientState.getPlannerConfig().getVersionFilter();

			//get tree
			TreeMap<Integer, List<PafBaseMember>> treeMap = getMembersByGen(dim, mbrNames, mdbDef);
			PafBaseMember root = treeMap.get(treeMap.firstKey()).get(0);
			PafBaseTree tree = baseTree.getSubTreeCopyByGen(root.getKey(), root.getMemberProps().getLevelNumber() + 1);
			
			//remove any shared members / branches
			List<PafDimMember> members = tree.getMembers(TreeTraversalOrder.PRE_ORDER);
			for (PafDimMember member : members) {
				if (member.isShared()) {
					tree.removeBranch(member);
				}
			}
			
			//if version filters is not null and versions exists
			if ( versionFilters != null && versionFilters.length > 0) {
				
				//create version Filter set
				Set<String> versionFilterSet = new HashSet<String>(Arrays.asList(versionFilters));
	
				//get all descendants of tree from level0 -> level #
				ArrayList<PafDimMember> descendantsOfTree = tree.getIDescendants(root.getKey(), false);
							
				//for each member, see if in version filter set, if not and doesn't have children remove it
				for ( PafDimMember branchMember : descendantsOfTree ) {
					String branchMemberName = branchMember.getKey();					
					if ( ! versionFilterSet.contains(branchMemberName)) {					
						if ( ! branchMember.hasChildren() ) {						
							tree.removeBranch(branchMemberName);				
						}						
					}				
						}
					}
					
			// Return version tree
			return tree;
		}
		
		// All other dimensions - Start out by making a tree copy
		SortedMap<Integer, List<PafBaseMember>> treeMap = getMembersByGen(dim, mbrNames, mdbDef);
		PafBaseMember root = treeMap.get(treeMap.firstKey()).get(0);
		if (baseTree.hasSharedMembers()) {
			// Shared members exist, get whole branch since generations on 
			// shared members may be higher than original member
			copy = baseTree.getSubTreeCopy(root.getKey());	
		} else {
			// No shared members, safely pull down to highest generation 
			// in the UOW
			copy = baseTree.getSubTreeCopyByGen(root.getKey(), treeMap.lastKey());			
		}

		// build list of members in the cache, use hash set for quick find
		List<String>cacheMbrs = new ArrayList<String>(); 
		cacheMbrs.addAll(Arrays.asList(mbrNames));

//		// build copy of tree members for traversal, to allow removal
//		// get copy in generation order to prune from top to bottom
//		// resolves certain issues with shared members and is more efficient.
//		List<PafDimMember> treeMbrs = new ArrayList<PafDimMember>();
//		SortedMap<Integer, List<PafDimMember>>treeGen = copy.getMembersByGen();
//		
//		for (int gen : treeGen.keySet() ) {
//			for (PafDimMember m : treeGen.get(gen)) {
//				treeMbrs.add(m);
//			}
//		}

		// Prune invalid and duplicate members from tree. The member
		// search list must be initialized via a tree traversal since 
		// shared members aren't contained in the members hash map or 
		// generation & level collections. A pre-order traversal is used 
		// to ensure that we process the nodes in top-down, left-right, order.
		List<PafDimMember> treeMembers = copy.getMembers(TreeTraversalOrder.PRE_ORDER);
		Set<String> uniqueMembers = new HashSet<String>();
		PafDimMember parent;
		String memberName;
		for (PafDimMember member : treeMembers ) {
			// If this is a valid member, leave the member in the tree,
			// unless it is a duplicate occurrence.
			memberName = member.getKey();
			if (cacheMbrs.contains(memberName)) {
				
				// Check for discontiguous tree error
				if (!copy.hasMember(memberName)) {
					String errMsg = "Error encountered generating the unit of work tree: [" + dim
						+ "]. The required member: [" + memberName + "] is missing from the uow tree. "
						+ " One possibility is that a discontiguous [" + dim
						+ "] tree was defined";
					if (dim.equalsIgnoreCase(measureDim)) {
						errMsg += " via Rule Set Measure Filters.";
					} else {
						errMsg += ".";
					}
					logger.error(errMsg);
//					throw new PafException(errMsg, PafErrSeverity.Error);
				}
				
				// Check if member is duplicate
				if (!uniqueMembers.contains(memberName)) {
					// First occurrence
					uniqueMembers.add(memberName);
				} else {
					// Remove duplicate member / branch
					parent = member.getParent();
					copy.removeBranch(member);
					logger.warn("Duplicate member [" + memberName + "] removed from unit of work tree: " + dim);
					// Remove any branches that were comprised solely
					// of duplicates and their ancestors.
					copy.pruneAncestors(parent);
				}
				
			} else {
				// Remove invalid member / branch
				copy.removeBranch(member);
			}
			
		}

				
		// TODO: Document/rework issues around measures as a tree.
		// nastiness: the measures dimension allows for a "filtered subset of members in the tree".
		// this is not normally allowed (for instance you can't have weeks 1,2 and 4 along with January
		// Fix: if measures dimension prune back off all members that aren't in the current datacache
//		if (dim.trim().equals(measureDim)) {
//		String[] cacheMsrs = uowCache.get(clientId).getDimMembers(measureDim);
//		List<String> treeMsrs = new ArrayList<String>();  
//		treeMsrs.addAll(Arrays.asList(copy.getMemberKeys()));
//		List<String> cacheMsrList = Arrays.asList(cacheMsrs);
//		for (String msrName : treeMsrs) {
//		if (!cacheMsrList.contains(msrName))
//		copy.removeBranch(msrName);
//		}
//		}        


		return copy;
	}



	/**
	 *	Get uow cache for select client state id                                                                          
	 *
	 * @param clientId Client state id                                                                                                                                
	 * @return PafUowCache
	 */
	public PafUowCache getUowCache(String clientId) {
		logger.info("Getting data cache for client: " + clientId);    
		logger.info("Current cached object count: " + uowCache.size());
		return uowCache.get(clientId);
	}
	
	/**
	 *	Get trees associated with the UOW                                                                                         
	 *
	 * @param clientState Client state id
	 * @return MemberTreeSet Collection of member trees
	 * 
	 * @throws PafException 
	 */
	public MemberTreeSet getUowCacheTrees(PafClientState clientState) throws PafException {
		return getUowCacheTrees(clientState, null);
	}

	/**
	 *	Get trees associated with the UOW                                                                                         
	 *
	 * @param clientState Client state id
	 * @param optionalWorkUnit Unit of Work
	 * 
	 * @return MemberTreeSet Collection of member trees
	 * @throws PafException 
	 */
	public MemberTreeSet getUowCacheTrees(PafClientState clientState, UnitOfWork optionalWorkUnit) throws PafException {

		//PafUowCache cache  = uowCache.get(clientState.getClientId());
		MemberTreeSet treeSet = new MemberTreeSet();
	
		//Base Dimensions
		for (String dim : clientState.getUnitOfWork().getDimensions() ) {
			treeSet.addTree(dim, calculateDataCacheSubTree(clientState, dim, optionalWorkUnit));
		}

		//Attribute Dimensions
		Set<String> attributeDims = getAttributeTrees().keySet();
		for (String dim : attributeDims){
			treeSet.addTree(dim, getDimTree(dim));
		}

		return treeSet;
	}

	/**
	 *	Get the memberIndexLists for the specified member tree set
	 *
	 * @param treeSet Member tree set
	 * @return Map<String, HashMap<String, Integer>>
	 */
	protected Map<String, HashMap<String, Integer>> getUowMemberIndexLists(MemberTreeSet treeSet) {
		
		// Create member index lists on each dimension - used to sort allocation
		// intersections in evaluation processing (TTN-1391)
		Map<String, HashMap<String, Integer>> memberIndexLists = new HashMap<String, HashMap<String, Integer>>();
		for (String dim : treeSet.getTreeDimensions()) {
			PafDimTree uowTree = treeSet.getTree(dim);
			memberIndexLists.put(dim, createMemberIndexList(uowTree, TreeTraversalOrder.PRE_ORDER));
		}
		return memberIndexLists;
	}

	/**
	 *	Return the data slice corresponding to the specified view section
	 *
	 * @param view Client view
	 * @param viewSection Client view section
	 * @param clientState Client state object
	 * 
	 * @return Paf Data Slice
	 * @throws PafException
	 */
	public PafDataSlice getDataSlice(PafView view, PafViewSection viewSection, PafClientState clientState, boolean compressData) throws PafException {

		String stepDesc = null;
		long startTime = 0;
		PafDataSlice dataSlice = null;
		PafDataSliceParms sliceParms = null;
		UnitOfWork sliceCacheSpec = null;
		PafMVS pafMVS = null;

		// If view section is empty, then send back dummy data slice
		if (viewSection.isEmpty()) {
			dataSlice = new PafDataSlice(new double[0], 1);
			return dataSlice;
		}

		// Get data cache and app def
		String clientId = clientState.getClientId();
		PafDataCache uowCache = getUowCache(clientId);
		PafApplicationDef appDef = clientState.getApp();
		String versionDim = appDef.getMdbDef().getVersionDim();

		// Check if data cache is initialized
		if (uowCache == null) {
			String errMsg = "No uow cache initialized for client: " + clientId;
			logger.fatal(errMsg);
			throw new PafException(errMsg, PafErrSeverity.Fatal);
		}

		// Get uow trees
		MemberTreeSet memberTrees = clientState.getUowTrees();
		if (memberTrees == null) {
			String errMsg = "No member trees initialized for client: " + clientId;
			logger.fatal(errMsg);
			throw new PafException(errMsg, PafErrSeverity.Fatal);
		}

		// Get "Materialized View Section" catalog
		pafMVS = clientState.getMVS(PafMVS.generateKey(view, viewSection));
		if (pafMVS == null) { 
			String errMsg = "Missing materialized view section for client: [" 
				+ clientId + "] - view: [" + view.getName() + "] - view section: [" 
				+ viewSection.getName() + "]";
			throw new PafException(errMsg, PafErrSeverity.Fatal);
		}

		// Build data slice parameters
		sliceParms = buildDataSliceParms(viewSection);
		pafMVS.setDataSliceParms(sliceParms);

		// Build data slice cache spec
		sliceCacheSpec = buildDataSliceCacheSpec(sliceParms, viewSection, uowCache, clientState);
		pafMVS.setDataSliceCacheParms(sliceCacheSpec);

		// Build data slice cache
		logger.debug("Building the data slice cache...");
		PafDataSliceCacheParms sliceCacheParms = new PafDataSliceCacheParms();
		sliceCacheParms.setDataSliceCacheSpec(sliceCacheSpec);
		sliceCacheParms.setPafMVS(pafMVS);
		sliceCacheParms.setUowCache(uowCache);
		PafDataCache dsCache = new PafDataSliceCache(sliceCacheParms);
		pafMVS.setDataSliceCache(dsCache);

		// Calculate attribute intersections in base versions
		if (viewSection.hasAttributes()) {

			// Ensure that all selected attribute dimensions for a given
			// base dimension are mapped to the same level
			Set<String> viewAttributes = new HashSet<String>();
			viewAttributes.addAll(Arrays.asList(viewSection.getAttributeDims()));
			for (String baseDimName:getBaseDimNames()) {

				// Get attributes for current base dimension that appear in view section
				PafBaseTree baseTree = getBaseTree(baseDimName);
				Set<String> associatedAttrDims = new HashSet<String> (baseTree.getAttributeDimNames());
				associatedAttrDims.retainAll(viewAttributes);

				// Check attribute mapping levels for each attribute dimension.
				// They all need to be at the same level.
				Set<Integer> mappingLevels = new HashSet<Integer>(); 
				for (String attributeDim:associatedAttrDims) {
					mappingLevels.add(baseTree.getAttributeMappingLevel(attributeDim));
				}
				if (mappingLevels.size() > 1) {
					String errMsg = "Unable to populate view section: [" + viewSection.getName()
					+ "] - all attribute dimensions of [" + baseDimName 
					+ "] are not mapped to the same base member level";
					logger.error(errMsg);
					PafException pfe = new PafException(errMsg, PafErrSeverity.Error);
					throw(pfe);
				}

			}

			// Compute attribute intersections (on non-calculated versions only)
			stepDesc = "Attribute aggregation and recalc";
			startTime = System.currentTimeMillis();
			Map<String, List<String>> versionFilter = new HashMap<String, List<String>>();
			List<String> baseVersions = dsCache.getBaseVersions();
			versionFilter.put(versionDim, baseVersions);
			dsCache = PafDataSliceCacheCalc.calcAllAttributeIntersections((PafDataSliceCache) dsCache, uowCache, clientState, versionFilter);
			logger.info(LogUtil.timedStep(stepDesc, startTime));				
		}

		// Calculate any derived versions in data slice cache
		stepDesc = "Version dim calculation";
		startTime = System.currentTimeMillis();
		dsCache = PafDataSliceCacheCalc.calcVersionDim(dsCache, memberTrees);
		logger.info(LogUtil.timedStep(stepDesc, startTime));

		// Get data slice corresponding to this view section
		dataSlice = dsCache.getDataSlice(sliceParms);

		if (compressData == true){
			// compress slice for return.
			try {
				dataSlice.compressData();
			}
			catch (IOException iox) {
				throw new PafException(iox.getLocalizedMessage(), PafErrSeverity.Error);
			}
		}

		// Return dataSlice
		return dataSlice;
	}

	/**
	 * Build the necessary parms for generating a data slice
	 *
	 * @param section View sections
	 * @return PafDataSliceParms
	 */
	protected PafDataSliceParms buildDataSliceParms(final PafViewSection section) {
		
		/*
		 * Omit member tags and paf blanks from data slice parms
		 */
		
		logger.info("Building Data Slice Parms ...");
		// Build data slice parms
		PafDataSliceParms sliceParms = new PafDataSliceParms();
		logger.debug("Building Data Slice Parms - Setting Column Dimensions");
		sliceParms.setColDimensions(section.getColAxisDims());

		logger.debug("Building Data Slice Parms - Setting Row Dimensions");
		sliceParms.setRowDimensions(section.getRowAxisDims());

		ArrayList<String[]> memberLists = null;
		int i = 0;
		logger.debug("Building Data Slice Parms - Setting Row Members");        
		memberLists = new ArrayList<String[]>();
		for (ViewTuple tuple : section.getRowTuples() ) {
//			if (!tuple.getMemberDefs()[0].toUpperCase().equals(PafBaseConstants.PAF_BLANK))
			if (!tuple.getMemberDefs()[0].toUpperCase().equals(PafBaseConstants.PAF_BLANK) && !tuple.isMemberTag())
				memberLists.add(tuple.getMemberDefs());
		}
		sliceParms.setRowTuples(memberLists.toArray(new String[0][0]));

		logger.debug("Building Data Slice Parms - Setting Column Members");
		i = 0;
		memberLists = new ArrayList<String[]>();
		for (ViewTuple tuple : section.getColTuples() ) {
//if (!tuple.getMemberDefs()[0].toUpperCase().equals(PafBaseConstants.PAF_BLANK))            
			if (!tuple.getMemberDefs()[0].toUpperCase().equals(PafBaseConstants.PAF_BLANK)&& !tuple.isMemberTag())            
				memberLists.add(tuple.getMemberDefs());
		}        
		sliceParms.setColTuples(memberLists.toArray(new String[0][0]));

		logger.debug("Building Data Slice Parms - Setting Page Axis & Members");          
		i = 0;
		String [] pageAxis = new String[section.getPageTuples().length];      
		String [] pageMembers = new String[section.getPageTuples().length];
		for (PageTuple tuple : section.getPageTuples() ) {
			pageAxis[i] = tuple.getAxis();          
			pageMembers[i++] = tuple.getMember();
		}     

		sliceParms.setPageDimensions( pageAxis );      
		sliceParms.setPageMembers( pageMembers );

		// Return data slice parms
		logger.info("Returning Completed Data Slice Parms");    
		return sliceParms;
	}

	/**
	 * Build the dimension member specs for generating a data slice cache
	 * 
	 * @param sliceParms DataSliceParms
	 * @param viewSection View section
	 * @param uowCache Unit of work cache
	 * @param clientState Client state object
	 * 
	 * @return UnitOfWork
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked")
	protected UnitOfWork buildDataSliceCacheSpec(final PafDataSliceParms sliceParms, final PafViewSection viewSection,
			final PafDataCache uowCache, PafClientState clientState) throws PafException {

		int dimCount = 0;
		String measureDim = clientState.getMdbDef().getMeasureDim();
		String timeDim = clientState.getMdbDef().getTimeDim();
		String versionDim = clientState.getMdbDef().getVersionDim();
		String[] uowPeriods = uowCache.getDimMembers(timeDim);
		String[] dimensionOrder = viewSection.getDimensionsPriority();
		Set<String>[] dimensionMembers = null;
		PafApplicationDef appDef = clientState.getApp();       	
		Map<String, MeasureDef> measureDefs = appDef.getMeasureDefs();
		Map<String, Integer> dimIndexMap = new HashMap<String,Integer>();
		Map<String, Set<String>> mbrDependencyMap = new HashMap<String, Set<String>>();
		Map<String, Set<String>> crossDimIsMap = new HashMap<String,Set<String>>();
		MemberTreeSet uowTrees = clientState.getUowTrees();
		RuleSet currentRuleset = clientState.getCurrentMsrRuleset();
		UnitOfWork sliceCacheParms = null;
		EvalState evalState = null;
		boolean hasAttributes;

		logger.info("Building Data Slice Cache Spec...");

		// Check for null data slice parms
		if (sliceParms == null) {
			String errMsg = "Data slice parms object is null";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);
			throw (iae);
		}

		// Check for null viewSection
		if (viewSection == null) {
			String errMsg = "View section is null";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);
			throw (iae);
		} else {
			hasAttributes = viewSection.hasAttributes();
		}

		// Get member dependency map (Attribute View Only) (TTN-1269)
		if (hasAttributes) {

			// Initialize eval state
			evalState = new EvalState(clientState);
			evalState.setAxisPriority(dimensionOrder);
			evalState.setCurrentTimeSlice(sliceParms.getMembers(timeDim)[0]);

//			//CLONE A TON OF INTERSECTIONS FOR EACH DIMENSION MEMBER
//			Intersection attrIs = new Intersection(dimensionOrder);
//			for (String isDim : dimensionOrder) {
//				attrIs.setCoordinate(isDim, sliceParms.getMembers(isDim)[0]);
//			}
//			for (String dim : dimensionOrder) {
//				String[] members = null;
//				if (getBaseDimNames().contains(dim)) {
//					members = uowCache.getDimMembers(dim);
//				} else {
//					members = clientState.getUowTrees().getTree(dim).getMemberKeys();
//				}
//				for (String member : members) {
//					Intersection memberIs = attrIs.clone();
//					memberIs.setCoordinate(dim, member);
//					evalState.addChangedCell(memberIs);
//				}
//			}

			// Get the dependent members required by any recalc rule
			// in any rule set.
			List<String> dsMeasures = Arrays.asList(sliceParms.getMembers(measureDim));
			List<String> recalcMeasures = new ArrayList<String>();
			for (String measure:dsMeasures) {
				if (measureDefs.get(measure).getType() == MeasureType.Recalc) {
					recalcMeasures.add(measure);
				}
			}
			for (RuleSet ruleSet : clientState.getMsrRuleSets()) {
				Map<String, Set<String>> ruleSetImpactMap = ruleSet.calcImpactMemberMap(recalcMeasures, measureDefs, evalState);
				mbrDependencyMap = CollectionsUtil.mergeMaps(mbrDependencyMap, ruleSetImpactMap);
			}

		}
		
		// Set member list of each dimension in data slice cache. Some dimensions
		// have different logic for attribute and non-attribute views.
//		String[] dimensionOrder = viewSection.getDimensionsPriority();
		dimCount = dimensionOrder.length;
		dimensionMembers = new Set[dimCount];
		for (int dimInx = 0; dimInx < dimCount; dimInx++) {

			// Initialize dimension meta-data
			String dimension = dimensionOrder[dimInx];
			dimIndexMap.put(dimension, dimInx);
			Set<String> dsMembers = null;

			if (dimension.equalsIgnoreCase(measureDim)) {

				// Measures dimension
				if (hasAttributes) {
					
					// Attribute view - pull in all displayed measures plus all
					// component measures required for recalculation and custom function
					// calculations.
					dsMembers = new HashSet<String>(Arrays.asList(sliceParms.getMembers(dimension)));
					dsMembers.addAll(mbrDependencyMap.get(dimension));
//					List<String> dsMeasures = Arrays.asList(sliceParms.getMembers(dimension));
//					List<String> recalcMeasures = new ArrayList<String>();
//					for (String measure:dsMeasures) {
//						if (measureDefs.get(measure).getType() == MeasureType.Recalc) {
//							recalcMeasures.add(measure);
//						}
//					}
//					
//					// Create dummy eval state that can be fed into the 'getTriggers' method
//					// for any encountered custom function. Eval state will be initialized
//					// with a set of changed intersections, one for each uow measure.
//					EvalState evalState = new EvalState(clientState);
//					Intersection attrIs = new Intersection(dimensionOrder);
//					for (String isDim : dimensionOrder) {
//						attrIs.setCoordinate(isDim, sliceParms.getMembers(isDim)[0]);
//					}
//					for (String measure : uowMeasures) {
//						Intersection measIs = attrIs.clone();
//						measIs.setCoordinate(measureDim, measure);
//						evalState.addChangedCell(measIs);
//					}
//					evalState.setCurrentTimeSlice(sliceParms.getMembers(timeDim)[0]);
//					
//					// Get the dependent measures required by ALL rule sets
//					Set<String> requiredMeasures = new HashSet<String>();
//					for (RuleSet ruleSet : clientState.getMsrRuleSets()) {
//						requiredMeasures.addAll(ruleSet.calcMsrDeps(recalcMeasures, measureDefs, evalState));
//					}
//					
//					requiredMeasures.addAll(dsMeasures);
//					dsMembers = requiredMeasures;
					
				} else {
					// Non-attribute view - just pull in measures displayed in view section
					dsMembers = new HashSet<String>(Arrays.asList(sliceParms.getMembers(dimension)));
				}
				
			} else if (dimension.equalsIgnoreCase(timeDim)) {

				// Time dimension
				if (hasAttributes) {
					// on attribute views, the only time members needed are those explicitly mentioned on the view
					// unless the view also includes a perpetual recalc measure, in which case potentially all time 
					// periods will be needed to properly calculate an attribute value


					// get measures in this rule set that are perpetual recalcs
					Set <String> perpRecalcMsrs = currentRuleset.resolvePerpRecalcMsrs(measureDefs);
					boolean allTimePeriods = false;

					// if any measures on the current view are perpetual recalcs pull all time periods
					for (String msr : sliceParms.getMembers(measureDim)) {
						if (perpRecalcMsrs.contains(msr)) {
							allTimePeriods = true;
							break;
						}
					}

					if (allTimePeriods) {
						// get all possible time periods in the uow cache
						dsMembers = new HashSet<String>(Arrays.asList(uowPeriods));
					}
					else {
						// only time periods explicitly mentioned on the slice plus
						// recalc rules dependent members
						dsMembers = new HashSet<String>(Arrays.asList(sliceParms.getMembers(dimension)));        				
						dsMembers.addAll(mbrDependencyMap.get(dimension));
					}


				} else {
					// No attributes on view - just pull in periods displayed in view section
					dsMembers = new HashSet<String>(Arrays.asList(sliceParms.getMembers(dimension)));
				}
				
			} else if (dimension.equalsIgnoreCase(versionDim)) {

				// Version dimension
				
				// ----- Select all displayed versions 
				Set<String> versions = new HashSet<String>();
				versions.addAll(Arrays.asList(sliceParms.getMembers(dimension)));

				// ----- Attribute view - add in dependent versions from recalc rules
				if (hasAttributes) {
					versions.addAll(mbrDependencyMap.get(dimension));
				}
				
				// ----- Plus any associated derived versions
				Set<String> componentVersions = new HashSet<String>();
				for (String version:versions) {
					VersionDef versionDef = appDef.getVersionDef(version);
					if (versionDef == null) {
						String errMsg = "Unable to find version definition for: [" + version + "].";
						logger.error(errMsg);
						throw new IllegalArgumentException(errMsg);
					}
					if (PafBaseConstants.DERIVED_VERSION_TYPE_LIST.contains(versionDef.getType())) {

						// Add dependent versions for derived versions. Logic is dependent
						// on the version type.
						VersionFormula versionFormula = versionDef.getVersionFormula();
						componentVersions.add(versionFormula.getBaseVersion());

						if (versionDef.getType() == VersionType.Variance) {
							// Variance version - add comparison version
							componentVersions.add(versionFormula.getCompareVersion());

						} else if (versionDef.getType() == VersionType.ContribPct) {
							// Contribution percent - Add all comparison intersection specs 
							// to a collection that will later be used to determine which 
							// off-view members need to be added to the data slice cache to 
							// support cross dim calculations.
							PafDimSpec[] compareIsSpec = versionFormula.getCompareIsSpec();							
							for (PafDimSpec compareMemberSpec:compareIsSpec) {
								String dim = compareMemberSpec.getDimension();
								String memberSpec = compareMemberSpec.getExpressionList()[0];
								//Add entry to cross dim member map
								if (!crossDimIsMap.containsKey(dim)) {
									crossDimIsMap.put(dim, new HashSet<String>());
								}
								Set<String> dimMembers = crossDimIsMap.get(dim);
								dimMembers.add(memberSpec);
							}
						}		
					}
				}    
				versions.addAll(componentVersions);
								
				// Assign versions
				dsMembers = versions;
				
			} else {
				
				// Remaining dimensions - select all dimension members on view.
				dsMembers = new HashSet<String>(Arrays.asList(sliceParms.getMembers(dimension)));
				
				// On attribute view - add any dependent members in recalc rules
				if (hasAttributes) {
					dsMembers.addAll(mbrDependencyMap.get(dimension));
				}
			}


			// Set member list for current dimension
			dimensionMembers[dimInx]= dsMembers;
		}

		
		// Add any additional members required by off-view cross-dimensional references
		for (String dim:crossDimIsMap.keySet()) {
			int dimInx = dimIndexMap.get(dim);
			Set<String> memberSpecs = crossDimIsMap.get(dim);
			Set<String> memberSet = dimensionMembers[dimInx];
			for (String expression:memberSpecs) {
				if (expression.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_PARENT)) {
					// Parent token - add in ancestors of each dimension member.
					// Just parents results in missing members when calculating
					// contribution % members.
					PafDimTree dimTree = uowTrees.getTree(dim);
					String root = dimTree.getRootNode().getKey();
					Set<String> ancestors = new HashSet<String>();
					for (String member:memberSet) {
						if (!member.equalsIgnoreCase(root)) {
							List<PafDimMember> ancestorMembers = dimTree.getAncestors(member);
							for (PafDimMember ancestorMember : ancestorMembers) {
								ancestors.add(ancestorMember.getKey());								
							}
						}
					}
					memberSet.addAll(ancestors);
				} else if (expression.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_UOWROOT)) {
					// Uowroot token - add root of tree to dimension member set
					PafDimTree dimTree = uowTrees.getTree(dim);
					String root = dimTree.getRootNode().getKey();
					memberSet.add(root);
				} else {
					// Member name - add member to dimension member set
					memberSet.add(expression);
				}
				
			}
		}
		
		// Convert array of members sets to 2-dimensional string array, 
		// as required by the UnitOfWork constructor
		String[][] dimensionMemberArray = new String[dimCount][];
		for (int i = 0; i < dimCount; i++) {
			dimensionMemberArray[i] = dimensionMembers[i].toArray(new String[0]);
		}
		
		// Return data slice cache parms
		sliceCacheParms = new UnitOfWork(dimensionOrder, dimensionMemberArray);
		return sliceCacheParms;
	}


	/**
	 *	Initialize member tree cache
	 *
	 */
	protected void clearMemberTreeCache() {

		logger.info("Clearing dimension tree cache.");

		Session session = PafMetaData.currentPafDBSession();

		Transaction tx = null;

		try {

			tx = session.beginTransaction();

			List<PafBaseTree> trees = session.createQuery("from PafBaseTree").list();

			logger.info("Trees enumerated");

			for (PafBaseTree tree : trees) {  

				if (tree.getRootNode() != null) {

					delChildrenFromCache(tree.getRootNode(), session);

				}

				session.delete(tree);

				logger.info(tree.getRootNode().getKey() + " tree deleted" );

			}

			tx.commit();

		} catch (RuntimeException ex) {

			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}

			PafErrHandler.handleException(ex, PafErrSeverity.Error);

		}

	}

	private void delChildrenFromCache(PafDimMember member, Session session) {

		for (PafDimMember child: member.getChildren() ) {

			delChildrenFromCache(child, session);

		}

		session.delete(member);
	}

	/**
	 *	Initialize member tree store
	 *
	 * @param pafApp Application definition
	 */
	public void initMemberTreeStore(PafApplicationDef pafApp) {

		IMdbMetaData metaData = null;
		MdbDef mdbDef = pafApp.getMdbDef();
		IPafConnectionProps connProps = (IPafConnectionProps) PafMetaData.getAppContext().getBean(mdbDef.getDataSourceId());
		String[] dims = mdbDef.getAllDims();
		String measureDim = mdbDef.getMeasureDim(), versionDim = mdbDef.getVersionDim();
		Set<String> validMeasures = pafApp.getMeasureDefs().keySet();
		Set<String> validVersions = pafApp.getVersionDefs().keySet();
		Set<String> validMembers = null;
		boolean isRollupFiltered = true;


		
		try {           
			
			// Connect to Essbase
			
// 			TTN-1406
//			IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//			metaData = mdbClassLoader.getMetaDataProvider();
			metaData = this.getMetaDataProvider(connProps);
			
			// Load and/or cache each base dimension tree
			for (String dim : dims) {
				

				// Pre-processing for validation of measure and version trees
				if (dim.equals(measureDim) || dim.equals(versionDim)) {
					if (dim.equals(measureDim)) {
						// Measures - all measures in tree should have an entry in the measures
						// definition file.
						validMembers = validMeasures;
						isRollupFiltered = true;
					} else {
						// Versions - only level 0 versions should be pruned from versions tree. 
						// Version rollups are used for display purposes only and wouldn't have   
						// an entry in the version definition file.  
						validMembers = validVersions;
						isRollupFiltered = false;
					}
				}

				if (isDimCached(dim)) {
					
					//get cached tree
					PafBaseTree cachedTree = getCachedDim(dim);
					
					//TTN-1015: This if handles the scenario when the root node of the measure tree
					//is a different name than the dimension name.  This resolves the error when the root node
					//gets set to null because hibernate can't map the root member back from the original
					//root member set on the tree before being cached.
					if (dim.equals(measureDim) && cachedTree.getRootNode() == null) {
																		
						//check for null measure root
						if ( mdbDef.getMeasureRoot() == null ) {							
							throw new IllegalArgumentException("Measure root is null.");
						}
												
						//find measure root member and set as new root member
						cachedTree.setRootNode(cachedTree.getMember(mdbDef.getMeasureRoot()));	
						
					}
					
					baseTrees.put(dim, cachedTree);
					
					// Check measure and version trees for any undefined members
					if (dim.equals(measureDim) || dim.equals(versionDim)) {
						logger.info("Validating cached dimension tree: [" + dim + "] ...");
						Set<String> undefinedMembers = cachedTree.findInvalidMembers(validMembers, isRollupFiltered);
						for (String member : undefinedMembers) {
							String errMsg = "Undefined member: [" + member + "] found in cached dimension tree: " + dim;
							logger.warn(errMsg);
						}
					}

				}
				else
				{
					// If measures dimension, pull root name from "measure root" property
					String root = dim;;
					if (dim.equals(mdbDef.getMeasureDim())) {
						root = mdbDef.getMeasureRoot();
					}

					// Import base dimension tree from Essbase outline
					PafBaseTree tree = metaData.getBaseDimension(pafApp.getEssNetTimeOut(), root);
					
					// Reset tree id to dimension name (necessary if the root of the tree is not the dimension name)
					tree.setId(dim);

					// Filter measure and version trees against undefined members
					if (dim.equals(measureDim) || dim.equals(versionDim)) {
						Set<String> prunedMembers = tree.filterTree(validMembers, isRollupFiltered);
						for (String member : prunedMembers) {
							String errMsg = "Undefined member: [" + member + "] " ;
							if (isRollupFiltered){
								errMsg += "(and its descendants) ";
							} 
							errMsg += "pruned from dimension tree: "+ dim;
							logger.warn(errMsg);
						}
					}
					
					// Set associated attributes properties on base tree members
					tree = setAssociatedAttributes(tree, dim);

					// Add base tree to collection and cache it to relational store
					baseTrees.put(dim, tree);
					cacheDim(baseTrees.get(dim));
				}
// Migrated creation of memberIndexLists to client state during plan session start (TTN-1391)
//				memberIndexLists.put(dim, createMemberIndexList(baseTrees.get(dim), TreeTraversalOrder.PRE_ORDER));
			}
			
		} catch (Exception ex) {
			// Handle any found exception (TTN-1355)
			logger.error("Error encountered loading dimension trees - one or more trees have failed to load!!!");
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		} finally {
			try {
				metaData.disconnect();
			} catch (Exception ex) {
				//doesn't matter.
			}
		}
	}

	/**
	 *	Set associated attributes on paf base tree
	 *
	 * @param baseTree Paf base tree
	 * @param baseDimName Name of base tree
	 * 
	 * @return PafBaseTree
	 */
	public PafBaseTree setAssociatedAttributes(PafBaseTree baseTree, String baseDimName) {

		Map <String, PafAttributeTree> attrTrees = getAttributeTrees(); 
		Map<String, Integer> attributeDimInfo = new HashMap<String, Integer>();


		// Iterate through all attribute trees and identify the ones 
		// mapped to specified base dimension
		for (String attrDimName:attrTrees.keySet()) {
			PafAttributeTree attrTree = attrTrees.get(attrDimName);

			// If attribute dimension is mapped to specified base dimension
			if (baseDimName.equalsIgnoreCase(attrTree.getBaseDimName())) {

				// Track level of associated base members for this attribute dimension
				Integer attrBaseMemberLevel = null;

				// Get all level 0 attribute members for current attribute tree
				// as this is where the base members are assigned
				List<PafDimMember> attrMbrs = attrTree.getMembersByLevel().get(0);

				// Iterate through attribute members and retrieve associated base members
				for (PafDimMember attrMbr: attrMbrs) {

					// Retrieve associated base members
					PafDimMemberProps dimMemberProps = attrMbr.getMemberProps();
					PafAttributeMemberProps attrMemberProps = (PafAttributeMemberProps) dimMemberProps;
					Set<String> baseMemberNames = attrMemberProps.getBaseMembers();

					// Generate a warning message if attribute does not have any mapped base members
					if (baseMemberNames == null || baseMemberNames.isEmpty()) {
						String errMsg = "Warning: loading associated attributes - no base member mappings were found for"
							+ " attribute value: " + attrMbr.getKey() + " - in attribute dimension: " + attrDimName;
						logger.warn(errMsg);
					}

					// Iterate through base members and assign attributes
					for (String baseMemberName:baseMemberNames) {

						// Find base member in base tree
						PafBaseMember baseMember = baseTree.getMember(baseMemberName);

						// Check base member level number
						PafBaseMemberProps baseMemberProps = baseMember.getMemberProps();
						int memberLevel = baseMemberProps.getLevelNumber();
						if (attrBaseMemberLevel == null) {
							// First associated base member?
							attrBaseMemberLevel = memberLevel;
						} else {
							// Else, ensure that every subsequent base member has the same level as 
							// the first base member associated with this attribute dimension.
							if (attrBaseMemberLevel != memberLevel) {
								String errMsg = "Error loading associated attributes for Attribute Dimension: ["
									+ attrDimName + "] - not all associated base members are at level: "
									+ attrBaseMemberLevel + " - " + baseMemberName + " is at level: " + memberLevel;
								logger.warn(errMsg);
							}
						}

						// Add attribute to base member's associated attributes property
						Map <String, String> attributes = baseMemberProps.getAssociatedAttributes();
						if (attributes == null) {
							attributes = new HashMap <String, String>();
						}
						attributes.put(attrDimName, attrMbr.getKey());
						baseMemberProps.setAssociatedAttributes(attributes);
					}
				}

				// Ensure that the attribute current attribute dimension has at least one 
				// attribute mapped to a base member
				if (attrBaseMemberLevel == null) {
					String errMsg = "Error loading associated attributes - no base member mappings were found for attribute dimension: "
						+ attrDimName;
					logger.error(errMsg);
					IllegalArgumentException iae = new IllegalArgumentException(errMsg);
					throw (iae);
				}

				
				// Capture each attribute dimension and corresponding base dimension mapping level 
				attributeDimInfo.put(attrDimName, attrBaseMemberLevel);

			}
		}

		// Copy attribute information from stored members to shared members
		for (PafDimMember sharedMember : baseTree.getSharedMembers()) {

			// Find corresponding base member in base tree
			PafBaseMember baseMember = baseTree.getMember(sharedMember.getKey());
			
			// Copy attribute information
			PafBaseMember sharedBaseMember = (PafBaseMember) sharedMember; 
			sharedBaseMember.getMemberProps().setAssociatedAttributes(baseMember.getMemberProps().getAssociatedAttributes());
		}

		// Store the names of any associated attribute dimensions and their corresponding
		// base dimension mapping level, at the root of base tree
		baseTree.setAttributeDimInfo(attributeDimInfo);

		// Return update base trees
		return baseTree;
	}


	/**
	 * Builds the attributeTrees map using the internal and external hibernate layer.
	 */
	public void initAttributeMemberTreeStore() {
		List<PafAttributeTree> pafAttributeTree = null;
		List<PafAttributeTree> pafAttributeTreeExt = null;

		try {           
			//get all PafAttributeTrees for our datastore.
			pafAttributeTree = this.getCachedDims(PafMetaData.currentPafDBSession());
			for(PafAttributeTree tree : pafAttributeTree){
				logger.info("Starting caching attribute dimension tree: " + tree.getId());
				
				/*
				logger.info("Begining search for parent node for tree: " + tree.getId());
				for(PafAttributeMember member : tree.getMemberValues()){
					if(member.getParent() == null){
						logger.info("Found parent node: " + member.getKey() + ", for tree: " + tree.getId());
						//set the root node.
						tree.setRootNode(member);
						//set the members by generation.
						tree.getMembersByGen();
						//set the members by level.
						tree.getMembersByLevel();
						break;
					}
				}
				*/
				
				//find root node using attribute dimension name.
				PafAttributeMember rootNode = tree.getMember(tree.getId());
				
				//set the root node.
				tree.setRootNode(rootNode);
				
				//set the members by generation.
				tree.getMembersByGen();
				
				//set the members by level.
				tree.getMembersByLevel();
				
				//put the tree in the dictionary.
				attributeTrees.put(tree.getId(), tree);
				
				logger.info("Completed caching attribute dimension tree: " + tree.getId());
			}

			//get all PafAttributeTrees for external data store.
			//if a duplicate tree name if found it is ignored.
			pafAttributeTreeExt = this.getCachedDims(PafMetaData.currentPafExtAttrDBSession());
			for(PafAttributeTree tree : pafAttributeTreeExt){
				if(! attributeTrees.containsKey(tree.getId())){
					logger.info("Starting caching attribute dimension tree: " + tree.getId());
					logger.info("Begining search for parent node for tree: " + tree.getId());
					for(PafAttributeMember member : tree.getMemberValues()){
						if(member.getParent() == null){
							logger.info("Found parent node: " + member.getKey() + ", for tree: " + tree.getId());
							//set the root node.
							tree.setRootNode(member);
							//set the members by generation.
							tree.getMembersByGen();
							//set the members by level.
							tree.getMembersByLevel();
							break;
						}
					}
					attributeTrees.put(tree.getId(), tree);
					logger.info("Completed caching attribute dimension tree: " + tree.getId());
				} else {
					logger.warn("Duplicate attribute dimension tree found: " + tree.getId() + " program will ignore.");
				}
			}

// Migrated creation of memberIndexLists to client state during plan session start (TTN-1391)
//			// Generate memberIndexList for each attribute dimension, for use in allocation processing
//			for (String attrDim:attributeTrees.keySet()) {
//				//for (PafDimTree attrTree:attributeTrees.keySet()) {
//				memberIndexLists.put(attrDim, createMemberIndexList(attributeTrees.get(attrDim), TreeTraversalOrder.PRE_ORDER));
//			}

		} catch (Exception ex) {
			logger.warn(ex.getMessage());
		} 


	}

	/**
	 * Cache an array of attribute dimensions into the data store.
	 * @param dims Array of attribute dimensions to cache.
	 * @param appDef The application def for the user.
	 * @throws PafException 
	 */
	public void cacheAttributeDims(String[] dims, PafApplicationDef appDef) throws PafException {
		if(dims == null || dims.length == 0){
			return;
		}

		IMdbMetaData metaData = null;
		PafMdbProps mdbProps = null;
		
		IPafConnectionProps connProps = (IPafConnectionProps) 
		PafMetaData.getAppContext().getBean(appDef.getMdbDef().getDataSourceId());
				
		try{
//			TTN-1406
//			IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//			metaData = mdbClassLoader.getMetaDataProvider();
			metaData = this.getMetaDataProvider(connProps);
			
			//get the mdb props from Essbase.
			mdbProps = metaData.getMdbProps();
			
			boolean varyingAttributesExist = metaData.varyingAttributesExist(dims, mdbProps, appDef.getEssNetTimeOut());
			
			if(varyingAttributesExist == true){
				logger.error("Varying Attributes exist in the Essbase outline - no attributes will be loaded");
			}
			else{
				for(String dim : dims){
					//get the attribute tree from the essbase outline.
//					PafAttributeTree pafAttributeTree = metaData.getAttributeDimension(dim, mdbProps, appDef.getEssNetTimeOut());
					PafAttributeTree pafAttributeTree = metaData.getAttributeDimension(appDef.getEssNetTimeOut(), dim, mdbProps);
					//delete the cached dim.
					deleteCacheAttrDim(dim);
					//recache the dim.
					cacheDim(pafAttributeTree);
					//check the DICTIONARY to see if the tree already exists.  If
					//so then delete it and re add it.
					if(attributeTrees.containsKey(dim)){
						attributeTrees.remove(dim);
					}
					attributeTrees.put(dim, pafAttributeTree);
				}
			}
		} catch(PafException e){
			logger.error(e);
			throw e;
		} finally {
			try {
				metaData.disconnect();
			} catch (Exception ex) {
				//doesn't matter.
			}
		}
	}

	/**
	 * Deletes a PafAttributeTree from the Hibernate datastore.
	 * 
	 * @param dim The dimension to be deleted.
	 */
	public void deleteCacheAttrDim(String dim) {
		Session session = PafMetaData.currentPafDBSession();
		Transaction tx = null;

		try {
			if(dim != null && dim.length() > 0){
				//begin a new transaction
				tx = session.beginTransaction();   
				//send the delete query.
				session.createQuery("Delete from PafAttributeTree where MEMBER_TREE_NAME = ?")
				.setParameter(0, dim).executeUpdate();
				//Commit the transaction
				tx.commit();
				//remove the item from the tree
				attributeTrees.remove(dim);
			}

		} catch (RuntimeException ex) {
			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}
	}

	public void deleteAllCacheAttrDim() {
		Session session = PafMetaData.currentPafDBSession();
		Transaction tx = null;
		List<PafAttributeTree> pafAttributeTree = null;
		List<String> dimsToRemove = new ArrayList<String>();

		try{
			//get all PafAttributeTrees for our datastore.
			pafAttributeTree = this.getCachedDims(session);
			//store the names of the dims.
			for(PafAttributeTree tree : pafAttributeTree){
				dimsToRemove.add(tree.getId());
			}
		}catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}

		tx = null;

		try {
			//begin a new transaction
			tx = session.beginTransaction();   
			//send the delete query.
			session.createQuery("Delete from PafAttributeTree").executeUpdate();
			//Commit the transaction
			tx.commit();
			//remove all attributes from the map.
			for(String dim : dimsToRemove){
				attributeTrees.remove(dim);
			}

		} catch (RuntimeException ex) {
			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}
	}


	/**
	 * Cache a PafAttributeTree into the Hibernate datastore.
	 * 
	 * @param tree The PafAttributeTree to be cached.
	 */
	private void cacheDim(PafAttributeTree tree) {
		Session session = PafMetaData.currentPafDBSession();
		Transaction tx = null;

		try {
			//begin a new transaction
			tx = session.beginTransaction();
			//save the new one
			session.save(tree);
			//commit the transaction
			tx.commit(); 
		} catch (RuntimeException ex) {
			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}
	}

	/**
	 * Gets a list of cached dimension from the Hibernate datastore.
	 * 
	 * @param session The hibernate session to query.
	 * @return A list of PafAttributeTree
	 */
	@SuppressWarnings("unchecked")
	private List<PafAttributeTree> getCachedDims(Session session) {
		Transaction tx = null;
		List<PafAttributeTree> pafAttributeTrees = null;
		try{
			//start a transaction.
			tx = session.beginTransaction();
			//load the trees
			pafAttributeTrees = session.createQuery("from PafAttributeTree").list();
			//end the transaction.
			tx.commit();
		} catch (RuntimeException ex) {
			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}
		return pafAttributeTrees;
	}

	private void cacheDim(PafBaseTree tree) {

		Session session = PafMetaData.currentPafDBSession();

		Transaction tx = null;

		try {

			tx = session.beginTransaction();

			session.saveOrUpdate(tree);

			tx.commit();  

		} catch (RuntimeException ex) {

			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}

			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}       

	}

	private PafBaseTree getCachedDim(String string) {

		Session session = PafMetaData.currentPafDBSession();
		Transaction tx = null;
		PafBaseTree tree = null;

		try {

			tx = session.beginTransaction();

			tree = (PafBaseTree) session.load(PafBaseTree.class, string );

			tx.commit();

		} catch (RuntimeException ex) {

			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}

			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}

		return tree;
	}

	private boolean isDimCached(String string) {

		Session session = PafMetaData.currentPafDBSession();

		Transaction tx = null;

		java.util.List list;

		try {

			tx = session.beginTransaction();

			list = session.createQuery("from PafBaseTree where id='" + string + "'").list();

			tx.commit();

		} catch (RuntimeException ex) {

			try {
				tx.rollback();
			} catch (RuntimeException re2) {
				//do nothing
			}

			PafErrHandler.handleException(ex, PafErrSeverity.Error);

			return false;
		}

		if (list.size() > 0) {
			return true;
		}
		return false;

	}

	public void clearMemberTreeStore() {
		baseTrees.clear();
//		memberIndexLists.clear();
	}

	public IMdbMetaData getMetaDataProvider(IPafConnectionProps connectionProps) {

		IMdbMetaData mdbProvider = null;

		try {

			Constructor C = Class.forName(connectionProps.getMetaDataServiceProvider()).getConstructor(new Class[] {Properties.class} );

			mdbProvider = (IMdbMetaData) C.newInstance(new Object[] { connectionProps.getProperties() } );

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mdbProvider;
	}

	public IMdbData getMdbDataProvider(IPafConnectionProps connectionProps) {  

		IMdbData dataProvider = null;

		try {

			Constructor C = Class.forName(connectionProps.getDataServiceProvider()).getConstructor(new Class[] {Properties.class} );

			dataProvider = (IMdbData) C.newInstance(new Object[] { connectionProps.getProperties() } );

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dataProvider;        

	}

	/**
	 *  Get the specified mdb provider class loader
	 *
	 * @param connectionProps Connection properties
	 * 
	 * @return IMdbClassLoader
	 */
	public IMdbClassLoader getMdbClassLoader(IPafConnectionProps connectionProps) {

		IMdbClassLoader mdbClassLoader = null;

		try {

			String mdbClassLoaderProp = connectionProps.getMdbClassLoader();
			if (mdbClassLoaderProp == null) {
				mdbClassLoaderProp = PafBaseConstants.DEFAULT_MDB_CLASS_LOADER;
				logger.warn("Using default MDB class loader: [" + mdbClassLoaderProp + "]");
			}
			
			Constructor<?> C = Class.forName(mdbClassLoaderProp).getConstructor(new Class[] {Properties.class} );

			mdbClassLoader = (IMdbClassLoader) C.newInstance(new Object[] { connectionProps.getProperties() } );

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mdbClassLoader;
	}



	/**
	 *	Resolve and expand the dynamic row and column member definitions on the view
	 *
	 * @param view Application view
	 * @param clientState Client state object
	 * 
	 * @return Updated application view
	 * @throws PafException 
	 */
	public PafView expandView(PafView view, PafClientState clientState) throws PafException {

		// Expand all of the row and column tuples on each view section
		logger.info("Expanding tuples for view: " + view.getName());
		for (PafViewSection viewSection: view.getViewSections()) {
			viewSection.setRowTuples(expandTuples(viewSection.getRowTuples(), viewSection.getRowAxisDims(), viewSection.getPageAxisDims(), viewSection.getPageAxisMembers(), viewSection.getAttributeDims(), clientState));
			viewSection.setColTuples(expandTuples(viewSection.getColTuples(), viewSection.getColAxisDims(), viewSection.getPageAxisDims(), viewSection.getPageAxisMembers(), viewSection.getAttributeDims(), clientState));

			// Remove invalid tuples from view section
			PafViewService.getInstance().ProcessInvalidTuples(viewSection, clientState);

			if (viewSection.getRowTuples().length > 0){
				viewSection.setRowTuples(generateHeaderGroupNo(viewSection.getRowTuples(),viewSection.getRowAxisDims()));
			} else {
				viewSection.setEmpty(true);
			}
			if (viewSection.getColTuples().length > 0)
			{
				viewSection.setColTuples(generateHeaderGroupNo(viewSection.getColTuples(), viewSection.getColAxisDims()));
			} else {
				viewSection.setEmpty(true);
			}
			
		}
		logger.info("Completed exapanding tuples for view: " + view.getName());        
		return view;
	}

	/**
	 *	Generate the header group number used in the presentation layer to properly span member headers across rows or columns
	 *
	 * @param viewTuples View tuples
	 * @param axisDims	Axis dimension names
	 * @return ViewTuple[] 
	 */
	private ViewTuple[] generateHeaderGroupNo(ViewTuple[] viewTuples, String[] axisDims) {

		int dimCount = axisDims.length;
		
		//TTN-1041 - client starts tuple index at 1, not 0
		short tupleInx = 1;
		
		Integer groupNo[] = new Integer[dimCount];
		String[] prevHeader = new String[dimCount];
		ViewTuple[] updatedViewTuples = viewTuples.clone();

		logger.info("Generating Header Group Numbers");

		//    	Sample View Tuples        	Header Group Info	Order
		//    	-----------------------------------------------------------
		//    	Sales$	DPT210	WP			0,0,0					0
		//    	Sales$	DPT210	LY			0,0,1					1
		//    	Sales$	DPT210	OP			0,0,2					2
		//    	Sales$	DPT211	WP			0,1,0					3
		//    	Sales$	DPT211	LY			0,1,1					4
		//    	Sales$	DPT211	OP			0,1,2					5
		//    	GM$		DPT210	WP			1,0,0					6
		//    	GM$		DPT210	LY			1,0,1					7
		//    	GM$		DPT210	OP			1,0,2					8
		//    	GM$		DPT211	WP			1,1,0					9
		//    	GM$		DPT211	LY			1,1,1				   10
		//    	GM$		DPT211	OP			1,1,2				   11


		// Initialization
		for (int i = 0; i < dimCount; i++) {
			// Get get header values on first view tuple
			prevHeader[i] = viewTuples[0].getMemberDefs()[i];
			// Initialize group number array
			groupNo[i] = 0;
		}

		// Loop through each view tuple to be update
		for (ViewTuple viewTuple:updatedViewTuples) {
			// Compare headers on current view tuple to previous view tuple
			String headers[] = viewTuple.getMemberDefs();
			for (int axis = 0; axis < dimCount; axis++) {
				// If header on current axis has changed
				if (!headers[axis].equals(prevHeader[axis])) {
					// Increment group number for current axis
					groupNo[axis]++;
					prevHeader[axis] = headers[axis];
					// Initialize group numbers for remaining axis
					for (int remainingAxis = axis + 1; remainingAxis < dimCount; remainingAxis++) {
						groupNo[remainingAxis] = 0;
						prevHeader[remainingAxis] = headers[remainingAxis]; 
					}
					// Break out of comparison loop
					break;
				}
			}
			// Set header group number
			viewTuple.setDerivedHeaderGroupNo(groupNo.clone());
			// Set order property
			viewTuple.setOrder(tupleInx++);
		}

		// Return update view tuples
		return updatedViewTuples;
	}


	/**
	 *	Resolve and expand the member definitions on a set of  view tuples
	 *
	 * @param origViewTuples Array of view tuples
	 * @param axes Array of dimensional axes corresponding to the dimensions in each view tuple
	 * @param pageAxisDims 
	 * @param pageAxisMembers 
	 * @param attributeDims Array of any attribute dimensions associated with the view section
	 * @param clientState Client state object
	 * 
	 * @return Array of view tuples
	 * @throws PafException 
	 */
	public ViewTuple[] expandTuples(ViewTuple[] origViewTuples, String[] axes, String[] pageAxisDims, String[] pageAxisMembers, String[] attributeDims, PafClientState clientState) throws PafException {

		int dimCount = axes.length;
		int innerAxisIndex = dimCount -1;
		String axisList = "";
		List <ViewTuple>expandedTuples = new ArrayList<ViewTuple>();

		
		// Initialization
		for (String a : axes) {axisList += a + " "; }
		logger.info("Expanding tuples for axis: " + axisList);  

		// Expand inner axis
		for (ViewTuple vt:origViewTuples) {               
			expandedTuples.addAll(expandTuple(vt, innerAxisIndex, axes[innerAxisIndex], clientState));         
		}

		// Compile a list of attribute dimensions used in this tuple or the page tuple. This
		// information will be used to in an initial pass at filtering out invalid member 
		// intersections. (TTN-1469)
		Set<String> tupleAttrDims = new HashSet<String>();
		if (axes.length > 0 && attributeDims != null && attributeDims.length > 1) {
			// Attribute View
			// Check for attributes on the tuple (page or current axis)
			List<String> axisDimList = Arrays.asList(axes);
			List<String> pageDimList = Arrays.asList(pageAxisDims);
			for (String attrDim : attributeDims) {
				if (axisDimList.contains(attrDim) || pageDimList.contains(attrDim)) {
					tupleAttrDims.add(attrDim);
				}
			}
		}
		
		// Expand each symetric tuple group (for tuples comprised of multiple dimensions)
		for (int axisIndex = innerAxisIndex - 1; axisIndex >= 0; axisIndex--) {
			expandedTuples = expandSymetricTupleGroups(axisIndex, expandedTuples.toArray(new ViewTuple[0]), axes, tupleAttrDims, pageAxisDims, pageAxisMembers, clientState);
		}

		//If any tuple member is set to PAFBLANK, set the remaining members to PAFBLANK as well
		logger.info("Converting Paf Blank Tuples");
		for (ViewTuple viewTuple:expandedTuples) {
			if (isBlankViewTuple(viewTuple)) {
				String[] memberAr = viewTuple.getMemberDefs();
				for (int i = 0; i < memberAr.length; i++) {
					memberAr[i] = PafBaseConstants.PAF_BLANK;
				}
				viewTuple.setMemberDefs(memberAr);
			}
		}
	
		logger.info("Completed expanding tuples.");
		return expandedTuples.toArray(new ViewTuple[0]);
	}

	/**
	 *  Expand symteric view tuple groups
	 *
	 * @param axisIndex
	 * @param origViewTuples
	 * @param axes
	 * @param tupleAttrDims Set containing any attribute dimensions contained in the view tuples
	 * @param pageAxisDims 
	 * @param pageAxisMembers 
	 * @param clientState
	 * 
	 * @return List<ViewTuple>
	 * @throws PafException 
	 */
	private List<ViewTuple> expandSymetricTupleGroups(int axisIndex, ViewTuple[] origViewTuples, String[] axes, Set<String> tupleAttrDims, String[] pageAxisDims, String[] pageAxisMembers, PafClientState clientState) throws PafException {

		int tupleCount = origViewTuples.length;
		int tupleInx = 0;
		int groupNoPrefixSize = axisIndex + 1;
		Integer[] prevGroupNoPrefix = new Integer[groupNoPrefixSize];
		String dimToExpand = axes[axisIndex];
		List <ViewTuple>expandedTuples = new ArrayList<ViewTuple>();
		List <ViewTuple>tupleGroup = new ArrayList<ViewTuple>();

		logger.debug("Expanding tuples along axis: " + axes[axisIndex]);
		
	    // This method expands the supplied tuples from the second most inner axis
		// dimension out to the first tuple axis dimension. Within each axis, the tuples
		// are expanded in groups based on the setting of the 'symetricGroupNo' property.
        //
        // The example, below, shows a set of tuples coming into this method. The inner
		// axis members have already been resolved:
        //
		// Symetric Group#		Members
		// ---------------		------------------------------
		// [0][0]				@IDESC(DPT110),	@MEMBERS(BOP_RTL, SLS_RTL, SLS_AUR), WP 	
		// [0][0]				@IDESC(DPT110),	@MEMBERS(BOP_RTL, SLS_RTL, SLS_AUR), LY 	
		// [0][0]				@IDESC(DPT110),	@MEMBERS(BOP_RTL, SLS_RTL, SLS_AUR), WP.vs.LY 	
		// [0][1]				@IDESC(DPT110),	@MEMBERS(EOP_RTL, WOS), WP 					
		// [0][1]				@IDESC(DPT110),	@MEMBERS(EOP_RTL, WOS), OP 					
		//
		//
		// After the first pass through this set of tuples we have:
		//
		// Symetric Group#		Members
		// ---------------		------------------------------
		// [0][0]				@IDESC(DPT110),	BOP_RTL, WP 								
		// [0][0]				@IDESC(DPT110),	BOP_RTL, LY 					
		// [0][0]				@IDESC(DPT110),	BOP_RTL, WP.vs.LY 						
		// [0][0]				@IDESC(DPT110),	SLS_RTL, WP 					
		// [0][0]				@IDESC(DPT110),	SLS_RTL, LY 							
		// [0][0]				@IDESC(DPT110),	SLS_RTL, WP.vs.LY 			
		// [0][0]				@IDESC(DPT110),	SLS_AUR, WP 					
		// [0][0]				@IDESC(DPT110),	SLS_AUR, LY 
		// [0][0]				@IDESC(DPT110),	SLS_AUR, WP.vs.LY 							
		// [0][1]				@IDESC(DPT110),	EOP_RTL, WP 						
		// [0][1]				@IDESC(DPT110),	EOP_RTL, OP 				
		// [0][1]				@IDESC(DPT110),	WOS, WP 					
		// [0][1]				@IDESC(DPT110),	WOS, OP 					
        //
		//
		// Ultimately, we end up with the following after fully expanding this set of tuples,
		// making sure to iterate through the inner each axis dimensions first.
		//
		// Symetric Group#		Members
		// ---------------		------------------------------
		// [0][0]				DPT110,	BOP_RTL, WP 								
		// [0][0]				DPT110,	BOP_RTL, LY 					
		// [0][0]				DPT110,	BOP_RTL, WP.vs.LY 						
		// [0][0]				DPT110,	SLS_RTL, WP 					
		// [0][0]				DPT110,	SLS_RTL, LY 							
		// [0][0]				DPT110,	SLS_RTL, WP.vs.LY 			
		// [0][0]				DPT110,	SLS_AUR, WP 					
		// [0][0]				DPT110,	SLS_AUR, LY 
		// [0][0]				DPT110,	SLS_AUR, WP.vs.LY 							
		// [0][1]				DPT110,	EOP_RTL, WP 										
		// [0][1]				DPT110,	EOP_RTL, OP 										
		// [0][1]				DPT110,	WOS, WP 												
		// [0][1]				DPT110,	WOS, OP 												
		// [0][1]				DPT110,	EOP_RTL, WP 										
		// [0][1]				DPT110,	EOP_RTL, OP 										
		// [0][1]				DPT110,	WOS, WP 												
		// [0][1]				DPT110,	WOS, OP 												
		// [0][0]				CLS110-00, BOP_RTL, WP 								
		// [0][0]				CLS110-00, BOP_RTL, LY 					
		// [0][0]				CLS110-00, BOP_RTL, WP.vs.LY 						
		// [0][0]				CLS110-00, SLS_RTL, WP 					
		// [0][0]				CLS110-00, SLS_RTL, LY 							
		// [0][0]				CLS110-00, SLS_RTL, WP.vs.LY 			
		// [0][0]				CLS110-00, SLS_AUR, WP 					
		// [0][0]				CLS110-00, SLS_AUR, LY 
		// [0][0]				CLS110-00, SLS_AUR, WP.vs.LY 							
		// [0][1]				CLS110-00, EOP_RTL, WP 										
		// [0][1]				CLS110-00, EOP_RTL, OP 										
		// [0][1]				CLS110-00, WOS, WP 												
		// [0][1]				CLS110-00, WOS, OP 												
		// [0][1]				CLS110-00,	EOP_RTL, OP 								
		// [0][1]				CLS110-00,	WOS, WP 										
		// [0][1]				CLS110-00,	WOS, OP 										
		// [0][0]				CLS110-10, BOP_RTL, WP 								
		// [0][0]				CLS110-10, BOP_RTL, LY 					
		// [0][0]				CLS110-10, BOP_RTL, WP.vs.LY 						
		// [0][0]				CLS110-10, SLS_RTL, WP 					
		// [0][0]				CLS110-10, SLS_RTL, LY 							
		// [0][0]				CLS110-10, SLS_RTL, WP.vs.LY 			
		// [0][0]				CLS110-10, SLS_AUR, WP 					
		// [0][0]				CLS110-10, SLS_AUR, LY 
		// [0][0]				CLS110-10, SLS_AUR, WP.vs.LY 							
		// [0][1]				CLS110-00,	EOP_RTL, WP 										
		// [0][1]				CLS110-10,	EOP_RTL, WP 								
		// [0][1]				CLS110-10,	EOP_RTL, OP 										
		// [0][1]				CLS110-10,	WOS, WP 									
		// [0][1]				CLS110-10,	WOS, OP 									
        //

		// Perform pre-procssing for filtering of invalid attribute member intersections (TTN-1469)
		boolean hasAttributes = false;
		List<String> expandedAxisDims = new ArrayList<String>();
		Set<String> attrBaseDims = null;
		Map<String, List<String>> attrByBaseDim = new HashMap<String, List<String>>();
		if (tupleAttrDims.size() > 0) {

			// Get the pending list of expanded axis dimensions (include page dimensions). This
			// list determines which dimensions will be validated. Only dimension axes that
			// have been expanded (resolved) can be filtered on.
			for (int i = axes.length -1; i >= axisIndex; i--) {
				expandedAxisDims.add(axes[i]);
			}
			expandedAxisDims.addAll(Arrays.asList(pageAxisDims));

			// Build a collection of tuple attribute dimensions by base dimension
			attrBaseDims = getBaseDimNamesWithAttributes();
			attrBaseDims.retainAll(expandedAxisDims);
			attrByBaseDim = new HashMap<String, List<String>>();
			for (String baseDim : attrBaseDims) {

				// Select attribute dimension if it is contained on the page or expanded axis tuple
				Set<String> attrDims = getBaseTree(baseDim).getAttributeDimNames();
				for (String attrDim : attrDims) {
					if (expandedAxisDims.contains(attrDim)) {
						if (attrByBaseDim.get(baseDim) == null) {
							attrByBaseDim.put(baseDim, new ArrayList<String>());
						}
						attrByBaseDim.get(baseDim).add(attrDim);
					}
				}
			}

			// Final housekeeping
			if (attrByBaseDim.size() > 0) {
				hasAttributes = true;
			}
			
		}

		
        // Loop through each row tuple, preserving the original formatting 
		// and original tuple order.
 		while (tupleInx < tupleCount) {
 			
			// Group all tuples containing the same groupNo prefix corresponding
 			// to the selected axis
			Integer[] symetricGroupNo = origViewTuples[tupleInx].getSymetricGroupNo();
			System.arraycopy(symetricGroupNo, 0, prevGroupNoPrefix, 0, groupNoPrefixSize);
			tupleGroup = new ArrayList<ViewTuple>();
			Integer[] groupNoPrefix = new Integer[groupNoPrefixSize];
			while (tupleInx < tupleCount) {
				symetricGroupNo = origViewTuples[tupleInx].getSymetricGroupNo();
				System.arraycopy(symetricGroupNo, 0, groupNoPrefix, 0, groupNoPrefixSize);
				if (!Arrays.deepEquals(groupNoPrefix, prevGroupNoPrefix)) {
					break;
				}
				tupleGroup.add(origViewTuples[tupleInx++]);
			}				

			// Expand the tuple group by cloning the current set of tuples for each
			// term in the set of expanded members for this axis.
			List<ViewTuple> expandedTupleGroup = new ArrayList<ViewTuple>();
			ViewTuple firstTuple = tupleGroup.get(0);
			String groupTerm = firstTuple.getMemberDefs()[axisIndex];
			boolean groupParentFirst = firstTuple.getParentFirst();
			String[] expandedGroupTerms = expandExpression(groupTerm, groupParentFirst, dimToExpand , clientState);
			for (String expandedTerm:expandedGroupTerms) {
				for (ViewTuple viewTuple:tupleGroup) {
				
					// Take a first pass at filtering out invalid attribute member intersections among this row/col
					// tuple and the page tuple. Any remaining invalid tuples are filtered out in 
					// ViewService.ProcessInvalidTuples(). Tuples containing PafBlank or Member Tags are exempt 
					// from the filtering process. (TTN-1469)
					boolean validTupleExpansion = true;
					if (hasAttributes && !viewTuple.containsPafBlank() && !viewTuple.isMemberTag()){
						
						// Cycle through each base dimension that has at least one attribute dimension
						// on the current row/col tuple or page tuple. Then search the current axis, any
						// previously expanded axis, and the page tuple for the base member and 
						// corresponding attribute member intersections being validated.
						for (String baseDim : attrByBaseDim.keySet()) {
							
							// Initialization
							String baseMember = null;
							List<String> attrDimList = attrByBaseDim.get(baseDim);
							String[] attrDims = new String[attrDimList.size()];
							String[] attrIs = new String[attrDimList.size()];
							int attrIsIndex = 0;
							
							// Check current tuple axis
							if (dimToExpand.equals(baseDim)) {
								baseMember = expandedTerm;
							} else if (attrDimList.contains(dimToExpand)) {
								attrDims[attrIsIndex] = dimToExpand;
								attrIs[attrIsIndex++] = expandedTerm;
							}
							
							// Check previously expanded tuple axes
							for (int i = axes.length -1; i > axisIndex; i--) {
								String dim = axes[i];
								if (dim.equals(baseDim)) {
									baseMember = viewTuple.getMemberDefs()[i];
								} else if (attrDimList.contains(dim)) {
									attrDims[attrIsIndex] = dim;
									attrIs[attrIsIndex++] = viewTuple.getMemberDefs()[i];
								}
							}
							
							// Check page dimensions
							for (int i = 0; i < pageAxisDims.length; i++) {
								String dim = pageAxisDims[i];
								if (dim.equals(baseDim)) {
									baseMember = pageAxisDims[i];
								} else if (attrDimList.contains(dim)) {
									attrDims[attrIsIndex] = dim;
									attrIs[attrIsIndex++] = pageAxisDims[i];
								}
							}
							
							// Skip any invalid attribute intersections
							if (isInvalidAttributeIntersection(baseDim, baseMember, attrDims, attrIs)) {
								validTupleExpansion = false;
								break;
							}

						}
					}

					// Tuple expansion
					if (validTupleExpansion) {
						ViewTuple newViewTuple = viewTuple.clone();
						newViewTuple.getMemberDefs()[axisIndex] = expandedTerm;
						expandedTupleGroup.add(newViewTuple);
					}
				}
			}	
			expandedTuples.addAll(expandedTupleGroup);
		}		

 		// Return expanded tuples
		return expandedTuples;
	}

	private boolean isBlankViewTuple(ViewTuple viewTuple) {

		String[] memberAr = viewTuple.getMemberDefs();
		if (memberAr != null) {
			for (String member : memberAr) {
				if ( member.equals(PafBaseConstants.PAF_BLANK)) {
					return true;
				}
			}
		}  		
		return false;    	
	}

	/**
	 *	Method_description_goes_here
	 *
	 * @param viewTuple
	 * @param axisIndex
	 * @param dim
	 * @param clientId
	 * 
	 * @return List<ViewTuple>
	 * @throws PafException 
	 */
	private List<ViewTuple> expandTuple(ViewTuple viewTuple, int axisIndex, String dim, PafClientState clientState) throws PafException {
		ArrayList<ViewTuple> expTuples = new ArrayList<ViewTuple>();
		String term = viewTuple.getMemberDefs()[axisIndex];
		if (term.contains("@")) {
			ExpOperation expOp = new ExpOperation(term);
			String [] expTerms = resolveExpOperation(expOp, viewTuple.getParentFirst(), dim, clientState);
			for (String expTerm : expTerms) {
				ViewTuple vt = viewTuple.clone();
				vt.getMemberDefs()[axisIndex] = expTerm;
				expTuples.add(vt);
			}
		}
		else {
			expTuples.add(viewTuple);
		}
		return expTuples;        
	}



	private String[] expandExpression(String term, boolean parentFirst, String dim, PafClientState clientState) throws PafException {
		String [] expTerms;
		if (term.contains("@")) {
			ExpOperation expOp = new ExpOperation(term);
			expTerms = resolveExpOperation(expOp, parentFirst, dim, clientState);
		}
		else {
			expTerms = new String[] {term};
		}
		return expTerms;
	}



	/**
	 *	Expands a multidemnsional operator for the specified dimension and returns corresponding members
	 *
	 * @param expOp
	 * @param parentFirst Indicates whether the parent member should appear before or after it's children
	 * @param dim
	 * @param clientId If this is null than the full tree for the specified dimension is used. Otherwise
	 * the subtree appropriate for that client will be used.
	 * 
	 * @return String[]
	 * @throws PafException 
	 */
	private String[] resolveExpOperation(ExpOperation expOp, Boolean parentFirst, String dim, PafClientState clientState) throws PafException {

		PafDimTree tree; 
		if (clientState == null)
			tree = baseTrees.get(dim);
		else
			tree = clientState.getUowTrees().getTree(dim);

		// Check for null member Tree   
		if (tree == null) {
			String errMsg = "Dimension tree: [" + dim + "] does not exist";
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error );
			throw pfe;
		}

		List<PafDimMember> memberList = null;

		switch (expOp.getOpCode()) {
		case CHILDREN: 
			memberList = tree.getChildren(expOp.getParms()[0]);
			break;

		case ICHILDREN: 
			memberList = tree.getIChildren(expOp.getParms()[0], parentFirst);
			break;

		case DESC: 

			if (expOp.getParms().length == 1) {
				memberList = tree.getDescendants(expOp.getParms()[0], parentFirst);
			} else {

				memberList = tree
				.getDescendants(expOp.getParms()[0], LevelGenParamUtil.getLevelGenType(expOp.getParms()[1]),
						LevelGenParamUtil.getLevelGenNumber(expOp.getParms()[1]), parentFirst);

			}

			break;

		case IDESC:

			if (expOp.getParms().length == 1) {
				memberList = tree.getIDescendants(expOp.getParms()[0], parentFirst);
			} else {

				memberList = tree
				.getIDescendants(expOp.getParms()[0], LevelGenParamUtil.getLevelGenType(
						expOp.getParms()[1]), LevelGenParamUtil.getLevelGenNumber(expOp.getParms()[1]), parentFirst);

			}

			break;

		case LEVEL:
			memberList = tree.getMembersAtLevel(expOp.getParms()[0], Short.parseShort(expOp.getParms()[1]));
			break;

		case GEN:
			memberList = tree.getMembersAtGen(expOp.getParms()[0], Short.parseShort(expOp.getParms()[1]));
			break;

		case MEMBERS: 
			memberList = new ArrayList<PafDimMember>();
			
			for (String m : expOp.getParms()) {

				if ( m.equals(PafBaseConstants.PAF_BLANK)) {
					memberList.add(new PafBaseMember(m));
				} else {

					//get dim member from tree
					PafDimMember newPafDimMember = tree.getMember(m);
					
					//if memberList has members in it, get last member in tree and see
					//if last and current members are same, if so..don't add dup to list.
					if ( memberList.size() > 0 ) {
						
						//get last dim member
						PafDimMember lastPafDimMember = memberList.get(memberList.size() -1);
						
						//if last = new, continue to next member
						if ( lastPafDimMember.equals(newPafDimMember)) {
							continue;
						}
					}
					
					//add new paf dim member to list
					memberList.add(newPafDimMember);
					
				}
			}
			break;
		}

		//if member list doesn't have any members, throw exception.
		if ( memberList.size() == 0 ) {
			
			throw new PafException("No members found for dimension " + dim + ". Please check view and security settings.", PafErrSeverity.Error);
			
		}
		
		int i=0;
		String[] memberNames = new String[memberList.size()];
		for (PafDimMember m : memberList)
			memberNames[i++] = m.getKey();

		return memberNames;
	}


	/**
	 *	Create a collection of member indexes for specified member tree
	 *
	 * @param memberTree
	 * @param order
	 * @return HashMap<String, Integer>
	 */
	private HashMap<String, Integer> createMemberIndexList(PafDimTree memberTree, TreeTraversalOrder order) {

		HashMap<String, Integer> memberList = new HashMap<String, Integer>();
		String[] memberNames;
		memberNames = memberTree.getMemberNames(order).toArray(new String[0]);

		int i = 0;
		for (String member : memberNames) {
			// Don't overwrite any existing member entries. Shared hiearchies
			// cause inconsistencies with the index numbers.
			if (memberList.get(member) == null) {
				memberList.put(member, i++);
			}
		}

		return memberList;
	}

//	/**
//	 *	Method_description_goes_here
//	 *
//	 * @param dimName
//	 * @return Map<String, Integer>
//	 */
//	public Map<String, Integer> getMemberIndexList(String dimName) {
//		if (!memberIndexLists.containsKey(dimName)) throw new IllegalArgumentException("Dimension name not found in Dimension Index List structure. Dimension: " + dimName);
//		return memberIndexLists.get(dimName);
//	}
//
//	/**
//	 *	Method_description_goes_here
//	 *
//	 * @return Map<String, HashMap<String, Integer>>
//	 */
//	public HashMap<String, HashMap<String, Integer>> getMemberIndexLists() {
//		return memberIndexLists;
//	}


	/**
	 *	Method_description_goes_here
	 *
	 * @return PafDataService
	 */
	public static PafDataService getInstance() {

		if (_instance == null) {

			_instance = new PafDataService();
		}
		return _instance;
	}


	/**
	 *	Get all dimension trees - attribute and base
	 *
	 * @return Map<String,PafDimTree>
	 */
	public Map<String,PafDimTree> getAllDimTrees() {

		Map<String,PafDimTree> allTrees = new HashMap<String,PafDimTree>();

		// Add attribute trees to collection
		allTrees.putAll(getAttributeTrees());

		// Add base trees to collection
		allTrees.putAll(getBaseTrees());

		return allTrees;
	}

	/**
	 *	Return dimension tree for specified dimension
	 *
	 * @param dimension Specified dimension name
	 * @return PafDimTree
	 */
	public PafDimTree getDimTree(String dimension) {
		return getAllDimTrees().get(dimension);
	}


	/**
	 *	Get simple versions of all dimension trees - attribute and base
	 *
	 * @return Set<PafSimpleDimTree>
	 * @throws PafException 
	 */
	public Set<PafSimpleDimTree> getAllSimpleDimTrees() throws PafException {

		Set<PafSimpleDimTree> allSimpleTrees = new HashSet<PafSimpleDimTree>();

		// Get simple version of each dimension tree
		for (String dimension:getAllDimTrees().keySet()) {
			allSimpleTrees.add(getSimpleTree(dimension));
		}

		// Return simple trees
		return allSimpleTrees;
	}

	/**
	 *	Return simple dimension tree for specified dimension
	 *
	 * @param dimension Specified dimension name
	 * 
	 * @return PafSimpleTree
	 * @throws PafException 
	 */
	public PafSimpleDimTree getSimpleTree(String dimension) throws PafException {

		PafDimTree dimTree = null;
		PafSimpleDimTree simpleTree = null;

		// Get selected dimension tree
		dimTree = getAllDimTrees().get(dimension);

		// Get simple version of dimension tree. 
		simpleTree = dimTree.getSimpleVersion();     		

		// Return simple tree
		return simpleTree;
	}


	/**
	 * Determine if a dimension is an attribute dimension
	 * pmack
	 * @param dimName 
	 * @return boolean
	 */
	public boolean isAttributeDimension(String dimName){

		boolean isAttributeDim = false;

		if (getAttributeDimNames().contains(dimName)){
			isAttributeDim = true;
		}

		return isAttributeDim;
	}

	/**
	 *	Return set of attribute dimension names
	 *
	 * @return Set<String>
	 */
	public Set<String> getAttributeDimNames() {

		// Return empy set if there are no attribute trees
		Set<String> dimNames = null;
		if (attributeTrees != null) {
			dimNames = attributeTrees.keySet();
		} else {
			dimNames = new HashSet<String>();
		}
		return dimNames;
	}

	/**
	 *	Return base tree associated with specified attribute dimension
	 *
	 * @param attrDimName Specified attribute dimension name
	 * @return PafBaseTree
	 */
	public PafBaseTree getAssociatedBaseTree(String attrDimName) {

		// Validate attribute dimension name 
		if (!getAttributeTrees().containsKey(attrDimName)) {
			String errMsg = "Unable to retrieve associated attribute dimension - invalid attribute dimension specified.";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          						
		}

		// Get associated base tree
		String baseDimName = getAttributeTree(attrDimName).getBaseDimName();
		PafBaseTree baseTree = getBaseTree(baseDimName);

		// Return associated base tree
		return baseTree;
	}

	/**
	 *	Return the valid attribute member intersections for the specified
	 *  base dimension, base member, and attribute dimension(s). If all attributes
	 *  aren't mapped to the same base member level, then an empty set is 
	 *  returned.
	 * 
	 *  This is a convenience method for getAttributeIntersections(baseDimName,
	 *  baseMemberName, attrDimNames, uowTrees), where uowTrees has been set
	 *  to null.
	 *  
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Array of attribute dimension name(s)
	 *
	 * @return Set<Intersection>
	 */
	public Set<Intersection> getAttributeIntersections(final String baseDimName, final String baseMemberName, 
			final String[] attrDimNames)  {
		
		return getAttributeIntersections(baseDimName, baseMemberName, attrDimNames, null);

	}
	
	/**
	 *	Return the valid attribute member intersections for the specified
	 *  base dimension, base member, and attribute dimension(s). If no uow
	 *  cache trees are supplied, then all members found in the full dimension
	 *  trees are potentially valid. 
	 *  
	 *  If all attributes aren't mapped to the same base member level, then an 
	 *  empty set is returned.
	 * 
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Array of attribute dimension name(s)
	 * @param uowTrees Collection of uow cache trees
	 *
	 * @return Set<Intersection>
	 */
	@SuppressWarnings("unchecked")
	public Set<Intersection> getAttributeIntersections(final String baseDimName, final String baseMemberName, 
			final String[] attrDimNames, MemberTreeSet uowTrees)  {

		Set<Intersection> attrIntersections = new HashSet<Intersection>();
		PafBaseTree baseTree = null;

		// Throw exception, if attribute dim names is null or the array is empty
		if ( attrDimNames == null || attrDimNames.length == 0 ) {
			String errMsg = "getAttributeIntersections error - attribute dim names are null or empty";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		
		int attrDimCount = attrDimNames.length;
		 
		Set<Intersection> level0AttrCombinations = new HashSet<Intersection>();

		// Get the set of level 0 attribute member intersections for the selected base member
		if (uowTrees == null) {
			baseTree = getBaseTree(baseDimName);
		} else {
			baseTree = (PafBaseTree) uowTrees.getTree(baseDimName);
		}
		level0AttrCombinations = baseTree.getAttributeIntersections(baseMemberName, attrDimNames);

		// Cycle through each level 0 attribute intersection and generate all valid member 
		// combinations of these level 0 attributes and their ancestor members.
		for (Intersection attrIs:level0AttrCombinations) {

			// Generate an array of member lists containing each attribute dimension's
			// valid level 0 attributes along with their ancestors
			String[] attrMemberCombo = attrIs.getCoordinates();
			List<String>[] memberLists = new List[attrDimCount];
			for (int i = 0; i < attrDimCount; i++) {
				String attrDimName = attrDimNames[i];
				String attrMemberName = attrMemberCombo[i];
				memberLists[i] = new ArrayList<String>();
				memberLists[i].add(attrMemberCombo[i]);	
				List<PafDimMember> ancestors = getAttributeTree(attrDimName).getAncestors(attrMemberName);
				for (PafDimMember attrMember:ancestors) {
					memberLists[i].add(attrMember.getKey());	    			
				}
			}

			// Use the odomoter to generate all the possible attribute member combinations and
			// add them to the intersection collection.
			Odometer isIterator = new Odometer(memberLists);
			while (isIterator.hasNext()) {
				List<String> isList = isIterator.nextValue();
				Intersection is = new Intersection(attrDimNames, isList.toArray(new String[0]));
				attrIntersections.add(is);
			}

		}

		// Return the set of valid attribute intersections
		return attrIntersections;
	}


	/**
	 *	Return the invalid attribute member intersections for the specified
	 *  base tree, base member, and attribute dimension(s)
	 * 
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Array of attribute dimension name(s)
	 *
	 * @return Set<Intersection>
	 */
	@SuppressWarnings("unchecked")
	public Set<Intersection> getInvalidAttributeIntersections(String baseDimName, String baseMemberName, String[] attrDimNames)  {

		int attrIndex = 0;
		Set<Intersection> invalidAttrIntersections = null;
		Set<Intersection> validAttrIntersections = null;
		List<String>[] allAttrMembers = null;
		PafBaseTree baseTree = null;

		// Get baseMemberTree and baseMember
		baseTree = getBaseTree(baseDimName);

		// Get all possible attribute member intersections
		allAttrMembers = new List[attrDimNames.length];
		for (String attrDimName:attrDimNames) {

			// Verify attribute dimension name
			PafDimTree attrTree = null;
			if (baseTree.getAttributeDimNames().contains(attrDimName)) {
				attrTree = getAttributeTree(attrDimName);
			} else {
				String errMsg = "Unable to get invalid attribute intersections - [" + attrDimName
				+ "] is not an attribute dimension mapped to the base dimension: " + baseDimName;
				logger.error(errMsg);
				IllegalArgumentException iae = new IllegalArgumentException(errMsg);
				throw(iae);
			}

			// Add all members of current attribute dimension
			List<String> dimMembers = attrTree.getMemberNames(TreeTraversalOrder.POST_ORDER);
			allAttrMembers[attrIndex] = dimMembers;
			attrIndex++;
		}

		// Create cross product of all valid attribute members across
		// each attribute dimension
		int intersectionCount = 1;
		for (List<String> members:allAttrMembers) {
			intersectionCount *= members.size();
		}
		invalidAttrIntersections = new HashSet<Intersection>(intersectionCount);
		Odometer isIterator = new Odometer(allAttrMembers);
		List<String> isList = null;
		while (isIterator.hasNext()) {

			// Get next intersection (in list form)
			isList = isIterator.nextValue();

			// Convert list into custom intersection object
			Intersection is = new Intersection(attrDimNames, isList.toArray(new String[0]));

			// Add intersection to intersection collection
			invalidAttrIntersections.add(is);
		}

		// Remove valid intersections
		validAttrIntersections = getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
		invalidAttrIntersections.removeAll(validAttrIntersections);

		// Return invalid intersections
		return invalidAttrIntersections;
	}

	/**
	 *	Determine if the specified attribute member combination is valid
	 *	for the specified base member and attribute dimensions
	 *
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrIs Attribute member intersection
	 * @param attrISSet Attribute Intersection Set
	 * 
	 * @return True if the attribute intersection is valid
	 */
	public boolean isValidAttributeIntersection(String baseDimName, String baseMemberName, String[] attrDimNames, String[] attrIs,
			Set<Intersection> attrISSet) {

		boolean isValid = false;

		// Create custom intersection object
		Intersection intersection = new Intersection(attrDimNames, attrIs);

		// Validate intersection
		if (attrISSet.contains(intersection)) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 *	Determine if the specified attribute member combination is valid
	 *	for the specified base member and attribute dimensions
	 *
	 *  This is a convenience method that calls isValidAttributeIntersection(
	 *  baseDimName, baseMemberName, uowTrees, attrDimNames, attrIs) with
	 *  uowTrees set to null.
	 *  
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrIs Attribute member intersection
	 * 
	 * @return True if the attribute intersection is valid
	 */
	public boolean isValidAttributeIntersection(String baseDimName, String baseMemberName, String[] attrDimNames, String[] attrIs) {
		return isValidAttributeIntersection(baseDimName, baseMemberName, null, attrDimNames, attrIs);
	}

	/**
	 *	Determine if the specified attribute member combination is valid
	 *	for the specified base member, attribute dimensions, and uow
	 *  trees.
	 *
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param uowTrees Collection of uow cache trees
	 * @param attrDimNames Attribute dimension names
	 * @param attrIs Attribute member intersection
	 * 
	 * @return True if the attribute intersection is valid
	 */
	public boolean isValidAttributeIntersection(String baseDimName, String baseMemberName, MemberTreeSet uowTrees, 
			String[] attrDimNames, String[] attrIs) {

		boolean isValid = false;

		// Create custom intersection object
		Intersection intersection = new Intersection(attrDimNames, attrIs);

		// Get set of valid intersection objects
		Set<Intersection> intersections = getAttributeIntersections(baseDimName, baseMemberName, attrDimNames, uowTrees);

		// Validate intersection
		if (intersections.contains(intersection)) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 *	Determine if the specified attribute member combination is invalid
	 *	for the specified base member and attribute dimensions
	 *
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrIs Attribute member intersection
	 * 
	 * @return True if the attribute intersection is invalid
	 */
	public boolean isInvalidAttributeIntersection(String baseDimName, String baseMemberName, String[] attrDimNames, String[] attrIs) {
		return !isValidAttributeIntersection(baseDimName, baseMemberName, attrDimNames, attrIs);
	}

	/**
	 *	Return attribute tree for specified dimension
	 *
	 * @param dimension Specified dimension name
	 * @return PafAttributeTree
	 */
	public PafAttributeTree getAttributeTree(String dimension) {
		return attributeTrees.get(dimension);
	}

	/**
	 * @return the attributeTrees
	 */
	public Map<String, PafAttributeTree> getAttributeTrees() {
		return attributeTrees;
	}

	/**
	 * @param attributeTrees the attributeTrees to set
	 */
	public void setAttributeTrees(Map<String, PafAttributeTree> attributeTrees) {
		this.attributeTrees = attributeTrees;
	}

	/**
	 *	Return set of names for any attribute dimensions corresponding to specified base dimension
	 *
	 * @param baseDimName Base dimension name
	 * @return Map<String, PafAttributeTree>
	 */
	public Map<String, PafAttributeTree> getAttributeTrees(String baseDimName) {

		Set<String> attrDimNames = null;
		Map<String, PafAttributeTree> attrTrees = new HashMap <String, PafAttributeTree>();

		// Validate base dimension name
		if (!getBaseTrees().containsKey(baseDimName)) {
			String errMsg = "Unable to retrieve attribute trees - invalid base dimension: " + baseDimName
			+ " specified.";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);
			throw iae;
		}

		// Get names of attribute dimensions corresponding to base dimension
		attrDimNames = getBaseTree(baseDimName).getAttributeDimNames();

		// Add all selected trees to collection
		for (String attrDimName:attrDimNames) {
			attrTrees.put(attrDimName, getAttributeTree(attrDimName));			
		}

		// Return trees, or empty set if no match is found
		return attrTrees;
	}


	/**
	 *	Return set of base dimension names
	 *
	 * @return Set<String>
	 */
	public Set<String> getBaseDimNames() {
		return baseTrees.keySet();
	}

	/**
	 *	Return set of names of any base dimensions that have been
	 *  assigned one or more attribute dimensions
	 *
	 * @return Set<String>
	 */
	public Set<String> getBaseDimNamesWithAttributes() {

		Set<String> baseDimNames = new HashSet<String>();
		Map<String, PafAttributeTree> attrTrees = getAttributeTrees();

		// Return empty set if no attribute dimensions exist
		if (attrTrees == null) {
			return baseDimNames;
		}

		// Iterate through all attribute dimensions and append all associated
		// base dimensions to base dimension name set
		for (PafAttributeTree attrTree:attrTrees.values()) {
			String baseDimName = attrTree.getBaseDimName();
			if (!baseDimNames.contains(baseDimName)) {
				baseDimNames.add(baseDimName);
			}			
		}

		// Return all base dimensions that have been assigned one or more attribute dimensions
		return baseDimNames;
	}

	/**
	 *	Return set of base members corresponding to specified attribute dimension and member
	 *
	 * @param attrDimName Attribute dimension name
	 * @param attrMemberName Attribute member
	 *
	 * @return Set<PafBaseMember>
	 */
	public Set<PafBaseMember> getBaseMembers(String attrDimName, String attrMemberName) {

		Set<String> baseMemberNames = null;
		Set<PafBaseMember> baseMembers = new HashSet<PafBaseMember>();
		PafAttributeTree attrTree = null;
		PafBaseTree baseTree = null;

		// Validate attribute dimension name 
		if (getAttributeTrees().containsKey(attrDimName)) {
			attrTree = getAttributeTrees().get(attrDimName);
		} else {
			String errMsg = "Unable to retrieve base members - invalid attribute dimension specified.";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          						
		}

		// Get corresponding base member names
		baseMemberNames = attrTree.getBaseMemberNames(attrMemberName);

		// Convert all base member names to their corresponding base member objects
		baseTree = getBaseTree(attrTree.getBaseDimName());
		for (String baseMemberName:baseMemberNames) {
			baseMembers.add(baseTree.getMember(baseMemberName));
		}

		// Return base members, or empty set if no match is found
		return baseMembers;
	}

	/**
	 * @return the baseTrees
	 */
	public Map<String, PafBaseTree> getBaseTrees() {
		return baseTrees;
	}    
	/**
	 * @param baseTrees the baseTrees to set
	 */
	public void setBaseTrees(Map<String, PafBaseTree> baseTrees) {
		this.baseTrees = baseTrees;
	}

	/**
	 *	Return base tree for specified dimension
	 *
	 * @param dimension Specified dimension name
	 * @return PafBaseTree
	 */
	public PafBaseTree getBaseTree(String dimension) {
		return getBaseTrees().get(dimension);
	}

	/**
	 *	Return collection of base dimension trees that have been 
	 *  assigned one or more attribute dimensions
	 *  
	 * @return Map<String, PafBaseTree>
	 */
	public Map<String, PafBaseTree> getBaseTreesWithAttributes() {

		Set<String> baseDimNames = null;
		Map<String, PafBaseTree> baseDimTrees = new HashMap<String, PafBaseTree>();

		// Get list of base dimensions containing one or more attribute dimensions
		baseDimNames = getBaseDimNamesWithAttributes();

		// Iterate through list of base dimension names, get associated tree, 
		// and add to base tree collection
		for (String baseDimName:baseDimNames) {
			baseDimTrees.put(baseDimName, getBaseTree(baseDimName));
		}

		// Return selected base trees
		return baseDimTrees;
	}


	/**
	 *	Evaluate the default ruleset if warranted by the client state paf
	 *  planner configuration settings.
	 *
	 * @param clientState Client state object
	 * @throws PafException
	 */
	public void evaluateDefaultRuleset(PafClientState clientState) throws PafException {

		PafPlannerConfig plannerConfig = clientState.getPlannerConfig();

		// Determine if a default evaluation is warranted. Only execute the default
		// evaluation process if at least one of the following conditions have been met:
		//
		// 1. The default eval enabled working version flag is set to true
		// 2. At least one version has been specified in the "defaultEvalRevVersion" tag
		//
		if (!plannerConfig.isDefaultEvalEnabledWorkingVersion() &&
				(plannerConfig.getDefaultEvalRefVersions() == null  || plannerConfig.getDefaultEvalRefVersions().length == 0)) {
			return;
		}

		
		// Initialization
		logger.info("Executing Default Strategy");
		RuleBasedEvalStrategy evalStrategy = new RuleBasedEvalStrategy();
		PafUowCache cache = getUowCache(clientState.getClientId());
		EvalState evalState = new EvalState(clientState, cache);
		evalState.setMeasureRuleSet(clientState.getDefaultMsrRuleset());

		// Perform default evaluation
		evalState.setDefaultEvalStep(true);
		evalStrategy.executeDefaultStrategy(evalState);   
		evalState.setDefaultEvalStep(false);

		// Push updated data into multi-dimensional database for consistency 
		// in case of aggregate changes, only if corresponding planner config 
		// option is set.
		if (plannerConfig.isMdbSaveWorkingVersionOnUowLoad()) {
			String dsId = clientState.getApp().getMdbDef().getDataSourceId();
			logger.info("Saving datacache to data provider: [" + dsId + "]" );           
			this.saveDataCache(clientState);
		}
	}
	
	/**
	 *	Evaluate view cell changes
	 *
	 * @param evalRequest Evaluation request object
	 * @param clientState Client state object
	 * @param dsCache
	 * @param sliceParms
	 * @return void
	 * @throws PafException
	 */
	public void evaluateView(EvaluateViewRequest evalRequest, PafClientState clientState, PafDataCache dsCache, PafDataSliceParms sliceParms) throws PafException {

		PafView currentView = clientState.getView(evalRequest.getViewName());
		logger.info("Evaluating view: " + currentView.getName() + " for client " + evalRequest.getClientId() + " using measure set " + evalRequest.getMeasureSetKey());
		PafDataSlice newSlice = evalRequest.getDataSlice();
		PafMVS pafMVS = clientState.getMVS(PafMVS.generateKey(currentView, currentView.getViewSections()[0]));
		PafApplicationDef appDef = clientState.getApp();
		PafViewSection currentViewSection = pafMVS.getViewSection();
		String versionDim = appDef.getMdbDef().getVersionDim();
		boolean hasAttributes = currentViewSection.hasAttributes();

		if (newSlice.isCompressed()) {
			logger.info("Uncompressing data slice\n" );
			newSlice.uncompressData();
		}

		logger.info("Updating data slice cache with new slice\n" + sliceParms.toString() );
		dsCache.update(newSlice, sliceParms);

		logger.info("Executing Strategy");
		IEvalStrategy evalStrategy = new RuleBasedEvalStrategy();

		SliceState sliceState = new SliceState(evalRequest);
		sliceState.setDataSliceParms(sliceParms);
		EvalState evalState = new EvalState(sliceState, clientState, dsCache);

		// Set the measure rule set. If a measure rulset name is specified,
		// use that ruleset, else just use the default rule set.
		RuleSet measureRuleset;
		if (evalRequest.getRuleSetName() == null || evalRequest.getRuleSetName().trim().equals("")) {
			measureRuleset = clientState.getDefaultMsrRuleset();
		}
		else {
			measureRuleset = clientState.getMsrRulsetByName(evalRequest.getRuleSetName());
		}
		evalState.setMeasureRuleSet(measureRuleset);

		// Check for contribution percent formulas on view section
		List<String> contribPctVersions = appDef.getContribPctVersions();
		String[] viewSectionVersions = currentViewSection.getDimensionMembers(versionDim); 
		for (String viewSectionVersion : viewSectionVersions) {
			if (contribPctVersions.contains(viewSectionVersion)) {
				evalState.setContribPctFormulas(true);
				break;
			}
		}
		
		// Perform the appropriate evaluation strategy depending on whether or not
		// the view section contains attributes.
		if (!hasAttributes) {
			// Regular evaluation strategy
			dsCache = evalStrategy.executeStrategy(evalState);
		} else {
			// Attribute evaluation strategy
			evalState.setAxisPriority(currentViewSection.getDimensionCalcSequence());
			dsCache = evalStrategy.executeAttributeStrategy(evalState);
		}

		logger.info("Evaluation Complete");
		
	}
	
	/**
	 *	Evaluate view cell changes
	 *
	 * @param evalRequest Evaluation request object
	 * @param clientState Client state object
	 *
	 * @return PafDataSlice
	 * @throws PafException
	 */
	public PafDataSlice evaluateView(EvaluateViewRequest evalRequest, PafClientState clientState) throws PafException {
		PafView currentView = clientState.getView(evalRequest.getViewName());
		PafMVS pafMVS = clientState.getMVS(PafMVS.generateKey(currentView, currentView.getViewSections()[0]));
		PafDataCache dsCache = pafMVS.getDataSliceCache();
		PafDataSliceParms sliceParms = pafMVS.getDataSliceParms();
		
		evaluateView(evalRequest, clientState, dsCache, sliceParms);
		
		//Return updated data slice
		PafDataSlice dataSlice = getDataSlice(dsCache, sliceParms);

		return dataSlice;
	}
	
	/**
	 *	Returns Data Slice
	 *
	 * @param dsCache
	 * @param sliceParms
	 * @return PafDataSlice
	 * @throws PafException
	 */
	public PafDataSlice getDataSlice(PafDataCache dsCache, PafDataSliceParms sliceParms)throws PafException{
//		Return updated data slice
		//FIXME (AF) Only repull/non-reference intersections (UpdatedDataSlice(dataSlice, sliceParms, filter)(slight performance enhancement)
		PafDataSlice dataSlice = dsCache.getDataSlice(sliceParms);

		// compress slice for return.
		try {
			//if the data array is null set it to null.  The client checks for the null.
			if (dataSlice.getData().length == 0){
				dataSlice.setData(null);
			}else{ 
				dataSlice.compressData();
			}
		}
		catch (IOException iox) {
			throw new PafException(iox.getLocalizedMessage(), PafErrSeverity.Error);
		}
		
		return dataSlice;
	}

	/**
	 *	Save updated uow cache to mdb
	 *
	 * @param clientState Client state object
	 * @throws PafException
	 */
	public void saveDataCache(PafClientState clientState) throws PafException { 

//		TTN-1406		
//		IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//		IMdbData mdbData = mdbClassLoader.getMdbDataProvider();
//		mdbData.sendData(this.uowCache.get(clientId));

		String dsId = clientState.getApp().getMdbDef().getDataSourceId();
		IPafConnectionProps connProps = clientState.getDataSources().get(dsId);
		String clientId = clientState.getClientId();
		this.getMdbDataProvider(connProps).sendData(this.uowCache.get(clientId), clientState);
	}

	/**
	 *	Method_description_goes_here
	 *
	 * @param memberName
	 * @return String
	 */
	public String findMemberAxis(String memberName) {
		String axis = "";
		for (PafBaseTree tree: this.baseTrees.values()) {
			if (tree.hasMember(memberName)) axis = tree.getRootNode().getKey();
		}
		// TODO Auto-generated method stub
		return axis;
	}
	
	public List<SecurityGroup> getGroups(String app){
		Session session = PafMetaData.currentPafClientCacheDBSession();
		Transaction tx = null;
		List<SecurityGroup> securityGroups = null;
		
		//Add administrator check here

		
		try {
			
			tx = session.beginTransaction();
						
			securityGroups = session.createQuery("from SecurityGroup where application.name = '" + app + "'").list();	
			
			
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
		}  
		
		return securityGroups;
	}
	
	
	public boolean setGroups(List<SecurityGroup> securityGroups, String app) {
		boolean isSuccess = true;
		Session session = PafMetaData.currentPafClientCacheDBSession();
		Transaction tx = null;
		
		//Add administrator check here
				
		//get application
		Map<String, Application> applicationMap = getApplicationMap(session);
		
		try {
			
			tx = session.beginTransaction();
		
			Query deleteQuery = session.createQuery("delete from SecurityGroup sg where sg in (from SecurityGroup where application.name = ?)").setParameter(0, app);
			
			int recordsUpdated = deleteQuery.executeUpdate();
			
			logger.info("Cleared " + recordsUpdated + " Security Group records.");
			
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
			isSuccess = false;
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
			return isSuccess;
		} 
		
		if (securityGroups != null){
			//begin a new transaction
			tx = session.beginTransaction();

			for (SecurityGroup securityGroup : securityGroups){

				//get app id from cell note
				String appName = securityGroup.getApplication().getName();

				//if in application map, use, otherwise add to map as new.
				if( appName != null && applicationMap.containsKey(appName)) {

					securityGroup.setApplication(applicationMap.get(appName));
				}else{

					applicationMap.put(appName, securityGroup.getApplication());
				}

				try {
					//save the new one
					session.save(securityGroup);
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
					isSuccess = false;
					PafErrHandler.handleException(ex, PafErrSeverity.Error);
					return isSuccess;
				}
			}

			//commit the transaction
			tx.commit(); 
		}
		
		logger.debug("Set Security Groups - " + new Date());
		return isSuccess;
	}
	
	/**
	 * 
	 *  Returns a map<application name, application>.
	 *
	 * @param s Session to use
	 * @return map of application names and apps
	 */
	private static Map<String, Application> getApplicationMap(Session s) {
		
		logger.info("DEBUG - Start getApplicationMap(Session) - " + new Date());
		
		Map<String, Application> ApplicationMap = new HashMap<String, Application>();
		
		//get list of apps
		List<Application> ApplicationList = s.createQuery("from Application").list();;
		
		if ( ApplicationList != null ) {
		
			//loop over apps and add to map
			for (Application Application : ApplicationList ) {
				
				ApplicationMap.put(Application.getName(), Application);
				
			}
			
		}		
		
		logger.debug("DEBUG - End getApplicationMap(Session) - " + new Date());
		
		return ApplicationMap;
		
	}


	/**
	 * 
	 */
	private PafDataService() {
		logger.info("Initializing PafDataService"); 
		loadApplications();
	}


	/**
	 *	This constructor is used for UNIT TESTING only, bypassing the normal
	 *  construction processing for the data service (ie. loading+ new trees, etc.)
	 *
	 * @param isTest Can be set to TRUE or FALSE
	 */
	private PafDataService(boolean isTest) {

	}

	/**
	 *	Loads data for defined applications
	 *  Primarily loads pafBaseMember trees for a particular application
	 *
	 */
	private void loadApplications() {

		// assumes a single application at this point
		// loads all dimensions into the tree hashmap, so at the very least
		// multipls apps couldn't share dimensions

		// Attribute trees must be loaded first, since attribute info is needed 
		// to populate the base trees
		try {

			List<PafApplicationDef> pafApps = PafAppService.getInstance().getApplications();
			
			for (PafApplicationDef pafApp : pafApps ) {
				
				String appId = pafApp.getAppId();
				String appString = "for application [" + appId + "]";
				IPafConnectionProps connProps = (IPafConnectionProps) 
					PafMetaData.getAppContext().getBean(pafApp.getMdbDef().getDataSourceId());

// 	TTN-1406 Commented out this code for the time being until we figure out a way to get custom class loader to work.	
				
//				// Add multi-dimensional database libraries to classpath
//				logger.info("Loading multidimensional database class libraries " + appString);
//				IMdbClassLoader mdbClassLoader = null;
//				mdbClassLoader = this.getMdbClassLoader(connProps);
//				mdbClassLoader.load();

				if ( PafMetaData.getServerSettings().isAutoLoadAttributes() ) {
					logger.info("Clearing existing attribute cache " + appString);
					deleteAllCacheAttrDim();

					IMdbMetaData metaData = null;
					PafMdbProps mdbProps = null;
					
					logger.info("Retrieving attribute dimension information from Metadata provider " + appString);
//					TTN-1406
//					metaData = mdbClassLoader.getMetaDataProvider();
					metaData = this.getMetaDataProvider(connProps);
					mdbProps = metaData.getMdbProps();

					logger.info("Caching attribute dimension information " + appString); 
					String[] attrDimFilter = pafApp.getEssAttrDimFilter();
					String[] attrDims = null;
					if (attrDimFilter == null || attrDimFilter.length == 0) {
						attrDims = mdbProps.getAttributeDims();
					} else {
						attrDims = attrDimFilter;
						logger.info("Using attribute dimension filter: " + StringUtils.arrayToString(attrDims));
					}
					cacheAttributeDims(attrDims, pafApp);
					
					// Disconnect
					metaData.disconnect();
				}

				logger.info("Loading attribute trees " + appString);
				this.initAttributeMemberTreeStore();

				logger.info("Loading base trees " + appString);				
				
				this.initMemberTreeStore(pafApp);
																
				this.initCellNotes(pafApp);
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
		}
	}

	/**
	 * 
	 * Initializes cell note data. 
	 *
	 * @param pafApp The application to initialize.
	 * @throws PafException
	 */
	@SuppressWarnings("unchecked")
	private void initCellNotes(PafApplicationDef pafApp) throws PafException {
		
		//if clear all is true, delete all cell notes for every app and every datasource
		if ( PafMetaData.getServerSettings().isClearAllCellNotes() ) {
			
			PafCellNoteManager.getInstance().deleteCellNotes();
		
		//if just clear cell notes is ture, delete cell notes for current app and current datasource.
		} else if ( PafMetaData.getServerSettings().isClearCellNotes() ) {
			
			PafCellNoteManager.getInstance().deleteCellNotes(pafApp.getAppId(), pafApp.getMdbDef().getDataSourceId());
			
		}
		
		IPafConnectionProps connProps = (IPafConnectionProps) 
					PafMetaData.getAppContext().getBean(pafApp.getMdbDef().getDataSourceId());
		
		PafMdbProps mdbProps = this.getMdbProps(connProps);
		
		if ( mdbProps != null && mdbProps.getBaseDims() != null) {
		
			//get list of base dims
			List<String> dimensions = new ArrayList(Arrays.asList(mdbProps.getBaseDims()));
			
			//if cached attributes dims exists, add them to dim list
			if ( mdbProps.getCachedAttributeDims() != null ) {
				
				dimensions.addAll(Arrays.asList(mdbProps.getCachedAttributeDims()));
				
			}
									
			//set current cell note dimensions
			PafCellNoteManager.getInstance().setCurrentDimensions(dimensions.toArray(new String[0]));
			
		}
		
	}


	/**
	 *	Remove uow cache for selected client id
	 *
	 * @param clientId Client state id
	 */
	public void removeUowCache(String clientId) {
		
		if ( clientId != null ) {
			uowCache.remove(clientId);
			systemLockedIntersections.remove(clientId);
		}
	}

	/**
	 *	Return count of uow caches
	 *
	 * @return int
	 */
	public int getUowCacheCnt() {
		return uowCache.size();
	}

	/**
	 *	Get List of Properties from MDB
	 *
	 * @param connProps Connection properties
	 *
	 * @return MdbProps Basic multidimensional properties
	 * @throws PafException 
	 */
	public PafMdbProps getMdbProps(IPafConnectionProps connProps) throws PafException {

//		TTN-1406		
//		IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//		IMdbMetaData metaData = mdbClassLoader.getMetaDataProvider();
//		PafMdbProps mdbProps = metaData.getMdbProps();
		PafMdbProps mdbProps = getMetaDataProvider(connProps).getMdbProps();

		if(attributeTrees != null){
			mdbProps.setCachedAttributeDims(attributeTrees.keySet().toArray(new String[0]));
		}

		return mdbProps;
	}    

	public void cacheUow(String clientId) {

		uowCache.get(clientId);
	}
		
	/**
	 *	Returns a List with an expanded expressionList.
	 *  The Filtering is done within the current UOW
	 *
	 * @param PafDimSpec 
	 *
	 * @return A List<String> An expanded list of members
	 */
	public List<String> expandExpressionList(String dim, List<String> expressionList, PafClientState clientState) throws PafException{
		
		//Expand expression if needed
		List<String> expandedExpressionList = new ArrayList<String>();
		for (String term : expressionList) {
			expandedExpressionList.addAll(Arrays.asList(expandExpression(term, true, dim, clientState)));
		}

		return expandedExpressionList;
	}
	
    /**
     *	Get Filtered meta-data from Essbase
     *
     * @param clientId Client state id
     * @param appDef Paf Application Definition
	 * @param expandedUow Fully expanded unit of work
	 * @throws PafException
     */
	public PafDimSpec[] getFilteredMetadata(PafClientState clientState, PafApplicationDef appDef, PafDimSpec[] uow) throws PafException {
		
		//Convert PafDimSpec[] to Map
		Map<Integer, List<String>> expandedUOW = new HashMap<Integer, List<String>>();
		Integer uowDimCount = 0;
		for (PafDimSpec dimSpec : uow ) {
			List<String> members = new ArrayList<String>();
			for ( String member : dimSpec.getExpressionList()){
				members.add(member);
			}
			expandedUOW.put(uowDimCount++, members);
		}
		
		//Save the connection props for this application id into the clientstate
		String dsId = appDef.getMdbDef().getDataSourceId();
		IPafConnectionProps connProps = (IPafConnectionProps) PafMetaData.getAppContext().getBean(dsId);
		clientState.getDataSources().put(dsId, connProps);

//		TTN-1406		
//		IMdbClassLoader mdbClassLoader = this.getMdbClassLoader(connProps);
//		IMdbData mdbData = mdbClassLoader.getMdbDataProvider();
		IMdbData mdbData = getMdbDataProvider(connProps);
		
		//Filter the data using an Essbase MDX query with the Non Empty flag
		PafDimSpec[] filteredMetadata = mdbData.getFilteredMetadata(expandedUOW, appDef);
		
		return filteredMetadata;
	}


	/**
	 *	Return the valid list of attribute members and rollups
	 *  on the requested attribute dimension, in light of selections 
	 *  on the related base dimension and selections on any 
	 *  related attribute members
	 *  
	 * @param attrRequest Valid attribute request object
	 * @return PafValidAttrResponse Valid attribute response object
	 * 
	 * @param requestedAttrDim - Requested attribute dimension
	 * @param selBaseDim - Selected base dimension
	 * @param selBaseMember - Selected base member
	 * @param selAttrSpecs - Selected attribute dimension (can be null)
	 * 
	 * @return String[]
	 */
	public String[] getValidAttributeMembers(String requestedAttrDim, String selBaseDim, String selBaseMember, PafDimSpec[] selAttrSpecs) {

		// Validate parameters
		if (requestedAttrDim == null || requestedAttrDim == "") {
			String errMsg = "Unable to get valid attribute members - reqAttriDim is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		if (selBaseDim == null || selBaseDim == "") {
			String errMsg = "Unable to get valid attribute members - selBaseDim is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		if (selBaseMember == null || selBaseMember == "") {
			String errMsg = "Unable to get valid attribute members - selBaseMember is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		
		// Execute simplified logic if there are no attribute member selections
		if (selAttrSpecs == null || selAttrSpecs.length == 0) {
			
			// Get set of  all valid attribute intersections
			String allAttrDims[] = new String[1];
			allAttrDims[0] = requestedAttrDim;
			Set<Intersection> validAttrIntersections = getAttributeIntersections(selBaseDim, selBaseMember, allAttrDims);

			// Return set of valid attributes
			Set<String> validAttrSet = new HashSet<String>();
			for (Intersection validAttrIS:validAttrIntersections) {
				validAttrSet.add(validAttrIS.getCoordinate(requestedAttrDim));
			}
			return validAttrSet.toArray(new String[0]);
			
		}
		
		// Combine requested attribute dimension and selected attribute dimension
		// array into a single array
		String[] allAttrDims = new String[selAttrSpecs.length + 1];
		allAttrDims[0] = requestedAttrDim;
		int i = 1;
		for (PafDimSpec dimSpec : selAttrSpecs) {
			allAttrDims[i++] = dimSpec.getDimension();	
		}
		
		// Create map of attribute selections
		Map<String, Set<String>> selAttrMap = new HashMap<String, Set<String>>();
		for (PafDimSpec dimSpec : selAttrSpecs) {
			Set<String> selAttributes = new HashSet<String>(Arrays.asList(dimSpec.getExpressionList()));
			selAttrMap.put(dimSpec.getDimension(), selAttributes);
		}
		
		// Get the set of valid attribute member intersections for the selected base member
		Set<Intersection> validAttrIntersections = getAttributeIntersections(selBaseDim, selBaseMember, allAttrDims);

		// Remove any intersections for unselected attributes
		Set<Intersection> invalidLevel0AttrIntersections = new HashSet<Intersection>();
		for (String selAttrDim:selAttrMap.keySet()) {
			Set<String> selAttributes = selAttrMap.get(selAttrDim);
			for (Intersection attributeIS:validAttrIntersections) {
				if (!selAttributes.contains(attributeIS.getCoordinate(selAttrDim))) {
					invalidLevel0AttrIntersections.add(attributeIS);
				}
			}
		}
		validAttrIntersections.removeAll(invalidLevel0AttrIntersections);
		
		// Get the unique list of valid attributes
		Set<String> validAttributeSet = new HashSet<String>();
		for (Intersection attrIs:validAttrIntersections) {
			validAttributeSet.add(attrIs.getCoordinate(requestedAttrDim));
		}
				
		// Add in ancestors of each unique attribute
		Set<String> validAncestors = new HashSet<String>();
		for (String validAttributeMember:validAttributeSet) {

			List<PafDimMember> ancestors = getAttributeTree(requestedAttrDim).getAncestors(validAttributeMember);
			for (PafDimMember attrMember:ancestors) {
				validAncestors.add(attrMember.getKey());	    			
			}

		}
		validAttributeSet.addAll(validAncestors);
		
		// Return valid attribute members
		String[] validAttributeMembers = validAttributeSet.toArray(new String[0]);
		return validAttributeMembers;
	}


	
	
	
	
	
	
	

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        