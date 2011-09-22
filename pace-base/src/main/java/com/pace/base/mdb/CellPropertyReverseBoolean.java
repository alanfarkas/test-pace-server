/**
 * Boolean value cell property whose value is the reverse of its underlying
 * property bit. This cell property would be used for used for any boolean 
 * cell property type that has an initial data block creation value of true.
 */
package com.pace.base.mdb;

/**
 * @author Alan Farkas
 *
 */
public class CellPropertyReverseBoolean extends CellProperty{

	public CellPropertyReverseBoolean(CellPropertyType propertyType) {
		this.type = propertyType;
		propertyBits = new boolean[propertyType.getBitCount()];
	}

	public Object getValue() {
		return (Boolean) !propertyBits[0];
	}
		
	public void setValue(Object value) {
		propertyBits[0] = !(Boolean) value;
	}

	public boolean isValidValue(Object value) {
		return (value instanceof Boolean);
	}

}
