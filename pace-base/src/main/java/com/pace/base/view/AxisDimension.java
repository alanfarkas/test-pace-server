/**
 * @(#) AxisDimension.java
 */

package com.pace.base.view;


public class AxisDimension
{
	private String dimension;
	
	private PafAxis axis;
	
	private int order;

	public PafAxis getAxis() {
		return axis;
	}

	public void setAxis(PafAxis axis) {
		this.axis = axis;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	
}
