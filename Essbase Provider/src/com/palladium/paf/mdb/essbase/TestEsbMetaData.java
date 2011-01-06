/*
 *	File: @(#)TestEsbMetaData.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 8, 2005  		By: Alan Farkas
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
package com.palladium.paf.mdb.essbase;

import java.util.List;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.PafAttributeTree;
import com.palladium.paf.mdb.PafBaseTree;
import com.palladium.paf.mdb.PafDimTree;
import com.palladium.paf.mdb.PafMdbProps;
import com.palladium.paf.mdb.TreeTraversalOrder;
import com.palladium.paf.mdb.testCommonParms;

/**
 * Test the EsbMetaData Class
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class TestEsbMetaData extends TestCase {

	private Properties props = testCommonParms.getConnectionProps();
	private Properties sampleProps = testCommonParms.getConnectionSampleBasicProps();
	private int essNetTimeOut = 0;
	private long startTime = 0, stopTime = 0, elapsedTime = 0;
	private static Logger logger = Logger.getLogger("TestEsbMetaData");

	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getDimension(String, String, int, ArrayList)'
	 */
	public void testGetDimension() {
				
		boolean isSuccess = true;
		List<String> memberList = null;
		String branch = "Product";
		EsbMetaData esbMetaData = null;
		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy - " + branch);
			pafBaseTree = esbMetaData.getBaseDimension(0, branch, 0);

			// Print out Essbase hierarchy in post-traversal order
			logger.info("\n-- Displaying Product Hierarchy (Post-Order)");
			memberList = pafBaseTree.getMemberNames(TreeTraversalOrder.POST_ORDER);
			for (String member:memberList) {
				int generation = pafBaseTree.getMember(member).getMemberProps().getGenerationNumber();
			    // indentation routine
				for (int i = 0; i < generation; i++)
			        System.out.print("\t");
				logger.info (member);
			}

			// Print out Essbase hierarchy in pre-traversal order
			logger.info("\n-- Displaying Product Hierarchy (Pre-Order)");
			logger.info(pafBaseTree.toString());
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}


	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getDimension(String, String, int, ArrayList)'
	 */
	public void testGetDimension2() {
				
		boolean isSuccess = true;
		List<String> memberList = null;
//		String branch = "Product";
		String branch = "DIV01";
//		String branch = "LBailey";
		EsbMetaData esbMetaData = null;
		PafBaseTree pafBaseTree = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase branch
			logger.info("-- Getting Product hierarchy - " + branch);
			startTime = System.currentTimeMillis();
			pafBaseTree = esbMetaData.getBaseDimension(0,branch, 0);
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;

			// Print out Essbase hierarchy in post-traversal order
			logger.info("\n-- Displaying Product Hierarchy (Post-Order)");
			memberList = pafBaseTree.getMemberNames(TreeTraversalOrder.POST_ORDER);
			for (String member:memberList) {
				int generation = pafBaseTree.getMember(member).getMemberProps().getGenerationNumber();
			    // indentation routine
				for (int i = 0; i < generation; i++)
			        System.out.print("\t");
				logger.info (member);
			}

			// Print out Essbase hierarchy in pre-traversal order
			logger.info("\n-- Displaying Product Hierarchy (Pre-Order)");
			logger.info(pafBaseTree.toString());
			
			// Log elapsed time
			elapsedTime = stopTime - startTime;
			logger.info("-- Completed in " + elapsedTime / 1000.0 + " seconds\n");
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getAttributeDimension(int, String, MdbProps)'
	 */
	public void testGetAttributeDimension() {
				
		boolean isSuccess = true;
		String branch = "Purpose";
//		String branch = "Population";
		EsbMetaData esbMetaData = null;
		PafDimTree pafDimTree = null;
		PafMdbProps mdbProps = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
//			esbMetaData = new EsbMetaData(sampleProps);
			
			// Get MDB Properties
			mdbProps = esbMetaData.getMdbProps();
			
			// Get Essbase branch
			logger.info("-- Getting Attribute Hierarchy - " + branch);
			startTime = System.currentTimeMillis();
			pafDimTree = esbMetaData.getAttributeDimension(essNetTimeOut, branch, mdbProps); 
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;

			// Print out Essbase hierarchy in pre-traversal order
			logger.info("\n-- Displaying Attribute Tree (Pre-Order)");
			logger.info(pafDimTree.toString());
			
			// Log elapsed time
			logger.info("-- Completed in " + elapsedTime / 1000.0 + " seconds\n");
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafDimTree = null;
				}
			}
		}
	}


	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getAttributeDimension(int, String, MdbProps)'
	 */
	public void testGetAttributeDimensionValidation() {
				
		boolean isSuccess = true;
		String branch = "Purpose";
//		String branch = "Population";
		EsbMetaData esbMetaData = null;
		PafAttributeTree pafAttrTree = null, pafAttrTreeOld = null;
		PafMdbProps mdbProps = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
//			esbMetaData = new EsbMetaData(sampleProps);
			
			// Get MDB Properties
			mdbProps = esbMetaData.getMdbProps();
			
			// Get Attribute branch (new method)
			logger.info("-- Getting Attribute Hierarchy - " + branch);
			startTime = System.currentTimeMillis();
			pafAttrTree = esbMetaData.getAttributeDimension(essNetTimeOut, branch, mdbProps); 
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			
			
			// Log elapsed time
			logger.info("--Completed in " + elapsedTime / 1000.0 + " seconds\n");
			
			// Compare both trees
			logger.info("-- Comparing both trees... ");
			if (!pafAttrTree.equals(pafAttrTreeOld)) {
				isSuccess = false;
			}
			
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafAttrTree = null;
				}
			}
		}
	}


	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getBaseDimension(int, String)'
	 */
	public void testGetBaseDimensionValidation() {
				
		boolean isSuccess = true;
//		String branch = "Time";
		String branch = "Product";
//		String branch = "CBowman";
//		branch = "Measures";
		EsbMetaData esbMetaData = null;
		PafBaseTree pafBaseTree = null, pafBaseTreeOld = null;
//		props.setProperty("APPLICATION", "IPP_AOP");
//		props.setProperty("DATABASE", "IPP_AOP");
//		branch = "PRODUCT";
//		props.setProperty("APPLICATION", "Self");props.setProperty("DATABASE", "Self");branch = "time";
//		props.setProperty("APPLICATION", "CA03");props.setProperty("DATABASE", "CA03");branch = "Accounts";

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
//			esbMetaData = new EsbMetaData(sampleProps);
			
			// Get Base dimension branch
			logger.info("-- Getting Dimension Hierarchy - " + branch);
			startTime = System.currentTimeMillis();
			pafBaseTree = esbMetaData.getBaseDimension(essNetTimeOut, branch); 
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			
			// Log elapsed time
			logger.info("--Completed in " + elapsedTime / 1000.0 + " seconds\n");
			
			// Compare both trees
			logger.info("-- Comparing both trees... ");
			if (!pafBaseTree.equals(pafBaseTreeOld)) {
				isSuccess = false;
			}
			
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}


	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbMetaData.getQueriedMembers(String)'
	 */
	public void testGetQueriedMembers() {

		boolean isSuccess = true;
		int essNetTimeOut = PafBaseConstants.ESS_NET_TIMEOUT_DEFAULT;
		final String mdxSelect = "SELECT Withattr([Pkg Type], \"==\", \"Bottle\" ) ON AXIS(0)";
		String[] members = null;
		EsbMetaData esbMetaData = null;

		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(sampleProps);

			// Run mdx query
			logger.info("-- Running Mdx query - " + mdxSelect);
			EsbCubeView esbCubeView = new EsbCubeView("Attribute Query", sampleProps);
			members = esbMetaData.getQueriedMembers(esbCubeView, mdxSelect, essNetTimeOut);

			// Display the returned members
			if (members != null) {
				logger.info("\n-- Displaying returned members:");				
				for (String member:members) {
					logger.info (member);
				}
			} else {
				logger.info("\n-- No members returned:");				
			}

		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
				try {
					// Disconnect from Essbase
					logger.info("Disconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					esbMetaData = null;
				}
			}
		}
	}


} 
