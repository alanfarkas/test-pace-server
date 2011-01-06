/*
 *	File: @(#)PageTuple.java 	Package: com.palladium.paf.view 	Project: PafServer
 *	Created: Sep 21, 2005  		By: JWatkins
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


/**
 * Page tuple
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PageTuple implements Cloneable {
	
    private String axis;
    private String member;

    public PageTuple() {}
    
    public PageTuple(String axis, String member) {
        this.axis = axis;
        this.member = member;
    }
    public String getAxis() {
        return axis;
    }
    public void setAxis(String axis) {
        this.axis = axis;
    }
    public String getMember() {
        return member;
    }
    public void setMember(String member) {
        this.member = member;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PageTuple clone() throws CloneNotSupportedException {
		
		PageTuple pageTuple = (PageTuple) super.clone();
		return pageTuple;
		
	}

    public String toString() {
    	
    	return "PageTuple=> Axis: " + axis + ", Member: " + member;
    	
    }

}
