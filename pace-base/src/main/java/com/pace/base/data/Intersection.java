/*
 *	File: @(#)Intersection.java 	Package: com.pace.base.data 	Project: PafServer
 *	Created: Sep 8, 2005  		By: JWatkins
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

import java.util.List;
import java.util.Set;

/**
 * Value object holding the coordinates for an intersection of an arbitrary
 * number of axis.
 * 
 * @version x.xx
 * @author JWatkins
 * 
 */
public class Intersection {

	String[] dimensions;

	String[] coordinates;

	public Intersection(String[] dimensions) {
		this.dimensions = dimensions;
		this.coordinates = new String[dimensions.length];
	}

	public Intersection(String[] dimensions, String[] coordinates) {
		super();
		this.coordinates = coordinates;
		this.dimensions = dimensions;
	}

	public String[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String[] coordinates) {
		this.coordinates = coordinates;
	}

	public String[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(String[] dimensions) {
		this.dimensions = dimensions;
	}

	public String getCoordinate(String dimension) {
		int i = 0;
		for (String dim : dimensions) {
			if (dim.equals(dimension))
				return coordinates[i];

			i++;
		}
		return null;
	}

	public void setCoordinate(String dimension, String value) {
		
		if(coordinates == null){
			coordinates = new String[dimensions.length];
		}
		
		int i = 0;
		for (String dim : dimensions) {
			if (dim.equals(dimension)) {
				coordinates[i] = value;
				return;
			}
			i++;
		}
		throw new IllegalArgumentException(
				"Dimension not found in call to setCoordinate (" + dimension
						+ ")");
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Intersection))
			return false;

		Intersection inter = (Intersection) o;
		for (int i = 0; i < dimensions.length; i++) {
			if (!this.dimensions[i].equals(inter.dimensions[i])
					|| !this.coordinates[i].equals(inter.coordinates[i]))
				return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 17;
		for (int i = 0; i < dimensions.length; i++) {
			result = 37 * result + coordinates[i].hashCode();				
		}
		return result;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("( ");
		for (String coord : coordinates)
			sb.append(coord + ", ");
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(")");
		return sb.toString();
	}

	public Intersection() {
	} // used only for cloning

	public Intersection clone() {
		Intersection i = new Intersection();
		i.coordinates = new String[this.coordinates.length];
		i.dimensions = new String[this.coordinates.length];

		for (int j = 0; j < this.coordinates.length; j++) {
			i.coordinates[j] = this.coordinates[j];
			i.dimensions[j] = this.dimensions[j];
		}

		return i;
	}
	
	
	/**
	 * Generate a unique string value that can be used as a unique key for this intersection. It accepts
	 * a subset of dimensions, in order to produce a subset match string, facilitating equality testing among 
	 * some but not all dimensions. The match string is always returned in Intersection dimension order, 
	 * regardless of the order passed in.
	 * 
	 * @param dims
	 * @return
	 */
	public String getMatchString(Set<String> dims) {
		String matchStr = null;
		for ( String dim : dimensions ) {
			if (dims.contains(dim)) matchStr+= this.getCoordinate(dim);
		}
		
		return matchStr;
	}

	public static Intersection createIntersection(String[] dims,
			List<String> pageMembers, List<String> rowMembers,
			List<String> colMembers) {

		Intersection intersection = new Intersection(dims);

		String[] members = intersection.getCoordinates();
		int index = 0;

		if (pageMembers != null) {
			for (String pageMember : pageMembers) {
				members[index++] = pageMember;
			}
		}
		
		if ( colMembers != null ) {
			for (String colMember : colMembers) {
				members[index++] = colMember;
			}
		}
		
		if ( rowMembers != null ) {
			for (String rowMember : rowMembers) {
				members[index++] = rowMember;
			}
		}
		
		intersection.setCoordinates(members);

		return intersection;

	}

	/**
	 * Generate a copy of this intersection comprised of only
	 * the specified dimensions, in the specified order.
	 * 
	 * @param dimIndexes An array of indexes specifying the desired dimensions
	 * 
	 * @return Intersection
	 */
	public Intersection createSubIntersection(int[] dimIndexes) {
		
		int dimCount = dimIndexes.length;
		String[] dimensions = new String[dimCount];
		String[] coordinates = new String[dimCount];
		
		
		// Create sub intersection
		for (int i = 0; i < dimCount; i++) {
			int dimIndex = dimIndexes[i];
			dimensions[i] = getDimensions()[dimIndex];
			coordinates[i] = getCoordinates()[dimIndex];
		}
		Intersection subIntersection = new Intersection(dimensions, coordinates);
		
		return subIntersection;
	}

	/**
	 * Generate a truncated copy of this intersection 
	 * for the specified number dimensions
	 * 
	 * @param dimCount The number of dimensions to carry over
	 * to the intersection copy 
	 * 
	 * @return Intersection
	 */
	public Intersection createSubIntersection(int dimCount) {

		String[] dimensions = new String[dimCount];
		String[] coordinates = new String[dimCount];
		
		
		// Create sub intersection
		for (int i = 0; i < dimCount; i++) {
			dimensions[i] = getDimensions()[i];
			coordinates[i] = getCoordinates()[i];
		}
		Intersection subIntersection = new Intersection(dimensions, coordinates);
		
		return subIntersection;
	}

	/**
	 * 	Return intersection size
	 * 
	 * @return Intersection size
	 */
	public int getSize() {
		
		int size = 0;
		if (dimensions != null) {
			size = dimensions.length;
		}
		return size;
	}

}
