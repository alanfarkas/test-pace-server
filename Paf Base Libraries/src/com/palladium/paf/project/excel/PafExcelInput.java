/**
 * 
 */
package com.palladium.paf.project.excel;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;

import com.palladium.paf.PafBaseConstants;

/**
 * Paf Excel Input object that holds meta-data information needed for the PafExcelReader and
 * PafExcelWriter classes. 
 * 
 * @author JavaJ
 *
 */
public class PafExcelInput {

	//logger
	private static final Logger logger = Logger.getLogger(PafExcelInput.class);

	//location of workbook
	private String workbookDirectory;
	
	//name of excel workbook
	private String workbookName;
	
	//workbook
	private Workbook workbook;
	
	//excel sheet id
	private String sheetId;
	
	//map of header list
	private Map<String, List<String>> headerListMap;

	//number of columns to read
	private int columnLimit;

	//number of rows to read in
	private int rowLimit;
	
	//end of sheet flag
	private String endOfSheetIdnt;
	
	private boolean excludeHeaderRows;
	
	private boolean excludeEmptyRows;
	
	private boolean excludeDataRows;
	
	private boolean enableCellReferencing;
	
	private boolean multiDataRow;
	
	private Integer startDataReadColumnIndex;
	
	private boolean isSheetRequired;
	
	private boolean excludeDefaultValuesOnWrite;
	
	private Boolean autoSizeColumns;

	private boolean autoWriteToFileSystem;
	
	private PafExcelWorkbookType workbookType;
		
	public static class Builder {
		
		//location of workbook
		private String workbookDirectory;
		
		//name of excel workbook
		private String workbookName;
		
		//workbook
		private Workbook workbook;
		
		//excel sheet id
		private String sheetId;
		
		//map of header list
		private Map<String, List<String>> headerListMap;

		//number of columns to read
		private int columnLimit;

		//number of rows to read in
		private int rowLimit;
		
		//end of sheet flag
		private String endOfSheetIdnt;
		
		private boolean excludeHeaderRows;
		
		private boolean excludeEmptyRows;
		
		private boolean excludeDataRows;

		private boolean enableCellReferencing;
		
		private boolean multiDataRow;
		
		private Integer startDataReadColumnIndex;
		
		private boolean isSheetRequired; 
		
		private boolean excludeDefaultValuesOnWrite;
		
		private Boolean autoSizeColumns;
		
		private boolean autoWriteToFileSystem;
		
		//Excel 2007 without macros by default
		private PafExcelWorkbookType workbookType = PafExcelWorkbookType.Excel2007;
		
		private Builder(String sheetId, int columnLimit) {
			
			if ( sheetId == null ) {
				
				 throw new IllegalArgumentException("Sheetname cannot be null.");
				 
			} else if ( columnLimit < 1 ) {
				
				throw new IllegalArgumentException("Column limit must be more than 0.");
				
			}
			
			this.sheetId = sheetId;
			this.columnLimit = columnLimit;	
			
		}
		
		public Builder(Workbook workbook, String sheetId, int columnLimit) {
			
			this(sheetId, columnLimit);
			
			if ( workbook == null ) {
				
				 throw new IllegalArgumentException("Workbook cannot be null.");
				
			} 
			
			this.workbook = workbook;
					
			
		}
		
		
		public Builder(String workbookDirectory, String workbookName, String sheetId, int columnLimit) {
			
			this(sheetId, columnLimit);
			
			if ( workbookDirectory == null || workbookName == null ) {
				
				 throw new IllegalArgumentException("Workbook Directory or Workbook cannot be null.");
				
			} 
						
			this.workbookDirectory = workbookDirectory;
			this.workbookName = workbookName;
		
			
		}
		
		public Builder(String fullWorkbookLocation, String sheetId, int columnLimit) {
		
			this(sheetId, columnLimit);
			
			if ( fullWorkbookLocation == null ){
				
				throw new IllegalArgumentException("Workbook location cannot be null.");
				
			}
			
			File fullWorkbookLocationFile = new File(fullWorkbookLocation);
									
			String parentDir = fullWorkbookLocationFile.getParent();
			
			if ( parentDir == null ) {
				
				parentDir = ".";
				
			}
			
			this.workbookDirectory = parentDir;
			this.workbookName = fullWorkbookLocationFile.getName();
			
			//trim xlsx from end of string
			if ( this.workbookName.endsWith(PafBaseConstants.XLSX_EXT)) {
				
				this.workbookName = this.workbookName.replaceFirst(PafBaseConstants.XLSX_EXT, "");
				
				this.workbookType = PafExcelWorkbookType.Excel2007;
				
			} else if (this.workbookName.endsWith(PafBaseConstants.XLSM_EXT)) {
				
				this.workbookName = this.workbookName.replaceFirst(PafBaseConstants.XLSM_EXT, "");
				
				this.workbookType = PafExcelWorkbookType.Excel2007WithMacros;
			}
			
		}		
		
