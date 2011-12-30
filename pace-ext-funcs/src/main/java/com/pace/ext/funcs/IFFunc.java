package com.pace.ext.funcs;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureFunctionFactory;
import com.pace.base.app.MeasureType;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.funcs.AbstractFunction;
import com.pace.base.funcs.IPafFunction;
import com.pace.base.rules.Formula;
import com.pace.base.state.IPafEvalState;
import com.pace.base.utility.CollectionsUtil;

/**
 * "IF" Custom Function - Takes a formula to resolve as a boolean parameter
 * 
 * The calling signature of this function is '@IFF(Boolean Formula, True Formula, False Formula)'.
 * 
 * @version	x.xx
 * @author JWatkins
 *
 */
public class IFFunc extends AbstractFunction {

//	private static Logger logger = Logger.getLogger(IFFunc.class);
	
	// these variables hold parsed versions on the formulas for performance reasons
	// a formula is 
	private Formula bLeft = null;
	private Formula bRight = null;
	private Formula fTrue = null;
	private Formula fFalse = null;
	private compOpEnum compOp = null;
	

	private enum compOpEnum { lessEqual, greatEqual, lessThen, greaterThen, notEqual, equal }
	
    public double calculate(Intersection sourceIs, IPafDataCache dataCache, IPafEvalState evalState) throws PafException {
    	  	
		if (!this.isInitialized) initialize(evalState);
		
    	double result = 0;
    	boolean evalTrueFormula = false;
    	
    	double leftVal, rightVal;
    	leftVal = evaluateFormula(bLeft, sourceIs, dataCache, evalState);
    	rightVal = evaluateFormula(bRight, sourceIs, dataCache, evalState);
    	
    	switch (compOp) {
    	case lessEqual:
    		if (leftVal <= rightVal) evalTrueFormula = true;
    		break;
    	case greatEqual:
    		if (leftVal >= rightVal) evalTrueFormula = true;
    		break;
    	case lessThen:
    		if (leftVal < rightVal) evalTrueFormula = true;
    		break;
    	case greaterThen:
    		if (leftVal > rightVal) evalTrueFormula = true;
    		break;
    	case notEqual:
    		if (leftVal != rightVal) evalTrueFormula = true;
    		break;
    	case equal:
    		if (leftVal == rightVal) evalTrueFormula = true;
    		break;
    	}
    	
    	if (evalTrueFormula)
    		result = evaluateFormula(fTrue, sourceIs, dataCache, evalState);
    	else
    		result = evaluateFormula(fFalse, sourceIs, dataCache, evalState);
 
        return result;
    }
    
    private double evaluateFormula(Formula formula, Intersection srcIs, IPafDataCache dataCache, IPafEvalState evalState ) throws PafException {
    	
    	String[] terms = formula.getExpressionTerms();
        boolean[] funcFlags = formula.getFunctionTermFlags();
        double[] values = new double[terms.length];
        IPafFunction function = null;
        String axis = evalState.getAppDef().getMdbDef().getMeasureDim();
          
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
 
        // lock result if a component of this formula is a direct user change
        lockRecalcComps(srcIs, formula, evalState);
        
        return result;
    }
 

    // determine wich intersections in the eval state might cause this formula to need
    // to execute. An example using a standard rule (not custom function) would be
    // SLS_DLR = SLS_U * SLS_AUR
    // in this case any changed SLS_U or SLS_AUR intersections would be returned. This
    // allows the function to find it's own dependencies.
    
	public Set<Intersection> getTriggerIntersections(IPafEvalState evalState) throws PafException {
		
		if (!this.isInitialized) initialize(evalState);
		
		Set<Intersection> isTriggers = new HashSet<Intersection>();
		
		// In this case any measure used in any of the 4 controlling formulas has to be considered.
		isTriggers.addAll(getTriggers(bLeft, evalState));
		isTriggers.addAll(getTriggers(bRight, evalState));
		isTriggers.addAll(getTriggers(fTrue, evalState));		
		isTriggers.addAll(getTriggers(fFalse, evalState));

		return isTriggers;
	}
	
	private Set<Intersection> getTriggers(Formula formula, IPafEvalState evalState) throws PafException {
		
		
		Set<Intersection> isTriggers = new HashSet<Intersection>();
		Map<String, Set<String>> filterMap = new HashMap<String, Set<String>>();
		Set<String>msrNames = new HashSet<String>();
		
		String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim(); 

		String[] expressionTerms = formula.getExpressionTerms();
		for (int i = 0; i < expressionTerms.length; i++) {
			String term = expressionTerms[i];
			if (!formula.getFunctionTermFlags()[i]) {
				// simple measure, search for it in eval state at end
				msrNames.add(term);				
			}
			else {
				// is function so pull out function object
				isTriggers.addAll(formula.extractFunctionTerms()[i].getTriggerIntersections(evalState));
			}
		}
		
		if (msrNames.size() > 0) {
			filterMap.put(msrDim, msrNames);		
			isTriggers.addAll(findIntersections(filterMap, evalState.getCurrentChangedCells(), evalState));
		}
		
		return isTriggers;
	}
	
