/*
 *	File: @(#)DomainNameParserTest.java 	Package: com.palladium.utility 	Project: Paf Base Libraries
 *	Created: Jan 28, 2008  		By: jmilliron
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
package com.palladium.utility;

import junit.framework.TestCase;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class DomainNameParserTest extends TestCase {

	private static final String DOMAIN_NAME = "corp";
	
	private static final String USER_NAME = "javaj";
	
	/**
	 *  Method_description_goes_here
	 *
	 * @throws java.lang.Exception
	 */
	public void setUp() throws Exception {
	}

	/**
	 *  Method_description_goes_here
	 *
	 * @throws java.lang.Exception
	 */
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.palladium.paf.adminconsole.global.util.DomainNameParser#DomainParser(java.lang.String)}.
	 */
	public void testDomainParser() {

		DomainNameParser dp = new DomainNameParser(null);
		
		dp = new DomainNameParser(DOMAIN_NAME + "\\" + USER_NAME);
		
		assertEquals(dp.getUserName(), USER_NAME);
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser(USER_NAME + "@" + DOMAIN_NAME);

		assertEquals(dp.getUserName(), USER_NAME);
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser("\\");
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
		dp = new DomainNameParser("@");

		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());				
		
		dp = new DomainNameParser(USER_NAME + "@@" + DOMAIN_NAME);

		assertEquals(dp.getUserName(), USER_NAME + "@");
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser(DOMAIN_NAME + "\\\\" + USER_NAME);
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
		dp = new DomainNameParser(null);
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
		dp = new DomainNameParser("Milliron\\, Jason@adg.com");
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
		dp = new DomainNameParser("Milliron\\, Jason@" + DOMAIN_NAME, DomainNameParser.AT_TOKEN);
		
		assertEquals(dp.getUserName(), "Milliron\\, Jason");
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser("cat@hat@" + DOMAIN_NAME, DomainNameParser.AT_TOKEN);
		
		assertEquals(dp.getUserName(), "cat@hat");
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser("cat@hat@" + DOMAIN_NAME, DomainNameParser.BACK_SLASH_TOKEN);
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
		dp = new DomainNameParser("cat@hat@" + DOMAIN_NAME);
		
		assertEquals(dp.getUserName(), "cat@hat");
		assertEquals(dp.getDomainName(), DOMAIN_NAME);
		
		dp = new DomainNameParser("Milliron\\cat@hat@" + DOMAIN_NAME);
		
		assertNull(dp.getUserName());
		assertNull(dp.getDomainName());
		
	}
	
	public void testIsValidDomainUserName() {
		
		assertEquals(false, DomainNameParser.isValidDomainUserName(null));
		assertEquals(false, DomainNameParser.isValidDomainUserName("@"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("\\"));
		assertEquals(false, DomainNameParser.isValidDomainUserName(DOMAIN_NAME + "\\\\" + USER_NAME));
		assertEquals(true, DomainNameParser.isValidDomainUserName("javaj@adg.com"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("corp/javaj"));
		assertEquals(true, DomainNameParser.isValidDomainUserName("corp@@javaj"));
		assertEquals(true, DomainNameParser.isValidDomainUserName("corp\\javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("@javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("javaj@"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("\\javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("javaj\\"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("corp@@ja\\vaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("co\\rp@@javaj"));
		assertEquals(true, DomainNameParser.isValidDomainUserName("co\rp@@javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("co\\@\\@javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("co@aaa\\aa@\\javaj"));
		assertEquals(false, DomainNameParser.isValidDomainUserName("co\\rp@javaj"));
		assertEquals(true, DomainNameParser.isValidDomainUserName("cat@hat@adg.com"));

		//TODO: write some kind of replace for \t, \t, etc so they are escaped
		//assertEquals(false, DomainNameParser.isValidDomainUserName("co\rp@javaj"));
		//assertEquals(false, DomainNameParser.isValidDomainUserName("co\np@javaj"));
		
		//TODO: read in a string in this format from disk and validate
		//assertEquals(false, DomainNameParser.isValidDomainUserName("co\,rp@javaj"));
		
		
		//override split token
		assertEquals(false, DomainNameParser.isValidDomainUserName("corp\\javaj", DomainNameParser.AT_TOKEN));
		assertEquals(true, DomainNameParser.isValidDomainUserName("corp\\javaj", DomainNameParser.BACK_SLASH_TOKEN));
		assertEquals(true, DomainNameParser.isValidDomainUserName("corp\\javaj", null));
		assertEquals(false, DomainNameParser.isValidDomainUserName("corp\\javaj", "Z"));
		
		
	}
	
}