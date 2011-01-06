/*
 *	File: @(#)TestEsbCubeView.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 14, 2005  		By: Alan Farkas
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

import java.util.Properties;

import junit.framework.TestCase;

import com.essbase.api.base.EssException;
import com.essbase.api.dataquery.IEssMdAxis;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.testCommonParms;

/**
 * Junit test for the EsbCubeView object
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class TestEsbCubeView extends TestCase {

	private Properties props = testCommonParms.getConnectionProps();
	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbCubeView.EsbCubeView()'
	 */
	public void testEsbCubeView() {

		boolean isSuccess = true;
		boolean connPerOp = false;
		boolean readOnly = true;
		boolean useCluster = false;
		boolean useConnPool = true;
		String connPoolName = "TitanPool";
		String cubeViewName = null;
		String viewName = null;
		
		EsbCubeView esbCubeView = null, esbCubeView2 = null;
		
		System.out.println("***************************************************");
		System.out.println(this.getName() +  " - Test Started");
		try {
			// Create new EsbCubeView object - use connection pool
			cubeViewName = "Connection Pool Connection";
			System.out.println("-- Creating new EsbCubeView object \"" + cubeViewName +
					"\" using: " + connPoolName);
			esbCubeView = new EsbCubeView(cubeViewName, connPoolName, connPerOp);
			viewName = esbCubeView.getEssCubeView().getName();
			if (viewName.equals(cubeViewName)) {
				System.out.println("-- Verified that a Cube View was created with the name of: " + viewName);
			} else {
				isSuccess = false;
			}
			
			// Create new EsbCubeView object - use connection alias
			cubeViewName = "Connection Alias";
//			System.out.println("\n-- Creating new EsbCubeView object \"" + cubeViewName +
//					"\" using: " + esbConnAlias);
			esbCubeView2 = new EsbCubeView(cubeViewName,  props, useConnPool, connPerOp, useCluster, readOnly);

			viewName = esbCubeView2.getEssCubeView().getName();
			if (viewName.equals(cubeViewName)) {
				System.out.println("-- Verified that a Cube View was created with the name of: " + viewName);
			} else {
				isSuccess = false;
			}
		} catch (EssException ee) {
			System.out.println("Essbase Exception: " + ee.getMessage());
			isSuccess = false;
		} catch (Exception e) {
			System.out.println("Java Exception: " + e.getMessage());
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					System.out.println(" - Successful");
				}
				else {
					System.out.println(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					System.out.println("\nDisconnecting.........");
					if (esbCubeView != null) {
						esbCubeView.disconnect();						
					}
					if (esbCubeView2 != null) {
						esbCubeView2.disconnect();
					}
				} catch (PafException pfe) {
					System.out.println("\n*** " + pfe.getMessage() + "***");
					isSuccess = false;
				} catch (Exception e) {
					System.out.println("\n*** Java Exception: " + e.getMessage() + "***");
					isSuccess = false;
				} finally {
					System.out.println("\n***************************************************\n");
					esbCubeView = null;
				}
			}
		}
	}

	
	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery()'
	 */
	public void testRunMdxQuery() {

		boolean isSuccess = true;

		boolean connPerOp = false;
		boolean dataLess = false;
		boolean needCellAttributes = false;
		boolean readOnly = true;
		boolean useCluster = false;
		boolean useConnPool = true;
		int cellCount = 0, axisCount = 0;
		int essNetTimeOut = PafBaseConstants.ESS_NET_TIMEOUT_DEFAULT;
		String appName = null, dbName = null;
		String cubeViewName = "";
		String mdxSelectClause = "", mdxWhereClause = "", mdxFromClause = "";
		String mdxQuery = "";
		
		EsbCubeView esbCubeView = null;
		IEssMdAxis[] essMdAxes = null;
		IEssMdDataSet essMdDataSet = null;
			
		System.out.println("***************************************************");
		System.out.println(this.getName() +  " - Test Started");
		try {
			// Create new EsbCubeView object
			System.out.println("-- Creating new EsbCubeView object");
			cubeViewName = "Mdx Query Test";
			esbCubeView = new EsbCubeView(cubeViewName,  props, useConnPool, connPerOp, useCluster, readOnly);
			
			// Run mdx query to result set 
			appName = esbCubeView.getEsbApp();
			dbName = esbCubeView.getEsbDb(); 
			System.out.println("-- Running mdx query with data on cube: " + appName + "." + dbName); 
			mdxSelectClause = "SELECT " +
				"{([100-10], [ACTUAL]), ([200-10], [BUDGET]), ([300-10], [ACTUAL]), ([300-20], [ACTUAL]), ([300-20], [BUDGET])}" +
				" ON COLUMNS, " +
				" {[Qtr1], [Qtr2], [Qtr3],[Qtr4]} ON ROWS"; 
				//+"{Children([Market])} ON PAGES";
			mdxFromClause = " FROM " + appName + "." + dbName;
			mdxWhereClause = " WHERE ([Sales],[East])";
			
			/*{Descendants ([Measures])}*/
			mdxSelectClause = "SELECT " 
				+ " {[DPT110], [DPT120], [DPT130]} "
				+ " ON AXIS(0), "
				+ " {[FY2005]} "
				+ " ON AXIS(1), "
				+ " {[WP]} "
				+ " ON AXIS(2), "
				+ " {[ClassChn]} "
				+ " ON AXIS(3), "
				+ " {[SLS_DLR], [MD_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR]} "
				+ " ON AXIS(4), "
				+ "{[Feb], [Mar], [Apr], [May], [Jun], [Jul], [Aug], [Sep], [Oct], [Nov], [Dec], [Jan] }"
				+ " ON AXIS(5) "; 
			mdxSelectClause = "SELECT Withattr([Pkg Type], \"==\", \"Bottle\") ON COLUMNS"; 
			mdxWhereClause = "";
			mdxQuery = mdxSelectClause + mdxFromClause + mdxWhereClause; 
			essMdDataSet = esbCubeView.runMdxQuery(mdxQuery, dataLess, needCellAttributes, essNetTimeOut);
			cellCount = essMdDataSet.getCellCount();
			essMdAxes = essMdDataSet.getAllAxes();
			axisCount = essMdAxes.length;
			System.out.println("-- Mdx result set created with: " + cellCount + " cells over: " + axisCount + " axes"); 
			
			//Get meta info about all the axes eg number of tuples in each axis,
			//number of dimensions in each axis, and if the axis is a slicer axis.
			for (int axisInd = 0; axisInd < axisCount; axisInd++) {
				IEssMdAxis axis = essMdAxes[axisInd];
				if(axis.isSlicerAxis())
					System.out.print("Slicer ");

				System.out.println("Axis " + axisInd + ":" + axis.toString() + " -  Number Of Tuples : " +
								   axis.getTupleCount()
								   + " Number Of Dimensions : " +
								   axis.getDimensionCount());
			}

		} catch (PafException pfe) {
			System.out.println("\n*** " + pfe.getMessage() + "***");
			isSuccess = false;
		} catch (Exception e) {
			System.out.println("\n*** Java Exception: " + e.getMessage() + "***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					System.out.println(" - Successful");
				}
				else {
					System.out.println(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					System.out.println("\nDisconnecting.........");
					esbCubeView.disconnect();
				} catch (PafException pfe) {
					System.out.println("\n*** " + pfe.getMessage() + "***");
					isSuccess = false;
				} catch (Exception e) {
					System.out.println("\n*** Java Exception: " + e.getMessage() + "***");
					isSuccess = false;
				} finally {
					System.out.println("\n***************************************************\n");
					esbCubeView = null;
				}
			}
		}
	}

}
