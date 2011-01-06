/*
 *  File: @(#)PafClientCacheBlock.java  Package: com.palladium.paf.server.comm   Project: PafServer
 *  Created: Aug 25, 2005       By: JWatkins
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

package com.palladium.paf.server.comm;


import com.palladium.paf.app.MdbDef;
import com.palladium.paf.db.membertags.MemberTagDef;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.view.PafStyle;

public class PafClientCacheBlock {

	MdbDef mdbDef;
    String[] axisSequence;
    RuleSet[] ruleSets;
    SimpleMeasureDef[] measureDefs = null;
    PafStyle[] globalStyles;
    SimpleVersionDef[] versionDefs = null;  
    MemberTagDef[] memberTagDefs;
    String lastPeriod;	
    String currentYear;	


    /**
	 * @return Returns the mdbDef.
	 */
	public MdbDef getMdbDef() {
		return mdbDef;
	}
	/**
	 * @param mdbDef The mdbDef to set.
	 */
	public void setMdbDef(MdbDef mdbDef) {
		this.mdbDef = mdbDef;
	}
	
	public RuleSet[] getRuleSets() {
        return ruleSets;
    }
    public void setRuleSets(RuleSet[] ruleSets) {
        this.ruleSets = ruleSets;
    }

    public String[] getAxisSequence() {
        return axisSequence;
    }
    public void setAxisSequence(String[] axisSequence) {
        this.axisSequence = axisSequence;
    }
    
	public PafStyle[] getGlobalStyles() {
		return globalStyles;
	}
	public void setGlobalStyles(PafStyle[] globalStyles) {
		this.globalStyles = globalStyles;
	}
	
    /**
     * @return Returns the measureDefs.
     */
    public SimpleMeasureDef[] getMeasureDefs() {
        return measureDefs;
    }
    /**
     * @param measureDefs The measureDefs to set.
     */
    public void setMeasureDefs(SimpleMeasureDef[] measureDefs) {
        this.measureDefs = measureDefs;
    }
    
	public SimpleVersionDef[] getVersionDefs() {
		return versionDefs;
	}
	public void setVersionDefs(SimpleVersionDef[] versionDefs) {
		this.versionDefs = versionDefs;
	}
	
	/**
	 * @return Returns the currentYear.
	 */
	public String getCurrentYear() {
		return currentYear;
	}
	/**
	 * @param currentYear The currentYear to set.
	 */
	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}
	
	/**
	 * @return Returns the lastPeriod.
	 */
	public String getLastPeriod() {
		return lastPeriod;
	}
	/**
	 * @param lastPeriod The lastPeriod to set.
	 */
	public void setLastPeriod(String lastPeriod) {
		this.lastPeriod = lastPeriod;
	}
	/**
	 * @return the memberTagDefs
	 */
	public MemberTagDef[] getMemberTagDefs() {
		return memberTagDefs;
	}
	/**
	 * @param memberTagDefs the memberTagDefs to set
	 */
	public void setMemberTagDefs(MemberTagDef[] memberTagDefs) {
		this.memberTagDefs = memberTagDefs;
	}

}
