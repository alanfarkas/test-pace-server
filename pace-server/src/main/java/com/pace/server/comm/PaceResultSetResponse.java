/**
 * 
 */
package com.pace.server.comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.comm.PafRequest;
import com.pace.base.comm.PafResponse;

/**
 * @author jim
 * Ultimately this is just a 2d array
 * Initial implementation is geared to a series of keys (members from a particular dimension)
 * and their corresponding attribute values. However there is opportunity to keep this structure
 * generic
 * 
 * an example structure to represent might be
 * 
 * Skus	Color	Size
 * SK1	Red		Large
 * SK2			Large
 * SK3	Blue	
 * SK4	Blue	Small
 * 
 * This would then be converted into String Lists for each possible value including the header. By convention the column
 * header will be index 0 of the appropriate list
 * indexMap[0] = [Skus, SK1, SK2, SK3, Sk4]
 * indexMap[1] = [Color, Red, Blue]
 * indexMap[2] = [Size, Large, Small] 
 * 
 * This combined with the 2d int array allows the grid to be reproduced with minimal transmission
 * 0	0	0
 * 1	1	1
 * 2	-1	1
 * 3	2	-1
 * 4	2	2
 * 
 *
 */
public class PaceResultSetResponse extends PafResponse {
	// setup as integer array that indexes into lists, the basic assumption is that their will be lots of repetition
	//HashMap<Integer, ArrayList<String>> indexMaps = new HashMap<Integer, ArrayList<String>>();
	StringRow header;		
	/**
	 * @return the header
	 */
	public StringRow getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(StringRow header) {
		this.header = header;
	}

	/**
	 * @return the data
	 */
	public StringRow[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(StringRow[] data) {
		this.data = data;
	}

	StringRow[] data;
	





	public PaceResultSetResponse(StringRow inHeader, String[][] inData) {
		this.header = inHeader;
		this.data = new StringRow[inData.length];
		int i=0;
		for (String[] s : inData) {
			this.data[i++] = new StringRow(s);
		}
	}
	
	public PaceResultSetResponse() {}

}
