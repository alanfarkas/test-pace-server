package com.palladium.paf.app;

import java.util.HashMap;
import java.util.Map;

import com.palladium.paf.PafBaseConstants;


public class VersionDef {

    private String name = null;
    private VersionType type = null;
    private Map<String, String> aliases = null;
    private VersionFormula versionFormula = null;
    private String numericFormatName = null;
    
    /**
     * 
     */
    public VersionDef() {    }

    /**
     * @param name Version name
     * @param type Version type
     */
    public VersionDef(String name, VersionType type) {
    	this.name = name;
    	this.type = type;
    }

	/**
	 * @return Returns the aliases.
	 */
	public Map<String, String> getAliases() {
		return aliases;
	}

	/**
	 * @param aliases The aliases to set.
	 */
	public void setAliases(Map<String, String> aliases) {
		this.aliases = aliases;
	}
	
	/**
	 * Return the version alias for the "Default" alias table
	 *
	 * @return Returns the member alias for the "Default" alias table
	 */
	public String getAlias() {
		return getAlias("Default");
	}

	/**
	 *	Set the version alias for the "Default" alias table
	 *
	 * @param aliasTable Essbase alias table name
	 * @return Returns the version alias from the "Default" alias table
	 */
	public String getAlias(String aliasTable) {
		
		String alias = null;
		if (aliases != null)
			alias = aliases.get(aliasTable);
		return alias;
	}

	/**
	 *	Add an alias to version using the specified Essbase alias table
	 *
	 * @param aliasTableName Essbase alias table name
	 * @param alias Version alias
	 */
	public void addAlias(String aliasTableName, String alias) {
		
		// Create a new HashMap of aliases, if this is the first alias to be added
		if (aliases == null) 
			aliases = new HashMap<String,String>();
		
		// Add new alias
		aliases.put(aliasTableName, alias);
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the numericFormatName.
	 */
	public String getNumericFormatName() {
		return numericFormatName;
	}

	/**
	 * @param numericFormatName The numericFormatName to set.
	 */
	public void setNumericFormatName(String numericFormatName) {
		this.numericFormatName = numericFormatName;
	}

	/**
	 * @return Returns the type.
	 */
	public VersionType getType() {
		return type;
	}

	/**
	 * @param type The type to set.
	 */
	public void setType(VersionType type) {
		this.type = type;
	}

	/**
	 * @return Returns the versionFormula.
	 */
	public VersionFormula getVersionFormula() {
		return versionFormula;
	}

	/**
	 * @param versionFormula The versionFormula to set.
	 */
	public void setVersionFormula(VersionFormula versionFormula) {
		this.versionFormula = versionFormula;
	}
    
    /**
     *	Return formula for calculating this version
     *
     * @return Formula string
     */
    public String getVersionFormulaString() {
        
    	String formulaString = null;
    	
    	// Variance version formula
    	if (type == VersionType.Variance) {
    		if (versionFormula.getVarianceType() == VersionVarianceType.SimpleVariance) {
       			formulaString = name + " = " + versionFormula.getBaseVersion() + " - " + versionFormula.getCompareVersion();
       			return formulaString;
    		} else if (versionFormula.getVarianceType() == VersionVarianceType.PercentVariance) {
 //      		formulaString = name + " = (" + versionFormula.getBaseVersion() + " - " + versionFormula.getCompareVersion() + ") / abs(" + versionFormula.getCompareVersion() + ")";
    			formulaString = name + " = (" + versionFormula.getBaseVersion() + " - " + versionFormula.getCompareVersion() + ") / @abs(" + versionFormula.getCompareVersion() + ")";
      			return formulaString;
    		} else {
    			String errMsg = "Unsupported variance formula string for :" + this.name;
     			throw new UnsupportedOperationException(errMsg);
    		}
    	}
        
        // Contrib pct formula
    	if (type == VersionType.ContribPct) {
   			formulaString = name + " = " + versionFormula.getBaseVersion() + " / " + buildCrossDimSpec(versionFormula.getCompareIsSpec());
   			return formulaString;
    	}
        
        // Return null for all remaining version types
    	return null;
        
    }
    
	/**
	 *  Build cross dim function specification
	 *
	 * @param memberSpec memberSpecications
	 * 
	 * @return Cross dim function specification string
	 */
	private String buildCrossDimSpec(PafDimSpec[] memberSpecs) {
		
		StringBuffer crossDimSpec = new StringBuffer();
		//TODO - See if function name can be derived electronically
		final String funcName = "@CrossDim";
//		final String funcName = "CrossDim";
		
		// Ensure there is at least one member spec
		if (memberSpecs == null || memberSpecs.length == 0) {
			String errMsg = "Cross dim build error - no member specifications were defined";
			throw new IllegalArgumentException(errMsg);
		}

		// Initialize cross dim spec
		crossDimSpec.append(funcName + "(");
		
		// Iterate through member specifications to create parameters for cross dim function
		// (dim1, memberSpec1, dim2, memberSpec2, .... dimX, memberSpecX)
		int memberSpecCount = memberSpecs.length;
		for (int i = 0; i < memberSpecCount; i++) {
			
			// Add dimension parm
			crossDimSpec.append(memberSpecs[i].getDimension() + ", ");
			
			// Add member spec parm
			String expression = memberSpecs[i].getExpressionList()[0];
			String memberParm = null;
			if (expression.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_PARENT)) {
				// Parent Token
				memberParm = PafBaseConstants.FUNC_TOKEN_PARENT;
			} else if (expression.equalsIgnoreCase(PafBaseConstants.VF_TOKEN_UOWROOT)) {
				// Total Token
				memberParm = PafBaseConstants.FUNC_TOKEN_UOWROOT;				
			} else {
				// Regular Member
				memberParm = expression;
			}
			crossDimSpec.append(memberParm);
			
			// Add appropriate delimiter after member spec
			if (i < memberSpecCount - 1) {
				// Not the last member spec
				crossDimSpec.append(", ");
			} else {
				// Last member spec - finalize function call
				crossDimSpec.append(")");
			}
				
		}
		
		// Return crossDimSpecification
		return crossDimSpec.toString();
	}

	
	/**
     *	Return formula for calculating the base version
     *
     * @return Formula string
     */
	public String getBaseFormulaString() {
		return getBaseFormulaString(VarRptgFlag.RevenueReporting, 0);
	}

