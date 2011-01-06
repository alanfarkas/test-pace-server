/**
 * 
 */
package com.palladium.paf.project.utils.excel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

/**
 * Pace Excel Input object that holds meta-data information needed for the PaceExcelReader and
 * PaceExcelWritter classes. 
 * 
 * @author JavaJ
 *
 */
public class PaceExcelInput {
	
	//2007 Excel file extenstion
	public static final String XLSX_EXT = ".xlsx";

	//location of workbook
	private String workbookDirectory;
	
	//name of excel workbook
	private String workbookName;
	
	//workbook
	private Workbook workbook;
	
	//name of excel sheet
	private String sheetName;
	
	//map of header list
	private Map<String, List<String>> headerListMap;

	//max number of columns to read
	private int numberOfColumns;
	
	//end of sheet flag
	private String endOfSheetFlag;
		
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Max number of columns to read/write to. 
	 */
	private PaceExcelInput(String workbookDirectory, String workbookName, String sheetName, int numberOfColumns) {
		
		if ( workbookDirectory == null || workbookName == null || sheetName == null ) {
			
			 throw new IllegalArgumentException("Workbook Directory or Workbook or Sheetname cannot be null.");
			
		} else if ( numberOfColumns < 1 ) {
			
			throw new IllegalArgumentException("Number of columns must be more than 0.");
			
		}
		
		this.workbookDirectory = workbookDirectory;
		this.workbookName = workbookName;
		this.sheetName = sheetName;
		this.numberOfColumns = numberOfColumns;
		
	}
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Max number of columns to read/write to. 
	 */
	private PaceExcelInput(Workbook workbook, String sheetName, int numberOfColumns) {
		
		if ( workbook == null || sheetName == null ) {
			
			 throw new IllegalArgumentException("Workbook or SheetName cannot be null.");
		
		} else if ( numberOfColumns < 1 ) {
			
			throw new IllegalArgumentException("Number of columns must be more than 0.");
			
		}		
		
		this.workbook = workbook;
		this.sheetName = sheetName;
		this.numberOfColumns = numberOfColumns;
		
	}
			
	/**
	 * Creates a Pace Excel Input object with a header list.  The header list gets added to the header map with a key 
	 * of sheetName.
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerList		List of header's text; addes to map with key of sheetName
	 */
	public PaceExcelInput(String workbookDirectory, String workbookName, String sheetName, int numberOfColumns, List<String> headerList) {

		this(workbookDirectory, workbookName, sheetName, numberOfColumns);
				
		this.headerListMap = new HashMap<String, List<String>>();
		
		if ( headerList != null && headerList.size() > 0 ) {
									
			List<String> newHeaderList = new ArrayList<String>(headerList);
			
			this.headerListMap.put(sheetName, newHeaderList);
						
		} 		
		
	}	
	
