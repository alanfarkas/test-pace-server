package com.pace.server.comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRow {
	String id;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	String[] items;

	public StringRow(String[] s) {
		items=s;
	}

	/**
	 * @return the items
	 */
	public String[] getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(String[] items) {
		this.items = items;
	}
	
	public StringRow() {}

	public void add(String s) {
		if (items == null) {
			items = new String[] { s };
		}
		else {
			List<String> newitems = new ArrayList<String>(Arrays.asList(items));
			newitems.add(s);
			items = newitems.toArray(new String[0]);			
		}
	}
}
