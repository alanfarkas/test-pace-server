/*
 *    File: @(#)ClassPathHacker.java      	Package: com.pace.base.server   Project: PafServer
 *    Created: Feb 17, 2010         		By: AFarkas
 *    Version: x.xx
 *
 *    Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
 *
 *    This software is the confidential and proprietary information of Palladium Group, Inc.
 *    ("Confidential Information"). You shall not disclose such Confidential Information and 
 *    should use it only in accordance with the terms of the license agreement you entered into
 *    with Palladium Group, Inc.
 *
 *
 *
      Date              Author                  Version     	Changes
      xx/xx/xx          xxxxxxxx          		x.xx          	..............
 * 
 */
package com.pace.base.utility;

/**
 * This utility is used to dynamically add libraries to the current thread's
 * class path
 *
 * @version x.xx
 * @author AFarkas
 *
 */
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;

public abstract class ClassPathHacker {
	
	private static final Class<?>[] parameters = new Class[] {URL.class};
	
	/**
	 * Add specified jar file to class path
	 * 
	 * @param s Fully qualified Jar file name
	 * @throws IOException
	 */
	public static void addFile(String s) throws IOException {
		addFile(new File(s));
	}

	/**
	 * Add specified jar file to class path
	 * 
	 * @param f Jar file
	 * @throws IOException
	 */
	public static void addFile(File f) throws IOException {
		addURL(f.toURI().toURL());
	}

	/**
	 *	Add specified url to class path
	 *
	 * @param s Valid url string
	 * @throws IOException
	 */
	public static void addURL(String s) throws IOException {
		addURL(new URL(s));
	}

	/**
	 * 	Add specified url to class path
	 * 
	 * @param u Valid url expression
	 * @throws IOException
	 */
	public static void addURL(URL u) throws IOException {
		Class<URLClassLoader> sysclass=URLClassLoader.class;
		try {
			Method method=sysclass.getDeclaredMethod("addURL", parameters);
			method.setAccessible(true);
			method.invoke(getClassLoader(), new Object[] {u});
		}
		catch (Throwable t) {
			t.printStackTrace();
			throw new IOException("Error, could not add URL to system classloader");
		}
	}

	/**
	 * @return the classLoader
	 */
	public static URLClassLoader getClassLoader() {
		
		// Return the class loader for the current thread
		URLClassLoader classLoader=(URLClassLoader) Thread.currentThread().getContextClassLoader();
		//	URLClassLoader classLoader = (URLClassLoader) ClassPathHacker.class.getClassLoader();
		return classLoader;
	}

	/**
	 * @return the classPath
	 */
	public static String getClassPath() {
		
		// Return the class loader's class path
		String classPath=null;
		try {
			classPath = getClassLoader().getURLs()[0].toURI().getPath();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return classPath;
	}
	
}