		/**
		 * @param headerListMap the headerListMap to set
		 */
		public Builder headerListMap(Map<String, List<String>> headerListMap) {
			
			this.headerListMap = headerListMap;
			
			return this;
		}

		/**
		 * @param rowLimit the rowLimit to set
		 */
		public Builder rowLimit(int rowLimit) {
			
			if ( rowLimit < 1 ) {
				
				throw new IllegalArgumentException("Row limit must be more than 0.");
				
			}
			
			this.rowLimit = rowLimit;
			return this;
		}


		/**
		 * @param endOfSheetIdnt the endOfSheetIdnt to set
		 */
		public Builder endOfSheetIdnt(String endOfSheetIdnt) {
			this.endOfSheetIdnt = endOfSheetIdnt;
			return this;
		}


		/**
		 * @param excludeHeaders the excludeHeaders to set
		 */
		public Builder excludeHeaderRows(boolean excludeHeaderRows) {
			this.excludeHeaderRows = excludeHeaderRows;
			return this;
		}


		/**
		 * @param excludeEmptyRows the excludeEmptyRows to set
		 */
		public Builder excludeEmptyRows(boolean excludeEmptyRows) {
			this.excludeEmptyRows = excludeEmptyRows;
			return this;
		}
		
		/**
		 * @param excludeDataRows the excludeDataRows to set
		 */
		public Builder excludeDataRows(boolean excludeDataRows) {
			this.excludeDataRows = excludeDataRows;
			return this;
		}
		
		public Builder enableCellReferencing(boolean enableCellReferencing) {
			this.enableCellReferencing = enableCellReferencing;
			return this;
		}
		
		public Builder multiDataRow(boolean multiDataRow) {
			this.multiDataRow = multiDataRow;
			return this;
		}
		
		// zero based
		public Builder startDataReadColumnIndex(Integer startDataReadColumnIndex) {
			this.startDataReadColumnIndex = startDataReadColumnIndex;
			return this;
		}
		
		public Builder sheetRequired(boolean isSheetRequired) {
			this.isSheetRequired = isSheetRequired;
			return this;			
		}

		public Builder excludeDefaultValuesOnWrite(boolean excludeDefaultValuesOnWrite) {
			this.excludeDefaultValuesOnWrite = excludeDefaultValuesOnWrite;
			return this;			
		}
		
		public Builder autoSizeColumns(boolean autoSizeColumns) {
			this.autoSizeColumns = autoSizeColumns;
			return this;			
		}
				
		public Builder autoWriteToFileSystem(boolean autoWriteToFileSystem) {
			this.autoWriteToFileSystem = autoWriteToFileSystem;
			return this;
		}
		
		public PafExcelInput build() {
			return new PafExcelInput(this);
		}	
		
	}
			
	private PafExcelInput(Builder builder) {

		if ( builder == null ) {
			
			throw new IllegalArgumentException("Builder cannot be null.");
			
		} else if ( builder.workbookDirectory == null && builder.workbookName == null && builder.workbook == null ) {
			
			throw new IllegalArgumentException("(Workbook Directory and Workbook Name) or Workbook cannot all be null.");	
	
		}
		
		this.workbookDirectory = builder.workbookDirectory;
		this.workbookName = builder.workbookName;
		this.workbook = builder.workbook;
		this.sheetId = builder.sheetId;
		this.columnLimit = builder.columnLimit;
		this.rowLimit = builder.rowLimit;
		this.excludeEmptyRows = builder.excludeEmptyRows;
		this.excludeHeaderRows = builder.excludeHeaderRows;
		this.excludeDataRows = builder.excludeDataRows;
		this.endOfSheetIdnt = builder.endOfSheetIdnt;
		this.enableCellReferencing = builder.enableCellReferencing;
		this.multiDataRow = builder.multiDataRow;
		this.startDataReadColumnIndex = builder.startDataReadColumnIndex;
		this.isSheetRequired = builder.isSheetRequired;
		this.excludeDefaultValuesOnWrite = builder.excludeDefaultValuesOnWrite;
		this.autoSizeColumns = builder.autoSizeColumns;
		this.autoWriteToFileSystem = builder.autoWriteToFileSystem;
		this.workbookType = builder.workbookType;
			
		if ( builder.headerListMap == null ) {
			
			this.headerListMap = null;
			
		} else {
			
			this.headerListMap = new HashMap<String, List<String>>(builder.headerListMap);
			
		}
		
	}
	
	
	/**
	 * @return the headerListMap
	 */
	public Map<String, List<String>> getHeaderListMap() {
			
		Map<String, List<String>> newHeaderListMap = new HashMap<String, List<String>>();
		
		if ( this.headerListMap != null ) {
						
			newHeaderListMap.putAll(this.headerListMap);
			
		}
		
		return newHeaderListMap;
		
	}
		
