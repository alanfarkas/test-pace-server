package com.palladium.paf.project;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.palladium.paf.project.excel.PafExcelInputTest;
import com.palladium.paf.project.excel.PafExcelValueObjectTest;
import com.palladium.paf.project.utils.PafExcelUtilTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.palladium.paf.project");
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