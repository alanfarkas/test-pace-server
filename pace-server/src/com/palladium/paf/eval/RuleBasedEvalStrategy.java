/*
 *	File: @(#)RuleBasedEvalStrategy.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Aug 30, 2005  					By: jwatkins
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
package com.palladium.paf.eval;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.SortOrder;
import com.pace.base.app.MdbDef;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.funcs.IPafFunction;
import com.pace.base.mdb.PafDataCache;
import com.pace.base.mdb.PafDataSliceCache;
import com.pace.base.rules.*;
import com.pace.base.state.EvalState;
import com.pace.base.state.PafClientState;
import com.pace.base.state.SliceState;
import com.pace.base.utility.LogUtil;
import com.pace.base.utility.StringUtils;
import com.pace.base.view.PafMVS;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewSection;
import com.palladium.paf.eval.ES_ProcessReplication.ReplicationType;
import com.palladium.paf.server.PafMetaData;
import com.palladium.paf.server.RuleMngr;

/**
 * This class contains the highest level of evaluation logic. It represents the current best known strategy
 * for evaluating a set of rulegroups. During an evaluation pass an evaluations strategy is initialized and
 * executed. It instantiates steps to execute, and is responsible for the sequence rules are processed in
 * and wich steps are executed for wich types of rulegroups.
 *
 * @version	0.01
 * @author Jim Watkins
 * 
 * Update Log
 * 4/9/06	
 * Updated log created. 
 * Adding logic for "delayedCalc" operations
 * Modified loose measures step to only process relationships that have corresponding
 * changes for the measure involved.
 * 
 * 3/8/07 - 3/22/07
 * Made changes to support write-back in attribute views and movement of variance versions to the
 * data slice cache (out of the uow cache). These changes included adding a new method:
 * executeAttributeStrategy.
 * 
 */
public class RuleBasedEvalStrategy implements IEvalStrategy {

	private static Logger logger = Logger.getLogger(RuleBasedEvalStrategy.class);

	private ES_EvalStdRulegroup evalStdRulegroup = new ES_EvalStdRulegroup();
	private ES_EvalPepetualRulegroup evalPerpetualRulegroup = new ES_EvalPepetualRulegroup();

//	private ES_EvalDelayedInvMeasures evalDelayedInvMeasures = new ES_EvalDelayedInvMeasures();

	private ES_AllocateUpperLevel allocateUpper = new ES_AllocateUpperLevel();
	private ES_AllocateRatios allocateRatios = new ES_AllocateRatios();

	private ES_Aggregate aggregate = new ES_Aggregate();
	private ES_ConvertVarianceVersions convertVarianceVersions = new ES_ConvertVarianceVersions();
	private ES_EvaluateContribPctVersions evalContribPctVersions = new ES_EvaluateContribPctVersions();
	private ES_RecalcMeasures recalcMeasures = new ES_RecalcMeasures();
	private ES_ProcessReplication processReplication = new ES_ProcessReplication();

	Map<String, MeasureDef> measureCat;
	

	public RuleBasedEvalStrategy() {
	}


	/**
	 *	Execute evaluation strategy on an entire uow cache using the 
	 *  default ruleset. 
	 *
	 * @param uowEvalState Unit-of-work evaluation state
	 * 
	 * @return PafDataCache
	 * @throws PafException
	 */
	public PafDataCache executeDefaultStrategy(EvalState uowEvalState) throws PafException {

		// Initialization
		PafDataCache uowCache = uowEvalState.getDataCache();
		long startTime = System.currentTimeMillis();
		uowEvalState.setStartTime(startTime);
		
		logger.info(Messages.getString("RuleBasedEvalStrategy.0")); //$NON-NLS-1$

		RuleSet ruleSet = uowEvalState.getMeasureRuleSet();
		logger.info(Messages.getString("RuleBasedEvalStrategy.1") + ruleSet.getName() );         //$NON-NLS-1$
		if (uowEvalState.getAppDef().getAppSettings() != null && uowEvalState.getAppDef().getAppSettings().isEnableRounding()) {
			logger.info(Messages.getString("RuleBasedEvalStrategy.2")); //$NON-NLS-1$
		} else {
			logger.info(Messages.getString("RuleBasedEvalStrategy.3")); //$NON-NLS-1$
		}

		this.measureCat = uowEvalState.getAppDef().getMeasureDefs();

		long stepTime = System.currentTimeMillis();
		logger.info(Messages.getString("RuleBasedEvalStrategy.4")); //$NON-NLS-1$
		processLooseMeasures(ruleSet, uowEvalState);
		logger.info(LogUtil.timedStep(Messages.getString("RuleBasedEvalStrategy.5"), stepTime));   //$NON-NLS-1$

		logger.info(Messages.getString("RuleBasedEvalStrategy.6")); //$NON-NLS-1$
		Map<String, List<RuleGroup>>balanceSets = createBalanceSets(ruleSet);

		// this will hold all rulegroups processed. In particular it holds balance
		// set members so they can be skipped in the overall list
		List<RuleGroup> processedRuleGroups = new ArrayList<RuleGroup>(); 

		// Process all rule groups
		for (RuleGroup rg : ruleSet.getRuleGroups() ) {
			processRuleGroup(balanceSets, rg, processedRuleGroups, uowEvalState);
		}

		logger.info(Messages.getString("RuleBasedEvalStrategy.7"));          //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.8")); //$NON-NLS-1$
		logger.info(System.currentTimeMillis() - startTime + Messages.getString("RuleBasedEvalStrategy.9")); //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.10"));              //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.11") + uowEvalState.getCurrentChangedCells().size());              //$NON-NLS-1$


		return uowCache;
	}


	/**
	 *	Execute evaluation strategy on a view section 
	 *
	 * @param dsEvalState Data Slice evaluation state
	 * 
	 * @return PafDataCache
	 * @throws PafException
	 */
	public PafDataCache executeStrategy(EvalState dsEvalState) throws PafException {

		// Initialization
		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataSliceCache dataSliceCache = (PafDataSliceCache) dsCache;
		PafDataCache uowCache = dataSliceCache.getUowCache();
		PafClientState clientState = dsEvalState.getClientState();
		MemberTreeSet memberTrees = clientState.getUowTrees();

		long startTime = System.currentTimeMillis();
		dsEvalState.setStartTime(startTime);
		logger.info(Messages.getString("RuleBasedEvalStrategy.12")); //$NON-NLS-1$

		RuleSet ruleSet = dsEvalState.getMeasureRuleSet();
		logger.info(Messages.getString("RuleBasedEvalStrategy.13") + ruleSet.getName() );         //$NON-NLS-1$
		if (dsEvalState.getAppDef().getAppSettings() != null && dsEvalState.getAppDef().getAppSettings().isEnableRounding()) {
			logger.info(Messages.getString("RuleBasedEvalStrategy.14")); //$NON-NLS-1$
		} else {
			logger.info(Messages.getString("RuleBasedEvalStrategy.15")); //$NON-NLS-1$
		}

		this.measureCat = dsEvalState.getAppDef().getMeasureDefs();

		// Convert variance changes to base version changes
		logger.info(Messages.getString("RuleBasedEvalStrategy.16")); //$NON-NLS-1$
		convertVarianceVersions.performEvaluation(dsEvalState);    

		// Stage contribution % changes
		logger.info(Messages.getString("RuleBasedEvalStrategy.81")); //$NON-NLS-1$
		evalContribPctVersions.stageContributionPctChanges(dsEvalState);
		
		// Updating uow cache with converted data slice cache values,
		// only pulling base dimensions from the uow cache.
		logger.info(Messages.getString("RuleBasedEvalStrategy.17")); //$NON-NLS-1$
		uowCache.loadCacheCells(dsCache);
		
		// Create uowEvalState out of existing dsEvalState
		EvalState uowEvalState = null;
		try {
			uowEvalState = dsEvalState.clone();
		} catch (CloneNotSupportedException e) {
			String errMsg = e.getLocalizedMessage(); 
			logger.error(errMsg);
		}
		uowEvalState.setDataCache(uowCache);

		// Convert replicated changes to base intersection changes
		logger.info(Messages.getString("RuleBasedEvalStrategy.18")); //$NON-NLS-1$
		processReplication.performEvaluation(uowEvalState); 
		logger.info(Messages.getString("RuleBasedEvalStrategy.19")); //$NON-NLS-1$

		logger.info(Messages.getString("RuleBasedEvalStrategy.20"));		 //$NON-NLS-1$
		allocateRatios.performEvaluation(uowEvalState);
		
		//Load rounding rules
		logger.info(Messages.getString("RuleBasedEvalStrategy.21")); //$NON-NLS-1$
		
		// TTN-820 Disable rounding if the file with rounding rules does not exist
		HashMap<String, RoundingRule> roundingRules = EvalUtil.loadRoundingRules(uowEvalState);
		
		if (roundingRules == null){
			uowEvalState.getAppDef().getAppSettings().setEnableRounding(false);
			dsEvalState.getAppDef().getAppSettings().setEnableRounding(false);
		}
		else
		{
			uowEvalState.setRoundingRules(roundingRules);
			dsEvalState.setRoundingRules(roundingRules);
			
			// Round changed values
			roundOriginalChangedValues(uowEvalState); 
		}
		
		logger.info(Messages.getString("RuleBasedEvalStrategy.22")); //$NON-NLS-1$
		Map<String, List<RuleGroup>>balanceSets = createBalanceSets(ruleSet);

		long stepTime = System.currentTimeMillis();
		logger.info(Messages.getString("RuleBasedEvalStrategy.23")); //$NON-NLS-1$
		processLooseMeasures(ruleSet, uowEvalState, dsEvalState);
		logger.info(LogUtil.timedStep(Messages.getString("RuleBasedEvalStrategy.24"), stepTime));   //$NON-NLS-1$

		// this will hold all rulegroups processed. In particular it holds balance
		// set members so they can be skipped in the overall list
		List<RuleGroup> processedRuleGroups = new ArrayList<RuleGroup>(); 

		// Process all rule groups
		for (RuleGroup rg : ruleSet.getRuleGroups() ) {
			processRuleGroup(balanceSets, rg, processedRuleGroups, uowEvalState, dsEvalState);
		}

		// Load data slice cache with updated uow cache values
		// only pulling base dimensions from the uow cache.
		dsCache.loadCacheCells(uowCache);

		// Recalculate versions on current view if slice state exists
		if (dsEvalState.getSliceState() != null)     
			dsCache = PafDataSliceCacheCalc.calcVersionDim(dsCache,dsEvalState.getSliceState().getDataSliceParms(), memberTrees);

		logger.info(Messages.getString("RuleBasedEvalStrategy.25"));          //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.26")); //$NON-NLS-1$
		logger.info(System.currentTimeMillis() - startTime + Messages.getString("RuleBasedEvalStrategy.27")); //$NON-NLS-1$
		logger.info(uowEvalState.getCurrentChangedCells().size() + Messages.getString("RuleBasedEvalStrategy.28"));    		 //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.29"));              //$NON-NLS-1$
         


		return dsCache;
	}


