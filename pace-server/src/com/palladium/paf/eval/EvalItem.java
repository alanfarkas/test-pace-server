/*
 *	File: @(#)EvalItem.java 	Package: com.pace.base.eval 	Project: PafServer
 *	Created: Sep 8, 2005  		By: JWatkins
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
package com.palladium.paf.eval;

import com.pace.base.data.Intersection;
import com.pace.base.rules.Formula;

/**
 * An item that requires evaluation, and all the pieces
 * necessary to perform that evaluation. This is used in
 * conjunction with a dataCache object. The intersection
 * represents a point in the datacache that needs to be evaluated
 * by the formula provided. The axis identifies which
 * axis of the intersection/dataCache the formula is to ba applied
 * along.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class EvalItem {
    Formula formula = null;
    Intersection intersection = null;
    String axis = null;
    
    public EvalItem( Intersection intersect, Formula formula, String axis) {
        super();
        this.axis = axis;
        this.formula = formula;
        this.intersection = intersect;
    }
    public String getAxis() {
        return axis;
    }
    public void setAxis(String axis) {
        this.axis = axis;
    }
    public Formula getFormula() {
        return formula;
    }
    public void setFormula(Formula formula) {
        this.formula = formula;
    }
    public Intersection getIntersection() {
        return intersection;
    }
    public void setIntersection(Intersection intersect) {
        this.intersection = intersect;
    }

}
