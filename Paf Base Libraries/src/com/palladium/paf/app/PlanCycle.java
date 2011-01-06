/*
 *	File: @(#)PlanCycle.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Dec 6, 2005  		By: JWatkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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

import org.apache.log4j.Logger;

/**
 * Plan Cycle
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PlanCycle implements Cloneable {

	private transient static final Logger logger = Logger.getLogger(PlanCycle.class);
	
    private String label;
    private String version;
    
    /**
	 * Default PlanCycle constructor 
	 */
    public PlanCycle() {}
    
    /**
     * 
     * PlanCycle constructor
     * 
     * @param label plan cycle label
     * @param version plan cycle version
     */
    public PlanCycle(String label, String version) {
        this.label = label;
        this.version = version;
    }
   
	/**
     * @return Returns the label.
     */
    public String getLabel() {
        return label;
    }
    /**
     * @param label The label to set.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * @return Returns the version.
     */
    public String getVersion() {
        return version;
    }
    /**
     * @param version The version to set.
     */
    public void setVersion(String version) {
        this.version = version;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		PlanCycle other = (PlanCycle) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	 /* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PlanCycle clone() {

		try {
			return (PlanCycle) super.clone();
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		return null;
		
	}
	
}
