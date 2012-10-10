/*
 *	File: @(#)StringOdometer.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Sep 20, 2005  			By: Alan Farkas / Jim Watkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2012 Alvarez and Marsal Software, LLC. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Alvarez and Marsal Software, LLC.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Alvarez and Marsal Software, LLC.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base.utility;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Iterates through an array of string lists, where each list represents a separate 
 * odometer "dial".
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class StringOdometer implements IOdometer {
	int[] iterators;
	List<String>[] lists;
    int[] listSizes;
    boolean atTop = true;
    
    
 	/**
 	 * 	Create odometer using a map and a key array that implies the order
 	 * 	of elements within the odometer
 	 * 
 	 * @param memberMap Map of element lists
 	 * @param keyArray Array that specifies the order of the element lists within the odometer
 	 */
 	@SuppressWarnings("unchecked")
	public <T, K> StringOdometer(Map<K, List<T>> memberMap, K[] keyArray) {
		this((List<String>[]) CollectionsUtil.convertToArrayOfLists(memberMap, keyArray));
	}

    
	public StringOdometer(List<String>[] lists) {
        iterators = new int[lists.length];
        listSizes = new int[lists.length];
        this.lists = lists;
        
        
        // initialize structures and roll all dials to first position
        for (int i = 0; i < lists.length; i++) {
        	listSizes[i] = lists[i].size() - 1;
         }
              
        reset();
    }
    

	public void reset() {
        for (int i = 0; i < iterators.length; i++) {
            reset(i);
        }   

        // decrement lowest level pointer so hasNext works naturally
        iterators[0]--;
 
        atTop = true;
   }
    
	public boolean hasNext() {
		
        for (int i = 0; i < iterators.length; i++) {
            if (hasNext(i))  return true;
        } 
        return false;
    }
    
	public boolean hasNext(int i) {
		if (iterators[i] < listSizes[i]) {
			return true; 
		} else {
			return false;
		}
	}
    
    public void increment() {
        boolean doneInc = false;
        int i = 0;
        
        if (!hasNext()) throw new NoSuchElementException("Can't increment - Odometer is at final value.");
        
        atTop = false;
        while (!doneInc && i < iterators.length) {
            if (hasNext(i)) {
                iterators[i]++;     
                if (i > 0) {
                    // reset all lower values
                    for (int j = 0; j < i; j++) {
                        reset(j);
                    }
                } 
                doneInc = true;
            }
            else {
                i++;
            }
        }
    }
    
    
    
	public String[] nextValue() {
        increment();
        return getValue();
    }
    
    
	public String[] getValue() {
 		if (atTop()) throw new NoSuchElementException("Can't retrieve value - Odometer is at reset position.");
        String[] itemValues = new String[iterators.length];
        for (int i = 0; i < iterators.length; i++) {
        	int index = iterators[i];
            itemValues[i]=lists[i].get(index);		// TTN-1851
        }
        
        return itemValues;
    }
    
    private void reset(int i) {
    	iterators[i] = 0;
    }
  
    public boolean atTop() {		
		return atTop;
	}

    
  
    public enum IncOrder {LowEndFirst, HighEndFirst}
}
