/*
 *	File: @(#)PafUserSecurityTest.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Feb 8, 2008  		By: jmilliron
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
package com.palladium.paf.app;

import java.util.LinkedHashMap;

import com.palladium.paf.PafBaseConstants;
import com.palladium.utility.DomainNameParser;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafUserSecurityTest extends TestCase {

	private static final String ROLE_FILTER_KEY_1 = "ROLE FILTER KEY 1";
	private static final String EXPRESSION_3 = "Expression 3";
	private static final String EXPRESSION_2 = "Expression 2";
	private static final String EXPRESSION_1 = "Expression 1";
	private static final String DIM1 = "DIM1";
	private static final String TEST_PAF_WORK_SPEC_1 = "TEST PAF WORK SPEC 1";
	private static final String TEST_DOMAIN_NAME = "Test Domain Name";
	private static final String TEST_DISPLAY_NAME = "Test Display Name";
	private static final String TEST_USER_NAME = "Test User Name";
	private PafUserSecurity pafUserSecurity = null;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		pafUserSecurity = new PafUserSecurity();
		
		/*
		pafUserSecurity.setUserName(TEST_USER_NAME);
		
		pafUserSecurity.setDisplayName(TEST_DISPLAY_NAME);
		
		pafUserSecurity.setDomainName(TEST_DOMAIN_NAME);
		*/
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		pafUserSecurity = null;
	}

	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#getAdmin()}.
	 */
	public void testGetSetAdmin() {

		assertEquals(pafUserSecurity.getAdmin(), false);
		pafUserSecurity.setAdmin(null);
		assertEquals(pafUserSecurity.getAdmin(), false);
		pafUserSecurity.setAdmin(true);
		assertEquals(pafUserSecurity.getAdmin(), true);
		pafUserSecurity.setAdmin(false);
		assertEquals(pafUserSecurity.getAdmin(), false);
		pafUserSecurity.setAdmin(true);
		assertEquals(pafUserSecurity.getAdmin(), true);
		pafUserSecurity.setAdmin(null);
		assertEquals(pafUserSecurity.getAdmin(), false);
		
	}
	
	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#getDomainName()}.
	 */
	public void testGetSetDomainName() {
		
		assertNull( pafUserSecurity.getDomainName());
		
		pafUserSecurity.setDomainName(TEST_DOMAIN_NAME);
		
		assertNotNull( pafUserSecurity.getDomainName());
		assertEquals(pafUserSecurity.getDomainName(), TEST_DOMAIN_NAME);
	}



	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#getDisplayName()}.
	 */
	public void testGetDisplayName() {
		
		pafUserSecurity.setUserName(null);
		pafUserSecurity.setDisplayName(null);
		
		assertNull( pafUserSecurity.getDisplayName());
		
		pafUserSecurity.setUserName(TEST_USER_NAME);
		
		assertNotNull( pafUserSecurity.getDisplayName());
		assertEquals( pafUserSecurity.getDisplayName(), TEST_USER_NAME);
						
		pafUserSecurity.setDisplayName(TEST_DISPLAY_NAME);
		
		assertNotNull( pafUserSecurity.getDisplayName());
		assertEquals( pafUserSecurity.getDisplayName(), TEST_DISPLAY_NAME);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#setDisplayName(java.lang.String)}.
	 */
	public void testSetDisplayName() {
		
		assertNull( pafUserSecurity.getDisplayName());
		
		pafUserSecurity.setDisplayName(TEST_DISPLAY_NAME);
		
		assertNotNull( pafUserSecurity.getDisplayName());
		assertEquals( pafUserSecurity.getDisplayName(), TEST_DISPLAY_NAME);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#getKey()}.
	 */
	public void testGetKey() {
		
		assertNull( pafUserSecurity.getKey());
		
		pafUserSecurity.setUserName(TEST_USER_NAME);
		
		assertNotNull( pafUserSecurity.getKey());
		
		assertEquals(pafUserSecurity.getKey(), TEST_USER_NAME + DomainNameParser.AT_TOKEN + PafBaseConstants.Native_Domain_Name);
				
		pafUserSecurity.setDomainName(TEST_DOMAIN_NAME);
		
		assertNotNull( pafUserSecurity.getKey());
		
		assertEquals(pafUserSecurity.getKey(), TEST_USER_NAME + DomainNameParser.AT_TOKEN  + TEST_DOMAIN_NAME);
		
		pafUserSecurity.setUserName(null);
		
		assertNull( pafUserSecurity.getKey());
	}

	/**
	 * Test method for {@link com.palladium.paf.app.PafUserSecurity#clone()}.
	 */
	public void testClone() {

		assertNotNull( pafUserSecurity);
		
		pafUserSecurity.setUserName(TEST_USER_NAME);
		
		pafUserSecurity.setDisplayName(TEST_DISPLAY_NAME);
		
		pafUserSecurity.setDomainName(TEST_DOMAIN_NAME);
		
		LinkedHashMap<String, PafWorkSpec[]> roleFilters = new LinkedHashMap<String, PafWorkSpec[]>();
		
		PafWorkSpec pafWorkSpec1 = new PafWorkSpec();
		
		pafWorkSpec1.setName(TEST_PAF_WORK_SPEC_1);
				
		PafDimSpec pafDimSpec1 = new PafDimSpec();
		
		pafDimSpec1.setDimension(DIM1);
		pafDimSpec1.setExpressionList(new String[] { EXPRESSION_1, EXPRESSION_2, EXPRESSION_3 });
		pafDimSpec1.setSelectable(true);
		
		pafWorkSpec1.setDimSpec(new PafDimSpec[] { pafDimSpec1 });
				
		roleFilters.put(ROLE_FILTER_KEY_1, new PafWorkSpec[] { pafWorkSpec1 });
		
		pafUserSecurity.setRoleFilters(roleFilters);		
		
		PafUserSecurity clonedPafUserSec = null;
		
		clonedPafUserSec = (PafUserSecurity) pafUserSecurity.clone();
				
		assertNotNull(clonedPafUserSec);
		
		assertNotSame(pafUserSecurity, clonedPafUserSec);
		
		assertEquals(pafUserSecurity.getUserName(), clonedPafUserSec.getUserName());
		assertEquals(pafUserSecurity.getDisplayName(), clonedPafUserSec.getDisplayName());
		assertEquals(pafUserSecurity.getDomainName(), clonedPafUserSec.getDomainName());
		
		assertNotSame(pafUserSecurity.getRoleFilters(), clonedPafUserSec.getRoleFilters());
		
		assertEquals(pafUserSecurity.getRoleFilters().keySet().size(), clonedPafUserSec.getRoleFilters().keySet().size());
		
		for (String roleFilterKey : pafUserSecurity.getRoleFilters().keySet()) {
			
			assertEquals(clonedPafUserSec.getRoleFilters().containsKey(roleFilterKey), true);
			
			PafWorkSpec[] pafWorkSpecAr = pafUserSecurity.getRoleFilters().get(roleFilterKey);
			
			PafWorkSpec[] clonedPafWorkSpecAr = clonedPafUserSec.getRoleFilters().get(roleFilterKey);
			
			assertNotSame(pafWorkSpecAr, clonedPafWorkSpecAr);		
			
			assertEquals(pafWorkSpecAr.length, clonedPafWorkSpecAr.length);
			
			for (int i = 0; i < pafWorkSpecAr.length; i++ ) {
			
				assertNotSame(pafWorkSpecAr[i], clonedPafWorkSpecAr[i]);
				assertEquals(pafWorkSpecAr[i].getName(), clonedPafWorkSpecAr[i].getName());
				
				PafDimSpec[] pafDimSpecAr = pafWorkSpecAr[i].getDimSpec();
				PafDimSpec[] clonedPafDimSpecAr = clonedPafWorkSpecAr[i].getDimSpec();
				
				assertNotSame(pafDimSpecAr, clonedPafDimSpecAr);
				
				assertEquals(pafDimSpecAr.length, clonedPafDimSpecAr.length);
				
				for (int j = 0; j < pafDimSpecAr.length; j++ ) {
					
					assertNotSame(pafDimSpecAr[j], clonedPafDimSpecAr[j]);
					
					assertNotNull(clonedPafDimSpecAr[j].getDimension());
					assertEquals(pafDimSpecAr[j].getDimension(), clonedPafDimSpecAr[j].getDimension());					
					
					assertNotNull(clonedPafDimSpecAr[j].getExpressionList());
					assertEquals(pafDimSpecAr[j].getExpressionList().length, clonedPafDimSpecAr[j].getExpressionList().length);
					
					for (int t = 0; t < pafDimSpecAr[j].getExpressionList().length; t++) {
						
						assertEquals(pafDimSpecAr[j].getExpressionList()[t], clonedPafDimSpecAr[j].getExpressionList()[t]);
						
					}
				}
				
				
			}	
			
			
		}
		
	}
	
	public void testGetRoleNames() {
		
		PafUserSecurity userSecurity = new PafUserSecurity();
		
		assertNotNull(userSecurity.getRoleNames());
		assertEquals(0, userSecurity.getRoleNames().length);
		
		LinkedHashMap<String, PafWorkSpec[]> testMap = new LinkedHashMap<String, PafWorkSpec[]>();
		
		testMap.put("key1", null);
		testMap.put("key2", null);
		
		userSecurity.setRoleFilters(testMap);
		
		assertNotNull(userSecurity.getRoleNames());
		assertEquals(testMap.size(), userSecurity.getRoleNames().length);
		
	}

}
