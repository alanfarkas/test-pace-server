/*
 *	File: @(#)PafBaseMemberProps.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Aug 3, 2005  			By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.mdb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.metadata.IEssMember;
import com.essbase.api.metadata.IEssMember.EEssShareOption;
import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/**
 * Defines the base member properties
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafBaseMemberProps extends PafDimMemberProps  implements Cloneable{

	private static Logger logger = Logger.getLogger(PafBaseMemberProps.class);

	// All attribute member associations by attribute dim (populated directly from attribute trees)
	private Map<String, String> associatedAttributes = null;

	// Member description (NOT alias)
	private String memberDescription = null;

	// Member number (post-order)
	private int memberNumber = 0;

	// Member formula
	private String memberFormula = null;

	// Last member formula used
	private String lastFormula = null;

	// Share option (e.g. "Store Data" , "Never Share", "Shared Member") - Default to "Store Data"
	private IEssMember.EEssShareOption shareOption = EEssShareOption.STORE_DATA;

	// User-defined attributes
	private String[] UDAs = null;
	

   
	/**
	 *	Return all Essbase attribute dimension member assignments
	 *
	 * @return Returns all attribute dimension member assignments
	 */
	public Map<String, String> getAssociatedAttributes() {
		
		Map<String, String> attributes = null;
		
		// Return empty string if associated attributes are null
		if (associatedAttributes == null) {
			attributes = new HashMap<String, String>();
		} else {		
			attributes = associatedAttributes;
		}
		return attributes;
	}
	/**
	 *	Set the Essbase attribute dimension member assignments
	 *
	 * @param associatedAttributes Array containing the Essbase attribute dimension member attributes
	 */
	public void setAssociatedAttributes(Map<String, String> associatedAttributes) {
		this.associatedAttributes = associatedAttributes;
	}

	/**
	 * Return the member description
	 *
	 * @return Returns the member description
	 */
	public String getDescription() {
		
		String description = null;
		
		if (memberDescription != null) {
			description = memberDescription;
		} else {
			description = "";
		}
		return description;
	}
	/**
	 * Set the member description
	 *
	 * @param memberDescription The member description to set
	 */
	public void setDescription(String memberDescription) {
		this.memberDescription = memberDescription;
	}

	/**
	 * Return the member formula
	 *
	 * @return Returns the member formula.
	 */
	public String getFormula() {

		String formula = null;
		
		if (memberFormula != null) {
			formula = memberFormula;
		} else {
			formula = "";
		}
		return formula;
	}
	/**
	 * Set the member formula
	 *
	 * @param memberFormula The member formula to set
	 */
	public void setFormula(String memberFormula) {
		this.memberFormula = memberFormula;
	}

	/**
	 * Return the last member formula
	 *
	 * @return Returns the last member formula
	 */
	public String getLastFormula() {

		String formula = null;
		
		if (lastFormula != null) {
			formula = lastFormula;
		} else {
			formula = "";
		}
		return formula;
	}
	/**
	 *	Set the last member formula
	 *
	 * @param lastFormula The last member formula used to evaluate this member
	 */
	public void setLastFormula(String lastFormula) {
		this.lastFormula = lastFormula;
	}

    /**
	 * @return the memberNumber
	 */
	public int getMemberNumber() {
		return memberNumber;
	}
	/**
	 * @param memberNumber the memberNumber to set
	 */
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	/**
	 * Return the member share option
	 *
	 * @return Returns the member share option
	 */
	public IEssMember.EEssShareOption getShareOption() {
		return shareOption;
	}
	/**
	 * Set the member share option
	 *
	 * @param shareOption The member share option to set
	 */
	public void setShareOption(IEssMember.EEssShareOption shareOption) {
		this.shareOption = shareOption;
	}

	/**
	 * Return the member UDAs
	 *
	 * @return Returns the member UDAs.
	 */
	public String[] getUDAs() {
		
		String[] udas = null;
		
		// Return empty string if UDA's are null
		if (UDAs == null) {
			udas = new String[0];
		} else {		
			udas = UDAs;
		}
		return udas;
	}
	/**
	 * Set the member UDAs
	 *
	 * @param uDAs The member UDAs to set.
	 */
	public void setUDAs(String[] uDAs) {
		this.UDAs = uDAs;
	}

	
	/**
	 *	Return a simple version of the PafBaseMemberProps
	 *
	 * @return PafSimpleBaseMemberProps
	 * @throws PafException 
	 */
	public PafSimpleBaseMemberProps getSimpleVersion() throws PafException {
		
		String[] aliasKeys = new String[getAliases().size()];
		String[] aliasValues = new String[getAliases().size()];
		String []associatedAttrKeys = new String[getAssociatedAttributes().size()];
		String []associatedAttrValues = new String[getAssociatedAttributes().size()];
		String []uDAs = new String[getUDAs().length];
		PafSimpleBaseMemberProps simpleBaseMemberProps = null;
		
		// Create an instance of the PafSimpleBaseMemberProps object
		logger.debug("Returning simple version of PafBaseMemberProps");
		simpleBaseMemberProps = new PafSimpleBaseMemberProps();
	
		// Set "simple" properties
		logger.debug("Setting simple properties...");
		simpleBaseMemberProps.setDescription(getDescription());
		simpleBaseMemberProps.setGenerationNumber(getGenerationNumber());
		simpleBaseMemberProps.setLevelNumber(getLevelNumber());
		simpleBaseMemberProps.setFormula(getFormula());
		simpleBaseMemberProps.setLastFormula(getLastFormula());

		// Set arrayed properties
		logger.debug("Setting arrayed properties...");

		//-- Set aliases (keys sorted in alpha-order) (TTN-1350)
		getAliases().keySet().toArray(aliasKeys);
		Arrays.sort(aliasKeys);
		simpleBaseMemberProps.setAliasKeys(aliasKeys);
		int i = 0;
		for (String aliasKey : aliasKeys) {
			aliasValues[i] = getMemberAlias(aliasKey);
			i++;
		}
		simpleBaseMemberProps.setAliasValues(aliasValues);

		//-- Set associated attributes
		getAssociatedAttributes().keySet().toArray(associatedAttrKeys);
		simpleBaseMemberProps.setAssociatedAttrKeys(associatedAttrKeys);
		getAssociatedAttributes().values().toArray(associatedAttrValues);
		simpleBaseMemberProps.setAssociatedAttrValues(associatedAttrValues);

		//-- Set UDA's
		System.arraycopy(getUDAs(), 0, uDAs, 0, uDAs.length);
		simpleBaseMemberProps.setUDAs(uDAs);

		// Set enumerated values
		logger.debug("Setting enumerated values...");
		try {
            if (getConsolidationType() != null) 
                simpleBaseMemberProps.setConsolidationType(getConsolidationType().intValue());
            else
                simpleBaseMemberProps.setConsolidationType(0);
            
            if (getShareOption() != null)
                simpleBaseMemberProps.setShareOption(getShareOption().intValue());
            else
                simpleBaseMemberProps.setConsolidationType(0);
            
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}		
		
		// Return simple version of member properties
		return simpleBaseMemberProps;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PafBaseMemberProps clone() throws CloneNotSupportedException {

		PafBaseMemberProps memberProps = (PafBaseMemberProps) super.clone();
		
		// Clone associated attributes
		if (this.associatedAttributes != null) {
			memberProps.associatedAttributes = new HashMap<String, String>();
			for (String key : this.associatedAttributes.keySet()) {
				memberProps.associatedAttributes.put(key, this.associatedAttributes.get(key));
			}
		}

		// Clone UDAs
		if (this.UDAs != null) {
			memberProps.UDAs = this.UDAs.clone();
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
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(UDAs);
		result = prime
				* result
				+ ((associatedAttributes == null) ? 0 : associatedAttributes
						.hashCode());
		result = prime * result
				+ ((lastFormula == null) ? 0 : lastFormula.hashCode());
		result = prime
				* result
				+ ((memberDescription == null) ? 0 : memberDescription
						.hashCode());
		result = prime * result
				+ ((memberFormula == null) ? 0 : memberFormula.hashCode());
		result = prime * result
				+ ((shareOption == null) ? 0 : shareOption.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PafBaseMemberProps))
			return false;
		
		// Check PafBaseMemberProps
		PafBaseMemberProps compare = (PafBaseMemberProps) obj;
		
		// -- Check UDAs
		if (!Arrays.equals(UDAs, compare.UDAs))
			return false;
		
		// -- Check associatedAttributes
		if (associatedAttributes == null) {
			if (compare.associatedAttributes != null)
				return false;
		} else if (!associatedAttributes.equals(compare.associatedAttributes))
			return false;
		
		// -- Check lastFormula
		if (lastFormula == null) {
			if (compare.lastFormula != null)
				return false;
		} else if (!lastFormula.equals(compare.lastFormula))
			return false;
		
		// -- Check memberDescription
		if (memberDescription == null) {
			if (compare.memberDescription != null)
				return false;
		} else if (!memberDescription.equals(compare.memberDescription))
			return false;
		
		// -- Check memberFormula
		if (memberFormula == null) {
			if (compare.memberFormula != null)
				return false;
		} else if (!memberFormula.equals(compare.memberFormula))
			return false;
		
		// -- Check shareOption
		if (shareOption == null) {
			if (compare.shareOption != null)
				return false;
		} else if (!shareOption.equals(compare.shareOption))
			return false;
		
		// -- Check aliases 
		if (getAliases() == null) {
			if (compare.getAliases() != null)
				return false;
		} else if (!getAliases().equals(compare.getAliases())) {
			// Temporarily ignore alias differences on shared members. Shared
			// members alias were incorrect in original version of outline 
			// extraction method. 
			if (shareOption != EEssShareOption.SHARED_MEMBER) {
				return false;
			}
		}

		return true;
	}

    /*
     *	Return key properties
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
    	String text = super.toString() + String.format("Share Option: %s\nMember Num: %d\n", shareOption, memberNumber);
    	return text;
     }


}