	/**
	 *	Execute evaluation strategy on an attribute view section 
	 *
	 * @param dsEvalState Data Slice evaluation state
	 * @param dsCache Data slice cache
	 * 
	 * @return PafDataCache
	 * @throws PafException
	 */
	public PafDataCache executeAttributeStrategy(EvalState dsEvalState) throws PafException {

		// Initialization
		long stepTime = 0;
		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataSliceCache dataSliceCache = (PafDataSliceCache) dsCache;
		PafDataCache uowCache = dataSliceCache.getUowCache();
		String timeDim = dsEvalState.getAppDef().getMdbDef().getTimeDim();
		String versionDim = dsEvalState.getAppDef().getMdbDef().getVersionDim();
		this.measureCat = dsEvalState.getAppDef().getMeasureDefs();
		PafClientState dsClientState = dsEvalState.getClientState();
		dsEvalState.setAttributeEval(true);
		dsEvalState.setSkipRounding(true);
		String stepDesc = null;

		long startTime = System.currentTimeMillis();
		dsEvalState.setStartTime(startTime);
		logger.info(Messages.getString("RuleBasedEvalStrategy.30")); //$NON-NLS-1$

		RuleSet ruleSet = dsEvalState.getMeasureRuleSet();
		logger.info(Messages.getString("RuleBasedEvalStrategy.31") + ruleSet.getName() );  //$NON-NLS-1$
		if (dsEvalState.getAppDef().getAppSettings() != null && dsEvalState.getAppDef().getAppSettings().isEnableRounding()) {
			logger.info(Messages.getString("RuleBasedEvalStrategy.32")); //$NON-NLS-1$
		} else {
			logger.info(Messages.getString("RuleBasedEvalStrategy.33")); //$NON-NLS-1$
		}

		// Create the list of base dimensions that will be exploded as part of an attribute
		// allocation. Currently, allocations are not performed over the measures dimension.
		Set<String> explodedBaseDims = new HashSet<String>(Arrays.asList(uowCache.getAllDimensions()));
		Set<String> omittedDims = new HashSet<String>();
		omittedDims.add(dsCache.getMeasureDim());
		explodedBaseDims.removeAll(omittedDims);
		dsEvalState.setExplodedBaseDims(explodedBaseDims);

		// Convert variance changes to base version changes
		stepTime = System.currentTimeMillis();
		stepDesc = Messages.getString("RuleBasedEvalStrategy.34"); //$NON-NLS-1$
		convertVarianceVersions.performEvaluation(dsEvalState);    
		logger.info(LogUtil.timedStep(stepDesc, stepTime)); 
		
		// Stage contribution % changes
		logger.info(Messages.getString("RuleBasedEvalStrategy.81")); //$NON-NLS-1$
		evalContribPctVersions.stageContributionPctChanges(dsEvalState);
		
		// Create converted slice state object (must come before convertReplicatedAttributeCells)
		logger.info(Messages.getString("RuleBasedEvalStrategy.37")); //$NON-NLS-1$
		SliceState uowSliceState = convertAttributeSliceState(dsEvalState, uowCache);
		
		// Convert attribute replicated changed cells to base cells 
		stepTime = System.currentTimeMillis();
		stepDesc = Messages.getString("RuleBasedEvalStrategy.38"); //$NON-NLS-1$
        Map<Intersection, Double> varianceReplicationBaseValues = new HashMap<Intersection, Double>();
		uowCache = convertReplicatedAttributeCells(dsEvalState, uowSliceState, uowCache, varianceReplicationBaseValues);
		logger.info(LogUtil.timedStep(stepDesc, stepTime));  

		// Create converted client state object
		logger.info(Messages.getString("RuleBasedEvalStrategy.39")); //$NON-NLS-1$
		PafClientState uowClientState = convertAttributeClientState(dsEvalState, uowCache);
		
		// Create converted eval state object
		logger.info(Messages.getString("RuleBasedEvalStrategy.40")); //$NON-NLS-1$
		EvalState uowEvalState = new EvalState(uowSliceState, uowClientState, uowCache);
		uowEvalState.setDataCache(uowCache);
		uowEvalState.setAttributeEval(true);
		uowEvalState.setVarianceReplicationValues(varianceReplicationBaseValues);
		uowEvalState.setContribPctFormulas(dsEvalState.hasContribPctFormulas());
		
		//Load rounding rules
		if (uowEvalState.getAppDef().getAppSettings().isEnableRounding()) {
			logger.info(Messages.getString("RuleBasedEvalStrategy.35")); //$NON-NLS-1$

			// TTN-820 Disable rounding if the file with rounding rules does not exist
			HashMap<String, RoundingRule> roundingRules = EvalUtil.loadRoundingRules(uowEvalState);

			if (roundingRules == null){
				uowEvalState.getAppDef().getAppSettings().setEnableRounding(false);
				dsEvalState.getAppDef().getAppSettings().setEnableRounding(false);
			}
			else
			{
				uowEvalState.setRoundingRules(roundingRules);
				dsEvalState.setRoundingRules(roundingRules);

				// Round changed values
				roundOriginalChangedValues(dsEvalState);
			}
		}

		logger.info(Messages.getString("RuleBasedEvalStrategy.36"));		 //$NON-NLS-1$
		allocateRatios.performEvaluation(dsEvalState);
		
		// Convert replicated changes to base intersection changes
		stepTime = System.currentTimeMillis();
		stepDesc = Messages.getString("RuleBasedEvalStrategy.41"); //$NON-NLS-1$
		processReplication.performEvaluation(uowEvalState); 
		logger.info(LogUtil.timedStep(stepDesc, stepTime));  

		// Process loose measures
		stepTime = System.currentTimeMillis();
		logger.info(Messages.getString("RuleBasedEvalStrategy.42")); //$NON-NLS-1$
		processLooseMeasures(ruleSet, uowEvalState, dsEvalState);
		logger.info(LogUtil.timedStep(Messages.getString("RuleBasedEvalStrategy.43"), stepTime));   //$NON-NLS-1$

		// Sort rule groups into balance sets
		logger.info(Messages.getString("RuleBasedEvalStrategy.44")); //$NON-NLS-1$
		Map<String, List<RuleGroup>>balanceSets = createBalanceSets(ruleSet);
		List<RuleGroup> processedRuleGroups = new ArrayList<RuleGroup>(); 

		// Process all rule groups
		for (RuleGroup rg : ruleSet.getRuleGroups() ) {		
			processRuleGroup(balanceSets, rg, processedRuleGroups, uowEvalState, dsEvalState);
		} // Next rule group
		

		// Compute attribute intersections (on active versions and only non-elapsed periods in the data slice cache)
		stepDesc = Messages.getString("RuleBasedEvalStrategy.45"); //$NON-NLS-1$
		stepTime = System.currentTimeMillis();
		Map<String, List<String>> memberFilter = new HashMap<String, List<String>>();
		List<String> activeVersions = Arrays.asList(dsCache.getActiveVersions());
		memberFilter.put(versionDim, activeVersions);
		List<String> openPeriods = dsCache.getForwardPlannablePeriods();
		memberFilter.put(timeDim, openPeriods);
		//FIXME (AF) Try just re-calculating the recalc measures (need to makes sure that perp logic recalcs all changed attr intersections first)
		dsCache = PafDataSliceCacheCalc.calcAllAttributeIntersections((PafDataSliceCache) dsCache, uowCache, dsClientState, memberFilter);
		logger.info(LogUtil.timedStep(stepDesc, stepTime));				

		// Recalculate versions on current view if slice state exists
		if (dsEvalState.getSliceState() != null)     
			dsCache = PafDataSliceCacheCalc.calcVersionDim(dsCache, dsEvalState.getSliceState().getDataSliceParms(), dsClientState.getUowTrees());

		logger.info(Messages.getString("RuleBasedEvalStrategy.46"));          //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.47")); //$NON-NLS-1$
		logger.info(System.currentTimeMillis() - startTime + Messages.getString("RuleBasedEvalStrategy.48")); //$NON-NLS-1$
		logger.info(uowEvalState.getCurrentChangedCells().size() + Messages.getString("RuleBasedEvalStrategy.49"));               //$NON-NLS-1$
		logger.info(Messages.getString("RuleBasedEvalStrategy.50"));              //$NON-NLS-1$

		// Return fully calculated data slice cache
		return dsCache;
	}


