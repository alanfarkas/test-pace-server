/*
 *	File: @(#)PlanCycleTest.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Mar 8, 2010  		By: jmilliron
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
package com.pace.base.app;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PlanCycleTest extends TestCase {

	/**
	 * @param name
	 */
	public PlanCycleTest(String name) {
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
	 * Test method for {@link com.pace.base.app.PlanCycle#equals(java.lang.Object)}.
	 */
	public void testEqualsObject() {

		PlanCycle pc = new PlanCycle();
		assertEquals(pc, new PlanCycle());
		
		pc = new PlanCycle(null, null);
		assertEquals(pc, new PlanCycle());
		
		String label = "test1";
		
		pc = new PlanCycle(label, null);
		assertNotSame(pc, new PlanCycle());
		assertEquals(pc, new PlanCycle(label, null));
		assertNotSame(pc, new PlanCycle(null, label));
		
		String version = "WP";
		
		pc = new PlanCycle(label, version);
		assertNotSame(pc, new PlanCycle());
		assertEquals(pc, new PlanCycle(label, version));
		
		pc = new PlanCycle(null, version);
		assertNotSame(pc, new PlanCycle(null, version));		
		
	}

	/**
	 * Test method for {@link com.pace.base.app.PlanCycle#clone()}.
	 */
	public void testClone() {

		String label = "test1";
		String version = "WP";
		
		PlanCycle pc = new PlanCycle(label, version);
		
		PlanCycle pcClone = (PlanCycle) pc.clone();
					
		assertNotNull(pcClone);
		assertEquals(pc, pcClone);
		assertEquals(label, pcClone.getLabel());
		assertEquals(pc.getLabel(), pcClone.getLabel());
		
		assertEquals(version, pcClone.getVersion());
		assertEquals(pc.getVersion(), pcClone.getVersion());
		
		
		
	}

}
