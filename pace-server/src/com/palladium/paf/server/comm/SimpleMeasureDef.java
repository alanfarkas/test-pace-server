/*
 *	File: @(#)SimpleMeasureDef.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Jan 5, 2006  		By: JWatkins
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
package com.palladium.paf.server.comm;

import com.pace.base.app.MeasureDef;
/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class SimpleMeasureDef {
    private String name;
    private String type;
    private String recalcTBOveride;
    private String[] aliases;
    private String numericFormatName;
  
    
    public SimpleMeasureDef() {}
    public SimpleMeasureDef(MeasureDef measDef) {
        this.name = measDef.getName();
        this.type = measDef.getType().name();
        this.numericFormatName = measDef.getNumericFormatName();
        this.recalcTBOveride = measDef.getRecalcTBOveride().name();
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Returns the numericFormatName.
     */
    public String getNumericFormatName() {
        return numericFormatName;
    }
    /**
     * @param numericFormatName The numericFormatName to set.
     */
    public void setNumericFormatName(String numericFormatName) {
        this.numericFormatName = numericFormatName;
    }
    /**
     * @return Returns the type.
     */
    public String getType() {
        return type;
    }
    /**
     * @param type The type to set.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return Returns the recalcTBOveride.
     */
    public String getRecalcTBOveride() {
        return recalcTBOveride;
    }
    /**
     * @param recalcTBOveride The recalcTBOveride to set.
     */
    public void setRecalcTBOveride(String recalcTBOveride) {
        this.recalcTBOveride = recalcTBOveride;
    }
	/**
	 * @return the aliases
	 */
	public String[] getAliases() {
		return aliases;
	}
	/**
	 * @param aliases the aliases to set
	 */
	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}
	
}
