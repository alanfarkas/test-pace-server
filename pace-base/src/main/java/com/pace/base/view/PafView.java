/*
 *  File: @(#)PafView.java 	Package: com.pace.base.view   Project: Paf Server
 *  Created:             	By: Jim Watkins
 *  Version: x.xx
 *
 *  Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Palladium Group, Inc.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Palladium Group, Inc.
 *
 *
 *
 Date            Author          Version         Changes
 xx/xx/xx        xxxxxxxx        x.xx            ..............
 * 
 */

package com.pace.base.view;

import java.util.Arrays;


/**
 * View object (defined and rendered)
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafView implements IPafView, Cloneable {
	private PafViewSection[] viewSections ;
	private String[] viewSectionNames;
	private String name;
	private String desc;
    private String backGroundColor;
	private PafViewHeader headers[];   
	private PafUserSelection[] userSelections;
	private String pageOrientation;	
	private Integer pagesTall;	
	private Integer pagesWide;	
    private boolean rowsSuppressed;
    private boolean columnsSuppressed;
    private boolean dirtyFlag = false;

    /* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#getDesc()
	 */
    public String getDesc() {
		return desc;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#setDesc(java.lang.String)
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#getHeaders()
	 */
	public PafViewHeader[] getHeaders() {
		return headers;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#setHeaders(com.pace.base.view.PafViewHeader[])
	 */
	public void setHeaders(PafViewHeader headers[]) {
		this.headers = headers;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#getName()
	 */
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#getViewSections()
	 */
	public PafViewSection[] getViewSections() {
		return viewSections;
	}
	/* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#setViewSections(com.pace.base.view.PafViewSection[])
	 */
	public void setViewSections(PafViewSection viewSections[]) {
		this.viewSections = viewSections;
	}
    /* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#getBackGroundColor()
	 */
    public String getBackGroundColor() {
        return backGroundColor;
    }
    /* (non-Javadoc)
	 * @see com.pace.base.view.IPafView#setBackGroundColor(java.lang.String)
	 */
    public void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
    }
	public PafUserSelection[] getUserSelections() {
		return userSelections;
	}
	public void setUserSelections(PafUserSelection[] userSelections) {
		this.userSelections = userSelections;
	}
	public String[] getViewSectionNames() {
		return viewSectionNames;
	}
	public void setViewSectionNames(String[] viewSectionNames) {
		this.viewSectionNames = viewSectionNames;
	}
	public String getPageOrientation() {
		return pageOrientation;
	}
	public void setPageOrientation(String pageOrientation) {
		this.pageOrientation = pageOrientation;
	}
	public Integer getPagesTall() {
		return pagesTall;
	}
	public void setPagesTall(Integer pagesTall) {
		this.pagesTall = pagesTall;
	}
	public Integer getPagesWide() {
		return pagesWide;
	}
	public void setPagesWide(Integer pagesWide) {
		this.pagesWide = pagesWide;
	}
	
	@Override
	public PafView clone() throws CloneNotSupportedException {
		
		// Create new cloned view
		PafView view = (PafView) super.clone();

		// Clone view sections
		if (this.viewSections != null) {
			view.viewSections = new PafViewSection[this.viewSections.length];
			for (int i = 0; i < this.viewSections.length; i++) {
				view.viewSections[i] = this.viewSections[i].clone();
			}
		}
		
		// Clone view headers
		if (this.headers != null) {
			view.headers = new PafViewHeader[this.headers.length];
			for (int i = 0; i < this.headers.length; i++) {
				view.headers[i] = (PafViewHeader) this.headers[i].clone();
			}
		}
				
		// Return cloned view
		return view;
	}

	@Override
	public String toString() {
		return name;
	}
	public void setRowsSuppressed(boolean rowsSuppressed) {
		this.rowsSuppressed = rowsSuppressed;
	}
	public boolean getRowsSuppressed() {
		return rowsSuppressed;
	}
	public void setColumnsSuppressed(boolean columnsSuppressed) {
		this.columnsSuppressed = columnsSuppressed;
	}
	public boolean getColumnsSuppressed() {
		return columnsSuppressed;
	}
	public void setDirtyFlag(boolean dirtyFlag) {
		this.dirtyFlag = dirtyFlag;
	}
	public boolean isDirtyFlag() {
		return dirtyFlag;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((backGroundColor == null) ? 0 : backGroundColor.hashCode());
		result = prime * result + (columnsSuppressed ? 1231 : 1237);
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + (dirtyFlag ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(headers);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((pageOrientation == null) ? 0 : pageOrientation.hashCode());
		result = prime * result
				+ ((pagesTall == null) ? 0 : pagesTall.hashCode());
		result = prime * result
				+ ((pagesWide == null) ? 0 : pagesWide.hashCode());
		result = prime * result + (rowsSuppressed ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(userSelections);
		result = prime * result + Arrays.hashCode(viewSectionNames);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		//TODO: Include view section objects in this equals.
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafView other = (PafView) obj;
		if (backGroundColor == null) {
			if (other.backGroundColor != null)
				return false;
		} else if (!backGroundColor.equals(other.backGroundColor))
			return false;
		if (columnsSuppressed != other.columnsSuppressed)
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (dirtyFlag != other.dirtyFlag)
			return false;
		if (!Arrays.equals(headers, other.headers)) {
			
			return false;
						
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pageOrientation == null) {
			if (other.pageOrientation != null)
				return false;
		} else if (!pageOrientation.equals(other.pageOrientation))
			return false;
		if (pagesTall == null) {
			if (other.pagesTall != null)
				return false;
		} else if (!pagesTall.equals(other.pagesTall))
			return false;
		if (pagesWide == null) {
			if (other.pagesWide != null)
				return false;
		} else if (!pagesWide.equals(other.pagesWide))
			return false;
		if (rowsSuppressed != other.rowsSuppressed)
			return false;		
		if (!Arrays.equals(userSelections, other.userSelections))
			return false;
		if (!Arrays.equals(viewSectionNames, other.viewSectionNames))
			return false;
		return true;
	}

	
}
