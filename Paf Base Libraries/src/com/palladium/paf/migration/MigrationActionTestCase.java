/*
 *	File: @(#)MigrationTestCase.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Aug 18, 2009  		By: jmilliron
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
package com.palladium.paf.migration;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.XMLPaceProject;
import com.palladium.utility.FileUtils;
import com.palladium.utility.PafZipUtil;

import junit.framework.TestCase;

/**
 * Used as a base test case that creates a temp conf dir with test data.  The
 * temp dir is deleted after each test case.
 *
 * @author jmilliron
 * @version	2.6.0.3
 *
 */
public class MigrationActionTestCase extends TestCase {

	protected XMLPaceProject pp = null;
	
	Set<ProjectElementId> set = new HashSet<ProjectElementId>();

	protected File tempConfDir = new File(PafBaseConstants.DN_PaceTestFldr);	
	
	protected void setUp(String paceArchiveFileName) throws Exception {
		
		super.setUp();
		
		if ( ! tempConfDir.exists() ) {
			
			assertTrue(tempConfDir.mkdir());
			
		}
		
		if ( paceArchiveFileName == null || paceArchiveFileName.trim().length() == 0 ) {
			
			paceArchiveFileName = "./test_files/pace.paf"; 
			
		} else {
			
			File paceArchiveFile = new File(paceArchiveFileName);
			
			assertTrue(paceArchiveFile.isFile());
			
		}
		
		PafZipUtil.unzipFile(paceArchiveFileName, tempConfDir.toString());
		
		pp = new XMLPaceProject(tempConfDir.getName(), set, false);
		
	}
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		
		setUp(null);
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		
		pp = null;
		
		set.clear();
		
		FileUtils.deleteDirectory(tempConfDir);
		
	}


	
}
