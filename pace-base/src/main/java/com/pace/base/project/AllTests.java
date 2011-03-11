package com.pace.base.project;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.pace.base.project.excel.PafExcelInputTest;
import com.pace.base.project.excel.PafExcelValueObjectTest;
import com.pace.base.project.utils.PafExcelUtilTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.pace.base.project");
		//$JUnit-BEGIN$
		suite.addTestSuite(PaceProjectTest.class);
		suite.addTestSuite(XMLPaceProjectTest.class);
		suite.addTestSuite(PafXStreamElementItemTest.class);
		suite.addTestSuite(ZipPaceProjectTest.class);
		suite.addTestSuite(ExcelPaceProjectTest.class);
		suite.addTestSuite(PafExcelInputTest.class);
		suite.addTestSuite(PafExcelValueObjectTest.class);
		suite.addTestSuite(PafExcelUtilTest.class);
		//$JUnit-END$
		return suite;
	}

}