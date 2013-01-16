/*
 *	File: @(#)SliceState.java 	Package: com.pace.base.state 	Project: Paf Base Libraries
 *	Created: Sep 10, 2005  		By: jim
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
package com.pace.base.state;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.comm.EvaluateViewRequest;
import com.pace.base.comm.SimpleCoordList;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDataSliceParms;
import com.pace.base.utility.StringUtils;

/**
 * Value object for the current changes, protections and locks
 * of a data slice returned by the client. This information
 * facilitates the evaluation process
 *
 * @version	x.xx
 * @author jim
 *
 */
public class SliceState {
	
	private static Logger logger = Logger.getLogger(SliceState.class); 

	private Intersection[] lockedCells;
	private Intersection[] protectedCells;
	private Intersection[] changedCells;
	private Intersection[] replicateExistingCells;
	private Intersection[] replicateAllCells;
	private Intersection[] liftExistingCells;
	private Intersection[] liftAllCells;
	private Intersection[] ruleSetLiftExistingCells = new Intersection[0];
	private Intersection[] ruleSetLiftAllCells = new Intersection[0];
	private String[] protectedCellFormulas;
	private PafDataSliceParms dataSliceParms;
	private String viewName;

	public SliceState() {}
    
	public SliceState(EvaluateViewRequest evalRequest) {
		
		logger.debug("Building intersections for locked cells");
        lockedCells = buildIntersections(evalRequest.getLockedCells());
		logger.debug("Building intersections for protected cells");        
        protectedCells = buildIntersections(evalRequest.getProtectedCells()); 
		logger.debug("Building intersections for changed cells");
        changedCells = buildIntersections(evalRequest.getChangedCells());
        logger.debug("Building intersections for cells to replicate to all level 0");
        replicateAllCells = buildIntersections(evalRequest.getReplicateAllCells());
        logger.debug("Building intersections for cells to replicate to existing level 0.");
        replicateExistingCells = buildIntersections(evalRequest.getReplicateExistingCells());
        logger.debug("Building intersections for cells to lift to all level 0");
        liftAllCells = buildIntersections(evalRequest.getLiftAllCells());
        logger.debug("Building intersections for cells to lift to existing level 0.");
        liftExistingCells = buildIntersections(evalRequest.getLiftExistingCells());
        
        protectedCellFormulas = evalRequest.getProtectedFormulas();
        viewName = evalRequest.getViewName();
        
    }
    public Intersection[] getChangedCells() {
		return changedCells;
	}
	public void setChangedCells(Intersection[] changedCells) {
		this.changedCells = changedCells;
	}
	public Intersection[] getLockedCells() {
		return lockedCells;
	}
	public void setLockedCells(Intersection[] lockedCells) {
		this.lockedCells = lockedCells;
	}
	public Intersection[] getProtectedCells() {
		return protectedCells;
	}
	public void setProtectedCells(Intersection[] protectedCells) {
		this.protectedCells = protectedCells;
	}
    
    private Intersection[] buildIntersections(SimpleCoordList coordList) {
        if (coordList == null) return new Intersection[0];
        if (coordList.getCoordinates() == null) return new Intersection[0];
        if (coordList.getAxis() == null) return new Intersection[0];
		logger.debug("Building intersections for axis: " + StringUtils.arrayToString(coordList.getAxis()));
		logger.debug("Building intersections for coordinates: " + StringUtils.arrayToString(coordList.getCoordinates()));
		
        Intersection[] intersections = new Intersection[coordList.getCoordinates().length / coordList.getAxis().length];
        String[] coords;
        short axisCnt = (short) coordList.getAxis().length;
        for (int i=0; i< intersections.length; i++) {
            coords = new String[axisCnt];
            for (int j = 0; j < axisCnt; j++) {
                coords[j] = coordList.getCoordinates()[(i*axisCnt)+j];
            }
            intersections[i] = new Intersection(coordList.getAxis(), coords);
            logger.debug("Built intersection : " + intersections[i].toString());
        }
        
        return intersections;
    }

    public String[] getProtectedCellFormulas() {
        return protectedCellFormulas;
    }

    public void setProtectedCellFormulas(String[] protectedCellFormulas) {
        this.protectedCellFormulas = protectedCellFormulas;
    }

    /**
     * @return Returns the dataSliceParms.
     */
    public PafDataSliceParms getDataSliceParms() {
        return dataSliceParms;
    }

