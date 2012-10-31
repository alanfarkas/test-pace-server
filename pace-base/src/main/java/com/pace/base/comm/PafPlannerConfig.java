/*
 *	File: @(#)PafPlannerConfig.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Apr 28, 2006  		By: jmilliron
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
package com.pace.base.comm;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * Role Configuration
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafPlannerConfig implements Cloneable {
	
	private transient static final Logger logger = Logger.getLogger(PafPlannerConfig.class);
	
	private String role;
	private String cycle;
	private Integer uowSizeLarge;
	private Integer uowSizeMax;
	private Boolean isUserFilteredUow;
	private Boolean isUserFilteredMultiSelect;//	//TTN 1733 - role filter
	private Boolean isDataFilteredUow;
	private UserFilterSpec userFilterSpec;
	private DataFilterSpec dataFilterSpec;
    private String[] viewTreeItemNames;
    private String[] menuItemNames;
    private String[] autoRunOnSaveMenuItemNames;
    private String[] ruleSetNames;
    private String defaultRulesetName;
    private boolean defaultEvalEnabledWorkingVersion;
    private String[] defaultEvalRefVersions;
    private boolean mdbSaveWorkingVersionOnUowLoad;
    private Boolean defaultEvalEnabled;
    private boolean calcElapsedPeriods;
    private String[] versionFilter;
    private Boolean replicateEnabled;
    private Boolean replicateAllEnabled;
    private Boolean liftEnabled;
    private Boolean liftAllEnabled;
    private String[] readOnlyMeasures;

	/**
	 * @return Returns the cycle.
	 */
	public String getCycle() {
		return cycle;
	}

	/**
	 * @param cycle The cycle to set.
	 */
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	/**
	 * @return Returns the menuItemNames.
	 */
	public String[] getMenuItemNames() {
		return menuItemNames;
	}

	/**
	 * @param menuItemNames The menuItemNames to set.
	 */
	public void setMenuItemNames(String[] menuItemNames) {
		this.menuItemNames = menuItemNames;
	}

	/**
	 * @return Returns the role.
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role The role to set.
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return Returns the viewTreeItemNames.
	 */
	public String[] getViewTreeItemNames() {
		return viewTreeItemNames;
	}

	/**
	 * @param viewTreeItemNames The viewTreeItemNames to set.
	 */
	public void setViewTreeItemNames(String[] viewTreeItemNames) {
		this.viewTreeItemNames = viewTreeItemNames;
	}

    /**
     * @return Returns the isDefaultEvalEnabled.
     */
    public Boolean getDefaultEvalEnabled() {
        return defaultEvalEnabled;
    }

    /**
     * @param isDefaultEvalEnabled The isDefaultEvalEnabled to set.
     */
    public void setDefaultEvalEnabled(Boolean isDefaultEvalEnabled) {
        this.defaultEvalEnabled = isDefaultEvalEnabled;
    }

    public String getDefaultRulesetName() {
        return defaultRulesetName;
    }

    /**
     * @param defaultRulesetName The defaultRulesetName to set.
     */
    public void setDefaultRulesetName(String defaultRulesetName) {
        this.defaultRulesetName = defaultRulesetName;
    }

    /**
     * @return Returns the ruleSetNames.
     */
    public String[] getRuleSetNames() {
        return ruleSetNames;
    }

    /**
     * @param ruleSetNames The ruleSetNames to set.
     */
    public void setRuleSetNames(String[] ruleSetNames) {
        this.ruleSetNames = ruleSetNames;
    }

    /**
     * @return the versionFilter
     */
    public String[] getVersionFilter() {
        return versionFilter;
    }

    /**
     * @param versionFilter the versionFilter to set
     */
    public void setVersionFilter(String[] versionFilter) {
        this.versionFilter = versionFilter;
    }

	/**
	 * @return Returns the calcElapsedPeriods.
	 */
	public boolean isCalcElapsedPeriods() {
		return calcElapsedPeriods;
	}

	/**
	 * @param calcElapsedPeriods The calcElapsedPeriods to set.
	 */
	public void setCalcElapsedPeriods(boolean calcElapsedPeriods) {
		this.calcElapsedPeriods = calcElapsedPeriods;
	}

	/**
	 * @return the dataFilterSpec
	 */
	public DataFilterSpec getDataFilterSpec() {
		return dataFilterSpec;
	}

	/**
	 * @param dataFilterSpec the dataFilterSpec to set
	 */
	public void setDataFilterSpec(DataFilterSpec dataFilterSpec) {
		this.dataFilterSpec = dataFilterSpec;
	}

	/**
	 * @return the userFilterSpec
	 */
	public UserFilterSpec getUserFilterSpec() {
		return userFilterSpec;
	}

	/**
	 * @param userFilterSpec the userFilterSpec to set
	 */
	public void setUserFilterSpec(UserFilterSpec userFilterSpec) {
		this.userFilterSpec = userFilterSpec;
	}


	/**
	 * @return Returns the uowSizeLarge.
	 */
	public Integer getUowSizeLarge() {
		return uowSizeLarge;
	}

	/**
	 * @param uowSizeLarge The uowSizeLarge to set.
	 */
	public void setUowSizeLarge(Integer uowSizeLarge) {
		this.uowSizeLarge = uowSizeLarge;
	}

	/**
	 * @return Returns the uowSizeMax.
	 */
	public Integer getUowSizeMax() {
		return uowSizeMax;
	}
	
	/**
	 * @param uowSizeMax The uowSizeMax to set.
	 */
	public void setUowSizeMax(Integer uowSizeMax) {
		this.uowSizeMax = uowSizeMax;
	}

	/**
	 * @return the replicateAllEnabled
	 */
	public Boolean getReplicateAllEnabled() {
		return replicateAllEnabled;
	}

	/**
	 * @param replicateAllEnabled the replicateAllEnabled to set
	 */
	public void setReplicateAllEnabled(Boolean replicateAllEnabled) {
		this.replicateAllEnabled = replicateAllEnabled;
	}

	/**
	 * @return the replicateEnabled
	 */
	public Boolean getReplicateEnabled() {
		return replicateEnabled;
	}

	/**
	 * @return the liftEnabled
	 */
	public Boolean getLiftEnabled() {
		return liftEnabled;
	}

	/**
	 * @param liftEnabled the liftEnabled to set
	 */
	public void setLiftEnabled(Boolean liftEnabled) {
		this.liftEnabled = liftEnabled;
	}

	/**
	 * @return the liftAllEnabled
	 */
	public Boolean getLiftAllEnabled() {
		return liftAllEnabled;
	}

	/**
	 * @param liftAllEnabled the liftAllEnabled to set
	 */
	public void setLiftAllEnabled(Boolean liftAllEnabled) {
		this.liftAllEnabled = liftAllEnabled;
	}

	/**
	 * @param replicateEnabled the replicateEnabled to set
	 */
	public void setReplicateEnabled(Boolean replicateEnabled) {
		this.replicateEnabled = replicateEnabled;
	}



	/**
	 * @return the defaultEvalRefVersions
	 */
	public String[] getDefaultEvalRefVersions() {
		return defaultEvalRefVersions;
	}

	/**
	 * @param defaultEvalRefVersions the defaultEvalRefVersions to set
	 */
	public void setDefaultEvalRefVersions(String[] defaultEvalRefVersions) {
		this.defaultEvalRefVersions = defaultEvalRefVersions;
	}

	/**
	 * @return the mdbSaveWorkingVersionOnUowLoad
	 */
	public boolean isMdbSaveWorkingVersionOnUowLoad() {
		return mdbSaveWorkingVersionOnUowLoad;
	}

	/**
	 * @param mdbSaveWorkingVersionSaveOnUowLoad the mdbSaveWorkingVersionOnUowLoad to set
	 */
	public void setMdbSaveWorkingVersionOnUowLoad(boolean mdbSaveWorkingVersionOnUowLoad) {
		this.mdbSaveWorkingVersionOnUowLoad = mdbSaveWorkingVersionOnUowLoad;
	}

	/**
	 * @return the defaultEvalEnabledWorkingVersion
	 */
	public boolean isDefaultEvalEnabledWorkingVersion() {
		return defaultEvalEnabledWorkingVersion;
	}

	/**
	 * @param defaultEvalEnabledWorkingVersion the defaultEvalEnabledWorkingVersion to set
	 */
	public void setDefaultEvalEnabledWorkingVersion(boolean defaultEvalEnabledWorkingVersion) {
		this.defaultEvalEnabledWorkingVersion = defaultEvalEnabledWorkingVersion;
	}

	public Boolean getIsDataFilteredUow() {
		return isDataFilteredUow;
	}

	public void setIsDataFilteredUow(Boolean isDataFilteredUow) {
		this.isDataFilteredUow = isDataFilteredUow;
	}

	public Boolean getIsUserFilteredUow() {
		return isUserFilteredUow;
	}

	public void setIsUserFilteredUow(Boolean isUserFilteredUow) {
		this.isUserFilteredUow = isUserFilteredUow;
	}

	/**
	 * @return the autoRunOnSaveMenuItemNames
	 */
	public String[] getAutoRunOnSaveMenuItemNames() {
		return autoRunOnSaveMenuItemNames;
	}

	/**
	 * @param autoRunOnSaveMenuItemNames the autoRunOnSaveMenuItemNames to set
	 */
	public void setAutoRunOnSaveMenuItemNames(String[] autoRunOnSaveMenuItemNames) {
		this.autoRunOnSaveMenuItemNames = autoRunOnSaveMenuItemNames;
	}
	
	/**
	 * @return the readOnlyMeasures
	 */
	public String[] getReadOnlyMeasures() {
		return readOnlyMeasures;
	}

	/**
	 * @param readOnlyMeasures the readOnlyMeasures to set
	 */
	public void setReadOnlyMeasures(String[] readOnlyMeasures) {
		this.readOnlyMeasures = readOnlyMeasures;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(autoRunOnSaveMenuItemNames);
		result = prime * result + (calcElapsedPeriods ? 1231 : 1237);
		result = prime * result + ((cycle == null) ? 0 : cycle.hashCode());
		result = prime * result
				+ ((dataFilterSpec == null) ? 0 : dataFilterSpec.hashCode());
		result = prime
				* result
				+ ((defaultEvalEnabled == null) ? 0 : defaultEvalEnabled
						.hashCode());
		result = prime * result
				+ (defaultEvalEnabledWorkingVersion ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(defaultEvalRefVersions);
		result = prime
				* result
				+ ((defaultRulesetName == null) ? 0 : defaultRulesetName
						.hashCode());
		result = prime
				* result
				+ ((isDataFilteredUow == null) ? 0 : isDataFilteredUow
						.hashCode());
		result = prime
				* result
				+ ((isUserFilteredUow == null) ? 0 : isUserFilteredUow
						.hashCode());
		result = prime * result
				+ (mdbSaveWorkingVersionOnUowLoad ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(menuItemNames);
		result = prime * result + Arrays.hashCode(readOnlyMeasures);
		result = prime
				* result
				+ ((replicateAllEnabled == null) ? 0 : replicateAllEnabled
						.hashCode());
		result = prime
				* result
				+ ((replicateEnabled == null) ? 0 : replicateEnabled.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + Arrays.hashCode(ruleSetNames);
		result = prime * result
				+ ((uowSizeLarge == null) ? 0 : uowSizeLarge.hashCode());
		result = prime * result
				+ ((uowSizeMax == null) ? 0 : uowSizeMax.hashCode());
		result = prime * result
				+ ((userFilterSpec == null) ? 0 : userFilterSpec.hashCode());
		result = prime * result + Arrays.hashCode(versionFilter);
		result = prime * result + Arrays.hashCode(viewTreeItemNames);
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
		PafPlannerConfig other = (PafPlannerConfig) obj;
		if (!Arrays.equals(autoRunOnSaveMenuItemNames,
				other.autoRunOnSaveMenuItemNames))
			return false;
		if (calcElapsedPeriods != other.calcElapsedPeriods)
			return false;
		if (cycle == null) {
			if (other.cycle != null)
				return false;
		} else if (!cycle.equals(other.cycle))
			return false;
		if (dataFilterSpec == null) {
			if (other.dataFilterSpec != null)
				return false;
		} else if (!dataFilterSpec.equals(other.dataFilterSpec))
			return false;
		if (defaultEvalEnabled == null) {
			if (other.defaultEvalEnabled != null)
				return false;
		} else if (!defaultEvalEnabled.equals(other.defaultEvalEnabled))
			return false;
		if (defaultEvalEnabledWorkingVersion != other.defaultEvalEnabledWorkingVersion)
			return false;
		if (!Arrays
				.equals(defaultEvalRefVersions, other.defaultEvalRefVersions))
			return false;
		if (defaultRulesetName == null) {
			if (other.defaultRulesetName != null)
				return false;
		} else if (!defaultRulesetName.equals(other.defaultRulesetName))
			return false;
		if (isDataFilteredUow == null) {
			if (other.isDataFilteredUow != null)
				return false;
		} else if (!isDataFilteredUow.equals(other.isDataFilteredUow))
			return false;
		if (isUserFilteredUow == null) {
			if (other.isUserFilteredUow != null)
				return false;
		} else if (!isUserFilteredUow.equals(other.isUserFilteredUow))
			return false;
		if (mdbSaveWorkingVersionOnUowLoad != other.mdbSaveWorkingVersionOnUowLoad)
			return false;
		if (!Arrays.equals(menuItemNames, other.menuItemNames))
			return false;
		if (!Arrays.equals(readOnlyMeasures, other.readOnlyMeasures))
			return false;
		if (replicateAllEnabled == null) {
			if (other.replicateAllEnabled != null)
				return false;
		} else if (!replicateAllEnabled.equals(other.replicateAllEnabled))
			return false;
		if (replicateEnabled == null) {
			if (other.replicateEnabled != null)
				return false;
		} else if (!replicateEnabled.equals(other.replicateEnabled))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (!Arrays.equals(ruleSetNames, other.ruleSetNames))
			return false;
		if (uowSizeLarge == null) {
			if (other.uowSizeLarge != null)
				return false;
		} else if (!uowSizeLarge.equals(other.uowSizeLarge))
			return false;
		if (uowSizeMax == null) {
			if (other.uowSizeMax != null)
				return false;
		} else if (!uowSizeMax.equals(other.uowSizeMax))
			return false;
		if (userFilterSpec == null) {
			if (other.userFilterSpec != null)
				return false;
		} else if (!userFilterSpec.equals(other.userFilterSpec))
			return false;
		if (!Arrays.equals(versionFilter, other.versionFilter))
			return false;
		if (!Arrays.equals(viewTreeItemNames, other.viewTreeItemNames))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PafPlannerConfig clone() {

		PafPlannerConfig cloneRoleConfig = null;
		
		try {
			
			cloneRoleConfig = (PafPlannerConfig) super.clone();
			
			//deep clone data filter spec
			if ( this.dataFilterSpec != null ) {
				
				cloneRoleConfig.dataFilterSpec = this.dataFilterSpec.clone();
				
			}
			
			//deep clone user filter spec
			if ( this.userFilterSpec != null ) {
				
				cloneRoleConfig.userFilterSpec = this.userFilterSpec.clone();
				
			}
			
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		
		return cloneRoleConfig;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PafPlannerConfig [role=" + role + ", cycle=" + cycle
				+ ", uowSizeLarge=" + uowSizeLarge + ", uowSizeMax="
				+ uowSizeMax + ", isUserFilteredUow=" + isUserFilteredUow
				+ ", isDataFilteredUow=" + isDataFilteredUow
				+ ", userFilterSpec=" + userFilterSpec + ", dataFilterSpec="
				+ dataFilterSpec + ", viewTreeItemNames="
				+ Arrays.toString(viewTreeItemNames) + ", menuItemNames="
				+ Arrays.toString(menuItemNames)
				+ ", autoRunOnSaveMenuItemNames="
				+ Arrays.toString(autoRunOnSaveMenuItemNames)
				+ ", ruleSetNames=" + Arrays.toString(ruleSetNames)
				+ ", defaultRulesetName=" + defaultRulesetName
				+ ", defaultEvalEnabledWorkingVersion="
				+ defaultEvalEnabledWorkingVersion
				+ ", defaultEvalRefVersions="
				+ Arrays.toString(defaultEvalRefVersions)
				+ ", mdbSaveWorkingVersionOnUowLoad="
				+ mdbSaveWorkingVersionOnUowLoad + ", defaultEvalEnabled="
				+ defaultEvalEnabled + ", calcElapsedPeriods="
				+ calcElapsedPeriods + ", versionFilter="
				+ Arrays.toString(versionFilter) + ", replicateEnabled="
				+ replicateEnabled + ", replicateAllEnabled="
				+ replicateAllEnabled + ", readOnlyMeasures="
				+ Arrays.toString(readOnlyMeasures) + "]";
	}
	//TTN 1733 - role filter
	public Boolean getIsUserFilteredMultiSelect() {
		return isUserFilteredMultiSelect;
	}

	public void setIsUserFilteredMultiSelect(Boolean isUserFilteredMultiSelect) {
		this.isUserFilteredMultiSelect = isUserFilteredMultiSelect;
	}
	
	
	
}
