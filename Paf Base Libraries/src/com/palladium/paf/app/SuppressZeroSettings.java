/*
 *	File: @(#)SuppressZeroSettings.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Oct 30, 2007  		By: jmilliron
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
package com.palladium.paf.app;

/**
 * Suppress Zero Settings
 * 
 * Properties allow suppression to be enabled, visible, only by row,
 * only by column, or both.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class SuppressZeroSettings {

	//enabled or not
	private Boolean enabled = false;
	
	//visible or not
	private Boolean visible = false;
	
	//suppress on zero rows
	private Boolean rowsSuppressed = false;

	//suppress on zero columns	
	private Boolean columnsSuppressed = false;
	
	/**
	 * Default Constructor
	 *
	 */
	public SuppressZeroSettings() {		
	}
	
	/**
	 * Creats a suppress zero settings
	 * 
	 * @param rowsSuppressed		true/false
	 * @param columnsSuppressed		true/false
	 * @param enabled				true/false
	 * @param visible				true/false
	 */
	public SuppressZeroSettings(Boolean rowsSuppressed, Boolean columnsSuppressed, Boolean enabled, Boolean visible) {
		
		this.rowsSuppressed = rowsSuppressed;
		this.columnsSuppressed = columnsSuppressed;
		this.enabled = enabled;
		this.visible = visible;
		
	}
	
	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the visible
	 */
	public Boolean getVisible() {
		return visible;
	}
	/**
	 * @param visible the visible to set
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	/**
	 * @return the columnsSuppressed
	 */
	public Boolean getColumnsSuppressed() {
		return columnsSuppressed;
	}


	/**
	 * @param columnsSuppressed the columnsSuppressed to set
	 */
	public void setColumnsSuppressed(Boolean columnsSuppressed) {
		this.columnsSuppressed = columnsSuppressed;
	}


	/**
	 * @return the rowsSuppressed
	 */
	public Boolean getRowsSuppressed() {
		return rowsSuppressed;
	}


	/**
	 * @param rowsSuppressed the rowsSuppressed to set
	 */
	public void setRowsSuppressed(Boolean rowsSuppressed) {
		this.rowsSuppressed = rowsSuppressed;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer(40);
		
		strBuff.append("Enabled: " + enabled);
		strBuff.append("\n");
		strBuff.append("Visible: " + visible);
		strBuff.append("\n");
		strBuff.append("Are Zero Rows Suppressed: " + rowsSuppressed);
		strBuff.append("\n");
		strBuff.append("Are Zero Columns Suppressed: " + columnsSuppressed);
		strBuff.append("\n");		
		
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((columnsSuppressed == null) ? 0 : columnsSuppressed
						.hashCode());
		result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
		result = prime * result
				+ ((rowsSuppressed == null) ? 0 : rowsSuppressed.hashCode());
		result = prime * result + ((visible == null) ? 0 : visible.hashCode());
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
		SuppressZeroSettings other = (SuppressZeroSettings) obj;
		if (columnsSuppressed == null) {
			if (other.columnsSuppressed != null)
				return false;
		} else if (!columnsSuppressed.equals(other.columnsSuppressed))
			return false;
		if (enabled == null) {
			if (other.enabled != null)
				return false;
		} else if (!enabled.equals(other.enabled))
			return false;
		if (rowsSuppressed == null) {
			if (other.rowsSuppressed != null)
				return false;
		} else if (!rowsSuppressed.equals(other.rowsSuppressed))
			return false;
		if (visible == null) {
			if (other.visible != null)
				return false;
		} else if (!visible.equals(other.visible))
			return false;
		return true;
	}
	
	
	
}
