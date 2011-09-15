/**
 * 
 */
package com.pace.base.mdb;
import com.pace.base.data.Intersection;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alan
 *
 */
public class DoubleBlockDC {
	private Map<Intersection, Integer> cellIndexMap = null;;
	private List<Double[][]> dataBlockArray;

	int periodCount = 37;
	int measureCount = 50;
	public void setDataBlockArray(List<Double[][]> dataBlockArray) {
		this.dataBlockArray = dataBlockArray;
	}
	int intersectionCount = 0;

	public DoubleBlockDC() {
		this(0);
	}
	public DoubleBlockDC(int initSize) {
		cellIndexMap = new HashMap<Intersection, Integer>(initSize);
		dataBlockArray = new ArrayList<Double[][]>();
	}
	public List<Double[][]> getDataBlockArray() {
		return dataBlockArray;
	}
	public void addIntersection(Intersection intersection) {
		// Add index entry for new cell (index is auto-incremented)
		cellIndexMap.put(intersection, intersectionCount++);

		
		// Intialize data block
		getDataBlockArray().add(new Double[measureCount][periodCount]);
		
	}
	public void initBlock(Intersection blockIs) {
		// Fill block with zeroes
		int surrogateKey  = cellIndexMap.get(blockIs);
		Double[][] dataBlock = dataBlockArray.get(surrogateKey);
		for (int i = 0; i < measureCount; i++) {
			for (int j = 0; j < periodCount; j++) {
				dataBlock[i][j] = 0.0;
			}
		}
		
	}
}
