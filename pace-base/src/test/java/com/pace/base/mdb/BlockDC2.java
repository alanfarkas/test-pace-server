/**
 * 
 */
package com.pace.base.mdb;
import java.util.HashMap;
import java.util.Map;

import com.pace.base.data.Intersection;

/**
 * @author Alan
 *
 */
public class BlockDC2 {
	Map<Intersection, Intersection> cellIndexMap = null;;
	Map<Intersection, double[][]> dataBlockPool;
	public void setDataBlockPool(Map<Intersection, double[][]> dataBlockPool) {
		this.dataBlockPool = dataBlockPool;
	}
	int intersectionCount = 0;

	public BlockDC2() {
		this(0);
	}
	public BlockDC2(int initSize) {
		cellIndexMap = new HashMap<Intersection, Intersection>(initSize);
		dataBlockPool = new HashMap<Intersection,double[][]>();
	}
	public Map<Intersection, double[][]> getDataBlockPool() {
		return dataBlockPool;
	}
	public void addIntersection(Intersection intersection) {
		//int[] dimIndexes = new int[]{0,1,2,3,4,5};
		//Intersection blockIndex = intersection.createSubIntersection(dimIndexes);
		cellIndexMap.put(intersection, intersection);

		int periodCount = 37;
		int measureCount = 50;
		
		// Initialize data block
		getDataBlockPool().put(intersection,new double[measureCount][periodCount]);
		
	}
}
