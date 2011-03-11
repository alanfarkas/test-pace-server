package com.pace.base.view;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class LockedCell implements Comparable {

	private int rowIndex = 0;
	private int colIndex = 0;
	
	public LockedCell() {} 

	public LockedCell(int rowIndex, int colIndex) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
	
	public void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	
	public int getColIndex() {
		return colIndex;
	}

	public int getRowIndex() {
		return rowIndex;
	}
	
	public String toString() {
		return "Row Index: " + rowIndex + ", Column Index: " + colIndex;
	}
		
	public int compareTo(Object o) {
		
		int rc = 0;
		
		LockedCell lc = (LockedCell) o;
		
		if ( this.rowIndex < lc.rowIndex ) {
			
			rc = -1; 
			
		} else if ( this.rowIndex == lc.rowIndex ) {
			
			if ( this.colIndex < lc.colIndex) {
				rc = -1;
			} else if ( this.colIndex == lc.colIndex) {
				rc = 0;
			} else {
				rc = 1;
			}		
		} else  {
			
			rc = 1;
		}
		
		return rc;
	}

	
}
