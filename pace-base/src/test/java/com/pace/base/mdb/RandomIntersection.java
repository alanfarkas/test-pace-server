/**
 * 
 */
package com.pace.base.mdb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.pace.base.data.Intersection;

/**
 * @author Alan
 *
 */
public class RandomIntersection {
	
	boolean isMaxMemberReached = false;
	List<String> generatedMembers = null;
	int memberPoolSize;
	String[] dimensions;
	int memberLength;
	
	@SuppressWarnings("unused")
	private RandomIntersection() {
		
	}
	
	public RandomIntersection(int memberPoolSize, String[] dimensions, int memberLength) {
		this.memberPoolSize = memberPoolSize;
		this.dimensions = dimensions;
		this.memberLength = memberLength;
		this.generatedMembers = new ArrayList<String>(memberPoolSize);
	}

	public Intersection getIntersection() {
		// TODO Auto-generated constructor stub

		
		int dimSize = dimensions.length;
		String[] coordinates = new String[dimSize];
		String memberName = null;
		for (int dimInx = 0; dimInx < dimSize; dimInx++) {
			if (!isMaxMemberReached) {
				memberName = UUID.randomUUID().toString().substring(0, memberLength);
				generatedMembers.add(memberName);
			} else {
				int memberIndex = (int) (Math.random()* memberPoolSize);
				memberName = generatedMembers.get(memberIndex);
			}
			coordinates[dimInx] = memberName;
		}
		if (!isMaxMemberReached && (memberPoolSize > 0) && (generatedMembers.size() >= memberPoolSize)) {
			isMaxMemberReached=true;
		}
		return new Intersection(dimensions, coordinates);
	}

}
