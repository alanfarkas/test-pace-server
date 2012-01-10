/*
 *	File: @(#)PafAttributeMemberProps.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Nov 12, 2006  		By: AFarkas
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
import java.util.Set;

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/**
 * Defines the attribute member properties
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafAttributeMemberProps extends PafDimMemberProps {

	private static Logger logger = Logger.getLogger(PafAttributeMemberProps.class);

	// Base Member Mappings
	Set<String> baseMembers = null;

	/**
	 * @return the baseMembers
	 */
	public Set<String> getBaseMembers() {
		return baseMembers;
	}
	/**
	 * @param baseMembers the baseMembers to set
	 */
	public void setBaseMembers(Set<String> baseMembers) {
		this.baseMembers = baseMembers;
	}


	/**
	 *	Return a simple version of the PafAttributeMemberProps
	 *
	 * @return PafSimpleAttributeMemberProps
	 * @throws PafException 
	 */
	public PafSimpleAttributeMemberProps getSimpleVersion() throws PafException {
		
		String[] aliasKeys = new String[getAliases().size()];
		String[] aliasValues = new String[getAliases().size()];
		//This throws an error when baseMembers == null;
		//String[] baseMembers = new String[getBaseMembers().size()];
		String[] baseMembers = null;
		PafSimpleAttributeMemberProps simpleAttributeMemberProps = null;
		
		// Create an instance of the PafSimpleBaseMemberProps object
		logger.debug("Returning simple version of PafAttributeMemberProps");
		simpleAttributeMemberProps = new PafSimpleAttributeMemberProps();
		
		// Set "simple" properties
		logger.debug("Setting simple properties...");
		simpleAttributeMemberProps.setGenerationNumber(getGenerationNumber());
		simpleAttributeMemberProps.setLevelNumber(getLevelNumber());

		// Set arrayed properties
		logger.debug("Setting arrayed properties...");

		//-- Set aliases (keys sorted in alpha-order) (TTN-1350)
		getAliases().keySet().toArray(aliasKeys);
		Arrays.sort(aliasKeys);
		simpleAttributeMemberProps.setAliasKeys(aliasKeys);
		int i = 0;
		for (String aliasKey : aliasKeys) {
			aliasValues[i] = getMemberAlias(aliasKey);
			i++;
		}
		simpleAttributeMemberProps.setAliasValues(aliasValues);
		
		//-- Set base members
		//KRM - the root node may not have base mbrs, so we need to check for nulls.
		if(getBaseMembers() != null){
			baseMembers = new String[getBaseMembers().size()];
			System.arraycopy(getBaseMembers().toArray(), 0, baseMembers, 0, baseMembers.length);
			simpleAttributeMemberProps.setBaseMembers(baseMembers);
		}

		// Set enumerated values
		logger.debug("Setting enumerated values...");
		try {
            if (getConsolidationType() != null) 
                simpleAttributeMemberProps.setConsolidationType(getConsolidationType().intValue());
            else
                simpleAttributeMemberProps.setConsolidationType(0);
                
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}		
		
		// Return simple version of member properties
		return simpleAttributeMemberProps;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((baseMembers == null) ? 0 : baseMembers.hashCode());
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
		if (!(obj instanceof PafAttributeMemberProps))
			return false;
		
		// Check attributeMemberProps
		PafAttributeMemberProps compare = (PafAttributeMemberProps) obj;
		
		// -- Check baseMembers
		if (baseMembers == null) {
			if (compare.baseMembers != null)
				return false;
		} else if (!baseMembers.equals(compare.baseMembers))
			return false;
		
		// -- Check aliases 
		if (getAliases() == null) {
			if (compare.getAliases() != null)
				return false;
		} else if (!getAliases().equals(compare.getAliases())) {
			return false;
		}

		return true;
	}

}
