/*
 *	File: @(#)LogUtil.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Nov 16, 2005  		By: jwatkins
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
package com.pace.base.utility;

import com.pace.base.mdb.PafDataCache;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jwatkins
 *
 */
public class LogUtil {

    public static String timedStep(String stepDesc, long startTime) {
        return (stepDesc + " completed in " + StringUtils.decimalFormat((System.currentTimeMillis() - startTime), "#,###") + " ms");
    }

	/**
	 * Generate a message that compares pre and post evaluation data cache statistics
	 * 
	 * @param dataCache Data cache statistics
	 * @param initialDCStats Pre-evaluation data cache statistics
	 * 
	 * @return Comparison of pre- and post-evaluation data cache statistics
	 */
	public static String dcStats(PafDataCache dataCache, String initialDCStats) {
		
		StringBuffer sb = new StringBuffer("\n\nData Cache Stats [Pre-Evaluation]:\n");
		sb.append(initialDCStats);
		sb.append("\nData Cache Stats [Post-Evaluation]:\n");
		sb.append(dataCache.getCurrentUsageStatsString());
		//sb.append("\n");
		
		return sb.toString();
		
		
		
	}
}