	/**
	 * Creates a Pace Excel Input object with a header list.  The header list gets added to the header map with a key 
	 * of sheetName.
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerList		List of header's text
	 * @param endOfSheetFlag	Specifies when to stop reading/writing data to/from an Excel sheet.
	 */	
	public PaceExcelInput(String workbookDirectory, String workbookName, String sheetName, int numberOfColumns, List<String> headerList, String endOfSheetFlag) {
	
		this(workbookDirectory, workbookName, sheetName, numberOfColumns, headerList);
		
		this.endOfSheetFlag = endOfSheetFlag;
			
	}	
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerListMap     key: sheetId or name, value: list of header idents
	 */
	public PaceExcelInput(String workbookDirectory, String workbookName, String sheetName, int numberOfColumns, Map<String, List<String>> headerListMap) {

		this(workbookDirectory, workbookName, sheetName, numberOfColumns);
		
		setHeaderListMap(headerListMap);

	}
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbookDirectory	Location of workbook
	 * @param workbookName		Name of Excel workbook
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerListMap     key: sheetId or name, value: list of header idents
	 * @param endOfSheetFlag	Specifies when to stop reading/writing data to/from an Excel sheet.
	 */
	public PaceExcelInput(String workbookDirectory, String workbookName, String sheetName, int numberOfColumns, Map<String, List<String>> headerListMap, String endOfSheetFlag) {		
	
		this(workbookDirectory, workbookName, sheetName, numberOfColumns, headerListMap);
		
		this.endOfSheetFlag = endOfSheetFlag;		
		
	}
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbook			Workbook to write to.
	 * @param sheetName			Name of Excel sheet
	 * @param headerList     	List of header idents
	 * @param numberOfColumns	Number of columns to read
	 */
	public PaceExcelInput(Workbook workbook, String sheetName, int numberOfColumns, List<String> headerList) {

		this(workbook, sheetName, numberOfColumns);
						
		this.headerListMap = new HashMap<String, List<String>>();
		
		if ( headerList != null && headerList.size() > 0 ) {
									
			List<String> newHeaderList = new ArrayList<String>(headerList);
			
			this.headerListMap.put(sheetName, newHeaderList);
						
		} 		
		

	}
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbook			Workbook to write to.
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerList     	List of header idents
	 * @param endOfSheetFlag	Specifies when to stop reading/writing data to/from an Excel sheet.
	 */
	public PaceExcelInput(Workbook workbook, String sheetName, int numberOfColumns, List<String> headerList, String endOfSheetFlag) {

		this(workbook, sheetName, numberOfColumns, headerList);
						
		this.endOfSheetFlag = endOfSheetFlag;
		

	}
	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbook			Workbook to write to.
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerListMap     key: sheetId or name, value: list of header idents
	 */
	public PaceExcelInput(Workbook workbook, String sheetName, int numberOfColumns, Map<String, List<String>> headerListMap) {

		this(workbook, sheetName, numberOfColumns);
		
		setHeaderListMap(headerListMap);

	}

	
	/**
	 * Creates a Pace Excel Input object
	 * 
	 * @param workbook			Workbook to write to.
	 * @param sheetName			Name of Excel sheet
	 * @param numberOfColumns	Number of columns to read
	 * @param headerListMap     key: sheetId or name, value: list of header idents
	 * @param endOfSheetFlag	Specifies when to stop reading/writing data to/from an Excel sheet. 
	 */
	public PaceExcelInput(Workbook workbook, String sheetName, int numberOfColumns, Map<String, List<String>> headerListMap, String endOfSheetFlag) {

		this(workbook, sheetName, numberOfColumns, headerListMap);
		
		this.endOfSheetFlag = endOfSheetFlag;

	}
			
	/**
	 * @return the workbookDirectory
	 */
	public String getWorkbookDirectory() {
		return workbookDirectory;
	}
	
	/**
	 * @param workbookDirectory the workbookDirectory to set
	 */
	public void setWorkbookDirectory(String workbookDirectory) {
		this.workbookDirectory = workbookDirectory;
	}
	
	/**
	 * @return the workbookName
	 */
	public String getWorkbookName() {
		return workbookName;
	}

	/**
	 * @param workbookName the workbookName to set
	 */
	public void setWorkbookName(String workbookName) {
		this.workbookName = workbookName;
		
	}

	/**
	 * @return the workbook
	 */
	public Workbook getWorkbook() {
		return workbook;
	}

	/**
	 * @param workbook the workbook to set
	 */
	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;

	}
	
	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName the sheetName to set
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
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
	 * @param headerListMap the headerListMap to set
	 */
	public void setHeaderListMap(Map<String, List<String>> headerListMap) {
		
		if ( headerListMap == null ) {
			
			this.headerListMap = null;
			
		} else {
			
			this.headerListMap = new HashMap<String, List<String>>(headerListMap);
			
		}
		
	}

	/**
	 * @return the numberOfColumns
	 */
	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**
	 * @param numberOfColumns the numberOfColumns to set
	 */
	public void setNumberOfColumns(int numberOfColumns) {
		
		if ( numberOfColumns < 1 ) {
			
			throw new IllegalArgumentException("Number of columns must be more than 0.");
			
		}
		
		this.numberOfColumns = numberOfColumns;
	}

	/**
	 * @return the endOfSheetFlag
	 */
	public String getEndOfSheetFlag() {
		return endOfSheetFlag;
	}

	/**
	 * @param endOfSheetFlag the endOfSheetFlag to set
	 */
	public void setEndOfSheetFlag(String endOfSheetFlag) {
		this.endOfSheetFlag = endOfSheetFlag;
	}

	
	/**
	 * 
	 * @return the full workbook name with file extension.
	 */
	public String getFullWorkbookName() {
		
		String fullWorkbookName = null;
		
		if ( workbookDirectory != null && workbookName != null ) {
			
			fullWorkbookName = workbookDirectory + (workbookDirectory.endsWith(File.separator) ? "" : File.separator ) + workbookName + XLSX_EXT; 
			
		}
		
		return fullWorkbookName; 
		
	}
		
	public boolean doesWorkbookExist() {
		
		boolean workbookExists = false;
		
		if ( this.workbook != null ) {
			
			workbookExists = true;
			
		}
		
		return workbookExists;
		
	}

}