	/**
	 * 
	 * @return the full workbook name with file extension.
	 */
	public String getFullWorkbookName() {
		
		String fullWorkbookName = null;
		
		if ( workbookDirectory != null && workbookName != null ) {
			
			fullWorkbookName = workbookDirectory + (workbookDirectory.endsWith(File.separator) ? "" : File.separator ) + workbookName;
			
			//if workbook doesn't have .xlsx or .xlsm on end, add
			if ( ! ( fullWorkbookName.endsWith(PafBaseConstants.XLSX_EXT) ||
					fullWorkbookName.endsWith(PafBaseConstants.XLSM_EXT) ) ) {
				
				if ( workbookType == null || workbookType.equals(PafExcelWorkbookType.Excel2007)) {
					
					fullWorkbookName += PafBaseConstants.XLSX_EXT;
					
				} else if ( workbookType.equals(PafExcelWorkbookType.Excel2007WithMacros ) ) {
					
					fullWorkbookName += PafBaseConstants.XLSM_EXT;
					
				}				
				
			}
			
		}
		
		return fullWorkbookName; 
		
	}
		

	/**
	 * @return the workbookDirectory
	 */
	public String getWorkbookDirectory() {
		return workbookDirectory;
	}


	/**
	 * @return the workbook
	 */
	public Workbook getWorkbook() {
		return workbook;
	}


	/**
	 * @return the workbookName
	 */
	public String getWorkbookName() {
		return workbookName;
	}

	/**
	 * @return the sheetId
	 */
	public String getSheetId() {
		return sheetId;
	}


	/**
	 * @return the columnLimit
	 */
	public int getColumnLimit() {
		return columnLimit;
	}


	/**
	 * @return the rowLimit
	 */
	public int getRowLimit() {
		return rowLimit;
	}


	/**
	 * @return the endOfSheetIdnt
	 */
	public String getEndOfSheetIdnt() {
		return endOfSheetIdnt;
	}


	/**
	 * @return the excludeHeaderRows
	 */
	public boolean isExcludeHeaderRows() {
		return excludeHeaderRows;
	}


	/**
	 * @return the excludeEmptyRows
	 */
	public boolean isExcludeEmptyRows() {
		return excludeEmptyRows;
	}
	
	/**
	 * @return the excludeDataRows
	 */
	public boolean isExcludeDataRows() {
		return excludeDataRows;
	}


	/**
	 * @return the enableCellReferencing
	 */
	public boolean isEnableCellReferencing() {
		return enableCellReferencing;
	}


	/**
	 * @return the multiDataRow
	 */
	public boolean isMultiDataRow() {
		return multiDataRow;
	}


	/**
	 * @return the startDataReadColumnIndex
	 */
	public Integer getStartDataReadColumnIndex() {
		return startDataReadColumnIndex;
	}

	public boolean isSheetRequired() {
		return isSheetRequired; 
	}

	public boolean isExcludeDefaultValuesOnWrite() {
		return excludeDefaultValuesOnWrite;
	}
	
	public boolean isAutoSizeColumns() {
		
		//if null, default is true
		if ( autoSizeColumns == null ) {
			
			autoSizeColumns = true;
			
		}
		
		return autoSizeColumns;
	}
	

	/**
	 * @return the workbookType
	 */
	public PafExcelWorkbookType getWorkbookType() {
		return workbookType;
	}


	/**
	 * @return the autoWriteToFileSystem
	 */
	public boolean isAutoWriteToFileSystem() {
		return autoWriteToFileSystem;
	}
	
}
