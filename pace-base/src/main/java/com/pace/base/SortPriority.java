/**
 * 
 */
package com.pace.base;

/**
 * @author IHuang
 *
 */
public enum SortPriority {
	Primary(1), 
	Secondary(2), 
	Tertiary(3);
	
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	SortPriority() {}
	
	SortPriority(int index) {
		this.index = index;
	}
}
