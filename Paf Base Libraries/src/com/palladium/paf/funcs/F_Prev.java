/*
 *	File: @(#)F_Next.java 	Package: com.palladium.paf.funcs 	Project: Paf Base Libraries
 *	Created: Mar 21, 2006  		By: jim
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
package com.palladium.paf.funcs;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.palladium.paf.PafException;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.mdb.PafDimMember;
import com.palladium.paf.mdb.PafDimTree;
import com.palladium.paf.state.IPafEvalState;

/**
 * Implements a next function. It looks up the value of the a particular intersection in the datacache
 * ie. @Prev(BOP_DLR, Time, 1)
 * would return the value of at the intersection, that starts at the source intersection, but is invoked
 * for the measure BOP_DLR, and is offset in the Time dimension - 1
 *
 * @version	x.xx
 * @author jim
 *
 */

// TODO add support for multiple offset increments in next function
public class F_Prev extends AbstractFunction {
	
	private int offset = -1;	
   	private String offsetDim = null;	
	PafDimTree offsetTree = null;       	
   	PafApplicationDef app = null; 
	String measureDim = null;
   	
	
    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {

		if (!this.isInitialized) initialize(evalState);
    	
    	double result = 0;
   	    	
    	Intersection dataIs = sourceIs.clone();
    	
    	
    	if ( this.measureName != null ) {
    		dataIs.setCoordinate(measureDim, this.measureName);
    	}
    	    	
    	try {
			String curMbrName = sourceIs.getCoordinate(offsetDim);
			PafDimMember prevMbr = offsetTree.getPeer(curMbrName, offset);
			
			if (prevMbr == null)
				result = 0;
			else {
				dataIs.setCoordinate(offsetDim, prevMbr.getKey());
				result = dataCache.getCellValue(dataIs.getCoordinates());
			}
			
			
			
		} catch (RuntimeException e) {
			
			// Check for absence of parameters
			if (parms.length == 0) {
				String errMsg = "@Prev function requires at least one parameter";
				throw new IllegalArgumentException(errMsg);
			}
			
			// Check for invalid measure
			PafDimTree measureTree = evalState.getDataCacheTrees().getTree(measureDim);
			if (!measureTree.hasMember(measureName)) {
				String errMsg = "Illegal measure name: [" + measureName + "] used in @Prev function";
				throw new IllegalArgumentException(errMsg);
			}
	
			// Check for invalid dimension parm
			if (parms.length > 1) {
				if (offsetTree == null) {
					String errMsg = "Illegal dimension name: [" + offsetDim + "] used in @Prev function";
					throw new IllegalArgumentException(errMsg);
				}
			}
			
			// Unforseen error - just throw original exception
			throw(e);
		}
	
//		lockRecalcComponent(sourceIs, evalState);
    	return result;
    }

	@Override
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) {
		PafDimMember offsetMember;  
		Set<Intersection> dirty = new HashSet<Intersection>(0);
		
		if (!this.isInitialized) initialize(evalState);
		
		offsetMember = offsetTree.getPeer(evalState.getCurrentTimeMember().getKey(), offset);
		
		if (offsetMember != null) {
			if (evalState.getChangedCellsByTime().get(offsetMember.getKey()) != null)
				dirty = evalState.getChangedCellsByTime().get(offsetMember.getKey());
		} 
			
//		return dirty;
		
		// prune down to intersections involving the measure parameters
		if (dirty.size() > 0) {
			Map<String, Set<String>> filterMap = new HashMap<String, Set<String>>();
			Set<String> mbrList = new HashSet<String>(1);
			mbrList.add(this.measureName);
			filterMap.put(this.measureDim, mbrList);
			Set<Intersection> filteredDirty = new HashSet<Intersection>(dirty.size() * 2);
			
			filteredDirty = this.findIntersections(filterMap, dirty);
			
			return filteredDirty;
		}
		else {
			return dirty;			
		}
	}
	
	protected void lockRecalcComponent(Intersection is, IPafEvalState evalState) {
	
	// String isMsrName = targetIs.getCoordinate(evalState.getAppDef().getMdbDef().getMeasureDim());
	MeasureDef msrDef = evalState.getAppDef().getMeasureDef(this.measureName);
    
    
	if (msrDef != null && msrDef.getType() == MeasureType.Recalc) {
		Collection<Intersection> cellsToLock = new HashSet<Intersection>(1);
		cellsToLock.add(is);
		evalState.addAllAllocations(cellsToLock);
		evalState.getCurrentLockedCells().addAll(cellsToLock);
	}

}	
	
	private void initialize(IPafEvalState evalState) {

    	app = evalState.getAppDef();
    	measureDim = app.getMdbDef().getMeasureDim();
		
		String index;
				
     	if (parms.length > 1 ) 
    		offsetDim = parms[1];
    	else 
    		offsetDim = app.getMdbDef().getTimeDim();
    	
		offsetTree = evalState.getDataCacheTrees().getTree(offsetDim);
     	
    	if (parms.length > 2 )  {
			index = parms[2];
    		try {
        		offset = Integer.valueOf(index) * -1;
			} catch (NumberFormatException e) {
				// Check for invalid integer
				String errMsg = "Illegal integer value of: [" + index + "] supplied for index parm in @Prev function";
				throw new IllegalArgumentException(errMsg);
			}
    	}
    	
    	this.isInitialized = true;
	}
    
}
