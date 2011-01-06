/**
 * 
 */
package com.palladium.paf.project.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author jmilliron
 *
 */
public class CreateProjectSpreadsheet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		HSSFWorkbook wb = new HSSFWorkbook();
	    FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("workbook.xls");
			
			HSSFSheet sheet1 = wb.createSheet("new sheet");
		    HSSFSheet sheet2 = wb.createSheet("second sheet");

		    // Create a row and put some cells in it. Rows are 0 based.
		    HSSFRow row = sheet1.createRow((short)0);
		    // Create a cell and put a value in it.
		    HSSFCell cell = row.createCell((short)0);
		    cell.setCellValue(1);

		    // Or do it on one line.
		    row.createCell((short)1).setCellValue(1.2);
		    row.createCell((short)2).setCellValue("This is a string");
		    row.createCell((short)3).setCellValue(true);

			wb.write(fileOut);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if ( fileOut != null ) {
				
				 try {
					fileOut.close();
				} catch (IOException e) {
				}
				
			}
			
		}
	    
	   


	}

}
