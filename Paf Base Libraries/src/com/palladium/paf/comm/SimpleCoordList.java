/*
 *	File: @(#)PafSimpleCoordList.java 	Package: com.palladium.paf.comm 	Project: Paf Base Libraries
 *	Created: Sep 12, 2005  				By: JWatkins
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
 *	05/24/06		AFarkas			x.xx			Moved from com.palladium.paf.server.comm (PafServer)
 * 
 */
package com.palladium.paf.comm;

import java.io.IOException;
import java.util.List;

import com.palladium.paf.IPafCompressedObj;
import com.palladium.paf.PafBaseConstants;
import com.palladium.utility.CollectionsUtil;
import com.palladium.utility.StringUtils;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class SimpleCoordList implements IPafCompressedObj {
	
    private String [] axis;
    
    private String [] coordinates;
    
    private boolean isCompressed;
    
    private String compressedData;
    
    /**
     * default constructor 
     */
    public SimpleCoordList(){}
    
   	/**
    * @param axis Array of dimensions
 	 */
	public SimpleCoordList(String[] axis) {
	   	this.axis = axis;
	}

    /**
     * @param axis Array of dimensions
     * @param coordinates Arrary of member coordinates
     */
    public SimpleCoordList(String[] axis, String[] coordinates) {
    	this.axis = axis;
    	this.coordinates = coordinates;   	
    }
        
	public String[] getAxis() {
        return axis;
    }
   	
    public void setAxis(String[] axis) {
        this.axis = axis;
    }
    
    public String[] getCoordinates() {
        return coordinates;
    }
    
    public void setCoordinates(String[] coordinates) {
        this.coordinates = coordinates;
    }
    
	public void compressData() throws IOException {
		
		//if not null or length isn't 0
		if ( this.getAxis() != null && this.getAxis().length != 0 && 
				this.getCoordinates() != null && this.getCoordinates().length != 0 ) {
			
			//	create string buffer
			StringBuffer strBuff = new StringBuffer(1000);
			
			//add dimensions
			for (int i = 0; i < this.getAxis().length; i++ ) {
				
				strBuff.append(this.getAxis()[i]);
				strBuff.append(PafBaseConstants.DELIMETER_ELEMENT);
							
			}
			
			strBuff.append(PafBaseConstants.DELIMETER_GROUP);
			
			//add coords
			for (int i = 0; i < this.getCoordinates().length; i++ ) {
				
				strBuff.append(this.getCoordinates()[i]);
				strBuff.append(PafBaseConstants.DELIMETER_ELEMENT);
				
			}		
			
			this.compressedData = strBuff.toString();
			axis = null;
			coordinates = null;
			isCompressed = true;
		
		}
	
	
	}
	
	public boolean isCompressed() {
		
		return isCompressed;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.IPafCompressedObj#setCompressed(boolean)
	 */
	public void setCompressed(boolean isCompressed) {
		
		this.isCompressed = isCompressed;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.palladium.paf.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {

		if ( isCompressed ) {
									
			//get a list of simple coord list attributes { axis, coordinates }
			List<String> listOfSimpleCoordListAttributes = CollectionsUtil.convertToList(compressedData, PafBaseConstants.DELIMETER_GROUP);
			
			//if not null and size = 2 attributes
			if ( listOfSimpleCoordListAttributes != null && listOfSimpleCoordListAttributes.size() == 2 ) {
				
				//get axis list
				List<String> axisList = CollectionsUtil.convertToList(listOfSimpleCoordListAttributes.get(0), PafBaseConstants.DELIMETER_ELEMENT);
				
				//if not null, set axis with axis list
				if ( axisList != null && axisList.size() > 0) {
					
					this.axis = axisList.toArray(new String[0]);
					
				}
				
				//get coord list
				List<String> coordList = CollectionsUtil.convertToList(listOfSimpleCoordListAttributes.get(1), PafBaseConstants.DELIMETER_ELEMENT);
				
				//if not null, set coordiantes
				if ( coordList != null && coordList.size() > 0 ) {
					
					this.coordinates = coordList.toArray(new String[0]);					
				}
			}
			
			this.compressedData = null;
			
			isCompressed = false;
			
		}
		
	}

	/**
	 * @return the compressedData
	 */
	public String getCompressedData() {
		return compressedData;
	}

	/**
	 * @param compressedData the compressedData to set
	 */
	public void setCompressedData(String compressedData) {
		this.compressedData = compressedData;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return StringUtils.arrayToString(getCoordinates());	
	}

}
