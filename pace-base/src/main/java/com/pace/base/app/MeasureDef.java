/*
 *	File: @(#)MeasureDef.java 	Package: com.pace.base.data 	Project: PafServer
 *	Created: Oct 11, 2005  		By: JWatkins
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

import java.util.HashMap;
import java.util.Map;

/**
 * Measure Definition
 * 
 * @version x.xx
 * @author JWatkins
 * 
 */
public class MeasureDef {
	private String name = null;
	private MeasureType type = MeasureType.Aggregate;
	private Map<String, String> aliases = null;
	private String numericFormatName = null;
	private VarRptgFlag varRptgFlag = VarRptgFlag.RevenueReporting; // Default value is 'RevenueReporting'
	private Boolean plannable;
    private MeasureType recalcTBOveride = MeasureType.Aggregate; // Default behavior is aggregate even for recalc measures
   
    
	public MeasureDef() {
	}
	
	/**
	 * @param name
	 *            Measure name
	 * @param type
	 *            Measure type
	 */
	public MeasureDef(String name, MeasureType type) {
		this.name = name;
		this.type = type;
		this.varRptgFlag = VarRptgFlag.ExpenseReporting;
	}

	public Map<String, String> getAliases() {
		return aliases;
	}

	public void setAliases(Map<String, String> aliases) {
		this.aliases = aliases;
	}

	/**
	 * Set the measure alias for the "Default" alias table
	 * 
	 * @param aliasTable
	 *            Essbase alias table name
	 * @return Returns the measure alias from the "Default" alias table
	 */
	public String getAlias(String aliasTable) {

		String alias = null;
		if (aliases != null)
			alias = aliases.get(aliasTable);
		return alias;
	}

	/**
	 * Add an alias to measure using the specified Essbase alias table
	 * 
	 * @param aliasTableName
	 *            Essbase alias table name
	 * @param alias
	 *            Measure alias
	 */
	public void addAlias(String aliasTableName, String alias) {

		// Create a new HashMap of aliases, if this is the first alias to be
		// added
		if (aliases == null)
			aliases = new HashMap<String, String>();

		// Add new alias
		aliases.put(aliasTableName, alias);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MeasureType getType() {
		return type;
	}

	public void setType(MeasureType type) {
		this.type = type;
	}

	public String getNumericFormatName() {
		return numericFormatName;
	}

	public void setNumericFormatName(String numericFormatName) {
		this.numericFormatName = numericFormatName;
	}

	/**
	 * @return Returns the varRptgFlag.
	 */
	public VarRptgFlag getVarRptgFlag() {
		return varRptgFlag;
	}

	/**
	 * @param varRptgFlag
	 *            The varRptgFlag to set.
	 */
	public void setVarRptgFlag(VarRptgFlag varRptgFlag) {
		this.varRptgFlag = varRptgFlag;
	}

	public Boolean getPlannable() {
		return plannable;
	}

	public void setPlannable(Boolean plannable) {
		this.plannable = plannable;
	}

    /**
     * @return Returns the recalcTBOveride.
     */
    public MeasureType getRecalcTBOveride() {
        // reset default case. PafXStream reading can set this to null
        if (recalcTBOveride == null) recalcTBOveride = MeasureType.Aggregate;
        return recalcTBOveride;
    }

    /**
     * @param recalcTBOveride The recalcTBOveride to set.
     */
    public void setRecalcTBOveride(MeasureType recalcTBOveride) {
        this.recalcTBOveride = recalcTBOveride;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((numericFormatName == null) ? 0 : numericFormatName
						.hashCode());
		result = prime * result
				+ ((plannable == null) ? 0 : plannable.hashCode());		
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((varRptgFlag == null) ? 0 : varRptgFlag.hashCode());
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
		MeasureDef other = (MeasureDef) obj;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numericFormatName == null) {
			if (other.numericFormatName != null)
				return false;
		} else if (!numericFormatName.equals(other.numericFormatName))
			return false;
		if (plannable == null) {
			if (other.plannable != null)
				return false;
		} else if (!plannable.equals(other.plannable))
			return false;
		
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (varRptgFlag == null) {
			if (other.varRptgFlag != null)
				return false;
		} else if (!varRptgFlag.equals(other.varRptgFlag))
			return false;
		return true;
	}


		
}
