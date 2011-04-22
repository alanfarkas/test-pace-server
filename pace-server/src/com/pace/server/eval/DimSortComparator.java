/*
 *	File: @(#)DimSortComparator.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 10, 2005  		By: jim
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
package com.pace.server.eval;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.pace.base.SortOrder;
import com.pace.base.data.Intersection;

/**
 * This sorts a collection of Intersection objects
 * based upon the order of the members passed in
 * and the axis the members belong to.
 *
 * @version	x.xx
 * @author jim
 *
 */
public class DimSortComparator implements Comparator {
    
    private Map<String, HashMap<String, Integer>> memberSeqs;
    private String[] axisSequence;
    private SortOrder sortOrder;
    
    public DimSortComparator(Map <String, HashMap<String, Integer>>memberSequences, String[] axisSequence, SortOrder sortOrder) {
        memberSeqs = memberSequences;
        this.axisSequence = axisSequence;
        this.sortOrder = sortOrder;
    }
    
    public int compare(Object o1, Object o2) {
//        Intersection i1 = (Intersection) o1;
//        Intersection i2 = (Intersection) o2;
        
        
        // sorts like an alphabetical order. If 1st axis determines priority consider sorted,
        // else continue until tie is resolved.
        
        Map <String, Integer> axisSeq;
        String axis;
        for (int i = 0; i < axisSequence.length; i++) {
            axis = axisSequence[i];
            axisSeq = memberSeqs.get(axis);        
            if (sortOrder == SortOrder.Ascending) {
                if (axisSeq.get(((Intersection) o1).getCoordinate(axis)) < axisSeq.get(((Intersection) o2).getCoordinate(axis)) ) return 1;
                else if (axisSeq.get(((Intersection) o1).getCoordinate(axis)) > axisSeq.get(((Intersection) o2).getCoordinate(axis)) ) return -1;         
            }
            else {
                if (axisSeq.get(((Intersection) o1).getCoordinate(axis)) < axisSeq.get(((Intersection) o2).getCoordinate(axis)) ) return -1;
                else if (axisSeq.get(((Intersection) o1).getCoordinate(axis)) > axisSeq.get(((Intersection) o2).getCoordinate(axis)) ) return 1;         
            }
        }
        
        // assumes all tests resulted in tie so must be equal.
//        if (!o1.equals(o2))
//            throw new ArithmeticException("Failure in intersection sorting algorthithm.\n" + "\nI1: " + i1.toString() + " -- I2: " + i2.toString() );
        
        return 0;
        
    }
}
