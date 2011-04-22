/*
 *	File: @(#)ES_ConvertContribPctVersions.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Apr 14, 2008  		By: Alan
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.base.PafException;
import com.pace.base.SortOrder;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionType;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.rules.Formula;
import com.pace.base.state.EvalState;
import com.pace.base.state.SliceState;
import com.pace.base.utility.IntersectionUtils;


/**
 * This step is used in the evaluation sequence for converting changes made to 
 * contribution percent versions into an equivalent change in the base version
 *
 * @version	1.00
 * @author AFarkas
 *
 */
public class ES_EvaluateContribPctVersions implements IEvalStep {

	/**
	 *  Evaluate contribution percent version changes
	 *
	 * @param uowEvalState Uow eval state
	 * @param dsEvalState Data slice eval state
	 * @param aggregate 
	 * @param allocateUpper 
	 * 
	 * @throws PafException
	 */
	public void performEvaluation(EvalState uowEvalState, EvalState dsEvalState, ES_AllocateUpperLevel allocateUpper, ES_Aggregate aggregate) throws PafException {

		String currentMeasure = uowEvalState.getMeasureName();
		String currentPeriod = null;
		String measureDim = uowEvalState.getMsrDim();
		String timeDim = uowEvalState.getTimeDim();
		String versionDim = uowEvalState.getVersionDim();
		PafApplicationDef appDef = uowEvalState.getAppDef();
		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataCache uowCache = uowEvalState.getDataCache();
		MemberTreeSet memberTrees = uowEvalState.getDataCacheTrees();
		Map<String, Set<Intersection>> changedContribPctCellsByTime = dsEvalState.getChangedContribPctCellsByTime();
		Map<Intersection, Set<Intersection>> changedContribPctCellsByTarget = new HashMap <Intersection, Set<Intersection>>();
		Set<Intersection> changedContribPctCells = dsEvalState.getChangedContribPctCellsByMsr().get(currentMeasure);
		
		// Exit if there are no changes to perform
		if (changedContribPctCells == null || changedContribPctCells.isEmpty()) {
			return;
		} 
		

		// If time slice mode, filter out any intersections not belonging to the current time slice
		if (dsEvalState.isTimeSliceMode()) {
			changedContribPctCells = new HashSet<Intersection>(changedContribPctCells);
			currentPeriod = dsEvalState.getCurrentTimeSlice();
			Set<Intersection> changedContribPctCellsCurrPeriod = changedContribPctCellsByTime.get(currentPeriod);
			if (changedContribPctCellsCurrPeriod == null) {
				changedContribPctCellsCurrPeriod = new HashSet<Intersection>();
			}
			changedContribPctCells.retainAll(changedContribPctCellsCurrPeriod);

			// Exit if there are no time slice changes to perform
			if (changedContribPctCells.isEmpty()) {
				return;
			}
		} 


		// Create data slice cache member filter - current measure, plan version, and open periods (or current
		// period if in time slice mode). This filter controls what intersections in the data slice cache are 
		// updated as a result of changes in the uow cache.
		Map<String, List<String>> dsCacheMemberFilter = new HashMap<String, List<String>>();
		List<String> measureFilter = new ArrayList<String>();
		measureFilter.add(currentMeasure);
		dsCacheMemberFilter.put(measureDim, measureFilter);
		dsCacheMemberFilter.put(versionDim, Arrays.asList(dsCache.getActiveVersions()));
		List<String> periodList = null;
		if (dsEvalState.isTimeSliceMode()) {
			periodList = Arrays.asList(new String[]{currentPeriod});
		} else {
			periodList = dsCache.getForwardPlannablePeriods();
		}
		dsCacheMemberFilter.put(timeDim, periodList);
		
		
		// Catalog each set of contribution % changes by the base intersection impacted. 
		// The base intersection flexes in response to the corresponding contribution % change.
		for (Intersection changedCell : changedContribPctCells) {
			
			Intersection targetIs = buildTargetIs(changedCell, uowEvalState);
			
			// Add base version intersection and corresponding changed cells to collection
			if (!changedContribPctCellsByTarget.containsKey(targetIs)) {
				changedContribPctCellsByTarget.put(targetIs, new HashSet<Intersection>());				
			}
			changedContribPctCellsByTarget.get(targetIs).add(changedCell);
		}
		
		// Sort contribution percent changed cells in target intersection order 
		String[] axisSeq = dsEvalState.getAxisPriority();
		Intersection[] orderedTargetIntersections = EvalUtil.sortIntersectionsByAxis(changedContribPctCellsByTarget.keySet().toArray(new Intersection[0]), 
				uowEvalState.getClientState().getMemberIndexLists(), axisSeq, SortOrder.Descending);            

		// Process contribution % changes in base intersection order 
		for (Intersection targetIntersection : orderedTargetIntersections) {

			// Iterate through all changed cells corresponding to the current base intersection.
			//TODO (The should only be one changed cell per base intersection - Refactor this so that there is just value is a single intersection / not a set) 
			Set<Intersection> changedCells = changedContribPctCellsByTarget.get(targetIntersection);
			for (Intersection changedCell : changedCells) {

				// Formula preparation
				String version = changedCell.getCoordinate(versionDim);
				VersionDef vd = appDef.getVersionDef(version);
		    	String formulaString = vd.getBaseFormulaString();
				Formula f = new Formula(formulaString);
		    	f.parse(appDef.getMeasureFunctionFactory());

				// Get basis intersection (divisor in contribution % formula)
				Intersection basisIntersection = PafDataSliceCacheCalc.buildContribPctBasisIs(changedCell, uowEvalState);
				
				// Attribute evaluation?
				if (uowEvalState.isAttributeEval()) {
					
					// Lock basis intersection 
					dsEvalState.addUserChanges(basisIntersection);

					// Evaluate change in data slice cache and allocate down to floor of uow cache.
					// The basis intersection will be allocated over target changes.
					EvalUtil.evalFormula(f, versionDim, targetIntersection, dsCache, dsEvalState);
					dsEvalState.addUserChanges(targetIntersection);
					PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState, memberTrees);
					
				} else {
				// Regular evaluation
					
					// Lock basis intersection
					uowEvalState.addAllocation(basisIntersection);
					uowEvalState.getCurrentLockedCells().add(basisIntersection);
					uowEvalState.getOrigLockedCells().add(basisIntersection);

					// Evaluate change in data slice cache and copy to uow cache
					EvalUtil.evalFormula(f, versionDim, targetIntersection, dsCache, dsEvalState);
					double newBaseValue = dsCache.getCellValue(targetIntersection);
					uowCache.setCellValue(targetIntersection, newBaseValue);
					uowEvalState.addUserChanges(targetIntersection);
					
				}
				
				// Allocate and aggregate uow cache changes
				allocateUpper.performEvaluation(uowEvalState);
				aggregate.performEvaluation(uowEvalState);
				
				
				// Update data slice cache with updates in uow cache
				if (uowCache.isDirty()) {
					if (uowEvalState.isAttributeEval()) {
						// Attribute view - update attribute intersections (aggregate changed base intersections)
						dsCache = PafDataSliceCacheCalc.calcAllAttributeIntersections(dsEvalState, uowCache, uowEvalState.getClientState(), dsCacheMemberFilter);
					} else {
						// Non-attribute view - update 
						dsCache.loadCacheCells(uowCache, dsCacheMemberFilter);
					}

					// Clear dirty flag
					uowCache.setDirty(false);
				}
			

			} // Next changedCell

		} // Next baseIntersection
		
