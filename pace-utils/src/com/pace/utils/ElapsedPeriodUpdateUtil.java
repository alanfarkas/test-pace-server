/*
 *	File: @(#)ElapsedPeriodUpdateUtil 	Package: com.palladium.paf.utils	Project: PafUtilities 
 *	Created: August 22nd, 2006  		By: JMilliron
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
package com.pace.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.utility.PafXStream;
import com.pace.utils.model.ElapsedPeriod;

/**
 * Used to update the elapsed periods
 * 
 * @author Jason Milliron
 * @version x.xx
 * 
 */

public class ElapsedPeriodUpdateUtil {

	private static final String INPUT_PARAM_ERROR = "Input parameter can not be null";

	// logger
	private static Logger logger = Logger
			.getLogger(ElapsedPeriodUpdateUtil.class);

	// holds new elapsed period
	private ElapsedPeriod newElapsedPeriod = null;

	// holds paf application definition array
	private PafApplicationDef[] pafAppDefAr = null;

	private static Properties settings = null;

	/**
	 * @param newElapsedPeriod
	 *            New Elapsed Period
	 * @param pafAppDefAr
	 *            Current Paf Application Definition Array
	 * @throws java.lang.IllegalArgumentException
	 */
	public ElapsedPeriodUpdateUtil(ElapsedPeriod newElapsedPeriod,
			PafApplicationDef[] pafAppDefAr) {

		if ((newElapsedPeriod == null) || (pafAppDefAr == null)) {

			throw new IllegalArgumentException("An input param is null");

		}

		this.newElapsedPeriod = newElapsedPeriod;
		this.pafAppDefAr = pafAppDefAr;

	}

	/**
	 * 
	 * Loads in the property file
	 * 
	 * @throws java.lang.Exception Thrown if elapsedperiod.properties file can't be found
	 */
	private static void loadPropertyFile() throws Exception {

		// Get the properties file.
		settings = new Properties();
		// Get a file stream.
		FileInputStream fileIn = null;

		try {
			fileIn = new FileInputStream("elapsedperiod.properties");
		} catch (FileNotFoundException ex) {

			throw new Exception("Cannot find file: "
					+ "elapsedperiod.properties");

		}

		settings.load(fileIn);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			loadPropertyFile();
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}

