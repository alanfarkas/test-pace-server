package com.pace.base.mdb;

import com.pace.base.SortOrder;
import com.pace.base.data.Intersection;

public class SortingTuple {
	private Intersection intersection;
	private SortOrder sortOrder;
	
	/**
	 * @return the sortOrder
	 */
	public SortOrder getSortOrder() {
		return sortOrder;
	}
	/**
	 * @param sortOrder the sortOrder to set
	 */
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 * @return the intersection
	 */
	public Intersection getIntersection() {
		return intersection;
	}
	/**
	 * @param intersection the intersection to set
	 */
	public void setIntersection(Intersection intersection) {
		this.intersection = intersection;
	}
}