	/**
	 * Create maps of attribute recalc changed & locked intersections, all organized by converted measure
	 *
	 * @param dsEvalState Data slice eval state
	 * @param ruleGroup Rule group
	 * @param attributeRecalcChangesByTargetMeasure Changed recalc intersections cataloged by target measure
	 * @param attributeRecalcLocksByTargetMeasure Locked recalc intersections cataloged by target measure
	 * 
	 * @throws PafException 
	 * 
	 */
	private void buildAttribRecalcTargetMap(EvalState dsEvalState, RuleGroup ruleGroup, Map<String, Set<Intersection>> attributeRecalcChangesByTargetMeasure, Map<String, Set<Intersection>> attributeRecalcLocksByTargetMeasure) throws PafException {
		
		Map<String, MeasureDef> measureCat = dsEvalState.getAppDef().getMeasureDefs();
		Map<String, Set<Intersection>> changedCellsByMeasure = dsEvalState.getChangedCellsByMsr();
		String measureDim = dsEvalState.getClientState().getApp().getMdbDef().getMeasureDim();
		String timeDim = dsEvalState.getClientState().getApp().getMdbDef().getTimeDim();
		Set<String> lockedPeriods = dsEvalState.getClientState().getLockedPeriods();
		

		// Initialize locked periods
		if (lockedPeriods == null) {
			lockedPeriods = new HashSet<String>();
		}

		// Iterate through each rule in rule group
		for (int r = ruleGroup.getRules().length-1; r >= 0 ; r--) {             

			// Get measure corresponding to current rule
			dsEvalState.setRule(ruleGroup.getRules()[r]);
			String currentMeasure = dsEvalState.getMeasureName();

			// Validate measure
			if (!measureCat.containsKey(currentMeasure)) {
				throw new PafException(Messages.getString("RuleBasedEvalStrategy.51") + currentMeasure + Messages.getString("RuleBasedEvalStrategy.52"), PafErrSeverity.Error); //$NON-NLS-1$ //$NON-NLS-2$
			}

			// Skip this measure if it is not a recalc measure
			if (measureCat.get(currentMeasure).getType() != MeasureType.Recalc) {
				continue;
			}

			// Find target measures for all changed recalc intersections
			if (changedCellsByMeasure.containsKey(currentMeasure)) {

				// Iterate through each changed intersection for the current measure
				Set<Intersection> recalcCells = changedCellsByMeasure.get(currentMeasure);
				for (Intersection recalcCell:recalcCells) {

					// Skip any intersections containing locked time periods
					String cellPeriod = recalcCell.getCoordinate(timeDim);
					if (lockedPeriods.contains(cellPeriod)) {
						continue;
					}
					
					// Find the target measure
					Rule leadingRule = RuleMngr.findLeadingRule(ruleGroup, dsEvalState, recalcCell);
					Formula formula = leadingRule.getFormula();
					String targetMeasure = formula.getResultMeasure();

					// Add intersection to collection
					Set<Intersection> attributeRecalcChanges = attributeRecalcChangesByTargetMeasure.get(targetMeasure);
					if (attributeRecalcChanges == null) {
						attributeRecalcChanges = new HashSet<Intersection>();
						attributeRecalcChangesByTargetMeasure.put(targetMeasure, attributeRecalcChanges);
					}
					attributeRecalcChanges.add(recalcCell);

				} // Next recalc cell
			}

			// Find target measures for all locked recalc intersections
			Set<Intersection> lockedCells = dsEvalState.getCurrentLockedCells();
			for (Intersection lockedCell:lockedCells) {

				// Skip to next locked intersection if current intersection does not 
				// contain the current measure
				String lockedMeasure = lockedCell.getCoordinate(measureDim);
				if (!lockedMeasure.equals(currentMeasure))  {
					continue;
				}

				// Skip any intersections containing locked time periods
				String cellPeriod = lockedCell.getCoordinate(timeDim);
				if (lockedPeriods.contains(cellPeriod)) {
					continue;
				}
				
				// Find the target measure
				Rule leadingRule = RuleMngr.findLeadingRule(ruleGroup, dsEvalState, lockedCell);
				Formula formula = leadingRule.getFormula();
				String targetMeasure = formula.getResultMeasure();

				// Add intersection to collection
				Set<Intersection> attributeRecalcLocks = attributeRecalcLocksByTargetMeasure.get(targetMeasure);
				if (attributeRecalcLocks == null) {
					attributeRecalcLocks = new HashSet<Intersection>();
					attributeRecalcLocksByTargetMeasure.put(targetMeasure, attributeRecalcLocks);
				}
				attributeRecalcLocks.add(lockedCell);

			}

		}
	}


	/**
	 *  Calculate all attribute intersections represented by the result term
	 *  of the specified rule 
	 *
	 * @param dsEvalState Data slice eval state
	 * @param dsCache Data slice cache
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * 
	 * @return DataCache
	 * @throws PafException 
	 */
	private PafDataCache calcAttributeIntersections(EvalState dsEvalState, PafDataCache uowCache, PafClientState clientState) throws PafException {

		PafDataCache dsCache = dsEvalState.getDataCache();
		String measureDim = dsCache.getMeasureDim();
		String timeDim = dsCache.getTimeDim();
		String versionDim = dsCache.getVersionDim();
		
		// Exit if the rule's result term does not exist in the data slice cache
		String resultTerm = dsEvalState.getRule().getFormula().getResultTerm();
		List<String> measureFilter = new ArrayList<String>();
		if (dsCache.isMember(measureDim, resultTerm)) {
			measureFilter.add(resultTerm);
		} else {
			return dsCache;
		}
		
		
		// Use member filter in the calculation step - current measure, plan version, 
		// and open periods (or current time slice if running in time slice mode).
		Map<String, List<String>> memberFilters = new HashMap<String, List<String>>();
		memberFilters.put(measureDim, measureFilter);
		memberFilters.put(versionDim, Arrays.asList(dsCache.getActiveVersions()));
		if (!dsEvalState.isTimeSliceMode()) {
			memberFilters.put(timeDim, dsCache.getForwardPlannablePeriods());
		} else {
			List<String> periods = new ArrayList<String>();
			periods.add(dsEvalState.getCurrentTimeSlice());
			memberFilters.put(timeDim, periods);
		}
		
		String stepDesc = Messages.getString("RuleBasedEvalStrategy.53"); //$NON-NLS-1$
		logger.info(stepDesc + Messages.getString("RuleBasedEvalStrategy.54") + StringUtils.arrayToString(measureFilter.toArray(new String[0]))); //$NON-NLS-1$
		long stepTime = System.currentTimeMillis();
		dsCache = PafDataSliceCacheCalc.calcAllAttributeIntersections(dsEvalState, uowCache, clientState, memberFilters);
		logger.info(LogUtil.timedStep(stepDesc, stepTime));

		return dsCache;
	}



//	/**
//	 *	Evaluate attribute intersection measure formulas. Only changes to recalc
//	 *  measures are processed.
//	 *
//	 * @param dsEvalState Data slice evaluation state
//	 * @param attributeRecalcTargetMap Changed recalc intersections cateloged by recalc measure
//	 * 
//	 * @throws PafException 
//	 */
//	private void evalAttributeMeasureFormulas(EvalState dsEvalState, Map<String, Intersection> attributeRecalcTargetMap) throws PafException {
//
//		Map<String, MeasureDef> measureCat = dsEvalState.getAppDef().getMeasureDefs();
//		Map<String, Set<Intersection>> changedCellsByMeasure = dsEvalState.getChangedCellsByMsr();
//		String currentMeasure = dsEvalState.getMeasureName();
//		Rule rule = dsEvalState.getRule();
//
//		
//		// Convert recalc measure changes to base measure changes
//		if (changedCellsByMeasure.containsKey(currentMeasure) && measureCat.get(currentMeasure).getType() == MeasureType.Recalc) {
//			convertAttributeRecalcChanges(dsEvalState, attributeRecalcTargetMap);
//		}
//
//	}

	
	/**
	 *	Convert client state for an attribute view into one appropriate
	 *  for a non-attribute view. 
	 *
	 * @param dsEvalState Evaluation state object for a data slice cache
	 * @param uowCache Unit-of-work cache
	 *  
	 * @return PafClientState
	 * @throws PafException 
	 */
	private PafClientState convertAttributeClientState(EvalState dsEvalState, PafDataCache uowCache) throws PafException {

		// Initialization
		PafDataCache dsCache = dsEvalState.getDataCache();
		PafClientState attrClientState = dsEvalState.getClientState();
		PafClientState convertedClientState = new PafClientState(attrClientState.getClientId(), attrClientState.getInitRequest(), 
				attrClientState.getPaceHome(), attrClientState.getTransferDirPath(), attrClientState.isDebugMode());
		SliceState dsSliceState = dsEvalState.getSliceState();
		MemberTreeSet memberTrees = dsEvalState.getDataCacheTrees();
		String currentViewName = dsSliceState.getViewName();
		PafView currentView = attrClientState.getView(currentViewName);
		PafViewSection currentViewSection = currentView.getViewSections()[0];	
		String currentViewSectionName = currentViewSection.getName();	

		
		// Set simple properties not needing any conversion. Client state properties that don't have a public getter
		// or setter are skipped.
		convertedClientState.setActiveVersions(attrClientState.getActiveVersions());
		convertedClientState.setApp(attrClientState.getApp());
		convertedClientState.setCurrentMsrRulesetName(attrClientState.getCurrentMsrRulesetName());
		convertedClientState.setLockedPeriods(attrClientState.getLockedPeriods());
		convertedClientState.setMemberIndexLists(attrClientState.getMemberIndexLists()); //TTN-1391
		convertedClientState.setPlannerConfig(attrClientState.getPlannerConfig());
		convertedClientState.setPlannerRole(attrClientState.getPlannerRole());
		convertedClientState.setPlanSeason(attrClientState.getPlanSeason());
		convertedClientState.setRuleSets(attrClientState.getRuleSets());
		convertedClientState.setUowTrees(attrClientState.getUowTrees());
		convertedClientState.setUnitOfWork(attrClientState.getUnitOfWork());
		convertedClientState.setUserSelections(attrClientState.getUserSelections());
		
		// Set current views
		convertedClientState.addView(currentView);
	
		// Set materialized view sections
		String mvsKey = PafMVS.generateKey(currentView, currentViewSection);
		convertedClientState.addMVS(mvsKey, attrClientState.getMVS(mvsKey));
	
		// Convert locked elapsed period intersections
		Set<Intersection> elapsedPeriodCells = attrClientState.getLockedForwardPlannableInterMap().get(currentViewSectionName);
		Set<Intersection> convertedElapsedPeriodCells = new HashSet<Intersection>();
		if (elapsedPeriodCells != null) {
			convertedElapsedPeriodCells = PafDataSliceCacheCalc.getBaseIntersections(dsCache, elapsedPeriodCells, uowCache, memberTrees);
		}
		convertedClientState.addLockedForwardPlannableInterMap(currentViewSectionName, convertedElapsedPeriodCells);
		
		// Convert locked elapsed period intersections
		Set<Intersection> nonPlannableCells = attrClientState.getLockedNotPlannableInterMap().get(currentViewSectionName);
		Set<Intersection> convertedNonPlannableCells = new HashSet<Intersection>();
		if (nonPlannableCells != null) {
			convertedNonPlannableCells = PafDataSliceCacheCalc.getBaseIntersections(dsCache, nonPlannableCells, uowCache, memberTrees);
		}		
		convertedClientState.addLockedNotPlannableInterMap(currentViewSectionName, convertedNonPlannableCells);
		

		// Return converted client state
		return convertedClientState;
	}


