/**
 * Data Cache Cell Address
 */
package com.pace.base.mdb;

import com.pace.base.data.Intersection;

/**
 * @author Alan Farkas
 *
 */
public class DataCacheCellAddress {

	Intersection dataBlockKey = null;
	int coordX = 0;	// Measures
	int coordY = 0;	// Time
	
	
	/**
	 * @return the dataBlockIndex
	 */
	public Intersection getDataBlockKey() {
		return dataBlockKey;
	}
	/**
	 * @param dataBlockKey the dataBlockKey to set
	 */
	public void setDataBlockKey(Intersection dataBlockKey) {
		this.dataBlockKey = dataBlockKey;
	}
	/**
	 * @return the coordX
	 */
	public int getCoordX() {
		return coordX;
	}
	/**
	 * @param coordX the coordX to set
	 */
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	/**
	 * @return the coordY
	 */
	public int getCoordY() {
		return coordY;
	}
	/**
	 * @param coordY the coordY to set
	 */
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
}
