/*
 *	File: @(#)HierarchyFormat.java 	Package: com.pace.base.view 	Project: Paf Base Libraries
 *	Created: Feb 16, 2006  		By: JavaJ
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.view;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * A Hierarchy Format contains a list of dimensions.  Each dimension has a 0 or more level and generation 
 * formats.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class HierarchyFormat {

	//hierarchy format name
	private String name;
	
	//map to hold all the dimensions
	private Map<String, Dimension> dimensions;
	
	/**
	 * Creates an empty map.
	 *
	 */
	public HierarchyFormat() {
		dimensions = new HashMap<String, Dimension>();
	}	
	
	/**
	 * 
	 *	Get the dimension in the map based on key.
	 *
	 * @param dimensionKey dimension name
	 * @return				the dimension.
	 */
	public Dimension getDimension(String dimensionKey) {
		
		Dimension selectedDimension = null;
		
		//loop through keys
		for (String dimension : dimensions.keySet()) {
			
			//if dimension matches key, set selected dimension
			if ( dimension.equals(dimensionKey) ) {
				
				selectedDimension = dimensions.get(dimension);
				
				break;
			}
			
		}
			
		//return selected dimension
		return selectedDimension;
	}
	
	/**
	 * 
	 *	Add's a dimension
	 *
	 * @param dimension
	 */
	public void addDimension(Dimension dimension ) {
		dimensions.put(dimension.getName(), dimension);
	}
	
	/** 
	 *	Removes a dimension
	 *
	 * @param dimension
	 */
	public void removeDimension(Dimension dimension) {
		dimensions.remove(dimension.getName());
	}
	
	/** 
	 *	Get's dimension map
	 *
	 * @return
	 */
	public Map<String, Dimension> getDimensions() {
		return dimensions;
	}
	
	/**
	 * 
	 *	Sets dimension map.
	 *
	 * @param dimensions	dimension map.
	 */
	public void setDimensions(Map<String, Dimension> dimensions) {
		this.dimensions = dimensions;
	}
	
	/**
	 * 
	 *	Get Hier Format name
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 *	Set Hier Format name
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if ( dimensions != null ) {
		
			StringBuffer sb = new StringBuffer();
			
			sb.append("\nHierarchy Name: " + this.name + "\n");
			
			for (Dimension dimension : dimensions.values() ) {
				
				sb.append("\nDim Name: " + dimension.getName() + "\n");
				
				if ( dimension.getLevelFormats() != null ) {
					
					sb.append("\tLevel(s): \n");
					
					for (LevelFormat lf : dimension.getLevelFormats().values()) {
						
						sb.append("\t\t" + lf.getLevel() + " : " + lf.getFormatName() + "\n");
						
					}
					
				}
				
				if ( dimension.getGenFormats() != null ) {
					
					sb.append("\tGenerations(s): \n");
					
					for (GenFormat gf : dimension.getGenFormats().values()) {
						
						sb.append("\t\t" + gf.getGeneration() + " : " + gf.getFormatName() + "\n");
						
					}
					
				}
				
			}
			
			return sb.toString();
			
		}		
		
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		if ( dimensions != null && dimensions.size() > 0 ) {
			
			for ( String dimKey : dimensions.keySet() ) {
				
				result = prime * result + dimKey.hashCode();
				
				Dimension dimension = dimensions.get(dimKey);
				
				result = prime * result
				+ ((dimension == null) ? 0 : dimension.hashCode());
				
			}
			
		}		
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HierarchyFormat other = (HierarchyFormat) obj;
		if (dimensions == null) {
			if (other.dimensions != null) {
				return false;
			}
		} else if (other.dimensions == null) {
			
			return false;
			
		} else {
			
			for ( String dimKey : dimensions.keySet() ) {
				
				if ( ! other.dimensions.containsKey(dimKey)) {
					
					return false;
					
				} else {
					
					if ( ! dimensions.get(dimKey).equals(other.dimensions.get(dimKey))) {
						
						return false;
						
					}
					
				}
				
			}
			
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