	/**
	 *  Convert recalc measures changes and locks on an attribute view into 
	 *  corresponding base measure changes
	 *
	 * @param dsEvalState Data slice evaluation state
	 * @param ruleGroup Rule group
	 * @param attributeRecalcChangesByTargetMeasure Changed recalc intersections cataloged by target measure
	 * @param attributeRecalcLocksByTargetMeasure Locked recalc intersections cataloged by target measure
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	private PafDataCache convertAttributeRecalcChanges(EvalState dsEvalState, RuleGroup ruleGroup, final Map<String, Set<Intersection>> attributeRecalcChangesByTargetMeasure, 
			Map<String, Set<Intersection>> attributeRecalcLocksByTargetMeasure) throws PafException {

		PafDataCache dsCache = dsEvalState.getDataCache();
		Set<Intersection> convertedLockedCells = new HashSet<Intersection>();
		Set<Intersection> newLockedCells = new HashSet<Intersection>();
		String measureDim = dsEvalState.getClientState().getApp().getMdbDef().getMeasureDim();
		String currentMeasure = dsEvalState.getMeasureName();
		IPafFunction measureFunc = null;

		// Skip evaluation rounding steps
		dsEvalState.setSkipRounding(true);

		// Convert all changed recalc cells that evaluate to target measure
		Set<Intersection> changedCells = attributeRecalcChangesByTargetMeasure.get(currentMeasure);
		if (changedCells != null) {

			// Iterate through all recalc target intersections containing current measure
			for (Intersection recalcCell:changedCells) {

				// Find the appropriate formula to back the recalc value into a base meausure
				Rule leadingRule = RuleMngr.findLeadingRule(ruleGroup, dsEvalState, recalcCell);
				Formula formula = leadingRule.getFormula();

				// Check to make sure that we get the same target measure
				String targetMeasure = formula.getResultMeasure(); 
				if (!targetMeasure.equals(currentMeasure)) {
					String errMsg = Messages.getString("RuleBasedEvalStrategy.55"); //$NON-NLS-1$
					logger.warn(errMsg);
					throw new PafException(errMsg, PafErrSeverity.Error);
				}

				// Drive recalc value into appropriate base measure (formula's result term)
				Intersection targetMeasureIs = recalcCell.clone();
				targetMeasureIs.setCoordinate(measureDim, targetMeasure);
				Intersection srcIs = null;
				if (formula.isResultFunction()) {
					measureFunc = formula.extractResultFunction();
					// apply function operation to intersection to be calculated
					srcIs = EvalUtil.translocateIntersection(targetMeasureIs, measureFunc, dsEvalState);
					if (srcIs != null) {
						EvalUtil.evalFormula(formula, measureDim, srcIs, targetMeasureIs, dsCache, dsEvalState);
					}
				} else {
					srcIs = targetMeasureIs;
					EvalUtil.evalFormula(formula, measureDim, targetMeasureIs, dsCache, dsEvalState);  
				}

				if (srcIs != null) {
					// Add newly calculated base measure intersection to changed and locked cells collection
					dsEvalState.addChangedCell(targetMeasureIs);
					dsEvalState.getCurrentLockedCells().add(targetMeasureIs);			

					// If newly calculated cell was protected, shift protection to original
					// recalc intersection.
					Set protectedCells = dsEvalState.getCurrentProtectedCells();
					if (protectedCells.contains(targetMeasureIs)) {
						dsEvalState.getCurrentProtectedCells().add(recalcCell);
						dsEvalState.removeProtectedCell(targetMeasureIs);						
					}
				}

				// Remove recalc cell from locked cells collection (Commented Out - TTN-1092 Contribution % - Test #10)
//				dsEvalState.getCurrentLockedCells().remove(recalcCell);

			} // Next recalc cell

			// Remove recalc cells from changed cells collection (Commented Out - TTN-1092 Contribution % - Test #10)
//			dsEvalState.removeAllCurrentChangedCells(changedCells);
		}


		// Convert any locks on recalc measures to the appropriate base measure
		Set<Intersection> lockedCells = attributeRecalcLocksByTargetMeasure.get(currentMeasure);
		if (lockedCells != null) {

			// Iterate through all locked target intersections containing current measure
			for (Intersection lockedCell:lockedCells) {

				// Add corresponding base measure intersection to changed cells and converted locked cells collections
				String targetMeasure = currentMeasure; 
				Intersection targetMeasureIs = lockedCell.clone();
				targetMeasureIs.setCoordinate(measureDim, targetMeasure);
				newLockedCells.add(targetMeasureIs);
				convertedLockedCells.add(lockedCell);
			}
		}

		// Remove any converted locked cells (Commented Out - TTN-1092)
//		dsEvalState.getCurrentLockedCells().removeAll(convertedLockedCells);

		// Add new locked cells to locked and changed cells collections
		dsEvalState.getCurrentLockedCells().addAll(newLockedCells);
		dsEvalState.addAllChangedCells(newLockedCells);

		// Return updated data slice cache
		return dsCache;
	}


	/**
	 *	Convert slice state for an attribute view into one appropriate
	 *  for a uow cache. 
	 *
	 * @param dsEvalState Evaluation state object for a data slice cache
	 * @param uowCache Uow cache
	 *  
	 * @return SliceState
	 * @throws PafException 
	 */
	private SliceState convertAttributeSliceState(EvalState dsEvalState, final PafDataCache uowCache) throws PafException {

		// Initialization
		PafDataCache dsCache = dsEvalState.getDataCache();
		SliceState uowSliceState = new SliceState();
		SliceState dsSliceState = dsEvalState.getSliceState();
		PafClientState clientState = dsEvalState.getClientState();
		MemberTreeSet memberTrees = dsEvalState.getDataCacheTrees();
		String measureDim = dsEvalState.getMsrDim();
		String currentViewName = dsSliceState.getViewName();
		PafView currentView = clientState.getView(currentViewName);
		String currentViewSectionName = currentView.getViewSections()[0].getName();	
		Set<String> explodedBaseDims = dsEvalState.getExplodedBaseDims();
		
		
		// Set properties not needing any conversion
		uowSliceState.setProtectedCellFormulas(dsSliceState.getProtectedCellFormulas());
		uowSliceState.setDataSliceParms(dsSliceState.getDataSliceParms());
		uowSliceState.setViewName(dsSliceState.getViewName());
		

		// Add any users locks to data slice changed cell collection - weed out recalc measures & elapsed periods
		Set<Intersection> elapsedPeriodCells = clientState.getLockedForwardPlannableInterMap().get(currentViewSectionName);
		Set<Intersection> goodOrigLockedCells = new HashSet<Intersection>();
		for (Intersection lockedCell:dsEvalState.getOrigLockedCells()) {
			String measure = lockedCell.getCoordinate(measureDim);
			if (measureCat.get(measure).getType() != MeasureType.Recalc
					&& (elapsedPeriodCells == null || !elapsedPeriodCells.contains(lockedCell)) )  {
				goodOrigLockedCells.add(lockedCell);
			}
		}
		Set<Intersection> dsUserLocks = new HashSet<Intersection>(goodOrigLockedCells);
		dsEvalState.addAllChangedCells(dsUserLocks);
		
		// Initialize locked cells collection - weed out recalc measures
//		Set<Intersection> goodLockedCells = new HashSet<Intersection>();
//		for (Intersection lockedCell:dsEvalState.getCurrentLockedCells()) {
//			String measure = lockedCell.getCoordinate(measureDim);
//			if (measureCat.get(measure).getType() != MeasureType.Recalc) {
//				goodLockedCells.add(lockedCell);
//			}
//		}
//		Set<Intersection> lockedCells = PafDataSliceCacheCalc.getBaseIntersections(dsCache, goodLockedCells, uowCache, memberTrees);
//		uowSliceState.setLockedCells(lockedCells.toArray(new Intersection[0]));
		uowSliceState.setLockedCells(new Intersection[0]);
		
		// Initialize changed cells collection - weed out recalc measures
		Set<Intersection> goodChangedCells = new HashSet<Intersection>();
		for (Intersection changedCell:dsEvalState.getCurrentChangedCells()) {
			String measure = changedCell.getCoordinate(measureDim);
			if (measureCat.get(measure).getType() != MeasureType.Recalc) {
				goodChangedCells.add(changedCell);
			}
		}
		Set<Intersection> changedCells = PafDataSliceCacheCalc.getBaseIntersections(dsCache, goodChangedCells, uowCache, memberTrees, explodedBaseDims);
		uowSliceState.setChangedCells(changedCells.toArray(new Intersection[0]));

		// Convert protected cells - weed out recalc measures
		Set<Intersection> goodProtectedCells = new HashSet<Intersection>();
		for (Intersection protectedCell:dsEvalState.getCurrentProtectedCells()) {
			String measure = protectedCell.getCoordinate(measureDim);
			if (measureCat.get(measure).getType() != MeasureType.Recalc) {
				goodProtectedCells.add(protectedCell);
			}
		}
		Set<Intersection> protectedCells = PafDataSliceCacheCalc.getBaseIntersections(dsCache, goodProtectedCells, uowCache, memberTrees, explodedBaseDims, true);
		uowSliceState.setProtectedCells(protectedCells.toArray(new Intersection[0]));

		
		// Return converted slice state
		return uowSliceState;
	}


