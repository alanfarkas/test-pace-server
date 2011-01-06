/*
 *	File: @(#)PafApplication.java 	Package: com.palladium.paf.server 	Project: PafServer
 *	Created: Oct 18, 2005  		By: JWatkins
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
package com.palladium.paf.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.db.membertags.MemberTagDef;
import com.palladium.paf.funcs.IPafFunction;
import com.palladium.paf.funcs.CustomFunctionDef;



/**
 * Paf Application Definition
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafApplicationDef {
	
    private String appId;
    private AppSettings appSettings;
    private MdbDef mdbDef;
    
    // for a given application id store a hash map of version definitions
    private Map<String, VersionDef> versionDefs;
    private Map<String, MeasureDef> measureDefs;
    private Map<String, CustomMenuDef> customMenuDefs;
    private Map<String, MemberTagDef> memberTagDefs;
    
    private PlanCycle[] planCycles;
    private SeasonList seasonList;
    private String lastPeriod;	
    private String currentYear;	
    private Integer essNetTimeOut;
    private String[] essAttrDimFilter;
    
    private MeasureFunctionFactory functionFactory;

    
    public void initVersions(List<VersionDef> versions) {
    	
        if (versionDefs == null) {
        	
        	versionDefs = new HashMap<String, VersionDef>();
        	
        }
        
        if ( versions != null ) {
	        
        	for (VersionDef vd : versions) {
	        	
	            versionDefs.put(vd.getName(), vd);
	        
        	}
        }
    }
    
    public void initMeasures(List<MeasureDef> measures) {
    	
        if (measureDefs == null) {
        	
        	measureDefs = new HashMap<String, MeasureDef>();
        	
        }
        
        if ( measures != null ) {
        	
	        for (MeasureDef md : measures) {
	         
	        	measureDefs.put(md.getName(), md);
	        	
	        }
	        
        }
    }
    
    public void initCustomMenus(List<CustomMenuDef> customMenus) {
    	
        if (customMenuDefs == null) {
        	
            customMenuDefs = new HashMap<String, CustomMenuDef>();
            
        }
        
        if ( customMenus != null ) {
        	
	        for (CustomMenuDef md : customMenus) {
	        	
	            customMenuDefs.put(md.getKey(), md);
	            
	        }
	        
        }
    }
    

    /**
     *  Initialize collection of member tags
     *
     * @param memberTags Array of member tag definitions
     */
    public void initMemberTags(List<MemberTagDef> memberTags) {
    	
        if (memberTagDefs == null) {
        	
            memberTagDefs = new HashMap<String, MemberTagDef>();
            
        }
        
        if ( memberTags != null ) {
        	
	        for (MemberTagDef mtDef : memberTags) {
	        	
	            memberTagDefs.put(mtDef.getName(), mtDef);
	            
	        }
	        
        }
    }
    
    
    
    /**
     * @return Returns the seasonList.
     */
    public SeasonList getSeasonList() {
        return seasonList;
    }
    /**
     * @param seasonList The seasonList to set.
     */
    public void setSeasonList(SeasonList seasonList) {
        this.seasonList = seasonList;
    }
    /**
     * @return Returns the appId.
     */
    public String getAppId() {
        return appId;
    }
    /**
     * @param appId The appId to set.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
   /**
     * @return Returns the planCycles.
     */
    public PlanCycle[] getPlanCycles() {
        return planCycles;
    }
    /**
     * @param planCycles The planCycles to set.
     */
    public void setPlanCycles(PlanCycle[] planCycles) {
        this.planCycles = planCycles;
    }
    
    public String findPlanCycleVersion(String cycleLabel) {
        for (PlanCycle cycle : planCycles) {
            if (cycle.getLabel().equals(cycleLabel)) return cycle.getVersion();
        }
        throw new IllegalArgumentException("No cycle found with the specified label");
    }
	public String getLastPeriod() {
		return lastPeriod;
	}
	public void setLastPeriod(String elapsedTime) {
		this.lastPeriod = elapsedTime;
	}
	public String getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(String elapsedYear) {
		this.currentYear = elapsedYear;
	}

	/**
	 * @return the Essbase network timeout value (in milliseconds)
	 */
	public Integer getEssNetTimeOut() {
		if (essNetTimeOut == null) {
			return PafBaseConstants.ESS_NET_TIMEOUT_DEFAULT;
		}
		return essNetTimeOut;
	}	
	/**
	 * @param essNetTimeOut the Essbase network timeout value to set (in milliseconds)
	 */
	public void setEssNetTimeOut(Integer essNetTimeOut) {
		this.essNetTimeOut = essNetTimeOut;
	}
 	
	/**
	 * @return the essAttrDimFilter
	 */
	public String[] getEssAttrDimFilter() {
		return essAttrDimFilter;
	}
	/**
	 * @param essAttrDimFilter the essAttrDimFilter to set
	 */
	public void setEssAttrDimFilter(String[] essAttrDimFilter) {
		this.essAttrDimFilter = essAttrDimFilter;
	}

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

	public Map<String, MeasureDef> getMeasureDefs() {
		return measureDefs;
	}
	public void setMeasureDefs(Map<String, MeasureDef> measureDefs) {
		this.measureDefs = measureDefs;
	}
	
	/**
	 *	Returns the measureDef object for the specified measures member
	 *
	 * @param measure Measures dimension member
	 * 
	 * @return the measureDef object for the specified version member
	 */
	public MeasureDef getMeasureDef(String measure) {
		MeasureDef measureDef = getMeasureDefs().get(measure);
		if (measureDef == null) {
			String errMsg = "Unable to get MeasureDef object for undefined measure: [" + measure + "]";
			throw new IllegalArgumentException(errMsg);
		}
		return measureDef;
	}    
 
	/**
	 *  Return a measure catalog containing only the specified measures
	 *
	 * @param measureList List of desired measures
	 * 
	 * @return Map<String, MeasureDef>
	 */
	public Map<String, MeasureDef> getMeasureDefs(List<String> measureList) {
		
		Map<String, MeasureDef> measureCat = new HashMap<String, MeasureDef>();
		
		for (String measure : measureList) {
			measureCat.put(measure, getMeasureDef(measure));
		}
		
		// Return filtered measure catalog
		return measureCat;
	}

    /**
     *	Return measures list
     *
     * @return List<String>
     */
    public List<String> getMeasures() {
    	
    	List<String> measures = new ArrayList<String>(measureDefs.size());
    	measures.addAll(measureDefs.keySet());
    	return measures;
  	
    }            
  
	/**
	 *	Returns the memberTagDef object for the specified member tag
	 *
	 * @param memberTagName Member tag name
	 * 
	 * @return the memberTagDef object for the specified member tag
	 */
	public MemberTagDef getMemberTagDef(String memberTagName) {
		MemberTagDef memberTagDef = getMemberTagDefs().get(memberTagName);
		if (memberTagDef == null) {
			String errMsg = "Unable to get MemeberTagDef object for undefined member tag: [" + memberTagName + "]";
			throw new IllegalArgumentException(errMsg);
		}
		return memberTagDef;
	}    
 
    /**
     *	Return list of member names
     *
     * @return List<String>
     */
    public List<String> getMemberTagNames() {
    	
    	List<String> memberTags = new ArrayList<String>(getMemberTagDefs().size());
    	memberTags.addAll(getMemberTagDefs().keySet());
    	return memberTags;
  	
    }            

	/**
	 * @return the memberTagDefs
	 */
	public Map<String, MemberTagDef> getMemberTagDefs() {
		return memberTagDefs;
	}

	/**
	 * @param memberTagDefs the memberTagDefs to set
	 */
	public void setMemberTagDefs(Map<String, MemberTagDef> memberTagDefs) {
		this.memberTagDefs = memberTagDefs;
	}

	public Map<String, VersionDef> getVersionDefs() {
		return versionDefs;
	}
	public void setVersionDefs(Map<String, VersionDef> versionDefs) {
		this.versionDefs = versionDefs;

	}
    
    /**
     *	Return version definitions for specified version type
     *
     * @param versionType
     * @return List<VersionDef>
     */
    public List<VersionDef> getVersionDefs(VersionType versionType) {
        List<VersionDef> vv = new ArrayList<VersionDef>(versionDefs.size());
        for (VersionDef vd : versionDefs.values()) {
            if (vd.getType() == versionType) {
                vv.add(vd);
            }
        }
        return vv;     
    }   
    
    /**
     *	Return calculated version definitions
     *
     * @return List<VersionDef>
     */
    public List<VersionDef> getCalculatedVersionDefs() {
    	return getVersionDefs(VersionType.Calculated);       
    }            

    /**
     *	Return contribution percent definitions
     *
     * @return List<VersionDef>
     */
    public List<VersionDef> getContribPctDefs() {
    	return getVersionDefs(VersionType.ContribPct);       
    }            

    /**
     *	Return variance version definitions
     *
     * @return List<VersionDef>
     */
    public List<VersionDef> getVarianceVersionDefs() {
    	return getVersionDefs(VersionType.Variance);       
    }            

    /**
     *	Return derived version definitions
     *
     * @return List<VersionDef>
     */
    public List<VersionDef> getDerivedVersionDefs() {	
    	List<VersionDef> derivedVersionDefs = new ArrayList<VersionDef>();
    	for (VersionType versionType:PafBaseConstants.DERIVED_VERSION_TYPE_LIST) {
    		derivedVersionDefs.addAll(getVersionDefs(versionType));	
    	}
    	return derivedVersionDefs;
    }
    
	/**
	 *	Returns the versionDef object for the specified version member
	 *
	 * @param version Version dimension member
	 * 
	 * @return the versionDef object for the specified version member
	 */
	public VersionDef getVersionDef(String version) {
		return getVersionDefs().get(version);
	}

   /**
     *	Return version list
     *
     * @return List<String>
     */
    public List<String> getVersions() {
    	
    	List<String> versions = new ArrayList<String>(versionDefs.size());
    	versions.addAll(versionDefs.keySet());
    	return versions;
  	
    }            

    /**
     *	Return versions for selected version type
     *
     * @return List<String>
     */
    public List<String> getVersions(VersionType versionType) {
    	
    	List<String> versions = new ArrayList<String>();       
    	for (VersionDef vd : versionDefs.values()) {
    		if (vd.getType() == versionType) {
    			versions.add(vd.getName());
    		}
    	}
    	return versions;
    	
    }            

    /**
     *	Return list of calculated versions
     *
     * @return List<String>
     */
    public List<String> getCalculatedVersions() {
    	return getVersions(VersionType.Calculated);       
    }            

    /**
     *	Return list of contribution percent versions
     *
     * @return List<String>
     */
    public List<String> getContribPctVersions() {
    	return getVersions(VersionType.ContribPct);       
    }            

    /**
     *	Return list of variance versions
     *
     * @return List<String>
     */
    public List<String> getVarianceVersions() {
    	return getVersions(VersionType.Variance);       
    }            

    /**
     *	Return list of derived versions
     *
     * @return List<String>
     */
    public List<String> getDerivedVersions() {
    	
    	List<String> derivedVersions = new ArrayList<String>();
    	for (VersionType versionType:PafBaseConstants.DERIVED_VERSION_TYPE_LIST) {
    		derivedVersions.addAll(getVersions(versionType));
    	}
    	return derivedVersions;       
    }            

   public void initFunctionFactory(List<CustomFunctionDef> customFunctionDefList) {
    	
	   	CustomFunctionDef[] customFunctionDefAr = null;	   
	   	
	   	if ( customFunctionDefList != null && customFunctionDefList.size() > 0 ) {
	   		
	   		customFunctionDefAr = customFunctionDefList.toArray(new CustomFunctionDef[0]);
	   		
	   	}

    	functionFactory = new MeasureFunctionFactory(customFunctionDefAr);        
    }
    
    public IPafFunction getCustomFunction(String funcName) throws PafException {
    	return functionFactory.getFunction(funcName);
    }
    
    public CustomMenuDef getCustomMenuDef(String menuDefName) {
        if (!customMenuDefs.containsKey(menuDefName))
            throw new IllegalArgumentException("No custom menu registered by that name [" + menuDefName + "]");
        return customMenuDefs.get(menuDefName);        
    }

	public  boolean isFunction(String s) {
		//TODO - dynamically read in custom function codes
		@SuppressWarnings("unused")
		String test = s.toUpperCase();
        return functionFactory.isFunction(s);
//		if (
//			test.contains(MeasureFunction.OP_PREV + "(") ||
//			test.contains(MeasureFunction.OP_NEXT + "(") ||
//			test.contains(MeasureFunction.OP_BOP + "(") ||
//			test.contains(MeasureFunction.OP_CUMCount + "(") ||
//	        test.contains(MeasureFunction.OP_PREV_CUM + "(") ||
//	        test.contains(MeasureFunction.OP_TRIGGER_IS + "(") ||            
//	        test.contains(MeasureFunction.OP_WOS + "(") ||            
//	        test.contains(MeasureFunction.OP_IWOS + "(") ||            
//			test.contains(MeasureFunction.OP_CUM + "(")
//	        
//	        
//	        
//			) {
//			return true;
//		}
//		return false;
	}

	public MeasureFunctionFactory getMeasureFunctionFactory() {
		return functionFactory;
	}
	
	/**
	 * @return Returns the appSettings.
	 */
	public AppSettings getAppSettings() {
		return appSettings;
	}

	/**
	 * @param appSettings The appSettings to set.
	 */
	public void setAppSettings(AppSettings appSettings) {
		this.appSettings = appSettings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result
				+ ((appSettings == null) ? 0 : appSettings.hashCode());
		result = prime * result
				+ ((currentYear == null) ? 0 : currentYear.hashCode());
		result = prime * result
				+ ((customMenuDefs == null) ? 0 : customMenuDefs.hashCode());
		result = prime * result + Arrays.hashCode(essAttrDimFilter);
		result = prime * result
				+ ((essNetTimeOut == null) ? 0 : essNetTimeOut.hashCode());
		result = prime * result
				+ ((functionFactory == null) ? 0 : functionFactory.hashCode());
		result = prime * result
				+ ((lastPeriod == null) ? 0 : lastPeriod.hashCode());
		result = prime * result + ((mdbDef == null) ? 0 : mdbDef.hashCode());
		result = prime * result
				+ ((measureDefs == null) ? 0 : measureDefs.hashCode());
		result = prime * result
				+ ((memberTagDefs == null) ? 0 : memberTagDefs.hashCode());
		result = prime * result + Arrays.hashCode(planCycles);
		result = prime * result
				+ ((seasonList == null) ? 0 : seasonList.hashCode());
		result = prime * result
				+ ((versionDefs == null) ? 0 : versionDefs.hashCode());
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
		PafApplicationDef other = (PafApplicationDef) obj;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (appSettings == null) {
			if (other.appSettings != null)
				return false;
		} else if (!appSettings.equals(other.appSettings))
			return false;
		if (currentYear == null) {
			if (other.currentYear != null)
				return false;
		} else if (!currentYear.equals(other.currentYear))
			return false;
		if (customMenuDefs == null) {
			if (other.customMenuDefs != null)
				return false;
		} else if (!customMenuDefs.equals(other.customMenuDefs))
			return false;
		if (!Arrays.equals(essAttrDimFilter, other.essAttrDimFilter))
			return false;
		if (essNetTimeOut == null) {
			if (other.essNetTimeOut != null)
				return false;
		} else if (!essNetTimeOut.equals(other.essNetTimeOut))
			return false;
		if (functionFactory == null) {
			if (other.functionFactory != null)
				return false;
		} else if (!functionFactory.equals(other.functionFactory))
			return false;
		if (lastPeriod == null) {
			if (other.lastPeriod != null)
				return false;
		} else if (!lastPeriod.equals(other.lastPeriod))
			return false;
		if (mdbDef == null) {
			if (other.mdbDef != null)
				return false;
		} else if (!mdbDef.equals(other.mdbDef))
			return false;
		if (measureDefs == null) {
			if (other.measureDefs != null)
				return false;
		} else if (!measureDefs.equals(other.measureDefs))
			return false;
		if (memberTagDefs == null) {
			if (other.memberTagDefs != null)
				return false;
		} else if (!memberTagDefs.equals(other.memberTagDefs))
			return false;
		if (!Arrays.equals(planCycles, other.planCycles))
			return false;
		if (seasonList == null) {
			if (other.seasonList != null)
				return false;
		} else if (!seasonList.equals(other.seasonList))
			return false;
		if (versionDefs == null) {
			if (other.versionDefs != null)
				return false;
		} else if (!versionDefs.equals(other.versionDefs))
			return false;
		return true;
	}


}