	/**
     *	Return formula for calculating the base version
     *
     * @param varRptgFlag Variance reporting flag
     * @param compareValue Value of cell corresponding to comparison version intersection
     * 
     * @return Formula string
     */
    public String getBaseFormulaString(VarRptgFlag varRptgFlag, double compareValue) {
 
    	String baseFormulaString = null;
  	
    	// Variance version logic   	
    	if (type == VersionType.Variance) {
    		// Simple variance version formula construction logic
    		if (versionFormula.getVarianceType() == VersionVarianceType.SimpleVariance) {
    			if (varRptgFlag == VarRptgFlag.RevenueReporting) {
    				// Base = compare version + variance version
    				baseFormulaString = versionFormula.getBaseVersion() + " = "
    				+ versionFormula.getCompareVersion() + " + " + name;
    			} else {
    				// Base = compare version - variance version
    				baseFormulaString = versionFormula.getBaseVersion() + " = "
    				+ versionFormula.getCompareVersion() + " - " + name;
    			}
    			return baseFormulaString;
    		}
    		// Percent variance version formula construction logic
    		if (versionFormula.getVarianceType() == VersionVarianceType.PercentVariance) {
    			if ((compareValue >= 0 && varRptgFlag == VarRptgFlag.RevenueReporting)
    					|| (compareValue < 0 && varRptgFlag == VarRptgFlag.ExpenseReporting)) {
    				// Base = (variance version * compare version) + compare version
    				baseFormulaString = versionFormula.getBaseVersion()
    				+ " = (" + name + " * "
    				+ versionFormula.getCompareVersion() + ") + "
    				+ versionFormula.getCompareVersion();
    			} else {
    				// Base = + compare version - (variance version * compare version) 
    				baseFormulaString = versionFormula.getBaseVersion() + " = "
    				+ versionFormula.getCompareVersion() + " - ("
    				+ name + " * " + versionFormula.getCompareVersion()
    				+ ")";
    			}
    			return baseFormulaString;
    		}

    		// Unsupported variance type
    		throw new UnsupportedOperationException("Unsupported variance formula string for :" + name);
    	}		


    	// Contrib pct logic   	
    	if (type == VersionType.ContribPct) {
    		baseFormulaString = versionFormula.getBaseVersion() + " = " + name + " * " + buildCrossDimSpec(versionFormula.getCompareIsSpec());
    		return baseFormulaString;
    	}


    	// Return null for all remaining version types
    	return null;

    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((numericFormatName == null) ? 0 : numericFormatName
						.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((versionFormula == null) ? 0 : versionFormula.hashCode());
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
		VersionDef other = (VersionDef) obj;		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numericFormatName == null) {
			if (other.numericFormatName != null)
				return false;
		} else if (!numericFormatName.equals(other.numericFormatName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (versionFormula == null) {
			if (other.versionFormula != null)
				return false;
		} else if (!versionFormula.equals(other.versionFormula))
			return false;
		return true;
	}
    
}