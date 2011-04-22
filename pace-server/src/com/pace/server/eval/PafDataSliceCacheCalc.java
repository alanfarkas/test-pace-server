/*
 *	File: @(#)PafDataSliceCacheCalc.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Feb 1, 2007  					By: AFarkas
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.SortOrder;
import com.pace.base.app.*;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.funcs.IPafFunction;
import com.pace.base.mdb.*;
import com.pace.base.rules.Formula;
import com.pace.base.rules.Rule;
import com.pace.base.rules.RuleGroup;
import com.pace.base.rules.RuleSet;
import com.pace.base.state.EvalState;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.StringUtils;
import com.pace.base.utility.TimeBalance;
import com.pace.base.view.PafViewSection;




/**
 * Manages all calculation operations against the PafDataSliceCache
 *
 * @version x.xx
 * @author AFarkas
 *
 */
public abstract class PafDataSliceCacheCalc {

	private static Logger logger = Logger.getLogger(PafDataSliceCacheCalc.class);


	/**
	 *  Allocate the changed attribute intersection to its underlying base
	 *  member intersections.
	 * 
	 * @param dsCache Data slice cache
	 * @param dsEvalState Data slice evaluation state
	 * @param uowCache Unit-of-work cache
	 * @param uowEvalState Unit-of-work evaluation state
	 * @param memberTrees Dimension trees
	 * @param changedCell A single changed attribute intersection to allocate
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	public static PafDataCache allocateAttributeCell(EvalState dsEvalState, EvalState uowEvalState, final MemberTreeSet memberTrees, Intersection changedCell) throws PafException {

		// Allocate the changed attribute cell
		Set<Intersection> changedCells = new HashSet<Intersection>();
		changedCells.add(changedCell);
		return allocateAttributeCells(dsEvalState, uowEvalState, memberTrees, changedCells);
		
	}


	/**
	 *  Allocate all changed attribute intersections, for the current
	 *  measure, to their underlying base member intersections.
	 * 
	 * @param dsCache Data slice cache
	 * @param dsEvalState Data slice evaluation state
	 * @param uowCache Unit-of-work cache
	 * @param uowEvalState Unit-of-work evaluation state
	 * @param memberTrees Dimension trees
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	public static PafDataCache allocateAttributeCells(EvalState dsEvalState, EvalState uowEvalState, final MemberTreeSet memberTrees) throws PafException {

		// Allocate all changed attribute cells
		String currentMeasure = dsEvalState.getMeasureName();
		Set<Intersection> changedCells = dsEvalState.getChangedCellsByMsr().get(currentMeasure);
		return allocateAttributeCells(dsEvalState, uowEvalState, memberTrees, changedCells);
		
	}

	/**
	 *  Allocate changed attribute intersections to their underlying base member
	 *  intersections
	 * 
	 * @param dsCache Data slice cache
	 * @param dsEvalState Data slice evaluation state
	 * @param uowCache Unit-of-work cache
	 * @param uowEvalState Unit-of-work evaluation state
	 * @param memberTrees Dimension trees
	 * @param changedCells Set of changed attribute intersections to allocate
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	public static PafDataCache allocateAttributeCells(EvalState dsEvalState, EvalState uowEvalState, final MemberTreeSet memberTrees, Set<Intersection> changedCells) throws PafException {

		PafDataCache dsCache = dsEvalState.getDataCache();
		PafDataCache uowCache = uowEvalState.getDataCache();
		Set<Intersection> dsLockedCells = dsEvalState.getCurrentLockedCells();
		Set<Intersection> uowLockedCells = uowEvalState.getCurrentLockedCells();
		Set<Intersection> sessionAllocTargets = new HashSet<Intersection>();
		String currentMeasure = dsEvalState.getMeasureName();
		Rule currentRule = dsEvalState.getRule();
		String measureDim = uowCache.getMeasureDim();
		String timeDim = uowCache.getTimeDim();
		Set<String> explodedBaseDims = null;
		boolean isNonAggregateMeasure = false;
		boolean isBaseMeasureAllocation = false;
		int places = 0;

		
		// Exit if there are no changes to process
		if (changedCells == null || changedCells.isEmpty()) {
			return uowCache;
		}

		
		// Sort changed cells so that lower level intersections are handled first
		String[] axisSeq = dsCache.getPafMVS().getViewSection().getDimensionCalcSequence();
		Intersection[] dsAllocCells = EvalUtil.sortIntersectionsByAxis(changedCells.toArray(new Intersection[0]), 
				uowEvalState.getClientState().getMemberIndexLists(), axisSeq, SortOrder.Ascending);            

		// Allocate each attribute intersection proportionally to it's underlying base 
		// intersections
		for (Intersection dsAllocCell:dsAllocCells) {

			// Reset current measure for each allocated intersection, since it's possible that we will be processing
			// locked contribution % basis intersections that are a different measure than the rule goup
			// being processed.
			currentMeasure = dsAllocCell.getCoordinate(measureDim);

			// Set exploded base dimensions depending on whether or not current measure is a non-aggregate measure.
			MeasureDef measureDef = dsEvalState.getAppDef().getMeasureDef(currentMeasure);
			if (measureDef.getType() == MeasureType.NonAggregate) {
				// Non-aggregate measure - don't allocate down base dimensions
				explodedBaseDims = null;
				isNonAggregateMeasure = true;
			} else {
				// Aggregate measure - do allocate down base dimensions
				explodedBaseDims = dsEvalState.getExplodedBaseDims();
			}
				
			// Explode attribute intersection into corresponding base intersections (at the uow foor)
			Set<Intersection> targets = getBaseIntersections(dsCache, dsAllocCell, uowCache, memberTrees, explodedBaseDims);

			// If current plan version is forward plannable, also don't allow
	        // allocation into any intersections containing protected time periods
	        Set<String> lockedTimePeriods = null;
	        String currentYear = uowCache.getCurrentYear(); 
	        String yearDim = uowCache.getYearDim();
	        if (uowEvalState.getPlanVersion().getType() == VersionType.ForwardPlannable) {
	            lockedTimePeriods = uowCache.getLockedPeriods();
	        }
	        if (lockedTimePeriods == null) {
	            lockedTimePeriods = new HashSet<String>(0);
	        }
	        

			// Calculate current sum of locked target intersections. Filter out any
	        // elapsed periods if version is forward plannable.
			double lockedTotal = 0;
			ArrayList<Intersection> lockedTargets = new ArrayList<Intersection>();
			for (Intersection target:targets) {
				if (uowLockedCells.contains(target) ||
                    (lockedTimePeriods.contains(target.getCoordinate(timeDim)) && 
                            target.getCoordinate(yearDim).equals(currentYear))  ) {
					lockedTotal += uowCache.getCellValue(target);
					lockedTargets.add(target);
				}
			}

			// Determine the amount to be allocated	as well as the base intersection 
			// target area.
			double allocTotal = dsCache.getCellValue(dsAllocCell); 
			double allocAvailable = 0;
			if (lockedTargets.size() != targets.size()) {
				
				// Normal allocation process
				if (!isNonAggregateMeasure) {
					// Aggregate measure
					allocAvailable = allocTotal - lockedTotal;
				} else {
					// Non-aggregate measure - force allocAvailable to be an amount that will cause
					// the average of all targets (locked and unlocked) to be equal to the original amount 
					// being allocated. Non-aggregate measures are not truly allocated. Instead, they
					// are replicated to all available targets.
					allocAvailable = (targets.size() * allocTotal - lockedTotal)
											/ (targets.size() - lockedTargets.size());					
				}
				targets.removeAll(lockedTargets);
				
			} else {
				
				// All target base intersections seem to be locked. Check each 
				// locked data slice cell and determine if this is a situation 
				// where only a subset of the descendants of the current allocation
				// cells are locked.
				Set<Intersection> descendantLockedTargets = new HashSet<Intersection>();
				double lockedDescendantTotal = 0;
				for (Intersection dsLockedCell: dsLockedCells) {
					
					// Ignore any base intersection locks generated by the data slice
					// cell currently being allocated.
					if (dsLockedCell.equals(dsAllocCell)) {
						continue;
					}
					
					// Ignore any base intersection locks not for the current measure
					String cellMeasure = dsLockedCell.getCoordinate(measureDim);
					if (!cellMeasure.equalsIgnoreCase(currentMeasure)) {
						continue;
					}
					
					// Add any genuine descendant base intersections to the collection
					// of locked descendant targets.
					Set<Intersection>descendantTargets = getBaseIntersections(dsCache, dsLockedCell, uowCache, memberTrees, explodedBaseDims);
					if (lockedTargets.containsAll(descendantTargets)) {
						descendantLockedTargets.addAll(descendantTargets);
					}
				}
				
				// Lock targets previously allocated in this session (TTN-1092 Test#6)
				if (descendantLockedTargets.isEmpty()) {
					for (Intersection sessionAllocTarget : sessionAllocTargets) {
						if (targets.contains(sessionAllocTarget)) {
							descendantLockedTargets.add(sessionAllocTarget);
						}
					}
				}
				
				// If there are no descendant targets or all descendant targets are locked
				if (descendantLockedTargets.size() == 0 ||
						descendantLockedTargets.size() == targets.size()) {
					// All descendants of changed cell are locked, so just spread entire
					// amount by shape of descendants
					allocAvailable = allocTotal;
				} else {
					// Only some of the descendants are locked. Remove the descendant 
					// locked targets from that set of allocation targets. Adjust available
					// allocation amount accordingly.
					for (Intersection lockedTarget:descendantLockedTargets) {
						lockedDescendantTotal += uowCache.getCellValue(lockedTarget);
					}
					if (!isNonAggregateMeasure) {
						// Aggregate measure
						allocAvailable = allocTotal - lockedDescendantTotal;
					} else {
						// Non-aggregate measure - force allocAvailable to be an amount that will cause
						// the average of all targets (locked and unlocked) to be equal to the original amount 
						// being allocated. Non-aggregate measures are not truly allocated. Instead, they
						// are replicated to all available targets.
						allocAvailable = (targets.size() * allocTotal - lockedDescendantTotal)
											/ (targets.size() - descendantLockedTargets.size());
					}
					targets.removeAll(descendantLockedTargets);
				}
				
			}

			// Calculate current sum of target intersections
			double targetTotal = 0;
			for (Intersection target:targets) {
				targetTotal += uowCache.getCellValue(target);
			}			

			// Check for base measure allocation (TTN-1171)
   			String baseAllocateMeasure = null;
   			double baseTargetTotal= 0;
 		   	if (targetTotal == 0 
		   			&& dsEvalState.getMeasureName().equals(currentMeasure) 
		   				&& currentRule.getBaseAllocateMeasure() != null
		   					&& !currentRule.getBaseAllocateMeasure().equals("")) {
		   		
		   		// Base measure allocation is enabled
		   		isBaseMeasureAllocation = true;
		   		
		        // Recalculate target total over base measure intersections
		   		baseAllocateMeasure = currentRule.getBaseAllocateMeasure();
		        for (Intersection target : targets ) {
		        	Intersection baseCellTarget = target.clone();
		        	baseCellTarget.setCoordinate(measureDim, baseAllocateMeasure);
		            baseTargetTotal+= uowCache.getCellValue(baseCellTarget);
		        }
		   	} else {
		   		// No base measure allocation
		   		isBaseMeasureAllocation = false;
		   	}

			// Allocate available amount over each base intersection
			for (Intersection target:targets) {
				double currentCellValue;
				double newCellValue;
				if (isNonAggregateMeasure) {
					// Non-aggregate measure - replicate available amount
					newCellValue = allocAvailable;
				} else if (targetTotal != 0) {
					// Proportional spread
					currentCellValue = uowCache.getCellValue(target);
					newCellValue = allocAvailable * (currentCellValue / targetTotal);
				} else  if (isBaseMeasureAllocation && baseTargetTotal != 0){
					// Base measure allocation
					Intersection baseTarget = target.clone();
					baseTarget.setCoordinate(measureDim, baseAllocateMeasure);
					currentCellValue = uowCache.getCellValue(baseTarget);
					newCellValue = allocAvailable * (currentCellValue / baseTargetTotal);					
				} else  {
					// Do an even spread if allocation base is zero
					newCellValue = allocAvailable / targets.size();
				}
				
				// Rounding
	    		if (uowEvalState.getRoundingRules().containsKey(currentMeasure)){
	    			places = uowEvalState.getRoundingRules().get(currentMeasure).getDigits();
	    			newCellValue = EvalUtil.Round(newCellValue, places);
	    			uowEvalState.getAllocatedLockedCells().add(target);
	    		}
	    		
	    		// Write new target to uow cache
				uowCache.setCellValue(target, newCellValue);

				// Add target intersection to changed and locked cells collections
				sessionAllocTargets.add(target);
				uowEvalState.addChangedCell((target));
				uowEvalState.getOrigChangedCells().add(target);
				uowEvalState.addAllocation(target);
				uowLockedCells.add(target);
				uowEvalState.getOrigLockedCells().add(target);
			}

		} // Next intersection

// The lines below commented out to support TTN-1092 Contribution % (Test #10)
//		// Remove allocated data slice cells from changed and locked cells collections
//		dsEvalState.removeAllCurrentChangedCells(Arrays.asList(dsAllocCells));
//		dsEvalState.getCurrentLockedCells().removeAll(new HashSet<Intersection>(Arrays.asList(dsAllocCells)));

		// Return updated uow cache
		return uowCache;
	}

	/**
	 *	Compute all attribute intersections. Any invalid intersections or intersections containing
	 *  version calculations or non aggregate measures, are skipped.
	 *
	 *  This is a convenience method for calcAllAttributeIntersections(dsCache, dsEvalState, uowCache, clientState, memberFilters)
	 *  where dsEvalState and memberFilters have been set to null.
	 *  
	 * @param dsCache Data slice cache
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * @param dsEvalState Data slice eval state
	 * 
	 * @return PafDataSliceCache
	 * @throws PafException 
	 */

