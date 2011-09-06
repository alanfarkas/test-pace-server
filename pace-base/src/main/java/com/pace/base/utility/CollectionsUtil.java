/*
 *	File: @(#)CollectionsUtil.java 	Package: com.pace.base.utility 	Project: com.pace.base.adminconsole.global
 *	Created: Jun 22, 2007  		By: jmilliron
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
package com.pace.base.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class CollectionsUtil {

	
	/**
	 *  Merge the specified hash maps
	 *
	 * @param map1 Hashmap1
	 * @param map2 Hashmap2
	 * 
	 * @return Map<String, Set<String>>
	 */
	public static Map<String, Set<String>> mergeMaps(Map<String, Set<String>> map1, Map<String, Set<String>> map2) {
		
		// Append map1
		Map<String, Set<String>> mergedMap = new HashMap<String, Set<String>>(map1);
	
		// Append map2
		for (String key : map2.keySet()) {
			if (!mergedMap.containsKey(key)) {
				mergedMap.put(key, new HashSet<String>());
			}
			mergedMap.get(key).addAll(map2.get(key));
		}
		
		return mergedMap;
		
	}
	
	/**
	 * 	Convert a map of lists to an array of lists. The key array specifies
	 * 	the order of the lists within the new list array.
	 * 
	 * @param map Map to convert
	 * @param keyArray Array of map keys that will be used to specify list order in the converted list array
	 * 
	 * @return List<T>[]
	 */
	public static <K, T> List<T>[] convertToArrayOfLists(Map<K, List<T>> map, K[] keyArray) {

		// Make sure that map is not null
		if (map == null) {
			throw new NullPointerException("conversion error - map or key array cannot be null");
		// Verify sizes are same
		} else if (map.size() != keyArray.length ) {
			throw new IllegalArgumentException("conversion error - map and key array are not equal in size.");
		}
    	
    	// Create array
		int mapSize = map.size();
		@SuppressWarnings("unchecked")
		List<T>[] arrayOfLists = new List[mapSize];

		// Populate array from map
		int i = 0;
		for (K key : keyArray) {
			List<T> list = map.get(key);
			if (list == null) {
				throw new IllegalArgumentException("conversion error - key array element not found in map");
			}
			arrayOfLists[i++] = list;
		}
		
		return arrayOfLists;
		
	}
	
	public static Map<Integer, String> convertToMap(String delimitedString, String delimiter1, String delimiter2)
    {
        List<String> longStrings = convertToList(delimitedString, delimiter1);
        Map<Integer, String> map = new HashMap<Integer, String>();

        for (String str : longStrings)
        {
            List<String> shortStrings = convertToList(str, delimiter2);
            map.put(Integer.parseInt(shortStrings.get(1)), shortStrings.get(0));
        }

        return map;
    }
	
	public static List<List<String>> convertToListOfLists(String delimitedString, String delimiter1, String delimiter2)
    {						
        List<String> longStrings = convertToList(delimitedString, delimiter1);
        List<List<String>> stringLists = new ArrayList<List<String>>();

        for (String str : longStrings)
        {
            List<String> shortStrings = convertToList(str, delimiter2);
            stringLists.add(shortStrings);
        }

        return stringLists;
    }
	
    public static List<String> convertToList(String delimitedString, String delimiter)
    {
    	
    	delimiter = delimiter.replaceAll("\\|", "\\\\|");
    	
    	delimiter = delimiter.replaceAll("\\^", "\\\\^");
    	
    	String[] stringArray = delimitedString.split(delimiter);
            	
        List<String> strings = new ArrayList<String>();

        for (String stringItem : stringArray)
        {
            strings.add(stringItem);
        }

        return strings;
    }
    
    /**
     * 
     * Takes a key list and a value list and creates a map.  key list can have
     * blank or null values, and if so, the mirrored value will be added to 
     * previous key's list.
     *
     * @param <T>			generic value object
     * @param keyList		list of keys
     * @param valueList		list of values
     * @return				a new map keyed on key and value of generic list.
     */
    public static <K, T> Map<K, List<T>> createMapFromLists(List<K> keyList, List<T> valueList) {
    	
    	//verify for nulls
    	if ( keyList == null || valueList == null ) {
    		
    		throw new NullPointerException("keylist and/or valuelist can't be null");
    		
    	//verify sizes are same
    	} else if ( keyList.size() != valueList.size() ) {
    		
    		throw new IllegalArgumentException("key list and value list are not equal in size.");
    		
    	}
    	
    	//create a new linked hash map
    	Map<K, List<T>> map = new LinkedHashMap<K, List<T>>();
    	
    	K lastKey = null;
   	
    	int keyIndex = 0;
    	
    	//loop keys and populate map
    	for (K key : keyList ) {

        	List<T> list = null;
    		
    		if ( key == null || key.toString().trim().equals("")) {
    			
    			if ( lastKey != null && map.containsKey(lastKey )) {
    			
    				list = map.get(lastKey);
    				
    				list.add(valueList.get(keyIndex));
    				
    				map.put(lastKey, list);
    				
    			}
    			
    		} else {
    			
    			lastKey = key;
    			
    			list = new ArrayList<T>();
    			list.add(valueList.get(keyIndex));
    			
    			map.put(key, list);
    			
    		}
    		    	
    		
    		keyIndex++;
    		
    	}
    	   	
    	
    	return map;
    	
    }
    
    /**
     * 
     * Returns the key from the map that matches the case insenstive key passed in.
     * 
     * @param <T>
     * @param map					map to search
     * @param caseInsensitiveKey	case insenstive key
     * @return						valid key if found
     */
    public static <T> String getCaseSenstiveKeyFromMap(Map<String, T> map, String caseInsensitiveKey) {
    	
    	if ( map == null || caseInsensitiveKey == null ) {
    		
    		throw new NullPointerException("map and/or caseInsensitiveKey cannot be null");
    		
    	}
    	
    	String foundKey = null;
    	    	
    	for (String key : map.keySet()) {
    		
    		if ( key.equalsIgnoreCase(caseInsensitiveKey)) {
    			
    			foundKey = key;
    			break;
    			
    		}
    		
    	}    	
    	
    	return foundKey;
    	
    }
    
	public static boolean containsIgnoreCase(List<String> l, String s) {

		if ( l == null || s == null ) {
			
			return false;
			
		}
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) {

			if (it.next().equalsIgnoreCase(s)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static String getIgnoreCase(List<String> l, String s) {

		String returnVal = null;
		
		if ( l == null || s == null ) {
			
			return null;
			
		}
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) {

			String nextCompare = it.next();
			
			if (nextCompare.equalsIgnoreCase(s)) {
				
				returnVal = nextCompare;
				
			}
			
		}
		
		return returnVal;
	}
	
	/**
	 * 
	 * Converts an array of any type to a List and removes any null items in ar.
	 *
	 * @param <T> class type
	 * @param ar array of items to convert into a list
	 * @return a list populated with the non null items in the ar.
	 */
	public static <T> List<T> arrayToListPruneNulls(T[] ar) {
		
		List<T> newList = new ArrayList<T>();
		
		if ( ar != null)  {
			
			for (T t : ar ) {
				
				if ( t != null ) {
					
					newList.add(t);
					
				}
				
			}
			
		}
		
		return newList;
		
	}
	
	public static String getMapValueOrReturnKey(String key, Map<String, String> map) {
		
		String str = null;
		
		if ( key != null && map != null &&
				map.containsKey(key)) {
			
			str = map.get(key);
			
		} else {
		
			str = key;
		
		}
		
		return str;
		
	}
	
    public static void main(String[] argss) {
    	
    	List<String> list = convertToList("abc^dce|^kjk^kjd|^lll^lll", "|^");
    	
    	for (String str : list) {
    		System.out.println(str);
    	}
    	
    }
    
    
}
