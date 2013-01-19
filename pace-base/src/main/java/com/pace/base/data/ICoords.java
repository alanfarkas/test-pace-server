/**
 * 
 */
package com.pace.base.data;


/**
 * Coordinates interface object
 * 
 * @author Alan Farkas
 *
 */
public interface ICoords {

	public String[] getCoordinates();
	public void setCoordinates(String[] coordinates);
	public String getCoordinate(int axis);
	public void setCoordinate(int axis, String value);
	public boolean equals(Object o);
	public String toString();
	public int getSize();
}
