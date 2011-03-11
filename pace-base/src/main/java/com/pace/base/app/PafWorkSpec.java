/*
 *	File: @(#)PafWorkSpec.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Oct 13, 2005  		By: JWatkins
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
package com.pace.base.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafWorkSpec implements Cloneable {
	
	private transient final static Logger logger = Logger.getLogger(PafWorkSpec.class);
	
    private String name;
    
    private PafDimSpec[] dimSpec;

    /**
     * @return Returns the dimSpec.
     */
    public PafDimSpec[] getDimSpec() {
        return dimSpec;
    }

    /**
     * @param dimSpec The dimSpec to set.
     */
    public void setDimSpec(PafDimSpec[] dimSpec) {
        this.dimSpec = dimSpec;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PafWorkSpec clone() {

		PafWorkSpec clonedPafWorkSpec = null;
		
		try {
			
			clonedPafWorkSpec = (PafWorkSpec) super.clone();
			
			if ( dimSpec != null ) {
				
				List<PafDimSpec> pafDimSpecList = new ArrayList<PafDimSpec>();
				
				for (PafDimSpec pafDimSpec : dimSpec) {
					
					if ( pafDimSpec != null ) {
						
						PafDimSpec clonedPafDimSpec = (PafDimSpec) pafDimSpec.clone();
						
						pafDimSpecList.add(clonedPafDimSpec);
						
					}
					
				}
				
				if ( pafDimSpecList.size() > 0 ) {
					
					clonedPafWorkSpec.setDimSpec(pafDimSpecList.toArray(new PafDimSpec[0]));
					
				} else {
					
					clonedPafWorkSpec.setDimSpec(null);
					
				}
				
			}
			
		} catch (CloneNotSupportedException e) {
			
			logger.warn(e.getMessage());
			
		}
		
		return clonedPafWorkSpec;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(dimSpec);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafWorkSpec other = (PafWorkSpec) obj;
		if (!Arrays.equals(dimSpec, other.dimSpec))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
