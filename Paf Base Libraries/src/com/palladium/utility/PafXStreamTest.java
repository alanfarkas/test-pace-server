package com.palladium.utility;

import java.io.File;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;

public class PafXStreamTest extends TestCase {

	private static final Logger logger = Logger.getLogger(PafXStreamTest.class);
	
	PafXStream xs = new PafXStream();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddXSDHeader() {

		//test for null; should be null
		assertEquals(null, PafXStream.addXSDHeader(null));
		
		//test a standard string; should not change
		String str = "<this is another tag>";		
		assertEquals(str, PafXStream.addXSDHeader(str));
		
		//test a standard string; should not change
		str = "This is just a normal string";		
		assertEquals(str, PafXStream.addXSDHeader(str));		
		
		//test all the 
		testAddXSDHeaderHelper(PafXStream.PAF_APPLICATION_DEF_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_APPS);
		testAddXSDHeaderHelper(PafXStream.CUSTOM_MENU_DEF_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_CUSTOM_MENUS );
		testAddXSDHeaderHelper(PafXStream.CUSTOM_FUNCTION_DEF_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_FUNCTIONS );
		testAddXSDHeaderHelper(PafXStream.MEASURE_DEF_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_MEASURES );
		testAddXSDHeaderHelper(PafXStream.ROUNDING_RULE_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_ROUNDING_RULES );
		testAddXSDHeaderHelper(PafXStream.RULE_SET, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_RULE_SET );
		testAddXSDHeaderHelper(PafXStream.VERSION_DEF_ARRAY, PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_VERSIONS);
	
		//test a valid xsd header
		str = PafBaseConstants.XML_OPEN_TAG + PafXStream.PAF_APPLICATION_DEF_ARRAY + " " + PafBaseConstants.HTTP_WWW_THEPALLADIUMGROUP_COM_PAF_APPS + PafBaseConstants.XML_CLOSE_TAG;
		
		assertEquals(str, PafXStream.addXSDHeader(str));
	
	}
	
	/**
	 * 
	 * Test that adding of an xsd namespace to the string.
	 * 
	 * @param strToAddHeaderTo string that will have namespace header added to
	 * @param namespace namespace to add to string
	 */
	private void testAddXSDHeaderHelper(String strToAddHeaderTo, String namespace) {
		
		String str = PafBaseConstants.XML_OPEN_TAG + strToAddHeaderTo + PafBaseConstants.XML_CLOSE_TAG;
		
		logger.info("String without Header:\t" + str);
		
		String strWithHeader = PafXStream.addXSDHeader(str);		
		
		logger.info("String after Header:\t\t" + strWithHeader);
		
		assertNotNull(strWithHeader);
		assertEquals(PafBaseConstants.XML_OPEN_TAG + strToAddHeaderTo + " " + namespace + PafBaseConstants.XML_CLOSE_TAG, strWithHeader);
		
		logger.info("-------------------------------------------------------------------------------");
		
	}

	
	public void testImportExportObject() {
		
		String confDir = "C://Program Files (x86)//Pace//PafServer//Conf//";
		
		try {
			Object importedPafApps = PafXStream.importObjectFromXml(confDir + PafBaseConstants.FN_ApplicationMetaData);
			
			logger.info(importedPafApps);
			
			PafXStream.exportObjectToXml(importedPafApps, confDir + PafBaseConstants.FN_ApplicationMetaData + 2);
			
		} catch (PafConfigFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void testImportObjectFromXml1() {
				
		String filename = "invalidfile.txt";
		
		File invalidFile = new File(filename);
		
		assertFalse(invalidFile.exists());
		
		try {
			
			PafXStream.importObjectFromXml(filename);
			
			fail("Should have thrown PafConfigFileNotFoundException");
			
		} catch (PafConfigFileNotFoundException e) {
		
		}
		
		
		
	}
	
}
