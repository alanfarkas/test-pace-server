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
public class IntersectionDC {
	Map<Intersection, Integer> cellIndexMap = null;
	List<Double> cellArray = null;
	int intersectionCount = 0;

	public IntersectionDC() {
		this(0);
	}
	public IntersectionDC(int initSize) {
		cellIndexMap = new HashMap<Intersection, Integer>(initSize);
		cellArray = new ArrayList<Double>();
	}
	
	public List<Double> getCellArray() {
		return cellArray;
	}
	public void addIntersection(Intersection intersection) {
		// Add index entry for new cell (index is auto-incremented)
		cellIndexMap.put(intersection, intersectionCount++);

		cellArray.add(0.0);
		// Intialize data block
//		getDataBlockArray().add(new double[measureCount][periodCount]);
		
	}
}
