/*
 *	File: @(#)IntersectionUtil.java 	Package: com.pace.base.data 	Project: Paf Base Libraries
 *	Created: Jun 29, 2006  		By: JWatkins
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
package com.pace.base.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.state.IPafEvalState;
import com.pace.base.utility.Odometer;
import com.pace.base.utility.TimeBalance;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class IntersectionUtil {

    public static ArrayList<Intersection> buildIntersections(Map<String, List<String>> memberLists, String[] axisSequence) {
        
        ArrayList[] memberArrays = new ArrayList[memberLists.size()];
        int i = 0;
        
        for (String axis : axisSequence) {         
            memberArrays[i++] = new ArrayList<String>(memberLists.get(axis));
        }

        // precalculate size of arraylist
        long size = 1;
        for (ArrayList list : memberArrays) {
            size *= list.size();
        }
        ArrayList<Intersection> intersections = new ArrayList<Intersection>();
        
        
        Odometer odom = new Odometer(memberArrays);
        Intersection inter;

        while (odom.hasNext()) {
            inter = new Intersection(axisSequence, (String[])odom.nextValue().toArray(new String[0]));
            intersections.add(inter);
        }
        
        return intersections;
    }
    
    
    
    public static List<Intersection> buildFloorIntersections(Intersection is, IPafEvalState evalState) {
        MemberTreeSet mts = evalState.getClientState().getUowTrees();
        String msrDim = evalState.getAppDef().getMdbDef().getMeasureDim();
        String timeDim = evalState.getAppDef().getMdbDef().getTimeDim(); 
        PafDimTree tree;
        TimeBalance tb = TimeBalance.None;
        List<PafDimMember> desc = null;
        Map<String, List<String>> memberListMap = new HashMap<String, List<String>>();
        List<String> memberList;
        
        // Initialize time balance attribute for the measure in the intersection.
        MeasureDef msr = evalState.getAppDef().getMeasureDef(is.getCoordinate(msrDim));                
        if (msr == null || msr.getType() != MeasureType.Recalc ) { 
            if (msr ==null)
                tb = TimeBalance.None;
            else if (msr.getType() == MeasureType.TimeBalFirst)
                tb = TimeBalance.First;
            else if (msr.getType() == MeasureType.TimeBalLast)
                tb = TimeBalance.Last;
            else
                tb = TimeBalance.None;
        }
        
        
        for ( String dim : is.getDimensions() ) {
            desc = null;
            memberList = new ArrayList<String>();
            
            // if coordinate has no descendents add it to the memberlist, else add it's descendents
            tree = mts.getTree(dim);
            desc = tree.getLowestMembers(is.getCoordinate(dim));
            
            // descendents add vary by time balance attribute if time dimension
            if (!dim.equals(timeDim) || tb == TimeBalance.None) {
                // if not time dimension or time balance none measure just add all
                for (PafDimMember m : desc) {
                    memberList.add(m.getKey());
                }
            }
            else if (tb == TimeBalance.First) {
                memberList.add(desc.get(0).getKey());                         
            }
            else if (tb == TimeBalance.Last) {
                memberList.add(desc.get(desc.size()-1).getKey());                        
            }

            memberListMap.put(dim, memberList);
        }
        
        return buildIntersections(memberListMap, is.getDimensions());
    }
	
}