	public boolean changeTriggersFormula(Intersection is, IPafEvalState evalState) {
		
		return true;
	}
	
	private void initialize(IPafEvalState evalState) throws PafException {
    	// Get required arguments if not already parsed

		MeasureFunctionFactory mff = evalState.getAppDef().getMeasureFunctionFactory();
		String compOpStr = null;
		// look for supported operators, =, <=, >=, !=, <, >
		// set split string and enumerated constant for subsequent comparisons
		
		
		if (parms[0].contains("<=") ) { 
			this.compOp = compOpEnum.lessEqual;
			compOpStr = "<=";
			}
		else if (parms[0].contains(">=") ) {
			compOp = compOpEnum.greatEqual;
			compOpStr = ">=";			
		}
		else if (parms[0].contains("<") ) {
			compOp = compOpEnum.lessThen;
			compOpStr = "<";			
		}
		else if (parms[0].contains(">") ) {
			compOp = compOpEnum.greaterThen;
			compOpStr = ">";			
		}
		else if (parms[0].contains("!=") ) {
			compOp = compOpEnum.notEqual;
			compOpStr = "!=";			
		}
		else if (parms[0].contains("=") ) {
			compOp = compOpEnum.equal;
			compOpStr = "=";			
		}
		
		if (compOpStr == null) throw new PafException ("Unrecognized comparison operator in formula [ " + parms[0] + " ]", PafErrSeverity.Error);

		bLeft = new Formula("X", parms[0].split(compOpStr)[0]);
		bLeft.parse(mff);

		bRight = new Formula("X", parms[0].split(compOpStr)[1]);
		bRight.parse(mff);
		
		fTrue = new Formula("X", parms[1]);
		fTrue.parse(mff);
		
		fFalse = new Formula("X", parms[2]);
		fFalse.parse(mff);

    	this.isInitialized = true;
	}
	
	private void lockRecalcComps(Intersection targetIs, Formula formula, IPafEvalState evalState) {
	
    Collection<Intersection> cellsToLock = new HashSet<Intersection>(1);
    int tCount = 0;
    String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
   	Map<String, MeasureDef> measureCat = evalState.getAppDef().getMeasureDefs();
    
    for (String term : formula.getTermMeasures()) {                      	

	    	// skip function components, this is specifically for the IF function which is currently 
	    	// Indeterminable as a recalc dependency, however this is true for most functions at this time.
	    	if (formula.getFunctionTermFlags()[tCount++]) continue;
	    	                      	
	        if (measureCat.get(term).getType() == MeasureType.Recalc) {
	        	Intersection recalcComp = targetIs.clone();
	            recalcComp.setCoordinate(msrDim, term);
	            if (evalState.getOrigLockedCells().contains(recalcComp)) {
	            	
	                if (targetIs != null) {
	                    cellsToLock.add(targetIs);
	                }
	                break;
	            }
	        } 
	    }
    evalState.getCurrentLockedCells().addAll(cellsToLock); 
    evalState.addAllAllocations(cellsToLock);
	}
	
     /* (non-Javadoc)
     * @see com.pace.base.funcs.AbstractFunction#getMemberDependencyMap(com.pace.base.state.IPafEvalState)
     */
    public Map<String, Set<String>> getMemberDependencyMap(IPafEvalState evalState) throws PafException {
    	
    	Map<String, Set<String>> dependencyMap = new HashMap<String, Set<String>>();
    	
		if (!this.isInitialized) initialize(evalState);
		
		// In this case any member used in any of the 4 controlling formulas has 
		// to be considered.
		dependencyMap = CollectionsUtil.mergeMaps(dependencyMap, getFormulaMemberMap(bLeft, evalState));
		dependencyMap = CollectionsUtil.mergeMaps(dependencyMap, getFormulaMemberMap(bRight, evalState));
		dependencyMap = CollectionsUtil.mergeMaps(dependencyMap, getFormulaMemberMap(fTrue, evalState));
		dependencyMap = CollectionsUtil.mergeMaps(dependencyMap, getFormulaMemberMap(fFalse, evalState));

    	// Return dependency map
		return dependencyMap;
    	
    }

    private Map<String, Set<String>> getFormulaMemberMap(Formula formula, IPafEvalState evalState) throws PafException {
		
		Map<String, Set<String>> memberMap = new HashMap<String, Set<String>>();
		
		// Initialize member map
		String measureDim = evalState.getMsrDim(); 
		memberMap.put(measureDim, new HashSet<String>());

		// Check each formula term
		String[] expressionTerms = formula.getExpressionTerms();
		for (int i = 0; i < expressionTerms.length; i++) {
			String term = expressionTerms[i];
			if (!formula.getFunctionTermFlags()[i]) {
				// simple measure, add it to member map
				memberMap.get(measureDim).add(term);				
			}
			else {
				// is function so pull out function object
				memberMap = CollectionsUtil.mergeMaps(memberMap, formula.extractFunctionTerms()[i].getMemberDependencyMap(evalState));
			}
		}
		
		// Return dependent member map
		return memberMap;
    }
		
}