	public static PafDataSliceCache calcAllAttributeIntersections(PafDataSliceCache dsCache, PafDataCache uowCache, PafClientState clientState) throws PafException {
		return calcAllAttributeIntersections(dsCache, null, uowCache, clientState, null);
	}

	/**
	 *	Compute all attribute intersections. Any invalid intersections or intersections containing
	 *  version calculations or non aggregate measures, are skipped.
	 *
	 *  This is a convenience method for calcAllAttributeIntersections(dsEvalState, uowCache, clientState, memberFilters)
	 *  where memberFilters has been set to null.
	 *  
	 * @param dsEvalState Data slice eval state
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * 
	 * @return PafDataSliceCache
	 * @throws PafException 
	 */

	public static PafDataSliceCache calcAllAttributeIntersections(PafDataSliceCache dsCache, PafDataCache uowCache, PafClientState clientState, EvalState dsEvalState) throws PafException {
		return calcAllAttributeIntersections(dsEvalState, uowCache, clientState, null);
	}

	/**
	 *	Compute all attribute intersections. Any invalid intersections or intersections containing
	 *  version calculations or non aggregate measures, are skipped.
	 *
	 *  This is a convenience method for calcAllAttributeIntersections(dsCache, dsEvalState, uowCache, clientState, memberFilters)
	 *  where dsEvalState has been set to null.
	 *  
	 * @param dsCache Data slice cache
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * @param memberFilters Map of member filters by dimension
	 * 
	 * @return PafDataSliceCache
	 * @throws PafException 
	 */
	public static PafDataSliceCache calcAllAttributeIntersections(PafDataSliceCache dsCache, PafDataCache uowCache, PafClientState clientState, Map<String, List<String>> memberFilters) throws PafException {
		return calcAllAttributeIntersections(dsCache, null, uowCache, clientState, memberFilters);
	}

