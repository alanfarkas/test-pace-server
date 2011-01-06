/*
 *	File: @(#)SliceState.java 	Package: com.palladium.paf.state 	Project: Paf Base Libraries
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
 *	05/24/06		AFarkas			x.xx			Moved from com.palladium.paf.server.comm (PafServer)
 * 
 */
package com.palladium.paf.state;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.palladium.paf.comm.EvaluateViewRequest;
import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.mdb.PafDataSliceParms;
import com.palladium.utility.StringUtils;

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
        logger.debug("Building intersections for replicate to existing level 0.");
        replicateExistingCells = buildIntersections(evalRequest.getReplicateExistingCells());
        
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
	
	

}
