package com.pace.base.rules;

import java.util.Arrays;

/**
 * This is a collection of rules, and is meant to be a part of a RuleSet. It includes
 * various attributes on how the rulegroup should be processed by the evaluation layer.
 *
 * @version	0.01
 * @author Jim Watkins
 *
 *
 * Update Log
 * 4/9/06	Updated log created. Adding attribute for "delayedPerpetual" operations
 *
 */
public class RuleGroup implements Cloneable {
	
	private String comment;
    private String ruleGroupId;
    private Rule[] rules;
    private String balanceSetKey;
    private boolean perpetual = false;
    private boolean delayedPerpetual = false; // deprecated, should no longer be used
    private boolean perpetualAllocation = false;
    private boolean skipProtProc = false;
    private Boolean performInitialAllocation = null; // true by default
        

    public RuleGroup() {}
    public RuleGroup(Rule[] rules) {
    	this.setRules(rules);
    }

    public Object readResolve() {
    	initDefaults();
    	return this;
    }
    
    private void initDefaults() {
    	if (performInitialAllocation == null)
    		performInitialAllocation = true;
    }
    
    public Rule[] getRules() {
        return rules;
    }

    public void setRules(Rule[] rules) {
        this.rules = rules;
    }

    public Formula getRule(String msrToCalc) {
        for (int i = 0; i < rules.length; i++) {
            if (rules[i].getFormula().getResultTerm().equals(msrToCalc))
                return rules[i].getFormula();
        }
        throw new IllegalArgumentException("Rule to calculate specified measure does not exist in rule group.");
        
    }

    /**
     * @return Returns the ruleGroupId.
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * @param ruleGroupId The ruleGroupId to set.
     */
    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

	public boolean containsResultMeasure(String coordinate) {
		for(Rule r : rules) {
			if (r.getFormula().getResultTerm().equalsIgnoreCase(coordinate)) return true;
		}
		return false;
	}
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Rule r : rules) sb.append(r.toString() + " | ");
        sb.setLength(sb.length()-3);
        return sb.toString();
    }

    /**
     * @return Returns the balanceSetKey.
     */
    public String getBalanceSetKey() {
        return balanceSetKey;
    }

    /**
     * @param balanceSetKey The balanceSetKey to set.
     */
    public void setBalanceSetKey(String balanceSetKey) {
        this.balanceSetKey = balanceSetKey;
    }

    /**
     * @return Returns the perpetual.
     */
    public boolean isPerpetual() {
        return perpetual;
    }

    /**
     * @param perpetual The perpetual to set.
     */
    public void setPerpetual(boolean perpetual) {
        this.perpetual = perpetual;
    }
    
	public boolean isDelayedPerpetual() {
		return delayedPerpetual;
	}
	
	public void setDelayedPerpetual(boolean delayedPerpetual) {
		this.delayedPerpetual = delayedPerpetual;
	}
	public boolean isSkipProtProc() {
		return skipProtProc;
	}
	public void setSkipProtProc(boolean skipProtProc) {
		this.skipProtProc = skipProtProc;
	}
	
	public Object clone() {
		try {
			RuleGroup newRg = (RuleGroup) super.clone();
			newRg.rules = this.rules.clone();
			return newRg;
		}
		catch (Exception ex) {
			System.err.println("Unexpected Clone Exception in RuleGroup.clone");
		}
		
		return null;
	}
    /**
     * @return Returns the perpetualAllocation.
     */
    public boolean isPerpetualAllocation() {
        return perpetualAllocation;
    }
    /**
     * @param perpetualAllocation The perpetualAllocation to set.
     */
    public void setPerpetualAllocation(boolean perpetualAllocation) {
        this.perpetualAllocation = perpetualAllocation;
    }
	public Boolean getPerformInitialAllocation() {
		return performInitialAllocation;
	}
	public void setPerformInitialAllocation(Boolean performInitialAllocation) {
		this.performInitialAllocation = performInitialAllocation;
	}
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((balanceSetKey == null) ? 0 : balanceSetKey.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + (delayedPerpetual ? 1231 : 1237);
		result = prime
				* result
				+ ((performInitialAllocation == null) ? 0
						: performInitialAllocation.hashCode());
		result = prime * result + (perpetual ? 1231 : 1237);
		result = prime * result + (perpetualAllocation ? 1231 : 1237);
		result = prime * result
				+ ((ruleGroupId == null) ? 0 : ruleGroupId.hashCode());
		result = prime * result + Arrays.hashCode(rules);
		result = prime * result + (skipProtProc ? 1231 : 1237);
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
		RuleGroup other = (RuleGroup) obj;
		if (balanceSetKey == null) {
			if (other.balanceSetKey != null)
				return false;
		} else if (!balanceSetKey.equals(other.balanceSetKey))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (delayedPerpetual != other.delayedPerpetual)
			return false;
		if (performInitialAllocation == null) {
			if (other.performInitialAllocation != null)
				return false;
		} else if (!performInitialAllocation
				.equals(other.performInitialAllocation))
			return false;
		if (perpetual != other.perpetual)
			return false;
		if (perpetualAllocation != other.perpetualAllocation)
			return false;
		if (ruleGroupId == null) {
			if (other.ruleGroupId != null)
				return false;
		} else if (!ruleGroupId.equals(other.ruleGroupId))
			return false;
		if (!Arrays.equals(rules, other.rules))
			return false;
		if (skipProtProc != other.skipProtProc)
			return false;
		return true;
	}

	
	
}
