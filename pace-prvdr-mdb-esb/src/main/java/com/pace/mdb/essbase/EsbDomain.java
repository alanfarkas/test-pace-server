/*
 *	File: @(#)EsbDomain.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 11, 2005  		By: Alan Farkas
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
package com.pace.mdb.essbase;


import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.domain.IEssDomain;
import com.essbase.api.session.IEssbase;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/**
 * @author Alan Farkas
 *
 */
public class EsbDomain {
	
	private IEssbase essbase = null;
	private IEssDomain essDomain = null;
	private static Logger logger = Logger.getLogger(EsbDomain.class);
	
	/**
	 * @param esbDomainName
	 * @param esbDomainUrl
	 * @param esbDomainUser
	 * @param esbDomainPswd
	 * @throws PafException 
	 */
	public EsbDomain(String esbDomainName, String esbDomainUrl, String esbDomainUser, String esbDomainPswd) throws PafException {
		
		// Sign On to the EDS domain.
		try {			
			// Create Essbase JAPI instance.
			essbase = IEssbase.Home.create(IEssbase.JAPI_VERSION);
			
			// Sign On to EDS (using the correct signon method) 
//			String japiVersion = IEssbase.JAPI_VERSION;
//			if (japiVersion.compareTo("9.5.0") >= 0) {
//				// JAPI 9.3.0 and higher
//				essDomain = essbase.signOn(esbDomainUser, esbDomainPswd, false, null, esbDomainUrl);
//			} else {
				// All earlier JAPI versions
				essDomain = essbase.signOn(esbDomainUser, esbDomainPswd, esbDomainName, esbDomainUrl);				
//			}
		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = "Essbase Exception: " + esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}
	}
	/**
	 *	Method_description_goes_here
	 *
	 */
	protected void disconnect()  {
		try {
			// Disconnect from domain
			if (essbase!= null && (essbase.isSignedOn() == true))
				essbase.signOff();
		} catch (EssException ee) {
			//throw pafException;
		} finally {
			// Clean-up unneeded objects
			essDomain = null;
			essbase = null;
		}
		
	}
	
	/**
	 * @return Returns the essDomain.
	 */
	protected IEssDomain getEssDomain() {
		return essDomain;
	}
	
	
	
	
}
