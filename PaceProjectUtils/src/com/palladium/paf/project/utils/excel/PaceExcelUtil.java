/**
 * 
 */
package com.palladium.paf.project.utils.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;

/**
 * @author jmilliron
 *
 */
public class PaceExcelUtil {

	/**
	 * 
	 * A user can read from an existing workbook via the input, or pass have this method create a new
	 * workbook reference and read from that.  The main objective of this method is to read in a sheet from
	 * an existing workbook and to convert the data from that sheet into a model pace can use.
	 * 
	 * @param input 	input meta data used by method to read in sheet
	 * @return			a list of pace row's.
	 * @throws PafException
	 */
	public static List<PaceExcelRow> readExcelSheet(PaceExcelInput input) throws PafException {
						
		if ( input == null ) {
			
			throw new IllegalArgumentException("Pace Excel Input cannot be null");
			
		}
		
		List<PaceExcelRow> paceRowList = new ArrayList<PaceExcelRow>();
						
		try {
									
			if ( input.getFullWorkbookName() == null && input.getWorkbook() == null ) {
			
				if ( input.getFullWorkbookName() == null ) {
					
					throw new IllegalStateException("Pace excel input has not been configured property.  The full workbook name is null");
					
				} else if ( input.getWorkbook() == null ) {
					
					throw new IllegalStateException("Pace excel input has not been configured property.  The workbook is null");
					
				}
				
			}
			
			Workbook wb = null;
			
			//if workbook doesn't exists, create
			if ( input.doesWorkbookExist() ) {
				
				wb = input.getWorkbook();
				
			//else create a new one
			} else {
				
				File inputExcelFile = new File(input.getFullWorkbookName());
				
				if ( ! inputExcelFile.exists() ) {
					
					throw new PafException("File " + input.getFullWorkbookName() + " does not exist.", PafErrSeverity.Error);
									
				}
				
				//create workbook from file
				wb = new XSSFWorkbook(input.getFullWorkbookName());	
								
			}			
			
			Sheet sheet = wb.getSheet(input.getSheetName());
			
			if ( sheet == null ) {
				
				throw new PafException("Sheet " + input.getSheetName() + " does not exist.", PafErrSeverity.Error);
				
			}
			
			int sheetLastRowNumber = sheet.getLastRowNum();			
			
			OUTTER_LOOP:
			for (int i = 0; i <= sheetLastRowNumber; i++) {
				
				PaceExcelRow paceRow = new PaceExcelRow();
				
				Row row = sheet.getRow(i);
				
				if ( row == null ) {
				
					continue;
					
				}
				
				for (int t = 0; t < input.getNumberOfColumns(); t++) {
										
					Cell cell = row.getCell(t);
												
					PaceExcelRowItem paceRowItem = new PaceExcelRowItem(cell);
				
					//if user flagged end of sheet data with a string and string matches here, stop reading data
					if ( t == 0 && paceRowItem.isString() && input.getEndOfSheetFlag() != null &&
							paceRowItem.getString().equalsIgnoreCase(input.getEndOfSheetFlag())) {
						
						break OUTTER_LOOP;
						
					}
					
					paceRow.addPaceRowItem(paceRowItem);
					
					
				}
				
				//add pace row to list
				paceRowList.add(paceRow);
								
				//loop through header list and see if the row matches any of the header list
				for (String headerKey : input.getHeaderListMap().keySet()) {
				
					List<String> headerList = input.getHeaderListMap().get(headerKey); 
					
					//see if header row or not
					if ( headerList != null && headerList.size() > 0 ) {
						
						boolean isHeader = true;
						
						int paceRowItemNdx = 0;
						
						//loop through all pace row items
						for (PaceExcelRowItem paceRowItem : paceRow.getPaceRowItems()) {							
							
							//if header list size == the number of current row item index, break loop.
							if ( paceRowItemNdx == headerList.size()) {
								
								break;
								
							}
							
							//if string returns something and the header list does not match
							if ( paceRowItem.getValueAsString() != null && ! headerList.get(paceRowItemNdx++).equalsIgnoreCase(paceRowItem.getValueAsString())) {
								
								isHeader = false;
								
								break;
							}
							
						}
											
						paceRow.setHeader(isHeader);
						
						if ( isHeader ) {
							break;
						}
						
					}
				}
			}			
						
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
			throw new PafException(e.getMessage(), PafErrSeverity.Error);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new PafException(e.getMessage(), PafErrSeverity.Error);
			
		}		
		
		return paceRowList;		
		
	}
	
	public static void writeExcelSheet(PaceExcelInput paceExcelInput, List<PaceExcelRow> paceRowList) throws PafException {
		
		
	}
	
}