	/**
	 *  Populate dataCache with replicated attribute cells and update
	 *  uowSlice state with replicated base intersections
	 *
	 * @param dsEvalState Data slice evaluation state
	 * @param uowSliceState Unit-of-work slice state
	 * @param varianceReplicationBaseValues Collection of replicated intersectios on variance versions
	 * @param dataCache Unit-of-work cache
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	@SuppressWarnings("unchecked") //$NON-NLS-1$
	private PafDataCache convertReplicatedAttributeCells(EvalState dsEvalState, SliceState uowSliceState, PafDataCache uowCache, Map<Intersection, Double> varianceReplicationBaseValues) throws PafException {

		// Initialization
		PafDataCache dsCache = dsEvalState.getDataCache();
		SliceState dsSliceState = dsEvalState.getSliceState();
		MemberTreeSet memberTrees = dsEvalState.getClientState().getUowTrees();
		int replicationTypeCount = ReplicationType.values().length; 
		Intersection[][] replicatedAttrCells = new Intersection[replicationTypeCount][]; 
		List<Intersection>[] replicatedBaseCells = new List[replicationTypeCount]; 
        Map<Intersection, Double> varianceReplicationValues = dsEvalState.getVarianceReplicationValues();
        String versionDim = uowCache.getVersionDim();
        int versionAxis = uowCache.getVersionAxis();
        String defaultVersion = uowCache.getDimMember(versionAxis, 0);
 

        // Convert all replicated cells to their corresponding base intersections and populate with replicated values
		replicatedAttrCells[ReplicationType.ReplicateExisting.ordinal()] = dsSliceState.getReplicateExistingCells();
		replicatedAttrCells[ReplicationType.ReplicateAll.ordinal()] = dsSliceState.getReplicateAllCells();
		for (int i = 0; i < replicationTypeCount; i++) {
			
			// Determine the replication type (TTN-1467)
			boolean isReplicateExisting = false; 
			if (i == ReplicationType.ReplicateExisting.ordinal()) {
				isReplicateExisting = true;
			}
	
			// Sort replicated cells so that upper level intersections are handled first. 
			// This is done to preserve lower level replications and prevent them from being
			// overwritten by upper level intersections.
			replicatedBaseCells[i] = new ArrayList<Intersection>();
			Intersection[] sortedReplicatedAttrCells =  EvalUtil.sortIntersectionsByAxis(replicatedAttrCells[i], 
					dsEvalState.getClientState().getMemberIndexLists(), dsEvalState.getAxisPriority(), SortOrder.Descending);            

			// Convert replicated cells
			for (Intersection attrIs:sortedReplicatedAttrCells) {
				
				boolean isVarianceIs = false;
				String origVersion = null;
				Intersection attrIsClone = attrIs.clone();

				// Temporarily translate any replicated variance version intersections by replacing the variance version member
				// with a valid base version. This is necessary as variance versions do not exist in the uow cache.
				if (varianceReplicationValues.containsKey(attrIs)) {
					origVersion = attrIsClone.getCoordinate(versionDim);
					attrIsClone.setCoordinate(versionDim, defaultVersion);
					isVarianceIs = true;
				}
				
				// Explode replicated attribute intersections into corresponding base intersections
				Set<Intersection> baseIntersections = PafDataSliceCacheCalc.getBaseIntersections(dsCache, attrIsClone, uowCache, memberTrees);

				// Process replicated intersection. If the "Replicate Existing" option is used, then don't replicate
				// any intersections whose that floor descendants are all zero. (TTN-1467)
				if (!isVarianceIs) {
					// Base version intersection
					double replicatedValue = dsCache.getCellValue(attrIs);
					for (Intersection baseIs:baseIntersections) {
						
						// Skip Replicate Existing intersections that are zero and whose floor descendants
						// are all equal to zero. (TTN-1467)
						if (isReplicateExisting && uowCache.getCellValue(baseIs) == 0) {
							List<Intersection> floorIntersections = EvalUtil.buildFloorIntersections(baseIs, dsEvalState);
							boolean isValueFound = false;
							for (Intersection floorIs : floorIntersections) {
								if (uowCache.getCellValue(floorIs) != 0) {
									isValueFound = true;
									break;
								}
							}
							if (!isValueFound) continue;
						}
						
						// Apply replicated value to each exploded base intersection
						uowCache.setCellValue(baseIs, replicatedValue);
						// Add replication intersection to data slice collection
						replicatedBaseCells[i].add(baseIs); 
					}	
				} else {
					
					// Variance version intersection
					double replicatedValue = varianceReplicationValues.get(attrIs);
					for (Intersection baseIs:baseIntersections) {	
						
						// Remap replication intersection back to original variance version
						baseIs.setCoordinate(versionDim, origVersion);

						// Skip Replicate Existing intersections that are zero and who's floor descendants
						// are all equal to zero. (TTN-1467)
						if (isReplicateExisting && uowCache.getCellValue(baseIs) == 0) {
							List<Intersection> floorIntersections = EvalUtil.buildFloorIntersections(baseIs, dsEvalState);
							boolean isValueFound = false;
							for (Intersection floorIs : floorIntersections) {
								if (uowCache.getCellValue(floorIs) != 0) {
									isValueFound = true;
									break;
								}
							}
							if (!isValueFound) continue;
						}
												
						// Add replication intersection to data slice collection
						replicatedBaseCells[i].add(baseIs); 

						// Add replication intersection and value to eval state collection
						// that will be used later in ES_ProcessReplication.
						varianceReplicationBaseValues.put(baseIs, replicatedValue);
					}
				}
			}
		}

		
		// Update uow slice state with replicated base intersections (my homage to Jim Watkins)
		Intersection[] replicatedExistingCells = replicatedBaseCells[ReplicationType.ReplicateExisting.ordinal()].toArray(new Intersection[0]);
		uowSliceState.setReplicateExistingCells(replicatedExistingCells);
		Intersection[] replicatedAllCells = replicatedBaseCells[ReplicationType.ReplicateAll.ordinal()].toArray(new Intersection[0]);
		uowSliceState.setReplicateAllCells(replicatedAllCells);


		// Return updated uow cache
		return uowCache;
	}



	/**
	 *	Process any changed measures that aren't contained in a rule group for the
	 *  current rule set. This is a convenience method for 
	 *  processLooseMeasures(rs, uowEvalState, dsEvalState), where the dsEvalState
	 *  parameter is set to uowEvalState.
	 *
	 * @param rs Rule set
	 * @param uowEvalState Uow eval state
	 * @param dsEvalState Data slice eval state
	 * 
	 * @throws PafException
	 */
	private void processLooseMeasures( RuleSet rs, EvalState uowEvalState) throws PafException {
		processLooseMeasures(rs, uowEvalState, uowEvalState);
		
	}
	
	/**
	 *	Process any changed measures that aren't contained in a rule group for the
	 *  current rule set.
	 *
	 * @param rs Rule set
	 * @param uowEvalState Uow eval state
	 * @param dsEvalState Data slice eval state
	 * 
	 * @throws PafException
	 */
	private void processLooseMeasures( RuleSet rs, EvalState uowEvalState, EvalState dsEvalState) throws PafException {
		// collect all measures in ruleset that will be processed as part of a rule sequence.
		List<String> measuresToProcess = new ArrayList<String>();

		// if no measure list is specified, candidate list is all measures defined.
		if (rs.getMeasureList() == null || rs.getMeasureList().length < 1)
			measuresToProcess.addAll(uowEvalState.getAppDef().getMeasureDefs().keySet());
		else { // only process measures specified in rulsets
			for (String msrName : rs.getMeasureList()) measuresToProcess.add(msrName);
		}

		// remove all measures used in ruleset rules
		for (RuleGroup rg : rs.getRuleGroups()) {
			for (Rule r : rg.getRules()) {
				if (r.getFormula().isResultFunction()) {
					measuresToProcess.remove(r.getFormula().extractResultFunction().getMeasureName());
				}
				else {
					measuresToProcess.remove(r.getFormula().getResultTerm());
				}
			}
		}

		// Now go ahead and process all loose measures, and do standard
		// allocation and aggregation. Only process measures that have 
		// changes already to consider, unless a Default Evaluation
		// is running (TTN-1249).
		List<RuleGroup> ruleGroups = new ArrayList<RuleGroup>();
		Rule r;
		for (String msrName : measuresToProcess) {
			if (uowEvalState.getChangedCellsByMsr().containsKey(msrName) || uowEvalState.isDefaultEvalStep()) {
				ruleGroups.clear();
				r = new Rule( msrName.trim() + Messages.getString("RuleBasedEvalStrategy.56") + msrName.trim() ); //$NON-NLS-1$
				r.getFormula().parse(uowEvalState.getAppDef().getMeasureFunctionFactory() );
				ruleGroups.add(new RuleGroup(new Rule[] { r }));
				processStdRuleGroups(ruleGroups, uowEvalState, dsEvalState);
			}
		}
	}   


