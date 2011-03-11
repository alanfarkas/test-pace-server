/**
 * 
 */
package com.pace.base.view;

/**
 * @author jmilliron
 * 
 */
public class PafBorder implements Cloneable {

	public static final int BORDER_NONE = 0;

	public static final int BORDER_LEFT = 2;

	public static final int BORDER_RIGHT = 4;

	public static final int BORDER_TOP = 8;

	public static final int BORDER_BOTTOM = 16;

	public static final int BORDER_ALL = 32;

	private int border;

	public PafBorder() {
	}
	
	public PafBorder(int border) {
		setBorder(border);
	}
	
	public void setBorder(int border) {
		this.border = border;
	}
		
		
	public int getBorder() {
		return this.border;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	private boolean isStyle(int style) {
		
		return ((border & style) > 0 )? true : false;
	}
	
	public boolean isLeft() {
		return isStyle(BORDER_LEFT);
	}
	
	public boolean isRight() {
		return isStyle(BORDER_RIGHT);
	}
	
	public boolean isTop() {
		return isStyle(BORDER_TOP);
	}
	
	public boolean isBottom() {
		return isStyle(BORDER_BOTTOM);
	}
	
	public boolean isAll() {
		return isStyle(BORDER_ALL);
	}
		
}
