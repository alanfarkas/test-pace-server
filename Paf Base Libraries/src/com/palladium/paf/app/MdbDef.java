/*
 *	File: @(#)MdbSpec.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Dec 14, 2005  		By: AFarkas
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

import java.util.Arrays;
//import com.palladium.paf.mdb.essbase.*;

/**
 * Multi-dimensional database definition (soap complient)
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MdbDef {

	private String dataSourceId; 
	private String measureDim;
    
    private String measureRoot; 
    // this value holds the root member of the measure dimension to use. By convention
    // it defaults to the whole measureDim if not specifified
                                
	private String timeDim;
	private String planTypeDim;
	private String versionDim;
	private String yearDim;
	private String[] hierDims;
	private String[] axisPriority;
	private static int MEASURE_AXIS = 0;
	private static int PLAN_TYPE_AXIS = 1;
	private static int TIME_AXIS = 2;
	private static int VERSION_AXIS = 3;
	private static int YEAR_AXIS = 4;
	private static int MIN_DIM_COUNT = 6;	// Update this value if additional required dimensions are added
											// Assumes that at least 1 hierarchy dimension is required
	

    /** 
     *	read resolve called by PafXStream
     *
     * @return this
     */
	private Object readResolve() {
		if ( this.measureRoot == null || this.measureRoot.trim().equals("")) {
			this.measureRoot = this.measureDim;
		}

		return this;
	}	
	
	/**
	 * @return Returns the yearDim.
	 */
	public String getYearDim() {
		return yearDim;
	}
	/**
	 * @param yearDim The yearDim to set.
	 */
	public void setYearDim(String yearDim) {
		this.yearDim = yearDim;
	}

	/**
     * @return Returns the hierDims.
     */
    public String[] getHierDims() {
        return hierDims;
    }
    /**
     * @param hierDims The hierDims to set.
     */
    public void setHierDims(String[] hierDims) {
        this.hierDims = hierDims;
    }
    /**
     * @return Returns the measureDim.
     */
    public String getMeasureDim() {
        return measureDim;
    }
    /**
     * @param measureDim The measureDim to set.
     */
    public void setMeasureDim(String measureDim) {
        this.measureDim = measureDim;
    }
    /**
     * @return Returns the planTypeDim.
     */
    public String getPlanTypeDim() {
        return planTypeDim;
    }
    /**
     * @param planTypeDim The planTypeDim to set.
     */
    public void setPlanTypeDim(String planTypeDim) {
        this.planTypeDim = planTypeDim;
    }
    /**
     * @return Returns the timeDim.
     */
    public String getTimeDim() {
        return timeDim;
    }
    /**
     * @param timeDim The timeDim to set.
     */
    public void setTimeDim(String timeDim) {
        this.timeDim = timeDim;
    }
    /**
     * @return Returns the version axis.
     */
    public int getVersionAxis() {
        return VERSION_AXIS;
    }
    /**
     * This is a dummy method created to fufill soap requirements
     * 
     * @param versionAxis The versionAxis to set.
     */
    public void setVersionAxis(int versionAxis) {
     }
    /**
     * @return Returns the versionDim.
     */
    public String getVersionDim() {
        return versionDim;
    }
    /**
     * @param versionDim The versionDim to set.
     */
    public void setVersionDim(String versionDim) {
        this.versionDim = versionDim;
    }
    
    public int getDimCount() {
        return MIN_DIM_COUNT + hierDims.length - 1;
    }
    
    /**
     * @return Returns the dataSourceId.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    /**
     * @param dataSourceId The dataSourceId to set.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
 

	/**
	 * Return all defined dimension names
	 * 
	 * @return String[]
	 */
	public String[] getAllDims() {
    	
        String[] dims = new String[this.getDimCount()];

        dims[MEASURE_AXIS] = measureDim;
        dims[PLAN_TYPE_AXIS] = planTypeDim;
        dims[TIME_AXIS] = timeDim;
        dims[VERSION_AXIS] = versionDim;
        dims[YEAR_AXIS] = yearDim;
  
        int i = MIN_DIM_COUNT - 1; 
        for (String dim : hierDims) {
            dims[i++] = dim;
        }
        
        return dims;
    }

	/**
	 * Determines if the specified dimension is valid
	 * 
	 * @param dimension Dimension name
	 * @return boolean
	 */
	public boolean isDimension(String dimension) {
		
		String[] allDims = getAllDims();
		for (String dim : allDims) {
			if (dim.equalsIgnoreCase(dimension)) {
				return true;
			}
		}
		
		// Invalid dimension
		return false;
	}

	public String[] getAxisPriority() {
		return axisPriority;
	}
	public void setAxisPriority(String[] axisPriority) {
		this.axisPriority = axisPriority;
	}
    /**
     * @return the measureRoot
     */
    public String getMeasureRoot() {
        return measureRoot;
    }
    /**
     * @param measureRoot the measureRoot to set
     */
    public void setMeasureRoot(String measureRoot) {
        this.measureRoot = measureRoot;
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(axisPriority);
		result = prime * result
				+ ((dataSourceId == null) ? 0 : dataSourceId.hashCode());
		result = prime * result + Arrays.hashCode(hierDims);
		result = prime * result
				+ ((measureDim == null) ? 0 : measureDim.hashCode());
		result = prime * result
				+ ((measureRoot == null) ? 0 : measureRoot.hashCode());
		result = prime * result
				+ ((planTypeDim == null) ? 0 : planTypeDim.hashCode());
		result = prime * result + ((timeDim == null) ? 0 : timeDim.hashCode());
		result = prime * result
				+ ((versionDim == null) ? 0 : versionDim.hashCode());
		result = prime * result + ((yearDim == null) ? 0 : yearDim.hashCode());
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
		MdbDef other = (MdbDef) obj;
		if (!Arrays.equals(axisPriority, other.axisPriority))
			return false;
		if (dataSourceId == null) {
			if (other.dataSourceId != null)
				return false;
		} else if (!dataSourceId.equals(other.dataSourceId))
			return false;
		if (!Arrays.equals(hierDims, other.hierDims))
			return false;
		if (measureDim == null) {
			if (other.measureDim != null)
				return false;
		} else if (!measureDim.equals(other.measureDim))
			return false;
		if (measureRoot == null) {
			if (other.measureRoot != null)
				return false;
		} else if (!measureRoot.equals(other.measureRoot))
			return false;
		if (planTypeDim == null) {
			if (other.planTypeDim != null)
				return false;
		} else if (!planTypeDim.equals(other.planTypeDim))
			return false;
		if (timeDim == null) {
			if (other.timeDim != null)
				return false;
		} else if (!timeDim.equals(other.timeDim))
			return false;
		if (versionDim == null) {
			if (other.versionDim != null)
				return false;
		} else if (!versionDim.equals(other.versionDim))
			return false;
		if (yearDim == null) {
			if (other.yearDim != null)
				return false;
		} else if (!yearDim.equals(other.yearDim))
			return false;
		return true;
	}

    /**
     * Return the dimension type for the specified dimension name
     * 
     * @param dimName Dimension name
     * @return DimType
     */
    public DimType getDimType(String dimName) {
    	
		// Return the dimension type
		if (dimName.equalsIgnoreCase(measureDim)) {
			return DimType.Measure;
		} else if (dimName.equalsIgnoreCase(planTypeDim)) {
			return DimType.PlanType;
		} else if (dimName.equalsIgnoreCase(timeDim)) {
			return DimType.Time;
		} else if (dimName.equalsIgnoreCase(versionDim)) {
			return DimType.Version;
		} else if (dimName.equalsIgnoreCase(yearDim)) {
			return DimType.Year;
		} else {
			for (String hierDim : hierDims) {
				if (dimName.equalsIgnoreCase(hierDim)) {
					return DimType.Hier;
				}
			}
			return DimType.Unknown;
		}

    }

}