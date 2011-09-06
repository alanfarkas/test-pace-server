/*
 *	File: @(#)ES_ConvertVariances.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Jan 30, 2006  		By: jwatkins
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
package com.pace.server.eval;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.VarRptgFlag;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionFormula;
import com.pace.base.app.VersionType;
import com.pace.base.data.EvalUtil;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.rules.Formula;
import com.pace.base.state.EvalState;
import com.pace.base.state.SliceState;
import com.pace.server.PafAppService;
import com.pace.server.PafDataService;

/**
 * This step is used in the evaluation sequence for converting changes made to 
 * variance versions into an equivalent change in the base version
 *
 * @version	x.xx
 * @author jwatkins
 *
 */
public class ES_ConvertVarianceVersions implements IEvalStep {

    PafDataService dataService = PafDataService.getInstance();
    PafAppService appService = PafAppService.getInstance();
    @SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(ES_ConvertVarianceVersions.class);
    
     /* (non-Javadoc)
     * @see com.pace.base.eval.IEvalStep#performEvaluation(com.pace.base.state.EvalState)
     */
    public void performEvaluation(EvalState evalState) throws PafException {
    	
    	PafDataCache dataCache = evalState.getDataCache();
    	SliceState sliceState = evalState.getSliceState();
        String versDim = evalState.getAppDef().getMdbDef().getVersionDim();
        Map<Intersection, Intersection> convInter = new HashMap<Intersection, Intersection>();
        
        // pre-build a hashset of variance versions by name. Used for quick comparison
        Set<String> vdNames = new HashSet<String>();
        for (VersionDef vd : dataCache.getVarianceVersionDefs()) {
            vdNames.add(vd.getName());
        }
        
        
        // for each change in "changed cell list" check version. If versiontype is variance convert the change
        // into the equivalent base version
        for (Intersection is : evalState.getCurrentChangedCells()) {
            if (vdNames.contains(is.getCoordinate(versDim))) {
                // this operation convert the change in the datacache
                // and returns the new intersection object to be used
                // in the changed cell list
                convInter.put(is, convertChange(is, evalState, dataCache));
            }
        }

        // repeat this step for locked cells. Seems faster than wasting time combining the lists.
        Set<Intersection> lockedCells = new HashSet<Intersection>(evalState.getCurrentLockedCells());
        for (Intersection is : lockedCells) {
            if (vdNames.contains(is.getCoordinate(versDim))) {
                // this operation convert the change in the datacache
                // and returns the new intersection object to be used
                // in the changed cell list
                convInter.put(is, convertChange(is, evalState, dataCache));
            }
        }
        
        
        
        // swap out intersections from lists
        evalState.removeAllUserChanges(convInter.keySet());
        evalState.addAllUserChanges(convInter.values());
                
        // if this resolved a protected cell, consider it processed
        evalState.removeAllProtectedCells(convInter.values());
        
/*        // TODO, migrate this code into evalstate to help with coupling problem
        for (Intersection is : convInter.keySet() ) {
        	
        	evalState.getOrigChangedCells().remove(is);
        	evalState.getOrigChangedCells().add(convInter.get(is));
        	
        	evalState.removeCurrentChangedCell(is);
            evalState.addChangedCell(convInter.get(is));   
            
            evalState.removeOrigLockedCell(is);
            evalState.addOrigLockedCell(convInter.get(is));  
            
        	evalState.getCurrentLockedCells().remove(is);
            evalState.getCurrentLockedCells().add(convInter.get(is));
            
            evalState.removeAllocation(is);
            evalState.addAllocation(convInter.get(is));
            
            // if this resolved a protected cell, consider it processed
            if (evalState.getCurrentProtectedCells().contains(convInter.get(is))) {
                evalState.removeProtectedCell(convInter.get(is));
            }
        }     
*/   
        
        // remove converted intersections from replicated cell properties
        // in slice state. 
//        List<Intersection> replicateAllCells = Arrays.asList(evalState.getSliceState().getReplicateAllCells());
//        replicateAllCells.removeAll(convInter.keySet());
//        evalState.getSliceState().setReplicateAllCells(replicateAllCells.toArray(new Intersection[0]));
        sliceState.removeReplicateAllCells(convInter.keySet());
        
//        List<Intersection> replicateExistingCells = Arrays.asList(evalState.getSliceState().getReplicateExistingCells());
//        replicateExistingCells.removeAll(convInter.keySet());
//        evalState.getSliceState().setReplicateExistingCells(replicateExistingCells.toArray(new Intersection[0]));
        sliceState.removeReplicateExistingCells(convInter.keySet());
      
        //FIXME temporary fix - remove variance version intersections from protected cells.
        // Currently, protected cells are only referenced in the replication process. 
        Set<Intersection> protectedVariances = new HashSet<Intersection>();
        for (Intersection is : evalState.getCurrentProtectedCells()) {
            if (vdNames.contains(is.getCoordinate(versDim))) {
            	protectedVariances.add(is);
             }
        }
        evalState.getCurrentProtectedCells().removeAll(protectedVariances);
        
        
        // Add data points for replications in variance versions. Since variance versions
        // don't exist in the data cache these values will need to be looked up from the eval state
        //TODO - Simply this logic, since all versions are now in the data cache
        Map<Intersection, Double> varianceReplicationValues = new HashMap<Intersection, Double>();
        for (Intersection is : evalState.getSliceState().getReplicateAllCells()) {
            if (vdNames.contains(is.getCoordinate(versDim))) {
            	varianceReplicationValues.put(is, dataCache.getCellValue(is));
            }
        }
        for (Intersection is : evalState.getSliceState().getReplicateExistingCells()) {
            if (vdNames.contains(is.getCoordinate(versDim))) {
            	varianceReplicationValues.put(is, dataCache.getCellValue(is));
            }
        }
        
        evalState.setVarianceReplicationValues(varianceReplicationValues);
    }

    
    private Intersection convertChange(Intersection is, EvalState evalState, PafDataCache dataCache) throws PafException {

    	String measDim = evalState.getClientState().getApp().getMdbDef().getMeasureDim();
    	String versDim = evalState.getClientState().getApp().getMdbDef().getVersionDim();
    	String version = null;
    	double compareValue = 0;
    	VersionType versionType = null;
    	VarRptgFlag varRptgFlag = null;
    	VersionDef vd = null;
	  	VersionFormula versFormula = null;
	  	
    	// Get version meta-data
    	version = is.getCoordinate(versDim);
    	vd = evalState.getClientState().getApp().getVersionDef(version);
    	versionType = vd.getType();
	  	versFormula = vd.getVersionFormula();
  
    	// variance version pre-processing
    	if (versionType == VersionType.Variance) {
    		// get cell value of corresponding comparison version intersection
    		Intersection tempIs = is.clone();
    	  	tempIs.setCoordinate(versDim, versFormula.getCompareVersion());
    		compareValue = dataCache.getCellValue(tempIs);
    		// Get the variance reporting flag for the measure being calculated
    		String measure = is.getCoordinate(measDim);
    		try {
    			MeasureDef measureDef = dataCache.getMeasureDef(measure);
    			varRptgFlag = measureDef.getVarRptgFlag();
    		} catch (RuntimeException e) {
    			// No Measure Def found for selected measure - use default value of Revenue Reporting Flag
    			varRptgFlag = VarRptgFlag.RevenueReporting;
    		}
    	}       
    	// construct formula that will be used to back into the base version
    	String formulaString = vd.getBaseFormulaString(varRptgFlag, compareValue);

    	// and create new intersection = to version base
    	Intersection newIs = is.clone();
    	newIs.setCoordinate(versDim, vd.getVersionFormula().getBaseVersion());
    	Formula f = new Formula(formulaString);
    	f.parse(evalState.getAppDef().getMeasureFunctionFactory());
    	
    	// contribution percent locking process - lock compare intersection
    	// so that contribution % change sticks
    	if (versionType == VersionType.ContribPct) {

    		// Get compare intersection
    		MemberTreeSet uowTrees = evalState.getClientState().getUowTrees();
    		Intersection compareIs = newIs.clone();

    		String[] compareDims = versFormula.getCompareIsDims();
    		String[] compareMembers = versFormula.getCompareIsMembers();
    		for (int i = 0; i < compareDims.length; i++) {
    			String dim = compareDims[i];
    			String currMember = compareIs.getCoordinate(dim);
    			PafDimTree dimTree = uowTrees.getTree(dim);
    			String compareMember = PafDataCacheCalc.resolveMemberSpec(compareMembers[i], dimTree, currMember);
    			compareIs.setCoordinate(dim, compareMember);
    		}
    		
    		// Lock compare intersection
    		evalState.addAllocation(compareIs);
    		evalState.getCurrentLockedCells().add(compareIs);
    		evalState.getOrigLockedCells().add(compareIs);
    	}
    	
    	
    	// Evaluate change to base version
    	EvalUtil.evalFormula(f, versDim, newIs, dataCache, evalState);

    	return newIs;
    }
}
