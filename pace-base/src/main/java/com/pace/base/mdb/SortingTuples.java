package com.pace.base.mdb;

import java.util.List;

public class SortingTuples {
	List<SortingTuple> sortingTupleList;
	
	public SortingTuples() {
		// TODO Auto-generated constructor stub
	}

	public SortingTuple getPrimarySortingTuple() {
		if( sortingTupleList.size() >= 1 ) {
			return sortingTupleList.get(0) != null ? sortingTupleList.get(0) : null;
		}
		else
			return null;
	}

	public SortingTuple getSecondarySortingTuple() {
		if( sortingTupleList.size() >= 2 ) {
			return sortingTupleList.get(1) != null ? sortingTupleList.get(1) : null;
		}
		else
			return null;
	}

	public SortingTuple getTertiarySortingTuple() {
		if( sortingTupleList.size() == 3 ) {
			return sortingTupleList.get(2) != null ? sortingTupleList.get(2) : null;
		}
		else
			return null;
	}

	/**
	 * @return the sortingTupleList
	 */
	public List<SortingTuple> getSortingTupleList() {
		return sortingTupleList;
	}

	/**
	 * @param sortingTupleList the sortingTupleList to set
	 */
	public void setSortingTupleList(List<SortingTuple> sortingTupleList) {
		this.sortingTupleList = sortingTupleList;
	}

}
