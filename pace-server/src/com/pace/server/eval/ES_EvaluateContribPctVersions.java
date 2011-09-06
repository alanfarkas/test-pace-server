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
import com.pace.base.data.EvalUtil;
import com.pace.base.data.Intersection;
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
	 * @param evalState Evaluation state
	 * @param aggregate 
	 * @param allocateUpper 
	 * 
	 * @throws PafException
	 */
	public void performEvaluation(EvalState evalState, ES_AllocateUpperLevel allocateUpper, ES_Aggregate aggregate) throws PafException {

		String currentMeasure = evalState.getMeasureName();
		String currentPeriod = null;
		String measureDim = evalState.getMsrDim();
		String timeDim = evalState.getTimeDim();
		String versionDim = evalState.getVersionDim();
		PafApplicationDef appDef = evalState.getAppDef();
		PafDataCache dataCache = evalState.getDataCache();
		Map<String, Set<Intersection>> changedContribPctCellsByTime = evalState.getChangedContribPctCellsByTime();
		Map<Intersection, Set<Intersection>> changedContribPctCellsByTarget = new HashMap <Intersection, Set<Intersection>>();
		Set<Intersection> changedContribPctCells = evalState.getChangedContribPctCellsByMsr().get(currentMeasure);
		
		// Exit if there are no changes to perform
		if (changedContribPctCells == null || changedContribPctCells.isEmpty()) {
			return;
		} 
		

		// If time slice mode, filter out any intersections not belonging to the current time slice
		if (evalState.isTimeSliceMode()) {
			changedContribPctCells = new HashSet<Intersection>(changedContribPctCells);
			currentPeriod = evalState.getCurrentTimeSlice();
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
		dsCacheMemberFilter.put(versionDim, Arrays.asList(dataCache.getPlanVersions()));
		List<String> periodList = null;
		if (evalState.isTimeSliceMode()) {
			periodList = Arrays.asList(new String[]{currentPeriod});
		} else {
			periodList = dataCache.getForwardPlannablePeriods();
		}
		dsCacheMemberFilter.put(timeDim, periodList);
		
		
		// Catalog each set of contribution % changes by the base intersection impacted. 
		// The base intersection flexes in response to the corresponding contribution % change.
		for (Intersection changedCell : changedContribPctCells) {
			
			Intersection targetIs = buildTargetIs(changedCell, evalState);
			
			// Add base version intersection and corresponding changed cells to collection
			if (!changedContribPctCellsByTarget.containsKey(targetIs)) {
				changedContribPctCellsByTarget.put(targetIs, new HashSet<Intersection>());				
			}
			changedContribPctCellsByTarget.get(targetIs).add(changedCell);
		}
		
		// Sort contribution percent changed cells in target intersection order 
		String[] axisSeq = evalState.getAxisPriority();
		Intersection[] orderedTargetIntersections = EvalUtil.sortIntersectionsByAxis(changedContribPctCellsByTarget.keySet().toArray(new Intersection[0]), 
				evalState.getClientState().getMemberIndexLists(), axisSeq, SortOrder.Descending);            

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
				Intersection basisIntersection = PafDataCacheCalc.buildContribPctBasisIs(changedCell, evalState);

				// Lock basis intersection
				evalState.addAllocation(basisIntersection);
				evalState.getCurrentLockedCells().add(basisIntersection);
				evalState.getOrigLockedCells().add(basisIntersection);

				// Evaluate change in data slice cache and copy to uow cache
				EvalUtil.evalFormula(f, versionDim, targetIntersection, dataCache, evalState);
				double newBaseValue = dataCache.getCellValue(targetIntersection);
				dataCache.setCellValue(targetIntersection, newBaseValue);
				evalState.addUserChanges(targetIntersection);

				// Allocate and aggregate uow cache changes
				allocateUpper.performEvaluation(evalState);
				aggregate.performEvaluation(evalState);

			} // Next changedCell

		} // Next baseIntersection
		
		// Remove processed contribution percent intersections
		evalState.removeAllChangedContribPctCells(changedContribPctCells);
		
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