	/**
	 *	Process a list of perpetual rule groups
	 *
	 * @param ruleGroups List of rule groups
	 * @param uowEvalState Uow evaluation state
	 * @param dsEvalState Data slice evaluation state
	 * 
	 * @throws PafException 
	 */
	private void processPerpetualRuleGroups( List<RuleGroup> ruleGroups, EvalState uowEvalState, EvalState dsEvalState )  throws PafException {  
		// enter time slice mode
		// process intersections in equivalent to a postorder traveral of 
		// the time tree. The eval step is only allowed to process changes for
		// the current time slice, however, it can pull from other time slices to 
		// resolve it's needs. Primarily this supports updating bop from eop.
		// All changed intersections are stored in a hashmap keyed by time slice
		// and stored in eval state. An overall iterator on eval state lets the step
		// know which time slice it's currently operating on. This allows the step to
		// quickly consider only relevant intersections, and the master loop will skip 
		// over empty lists

		Map<String, Set<Intersection>> attributeRecalcChangesByTargetMeasure = new HashMap<String, Set<Intersection>>();
		Map<String, Set<Intersection>> attributeRecalcLocksByTargetMeasure = new HashMap<String, Set<Intersection>>();
		PafDataCache uowCache = uowEvalState.getDataCache();

		List<String> timePeriods = uowEvalState.getTimePeriodList();
		uowEvalState.setTimeSliceMode(true);

		// process all rulegroups in this subset in time slice order
		for (String timeSlice : timePeriods) {
			// can't skip intersections with no changes since changes in other time periods
			// can drive changes in this one. 

			uowEvalState.setCurrentTimeSlice(timeSlice);
			for (RuleGroup rg : ruleGroups ) {

				logger.debug(Messages.getString("RuleBasedEvalStrategy.57") + rg.toString() + Messages.getString("RuleBasedEvalStrategy.58") + timeSlice);                 //$NON-NLS-1$ //$NON-NLS-2$
				uowEvalState.setRuleGroup(rg);             

//				// If this is an attribute evaluation, populate maps of attribute recalc changed & 
//				// locked intersections, cataloged by the corresponding target measure
//				if (uowEvalState.isAttributeEval()) {
//					logger.info(Messages.getString("RuleBasedEvalStrategy.69")); //$NON-NLS-1$
//					buildAttribRecalcTargetMap(dsEvalState, rg,attributeRecalcChangesByTargetMeasure, attributeRecalcLocksByTargetMeasure);
//				}
				
				// if this is the 1st time slice perform an initial allocation to push down
				// all measures for this group. Tag driven also
				if (timeSlice.equals(timePeriods.get(0)) && rg.getPerformInitialAllocation()  ) {
					logger.debug(Messages.getString("RuleBasedEvalStrategy.59")); //$NON-NLS-1$
					for (int r = rg.getRules().length-1; r >= 0 ; r--) {
						
						// Set current rule
						uowEvalState.setRule(rg.getRules()[r]);

//						// Allocate attribute intersection changes
//						if (uowEvalState.isAttributeEval()) {
//							dsEvalState.setRule(uowEvalState.getRule());
//							PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState,  uowEvalState.getDataCacheTrees());
//						}
					
						// Allocate upper level changes
						logger.debug(Messages.getString("RuleBasedEvalStrategy.60") + rg.getRules()[r].toString()); //$NON-NLS-1$
						uowEvalState.setTimeSliceMode(false);
						allocateUpper.performEvaluation(uowEvalState);    
						uowEvalState.setTimeSliceMode(true);  
						
						// Do we need to do an attribute aggregation here?
						}
				}                


				// 1st process aggregate measures
				logger.debug(Messages.getString("RuleBasedEvalStrategy.61"));             //$NON-NLS-1$
				for (int r = rg.getRules().length-1; r >= 0 ; r--) {
					logger.debug(Messages.getString("RuleBasedEvalStrategy.62") + rg.getRules()[r].toString()); //$NON-NLS-1$
					uowEvalState.setRule(rg.getRules()[r]);

					evalPerpetualRulegroup.performEvaluation(uowEvalState); 
					
//					// Allocate attribute intersection changes
//					if (uowEvalState.isAttributeEval()) {
//						dsEvalState.setRule(uowEvalState.getRule());
//						PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState,  uowEvalState.getDataCacheTrees());
//					}
					
					// Allocate upper level changes
					allocateUpper.performEvaluation(uowEvalState);
					
//					// Re-compute attribute intersections for any processed data slice cache 
//					// measures, if uow cache is dirty
//					if (uowEvalState.isAttributeEval() && uowCache.isDirty()) {
//						calcAttributeIntersections(dsEvalState, uowCache, dsEvalState.getRule(), uowEvalState.getClientState());
//						uowCache.setDirty(false);
//					}
				}   
			}   
		}    

		// now do an aggregation and recalc pass
		for (RuleGroup rg : ruleGroups ) {       
			logger.debug(Messages.getString("RuleBasedEvalStrategy.63") + rg.getRuleGroupId()); //$NON-NLS-1$
			long rgStartTime = System.currentTimeMillis();
			uowEvalState.setRuleGroup(rg);

			for (int r = rg.getRules().length-1; r >= 0 ; r--) {    
				uowEvalState.setRule(rg.getRules()[r]);
				if (measureCat.get(uowEvalState.getMeasureName()).getType() == MeasureType.Recalc) continue;
				aggregate.performEvaluation(uowEvalState);
			}

			for (int r = rg.getRules().length-1; r >= 0 ; r--) {    
				uowEvalState.setRule(rg.getRules()[r]);
				if (measureCat.get(uowEvalState.getMeasureName()).getType() != MeasureType.Recalc) continue;
				recalcMeasures.performEvaluation(uowEvalState);            
			}            

			logger.debug(LogUtil.timedStep(Messages.getString("RuleBasedEvalStrategy.64") + rg.getRuleGroupId(), rgStartTime));         //$NON-NLS-1$
		}
	}


	/**
	 *	Process a list of perpetual rule groups
	 *
	 * @param ruleGroups List of rule groups
	 * @param uowEvalState Uow evaluation state
	 * @param dsEvalState Data slice evaluation state
	 * 
	 * @throws PafException 
	 */
	private void processPerpetualRuleGroupsCP( List<RuleGroup> ruleGroups, EvalState uowEvalState, EvalState dsEvalState )  throws PafException {  
		// enter time slice mode
		// process intersections in equivalent to a postorder traveral of 
		// the time tree. The eval step is only allowed to process changes for
		// the current time slice, however, it can pull from other time slices to 
		// resolve it's needs. Primarily this supports updating bop from eop.
		// All changed intersections are stored in a hashmap keyed by time slice
		// and stored in eval state. An overall iterator on eval state lets the step
		// know which time slice it's currently operating on. This allows the step to
		// quickly consider only relevant intersections, and the master loop will skip 
		// over empty lists

// *** THIS CODE IS NOT BEING USED RIGHT NOW - THIS IS A COPY OF 'processPerpetualRuleGroups' 
// WITH SOME PENDING CHANGES FOR CONTRIBUTION %
//
		Map<String, Set<Intersection>> attributeRecalcChangesByTargetMeasure = new HashMap<String, Set<Intersection>>();
		Map<String, Set<Intersection>> attributeRecalcLocksByTargetMeasure = new HashMap<String, Set<Intersection>>();
		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataCache uowCache = uowEvalState.getDataCache();
		MdbDef mdbDef = uowEvalState.getAppDef().getMdbDef();
		String measureDim = mdbDef.getMeasureDim();
		String timeDim = mdbDef.getTimeDim();
		String versionDim = mdbDef.getVersionDim();
		Map<String, List<String>> dsCacheFilter = new HashMap<String, List<String>>();

		List<String> timePeriods = uowEvalState.getTimePeriodList();
		dsEvalState.setTimeSliceMode(true);
		uowEvalState.setTimeSliceMode(true);

		// process all rule groups in this subset in time slice order
		for (String timeSlice : timePeriods) {
			// can't skip intersections with no changes since changes in other time periods
			// can drive changes in this one. 

			uowEvalState.setCurrentTimeSlice(timeSlice);
			dsEvalState.setCurrentTimeSlice(uowEvalState.getCurrentTimeSlice());
			for (RuleGroup rg : ruleGroups ) {

				logger.debug(Messages.getString("RuleBasedEvalStrategy.57") + rg.toString() + Messages.getString("RuleBasedEvalStrategy.58") + timeSlice);                 //$NON-NLS-1$ //$NON-NLS-2$
				uowEvalState.setRuleGroup(rg);             

//				// If this is an attribute evaluation, populate maps of attribute recalc changed & 
//				// locked intersections, cataloged by the corresponding target measure
//				if (uowEvalState.isAttributeEval()) {
//					logger.info(Messages.getString("RuleBasedEvalStrategy.69")); //$NON-NLS-1$
//					buildAttribRecalcTargetMap(dsEvalState, rg,attributeRecalcChangesByTargetMeasure, attributeRecalcLocksByTargetMeasure);
//				}
				
				// if this is the 1st time slice perform an initial allocation to push down
				// all measures for this group. Tag driven also
				if (timeSlice.equals(timePeriods.get(0)) && rg.getPerformInitialAllocation()  ) {
					logger.debug(Messages.getString("RuleBasedEvalStrategy.59")); //$NON-NLS-1$
					for (int r = rg.getRules().length-1; r >= 0 ; r--) {
						
						// Set current rule
						uowEvalState.setRule(rg.getRules()[r]);
						dsEvalState.setRule(uowEvalState.getRule());

//						// Allocate attribute intersection changes
//						if (uowEvalState.isAttributeEval()) {
//							dsEvalState.setRule(uowEvalState.getRule());
//							PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState,  uowEvalState.getDataCacheTrees());
//						}
					
						// Allocate upper level changes
						logger.debug(Messages.getString("RuleBasedEvalStrategy.60") + rg.getRules()[r].toString()); //$NON-NLS-1$
						uowEvalState.setTimeSliceMode(false);
						allocateUpper.performEvaluation(uowEvalState);    
						uowEvalState.setTimeSliceMode(true);  

						// *** For Contribution % - We should really need to do an aggregation at this point *** 
						String currentMeasure = dsEvalState.getMeasureName();
						Set<Intersection> changedContribPctCells = dsEvalState.getChangedContribPctCellsByMsr().get(currentMeasure);
						if (changedContribPctCells != null && !changedContribPctCells.isEmpty()) {
							uowEvalState.setTimeSliceMode(false);
							dsEvalState.setTimeSliceMode(false);
							aggregate.performEvaluation(uowEvalState);
							// Data slice cache may need to be updated for current measure if uow cache has changed
//							if (uowCache.isDirty()) {
								if (uowEvalState.isAttributeEval()) {
									// Attribute view - update attribute intersections
									calcAttributeIntersections(dsEvalState, uowCache, uowEvalState.getClientState());
								} else {
									// Non-attribute view - update if there are contribution percent changes
									if (!dsEvalState.getChangedContribPctCells().isEmpty()) {
										// Initialize member filter used for pruning intersection collections
										List<String> measureList = new ArrayList<String>();
										measureList.add(currentMeasure);
										dsCacheFilter.put(measureDim, measureList);
										dsCacheFilter.put(timeDim, dsCache.getForwardPlannablePeriods());
										dsCacheFilter.put(versionDim, Arrays.asList(dsCache.getActiveVersions()));
										dsCache.loadCacheCells(uowCache, dsCacheFilter);
									} 
//								} 

								// Clear dirty flag
//								uowCache.setDirty(false);
							}
							uowEvalState.setTimeSliceMode(true);
							dsEvalState.setTimeSliceMode(true);
						}

						// Do we need to do an attribute aggregation here?
					}
				}                



				// 1st process aggregate measures. If needed, a second pass through this
				// process will be added to resolve any contribution percent conflicts
				logger.debug(Messages.getString("RuleBasedEvalStrategy.61"));             //$NON-NLS-1$
				int passCount = 1;
				if (hasContribPctConflicts(dsEvalState, rg)) {
					logger.info(Messages.getString("RuleBasedEvalStrategy.85"));
					passCount = 2;
				}
				
				// Cycle through each rule in priority order
				for (int passNo = 0; passNo < passCount; passNo++) {
					
					for (int r = rg.getRules().length-1; r >= 0 ; r--) {
						logger.debug(Messages.getString("RuleBasedEvalStrategy.62") + rg.getRules()[r].toString()); //$NON-NLS-1$
						uowEvalState.setRule(rg.getRules()[r]);
						dsEvalState.setRule(uowEvalState.getRule());
						String currentMeasure = uowEvalState.getMeasureName();

						evalPerpetualRulegroup.performEvaluation(uowEvalState); 

//						// Allocate attribute intersection changes
//						if (uowEvalState.isAttributeEval()) {
//						dsEvalState.setRule(uowEvalState.getRule());
//						PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState,  uowEvalState.getDataCacheTrees());
//						}

						// Allocate upper level changes
						allocateUpper.performEvaluation(uowEvalState);

						// *** For Contribution % - We really need to do an aggregation at this point *** 
						Set<Intersection> changedContribPctCells = dsEvalState.getChangedContribPctCellsByMsr().get(currentMeasure);
						if (changedContribPctCells != null && !changedContribPctCells.isEmpty()) {
							aggregate.performEvaluation(uowEvalState);
						}
						
						// Data slice cache may need to be updated for current measure if uow cache has changed
//						if (uowCache.isDirty()) {
							if (!dsEvalState.getChangedContribPctCells().isEmpty() && uowEvalState.isAttributeEval()) {
								// Attribute view - update attribute intersections
								calcAttributeIntersections(dsEvalState, uowCache, uowEvalState.getClientState());
							} else {
								// Non-attribute view - update if there are contribution percent changes
								if (!dsEvalState.getChangedContribPctCells().isEmpty()) {
									// Initialize member filter used for pruning intersection collections
									List<String> measureList = new ArrayList<String>();
									measureList.add(currentMeasure);
									dsCacheFilter.put(measureDim, measureList);
									List<String> periodList = new ArrayList<String>(); 
									periodList.add(timeSlice);
									dsCacheFilter.put(timeDim, periodList);
									dsCacheFilter.put(versionDim, Arrays.asList(dsCache.getActiveVersions()));
									dsCache.loadCacheCells(uowCache, dsCacheFilter);
								} 
	//						} 

							// Clear dirty flag
//							uowCache.setDirty(false);
						}

						// Evaluate contribution percent changes (Only perform on 1st pass)
						if (passNo == 0) {
							String stepDesc = Messages.getString("RuleBasedEvalStrategy.86"); //$NON-NLS-1$
							logger.debug(stepDesc + Messages.getString("RuleBasedEvalStrategy.54") + Messages.getString("RuleBasedEvalStrategy.87") + currentMeasure); //$NON-NLS-1$ //$NON-NLS-2$
							evalContribPctVersions.performEvaluation(uowEvalState,dsEvalState, allocateUpper, aggregate);
						}

						
					}  // Next rule 
					
				} // Next pass  
				
			} // Next rule group
			
		} // Next time slice

		
		// now do an aggregation and recalculation pass
		for (RuleGroup rg : ruleGroups ) {       
			logger.debug(Messages.getString("RuleBasedEvalStrategy.63") + rg.getRuleGroupId()); //$NON-NLS-1$
			long rgStartTime = System.currentTimeMillis();
			uowEvalState.setRuleGroup(rg);

			for (int r = rg.getRules().length-1; r >= 0 ; r--) {    
				uowEvalState.setRule(rg.getRules()[r]);
				if (measureCat.get(uowEvalState.getMeasureName()).getType() == MeasureType.Recalc) continue;
				aggregate.performEvaluation(uowEvalState);
			}

			for (int r = rg.getRules().length-1; r >= 0 ; r--) {    
				uowEvalState.setRule(rg.getRules()[r]);
				if (measureCat.get(uowEvalState.getMeasureName()).getType() != MeasureType.Recalc) continue;
				recalcMeasures.performEvaluation(uowEvalState);            
			}            

			logger.debug(LogUtil.timedStep(Messages.getString("RuleBasedEvalStrategy.64") + rg.getRuleGroupId(), rgStartTime));         //$NON-NLS-1$
		}

		dsEvalState.setTimeSliceMode(false);
	}