	/**
	 *	Compute all attribute intersections. Any invalid intersections or intersections
	 *  containing version calculations are skipped. 
	 *  
	 *  This is a convenience method for calcAllAttributeIntersections(dsCache, dsEvalState, uowCache, clientState, memberFilters).
	 *
	 * @param dsEvalState Data slice eval state
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * @param memberFilters Map of member filters by dimension
	 * 
	 * @return PafDataSliceCache
	 * @throws PafException 
	 */

	public static PafDataSliceCache calcAllAttributeIntersections(EvalState dsEvalState, PafDataCache uowCache, PafClientState clientState, Map<String, List<String>> memberFilters) throws PafException {
		PafDataSliceCache dsCache = (PafDataSliceCache) dsEvalState.getDataCache();
		return calcAllAttributeIntersections(dsCache, dsEvalState, uowCache, clientState, memberFilters);
	}
	
	/**
	 *	Compute all attribute intersections. Any invalid intersections or intersections
	 *  containing version calculations are skipped.
	 *
	 * @param dsCache Data slice cache
	 * @param dsEvalState Data slice eval state
	 * @param uowCache Unit-of-work cache
	 * @param clientState Client state object
	 * @param memberFilters Map of member filters by dimension
	 * 
	 * @return PafDataSliceCache
	 * @throws PafException 
	 */

	public static PafDataSliceCache calcAllAttributeIntersections(PafDataSliceCache dsCache, EvalState dsEvalState, PafDataCache uowCache, PafClientState clientState, Map<String, List<String>> memberFilters) throws PafException {

		String[] dimensions = dsCache.getAllDimensions();
		PafViewSection viewSection = dsCache.getPafMVS().getViewSection();
		Set<Intersection> invalidIs = viewSection.invalidAttrIntersections();
		Map<String, Set<Intersection>> recalcIsByMsr = new HashMap<String, Set<Intersection>>();
		MemberTreeSet memberTrees = clientState.getUowTrees();
		RuleSet ruleSet = clientState.getCurrentMsrRuleset();

		// Iterate through all data slice intersections
		PafIntersectionIterator cacheIterator = dsCache.getDataCellIterator(memberFilters);
		while(cacheIterator.hasNext()) {

			// Get next intersection
			String[] coordinates = dsCache.indexToMembers(cacheIterator.getNext());
			Intersection dsIntersection = new Intersection(dimensions, coordinates);

			// Skip any invalid intersections
			if (invalidIs.contains(dsIntersection)) {
				continue;
			}

			// Skip any locked intersections
			if (dsEvalState != null && dsEvalState.getCurrentLockedCells().contains(dsIntersection)) {
				continue;
			}

			// Skip derived versions in case they're not included in member filters
			String version = dsIntersection.getCoordinate(dsCache.getVersionDim());
			VersionDef versionDef = dsCache.getVersionDef(version);
			if (PafBaseConstants.DERIVED_VERSION_TYPE_LIST.contains(versionDef.getType())) {
				continue;
			}

			// Build recalc intersections into map based upon measure, for later processing
			String measure = dsIntersection.getCoordinate(dsCache.getMeasureDim());
			MeasureDef measureDef = dsCache.getMeasureDef(measure);
			if (measureDef.getType() == MeasureType.Recalc ) {
				if (!recalcIsByMsr.containsKey(measure)) recalcIsByMsr.put(measure, new HashSet<Intersection>());
				recalcIsByMsr.get(measure).add(dsIntersection);
				continue;
			}

			// Calculate Attribute Intersection
			double cellValue = calcAttributeIntersection (dsCache, dsIntersection, measureDef.getType(), memberTrees, uowCache);			
			dsCache.setCellValue(cacheIterator.getValue(), cellValue);
		}


		// 2nd pass to do recalcs. Dependent on aggregates being calculated, and processing 
		// recalc measures in rulegroup sequence, so that dependent recalcs are also processed
		if (!recalcIsByMsr.isEmpty()) {
			for (RuleGroup rg : ruleSet.getRuleGroups()) {
				for (Rule r : rg.getRules()) {
					// if ruleset measure is in list, then it's by definition a recalc
					// and should be processed at this point in time.
					String msrName = r.getFormula().getResultMeasure();
					if (recalcIsByMsr.containsKey(msrName)) {
						// iterate over intersections, calculating them
						for (Intersection is : recalcIsByMsr.get(msrName)) {
							evalFormula(r.getFormula(),
									dsCache.getMeasureDim(), is, dsCache,
									new EvalState(null, clientState, dsCache));
						}
					}
				}
			}
		}

		// Return updated data slice cache
		return dsCache;
	}


	// I'm dumping a copy of this method here for now...
	// arguably this much business logic should be up in the server
	private static void evalFormula(Formula formula, String axis,  Intersection srcIs, Intersection targetIs,  PafDataCache dataCache, EvalState evalState) throws PafException {

		// get formula terms
		String[] terms = formula.getExpressionTerms();
		boolean[] funcFlags = formula.getFunctionTermFlags();
		double[] values = new double[terms.length];
		IPafFunction function = null;

		//lookup each term
		for (int i = 0; i < terms.length; i++) {
			// funcflags indicate a complex function that must be evaluated differently
			if (funcFlags[i]) {
				function = formula.extractFunctionTerms()[i];
				values[i] = function.calculate(srcIs, dataCache, evalState );
			}
			else {
				Intersection isTerm = srcIs.clone();
				isTerm.setCoordinate(axis, terms[i].trim());
				values[i] = dataCache.getCellValue(isTerm);
			}
		}

		double result = formula.evaluate(values);

		// check for division by 0 wich returns positive infinity, set to 0
		if ( Double.isInfinite(result) || Double.isNaN(result) )
			result = 0;

		// update value in dataCache
		dataCache.setCellValue(targetIs, result);

	}

	// convenience method for above function
	private static void evalFormula(Formula formula, String axis, Intersection calcIs, PafDataCache dataCache, EvalState evalState) throws PafException {
		evalFormula(formula, axis, calcIs, calcIs, dataCache, evalState);        
	}	


