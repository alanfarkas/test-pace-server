/**
 * 
 */
package com.pace.base.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import junit.framework.TestCase;

/**
 * @author jmilliron
 *
 */
public class FileUtilsTest extends TestCase {

	private static final String TEST_FILES = ".\\test_files\\";
	
	private static final String TEST_FILES_PROJECT_TEMPLATE_XLSX = TEST_FILES + "project-template.xlsx";
	
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

	public void testIsFileLocked() {
		
		try {
		
			File file = new File(TEST_FILES_PROJECT_TEMPLATE_XLSX);
			
			assertFalse(FileUtils.isFileLocked(file));
			
			FileChannel channel= new RandomAccessFile(file, "rw").getChannel();
						
			FileLock lock = channel.lock();
			
			assertTrue(FileUtils.isFileLocked(file));
			
			lock.release();
			
			assertFalse(FileUtils.isFileLocked(file));
			
			channel.close();
			
		} catch (FileNotFoundException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
	}
}