		// Remove processed contribution percent intersections
		dsEvalState.removeAllChangedContribPctCells(changedContribPctCells);
		
	}


	/**
	 *  Convert a contribution % change intersection to the corresponding target (base version) intersection
	 *
	 * @param contribPctIS Contribution percent intersection
	 * @param evalState Evaluation state
	 * 
	 * @return Intersection
	 */
	public Intersection buildTargetIs(Intersection contribPctIS, EvalState evalState) {

		String versionDim = evalState.getVersionDim();
		PafApplicationDef appDef = evalState.getAppDef();
		
		// Build the target intersection
		String changedVersion = contribPctIS.getCoordinate(versionDim);
		VersionDef vd = appDef.getVersionDef(changedVersion);
		String baseVersion = vd.getVersionFormula().getBaseVersion();
		Intersection targetVersionIs = contribPctIS.clone();
		targetVersionIs.setCoordinate(versionDim, baseVersion);
		return targetVersionIs;
	}


	public void performEvaluation(EvalState evalState) throws PafException {
		// TODO Auto-generated method stub
		
	}


	/**
	 *  Migrate contribution percent changed and replicated cells into separate 
	 *  collections on the data slice evaluation state.
	 *
	 * @param dsEvalState Data slice evaluation state
	 * @throws PafException 
	 */
	public void stageContributionPctChanges(EvalState dsEvalState) throws PafException {
		
		String versionDim = dsEvalState.getVersionDim();
		SliceState sliceState = dsEvalState.getSliceState();
		PafDataCache dataCache = dsEvalState.getDataCache();
		List<String> contribPctVersions = dataCache.getVersionsByType(VersionType.ContribPct);
		Set<Intersection> changedCells = dsEvalState.getCurrentChangedCells();
		Set<Intersection> lockedCells = dsEvalState.getCurrentLockedCells();
		Set<Intersection> protectedCells = dsEvalState.getCurrentProtectedCells();
		Intersection[] replicateAllCells = sliceState.getReplicateAllCells();
		Intersection[] replicateExistingCells = sliceState.getReplicateExistingCells();
		Set<Intersection> replicateAllContribPctCells = null;
		Set<Intersection> replicateExistingContribPctCells = null;
		
		
		// Create intersection filter
		Map<String, List<String>> memberFilter = new HashMap <String, List<String>>();
		memberFilter.put(versionDim, contribPctVersions);
		
		// Migrate changed contribution percent cells
		Set<Intersection> changedContribPctCells  = IntersectionUtils.getFilteredIntersections(changedCells, memberFilter);
		dsEvalState.removeAllUserChanges(changedContribPctCells);
		Map<Intersection, Double> changedContribPctValueMap = new HashMap<Intersection, Double>();
		for (Intersection changedCell : changedContribPctCells) {
			changedContribPctValueMap.put(changedCell, dataCache.getCellValue(changedCell));
		}
		dsEvalState.addAllChangedContribPctCells(changedContribPctValueMap);
		
		// Migrate locked contribution percent cells
		Set<Intersection> lockedContribPctCells  = IntersectionUtils.getFilteredIntersections(lockedCells, memberFilter);
		dsEvalState.removeAllUserChanges(lockedContribPctCells);
		for (Intersection lockedCell : lockedContribPctCells) {
			changedContribPctValueMap.put(lockedCell, dataCache.getCellValue(lockedCell));
		}
		dsEvalState.addAllChangedContribPctCells(changedContribPctValueMap);
		
		// Migrate protected contribution percent cells
		Set<Intersection> contribPctProtectedCells = IntersectionUtils.getFilteredIntersections(protectedCells, memberFilter);
		dsEvalState.removeAllProtectedCells(contribPctProtectedCells);
		
		// Migrate replicate all contribution percent cells
		replicateAllContribPctCells = IntersectionUtils.getFilteredIntersections(replicateAllCells, memberFilter);
		sliceState.removeReplicateAllCells(replicateAllContribPctCells);
		dsEvalState.setReplicateAllContribPctCells(replicateAllContribPctCells);
		
		// Migrate replicate existing contribution percent cells
		replicateExistingContribPctCells = IntersectionUtils.getFilteredIntersections(replicateExistingCells, memberFilter);
		sliceState.removeReplicateExistingCells(replicateExistingContribPctCells);
		dsEvalState.setReplicateAllContribPctCells(replicateExistingContribPctCells);
						
	}

}