		if (settings != null) {
			try {

				String pafServerHome = settings.getProperty("pafServerHome");

				if (pafServerHome != null && pafServerHome.trim().length() > 0) {

					// import new elapsed period
					ElapsedPeriod newElapsedPeriod = ElapsedPeriodUpdateUtil
							.importNewElapsedPeriod(pafServerHome + File.separator
									+ PafBaseConstants.DN_TransferFldr
									+ File.separator
									+ PafBaseConstants.FN_ElapsedLastPeriod);

					// import the paf applicaiton def array
					PafApplicationDef[] pafAppsDef = ElapsedPeriodUpdateUtil
							.importPafApplicationDefAr(pafServerHome + File.separator
									+ PafBaseConstants.DN_ConfFldr
									+ File.separator
									+ PafBaseConstants.FN_ApplicationMetaData);

					// instantiate the elapsed period update util
					ElapsedPeriodUpdateUtil elapsedPeriodUpadteUtil = new ElapsedPeriodUpdateUtil(
							newElapsedPeriod, pafAppsDef);

					// if new elapsed periods exists
					if (elapsedPeriodUpadteUtil
							.isElapsedPeriodInfoNewerThanCurrent()) {

						// update and save new elapsed periods in paf
						// application
						// definition array
						elapsedPeriodUpadteUtil.exportUpdatedElapsedPeriods();

						logger.info("Successfully updated elapsed period.");

					} else {

						logger
								.info("New elapsed period is the same as current elapsed period.");

					}
					
				}

			} catch (FileNotFoundException e) {

				logger
						.info("Elapsed Period Utility can not run because input file: "
								+ e.getMessage() + " is missing.");

			} catch (IllegalArgumentException iae) {

				logger
						.info("A runtime exception occured.  This could mean that the elapsed period or "
								+ " PafApplicationDef[] was null. Error: "
								+ iae.getMessage());

			}

		}

	}

	/**
	 * @param fileName
	 *            input path+file name
	 * @return new elapsed period
	 * @throws java.io.FileNotFoundException
	 * @throws java.lang.IllegalArgumentException
	 * @throws java.lang.ClassCastException
	 */
	public static ElapsedPeriod importNewElapsedPeriod(String fileName)
			throws FileNotFoundException {

		// if input param is null, throw exception
		if (fileName == null) {

			throw new IllegalArgumentException(INPUT_PARAM_ERROR);

		}

		// buffered reader to hold the file input
		BufferedReader br = null;

		// tmp elapase period
		ElapsedPeriod newElapsedPeriod = null;

		// elpased period file
		File elapsedPeriodFile = new File(fileName);

		// if elapsed period file does not exist
		if (!elapsedPeriodFile.exists() || !elapsedPeriodFile.isFile()) {

			throw new FileNotFoundException(fileName);

		}

		try {

			// create buffered reader
			br = new BufferedReader(new FileReader(elapsedPeriodFile));

			// line to hold current line of buffered reader
			String thisLine = null;

			// list to hold all lines from buffered reader
			List<String> arList = new ArrayList<String>();

			// while more lines in buffered reader exist
			while ((thisLine = br.readLine()) != null) {

				// if empty line, add null to list, else add line
				if (thisLine.trim().length() == 0) {
					arList.add(null);
				} else {
					arList.add(thisLine.trim());
				}

			}

			// if week or year exist
			if ((arList.size() == 1) || (arList.size() == 2)) {

				// create new elapsed period
				newElapsedPeriod = new ElapsedPeriod();

				// set week
				newElapsedPeriod.setWeek(arList.get(0));

				// if year exist
				if (arList.size() == 2) {

					// set year
					newElapsedPeriod.setYear(arList.get(1));
				}

			} else {

				// log error
				logger.error("File " + fileName
						+ " didn't contain valid information");

			}

		}

		// catch io exception thrown by FileReader
		catch (IOException ex) {

			logger.error(ex.getMessage());

		} finally {

			// if buffered reader is not null, try to close file handle
			if (br != null) {

				try {

					// close file handle
					br.close();

				} catch (IOException e) {

					logger.error(e.getMessage());

				}
			}

		}

		return newElapsedPeriod;
	}

	/**
	 * Method to import the Paf Application Array
	 * 
	 * @param fileName
	 *            input path+file name
	 * @return Paf Application Definition Array
	 * @throws java.lang.IllegalArgumentException
	 * @throws java.lang.ClassCastException
	 */
	public static PafApplicationDef[] importPafApplicationDefAr(String fileName) {

		// if input param is null, throw exception
		if (fileName == null) {

			throw new IllegalArgumentException(INPUT_PARAM_ERROR);

		}

		PafApplicationDef[] appDefAr = null;

		try {
			// import paf application def array fom input file
			appDefAr = (PafApplicationDef[]) PafXStream
					.importObjectFromXml(fileName);
		} catch (PafConfigFileNotFoundException e) {

			logger.error(e.getMessage());

		}

		return appDefAr;

	}

	/**
	 * Automatically generated method: toString
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * @return true if new elapsed periods are different from current value
	 * @throws java.lang.NullPointerException
	 */
	public boolean isElapsedPeriodInfoNewerThanCurrent() {

		// for each app application def in the array
		for (PafApplicationDef appDef : pafAppDefAr) {

			// if elapsed period for week exists
			if (newElapsedPeriod.getWeek() != null) {

				// if current last period does not equal new elaspsed period
				if (!appDef.getLastPeriod().equals(newElapsedPeriod.getWeek())) {

					return true;

				}

			}

			// if elapsed period for year exists
			if (newElapsedPeriod.getYear() != null) {

				if (!appDef.getCurrentYear().equals(newElapsedPeriod.getYear())) {

					return true;

				}

			}

		}

		// if no match, return false
		return false;
	}

	/**
	 * Exports the updated Elapsed periods
	 * 
	 * @throws java.lang.NullPointerException
	 */
	public void exportUpdatedElapsedPeriods() {

		// for each paf applicaton def in array
		for (PafApplicationDef appDef : pafAppDefAr) {

			// if elapsed period for week exists
			if (newElapsedPeriod.getWeek() != null) {

				// if current last period does not equal new elaspsed period
				if (!appDef.getLastPeriod().equals(newElapsedPeriod.getWeek())) {

					logger.info("Old Last Period: " + appDef.getLastPeriod());

					// set last period from new week value
					appDef.setLastPeriod(newElapsedPeriod.getWeek());

					logger.info("New Last Period: " + appDef.getLastPeriod());

				}

			}

			// if elapsed period for year exists
			if (newElapsedPeriod.getYear() != null) {

				if (!appDef.getCurrentYear().equals(newElapsedPeriod.getYear())) {

					logger.info("Old Year: " + appDef.getCurrentYear());

					// set current year from new year value
					appDef.setCurrentYear(newElapsedPeriod.getYear());

					logger.info("New Year: " + appDef.getCurrentYear());

				}

			}

		}
		
		String pafServerHome = settings.getProperty("pafServerHome");

		// export object to filesystem
		PafXStream.exportObjectToXml(pafAppDefAr, pafServerHome + File.separator
				+ PafBaseConstants.DN_ConfFldr + File.separator
				+ PafBaseConstants.FN_ApplicationMetaData);

	}

}
