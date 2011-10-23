/*
 *	File: @(#)SeasonListTest.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
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
package com.pace.base.app;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class SeasonListTest extends TestCase {

	/**
	 * @param name
	 */
	public SeasonListTest(String name) {
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

		SeasonList sl = new SeasonList();
		
		SeasonList cloneSL = sl.clone();
		
		assertNotNull(cloneSL);
		assertEquals(sl, cloneSL);
		assertNotNull(cloneSL.getSeasons());
		assertEquals(0, cloneSL.getSeasons().size());
		
		Season season1 = new Season();		
				
		String id = "test id 1";    
		boolean isOpen = false;
		String planCycle = "test plan cycle 1";
		String year = "test year 1";
		String timePeriod = "test time period 1";
		PafDimSpec[] otherDims = null;
		
		season1.setId(id);
		season1.setOpen(isOpen);
		season1.setPlanCycle(planCycle);
		season1.setYears(new String[]{year});
		season1.setTimePeriod(timePeriod);
		
		otherDims = new PafDimSpec[3];
		
		otherDims[0] = new PafDimSpec();
		
		otherDims[1] = new PafDimSpec();
		
		otherDims[2] = new PafDimSpec();
		
		String dim1 = "dim1";
		String dim2 = "dim2";
		String dim3 = "dim3";
		
		String exp1 = "exp1";
		String exp2 = "exp2";
		String exp3 = "exp3";
		
		otherDims[0].setDimension(dim1);
		otherDims[0].setExpressionList(new String[] { exp1 });		
		
		otherDims[1].setDimension(dim2);
		otherDims[1].setExpressionList(new String[] { exp2 });
		
		otherDims[2].setDimension(dim3);
		otherDims[2].setExpressionList(new String[] { exp3 });
		
		season1.setOtherDims(otherDims);
		
		Season season2 = new Season();		
		
		String id2 = "test id 2";    
		boolean isOpen2 = true;
		String planCycle2 = "test plan cycle 2";
		String year2 = "test year 2";
		String timePeriod2 = "test time period 2";
		PafDimSpec[] otherDims2 = null;
		
		season2.setId(id2);
		season2.setOpen(isOpen2);
		season2.setPlanCycle(planCycle2);
		season2.setYears(new String[]{year2});
		season2.setTimePeriod(timePeriod2);
		
		otherDims2 = new PafDimSpec[3];
		
		otherDims2[0] = new PafDimSpec();
		
		otherDims2[1] = new PafDimSpec();
		
		otherDims2[2] = new PafDimSpec();
		
		otherDims2[0].setDimension(dim1);
		otherDims2[0].setExpressionList(new String[] { exp1 });		
		
		otherDims2[1].setDimension(dim2);
		otherDims2[1].setExpressionList(new String[] { exp2 });
		
		otherDims2[2].setDimension(dim3);
		otherDims2[2].setExpressionList(new String[] { exp3 });
		
		season2.setOtherDims(otherDims2);
		
		sl.addSeason(season1);

		cloneSL = sl.clone();
		
		assertNotNull(cloneSL);
		assertEquals(sl, cloneSL);
		assertNotNull(cloneSL.getSeasons());
		assertEquals(1, cloneSL.getSeasons().size());
		assertEquals(sl.getSeasons(), cloneSL.getSeasons());
		
		sl.addSeason(season2);
		
		cloneSL = sl.clone();
		
		assertNotNull(cloneSL);
		assertEquals(sl, cloneSL);
		assertNotNull(cloneSL.getSeasons());
		assertEquals(2, cloneSL.getSeasons().size());
		assertEquals(sl.getSeasons(), cloneSL.getSeasons());
		
	}

}