	/**
	 *	Calculate a specific attribute intersection
	 *
	 * @param dsCache Data slice cache
	 * @param dsIntersection Data slice cache intersection
	 * @param measureType Measure type of intersection being calculated
	 * @param memberTrees Collection of attribute and base trees corresponding to uow
	 * @param uowCache Unit-of-work cache
	 * 
	 * @return Intersection total (double)
	 * @throws PafException 
	 */
	public static double calcAttributeIntersection(final PafDataSliceCache dsCache, final Intersection dsIntersection, final MeasureType measureType, final MemberTreeSet memberTrees, final PafDataCache uowCache) throws PafException {

		// Explode attribute intersection into corresponding base intersections
		PafIntersectionIterator uowCacheIterator = explodeAttributeIntersection(dsCache, dsIntersection, uowCache, memberTrees);

		// Return 0 if no intersections were found
		if (uowCacheIterator == null) {
			return 0;
		}

		// Aggregate descendant member intersection values located in uow cache
		double total = 0;
		int cellCount = 0;
		while(uowCacheIterator.hasNext()) {
			int[] cellIndex = uowCacheIterator.getNext();
			double cellValue = uowCache.getCellValue(cellIndex);
			total += cellValue;
			cellCount++;
		}

		// Calculate the appropriate results based on the intersection measure type
		double result = 0;
		if (measureType != MeasureType.NonAggregate) {
			//For aggregate members, simply return total
			result = total;
		} else {
			// Non-aggregate measure - return average
			result = total / cellCount;
		}


		// Return result
		return result;

	}

	/**
	 *	Return an iterator that will generate the corresponding base intersections
	 *  for the specified attribute intersection.
	 * 
	 *  This is a convenience method for explodeAttributeIntersection(dsCache, dsIntersection,
	 *  uowCache, memberTrees, explodedBaseDims) where explodedBaseDims has been set to an empty set.
	 *    
	 *  If there are no corresponding base intersections, then null is returned.
	 *
	 * @param dsCache Data slice cache
	 * @param dsIntersection Data slice cache intersection
	 * @param memberTrees Collection of attribute and base trees corresponding to uow
	 * 
	 * @return PafIntersectionIterator
	 * @throws PafException 
	 */
	private static PafIntersectionIterator explodeAttributeIntersection(PafDataCache dsCache, final Intersection dsIntersection, 
			final PafDataCache uowCache, final MemberTreeSet memberTrees) {
		return explodeAttributeIntersection(dsCache, dsIntersection, uowCache, memberTrees, new HashSet<String>());
	}

	/**
	 *	Return an iterator that will generate the corresponding base intersections
	 *  for the specifed attribute intersection.
	 *  
	 *  If there are no corresponding base intersections, then null is returned.
	 *
	 * @param dsCache Data slice cache
	 * @param dsIntersection Data slice cache intersection
	 * @param memberTrees Collection of attribute and base trees corresponding to uow
	 * @param explodedBaseDims Indicates that intersections should be exploded to the floor of each base dimension 
	 * 
	 * @return PafIntersectionIterator
	 * @throws PafException 
	 */
	private static PafIntersectionIterator explodeAttributeIntersection(PafDataCache dsCache, final Intersection dsIntersection, 
			final PafDataCache uowCache, final MemberTreeSet memberTrees, final Set<String> explodedBaseDims) {

		String[] baseDimensions = uowCache.getAllDimensions();
		int baseDimCount = baseDimensions.length;
		Map <String, List<String>> memberFilters = new HashMap<String, List<String>>();
		Set<String> viewAttributes = new HashSet<String>();
        TimeBalance tb = TimeBalance.None;

		// Initialize time balance attribute for the measure in the dsCache intersection
		MeasureDef measureDef = dsCache.getMeasureDef(dsIntersection.getCoordinate(dsCache.getMeasureDim()));                
		if (measureDef == null || measureDef.getType() != MeasureType.Recalc ) { 
			if (measureDef ==null)
				tb = TimeBalance.None;
			else if (measureDef.getType() == MeasureType.TimeBalFirst)
				tb = TimeBalance.First;
			else if (measureDef.getType() == MeasureType.TimeBalLast)
				tb = TimeBalance.Last;
			else
				tb = TimeBalance.None;
		}

		// Iterate through each base dimension in each attribute intersection and create
		// the list of corresponding base members in the uow cache. For base dimensions
		// without any corresonding attribute dimensions the current member is returned,
		// unless isBaseDimExploed is set to true. In which case, the floor base members 
		// are returned.
		PafDataSliceCache dataSliceCache = (PafDataSliceCache) dsCache;
		viewAttributes.addAll(Arrays.asList(dataSliceCache.getAttributeDims()));
		for (int axisInx = 0; axisInx < baseDimCount; axisInx++) {

			// Get current base tree and current base member
			String baseDimension = baseDimensions[axisInx];
			PafBaseTree pafBaseTree = (PafBaseTree) memberTrees.getTree(baseDimension);
			String baseMember = dsIntersection.getCoordinate(baseDimension);

			// Get associated attribute dim names
			Set<String> assocAttributes = new HashSet<String>();
			assocAttributes.addAll(pafBaseTree.getAttributeDimNames());

			// Does this base dimension have any associated attributes on view section?
			assocAttributes.retainAll(viewAttributes);
			if (assocAttributes.size() > 0) {
				
				// Yes - Add list of component base members to member filter
				List<String> memberList = getComponentBaseMembers(dsCache, baseDimension, assocAttributes, dsIntersection, memberTrees);
				if (memberList.size() == 0) {
					// No members were returned - this must be an invalid intersection - just return null
					return null;
				}
				// Convert set of component base members to a list and add to member filter
				// hash map.
				memberFilters.put(baseDimension, memberList);
				
			} else {

				// No attribute dimensions
				List<String> memberList = new ArrayList<String>();
				if (explodedBaseDims != null && explodedBaseDims.contains(baseDimension)) {
					// Base dimension explosion - just pick lowest level descendants under member
					List<PafDimMember> floorMembers = pafBaseTree.getLowestMembers(baseMember);
					// Logic for member list is different for time dimension
					if (!baseDimension.equals(uowCache.getTimeDim()) || tb == TimeBalance.None) {
						// If not time dimension or time balance none measure just add floor members
						for (PafDimMember floorMember : floorMembers) {
							memberList.add(floorMember.getKey());
						}
					} else if (tb == TimeBalance.First) {
						// Time balance first - add first floor descendant
						memberList.add(floorMembers.get(0).getKey());
					} else if (tb == TimeBalance.Last) {
						// Time balance last - add last descendant
						memberList.add(floorMembers.get(floorMembers.size() - 1).getKey());
					}
				} else {
					// No base dimension explosion - just add current base member to filter
					memberList.add(baseMember);
				}	
				
				// Add selected floor members to member filter
				//TODO use exiting floor utility since it handles elapsed periods, etc.
				memberFilters.put(baseDimension, memberList);
			}	
		}

		// Return iterator
		PafIntersectionIterator uowCacheIterator = uowCache.getDataCellIterator(memberFilters);
		return uowCacheIterator;
	}


