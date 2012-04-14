/*
 *	File: @(#)Odometer.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Sep 20, 2005  		By: JWatkins
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

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class CopyOfOdometer {
	ListIterator<Object>[] iterators;
    Object[] items;
    
    
 	/**
 	 * 	Create odometer using a map and a key array that implies the order
 	 * 	of elements within the odometer
 	 * 
 	 * @param memberMap Map of element lists
 	 * @param keyArray Array that specifies the order of the element lists within the odometer
 	 */
 	@SuppressWarnings("unchecked")
	public <T, K> CopyOfOdometer(Map<K, List<T>> memberMap, K[] keyArray) {
		this((List<Object>[]) CollectionsUtil.convertToArrayOfLists(memberMap, keyArray));
	}

    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CopyOfOdometer(List[] lists) {
        iterators = new ListIterator[lists.length];
        items = new Object[lists.length];
        
        // initialize structures and roll all dials to first position
        for (int i = 0; i < lists.length; i++) {
            iterators[i] = lists[i].listIterator();
            items[i] = iterators[i].next();
        }
        
        // decrement lowest level pointer so hasNext works naturally
        iterators[0].previous();
        items[0] = null;
        
    }
    

	public void reset() {
        for (int i = 0; i < iterators.length; i++) {
            reset(i);
        }  
        
        // decrement lowest level pointer so hasNext works naturally
        iterators[0].previous();
        items[0] = null;
   }
    
    public boolean hasNext() {
        for (int i = 0; i < iterators.length; i++) {
            if (iterators[i].hasNext()) return true;
        } 
        return false;
    }
    
    public void increment() {
        boolean doneInc = false;
        int i = 0;
        if (!hasNext()) throw new NoSuchElementException("Odometer is at final value.");
        while (!doneInc && i < iterators.length) {
            if (iterators[i].hasNext()) {
                items[i] = iterators[i].next();     
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
    
 	@SuppressWarnings("rawtypes")
	public ArrayList nextValue() {
        increment();
        return getValue();
    }
    
    
 	@SuppressWarnings("rawtypes")
	public ArrayList getValue() {
        ArrayList<Object> itemValues = new ArrayList<Object>(iterators.length);
        for (int i = 0; i < items.length; i++) {
            itemValues.add(items[i]);
        }
        
        return itemValues;
    }
    
    
    private void reset(int i) {
        while (iterators[i].hasPrevious()) iterators[i].previous();
        items[i] = iterators[i].next();
    }
    
    public enum IncOrder {LowEndFirst, HighEndFirst}
}
