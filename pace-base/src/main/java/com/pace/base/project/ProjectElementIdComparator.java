/*
 *	File: @(#)ProjectElementIdComparator 	Package: com.pace.base.project 	Project: Paf Base Libraries
 *	Created: Fed 02, 2010  		By: themoosman
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
package com.pace.base.project;

import java.util.Comparator;


/**
 * Comparator for the ProjectElementId class.
 *
 * @author themoosman
 * @version	1.0
 *
 */
public class ProjectElementIdComparator implements Comparator<ProjectElementId>
{


	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(ProjectElementId o1, ProjectElementId o2) {
		
		if(o1 == null || o2 == null){
            return 1;
        }
	
	    return o1.toString().compareTo(o2.toString());

	}
}