/*
 *	File: @(#)PafDataSliceParms.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Sep 7, 2005  				By: Alan Farkas
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
package com.pace.base.mdb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.app.UnitOfWork;
import com.pace.base.utility.StringUtils;

/**
 *  Parameter object for PafDataSlice
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafDataSliceParms {

	private String[] pageDimensions = null;
	private String[] colDimensions = null;
	private String[] rowDimensions = null;
	private String[][] colTuples = null;
	private String[] pageMembers = null;
	private String[][] rowTuples = null;
	private String[] attributeDims = null;
	private String[] dimSequence = null;
	private static Logger logger = Logger.getLogger("PafDataSliceParms");
	
	public PafDataSliceParms () {
		
		logger.debug("Creating instance of PafDataSliceParms");	
		
	}
	
	/**
	 *	Return all dimensions
	 *
	 * @return Returns the column dimensions.
	 */
	public String[] getAllDimensions() {
		
		List<String> allDims = new ArrayList<String>();
		allDims.addAll(Arrays.asList(pageDimensions));
		allDims.addAll(Arrays.asList(colDimensions));
		allDims.addAll(Arrays.asList(rowDimensions));
		return allDims.toArray(new String[0]);
	}


	/**
	 * @return the attributeDims
	 */
	public String[] getAttributeDims() {
		return attributeDims;
	}

	/**
	 * @param attributeDims the attributeDims to set
	 */
	public void setAttributeDims(String[] attributeDims) {
		this.attributeDims = attributeDims;
	}

	/**
	 *	Return the column dimensions
	 *
	 * @return Returns the column dimensions.
	 */
	public String[] getColDimensions() {
		return colDimensions;
	}

	/**
	 *	Set the column dimensions
	 *
	 * @param colDimensions The column dimensions to set.
	 */
	public void setColDimensions(String[] colDimensions) {
		this.colDimensions = colDimensions;
	}

	
	/**
	 *	Return the column members
	 *
	 * @return Returns the column members.
	 */
	public String[][] getColTuples() {
		return colTuples;
	}

	/**
	 *	Set the column members
	 *
	 * @param colTuples The column members to set.
	 */
	public void setColTuples(String[][] colTuples) {
		this.colTuples = colTuples;
	}

	
	/**
	 * @return the dimSequence
	 */
	public String[] getDimSequence() {
		return dimSequence;
	}

	/**
	 * @param dimSequence the dimSequence to set
	 */
	public void setDimSequence(String[] dimSequence) {
		this.dimSequence = dimSequence;
	}

	/**
	 *	Return the page dimensions
	 *
	 * @return Returns the page dimensions.
	 */
	public String[] getPageDimensions() {
		return pageDimensions;
	}

	/**
	 *	Set the page dimensions
	 *
	 * @param pageDimensions The page dimensions to set.
	 */
	public void setPageDimensions(String[] pageDimensions) {
		this.pageDimensions = pageDimensions;
	}

	
	/**
	 *	Return the page members
	 *
	 * @return Returns the page members.
	 */
	public String[] getPageMembers() {
		return pageMembers;
	}

	/**
	 *	Set the page members
	 *
	 * @param pageMembers The page members to set.
	 */
	public void setPageMembers(String[] pageMembers) {
		this.pageMembers = pageMembers;
	}
	
	
	/**
	 *	Return the row dimensions
	 *
	 * @return Returns the row dimensions.
	 */
	public String[] getRowDimensions() {
		return rowDimensions;
	}

	/**
	 *	Set the row dimensions
	 *
	 * @param rowDimensions The row dimensions to set.
	 */
	public void setRowDimensions(String[] rowDimensions) {
		this.rowDimensions = rowDimensions;
	}

	
	/**
	 *	Return the row members
	 *
	 * @return Returns the row members.
	 */
	public String[][] getRowTuples() {
		return rowTuples;
	}

	/**
	 *	Set the row members
	 *
	 * @param rowTuples The row members to set.
	 */
	public void setRowTuples(String[][] rowTuples) {
		this.rowTuples = rowTuples;
	}
	

	/**
	 *	Return number of dimensions in data slice
	 *
	 * @return int
	 */
	public int getDimCount() {
		return getPageDimensions().length + getRowDimensions().length + getColDimensions().length;
	}

	/**
	 *	Return the members for the specified dimension
	 *
	 * @param dimension Selected dimension
	 * @return String[]
	 */
	public String[] getMembers(final String dimension) {
		
		// Check if dimension is a page dimension
		String[] pageDimensions = getPageDimensions();
		for (int dimInx = 0; dimInx < pageDimensions.length; dimInx++) {
			String pageDimension = pageDimensions[dimInx];
			// If dimension is found, return associated members
			if (dimension.equalsIgnoreCase(pageDimension)) {
				String[] members = new String[1];
				members[0] = getPageMembers()[dimInx];
				return members;
			}
		}

		// Check if dimension is a column dimension
		String[] colDimensions = getColDimensions();
		for (int dimInx = 0; dimInx < colDimensions.length; dimInx++) {
			String colDimension = colDimensions[dimInx];
			// If dimension is found, return members
			if (dimension.equals(colDimension)) {
				Set<String> memberSet = new HashSet<String>();
				for (String[] tuple:getColTuples()) {
					memberSet.add(tuple[dimInx]);
				}
				String[] members = memberSet.toArray(new String[0]);
				return members;
			}
		}

		// Check if dimension is a row dimension
		String[] rowDimensions = getRowDimensions();
		for (int dimInx = 0; dimInx < rowDimensions.length; dimInx++) {
			String rowDimension = rowDimensions[dimInx];
			// If dimension is found, return members
			if (dimension.equals(rowDimension)) {
				Set<String> memberSet = new HashSet<String>();
				for (String[] tuple:getRowTuples()) {
					memberSet.add(tuple[dimInx]);
				}
				String[] members = memberSet.toArray(new String[0]);
				return members;
			}
		}
		
		// Dimension not found, throw exception
		String errMsg = "Unable to find dimension: [" + dimension + "] in data slice parms.";
		logger.error(errMsg);
		IllegalArgumentException iae = new IllegalArgumentException(errMsg);
		throw(iae);
	
	}
	

	/**
	 * 	Create a unit of work specification 
	 * 
	 * @return UnitOfWork
	 */
	public UnitOfWork buildUowSpec() {
		return buildUowSpec(getAllDimensions());
	}

	/**
	 * 	Create a unit of work specification for the specified dimensions
	 * 
	 * @param dimensions Array of dimensions in axis order
	 * @return UnitOfWork
	 */
	public UnitOfWork buildUowSpec(String[] dimensions) {
		
		int dimCount = dimensions.length;
		String[][] memberArray = new String[dimCount][];
		for (int i = 0; i < dimCount; i++) {
			String dimension = dimensions[i];
			memberArray[i] = getMembers(dimension);
		}
		
		return new UnitOfWork(dimensions, memberArray);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		// Display important data slice parms
		StringBuffer sb = new StringBuffer();
		sb.append("Page Dimensions: " + StringUtils.arrayToString(pageDimensions));
		sb.append("\nPage Members: " + StringUtils.arrayToString(pageMembers));
		sb.append("\nColumn Dimensions: " + StringUtils.arrayToString(colDimensions));
		sb.append("\nRow Dimensions: " + StringUtils.arrayToString(rowDimensions));
		return sb.toString();
	}

}
