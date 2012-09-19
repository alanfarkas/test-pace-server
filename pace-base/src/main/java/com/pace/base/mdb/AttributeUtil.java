/**
 * 
 */
package com.pace.base.mdb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.app.PafDimSpec;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.utility.Odometer;

/**
 * Attribute Utilities
 * 
 * @author Alan Farkas
 *
 */
public abstract class AttributeUtil {

	private static Logger logger = Logger.getLogger(AttributeUtil.class);
	
	/**
	 *	Determine if the specified attribute member combination is invalid
	 *	for the specified base member and attribute dimensions
	 *
	 *  This is a convenience method for isInvalidAttributeCombo(String baseDimName, 
	 *  String baseMemberName, String[] attrDimNames, String[] attrCombo, 
	 *	MemberTreeSet uowTrees) where the member tree map is converted into a 
	 *	MemberTreeSet
	 *  
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrCombo Attribute member combination
	 * @param memberTreeMap Collection of member trees keyed by dimension name
	 * 
	 * @return True if the attribute combination is invalid
	 */
	public static boolean isInvalidAttributeCombo(String baseDimName, String baseMemberName, String[] attrDimNames, String[] attrCombo, 
			Map<String, PafDimTree> memberTreeMap) {
		
		return isInvalidAttributeCombo(baseDimName, baseMemberName, attrDimNames, attrCombo, new MemberTreeSet(memberTreeMap));
	}

	/**
	 *	Determine if the specified attribute member combination is invalid
	 *	for the specified base member and attribute dimensions
	 *
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrCombo Attribute member combination
	 * @param uowTrees Collection of uow cache trees
	 * 
	 * @return True if the attribute combination is invalid
	 */
	public static boolean isInvalidAttributeCombo(String baseDimName, String baseMemberName, String[] attrDimNames, String[] attrCombo, 
			MemberTreeSet uowTrees) {
		
		return !isValidAttributeCombo(baseDimName, baseMemberName, attrDimNames, attrCombo, uowTrees);
	}

//	/**
//	 *	Determine if the specified attribute member combination is valid
//	 *	for the specified base member, attribute dimensions, and uow
//	 *  trees.
//	 *
//	 * @param baseDimName Base dimension name
//	 * @param baseMemberName Base member name
//	 * @param attrDimNames Attribute dimension names
//	 * @param attrCombo Attribute member intersection
//	 * @param uowTrees Collection of uow cache trees
//	 * 
//	 * @return True if the attribute combination is valid
//	 */
//	public static boolean isValidAttributeCombo(String baseDimName, String baseMemberName, String[] attrDimNames, 
//			String[] attrCombo, MemberTreeSet uowTrees) {
//	
//		boolean isValid = false;
//	
//		// Create custom intersection object
//		Intersection intersection = new Intersection(attrDimNames, attrCombo);
//	
//		// Get set of valid intersection objects
//		Set<Intersection> intersections = getValidAttributeCombos(baseDimName, baseMemberName, attrDimNames, uowTrees);
//	
//		// Validate intersection
//		if (intersections.contains(intersection)) {
//			isValid = true;
//		}
//		return isValid;
//	}

	/**
	 *	Determine if the specified attribute member combination is valid
	 *	for the specified base member, attribute dimensions, and uow
	 *  trees.
	 *
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Attribute dimension names
	 * @param attrCombo Combination of one or more attribute members, each from a different attribute dimension
	 * @param uowTrees Collection of uow cache trees
	 * 
	 * @return True if the attribute combination is valid
	 */
	public static boolean isValidAttributeCombo(String baseDimName, String baseMemberName, String[] attrDimNames, 
			String[] attrCombo, MemberTreeSet uowTrees) {
	

		PafBaseTree baseTree = uowTrees.getBaseTree(baseDimName);
		boolean isValid = true;
		
		// Check if all attributes are mapped to the same base tree level
		Integer mappingLevel = null;
		for (String attrDimName:attrDimNames) {
			int level = baseTree.getAttributeMappingLevel(attrDimName);	
			if (mappingLevel !=null) {
				if (level != mappingLevel) {
					// Mapping levels aren't consistent - attribute combination is not valid
					return false;
				} 
			} else {
				// First attribute dimension - initialize mapppingLevel
				mappingLevel = level;
			}
		}
		
		
		// Validate the attribute member combination. The attribute member combination is only valid
		// if all of its members pass validation. 
		int attrDimCount = attrDimNames.length;
		for (int i = 0; i < attrDimCount && isValid; i++) {
			
			String attrDimName = attrDimNames[i], attrMemberName = attrCombo[i];
			PafAttributeTree attrTree = uowTrees.getAttributeTree(attrDimName);
			
			// Validate attribute member name
			if (!attrTree.hasMember(attrMemberName)) {
				String errMsg = "getAttributeIntersections error - attribute dim names are null or empty";
				logger.error(errMsg);
				throw new IllegalArgumentException(errMsg);				
			}
			
			// Validate the corresponding attribute member. The attribute member is valid if it or 
			// one of its level 0 descendants is mapped to the specified base member or one of 
			// its descendants.
			Set<String> lev0AttrMembers = new HashSet<String>(attrTree.getLowestMemberNames(attrMemberName));
			Set<String> validAttrValues = baseTree.getAttributeMembers(baseMemberName, attrDimName);
			lev0AttrMembers.retainAll(validAttrValues);
			if (lev0AttrMembers.isEmpty()) {
				isValid = false;
			}
		}
		
		// Return status
		return isValid;
	}


