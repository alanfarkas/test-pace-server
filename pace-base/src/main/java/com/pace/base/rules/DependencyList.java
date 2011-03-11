/*
 *	File: @(#)DependencyList.java 	Package: com.pace.base.rules 	Project: PafServer
 *	Created: Aug 31, 2005  		By: JWatkins
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
package com.pace.base.rules;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class DependencyList {
    String dependantTerm;
    String[] dependancies; // these terms can impact the dependent term
    public String[] getDependancies() {
        return dependancies;
    }
    public void setDependancies(String[] dependancies) {
        this.dependancies = dependancies;
    }
    public String getDependantTerm() {
        return dependantTerm;
    }
    public void setDependantTerm(String dependantTerm) {
        this.dependantTerm = dependantTerm;
    }
}
