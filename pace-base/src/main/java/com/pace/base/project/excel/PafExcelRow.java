/**
 * 
 */
package com.pace.base.project.excel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jmilliron
 *
 */
public class PafExcelRow {
	
	//specifies if row is a header
	private boolean header;
	
	//identifies which header in map row represents
	private String headerIdent;
	
	private boolean blank;
	
	Map<Integer, List<PafExcelValueObject>> pafExcelValueObjectListMap = new HashMap<Integer, List<PafExcelValueObject>>();	
	
	public PafExcelRow() {
		
	}
	
	public PafExcelRow(boolean header) {
		
		this.header = header;
		
	}
			
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
	 * @return the blank
	 */
	public boolean isBlank() {
		return blank;
	}

	/**
	 * @param blank the blank to set
	 */
	public void setBlank(boolean blank) {
		this.blank = blank;
	}

	/**
	 * @return the pafExcelValueObjectListMap
	 */
	public Map<Integer, List<PafExcelValueObject>> getPafExcelValueObjectListMap() {
		
		Map<Integer, List<PafExcelValueObject>> map = new HashMap<Integer, List<PafExcelValueObject>>();
		
		if ( pafExcelValueObjectListMap != null ) {
			
			map.putAll(pafExcelValueObjectListMap);
			
		}
		
		
		return map;
	}

	/**
	 * @param pafExcelValueObjectListMap the pafExcelValueObjectListMap to set
	 */
	public void setPafExcelValueObjectListMap(Map<Integer, List<PafExcelValueObject>> pafExcelValueObjectListMap) {
		
		if ( pafExcelValueObjectListMap != null ) {
			
			this.pafExcelValueObjectListMap.clear();
			this.pafExcelValueObjectListMap.putAll(pafExcelValueObjectListMap);
			
		}
			
	}
	
	public int numberOfColumns() {
		
		int numberOfColumns = 0;
		
		if ( this.pafExcelValueObjectListMap != null && this.pafExcelValueObjectListMap.size() > 0 ) {
			
			//get last row item order index for max number of columns
			numberOfColumns = getRowItemOrderedIndexes().get(getRowItemOrderedIndexes().size()-1);
			
		}
		
		return numberOfColumns;
		
	}
	
	public int numberOfCompressedRows() {
		
		int compressedRows = 0;
		
		if ( this.pafExcelValueObjectListMap != null ) {
			
			for (Integer key : this.pafExcelValueObjectListMap.keySet() ) {
				
				List<PafExcelValueObject> valueObjectList = this.pafExcelValueObjectListMap.get(key);
				
				if ( valueObjectList != null ) {
					
					if ( compressedRows < valueObjectList.size() ) {
						
						compressedRows = valueObjectList.size();
						
					}
					
				}
				
			}
			
		}
		
				
		return compressedRows;
		
	}
	
	public List<Integer> getRowItemOrderedIndexes() {
		
		List<Integer> orderedIndexes = new ArrayList<Integer>(this.pafExcelValueObjectListMap.keySet());
		
		Collections.sort(orderedIndexes);
		
		return orderedIndexes;
		
	}
	
	public List<PafExcelValueObject> getRowItem(Integer index) {
		
		List<PafExcelValueObject> list = new ArrayList<PafExcelValueObject>();
		
		if ( index != null && this.pafExcelValueObjectListMap.containsKey(index) ) {
			
			list.addAll(this.pafExcelValueObjectListMap.get(index));
			
		}
		
		return list;
		
	}
	
	public void addRowItem(Integer index, PafExcelValueObject valueObject) {
		
		if ( index != null && valueObject != null ) {
		
			List<PafExcelValueObject> valueObjectList = null;
			
			if ( this.pafExcelValueObjectListMap.containsKey(index)) {
				
				valueObjectList = this.pafExcelValueObjectListMap.get(index);				
				
			} 
			
			if ( valueObjectList == null ) {
			
				valueObjectList = new ArrayList<PafExcelValueObject>();
				
			}
			
			valueObjectList.add(valueObject);
			
			this.pafExcelValueObjectListMap.put(index, valueObjectList);
		
		}
		
	}

	public void setRowItemList(Integer index, List<PafExcelValueObject> valueObjectList) {
		
		if ( index != null && valueObjectList != null ) {
						
			this.pafExcelValueObjectListMap.put(index, new ArrayList<PafExcelValueObject>(valueObjectList));
						
		}	
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nIsHeader: " + header);
		//sb.append("\n\tExcel Value Object Items: " + getPafExcelValueObjectList());		
		
		if ( this.pafExcelValueObjectListMap != null ) {
			
			for (Integer rowIndex : getRowItemOrderedIndexes()) {			
				
				sb.append("\n" + rowIndex + ": ");
				sb.append(pafExcelValueObjectListMap.get(rowIndex));
				
			}
			
		}
		
		
		return sb.toString();
	}

	/**
	 * @return the headerIdent
	 */
	public String getHeaderIdent() {
		return headerIdent;
	}

	/**
	 * @param headerIdent the headerIdent to set
	 */
	public void setHeaderIdent(String headerIdent) {
		this.headerIdent = headerIdent;
	}
		
	
	/*public boolean isEmpty() {
		
		boolean isEmpty = true;
		
		if ( pafExcelValueObjectListMap == null || pafExcelValueObjectListMap.size() == 0 ) {
			
			isEmpty = true;
			
		} else {
		
			boolean allItemsEmtpy = true;
			
			for ( PafExcelValueObject rowItem : getPafExcelValueObjectList() ) {
				
				if ( rowItem != null && rowItem.isType(PafExcelValueObjectType.Blank) ) {
					
					allItemsEmtpy = false;
					
				}
				
			}
			
			isEmpty = allItemsEmtpy;
			
		}
		
		return isEmpty;
		
		
	}*/

	
}
