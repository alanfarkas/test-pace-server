/*
 *	File: @(#)Coordinate.java 	Package: com.pace.base.data 	Project: pace-base
 *	Created: Dec. 28, 2012  	By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-20012 Alvarez and Marsal Software, LLC ("A&M Software, LLC"). All rights reserved.
 *
 *	This software is the confidential and proprietary information of A&M Software, LLC.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with A&M Software LLC.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base.data;

import java.util.Arrays;
import java.util.List;

/**
 * Value object holding the coordinates for an intersection of an arbitrary
 * number of axis. This object is mostly useful for representing non-attribute
 * intersection coordinates, since the dimensionality can usually be inferred.
 * 
 * @version x.xx
 * @author AFarkas
 * 
 */
public class Coordinates {

	private String[] coordinates;
	transient private int hashCode;

	
	public Coordinates(String[] coordinates) {
		this.coordinates = coordinates;
	}

	public Coordinates(List<String> coordinates) {
		this(coordinates.toArray(new String[0]));
	}


	public String[] getCoordinates() {
		return coordinates;
	}


	public void setCoordinates(String[] coordinates) {
		this.coordinates = coordinates;
		this.hashCode = 0;
	}


	public String getCoordinate(int axis) {
		if (axis < coordinates.length && axis > -1)
			return coordinates[axis];

		throw new IllegalArgumentException(
				"Invalid axis of [" + axis + "] passed to getCoordinate(axis)");
	}

	public void setCoordinate(int axis, String value) {
		
		if(coordinates == null){
			throw new IllegalArgumentException(
					"Can't set coordinate if [coordinates] property isn't initialized");
		}

		if (axis >= coordinates.length || axis < 0) {
			throw new IllegalArgumentException(
					"Invalid axis of [" + axis + "] passed to setCoordinate(axis, value)");
		}

		coordinates[axis] = value;
		hashCode = 0;
		return;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Coordinates))
			return false;

		Coordinates inter = (Coordinates) o;

		// Compare # of dimensions - this check is necessary for attribute evaluation
		if (inter.coordinates.length != this.coordinates.length) {
			return false;
		}
		
		// Compare coordinates
		if (!Arrays.equals(this.coordinates, inter.coordinates)) {
				return false;
		}
		
		return true;
	}

	public int hashCode() {
		
		if (hashCode != 0) return hashCode;
		
		hashCode = 17;
		for (int i = 0; i < coordinates.length; i++) {
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

	private Coordinates() {
	} // used only for cloning


	public Coordinates clone() {
		Coordinates i = new Coordinates();
		i.coordinates = new String[this.coordinates.length];

		for (int j = 0; j < this.coordinates.length; j++) {
			i.coordinates[j] = this.coordinates[j];
		}

		return i;
	}
	
	

	/**
	 * Generate a copy of this coordinates object comprised of only
	 * the specified coordinates, in the specified order.
	 * 
	 * @param coordIndexes An array of indexes specifying the desired coordinates
	 * 
	 * @return Coordinates
	 */
	public Coordinates createSubIntersection(int[] coordIndexes) {
		
		int dimCount = coordIndexes.length;
		String[] coordinates = new String[dimCount];
		
		
		// Create sub coordinates
		for (int i = 0; i < dimCount; i++) {
			int coordIndex = coordIndexes[i];
			coordinates[i] = getCoordinates()[coordIndex];
		}
		Coordinates subCoordinates = new Coordinates(coordinates);
		
		return subCoordinates;
	}

	/**
	 * Generate a truncated copy of this coordinates object
	 * for the specified number dimensions
	 * 
	 * @param dimCount The number of dimensions to carry over
	 * to the intersection copy 
	 * 
	 * @return Coordinates
	 */
	public Coordinates createSubIntersection(int dimCount) {

		String[] coordinates = new String[dimCount];
		
		
		// Create sub intersection
		System.arraycopy(this.coordinates, 0, coordinates, 0, dimCount);
		Coordinates subIntersection = new Coordinates(coordinates);
		
		return subIntersection;
	}

	/**
	 * 	Return Coordinates size
	 * 
	 * @return Coordinates size
	 */
	public int getSize() {
		
		int size = 0;
		if (coordinates != null) {
			size = coordinates.length;
		}
		return size;
	}

}
