/*
 *	File: @(#)PafDimSpecTest.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Mar 9, 2010  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafDimSpecTest extends TestCase {

	/**
	 * @param name
	 */
	public PafDimSpecTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	public void testClone() {
		
		PafDimSpec pafDimSpec = new PafDimSpec();
		
		PafDimSpec clonePafDimSpec = pafDimSpec.clone();
		
		assertNotNull(clonePafDimSpec);
		assertEquals(pafDimSpec, clonePafDimSpec);
		
		String dim1 = "dimension1";
		
		pafDimSpec.setDimension(dim1);
		clonePafDimSpec = pafDimSpec.clone();
		assertNotNull(clonePafDimSpec);
		assertNotNull(clonePafDimSpec.getDimension());
		assertEquals(pafDimSpec, clonePafDimSpec);
		
		String exp1 = "expression 1";
		
		pafDimSpec.setExpressionList(new String[] { exp1 });
		clonePafDimSpec = pafDimSpec.clone();
		assertNotNull(clonePafDimSpec);
		assertNotNull(clonePafDimSpec.getExpressionList());
		assertEquals(pafDimSpec.getExpressionList().length, clonePafDimSpec.getExpressionList().length);
		assertEquals(pafDimSpec, clonePafDimSpec);
		
	}

}