	/**
	 *	Return the list of base members that will aggregate to the specified intersection
	 *  for the specified base dimension. Component base member lists are added to a 
	 *  collection so that they can be quickly recalled for future processing.
	 *
	 * @param dsCache Data slice cache
	 * @param baseDimension Base dimension
	 * @param attrDimensions Associated attribute dimensions
	 * @param dsIntersection Data slice cache intersection
	 * @param memberTrees Set of attribute and base member trees
	 * 
	 * @return List<String>
	 */
	private static List<String> getComponentBaseMembers(PafDataCache dsCache, final String baseDimension, final Set<String> attrDimensions, 
			final Intersection dsIntersection, final MemberTreeSet memberTrees) {


		// Initialization
		List<String> componentMembers = null;
		Set<String> validBaseMembers = new HashSet<String>();
		PafBaseTree baseTree = (PafBaseTree) memberTrees.getTree(baseDimension);
		PafDataSliceCache dataSliceCache = (PafDataSliceCache) dsCache;
		String baseMember = dsIntersection.getCoordinate(baseDimension);		

		// Create an intersection containing the base member and it's associated attributes
		// in the view section
		int memberIsDimCount = attrDimensions.size() + 1;
		String[] baseMemberDims = new String[memberIsDimCount];
		String[] baseMemberCoords = new String[memberIsDimCount];
		int i = 0;
		for (String dsDimension:dsIntersection.getDimensions()) {
			if (baseDimension.equalsIgnoreCase(dsDimension) || attrDimensions.contains(dsDimension)) {
				baseMemberDims[i] = dsDimension;
				baseMemberCoords[i] = dsIntersection.getCoordinate(dsDimension);
				i++;
			}
		}
		Intersection baseMemberIs = new Intersection(baseMemberDims, baseMemberCoords);

		// Return pre-tabulated compoment member list, if it exists
		componentMembers = dataSliceCache.getComponentBaseMembers(baseMemberIs);
		if (!componentMembers.isEmpty()) {
			return componentMembers;
		}

		// Find the intersection of associated base members for each attribute dimension
		// in the data slice cache intersection
		for (String attrDimension:attrDimensions) {

			// Get associated base member names of current attribute
			String attrMember = dsIntersection.getCoordinate(attrDimension);
			PafAttributeTree attrTree = (PafAttributeTree) memberTrees.getTree(attrDimension);
			Set<String> associatedBaseMembers =  attrTree.getBaseMemberNames(attrMember);

			// If there are no base members then return empty set since this must be
			// an invalid intersection of a base member with one or more attributes
			if (associatedBaseMembers.isEmpty()) {
				return new ArrayList<String>();
			}

			// If 1st time through loop then initialize existing base members set
			if (validBaseMembers.isEmpty()) {
				validBaseMembers.addAll(associatedBaseMembers);
			}

			// Get intersection of base members associated with each processed attribute
			validBaseMembers.retainAll(associatedBaseMembers);

		}

		// Get base member descendants at attribute mapping level. It is assumed that
		// all attribute dimensions on the view are mapped to the same level within
		// a given base dimension.
		int mappingLevel = baseTree.getAttributeMappingLevel((String)attrDimensions.toArray()[0]);
		List<PafDimMember> dimMembers = baseTree.getMembersAtLevel(baseMember, (short) mappingLevel);
		Set<String> intersectionDescendants = new HashSet<String>();
		for (PafDimMember dimMember:dimMembers) {
			intersectionDescendants.add(dimMember.getKey());
		}

		// Filter list of poential valid base members against relevant base members for intersection
		validBaseMembers.retainAll(intersectionDescendants);
		componentMembers.addAll(validBaseMembers);

		// Add component base members to collection for future use
		dataSliceCache.addComponentBaseMembers(baseMemberIs, componentMembers);
		dsCache = dataSliceCache;
		

		// Return component base members
		return componentMembers;
	}


	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. This is convenience method for
	 *  getBaseIntersections(dsCache, attrIntersections, memberTrees, explodedBaseDims) 
	 *  where isBaseDimExploded is set to an empty set.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Set of attribute intersections
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Set<Intersection> attrIntersections, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees) throws PafException {
		
		return getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, new HashSet<String>());
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, explodedBaseDims, 
	 *  isInvalidIntersectionIgnore) where isInvalidIntersectionIgnored is set to false.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Set of attribute intersections
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The set of base dimensions to be exploded during the conversion process
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Set<Intersection> attrIntersections, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) throws PafException {
		
		return getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, explodedBaseDims, false);
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dsCache, attrIntersections, memberTrees, 
	 *  explodedBaseDims) where attrIntersections is converted into an array of intersections.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Set of attribute intersections
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The set of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Set<Intersection> attrIntersections, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims, boolean isInvalidIntersectionIgnored) throws PafException {
		
		return getBaseIntersections(dsCache, attrIntersections.toArray(new Intersection[0]), uowCache, memberTrees, explodedBaseDims, isInvalidIntersectionIgnored);
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersection
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dsCache, attrIntersections, memberTrees, explodedBaseDims) 
	 *  where explodedBaseDims is set to an empty set.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Attribute intersection
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * 
	 * @return Set<Intersection>[]
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Intersection attrIntersection, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees) throws PafException {

		return getBaseIntersections(dsCache, attrIntersection, uowCache, memberTrees, new HashSet<String>());
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersection
	 *  in the associated uow cache. 
	 *  
	 *  This is convenience method for getBaseIntersections(dsCache, attrIntersections, memberTrees) 
	 *  where attrIntersection is converted into an array of intersections.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Attribute intersection
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * 
	 * @return Set<Intersection>[]
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Intersection attrIntersection, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) throws PafException {

		Intersection[] attrIntersections = new Intersection[1];
		attrIntersections[0] = attrIntersection;
		return getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, explodedBaseDims);
	}

	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache.
	 *
	 *  This is convenience method for getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, 
	 *  explodedBaseDims, isInvalidIntersectionIgnored) where isInvalidIntersection is set to false.
	 *  
	 * @param dsCache Data slice cache
	 * @param attrIntersections Array of attribute intersections
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Intersection[] attrIntersections, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims) throws PafException {

		return getBaseIntersections(dsCache, attrIntersections, uowCache, memberTrees, explodedBaseDims, false);
	}
	
	/**
	 *	Get the base intersections corresponding to the specified attribute intersections
	 *  in the associated uow cache.
	 *
	 * @param dsCache Data slice cache
	 * @param attrIntersections Array of attribute intersections
	 * @param uowCache Uow cache
	 * @param memberTrees Collection of member trees corresponding to uow cache 
	 * @param explodedBaseDims The list of base dimensions to be exploded during the conversion process
	 * @param isInvalidIntersectionIgnored Indicates that any invalid intersections should be ignored 
	 * 
	 * @return Set<Intersection>
	 * @throws PafException 
	 */
	public static Set<Intersection> getBaseIntersections(PafDataCache dsCache, final Intersection[] attrIntersections, final PafDataCache uowCache, 
			final MemberTreeSet memberTrees, Set<String> explodedBaseDims, boolean isInvalidIntersectionIgnored) throws PafException {

		// Intialization
		int[] cellIndex = null;
		String[] baseDims = uowCache.getAllDimensions();
		Set<Intersection> convertedIntersections = new HashSet<Intersection>();


		// Convert all intersections
		for (Intersection attrIs: attrIntersections) {

			// Explode attribute intersection into corresponding base intersections
			PafIntersectionIterator baseIsIterator = explodeAttributeIntersection(dsCache, attrIs, uowCache, memberTrees, explodedBaseDims);

			// Check for invalid attribute intersection
			if (baseIsIterator != null) {
				
				// Valid intersection - generate base intersections and add to collection
				while(baseIsIterator.hasNext()) {
					cellIndex = baseIsIterator.getNext();
					String[] baseCoords = uowCache.indexToMembers(cellIndex);
					Intersection baseIs = new Intersection(baseDims, baseCoords);
					convertedIntersections.add(baseIs);
				}
				
			} else if (!isInvalidIntersectionIgnored) {
				// Invalid intersection - throw exception if invalid intersections are not being ignored
				String errMsg = "Unable to get base intersections for invalid attribute intersection: " + attrIs.toString();
				logger.error(errMsg);
				throw new IllegalArgumentException(errMsg);
			}

		}

		// Return converted intersections
		return convertedIntersections;
	}


	/**
	 *	Calculate version dimension. This method is a convenvience method that calls
	 *  calcVersionDim(dataCache, null).
	 *
	 * @param dataCache Paf data cache object
	 * @param memberTrees Collection of member trees
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache calcVersionDim(PafDataCache dataCache, MemberTreeSet memberTrees) throws PafException {
		return calcVersionDim(dataCache, new HashMap<String, List<String>>(), memberTrees); 	
	}

	/**
	 *	Calculate version dimension
	 *
	 * @param dataCache Paf data cache object
	 * @param originalMemberFilters Map of member lists, by dimension, that can be used to narrow the focus of the calculation process
	 * @param memberTrees Collection of member trees
	 * 
	 * @return Paf data cache object
	 * @throws PafException 
	 */
	public static PafDataCache calcVersionDim(PafDataCache dataCache, final Map<String, List<String>> originalMemberFilters, MemberTreeSet memberTrees) throws PafException {

		int axisCount = dataCache.getAxisCount(), compareDimCount = 0, dimCount = 0;
		int baseVersionIndex = 0, compareVersionIndex = 0;
		int measureAxis = dataCache.getMeasureAxis(), versionAxis = dataCache.getVersionAxis(); 
		int yearAxis = dataCache.getYearAxis();
		int[] cellIndex = new int[axisCount], compareAxisIndexes = null, dimIndexes = null, dimIntersection = null;
		long calcStart = 0, calcEnd = 0;
		String timeDim = dataCache.getTimeDim(), versionDim = dataCache.getVersionDim();
		String yearDim = dataCache.getYearDim();
		String[] compareDims = null, compareMemberSpecs = null;
		List<String> timeFilter = null, versionFilter = null, yearFilter = null, years = null;
		Map<String, List<String>> memberFilters = null;
		Map<String, VersionFormula> versionMap = null;
		PafDimTree[] compareDimTrees = null;
		PafIntersectionIterator dimIntersections = null;
		VersionVarianceType varianceType = null;


		logger.info("Calculating dimension [" + versionDim + "]");
		calcStart =  System.currentTimeMillis();


		// Process any existing member filters
		if (originalMemberFilters != null && originalMemberFilters.size() > 0){
			// Enter a list of filtered dimensions into the log
			String dimList = "";
			for (String dimension:originalMemberFilters.keySet()) {
				dimList = dimList + " [" + dimension + "],"; 
			}   		
			dimList = dimList.substring(1, dimList.length() - 1);
			logger.info("Calculation filters have been specified on the following dimensions: " + dimList); 		

			// Look for filters on specific required dimensions
			timeFilter = originalMemberFilters.get(timeDim); 
			versionFilter = originalMemberFilters.get(versionDim);
			yearFilter = originalMemberFilters.get(yearDim);

			// Validate calculation filters
			dataCache.validateMemberFilters(originalMemberFilters);

		}

		// Add filter for the Version dimension if it doesn't already
		// have a filter on it.
		if (versionFilter == null) {
			// Add all derived versions in data cache
			versionMap = new HashMap<String, VersionFormula>();
			List<VersionDef> versionDefs = dataCache.getDerivedVersionDefs();
			for (VersionDef vd:versionDefs) {
				versionMap.put(vd.getName(), vd.getVersionFormula());   										
			}

			// Exit if no derived versions were found
			if (versionMap.size() == 0) {
				logger.warn("Version calculation cancelled - no derived versions were found");
				return dataCache;
			}
		} else {
			// Version filter specified - create a collection of the corresponding derived version definition objects
			versionMap = new HashMap<String, VersionFormula>();
			for (String version:versionFilter){
				VersionDef versionDef = dataCache.getVersionDef(version);
				VersionType versionType = versionDef.getType();
				if (PafBaseConstants.DERIVED_VERSION_TYPE_LIST.contains(versionType)) {
					versionMap.put(version, dataCache.getVersionDef(version).getVersionFormula());   										
				}
			}

			// Check if any derived exist - If not, then exit since there is nothing to do
			if (versionMap.size() == 0) {
				logger.warn("Version calculation cancelled - no derived versions found");
				return dataCache;
			}    		

		}    	  
		logger.info("The following version members will be calculated: " + StringUtils.arrayToString(versionMap.keySet().toArray()));

		// Create the list of years to iterate
		if (yearFilter == null) {
			// No filter, use all year members in data cache
			years = Arrays.asList(dataCache.getDimMembers(yearDim));
		} else {
			// Use supplied filter
			years = yearFilter;
		}


		// Create an array containing the axis index of each dimension to iterate through.
		// This array will be used to initialize the intersection iterator. The Version and 
		// Year dimensions each have an explicit loop in this calculation process and 
		// therefore are not included in the iterator.
		dimCount = axisCount - 2;
		dimIndexes = new int [dimCount];
		int dimIndex = 0;
		for (int axisIndex = 0; axisIndex < axisCount; axisIndex++) {
			if (axisIndex != versionAxis && axisIndex != yearAxis) { 
				if (dimIndex > dimCount) { 
					// Index out of bounds issue - throw NoSuchElementException
					String errMsg = "Index out of bounds error encountered when adding item to [dimIndexes] array";
					logger.error(errMsg);
					NoSuchElementException nse = new NoSuchElementException(errMsg);
					throw nse;
				}		
				dimIndexes[dimIndex] = axisIndex;
				dimIndex ++;
			}
		}


		// Main calculation process - Calculate the Version dimension across all 
		// other dimensions
		logger.info("Starting main calcuation process for dimension [" + versionDim + "]....");
		try {
			// Cycle through years
			for (String year:years){
				// Update cell index for selected Year
				int yearMemberIndex = dataCache.getMemberIndex(year, yearAxis);
				cellIndex[yearAxis] = yearMemberIndex;

				// Cycle through versions and corresponding formula objects
				for (Map.Entry<String, VersionFormula> versionEntry:versionMap.entrySet()) {
					String version = versionEntry.getKey();
					VersionType versionType = dataCache.getVersionType(version);
					logger.debug("Calculating: Year [ " + year + "] - Version [" + version + "]"); 

					// Update cell index for selected Version
					int versionMemberIndex = dataCache.getMemberIndex(version, versionAxis);
					cellIndex[versionAxis] = versionMemberIndex;
					
					// Get formula components needed for calculating all intersection of selected
					// version. It's much more efficient to do this once per version, instead
					// of once per calculated intersection.
					VersionFormula formula = versionMap.get(version);
					switch (versionType) {
					case ContribPct:
						baseVersionIndex = dataCache.getMemberIndex(formula.getBaseVersion(), versionAxis);
						compareDims = formula.getCompareIsDims();
						compareDimCount = compareDims.length;
						compareMemberSpecs = formula.getCompareIsMembers();
						compareAxisIndexes = new int[compareDimCount];
						compareDimTrees = new PafDimTree[compareDimCount];
						for (int i = 0; i < compareDimCount; i++) {
							String dim = compareDims[i];
							compareAxisIndexes[i] = dataCache.getAxisIndex(dim);
							compareDimTrees[i] = memberTrees.getTree(dim);
						}
						break;
					case Variance:
						baseVersionIndex = dataCache.getMemberIndex(formula.getBaseVersion(), versionAxis);
						compareVersionIndex = dataCache.getMemberIndex(formula.getCompareVersion(), versionAxis);
						varianceType = formula.getVarianceType();
						break;
					}

					// If no time filter is supplied, determine whether any periods need to be locked
					if (timeFilter == null) {

//						THE FOLLOWING LOGIC HAS BEEN COMMENTED OUT, AS VARIANCE VERSIONS ARE NO
//						LONGER BEING STORED IN ESSBASE. VARIANCE VERSIONS NOW NEED TO BE CALCULATED
//						ON LOCKED PERIODS AS WELL (AF - 02/27/06).

//						// Get list of open periods for iterator
//						List<String> openPeriods = dataCache.getOpenPeriods(version, year);

//						// If necessary, create an iteration filter on the Time dimension
//						if (openPeriods.size() != periods.length) {
//						memberFilters = new HashMap<String, List<String>>();
//						memberFilters.put(timeDim, openPeriods);
//						logger.debug("Protecting locked periods on dimension [" + timeDim +"]");  
//						}
					} else {
						// Use supplied time filter
						memberFilters = new HashMap<String, List<String>>();
						memberFilters.put(timeDim, timeFilter);
					}

					// Update member filter map as needed with passed-in filters- ignoring filters on Version, 
					// Year, and Time dimension. If no passed-in filters can be found, then leave filter map 
					// in it's current state.
					if (originalMemberFilters != null) {
						for (String dimension:originalMemberFilters.keySet()) {
							if (dimension != yearDim && dimension != versionDim) {
								if (memberFilters == null) {
									memberFilters = new HashMap<String, List<String>>();
								}
								memberFilters.put(dimension, originalMemberFilters.get(dimension));
							}
						}
					}

					// Initialize intersection iterator
					dimIntersections = new PafIntersectionIterator(dimIndexes, dataCache, memberFilters);

					// Calculate version - cycle through each dimension intersection for current Year and Version
					while (dimIntersections.hasNext()) {

						// Get next dimension intersection
						dimIntersection = dimIntersections.getNext();

						// Calculate version formula on curent cell
						cellIndex = dataCache.updateCellIndex(cellIndex, dimIndexes, dimIntersection);
						double cellValue;
						switch (versionType) {
						case ContribPct:
							cellValue = calcContribPct(baseVersionIndex, compareMemberSpecs, compareAxisIndexes, compareDimTrees, cellIndex, dataCache, versionAxis);
							break;
						case Variance:
							cellValue = calcVariance(baseVersionIndex, compareVersionIndex, varianceType, dataCache, cellIndex, measureAxis, versionAxis);
							break;
						default:
							// Invalid versionType - throw IllegalArgumentException
							String errMsg = "calcVersion error - invalid version type of ["
								+ versionType.toString() + "] found on version [" + version + "]";
						logger.error(errMsg);
						IllegalArgumentException iae = new IllegalArgumentException(errMsg);
						throw iae;
						}

						// Store results in data cache
						dataCache.setCellValue(cellIndex, cellValue);	
					}

					// Reset the dimension intersection iterator
					dimIntersections.reset();
				}     			
			}

		} catch (PafException pfe) {
			// throw Paf Exception
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

		// Return calculated data cache
		calcEnd = System.currentTimeMillis();
		float calcElapsed = (float)(calcEnd - calcStart) / 1000;
		DecimalFormat decimalFormat = new DecimalFormat("[#,##0.00]");
		String formattedTime = decimalFormat.format(calcElapsed);
		logger.info("Variance calculations completed in: " + formattedTime + " seconds") ;
		return dataCache;
	}


	/**
	 *	Calculate the "version" dimension across the data set represented in a 
	 *  view section, as defined by the view sections corresponding data slice parms
	 *
	 * @param dataCache Paf Data Cache
	 * @param dataSliceParms Data Slice definition corresponding to a selected view section
	 * @param memberTrees Collection of member trees
	 *
	 * @return Updated Paf Data Cache
	 * @throws PafException 
	 */
	public static PafDataCache calcVersionDim(PafDataCache dataCache, PafDataSliceParms dataSliceParms, MemberTreeSet memberTrees) throws PafException {

		String colDimensions[] = dataSliceParms.getColDimensions();
		String pageDimensions[] = dataSliceParms.getPageDimensions();
		String pageMembers[] = dataSliceParms.getPageMembers();
		String rowDimensions[] = dataSliceParms.getRowDimensions();
		String colTuples[][] = dataSliceParms.getColTuples();
		String rowTuples[][] = dataSliceParms.getRowTuples();
		Map <String, List<String>> memberFilters = new HashMap<String, List<String>>();


		// Add page dimension filter. Each page dimension has just one member assigned to it.
		for (int dimInx = 0; dimInx < pageDimensions.length; dimInx++) {
			List<String> members = new ArrayList<String>();
			members.add(pageMembers[dimInx]);
			memberFilters.put(pageDimensions[dimInx], members);
		}

		// Loop through each row dimension and get a master list of row members by dimension
		for (int dimInx = 0; dimInx < rowDimensions.length; dimInx++) {
			List<String> members = new ArrayList<String>();
			for (String[] tuple:rowTuples) {
				String member = tuple[dimInx];
				if (!members.contains(member)) {
					members.add(member);					
				}
			}
			memberFilters.put(rowDimensions[dimInx], members);
		}

		// Loop through each column dimension and get a master list of column members by dimension
		for (int dimInx = 0; dimInx < colDimensions.length; dimInx++) {
			List<String> members = new ArrayList<String>();
			for (String[] tuple:colTuples) {
				String member = tuple[dimInx];
				if (!members.contains(member)) {
					members.add(member);					
				}
			}
			memberFilters.put(colDimensions[dimInx], members);
		}

		// Calculate version dimension using just built member filters
		calcVersionDim(dataCache, memberFilters, memberTrees);					

		// Return updated data cache
		return dataCache;

	}


	/**
	 *	Calculate variance version
	 *
	 * @param baseVersionIndex Member index of base version
	 * @param compareVersionIndex Member index of compare version
	 * @param varianceType Version variance Type
	 * @param cellIndex Cell index corresponding to value being calculated
	 * @param dataCache Paf data cache object
	 * @param measureAxis Axis of measure dimension
	 * @param versionAxis Axis of version dimension
	 * 
	 * @return Calculated cell value
	 * @throws PafException 
	 */
	private static double calcVariance(int baseVersionIndex, int compareVersionIndex, VersionVarianceType varianceType, PafDataCache dataCache, int[] cellIndex, int measureAxis, int versionAxis) throws PafException {

		double baseValue = 0, calcedVariance = 0, compareValue = 0, simpleVariance = 0;
		int[] memberCellIndex = new int[cellIndex.length];
		String measure = null;
		MeasureDef measureDef = null;
		VarRptgFlag varRptgFlag = null;


		// Get cell values for version formula components
		System.arraycopy(cellIndex, 0, memberCellIndex, 0, cellIndex.length);
		// --- Base Value
		memberCellIndex[versionAxis] = baseVersionIndex;
		baseValue = dataCache.getCellValue(memberCellIndex);
		// --- Compare Value
		memberCellIndex[versionAxis] = compareVersionIndex;
		compareValue = dataCache.getCellValue(memberCellIndex);

//		/ --- 3/17/06 - Temporary Workaround for measures not defined in measures.xml is listed below

		// Get Variance Reporting Flag for selected measure
		int measureIndex = cellIndex[measureAxis];
		measure = dataCache.getDimMember(measureAxis, measureIndex);
		try {
			measureDef = dataCache.getMeasureDef(measure);
			varRptgFlag = measureDef.getVarRptgFlag();
		} catch (RuntimeException e) {
			// No Measure Def found for selected measure - use default value of Revenue Reporting Flag
			varRptgFlag = VarRptgFlag.RevenueReporting;
		}


//		/ --- O R I G I N A L   C O D E

//		// Get Variance Reporting Flag for selected measure
//		int measureIndex = cellIndex[measureAxis];
//		measure = dataCache.getDimMember(measureAxis, measureIndex);
//		measureDef = dataCache.getMeasureDef(measure);
//		varRptgFlag = measureDef.getVarRptgFlag();



		// Calculate simple variance based on variance reporting flag on measure
		if (varRptgFlag == VarRptgFlag.RevenueReporting) {
			simpleVariance = baseValue - compareValue;
		} else {
			simpleVariance = compareValue - baseValue;
		}

		// Return a simple variance or percent variance based on variance type
		if (varianceType == VersionVarianceType.SimpleVariance) {
			calcedVariance = simpleVariance;
		} else {
			// Return percent variance
			if (baseValue == 0 && compareValue == 0) {
				// If both base and compare value are zero, then set the  pct variance to zero
				calcedVariance = 0;
			} else if (compareValue == 0) {
				// If just the compare value is zero, then pct variance = base value / abs(base value)	
				calcedVariance = baseValue / Math.abs(baseValue);
			} else {
				// Else, pct variance = simple variance / abs(compare value)
				calcedVariance = (simpleVariance / Math.abs(compareValue));
			}
		}

		// Return calcualted variance
		return calcedVariance;
	}


	/**
	 *	Calculate contribution percent version
	 *
	 * @param version Version dimension member
	 * @param cellIndex Cell index corresponding to value being calculated
	 * @param dataCache Paf data cache object
	 * 
	 * @return Calculated cell value
	 * @throws PafException 
	 */
	private static double calcContribPct(int baseVersionIndex, String[] compareMemberSpecs, int[] compareAxisIndexes, 
			PafDimTree[] dimTrees, int[] cellIndex, PafDataCache dataCache, int versionAxis) throws PafException {

		double cellValue = 0, baseValue = 0, compareValue = 0;
		int[] memberCellIndex = new int[cellIndex.length];

		// Get cell values for version formula components
		System.arraycopy(cellIndex, 0, memberCellIndex, 0, cellIndex.length);
		// --- Base Value
		memberCellIndex[versionAxis] = baseVersionIndex;
		baseValue = dataCache.getCellValue(memberCellIndex);
		// --- Compare Value
		for (int i = 0; i < compareMemberSpecs.length; i++) {
			int axisIndex = compareAxisIndexes[i];
			String currMember = dataCache.getDimMember(axisIndex, cellIndex[axisIndex]);
			String member = resolveMemberSpec(compareMemberSpecs[i], dimTrees[i], currMember );
			int memberIndex = dataCache.getMemberIndex(member, axisIndex);
			memberCellIndex[axisIndex] = memberIndex;			
		}
		//FIXME ContribPct - Add try block, if fails add appropriate message to
		// exception message ---> member is not in data slice cache.
		compareValue = dataCache.getCellValue(memberCellIndex);

		
		// Compute cell value - return 0 if compare value is zero
		if (compareValue != 0) {
			cellValue = baseValue / compareValue;
		}

		return cellValue;

	}


	/**
	 * 	Resolve member specification
	 * 
	 * @param memberSpec Member specification string
	 * @param dimTree Dimension tree
	 * @param currMbrName Current intersection member name
	 * 
	 * @return member name
	 */
	public static String resolveMemberSpec(String memberSpec, PafDimTree dimTree, String currMbrName) {

		String resolvedMemberSpec = null;
		
		// If not a token, then just return member name (original membSpec value)
		if (!memberSpec.startsWith("@")) {
			return memberSpec;
		}
		
		// Get current member
		PafDimMember currMember = dimTree.getMember(currMbrName);
		
		// Check for PARENT token
		if (memberSpec.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_PARENT)) {
			if (currMember == dimTree.getRootNode()) {
				// Return current member name if current member is root of tree
				resolvedMemberSpec = currMember.getKey();
			} else {
				// Else return name of parent
				resolvedMemberSpec = currMember.getParent().getKey();				
			}
			return resolvedMemberSpec;
		}
			
		// Check for TOTAL token
		if (memberSpec.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_UOWROOT)) {
			// Return name of root node
			resolvedMemberSpec = dimTree.getRootNode().getKey();
			return resolvedMemberSpec;
		}
		
		// Invalid member spec token
		String errMsg = "Invalid member token in version formula";
		logger.error(errMsg);
		throw new IllegalArgumentException(errMsg);
		
	}

	/**
	 *  Build contribution percent formula basis intersection
	 *
	 * @param is Changed intersection
	 * @param evalState Evaluation state
	 * 
	 * @return Changed intersection
	 */
	public static Intersection buildContribPctBasisIs (Intersection is, EvalState evalState) {

		String versionDim = evalState.getVersionDim();
		PafApplicationDef appDef = evalState.getAppDef();
		MemberTreeSet uowTrees = evalState.getClientState().getUowTrees();


		// Get version info
		String version = is.getCoordinate(versionDim);
		VersionDef vd = appDef.getVersionDef(version);
		VersionFormula formula = vd.getVersionFormula();

		// Build basis intersection. Start with clone of changed intersection, overriding
		// the version member with the formula base version. Next override any of the
		// dimension member specifications that are contained in the comparison definition.
		Intersection basisIs = is.clone();
		basisIs.setCoordinate(versionDim, formula.getBaseVersion());
		String[] basisDims = formula.getCompareIsDims();
		String[] basisMembers = formula.getCompareIsMembers();
		for (int i = 0; i < basisDims.length; i++) {
			String dim = basisDims[i];
			String currMember = basisIs.getCoordinate(dim);
			PafDimTree dimTree = uowTrees.getTree(dim);
			String basisMember = PafDataSliceCacheCalc.resolveMemberSpec(basisMembers[i], dimTree, currMember);
			basisIs.setCoordinate(dim, basisMember);
		}

		// Return basis intersection
		return basisIs;

	}


}
