/**
 * 
 */
package com.palladium.paf.project.utils.excel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jmilliron
 *
 */
public class PaceExcelRow {
	
	//specifies if row is a header
	private boolean header;

	List<PaceExcelRowItem> paceRowItems = null;	
	
	/**
	 * @return the header
	 */
	public boolean isHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(boolean header) {
		this.header = header;
	}
	
	/**
	 * Adds pace row item to list
	 * 
	 * @param paceRowItem new pace row item
	 */
	public void addPaceRowItem(PaceExcelRowItem paceRowItem) {
		
		if ( paceRowItem == null ) {
			
			throw new IllegalArgumentException("Pace Row Item cannot be null");
			
		}
		
		initPaceRowItem();

		paceRowItems.add(paceRowItem);
				
		
	}
	
	public List<PaceExcelRowItem> getPaceRowItems() {
		
		initPaceRowItem();
		
		//create new list from existing pace row items.
		return new ArrayList<PaceExcelRowItem>(paceRowItems);
		
	}

	private void initPaceRowItem() {
		
		if ( paceRowItems == null ) {
			
			paceRowItems = new ArrayList<PaceExcelRowItem>();
			
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nIsHeader: " + header);
		sb.append("\n\tPace Row Items: " + getPaceRowItems());		
		
		return sb.toString();
	}
	

}
