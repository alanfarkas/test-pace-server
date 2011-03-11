/*
 *	File: @(#)ViewSectionUtil.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: May 22, 2006  		By: jmilliron
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

import com.pace.base.view.PafAxis;
import com.pace.base.view.PafViewSection;
import com.pace.base.view.PageTuple;

/**
 * A utility class to help with view section and information within them.
 *
 * @version	1.00
 * @author jmilliron
 *
 */
public class PafViewSectionUtil {
	
	/**
	 * Tries to get the paf axis for a dimension within a view section.
	 * 
	 * @param pafViewSection
	 *            Complex View Section object
	 * @param pafDimensionName
	 *            Name of dimension to search
	 * 
	 * @return PafAxis if found, a paf axis object holding the state of which axis the dimension is on
	 */
	public static PafAxis getDimensionAxis(PafViewSection pafViewSection, String pafDimensionName) {
		
		PafAxis pafAxis = null;
				
		
		//if view section is null and dimension name is null, don't do
		if ( pafViewSection != null && pafDimensionName != null) {
						
			//hold temp int var for axis int
			Integer pafAxisIntValue = null;
			
			//if page tuples are present
			if ( pafViewSection.getPageTuples() != null ) {
				
				//loop over the page tuples and check the axis attribute for a macth with the pafDimensionName
				for (PageTuple pageTuple : pafViewSection.getPageTuples()) {
					
					//if dimension name is found on page tuple, set int value to page
					if ( pageTuple.getAxis().equalsIgnoreCase(pafDimensionName) ) {
						
						//hold temp int value
						pafAxisIntValue = PafAxis.PAGE;
						break;
					}
				}
			}
			
			//if tmp int value still null
			if ( pafAxisIntValue == null ) {
			
				//loop through column dimension names and search for pafDimensionName
				for ( String columnDimName : pafViewSection.getColAxisDims() ) {
					
					//if match, then set int value to col and break;
					if ( columnDimName.equalsIgnoreCase( pafDimensionName )) {
						
						pafAxisIntValue = PafAxis.COL;
						break;
					}
					
				}			
			
			}

			//if tmp int value still null
			if ( pafAxisIntValue == null ) {
							
				//loop through row dimension names and search for pafDimensionName
				for ( String rowDimName : pafViewSection.getRowAxisDims() ) {
					
					//if match, then set int value to row and break;
					if ( rowDimName.equalsIgnoreCase( pafDimensionName )) {
						
						pafAxisIntValue = PafAxis.ROW;
						break;
						
					}
					
				}
				
			}
		
			//if int value is not null, create new paf axis object
			if ( pafAxisIntValue != null ) {
				
				pafAxis = new PafAxis(pafAxisIntValue);
				
			}
			
		}		
		
		return pafAxis;
		
	}

}
