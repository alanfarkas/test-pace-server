/*
 *	File: @(#)IntersectionUtil.java 	Package: com.pace.base.data 	Project: Paf Base Libraries
 *	Created: Jun 29, 2006  		By: JWatkins
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
package com.pace.base.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.mdb.PafAttributeTree;
import com.pace.base.mdb.PafBaseTree;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;
import com.pace.base.utility.Odometer;
import com.pace.base.utility.TimeBalance;
import com.pace.base.view.PafViewSection;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class IntersectionUtil {

	private static Logger logger = Logger.getLogger(IntersectionUtil.class);
    /**
     * Explodes a cell intersection into its corresponding floor intersections 
     * 
     * @param is Cell intersection
     * @param evalState Evaluation state
     * 
     * @return List<Intersection>
     */
    public static List<Intersection> buildFloorIntersections(Intersection is, IPafEvalState evalState) {
    	
    	List<Intersection> floorIntersections = null;
    	if (!evalState.isAttributeEval()) {
    		floorIntersections = buildBaseFloorIntersections (is, evalState);
    	} else {
    		floorIntersections = buildAttrFloorIntersections (is, evalState);
    	}
    	return floorIntersections;
    }
    

    /**
     * Explode an attribute intersection into its corresponding base floor intersections 
     * 
     * @param is Attribute intersection
     * @param evalState Evaluation state
     * 
     * @return List<Intersection>
     */
    private static List<Intersection> buildAttrFloorIntersections(Intersection is, IPafEvalState evalState) {
    	
    	PafDataCache dataCache = evalState.getDataCache();

		// Create the list of base dimensions that will be exploded as part of an attribute
		// allocation. Currently, allocations are not performed over the measures dimension.
		Set<String> explodedBaseDims = new HashSet<String>(Arrays.asList(dataCache.getBaseDimensions()));
		Set<String> omittedDims = new HashSet<String>();
		omittedDims.add(dataCache.getMeasureDim());
		explodedBaseDims.removeAll(omittedDims);
    	
    	List<Intersection> floorIntersections = new ArrayList<Intersection>(
    			getBaseIntersections(dataCache, is, dataCache.getDimTrees(), explodedBaseDims));

    	return floorIntersections;
    }



    /**
     * Explode a base intersection into its corresponding floor intersections 
     * 
     * @param is Attribute intersection
     * @param evalState Evaluation state
     * 
     * @return List<Intersection>
     */
	private static List<Intersection> buildBaseFloorIntersections(Intersection is, IPafEvalState evalState) {
    	
    	 
        MemberTreeSet mts = evalState.getClientState().getUowTrees();
        String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
        String timeDim = evalState.getAppDef().getMdbDef().getTimeDim(); 
        PafDimTree tree;
        List<PafDimMember> desc = null;
        Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
        List<String> memberList;
        
            
        for ( String dim : is.getDimensions() ) {

        	// Don't do measure dimension children for now
        	if (dim.equals(msrDim)) {
        		memberList = new ArrayList<String>();
        		memberList.add(is.getCoordinate(msrDim));
        		memberListMap.put(dim, memberList);
        		continue;
        	}

           	// Time dimension - apply time balance logic
        	if (dim.equals(timeDim)) {
        		memberList = buildTimeFloorMembers(is, evalState);
        		memberListMap.put(dim, memberList);
        		continue;
        	}

        	// Just add the lowest members under branch. This tree method will 
        	// return the member itself if it has no children.
        	tree = mts.getTree(dim);
        	desc = tree.getLowestMembers(is.getCoordinate(dim));
        	memberList = new ArrayList<String>();
        	for (PafDimMember m : desc) {
        		memberList.add(m.getKey());
        	}
         	memberListMap.put(dim, memberList);
        }

        return buildIntersections(memberListMap, is.getDimensions());
	}
    

	@SuppressWarnings("unchecked")
	public static ArrayList<Intersection> buildIntersections(Map<String, List<String>> memberLists, String[] axisSequence) {
        
        ArrayList<String>[] memberArrays = new ArrayList[memberLists.size()];
        int i = 0;
        
        for (String axis : axisSequence) {         
            memberArrays[i++] = new ArrayList<String>(memberLists.get(axis));
        }

//        // precalculate size of arraylist
//        long size = 1;
//        for (ArrayList list : memberArrays) {
//            size *= list.size();
//        }
        ArrayList<Intersection> intersections = new ArrayList<Intersection>();
        
        
        Odometer odom = new Odometer(memberArrays);
        Intersection inter;

        while (odom.hasNext()) {
            inter = new Intersection(axisSequence, (String[])odom.nextValue().toArray(new String[0]));
            intersections.add(inter);
        }
        
        return intersections;
    }
    
    
	/**
	 * Build the time dimension floor members for the given intersection
	 * 
	 * @param is Intersection
	 * @param evalState Eval state
	 * 
	 * @return List<String>
	 */
	private static List<String> buildTimeFloorMembers(Intersection is, IPafEvalState evalState) {
    	
   	 
		MemberTreeSet mts = evalState.getClientState().getUowTrees();
		String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
		String timeDim = evalState.getAppDef().getMdbDef().getTimeDim(); 
		PafDimTree timeTree;
		TimeBalance tb = TimeBalance.None;
		List<PafDimMember> desc = null;
		List<String> memberList = new ArrayList<String>();

		// Initialize time balance attribute for the measure in the intersection.
		MeasureDef msr = evalState.getAppDef().getMeasureDef(is.getCoordinate(msrDim));                
		if (msr == null || msr.getType() != MeasureType.Recalc ) { 
			if (msr ==null)
				tb = TimeBalance.None;
			else if (msr.getType() == MeasureType.TimeBalFirst)
				tb = TimeBalance.First;
			else if (msr.getType() == MeasureType.TimeBalLast)
				tb = TimeBalance.Last;
			else
				tb = TimeBalance.None;
		}




		// get lowest time members under branch. This tree method will return the member
		// itself if it has no children.
		timeTree = mts.getTree(timeDim);
		desc = timeTree.getLowestMembers(is.getCoordinate(timeDim));

		// the time dimension floor members vary by time balance attribute of the
		// current measure
		if (tb == TimeBalance.None) {
			// if time balance none, then just add all members
			for (PafDimMember m : desc) {
				memberList.add(m.getKey());
			}
		}
		else if (tb == TimeBalance.First) {
			memberList.add(desc.get(0).getKey());                         
		}
		else if (tb == TimeBalance.Last) {
			memberList.add(desc.get(desc.size()-1).getKey());                        
		}


		return memberList;
    }
	

	/**
	 *	Return an iterator that will generate the corresponding base intersections
	 *  for the specified attribute intersection.
	 * 
	 *  This is a convenience method for explodeAttributeIntersection(dataCache, attrIs, memberTrees, 
	 *  explodedBaseDims) where explodedBaseDims has been set to an empty set.
	 *    
	 *  If there are no corresponding base intersections, then null is returned.
	 *
	 * @param dataCache Data cache
	 * @param attrIs Intersection intersection
	 * @param memberTrees Collection of attribute and base trees corresponding to uow
	 * 
	 * @return Odometer
	 * @throws PafException 
	 */
	public static Odometer explodeAttributeIntersection(PafDataCache dataCache, final Intersection attrIs, final MemberTreeSet memberTrees) {
		return explodeAttributeIntersection(dataCache, attrIs, memberTrees, new HashSet<String>());
	}

	/**
	 *	Return an iterator that will generate the corresponding base intersections
	 *  for the specified attribute intersection.
	 *  
	 *  If there are no corresponding base intersections, then null is returned.
	 *
	 * @param dataCache Data cache
	 * @param attrIs Attribute intersection
	 * @param memberTrees Collection of attribute and base trees corresponding to uow
	 * @param explodedBaseDims Indicates that intersections should be exploded to the floor of each base dimension 
	 * 
	 * @return Odometer
	 * @throws PafException 
	 */
	private static Odometer explodeAttributeIntersection(PafDataCache dataCache, final Intersection attrIs, 
			final MemberTreeSet memberTrees, final Set<String> explodedBaseDims) {

		PafViewSection viewSection = dataCache.getPafMVS().getViewSection();
		Map <String, List<String>> memberFilters = new HashMap<String, List<String>>();
        TimeBalance tb = TimeBalance.None;

		// Initialize time balance attribute for the measure in the dsCache intersection
		MeasureDef measureDef = dataCache.getMeasureDef(attrIs.getCoordinate(dataCache.getMeasureDim()));                
		if (measureDef == null || measureDef.getType() != MeasureType.Recalc ) { 
			if (measureDef ==null)
				tb = TimeBalance.None;
			else if (measureDef.getType() == MeasureType.TimeBalFirst)
				tb = TimeBalance.First;
			else if (measureDef.getType() == MeasureType.TimeBalLast)
				tb = TimeBalance.Last;
			else
				tb = TimeBalance.None;
		}

		// Iterate through each base dimension in each attribute intersection and create
		// the list of corresponding base members in the uow cache. For base dimensions
		// without any corresponding attribute dimensions the current member is returned,
		// unless isBaseDimExploed is set to true. In which case, the floor base members 
		// are returned.
		String[] baseDimensions = dataCache.getBaseDimensions();
		int baseDimCount = baseDimensions.length;
		Set<String> viewAttributes = new HashSet<String>(Arrays.asList(viewSection.getAttributeDims()));
		for (int axisInx = 0; axisInx < baseDimCount; axisInx++) {

			// Get current base tree and current base member
			String baseDimension = baseDimensions[axisInx];
			PafBaseTree pafBaseTree = (PafBaseTree) memberTrees.getTree(baseDimension);
			String baseMember = attrIs.getCoordinate(baseDimension);

			// Get associated attribute dim names
			Set<String> assocAttributes = new HashSet<String>();
			assocAttributes.addAll(pafBaseTree.getAttributeDimNames());

			// Does this base dimension have any associated attributes on view section?
			assocAttributes.retainAll(viewAttributes);
			if (assocAttributes.size() > 0) {
				
				// Yes - Add list of component base members to member filter
				List<String> memberList = getComponentBaseMembers(dataCache, baseDimension, assocAttributes, attrIs, memberTrees);
				if (memberList.size() == 0) {
					// No members were returned - this must be an invalid intersection - just return null
					return null;
				}
				// Convert set of component base members to a list and add to member filter
				// hash map.
				memberFilters.put(baseDimension, memberList);
				
			} else {

				// No attribute dimensions
				List<String> memberList = new ArrayList<String>();
				if (explodedBaseDims != null && explodedBaseDims.contains(baseDimension)) {
					// Base dimension explosion - just pick lowest level descendants under member
					List<PafDimMember> floorMembers = pafBaseTree.getLowestMembers(baseMember);
					// Logic for member list is different for time dimension
					if (!baseDimension.equals(dataCache.getTimeDim()) || tb == TimeBalance.None) {
						// If not time dimension or time balance none measure just add floor members
						for (PafDimMember floorMember : floorMembers) {
							memberList.add(floorMember.getKey());
						}
					} else if (tb == TimeBalance.First) {
						// Time balance first - add first floor descendant
						memberList.add(floorMembers.get(0).getKey());
					} else if (tb == TimeBalance.Last) {
						// Time balance last - add last descendant
						memberList.add(floorMembers.get(floorMembers.size() - 1).getKey());
					}
				} else {
					// No base dimension explosion - just add current base member to filter
					memberList.add(baseMember);
				}	
				
				// Add selected floor members to member filter
				//TODO use exiting floor utility since it handles elapsed periods, etc.
				memberFilters.put(baseDimension, memberList);
			}	
		}

		// Return iterator
		Odometer cacheIterator = new Odometer(memberFilters, baseDimensions);
		return cacheIterator;
	}


	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dataCache, attrIntersections, memberTrees, 
	 *  explodedBaseDims) where attrIntersections is converted into an array of intersections.
	 *
	 * @param dataCache Data cache
	 * @param attrIntersections Set of attribute intersections
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The set of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Set<Intersection> attrIntersections,  
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims, boolean isInvalidIntersectionIgnored)  {
		
		return getBaseIntersections(dataCache, attrIntersections.toArray(new Intersection[0]), memberTrees, explodedBaseDims, isInvalidIntersectionIgnored);
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersection
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims) 
	 *  where explodedBaseDims is set to an empty set.
	 *
	 * @param dataCache Data cache
	 * @param attrIntersections Attribute intersection
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * 
	 * @return Set<Intersection>[]
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Intersection attrIntersection, 
			final MemberTreeSet memberTrees) {

		return getBaseIntersections(dataCache, attrIntersection, memberTrees, new HashSet<String>());
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersection
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dataCache, attrIntersections, memberTrees) 
	 *  where attrIntersection is converted into an array of intersections.
	 *
	 * @param dataCache Data slice cache
	 * @param attrIntersections Attribute intersection
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * 
	 * @return Set<Intersection>[]
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Intersection attrIntersection,  
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) {

		Intersection[] attrIntersections = new Intersection[1];
		attrIntersections[0] = attrIntersection;
		return getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims);
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache.
	 *
	 *  This is convenience method for getBaseIntersections(dataCache, attrIntersections, memberTrees, 
	 *  explodedBaseDims, isInvalidIntersectionIgnored) where isInvalidIntersection is set to false.
	 *  
	 * @param dataCache Data cache
	 * @param attrIntersections Array of attribute intersections
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Intersection[] attrIntersections,  
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) {

		return getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims, false);
	}
	
	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache.
	 *
	 * @param dataCache Data cache
	 * @param attrIntersections Array of attribute intersections
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Intersection[] attrIntersections,  
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims, boolean isInvalidIntersectionIgnored) {

		// Initialization
		String[] baseDims = dataCache.getBaseDimensions();
		Set<Intersection> convertedIntersections = new HashSet<Intersection>();


		// Convert all intersections
		for (Intersection attrIs: attrIntersections) {

			// Explode attribute intersection into corresponding base intersections
			Odometer baseIsIterator = explodeAttributeIntersection(dataCache, attrIs, memberTrees, explodedBaseDims);

			// Check for invalid attribute intersection
			if (baseIsIterator != null) {
				
				// Valid intersection - generate base intersections and add to collection
				while(baseIsIterator.hasNext()) {
					@SuppressWarnings("unchecked")
					List<String> baseCoords = baseIsIterator.nextValue();
					Intersection baseIs = new Intersection(baseDims, baseCoords.toArray(new String[0]));
					convertedIntersections.add(baseIs);
				}
				
			} else if (!isInvalidIntersectionIgnored) {
				// Invalid intersection - throw exception if invalid intersections are not being ignored
				String errMsg = "Unable to get base intersections for invalid attribute intersection: " + attrIs.toString();
				logger.error(errMsg);
				throw new IllegalArgumentException(errMsg);
			}

		}

		// Return converted intersections
		return convertedIntersections;
	}


	/**
	 *	Return the list of base members that will aggregate to the specified intersection
	 *  for the specified base dimension. Component base member lists are added to a 
	 *  collection so that they can be quickly recalled for future processing.
	 *
	 * @param dataCache Data cache
	 * @param baseDimension Base dimension
	 * @param attrDimensions Associated attribute dimensions
	 * @param attrIs Attribute intersection
	 * @param memberTrees Set of attribute and base member trees
	 * 
	 * @return List<String>
	 */
	public static List<String> getComponentBaseMembers(PafDataCache dataCache, final String baseDimension, final Set<String> attrDimensions, 
			final Intersection attrIs, final MemberTreeSet memberTrees) {


		// Initialization
		List<String> componentMembers = null;
		Set<String> validBaseMembers = new HashSet<String>();
		PafBaseTree baseTree = (PafBaseTree) memberTrees.getTree(baseDimension);
		String baseMember = attrIs.getCoordinate(baseDimension);		

		// Create an intersection containing the base member and it's associated attributes
		// in the view section
		int memberIsDimCount = attrDimensions.size() + 1;
		String[] baseMemberDims = new String[memberIsDimCount];
		String[] baseMemberCoords = new String[memberIsDimCount];
		int i = 0;
		for (String dsDimension:attrIs.getDimensions()) {
			if (baseDimension.equalsIgnoreCase(dsDimension) || attrDimensions.contains(dsDimension)) {
				baseMemberDims[i] = dsDimension;
				baseMemberCoords[i] = attrIs.getCoordinate(dsDimension);
				i++;
			}
		}
		Intersection baseMemberIs = new Intersection(baseMemberDims, baseMemberCoords);

		// Return pre-tabulated component member list, if it exists
		componentMembers = dataCache.getComponentBaseMembers(baseMemberIs);
		if (!componentMembers.isEmpty()) {
			return componentMembers;
		}

		// Find the intersection of associated base members for each attribute dimension
		// in the data slice cache intersection
		for (String attrDimension:attrDimensions) {

			// Get associated base member names of current attribute
			String attrMember = attrIs.getCoordinate(attrDimension);
			PafAttributeTree attrTree = (PafAttributeTree) memberTrees.getTree(attrDimension);
			Set<String> associatedBaseMembers =  attrTree.getBaseMemberNames(attrMember);

			// If there are no base members then return empty set since this must be
			// an invalid intersection of a base member with one or more attributes
			if (associatedBaseMembers.isEmpty()) {
				return new ArrayList<String>();
			}

			// If 1st time through loop then initialize existing base members set
			if (validBaseMembers.isEmpty()) {
				validBaseMembers.addAll(associatedBaseMembers);
			}

			// Get intersection of base members associated with each processed attribute
			validBaseMembers.retainAll(associatedBaseMembers);

		}

		// Get base member descendants at attribute mapping level. It is assumed that
		// all attribute dimensions on the view are mapped to the same level within
		// a given base dimension.
		int mappingLevel = baseTree.getAttributeMappingLevel((String)attrDimensions.toArray()[0]);
		List<PafDimMember> dimMembers = baseTree.getMembersAtLevel(baseMember, (short) mappingLevel);
		Set<String> intersectionDescendants = new HashSet<String>();
		for (PafDimMember dimMember:dimMembers) {
			intersectionDescendants.add(dimMember.getKey());
		}

		// Filter list of potential valid base members against relevant base members for intersection
		validBaseMembers.retainAll(intersectionDescendants);
		componentMembers.addAll(validBaseMembers);

		// Add component base members to collection for future use
		dataCache.addComponentBaseMembers(baseMemberIs, componentMembers);
		

		// Return component base members
		return componentMembers;
	}


	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. This is convenience method for
	 *  getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims) 
	 *  where isBaseDimExploded is set to an empty set.
	 *
	 * @param dataCache Data cache
	 * @param attrIntersections Set of attribute intersections
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Set<Intersection> attrIntersections, 
			final MemberTreeSet memberTrees) throws PafException {
		
		return getBaseIntersections(dataCache, attrIntersections, memberTrees, new HashSet<String>());
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims, 
	 *  isInvalidIntersectionIgnore) where isInvalidIntersectionIgnored is set to false.
	 *
	 * @param dataCache Data cache
	 * @param attrIntersections Set of attribute intersections
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The set of base dimensions to be exploded during the conversion process
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dataCache, final Set<Intersection> attrIntersections,  
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) throws PafException {
		
		return getBaseIntersections(dataCache, attrIntersections, memberTrees, explodedBaseDims, false);
	}

	
	