	/**
	 *	Return the valid attribute member combinations for the specified
	 *  base dimension, base member, attribute dimension(s), and member
	 *  tree map. 
	 *  
	 *  This is a convenience method for getValidAttributeCombos (baseDimName,
	 *  baseMemberName, attrDimNames, memberTrees) where the member tree
	 *  map is converted into a MemberTreeSet
	 *  
	 *  If all attributes aren't mapped to the same base member level, then an 
	 *  empty set is returned.
	 * 
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Array of attribute dimension name(s)
	 * @param memberTreeMap Collection of member trees keyed by dimension name
	 *
	 * @return Set<Intersection>
	 */
	public static Set<Intersection> getValidAttributeCombos(final String baseDimName, final String baseMemberName, 
			final String[] attrDimNames, final Map<String, PafDimTree> memberTreeMap) {
		
		MemberTreeSet treeSet = new MemberTreeSet(memberTreeMap);		
		return getValidAttributeCombos(baseDimName, baseMemberName,  attrDimNames, treeSet);
	}

	/**
	 *	Return the valid attribute member combinations for the specified
	 *  base dimension, base member, attribute dimension(s), and uow trees. 
	 *  
	 *  If all attributes aren't mapped to the same base member level, then an 
	 *  empty set is returned.
	 * 
	 * @param baseDimName Base dimension name
	 * @param baseMemberName Base member name
	 * @param attrDimNames Array of attribute dimension name(s)
	 * @param uowTrees Collection of uow trees
	 *
	 * @return Set<Intersection>
	 */
	@SuppressWarnings("unchecked")
	public static Set<Intersection> getValidAttributeCombos(final String baseDimName, final String baseMemberName, 
			final String[] attrDimNames, MemberTreeSet uowTrees)  {
	
		Set<Intersection> attrCombos = new HashSet<Intersection>();
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
		baseTree = uowTrees.getBaseTree(baseDimName);
		level0AttrCombinations = baseTree.getAttributeCombinations(baseMemberName, attrDimNames);
	
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
				List<PafDimMember> ancestors = uowTrees.getAttributeTree(attrDimName).getAncestors(attrMemberName);
				for (PafDimMember attrMember:ancestors) {
					memberLists[i].add(attrMember.getKey());	    			
				}
			}
	
			// Use the odometer to generate all the possible attribute member combinations and
			// add them to the intersection collection.
			Odometer isIterator = new Odometer(memberLists);
			while (isIterator.hasNext()) {
				List<String> isList = isIterator.nextValue();
				Intersection is = new Intersection(attrDimNames, isList.toArray(new String[0]));
				attrCombos.add(is);
			}
	
		}
	
		// Return the set of valid attribute combinations
		return attrCombos;
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
	 * @param memberTrees - Member tree map keyed by dimension name 
	 * 
	 * @return String[]
	 */
	public static String[] getValidAttributeMembers(String requestedAttrDim, String selBaseDim, String selBaseMember, PafDimSpec[] selAttrSpecs, Map<String, PafDimTree> memberTrees) {
	
		// Validate parameters
		if (requestedAttrDim == null || requestedAttrDim.equals("")) {
			String errMsg = "Unable to get valid attribute members - reqAttriDim is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		if (selBaseDim == null || selBaseDim.equals("")) {
			String errMsg = "Unable to get valid attribute members - selBaseDim is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		if (selBaseMember == null || selBaseMember.equals("")) {
			String errMsg = "Unable to get valid attribute members - selBaseMember is null or blank";
			logger.info(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		
		// Execute simplified logic if there are no attribute member selections
		if (selAttrSpecs == null || selAttrSpecs.length == 0) {
			
			// Get set of  all valid attribute intersections
			String allAttrDims[] = new String[1];
			allAttrDims[0] = requestedAttrDim;
			Set<Intersection> validAttrIntersections = getValidAttributeCombos(selBaseDim, selBaseMember, allAttrDims, memberTrees);
	
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
		Set<Intersection> validAttrIntersections = getValidAttributeCombos(selBaseDim, selBaseMember, allAttrDims, memberTrees);
	
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
	
			List<PafDimMember> ancestors = memberTrees.get(requestedAttrDim).getAncestors(validAttributeMember);
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
