/*
 *	File: @(#)ExpOpCodeTest.java 	Package: com.palladium.paf.data 	Project: Paf Base Libraries
 *	Created: Sep 5, 2007  		By: jmilliron
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
package com.palladium.paf.data;

import com.palladium.paf.PafBaseConstants;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class ExpOpCodeTest extends TestCase {

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
	
	public void testSetParms() {
		
		String descNoParm = "@DESC(@UOW_ROOT)";
		
		ExpOperation eo1 = new ExpOperation(descNoParm);
		
		assertEquals(descNoParm, eo1.toString());
		
		String[] parms = eo1.getParms();
		
		assertNotNull(parms);
		assertEquals(1, parms.length);
		
		parms[0] = parms[0] + "123";
		
		eo1.setParms(parms);
		
		assertEquals("@DESC(@UOW_ROOT123)", eo1.toString());
		
		
		
		
	}
	
	/**
	 * 
	 *  Test the ExpOperation toString().  What goes in, must come out the same.
	 *
	 */
	public void testToString() {
		
	/*START CHILDREN*/
		String childNoParm = "@CHILDREN(@UOW_ROOT)";
		
		ExpOperation eo111 = new ExpOperation(childNoParm);
		
		assertEquals(childNoParm, eo111.toString());
		
		String childOneParm = "@CHILDREN(@UOW_ROOT, L1)";
		
		ExpOperation eo22 = new ExpOperation(childOneParm);
		
		assertEquals(childOneParm, eo22.toString());
	/*END CHILDREN*/
	
	/*START ICHILDREN*/
		String iChildNoParm = "@ICHILDREN(@UOW_ROOT)";
		
		ExpOperation eo33 = new ExpOperation(iChildNoParm);
		
		assertEquals(iChildNoParm, eo33.toString());
		
		String iChildOneParm = "@ICHILDREN(@UOW_ROOT, G1)";
		
		ExpOperation eo44 = new ExpOperation(iChildOneParm);
		
		assertEquals(iChildOneParm, eo44.toString());
	/*END ICHILDREN*/
			
		
		/*START DESC*/
			String descNoParm = "@DESC(@UOW_ROOT)";
			
			ExpOperation eo1 = new ExpOperation(descNoParm);
			
			assertEquals(descNoParm, eo1.toString());
			
			String descOneParm = "@DESC(@UOW_ROOT, L1)";
			
			ExpOperation eo2 = new ExpOperation(descOneParm);
			
			assertEquals(descOneParm, eo2.toString());
		/*END DESC*/
		
		/*START IDESC*/
			String iDescNoParm = "@IDESC(@UOW_ROOT)";
			
			ExpOperation eo3 = new ExpOperation(iDescNoParm);
			
			assertEquals(iDescNoParm, eo3.toString());
			
			String iDescOneParm = "@IDESC(@UOW_ROOT, G1)";
			
			ExpOperation eo4 = new ExpOperation(iDescOneParm);
			
			assertEquals(iDescOneParm, eo4.toString());
		/*END IDESC*/
			
		/*START MEMBERS*/
			String membersOneParm = "@MEMBERS(JAVAJ)";
			
			ExpOperation eo5 = new ExpOperation(membersOneParm);
			
			assertEquals(membersOneParm, eo5.toString());
			
			String membersMultiParm = "@MEMBERS(JAVAJ1, JAVAJ2, JAVAJ3, JAVAJ4)";
			
			ExpOperation eo6 = new ExpOperation(membersMultiParm);
			
			assertEquals(membersMultiParm, eo6.toString());
		/*END MEMBERS*/
			
		/*START LEVEL*/
			String levelWithOutNestedTag = "@LEVEL(DIV09, 2)";
			
			ExpOperation eo7 = new ExpOperation(levelWithOutNestedTag);
			
			assertEquals(levelWithOutNestedTag, eo7.toString());
			
			String levelWithNestedTag = "@LEVEL(@UOW_ROOT, 2)";
			
			ExpOperation eo8 = new ExpOperation(levelWithNestedTag);
			
			assertEquals(levelWithNestedTag, eo8.toString());
		/*END LEVEL*/		
			
		/*START GEN*/
			String genWithOutNestedTag = "@GEN(DIV09, 2)";
			
			ExpOperation eo9 = new ExpOperation(genWithOutNestedTag);
			
			assertEquals(genWithOutNestedTag, eo9.toString());
			
			String genWithNestedTag = "@GEN(@UOW_ROOT, 2)";
			
			ExpOperation eo10 = new ExpOperation(genWithNestedTag);
			
			assertEquals(genWithNestedTag, eo10.toString());
		/*END GEN*/		

		/*START UOW_ROOT*/
		
			String uowTag = PafBaseConstants.UOW_ROOT;
			
			ExpOperation eo11 = new ExpOperation(uowTag);
			
			assertEquals(uowTag, eo11.toString());			
			
		/*END UOW_ROOT*/
			
		/*START PLAN_VERSION*/
			
			String planVersionTag = PafBaseConstants.PLAN_VERSION;
			
			ExpOperation eo12 = new ExpOperation(planVersionTag);
			
			assertEquals(planVersionTag, eo12.toString());			
			
		/*END PLAN_VERSION*/
			
		/*START DYNAMIC PLAN_VERSION*/
			
			//begins with @PLAN_VERSION
			String dynamicPlanVersionTag = PafBaseConstants.PLAN_VERSION + "_vs_LY";
			
			ExpOperation eo13 = new ExpOperation(dynamicPlanVersionTag);
			
			assertEquals(dynamicPlanVersionTag, eo13.toString());			

			//ends with @PLAN_VERSION
			dynamicPlanVersionTag = "_vs_LY" + PafBaseConstants.PLAN_VERSION;
			
			eo13 = new ExpOperation(dynamicPlanVersionTag);
			
			assertEquals(dynamicPlanVersionTag, eo13.toString());
			
			//contains within @PLAN_VERSION
			dynamicPlanVersionTag = "_vs_LY" + PafBaseConstants.PLAN_VERSION + "_vs_LY";
			
			eo13 = new ExpOperation(dynamicPlanVersionTag);
			
			assertEquals(dynamicPlanVersionTag, eo13.toString());
			
		/*END PLAN_VERSION*/
			
	}

}
