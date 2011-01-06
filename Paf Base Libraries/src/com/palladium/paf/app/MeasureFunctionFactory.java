package com.palladium.paf.app;

import java.util.HashMap;
import java.util.Map;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.paf.funcs.*;

public class MeasureFunctionFactory {
	
	private Map<String, CustomFunctionDef> functionMap = new HashMap<String, CustomFunctionDef>();

	private ClassLoader classLoader = null;
	
	public MeasureFunctionFactory(CustomFunctionDef[] functionList) {
		for (CustomFunctionDef def : functionList) {
			//validate that each custom function defined has a handler
            try {
				@SuppressWarnings("unused")
				IPafFunction func = (IPafFunction) Class.forName(def.getClassName()).newInstance();
                functionMap.put(def.getFunctionName(), def);
            }
            catch (Exception ex) {
                throw new IllegalArgumentException("No function class defined [" + def.getFunctionName() + ", " + def.getClassName() + "]", ex);
            }
		}
	}
	
	public MeasureFunctionFactory(CustomFunctionDef[] functionList, ClassLoader classLoader) {
		
		//set the class loader
		this.classLoader = classLoader;
		
		//loop through custom functions and verify they are valid
		for (CustomFunctionDef def : functionList) {
			
			//validate that each custom function defined has a handler
            try {
				@SuppressWarnings("unused")
				IPafFunction func = (IPafFunction) Class.forName(def.getClassName(), true, this.classLoader).newInstance();
                functionMap.put(def.getFunctionName(), def);
            }
            catch (Exception ex) {
                throw new IllegalArgumentException("No function class defined [" + def.getFunctionName() + ", " + def.getClassName() + "]", ex);
            }
		}
	}

	public static IPafFunction getFunctionShell(String functionString) {
		AbstractFunction function = new ParsedFunction(functionString);
		return function;
	}

	public IPafFunction getFunction(String functionString) throws PafException {
		IPafFunction funcShell;
        IPafFunction concreteFunction;
		if ( !isFunction( functionString ) ) {
			throw new IllegalArgumentException("Malformed function string [" + functionString + "]");			
		}
		
		// extract opcode key
		funcShell = getFunctionShell(functionString);
		

		if (functionMap.containsKey(funcShell.getOpCode())) {
			String className = functionMap.get(funcShell.getOpCode()).getClassName();
			
			try {
				
				if ( this.classLoader != null ) {
					concreteFunction = (IPafFunction) Class.forName(className, false, this.classLoader).newInstance();
				} else {
					concreteFunction = (IPafFunction) Class.forName(className).newInstance();
				}
			} catch (Exception e) {
				throw new PafException("Error instantiating custom function: " + functionMap.get(funcShell.getOpCode().toString()), e, PafErrSeverity.Warning);

			}
		}
		else {
			throw new IllegalArgumentException("No function defined for that name [" + functionString + "]");
		}
		
		concreteFunction.parseParameters(functionString);
		return concreteFunction;	
	}
	
	public boolean isFunction(String functionString) {

		if ( !functionString.startsWith("@") ) return false;
		
		String term = extractOpcode(functionString);
		
		if (functionMap.containsKey(term)) {
			return true;
		}
		throw new IllegalArgumentException("Function string prefix encountered, but function not defined. [" + functionString + "]");
	}
	
	private String extractOpcode(String functionString) {

		// has to start with @, so quick check up front
		if (functionString.charAt(0) != '@') throw new IllegalArgumentException("Functions string does not start with '@' [" + functionString + "]");
	
		if (functionString.indexOf('(') < 0) throw new IllegalArgumentException("Functions string does not contain '(' [" + functionString + "]");
		
		// extract term between @ and (
		String term = functionString.substring(0, functionString.indexOf('('));
		
		return term.toUpperCase();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((classLoader == null) ? 0 : classLoader.hashCode());
		result = prime * result
				+ ((functionMap == null) ? 0 : functionMap.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeasureFunctionFactory other = (MeasureFunctionFactory) obj;
		if (classLoader == null) {
			if (other.classLoader != null)
				return false;
		} else if (!classLoader.equals(other.classLoader))
			return false;
		if (functionMap == null) {
			if (other.functionMap != null)
				return false;
		} else if (!functionMap.equals(other.functionMap))
			return false;
		return true;
	}

	
	
}