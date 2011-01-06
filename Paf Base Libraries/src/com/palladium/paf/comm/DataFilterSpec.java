/*
 *	File: @(#)DataFilterSpec.java 	Package: com.palladium.paf.comm 	Project: Paf Base Libraries
 *	Created: Apr 10, 2007  			By: AFarkas
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
package com.palladium.paf.comm;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.palladium.paf.app.PafDimSpec;


/**
 * Uow Data Filter Specification
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class DataFilterSpec implements Cloneable {
	
	private transient static final Logger logger = Logger.getLogger(DataFilterSpec.class);
	
	private PafDimSpec[] dimSpec;
	
	public DataFilterSpec() {
	}
	
	public void setDimSpec(PafDimSpec[] dimSpec) {
		this.dimSpec = dimSpec;
	}

	public PafDimSpec[] getDimSpec() {
		return dimSpec;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(dimSpec);
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
		DataFilterSpec other = (DataFilterSpec) obj;
		if (!Arrays.equals(dimSpec, other.dimSpec))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public DataFilterSpec clone() {

		DataFilterSpec dataFilterSpec = null;
		
		try {
			dataFilterSpec = (DataFilterSpec) super.clone();
			
			if ( this.dimSpec != null ) {
				
				PafDimSpec[] clonePafDimSpec = new PafDimSpec[this.dimSpec.length];
				
				for ( int i = 0; i < this.dimSpec.length; i++ ) {
					
					clonePafDimSpec[i] = this.dimSpec[i].clone();
					
				}
				
				dataFilterSpec.setDimSpec(clonePafDimSpec);
				
			}
			
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		
		return dataFilterSpec;
		
	}
	
	

}

