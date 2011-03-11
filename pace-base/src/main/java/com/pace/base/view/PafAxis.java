/**
 * @(#) PafAxis.java
 */

package com.pace.base.view;

/**
 * 
 * An axis is a page, row or column.
 *
 */
public class PafAxis {

	public static final int ROW = 0;

	public static final int COL = 1;

	public static final int PAGE = 2;

	private int value;
    
    private int pageAxis = PAGE;

	private int rowAxis = ROW;

	private int colAxis = COL;
    
	public PafAxis() {
	}

	public PafAxis(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		
		if ( value < 0 || value > 2 ) {
			value = ROW;
		}
		
		this.value = value;
	}

	public int getPageAxis() {
		return pageAxis;
	}
	
	public int getColAxis() {
		return colAxis;
	}
	
	public int getRowAxis() {
		return rowAxis;
	}

    public void setColAxis(@SuppressWarnings("unused")
	int colAxis) {
        // do nothing, this mutator is just for soap compliance
    }


    public void setPageAxis(@SuppressWarnings("unused")
	int pageAxis) {
        // do nothing, this mutator is just for soap compliance
    }

    public void setRowAxis(@SuppressWarnings("unused")
	int rowAxis) {
        // do nothing, this mutator is just for soap compliance
    }
    
	@Override
	public boolean equals(Object obj) {

		if ( obj instanceof PafAxis ) {
			
			PafAxis comparePafAxis = (PafAxis) obj;
			
			return (this.value == comparePafAxis.value) ? true : false;			
			
		} else if ( obj instanceof Integer ) {
			
			Integer intValue = (Integer) obj;
			
			return (this.equals(new PafAxis(intValue)));
		}
		
		return super.equals(obj);
	}
}
