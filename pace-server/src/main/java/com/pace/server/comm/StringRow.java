package com.pace.server.comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringRow {
	private String id;
	private String[] items;
	private int key;
	
	public StringRow() {}

	public StringRow(int key, String[] items){
		this.items = items;
		this.key = key;
	}
	
	public StringRow(String id, int key, String[] items){
		this.id = id;
		this.items = items;
		this.key = key;
	}
	
	
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



	public int getKey() {
		return key;
	}



	public void setKey(int key) {
		this.key = key;
	}
}
