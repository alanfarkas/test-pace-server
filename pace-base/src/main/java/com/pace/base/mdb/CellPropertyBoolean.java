/**
 * Boolean value cell property
 */
package com.pace.base.mdb;

/**
 * @author Alan Farkas
 *
 */
public class CellPropertyBoolean extends CellProperty{

	public CellPropertyBoolean(CellPropertyType propertyType) {
		this.type = propertyType;
		propertyBits = new boolean[propertyType.getBitCount()];
	}

	public Object getValue() {
		return (Boolean) propertyBits[0];
	}
		
	public void setValue(Object value) {
		propertyBits[0] = (Boolean) value;
	}

	public boolean isValidValue(Object value) {
		return (value instanceof Boolean);
	}

}
