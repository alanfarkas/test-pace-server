/*
 *	File: @(#)PafDataSlice.java 	Package: com.palladium.paf.server.data 	Project: PafServer
 *	Created: Sep 6, 2005  		By: JWatkins
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
package com.palladium.paf.data;

import java.io.*;

import com.palladium.paf.IPafCompressedObj;
import com.palladium.utility.Base64;

/**
 * Container for data this is transferred to and from the client application
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafDataSlice implements IPafCompressedObj {

    String compressedData;
    String CRC32CheckSum;
    boolean isCompressed;

    double[] data;
	int columnCount;
	
	/**
	 * 
	 */
	public PafDataSlice() {
		
	}
	
	/**
	 * @param data
	 * @param columnCount
	 */
	public PafDataSlice(double[] data, int columnCount) {
		
		// Intialize instance variables
		this.data = data;
		this.columnCount = columnCount;
	}
	
	/**
	 *	Return columnCount
	 *
	 * @return Returns the columnCount.
	 */
	public int getColumnCount() {
		return columnCount;
	}
	
	/**
	 *	Sets the columnCount
	 *
	 * @param columnCount Number of "logical" columns
	 */
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	
	/**
	 *	Return data
	 *
	 * @return Returns the data.
	 */
	public double[] getData() {
		return data;
	}
	
	/**
	 *	Set the data
	 *
	 * @param data
	 */
	public void setData(double[] data) {
		this.data = data;
	}

	
	/**
	 *	Return the row count
	 *
	 * @return Returns the row count.
	 */
	public int getRowCount() {
		if(columnCount == 0){
			return 0;
		}else{
			return data.length / columnCount;
		}
	}
   
	
	/*
	 *	Represent the PafDataSlice as a 2-dimensional array of data
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		int cellIdx = 0;
		int rowCount = getRowCount();
		StringBuffer stringBuffer = new StringBuffer("\n");	
		String format = "%#11.2f\t";
		
		for (int rowIdx = 0; rowIdx < rowCount; rowIdx++) {
			for (int colIdx = 0; colIdx < columnCount; colIdx++ ) {
				stringBuffer.append(String.format(format, data[cellIdx++]));
			}
			stringBuffer.append("\n");
		}
		return stringBuffer.toString();
	}

    /**
     * @return Returns the compressedData.
     */
    public String getCompressedData() {
        return compressedData;
    }

    /**
     * @param compressedData The compressedData to set.
     */
    public void setCompressedData(String compressedData) {
        this.compressedData = compressedData;
    }
    
    public void compressData() throws IOException {
        
        StringBuffer sb = new StringBuffer();
        String sChunk;
        byte bChunk[] = new byte[8];
        int k;

        long startTime = System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);        
        
        for (double d : data) {   
            dataOutputStream.writeDouble(d);
        }
        
        dataOutputStream.flush();
        byte[] allBytes = byteArrayOutputStream.toByteArray();
        for (int i = 0 ; i < allBytes.length - 1; i+=8) {
            k = 0;
            for (int j = 7; j >=0; j--) {
                bChunk[k++] = allBytes[i + j];   
            }
            sChunk = Base64.encodeBytes(bChunk);
            sb.append( sChunk );
//            System.out.println(arr2double(Base64.decode(sChunk), 0));
        }
        
        this.compressedData = sb.toString();
        this.data = new double[0];
        this.isCompressed = true;
        
        System.out.println("Dataslice compression completed in " + (System.currentTimeMillis() - startTime));
    }

    public void uncompressData() {
        
        if (this.isCompressed()) {

            String compressedData = this.getCompressedData();
            String chunk;
            byte bChunk[] = new byte[8];
            double doubles[] = new double[compressedData.length()/12];
            int i=0;
       
            int len = compressedData.length();
            for (int pos = 0; pos < len - 1 ; pos+= 12 ) {
                chunk = compressedData.substring(pos, pos + 12);
                bChunk = Base64.decode(chunk);
                if (bChunk != null && bChunk.length == 8)
                    doubles[i++] = arr2double(bChunk, 0);
            }           

            this.setData(doubles);
            
            this.compressedData = "";
            this.isCompressed = false;
        }
    }
    
    
    private static double arr2double (byte[] arr, int start) {
        int i = 0;
        int len = 8;
        int cnt = 0;
        byte[] tmp = new byte[len];
        for (i = start; i < (start + len); i++) {
            tmp[cnt] = arr[i];
            cnt++;
        }
        long accum = 0;
        i = 0;
        for ( int shiftBy = 0; shiftBy < 64; shiftBy += 8 ) {
            accum |= ( (long)( tmp[i] & 0xff ) ) << shiftBy;
            i++;
        }
        return Double.longBitsToDouble(accum);
    }

    
    /**
     * @return Returns the isCompressed.
     */
    public boolean isCompressed() {
        return isCompressed;
    }

    /**
     * @param isCompressed The isCompressed to set.
     */
    public void setCompressed(boolean isCompressed) {
        this.isCompressed = isCompressed;
    }
	
}
