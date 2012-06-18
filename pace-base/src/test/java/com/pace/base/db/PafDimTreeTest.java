/*
 *	File: @(#)PafDimTreeTest.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Jan 28, 2007  			By: AFarkas
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
package com.pace.base.db;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.mdb.PafAttributeTree;
import com.pace.base.mdb.PafBaseTree;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.mdb.PafDimTree.DimTreeType;

/**
 * PafDimTree Unit Test
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafDimTreeTest extends TestCase {

//	private static final Properties connectionProps = testCommonParms.getConnectionProps();
	private static final Logger logger = Logger.getLogger(PafDimTreeTest.class);

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
    
	/**
	 * Test method for {@link com.pace.base.mdb.PafDimTree#getTreeType()}.
	 */
	public void testGetTreeType1() {

		boolean isSuccess = false;
		PafDimTree attrTree = new PafAttributeTree();
		
		try {
			logger.info("");
			logger.info("Running unit test: testGetTreeType() against an attribute tree");
			if (attrTree.getTreeType() == DimTreeType.Attribute) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	/**
	 * Test method for {@link com.pace.base.mdb.PafDimTree#getTreeType()}.
	 */
	public void testGetTreeType2() {

		boolean isSuccess = false;
		PafDimTree baseTree = new PafBaseTree();

		try {
			logger.info("");
			logger.info("Running unit test: testGetTreeType() against a base tree");
			if (baseTree.getTreeType() == DimTreeType.Base) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

}
