/*
 *	File: @(#)PafSimpleCoordList.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
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
 *	05/24/06		AFarkas			x.xx			Moved from com.pace.base.server.comm (PafServer)
 * 
 */
package com.pace.base.comm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import com.pace.base.IPafCompressedObj;
import com.pace.base.PafBaseConstants;
import com.pace.base.utility.CollectionsUtil;
import com.pace.base.utility.CompressionUtil;
import com.pace.base.utility.StringUtils;

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
    
    private String compressedStringTable;
    
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
     * @param coordinates Array of member coordinates
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
		
		// The compressed data will be normalized. The original string values will be stored in 
		// a separate collection in surrogate key order.

		//if not null or length isn't 0
		if ( this.getAxis() != null && this.getAxis().length != 0 && 
				this.getCoordinates() != null && this.getCoordinates().length != 0 ) {
			
			// initialization
			StringBuffer dataBuffer = new StringBuffer(1000);
			StringBuffer memberNameBuffer = new StringBuffer(1000);
			LinkedHashSet<String> memberNameLookup = new LinkedHashSet<String>(1000);
			Map<String, Integer> surrogateKeyLookup = new HashMap<String, Integer>();	
			
			// add dimensions
			for (int i = 0; i < this.getAxis().length; i++ ) {
				
				String dim = this.getAxis()[i];
				Integer key = CompressionUtil.generateSurrogateKey(dim, memberNameLookup, surrogateKeyLookup);
				dataBuffer.append(key);
				dataBuffer.append(PafBaseConstants.DELIMETER_ELEMENT);
							
			}		
			dataBuffer.append(PafBaseConstants.DELIMETER_GROUP);
			
			// add coordinates
			for (int i = 0; i < this.getCoordinates().length; i++ ) {

				String coord = this.getCoordinates()[i];
				Integer key = CompressionUtil.generateSurrogateKey(coord, memberNameLookup, surrogateKeyLookup);
				dataBuffer.append(key);
				dataBuffer.append(PafBaseConstants.DELIMETER_ELEMENT);
			}		
			this.compressedData = dataBuffer.toString();


			// compress member name lookup
			Iterator<String> iterator = memberNameLookup.iterator();
			while(iterator.hasNext()) {
				String memberName = iterator.next();
				memberNameBuffer.append(memberName);
				memberNameBuffer.append(PafBaseConstants.DELIMETER_ELEMENT);			
			}
			this.compressedStringTable = memberNameBuffer.toString();
		

			// final housekeeping
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
	 * @see com.pace.base.IPafCompressedObj#setCompressed(boolean)
	 */
	public void setCompressed(boolean isCompressed) {
		
		this.isCompressed = isCompressed;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {

		// The compressed data is normalized. The original string values are held in a separate 
		// collection in surrogate key order.
		do {
			if (isCompressed) {
				
				// Parse the compressed member names into a list. Exit if they are null or empty
				List<String> memberNameLookup = CollectionsUtil.convertToList(compressedStringTable, PafBaseConstants.DELIMETER_ELEMENT);
				if (memberNameLookup == null)
					continue;
				
				
				// Split the compressed coordinate list into an axis list and a coordinate list. Exit if either of these lists
				// are null.
				List<String> splitCoordList = CollectionsUtil.convertToList(compressedData, PafBaseConstants.DELIMETER_GROUP);
				if (splitCoordList == null || splitCoordList.size() != 2) 
					continue;


				// Uncompress the axis and list. Exit if null or empty.
				List<String> axisList = CollectionsUtil.convertToList(splitCoordList.get(0), PafBaseConstants.DELIMETER_ELEMENT);
				if (axisList == null || axisList.isEmpty())
					continue;
				
				// Convert the surrogate keys in the axis list to their corresponding member names.
				List<String> convertedAxisList = CompressionUtil.resolveSurrogateKeys(axisList, memberNameLookup);
				axis = convertedAxisList.toArray(new String[0]);	

				// Uncompress the coordinate list. Exit if null or empty.
				List<String> coordList = CollectionsUtil.convertToList(splitCoordList.get(1), PafBaseConstants.DELIMETER_ELEMENT);
				// if not null, set coordinates
				if (coordList == null || coordList.isEmpty())
					continue;

				// Convert the surrogate keys in the coordinate list to their corresponding member names.
				List<String> convertedCoordList = CompressionUtil.resolveSurrogateKeys(coordList, memberNameLookup);
				coordinates = convertedCoordList.toArray(new String[0]);	

				// All done!
				compressedData = null;
				compressedStringTable = null;
				isCompressed = false;

			}
		}
		while (false);

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
	
	/**
	 * @return the compressedStringTable
	 */
	public String getCompressedStringTable() {
		return compressedStringTable;
	}

	/**
	 * @param compressedStringTable the compressedMemberNameLookup to set
	 */
	public void setCompressedStringTable(String compressedStringTable) {
		this.compressedStringTable = compressedStringTable;
	}


	/**
	 * @return the coordinate count
	 */
	public int getCoordCount() {

		int coordCount = 0;
	    if (isCompressed()) {
	    	coordCount = compressedData.length();
	    } else if (coordinates != null) {
	    	coordCount = coordinates.length;
	    }
		return coordCount;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return StringUtils.arrayToString(getCoordinates());	
	}

}