    /**
     * @param dataSliceParms The dataSliceParms to set.
     */
    public void setDataSliceParms(PafDataSliceParms dataSliceParms) {
        this.dataSliceParms = dataSliceParms;
    }

    /**
     * @return Returns the viewName.
     */
    public String getViewName() {
        return viewName;
    }

	/**
	 * @param viewName the viewName to set
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public Intersection[] getReplicateAllCells() {
		return replicateAllCells;
	}

	public void setReplicateAllCells(Intersection[] replicateAllCells) {
		this.replicateAllCells = replicateAllCells;
	}

	/**
	 *  Remove cells from replicateAllCells collection
	 *
	 * @param cellsToRemove Cells to remove
	 */
	public void removeReplicateAllCells(Set<Intersection> cellsToRemove) {
		
		Set<Intersection> existingCells = new HashSet<Intersection>(Arrays.asList(replicateAllCells));
		existingCells.removeAll(cellsToRemove);
		replicateAllCells = existingCells.toArray(new Intersection[0]);
	}
	

	public Intersection[] getReplicateExistingCells() {
		return replicateExistingCells;
	}

	public void setReplicateExistingCells(Intersection[] replicateExistingCells) {
		this.replicateExistingCells = replicateExistingCells;
	}

	/**
	 *  Remove cells from replicateExistingCells collection
	 *
	 * @param cellsToRemove Cells to remove
	 */
	public void removeReplicateExistingCells(Set<Intersection> cellsToRemove) {
		
		Set<Intersection> existingCells = new HashSet<Intersection>(Arrays.asList(replicateExistingCells));
		existingCells.removeAll(cellsToRemove);
		replicateExistingCells = existingCells.toArray(new Intersection[0]);
	}
	

	/**
	 * @return the liftExistingCells
	 */
	public Intersection[] getLiftExistingCells() {
		return liftExistingCells;
	}

	/**
	 * @param liftExistingCells the liftExistingCells to set
	 */
	public void setLiftExistingCells(Intersection[] liftExistingCells) {
		this.liftExistingCells = liftExistingCells;
	}

	/**
	 *  Remove cells from liftExistingCells collection
	 *
	 * @param cellsToRemove Cells to remove
	 */
	public void removeLiftExistingCells(Set<Intersection> cellsToRemove) {
		
		Set<Intersection> existingCells = new HashSet<Intersection>(Arrays.asList(liftExistingCells));
		existingCells.removeAll(cellsToRemove);
		liftExistingCells = existingCells.toArray(new Intersection[0]);
	}
	

	/**
	 * @return the liftAllCells
	 */
	public Intersection[] getLiftAllCells() {
		return liftAllCells;
	}

	/**
	 * @param liftAllCells the liftAllCells to set
	 */
	public void setLiftAllCells(Intersection[] liftAllCells) {
		this.liftAllCells = liftAllCells;
	}

	/**
	 *  Remove cells from liftAllCells collection
	 *
	 * @param cellsToRemove Cells to remove
	 */
	public void removeLiftAllCells(Set<Intersection> cellsToRemove) {
		
		Set<Intersection> existingCells = new HashSet<Intersection>(Arrays.asList(liftAllCells));
		existingCells.removeAll(cellsToRemove);
		liftAllCells = existingCells.toArray(new Intersection[0]);
	}


	/**
	 * @return the ruleSetLiftExistingCells
	 */
	public Intersection[] getRuleSetLiftExistingCells() {
		return ruleSetLiftExistingCells;
	}

	/**
	 * @param ruleSetLiftExistingCells the ruleSetLiftExistingCells to set
	 */
	public void setRuleSetLiftExistingCells(Intersection[] ruleSetLiftExistingCells) {
		this.ruleSetLiftExistingCells = ruleSetLiftExistingCells;
	}

	/**
	 * @return the ruleSetLiftAllCells
	 */
	public Intersection[] getRuleSetLiftAllCells() {
		return ruleSetLiftAllCells;
	}

	/**
	 * @param ruleSetLiftAllCells the ruleSetLiftAllCells to set
	 */
	public void setRuleSetLiftAllCells(Intersection[] ruleSetLiftAllCells) {
		this.ruleSetLiftAllCells = ruleSetLiftAllCells;
	}
	
}
