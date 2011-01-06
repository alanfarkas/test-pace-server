package com.palladium.paf.mdb;

import java.util.HashMap;
import java.util.Map;

import com.essbase.api.metadata.IEssMember;
import com.palladium.paf.PafBaseConstants;

/**
 * Defines the dim member properties
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class PafDimMemberProps implements Cloneable {

//	private static Logger logger = Logger.getLogger(PafDimMemberProps.class);

	// An alias name from each alias table (Max of 10)  
	private Map<String,String> aliases = null;

	// Unary operator
	private IEssMember.EEssConsolidationType consolidationType = null;

	// Generation number
	private int generationNumber = 0;

	// Level number (0-based)
	private int levelNumber = 0;

	
	/**
     * Return the member alias tables
     *
     * @return Returns the member alias tables
     */
    public Map<String, String> getAliases() {
        return aliases;
    }
    /**
     * Set the member alias tables
     *
     * @param aliases The member alias tables to set
     */
    public void setAliases(Map<String, String> aliases) {
        this.aliases = aliases;
    }
 
	/**
	 * Return the member alias for the "Default" alias table
	 *
	 * @return Returns the member alias for the "Default" alias table
	 */
	public String getMemberAlias() {
		return getMemberAlias("Default");
	}

	/**
	 *	Set the member alias for the "Default" alias table
	 *
	 * @param aliasTable Essbase alias table name
	 * @return Returns the member alias for the "Default" alias table
	 */
	public String getMemberAlias(String aliasTable) {
		
		String alias = null;
		
		if (aliases != null) {
			alias = aliases.get(aliasTable);
		} else {
			alias = null;
		}
		return alias;
	}
	
	/**
	 * Return the member consolidation type
	 *
	 * @return Returns the member consolidation type
	 */
	public IEssMember.EEssConsolidationType getConsolidationType() {
		return consolidationType;
	}
	/**
	 * Set the member consolidation type
	 *
	 * @param consolidationType The member consolidation type to set
	 */
	public void setConsolidationType(
			IEssMember.EEssConsolidationType consolidationType) {
		this.consolidationType = consolidationType;
	}

	/**
	 *	Return the generation number
	 *
	 * @return Returns the generation number
	 */
	public int getGenerationNumber() {
		return generationNumber;
	}
	/**
	 *	Set the generation number
	 *
	 * @param generationNumber The generation number to set
	 */
	public void setGenerationNumber(int generationNumber) {
		this.generationNumber = generationNumber;
	}

	/**
	 * Return the member level number
	 *
	 * @return Returns the member level number
	 */
	public int getLevelNumber() {
		return levelNumber;
	}
	/**
	 * Set the member level number
	 *
	 * @param levelNumber The member level number to set
	 */
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	/**
	 *	Add member alias to list of aliases for specified member
	 *
	 * @param aliasTableName Essbase alias table name
	 * @param alias Member alias
	 */
	public void addMemberAlias(String aliasTableName, String alias) {
		
		// Create a new HashMap of aliases, if this is the first alias to be added
		if (aliases == null) 
			aliases = new HashMap<String,String>();
		
		// Add new alias
		aliases.put(aliasTableName, alias);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected PafDimMemberProps clone() throws CloneNotSupportedException {

		PafDimMemberProps memberProps = (PafDimMemberProps) super.clone();
		
		// Clone aliases
		if (this.aliases != null) {
			memberProps.aliases = new HashMap<String, String>();
			for (String key : this.aliases.keySet()) {
				memberProps.aliases.put(key, this.aliases.get(key));
			}
		}

		// Return clone
		return memberProps;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aliases == null) ? 0 : aliases.hashCode());
		result = prime
				* result
				+ ((consolidationType == null) ? 0 : consolidationType
						.hashCode());
		result = prime * result + generationNumber;
		result = prime * result + levelNumber;
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
		if (!(obj instanceof PafDimMemberProps))
			return false;
		
		// Check member properties
		PafDimMemberProps compare = (PafDimMemberProps) obj;
		
		// -- Check consolidationType
		if (consolidationType == null) {
			if (compare.consolidationType != null)
				return false;
		} else if (!consolidationType.equals(compare.consolidationType))
			return false;
		
		// -- Check generationNumber
		if (generationNumber != compare.generationNumber)
			return false;
		
		// -- Check levelNumber
		if (levelNumber != compare.levelNumber)
			return false;
				
		return true;
	}

    /*
     *	Return key properties
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
    	return "Alias: " + getMemberAlias() + PafBaseConstants.LINE_TERM
    		+ "Gen: " +  generationNumber + PafBaseConstants.LINE_TERM
    		+ "Lvl: " + levelNumber;
     }

}