//  /**
//  * THIS IS A PREVIOUS VERSION OF buildATTRFloorIntersections(Intersection, IPafEvalState) 
//  * that explodes the attribute intersection into ATTRIBUTE floor intersections.
//  * IT IS NOT BEING USED AND IS ONLY HERE FOR REFERENCE PURPOSES.
//  */
// /**
//  * 
//  * Explode an attribute intersection into its corresponding floor intersections 
//  * 
//  * @param is Attribute intersection
//  * @param evalState Evaluation state
//  * 
//  * @return List<Intersection>
//  */
// private static List<Intersection> buildAttrFloorIntersections(Intersection is, IPafEvalState evalState) {
// 	
// 	String measureDim = evalState.getAppDef().getMdbDef().getMeasureDim();
// 	String timeDim = evalState.getAppDef().getMdbDef().getTimeDim(); 
// 	PafDataCache dataCache = evalState.getDataCache();
// 	String[] baseDims = dataCache.getBaseDimensions();
// 	String[] isDims = is.getDimensions();
// 	PafViewSection viewSection = dataCache.getPafMVS().getViewSection();
// 	Set<String> attributeDims = new HashSet<String>(Arrays.asList(viewSection.getAttributeDims()));
// 	Map<String, List<String>> baseDimsWoAttrsMemberMap = new HashMap<String, List<String>>();
//
//		// Create the list of base dimensions that will be exploded as part of an attribute
//		// allocation. Currently, allocations are not performed over the measures dimension.
//		Set<String> explodedBaseDims = new HashSet<String>(Arrays.asList(dataCache.getBaseDimensions()));
//		Set<String> omittedDims = new HashSet<String>();
//		omittedDims.add(dataCache.getMeasureDim());
//		explodedBaseDims.removeAll(omittedDims);
// 	
// 	
//     // First get the list of base dimensions that don't have any associated attributes
//     // in the intersection
// 	MemberTreeSet uowTrees = evalState.getClientState().getUowTrees();       
// 	List<String> baseDimsWithAttrs = new ArrayList<String>();
//     List<String> baseDimsWithoutAttrs = new ArrayList<String>();
//     Map<String, List<String>> assocAttrMap = new HashMap<String, List<String>>();
//     for (String baseDim : baseDims) {
// 		PafBaseTree pafBaseTree = (PafBaseTree) uowTrees.getTree(baseDim);
// 		List<String> assocAttributes = new ArrayList<String>(pafBaseTree.getAttributeDimNames());
// 		assocAttributes.retainAll(attributeDims);
// 		if (assocAttributes.isEmpty()) {
// 			baseDimsWithoutAttrs.add(baseDim);
// 		} else {
// 			baseDimsWithAttrs.add(baseDim);
// 			assocAttrMap.put(baseDim, assocAttributes);
// 		}
//     }
//     
//     // Next get the floor members of each base dimension without associated attributes
// 	for (String baseDim : baseDimsWithoutAttrs) {
//
//    		List<String> memberList = new ArrayList<String>();
//
// 		// Measure dimension - just select member
//     	if (baseDim.equals(measureDim)) {
//     		memberList = new ArrayList<String>();
//     		memberList.add(is.getCoordinate(measureDim));
//     		baseDimsWoAttrsMemberMap.put(baseDim, memberList);
//     		continue;
//     	}
//
//     	// Time dimension - apply time balance logic
//     	if (baseDim.equals(timeDim)) {
//     		memberList = buildTimeFloorMembers(is, evalState);
//     		baseDimsWoAttrsMemberMap.put(baseDim, memberList);
//     		continue;
//     	}
//
//     	// Just add the lowest members under branch. This tree method will 
//     	// return the member itself if it has no children.
//     	PafBaseTree pafBaseTree = (PafBaseTree) uowTrees.getTree(baseDim);
//     	String baseMember = is.getCoordinate(baseDim);
//     	List<PafDimMember> floorMembers = pafBaseTree.getLowestMembers(baseMember);
//     	for (PafDimMember floorMember : floorMembers) {
//     		memberList.add(floorMember.getKey());
//     	}
//     	baseDimsWoAttrsMemberMap.put(baseDim, memberList);
// 	}
//
// 	// Get the valid attribute floor combinations for each base member with attribute
// 	List<Intersection> floorMemberCombos = PafDataCacheCalc.getValidFloorMemberCombos(dataCache, is, 
// 			baseDimsWithAttrs, assocAttrMap, uowTrees); 
//
// 	// Generate floor intersections - cross product of exploded baseDims without attributes, 
//		// and valid attribute/base member floor combinations
// 	Odometer odometer = new Odometer(baseDimsWoAttrsMemberMap, baseDimsWithoutAttrs.toArray(new String[0]));
// 	List<Intersection> floorIntersections = new ArrayList<Intersection>();
// 	while (odometer.hasNext()) {
// 		@SuppressWarnings("unchecked")
// 		String[] partialCoord = (String[]) odometer.nextValue().toArray(new String[0]);
// 		Intersection partialFloorIs = new Intersection(isDims);
// 		for (int i = 0; i < baseDimsWithoutAttrs.size(); i++) {
// 			partialFloorIs.setCoordinate(baseDimsWithoutAttrs.get(i), partialCoord[i]);
// 		}
// 		for (Intersection floorMemberCombo : floorMemberCombos) {
// 			Intersection floorIs = partialFloorIs.clone();
// 			for (String dim : floorMemberCombo.getDimensions()) {
// 				floorIs.setCoordinate(dim, floorMemberCombo.getCoordinate(dim));
// 			}
// 			floorIntersections.add(floorIs);
// 			
// 			// Add floor intersection to the data cache, because it 
// 			// will be needed for any subsequent calculations. Doing
// 			// so will link the attribute floor intersection to its 
// 			// corresponding base intersection, allowing them to share
// 			// the same value.
// 			dataCache.addCell(floorIs);
// 		} 
// 	}
// 	return floorIntersections;
// }

	
    public static double Round(double value, int places)
    {
    	try
    	{
    		value = roundDouble(value, places);
    	}
        catch (Exception ex) {
        }
        
    	return value;
    }
    
    private static double roundDouble(double d, int places) {
        return Math.round(d * Math.pow(10, (double) places)) / Math.pow(10,(double) places);
    }
    
}
