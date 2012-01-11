/**
 * 
 */
package com.pace.base.mdb;

import java.util.Comparator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author Alan Farkas
 *
 */
public class DimMemberNameComparator implements Comparator<String> {

    private Map<String, Integer> memberIndexes;
    private Logger logger = Logger.getLogger(DimMemberNameComparator.class);

	/**
	 * @param memberIndexes Map that resolves member name to a sort index
	 */
	public DimMemberNameComparator(Map<String, Integer> memberIndexes) {	
		this.memberIndexes = memberIndexes;
	}

	@Override
	public int compare(String memberName1, String memberName2) {
		
		Integer index1, index2;
		
		// Get member indexes
		index1 = memberIndexes.get(memberName1);
		index2 = memberIndexes.get(memberName2);
		if (index1 == null || index2 == null) {
			String errMsg = String.format("Unable to find one or more member indexes when comparing %s to %s", 
					memberName1, memberName2);
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		
		// Compare member indexes. Members will be sorted in ascending index order.
		if (index1 < index2) {
			return -1;		// memberName1 comes before memberName2
		} else if (index1 > index2) {
			return 1;		// memberName1 comes after memberName2
		}
		return 0;			// memberNames are equal to each other (or have same sort order - which should never happen)
	}

}
