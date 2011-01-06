package com.palladium.paf.mdb;

/**
 * A simple version of the PafDimMemberProps object
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafSimpleDimMemberProps {

	private long id;
	private String[] aliasKeys = null;
	private String[] aliasValues = null;
	
	private int consolidationType = 0;
	public static final int CONSOLIDATION_TYPE_ADDITION = 0; 
	public static final int CONSOLIDATION_TYPE_SUBTRACTION = 1; 
	public static final int CONSOLIDATION_TYPE_MULTIPLICATION = 2; 
	public static final int CONSOLIDATION_TYPE_DIVISION = 3; 
	public static final int CONSOLIDATION_TYPE_PERCENT = 4; 
	public static final int CONSOLIDATION_TYPE_IGNORE = 5; 

	private int generationNumber = 0;
	private int levelNumber = 0;

	/**
	 *	Return the SimplePafMemberAttr id
	 *
	 * @return Returns the SimplePafMemberAttr id
	 */
	public long getId() {
		return id;
	}
	/**
	 *	Set the SimplePafMemberAttr id
	 *
	 * @param id The SimplePafMemberAttr id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 *	Return the Essbase alias keys (alias table names)
	 *
	 * @return Returns the Essbase alias keys (alias table names)
	 */	
	public String[] getAliasKeys() {
		return aliasKeys;
	}
	/**
	 *	Set the Essbase alias keys (alias table names)
	 *
	 * @param aliasKeys The Essbase alias keys (alias table names)
	 */	
	public void setAliasKeys(String[] aliasKeys) {
		this.aliasKeys = aliasKeys;
	}
		
	/**
	 *	Return the Essbase alias values
	 *
	 * @return Returns the Essbase alias values
	 */	
	public String[] getAliasValues() {
		return aliasValues;
	}
	/**
	 *	Set the Essbase alias values
	 *
	 * @param aliasValues The Essbase alias values 
	 */	
	public void setAliasValues(String[] aliasValues) {
		this.aliasValues = aliasValues;
	}
		
	/**
	 * Return the member consolidation type
	 *
	 * @return Returns the member consolidation type
	 */
	public int getConsolidationType() {
		return consolidationType;
	}
	/**
	 * Set the member consolidation type
	 *
	 * @param consolidationType The member consolidation type to set
	 */
	public void setConsolidationType(int consolidationType) {
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
	
	
}
