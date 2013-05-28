/*
 *	File: @(#)PafDimSpec.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Oct 13, 2005  		By: JWatkins
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
package com.pace.base.app;

import java.util.List;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafDimSpec2 implements Cloneable {

    private String dimension;
    private List<String> expressionList;
    
    public PafDimSpec2() { 
    }
    
    
    public PafDimSpec2(String dimension, List<String> expressionList) {
		super();
		this.dimension = dimension;
		this.expressionList = expressionList;
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
     * @return Returns the expressionList.
     */
    public List<String> getExpressionList() {
        return expressionList;
    }
    /**
     * @param expressionList The expressionList to set.
     */
    public void setExpressionList(List<String> expressionList) {
        this.expressionList = expressionList;
    }

    public PafDimSpec toPafDimSpec(){
    	PafDimSpec temp = new PafDimSpec();
    	temp.setDimension(this.dimension);
    	temp.setExpressionList(this.expressionList.toArray(new String[this.expressionList.size()]));
    	return temp;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.PafDimSpec#clone()
	 */
	@Override
	public PafDimSpec2 clone() {
		
		try {
			
			return (PafDimSpec2) super.clone();
			
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
		}
		
		return null;
	}

	
}
