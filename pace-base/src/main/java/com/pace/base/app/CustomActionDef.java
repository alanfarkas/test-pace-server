/*
 *	File: @(#)CustomActionDef.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: May 4, 2006  		By: JWatkins
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

import java.util.Arrays;

/**
 * Holds a action definition for a custom menu definition.
 * Consists of the name of the implementing class and the paramters
 * to be passed to it at execution time. Primarily a wrapper to allow
 * the embedding of a multiple action sequence to a custom menu command.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class CustomActionDef {
	
    String actionClassName;
    String[] actionNamedParameters;
    /**
     * @return Returns the actionClassName.
     */
    public String getActionClassName() {
        return actionClassName;
    }
    /**
     * @param actionClassName The actionClassName to set.
     */
    public void setActionClassName(String actionClassName) {
        this.actionClassName = actionClassName;
    }
	public String[] getActionNamedParameters() {
		return actionNamedParameters;
	}
	public void setActionNamedParameters(String[] actionNamedParameters) {
		this.actionNamedParameters = actionNamedParameters;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actionClassName == null) ? 0 : actionClassName.hashCode());
		result = prime * result + Arrays.hashCode(actionNamedParameters);
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
		CustomActionDef other = (CustomActionDef) obj;
		if (actionClassName == null) {
			if (other.actionClassName != null)
				return false;
		} else if (!actionClassName.equals(other.actionClassName))
			return false;
		if (!Arrays.equals(actionNamedParameters, other.actionNamedParameters))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomActionDef [actionClassName=" + actionClassName
				+ ", actionNamedParameters="
				+ Arrays.toString(actionNamedParameters) + "]";
	}

	
	
}
