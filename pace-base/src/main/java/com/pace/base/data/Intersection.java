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
import java.util.Map;
import java.util.Set;


/**
 * Value object holding the coordinates for an intersection of an arbitrary
 * number of axis.
 * 
 * @version x.xx
 * @author JWatkins
 * 
 */
public class Intersection implements ICoords, Cloneable, Comparable<Intersection> {

	private String[] dimensions;
	private String[] coordinates;
	transient private int hashCode;
	
	// supports fast sorting, static values for comparison and a pointer to the map for regenerating them on sets.
	transient private int[] memberIndex; 
	transient private Map <String, Map<String, Integer>>memberSequences; 
	
	public Intersection(String[] dimensions) {
		this.dimensions = dimensions;
		this.coordinates = new String[dimensions.length];
	}

	public Intersection(String[] dimensions, String[] coordinates) {
		super();
		this.coordinates = coordinates;
		this.dimensions = dimensions;
	}

	public Intersection(String[] dimensions, List<String> coordinates) {
		this(dimensions, coordinates.toArray(new String[0]));
	}


	/**
	 * @param dimensions Intersection dimensions
	 * @param coordinates Intersection coordinates
	 * @param dimensionOrder Specifies the desired order of dimension coordinates in the new intersection
	 */
	public Intersection(List<String> dimensions, List<String> coordinates, List<String> dimensionOrder) {
		this(dimensions, coordinates.toArray(new String[0]), dimensionOrder);
	}


	/**
	 * @param dimensions Intersection dimensions
	 * @param coordinates Intersection coordinates
	 * @param dimensionOrder Specifies the desired order of dimension coordinates in the new intersection
	 */
	public Intersection(List<String> dimensions, String[] coordinates, List<String> dimensionOrder) {
		
		super();

		// Re-order the coordinates in the desired order
		String[] orderedCoords = new String[dimensionOrder.size()];
		for (int i = 0; i < dimensionOrder.size(); i++) {
			String orderedDim = dimensionOrder.get(i);
			int index = dimensions.indexOf(orderedDim);
			if (index == -1) {
				String errMsg = "Instantiation Error - Ordered Dimension [" + orderedDim + "] not found in Dimension list";
				throw new IllegalArgumentException(errMsg);
			} else {
				orderedCoords[i] = coordinates[index];		// TTN-1851
			}
		}
		
		this.dimensions = dimensionOrder.toArray(new String[0]);
		this.coordinates = orderedCoords;
	}


	public String[] getCoordinates() {
		return coordinates;
	}

	/**
	 * Return the coordinates for the specified intersections
	 * 
	 * @param dimensions Selected dimension names
	 * @return String[]
	 */
	public String[] getCoordinates(String[] dimensions) {
		
		String[] coords = new String[dimensions.length];
		for (int i = 0; i < dimensions.length; i++) {
			coords[i] = this.getCoordinate(dimensions[i]);
		}
		return coords;
	}

	public void setCoordinates(String[] coordinates) {
		this.coordinates = coordinates;
		this.hashCode = 0;
		this.memberIndex = null;
	}

	public String[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(String[] dimensions) {
		this.dimensions = dimensions;
		this.hashCode = 0;
		this.memberIndex = null;		
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
				hashCode = 0;
				memberIndex = null;
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

		// Compare # of dimensions - this check is necessary for attribute evaluation
		if (inter.dimensions.length != this.dimensions.length) {
			return false;
		}
		
		// Check each coordinate
		for (int i = 0; i < dimensions.length; i++) {
			if (!this.dimensions[i].equals(inter.dimensions[i])
					|| !this.coordinates[i].equals(inter.coordinates[i]))
				return false;
		}
		
		return true;
	}

	public int hashCode() {
		
		if (hashCode != 0) return hashCode;
		
		hashCode = 17;
		for (int i = 0; i < dimensions.length; i++) {
			hashCode = 37 * hashCode + coordinates[i].hashCode();				
		}
		return hashCode;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("( ");
		for (String coord : coordinates)
			sb.append(coord + ", ");
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(")");
		return sb.toString();
	}

	private Intersection() {
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
		System.arraycopy(this.dimensions, 0, dimensions, 0, dimCount);
		System.arraycopy(this.coordinates, 0, coordinates, 0, dimCount);
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

	/**
	 * 	Get the value of a coordinate
	 * 
	 * @param axis Coordinate axis
	 * @return Coordinate value
	 */
	public String getCoordinate(int axis) {
		return getCoordinates()[axis];
	}

	/**
	 * 	Set the value of a coordinate
	 * 
	 * @param axis Coordinate axis
	 * @param value String value
	 */
	public void setCoordinate(int axis, String value) {
		getCoordinates()[axis] = value;
		hashCode = 0;
		this.memberIndex = null;
	}

	private void calculateSortIndex() {
		for (int i = 0; i < this.memberIndex.length; i++ ) {
			this.memberIndex[i] = memberSequences.get(dimensions[i]).get(coordinates[i]);	
		}		
	}
	
	// interim property to support whether it supports fast sorting
	public boolean isSortable() {
//		return false;
		if (memberSequences == null) return false;
		else return true;
	}
	
	@Override
	public int compareTo(Intersection that) {
		if (this.memberSequences == null || that.memberSequences == null) {
			throw new UnsupportedOperationException("This intersection doesn't support implicit sorting, " + this.toString() + " : " + that.toString() );
		}
		
		// lazy initialize intersections for sorting.		
		if (this.memberIndex == null) this.calculateSortIndex();
		if (this.memberIndex == null) that.calculateSortIndex();
		
		// check for fast sort, intersections are comparable
		if (this.memberIndex.length == that.memberIndex.length) {
			for (int i=0; i < memberIndex.length; i++) {
				if (this.memberIndex[i] < that.memberIndex[i]) return -1;
				else if (this.memberIndex[i] > that.memberIndex[i]) return 1;
			}
			return 0;
		}
		
		// have to do slow comparison for mismatched dimensionality
		// find the intersection with the longer axisSequence, should be a superset of the other
		String[] axisSequence;
		if (this.dimensions.length > that.dimensions.length)
			axisSequence = this.dimensions;
		else
			axisSequence = that.dimensions;
		
		
        String o1Coord, o2Coord;
        int axisVal1, axisVal2;
        for (String dim : axisSequence) {
            o1Coord = this.getCoordinate(dim);
            o2Coord = that.getCoordinate(dim);

            
            // Allow for this comparator to use the same axis sequence for both attribute
            // and non-attribute intersections during attribute evaluation. (TTN-1506) 
            if (o1Coord == null || o2Coord == null) {
            	// Just skip to the next axis, if one or both intersections don't contain
            	// the current axis. Hopefully it's both, since the intent is to compare
            	// like intersections to each other.
            	continue;
            }

           
            axisVal1 = memberSequences.get(dim).get(o1Coord);
            axisVal2 = memberSequences.get(dim).get(o2Coord);
    	
             if (axisVal1 < axisVal2) return 1;
                else if (axisVal1 > axisVal2) return -1;   
        }
		return 0;
	}
}