	/**
	 *	Process rule group - main controller method. This is a convenience method for
	 *  processRuleGroup(balanceSets, ruleGroup, processedRuleGroups, uowEvalState, dsEvalState)
	 *  where dsEvalState has been set to uowEvalState.
	 *
	 * @param balanceSets Collection of balance sets
	 * @param ruleGroup Rule group
	 * @param processedRuleGroups Collection of processed rule groups
	 * @param uowEvalState Uow evaluation state
	 * @param dsEvalState Data slice evaluation state
	 * 
	 * @throws PafException 
	 */
	private void processRuleGroup(Map<String, List<RuleGroup>> balanceSets, RuleGroup ruleGroup, List<RuleGroup> processedRuleGroups, EvalState uowEvalState) throws PafException {
		processRuleGroup(balanceSets, ruleGroup, processedRuleGroups, uowEvalState, uowEvalState);
	}
	
	/**
	 *	Process rule group - main controller method
	 *
	 * @param balanceSets Collection of balance sets
	 * @param ruleGroup Rule group
	 * @param processedRuleGroups Collection of processed rule groups
	 * @param uowEvalState Uow evaluation state
	 * @param dsEvalState Data slice evaluation state
	 * 
	 * @throws PafException 
	 */
	private void processRuleGroup(Map<String, List<RuleGroup>> balanceSets, RuleGroup ruleGroup, List<RuleGroup> processedRuleGroups, EvalState uowEvalState, EvalState dsEvalState) throws PafException {

		// Only process rule groups that haven't already been processed
		if (!processedRuleGroups.contains(ruleGroup)) {

			logger.info(Messages.getString("RuleBasedEvalStrategy.65") + ruleGroup.toString() ); //$NON-NLS-1$

			if (PafMetaData.getServerSettings().isChangedCellLogging())
				logger.debug(Messages.getString("RuleBasedEvalStrategy.66") + java.util.Arrays.toString(uowEvalState.getCurrentChangedCells().toArray(new Intersection[0]))); //$NON-NLS-1$

			// in order to handle balance sets all processes work with lists.
			List<RuleGroup> currentSet = new ArrayList<RuleGroup>();

			// if balance set, add all rulegroups into list, else just add the rulegroup
			if ( ruleGroup.getBalanceSetKey() != null && !ruleGroup.getBalanceSetKey().equals("")) { //$NON-NLS-1$
				currentSet = balanceSets.get(ruleGroup.getBalanceSetKey());
			}
			else {
				currentSet.add(ruleGroup);
			}
			// three general types of processing, regular and perpetual
			if ( ruleGroup.isPerpetual() ) {
				processPerpetualRuleGroups( currentSet, uowEvalState, dsEvalState );
			}

//			else if ( rg.isDelayedPerpetual() ) {
//			processDelayedPerpetualRuleGroups( currentSet );
//			}

			else {
				processStdRuleGroups( currentSet, uowEvalState, dsEvalState);
			}

			processedRuleGroups.addAll(currentSet);
		}

	}


