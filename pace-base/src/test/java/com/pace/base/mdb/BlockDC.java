/**
 * 
 */
package com.pace.base.mdb;
import com.pace.base.data.Intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alan
 *
 */
public class BlockDC {
	Map<Intersection, Integer> cellIndexMap = null;;
	List<double[][]> dataBlockArray;
	public void setDataBlockArray(List<double[][]> dataBlockArray) {
		this.dataBlockArray = dataBlockArray;
	}
	int intersectionCount = 0;

	public BlockDC() {
		this(0);
	}
	public BlockDC(int initSize) {
		cellIndexMap = new HashMap<Intersection, Integer>(initSize);
		dataBlockArray = new ArrayList<double[][]>();
	}
	public List<double[][]> getDataBlockArray() {
		return dataBlockArray;
	}
	public void addIntersection(Intersection intersection) {
		// Add index entry for new cell (index is auto-incremented)
		cellIndexMap.put(intersection, intersectionCount++);

		int periodCount = 37;
		int measureCount = 50;
		
		// Intialize data block
		getDataBlockArray().add(new double[measureCount][periodCount]);
		
	}
}
