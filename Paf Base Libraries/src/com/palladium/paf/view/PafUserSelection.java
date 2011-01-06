/*
 *	File: @(#)PafUserSelection.java 	Package: com.palladium.paf.data 	Project: PafServer
 *	Created: Nov 10, 2005  		By: jwatkins
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
package com.palladium.paf.view;

import com.palladium.paf.data.ExpOperation;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jwatkins
 *
 */
public class PafUserSelection implements Comparable, Cloneable {
    private String id;
    private String dimension;
    private PafAxis pafAxis;
    private boolean multiples;
    private String promptString;
    private String[] values;
    
    // synatx for a user selection
    // ID, DImension, Accepts Multiples, Label/Prompt String
    //@USER_SEL(M1, Measures, False, "Measure Selection")
    
    public PafUserSelection(ExpOperation expOp) {
        this.id = expOp.getParms()[0];
        this.dimension = expOp.getParms()[1];
        this.multiples = (expOp.getParms()[2].equalsIgnoreCase("true")? true: false);
        this.promptString = expOp.getParms()[3];
    
    }
    //required by soap layer
    public PafUserSelection() {}
    
    /**
     * @return Returns the values.
     */
    public String[] getValues() {
        return values;
    }
    /**
     * @param values The values to set.
     */
    public void setValues(String[] values) {
        this.values = values;
    }
    /**
     * @return Returns the dimension.
     */
    public String getDimension() {
        return dimension;
    }
    /**
     * @param dimension The dimension to set.
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    /**
     * @return Returns the id.
     */
    public String getId() {
        return id;
    }
    /**
     * @param id The id to set.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return Returns the multiples.
     */
    public boolean isMultiples() {
        return multiples;
    }
    /**
     * @param multiples The multiples to set.
     */
    public void setMultiples(boolean multiples) {
        this.multiples = multiples;
    }
    /**
     * @return Returns the promptString.
     */
    public String getPromptString() {
        return promptString;
    }
    /**
     * @param promptString The promptString to set.
     */
    public void setPromptString(String promptString) {
        this.promptString = promptString;
    }
	public String getValuesAsString() {
		if (values==null) return "";
		
		StringBuffer sb = new StringBuffer();
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		
		sb.trimToSize();
		sb.deleteCharAt(sb.length()-2);
		return sb.toString();
	}
	
	public int compareTo(Object o) {
						
		return this.id.compareTo(((PafUserSelection) o).getId());
		
	}
	
	public String toString() {
		
		return "ID: " + this.getId() + ", Dimension: " + this.getDimension() + ", Multiple: " + this.isMultiples();
		
	}
	/**
	 * @return Returns the pafAxis.
	 */
	public PafAxis getPafAxis() {
		return pafAxis;
	}
	/**
	 * @param pafAxis The pafAxis to set.
	 */
	public void setPafAxis(PafAxis pafAxis) {
		this.pafAxis = pafAxis;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PafUserSelection clone() throws CloneNotSupportedException {
		
		PafUserSelection clone = (PafUserSelection) super.clone();
		
		if ( getPafAxis() != null ) {
			
			clone.setPafAxis(new PafAxis(this.getPafAxis().getValue()));
			
		}
		
		return clone;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		PafUserSelection userSelection = (PafUserSelection) obj;
		
		if ( this.id != null && userSelection.getId() != null ) {
			
			if ( this.id.equals(userSelection.getId())) {
				return true;
			}
		}
		
		return false;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		return this.id.hashCode();
	}
    
	

}