	/**
	 *	Process a standard rule group
	 *
	 * @param ruleGroups List of rule groups
	 * @param uowEvalState Uow evaluation state
	 * @param dsEvalState Data slice evaluation state
	 * 
	 * @throws PafException 
	 */
	private void processStdRuleGroups( List<RuleGroup> ruleGroups, EvalState uowEvalState, EvalState dsEvalState) throws PafException {

		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataCache uowCache = uowEvalState.getDataCache();
		MdbDef mdbDef = uowEvalState.getAppDef().getMdbDef();
		String measureDim = mdbDef.getMeasureDim();
		String versionDim = mdbDef.getVersionDim();
		Map<String, List<String>> measureFilter = new HashMap<String, List<String>>();
		boolean isRoundingEnabled = false;

		// Check if rounding is enabled
		if (uowEvalState.getAppDef().getAppSettings() != null && uowEvalState.getAppDef().getAppSettings().isEnableRounding()) {
			isRoundingEnabled = true;
		}
		
		for (RuleGroup rg : ruleGroups) {
			logger.info(Messages.getString("RuleBasedEvalStrategy.68") + rg.toString()); //$NON-NLS-1$

			long rgStartTime = System.currentTimeMillis();
			boolean ruleGroupContainsRoundedMeasure = false;
			boolean ruleGroupContainsUnRoundedRecalcMeasure = false;
			boolean ruleGroupContainsUnRoundedNonRecalcMeasure = false;

			// Initialize rule group
			String currentMeasure;
			uowEvalState.setRuleGroup(rg);
			dsEvalState.setTimeSliceMode(false);
			uowEvalState.setTimeSliceMode(false);


			// 1st process aggregate measures. If needed, a second pass through this
			// process will be added to resolve any contribution percent conflicts
			logger.info(Messages.getString("RuleBasedEvalStrategy.70"));   //$NON-NLS-1$
			int passCount = 1;
			if (hasContribPctConflicts(dsEvalState, rg)) {
				logger.info(Messages.getString("RuleBasedEvalStrategy.85"));   //$NON-NLS-1$
				passCount = 2;
			}

			// Cycle through each rule in priority order
			for (int passNo = 0; passNo < passCount; passNo++) {
				
				// If this is an attribute evaluation, populate maps of attribute recalc changed & 
				// locked intersections, cataloged by the corresponding target measure
				Map<String, Set<Intersection>> attributeRecalcChangesByTargetMeasure = new HashMap<String, Set<Intersection>>();
				Map<String, Set<Intersection>> attributeRecalcLocksByTargetMeasure = new HashMap<String, Set<Intersection>>();
				if (uowEvalState.isAttributeEval()) {
					logger.info(Messages.getString("RuleBasedEvalStrategy.69")); //$NON-NLS-1$
					buildAttribRecalcTargetMap(dsEvalState, rg,attributeRecalcChangesByTargetMeasure, attributeRecalcLocksByTargetMeasure);
				}
				
				for (int r = rg.getRules().length-1; r >= 0 ; r--) {             

					uowEvalState.setRule(rg.getRules()[r]);
					currentMeasure = uowEvalState.getMeasureName();

					// Initialize member filter used for pruning intersection collections
					List<String> measureList = new ArrayList<String>();
					measureList.add(currentMeasure);
					measureFilter.put(measureDim, measureList);

					if (!measureCat.containsKey(currentMeasure)) 
						throw new PafException(Messages.getString("RuleBasedEvalStrategy.71") + currentMeasure + Messages.getString("RuleBasedEvalStrategy.72"), PafErrSeverity.Error); //$NON-NLS-1$ //$NON-NLS-2$

					if (isRoundingEnabled) {
						//Determine if the rule group contains at least 1 rounded measure and 1 non-rounded measure
						if (uowEvalState.getRoundingRules().containsKey(currentMeasure)){
							ruleGroupContainsRoundedMeasure = true;
						} else {
							if (uowEvalState.getMeasureType() == MeasureType.Recalc){
								ruleGroupContainsUnRoundedRecalcMeasure = true;
							} else {
								ruleGroupContainsUnRoundedNonRecalcMeasure = true;
							}
						}
					}


					// Pre-process attribute recalc changes
					if (uowEvalState.isAttributeEval()) {
						dsEvalState.setRule(uowEvalState.getRule());
						convertAttributeRecalcChanges(dsEvalState, rg, attributeRecalcChangesByTargetMeasure, attributeRecalcLocksByTargetMeasure);
					}

					if (uowEvalState.getMeasureType() == MeasureType.Recalc) continue;

					logger.info(Messages.getString("RuleBasedEvalStrategy.73") + uowEvalState.getRule().toString()); //$NON-NLS-1$

					evalStdRulegroup.performEvaluation(uowEvalState);

					// Allocate attribute intersection changes
					if (uowEvalState.isAttributeEval()) {
						dsEvalState.setRule(uowEvalState.getRule());
						PafDataSliceCacheCalc.allocateAttributeCells(dsEvalState, uowEvalState,  uowEvalState.getDataCacheTrees());
					}

					allocateUpper.performEvaluation(uowEvalState);

					aggregate.performEvaluation(uowEvalState);

					// Data slice cache may need to be updated for current measure if uow cache has changed
					if (uowCache.isDirty()) {
						if (uowEvalState.isAttributeEval()) {
							// Attribute view - update attribute intersections
							calcAttributeIntersections(dsEvalState, uowCache, uowEvalState.getClientState());
						} else {
							// Non-attribute view - update if there are contribution percent changes
							if (!dsEvalState.getChangedContribPctCells().isEmpty()) {
								dsCache.loadCacheCells(uowCache, measureFilter);
							} 
						} 

						// Clear dirty flag
						uowCache.setDirty(false);
					}


					// Evaluate contribution percent changes (Only perform on 1st pass)
					if (passNo == 0) {
						String stepDesc = Messages.getString("RuleBasedEvalStrategy.86"); //$NON-NLS-1$
						logger.info(stepDesc + Messages.getString("RuleBasedEvalStrategy.54") + Messages.getString("RuleBasedEvalStrategy.87") + currentMeasure); //$NON-NLS-1$ //$NON-NLS-2$
						evalContribPctVersions.performEvaluation(uowEvalState,dsEvalState, allocateUpper, aggregate);
						long stepTime = System.currentTimeMillis();
						logger.info(LogUtil.timedStep(stepDesc, stepTime));
					}


				} // Next rule 
			
			} // Next pass

			
			// 2nd process recalc measures for any upper level impacts.
			logger.info(Messages.getString("RuleBasedEvalStrategy.74"));  //$NON-NLS-1$

			for (int r = rg.getRules().length-1; r >= 0 ; r--) {

				uowEvalState.setRule(rg.getRules()[r]);
				currentMeasure = uowEvalState.getMeasureName();
				if (measureCat.get(currentMeasure).getType() != MeasureType.Recalc) continue;

				logger.info(Messages.getString("RuleBasedEvalStrategy.75") + rg.getRules()[r].toString());                             //$NON-NLS-1$
				recalcMeasures.performEvaluation(uowEvalState);
				
				//recalc attributes
				if (uowEvalState.isAttributeEval()== true)
				{
					if (isRoundingEnabled) {
						if(dsEvalState.getDataCache().isMember(measureDim, currentMeasure)){													
							Map<String, List<String>> dimFilter = new HashMap<String, List<String>>();
							List<String> activeVersions = Arrays.asList(uowEvalState.getDataCache().getActiveVersions());
							List<String> currentMeasures = new ArrayList<String>();
							currentMeasures.add(currentMeasure);
							dimFilter.put(versionDim, activeVersions);
							dimFilter.put(measureDim, currentMeasures);
							PafDataSliceCacheCalc.calcAllAttributeIntersections((PafDataSliceCache) dsEvalState.getDataCache(), 
									uowCache, dsEvalState.getClientState(), dimFilter);
						}
					}
				}
						
			} 

			logger.info(Messages.getString("RuleBasedEvalStrategy.76"));  //$NON-NLS-1$
			if (isRoundingEnabled) {
				// If the rule group contains at least 1 rounded measure and 1 non-rounded measure
				// then proceed with the rounding resourse pass
				if (ruleGroupContainsRoundedMeasure == true && ruleGroupContainsUnRoundedRecalcMeasure == false &&
						ruleGroupContainsUnRoundedNonRecalcMeasure == true)
				{
					uowEvalState.setRoundingResourcePass(true);
					try {
						//3nd rounding res pass.
						for (int r = rg.getRules().length-1; r >= 0 ; r--) {

							uowEvalState.setRule(rg.getRules()[r]);
							currentMeasure = uowEvalState.getMeasureName();
							if (measureCat.get(currentMeasure).getType() == MeasureType.Recalc) continue;

							logger.info(Messages.getString("RuleBasedEvalStrategy.77") + rg.getRules()[r].toString());                             //$NON-NLS-1$
							evalStdRulegroup.performEvaluation(uowEvalState);
							aggregate.performEvaluation(uowEvalState);
						} 

						//4th rounding pass - recalcs for any upper level impacts.
						uowEvalState.setSkipRounding(true);
						try{
							for (int r = rg.getRules().length-1; r >= 0 ; r--) {

								uowEvalState.setRule(rg.getRules()[r]);
								currentMeasure = uowEvalState.getMeasureName();
								if (measureCat.get(currentMeasure).getType() != MeasureType.Recalc) continue;

								logger.info(Messages.getString("RuleBasedEvalStrategy.78") + rg.getRules()[r].toString());                             //$NON-NLS-1$
								recalcMeasures.performEvaluation(uowEvalState);
							}
						}
						finally{
							uowEvalState.setSkipRounding(false);
						}
					}
					finally{
						uowEvalState.setRoundingResourcePass(false);
					}
				}
			}

			logger.info(Messages.getString("RuleBasedEvalStrategy.79") + (System.currentTimeMillis() - rgStartTime) + Messages.getString("RuleBasedEvalStrategy.80"));  //$NON-NLS-1$ //$NON-NLS-2$
		}
	}



	/**
	 *  This method checks if any contribution percent changes will conflict
	 *  with other user changes in the specified rule group.
	 *
	 * @param evalState Evaluation state
	 * @param rg Rule group
	 * 
	 * @return 
	 */
	private boolean hasContribPctConflicts(EvalState evalState, RuleGroup rg) {

		// Return false if this is a "default evaluation" step, or if there are no
		// contribution % formulas
		if (!evalState.hasContribPctFormulas() || evalState.isDefaultEvalStep()) {
			return false;
		}
		
		Set<Intersection> protectedCells = new HashSet<Intersection>(Arrays.asList(evalState.getSliceState().getProtectedCells()));
		
		// Iterate through rules in rule group
		for (int r = rg.getRules().length-1; r >= 0 ; r--) {   
			
			// Get current measure (result term of current rule)
			evalState.setRule(rg.getRules()[r]);
			String currentMeasure = evalState.getMeasureName();
			
			// Get all the contribution percent changes for the current measure
			Set<Intersection> changedContribPctCells = evalState.getChangedContribPctCellsByMsr().get(currentMeasure);
			
			// Determine if any of the target of any found contribution percent change is a protected cell
			if (changedContribPctCells != null) {
				for (Intersection changedCell : changedContribPctCells) {
					Intersection targetIs = evalContribPctVersions.buildTargetIs(changedCell, evalState);
					if (protectedCells.contains(targetIs)) {
						return true;
					}
				}
			}
		}
		return false;
	}


	/**
	 *	Round original changed values from client
	 *
	 * @param evalState Evluation state 
	 *
	 * @throws PafException
	 */
	private void roundOriginalChangedValues(EvalState evalState) throws PafException {

		if (evalState.getAppDef().getAppSettings() != null && evalState.getAppDef().getAppSettings().isEnableRounding()) {
			
			double origValue = 0;
			int places = 0;
			String measure = ""; //$NON-NLS-1$
			for (Intersection is : evalState.getCurrentChangedCells()) {
				measure = is.getCoordinate(evalState.getAppDef()
						.getMdbDef().getMeasureDim());
				if (evalState.getRoundingRules().containsKey(measure)) {
					PafDataCache dataCache = evalState.getDataCache();
					origValue = dataCache.getCellValue(is);
					places = evalState.getRoundingRules().get(measure)
							.getDigits();
					dataCache.setCellValue(is, EvalUtil
							.Round(origValue, places));
				}
			}
			
		}

	}


	/**
	 *	Turn the specifed rule set into a set of formula "balance sets"
	 *
	 * @param ruleSet
	 * @return
	 */
	private Map<String, List<RuleGroup>> createBalanceSets(RuleSet ruleSet) {

		Map<String, List<RuleGroup>>balanceSets = new HashMap<String, List<RuleGroup>>(); 

		// preprocess ruleset to gather all "balance sets together into a map keyed by balance set key"
		for (RuleGroup rg : ruleSet.getRuleGroups() ) {
			if (rg.getBalanceSetKey() != null && !rg.getBalanceSetKey().trim().equals("")) { //$NON-NLS-1$
				if ( !balanceSets.containsKey(rg.getBalanceSetKey()) ) {
					balanceSets.put(rg.getBalanceSetKey(), new ArrayList<RuleGroup>());
				}
				balanceSets.get(rg.getBalanceSetKey()).add(rg);

			}
		}
		return balanceSets;
	}

}
