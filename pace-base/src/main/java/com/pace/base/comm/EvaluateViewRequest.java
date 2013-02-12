/*
 *	File: @(#)EvaluateViewRequest.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Sep 8, 2005  				By: JWatkins
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
 *	05/24/06		AFarkas			x.xx			Moved from com.pace.base.server.comm (PafServer)
 * 
 */
package com.pace.base.comm;

import com.pace.base.comm.IPafViewRequest;
import com.pace.base.data.PafDataSlice;
import com.pace.base.utility.CompressionUtil;
import com.pace.base.view.PafUserSelection;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class EvaluateViewRequest extends PafRequest implements IPafViewRequest{

	private SimpleCoordList protectedCells;
    private SimpleCoordList changedCells;
    private SimpleCoordList lockedCells;
    private SimpleCoordList replicateExistingCells;
    private SimpleCoordList replicateAllCells;
    private SimpleCoordList liftExistingCells;
    private SimpleCoordList liftAllCells;
	private SimpleCoordList[] sessionCells;

    
    private String protectedFormulas[];
    private String viewName;
    private PafDataSlice dataSlice;
    private String ruleSetName;
    private int measureSetKey;
    private boolean rowsSuppressed;
    private boolean columnsSuppressed;
    private PafUserSelection[] userSelections;
    
    public String[] getProtectedFormulas() {
        return protectedFormulas;
    }
    public void setProtectedFormulas(String[] protectedFormulas) {
        this.protectedFormulas = protectedFormulas;
    }
    public SimpleCoordList getChangedCells() {
        return CompressionUtil.tryToUncompress(changedCells);
    }
    public void setChangedCells(SimpleCoordList changedCells) {
        this.changedCells = changedCells;
    }
    public PafDataSlice getDataSlice() {
        return dataSlice;
    }
    public void setDataSlice(PafDataSlice dataSlice) {
        this.dataSlice = dataSlice;
    }
    public SimpleCoordList getLockedCells() {
        return CompressionUtil.tryToUncompress(lockedCells);
    }
    public void setLockedCells(SimpleCoordList lockedCells) {
        this.lockedCells = lockedCells;
    }
    public SimpleCoordList getProtectedCells() {
        return CompressionUtil.tryToUncompress(protectedCells);
    }
    public void setProtectedCells(SimpleCoordList protectedCells) {
        this.protectedCells = protectedCells;
    }
    /**
     * @return Returns the measureSetKey.
     */
    public int getMeasureSetKey() {
        return measureSetKey;
    }
    /**
     * @param measureSetKey The measureSetKey to set.
     */
    public void setMeasureSetKey(int measureSetKey) {
        this.measureSetKey = measureSetKey;
    }
    /**
     * @return Returns the viewName.
     */
    public String getViewName() {
        return viewName;
    }
    /**
     * @param viewName The viewName to set.
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
    /**
     * @return Returns the ruleSetName.
     */
    public String getRuleSetName() {
        return ruleSetName;
    }
    /**
     * @param ruleSetName The ruleSetName to set.
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }
    /**
     * Gets a SimpleCoordList that are to be replicated to all
	 * level 0. 
     * @return A SimpleCoordList.
     */
	public SimpleCoordList getReplicateAllCells() {
						
		return CompressionUtil.tryToUncompress(replicateAllCells);
	}
	/**
	 * Sets the cells that will be will be replicated to all level 0 intersections.
	 * @param replicateAllCells
	 */
	public void setReplicateAllCells(SimpleCoordList replicateAllCells) {
		this.replicateAllCells = replicateAllCells;
	}
	/**
	 * Gets a SimpleCoordList that are to be replicated to existing
	 * level 0 only.
	 * @return A SimpleCoordList.
	 */
	public SimpleCoordList getReplicateExistingCells() {
		return CompressionUtil.tryToUncompress(replicateExistingCells);
	}
	/**
	 * Sets the cells that will be will be replicated only to existing level 0 intersections.
	 * @param replicateExistingCells
	 */
	public void setReplicateExistingCells(SimpleCoordList replicateExistingCells) {
		this.replicateExistingCells = replicateExistingCells;
	}
	
	/**
	 * @return the liftExistingCells
	 */
	public SimpleCoordList getLiftExistingCells() {
		return CompressionUtil.tryToUncompress(liftExistingCells);
	}
	/**
	 * @param liftExistingCells the liftExistingCells to set
	 */
	public void setLiftExistingCells(SimpleCoordList liftExistingCells) {
		this.liftExistingCells = liftExistingCells;
	}
	/**
	 * @return the liftAllCells
	 */
	public SimpleCoordList getLiftAllCells() {
		return CompressionUtil.tryToUncompress(liftAllCells);
	}
	/**
	 * @param liftAllCells the liftAllCells to set
	 */
	public void setLiftAllCells(SimpleCoordList liftAllCells) {
		this.liftAllCells = liftAllCells;
	}
	
	public void setRowsSuppressed(boolean rowsSuppressed) {
		this.rowsSuppressed = rowsSuppressed;
	}
	public boolean getRowsSuppressed() {
		return rowsSuppressed;
	}

	/**
	 * @return the sessionCells
	 */
	public SimpleCoordList[] getSessionCells() {
		return sessionCells;
	}
	/**
	 * @param sessionCells The session cells to set
	 */
	public void setSessionCells(SimpleCoordList[] sessionCells) {
		this.sessionCells = sessionCells;
	}

	public void setColumnsSuppressed(boolean columnsSuppressed) {
		this.columnsSuppressed = columnsSuppressed;
	}
	public boolean getColumnsSuppressed() {
		return columnsSuppressed;
	}
	public void setUserSelections(PafUserSelection[] userSelections) {
		this.userSelections = userSelections;
	}
	public PafUserSelection[] getUserSelections() {
		return userSelections;
	}
	
}
