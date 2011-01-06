/**
 * 
 */
package com.palladium.paf.view;


/**
 * @author jmilliron
 *
 */
public class LockedIntersections {
	
	private int rowIndexs[];
	private int colIndexs[];
		
	//do use, only for soap
	public LockedIntersections() {
		
	}

	public int[] getColIndexs() {
		return colIndexs;
	}
	public void setColIndexs(int[] colIndexs) {
		this.colIndexs = colIndexs;
	}

	public int[] getRowIndexs() {
		return rowIndexs;
	}
	public void setRowIndexs(int[] rowIndexs) {
		this.rowIndexs = rowIndexs;
	}
	
}
