/*
 *	File: @(#)PafExcelValueObjectUtil.java 	Package: com.pace.base.project.excel 	Project: Paf Base Libraries
 *	Created: Feb 1, 2010  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.project.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pace.base.project.ProjectElementId;

/**
 * Utility class for Excel Value Objects
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafExcelValueObjectUtil {

	/**
	 * 
	 * Creates a list of excel value objects from a string array.
	 *
	 * @param stringAr
	 * @return
	 */
	public static List<PafExcelValueObject> createListOfPafExcelValueObjects(String[] stringAr) {
		
		List<PafExcelValueObject> valueObjectList = new ArrayList<PafExcelValueObject>();
		
		if ( stringAr != null ) {
			
			for ( String string : stringAr ) {
				
				valueObjectList.add(PafExcelValueObject.createFromString(string));
				
			}
			
		}
		
		return valueObjectList;
		
	}
	
	/**
	 * 
	 * Creates a list of excel value objects from a string array.
	 *
	 * @param stringAr
	 * @return
	 */
	public static List<PafExcelValueObject> createListOfDynamicReferencePafExcelValueObjects(String[] stringAr, Map<String, String> dynamicRefMap) {
		
		List<PafExcelValueObject> valueObjectList = new ArrayList<PafExcelValueObject>();
		
		if ( stringAr != null ) {
			
			for ( String string : stringAr ) {
				
				PafExcelValueObject excelValueObject = PafExcelValueObject.createFromFormulaReferenceMap(string, dynamicRefMap);
				
				if ( excelValueObject != null ) {
					
					valueObjectList.add(excelValueObject);
					
				}
				
			}
			
		}
		
		return valueObjectList;
		
	}
	
	
	/**
	 * 
	 * Resolves a string to a dynamic reference map.  If a dynamic reference is found, will create a PafExcelValueObject as a 
	 * formula, otherwise would be string.  
	 *
	 * @param tryToResolveDynamicReference if true, will try to resolve the dynamic reference using map
	 * @param elementToResolve string to resolve using the dynamic reference
	 * @param dynamicRefMap map of dynamic references
	 * @return a new PafExcelValueObject
	 */
	public static PafExcelValueObject resolveDynamicReference(boolean tryToResolveDynamicReference, String elementToResolve, Map<String, String> dynamicRefMap) {
		
		PafExcelValueObject pafExcelValueObject = null;
		
		if ( tryToResolveDynamicReference && elementToResolve != null && dynamicRefMap != null &&
				dynamicRefMap.containsKey(elementToResolve)) {
			
			pafExcelValueObject = PafExcelValueObject.createFromFormula(dynamicRefMap.get(elementToResolve));
			
		} else {
		
			pafExcelValueObject = PafExcelValueObject.createFromString(elementToResolve);
		
		}
		
		return pafExcelValueObject;
		
	}
	
	
	
}
