package com.pace.base.project.excel.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.data.PafMemberList;
import com.pace.base.data.UserMemberLists;
import com.pace.base.project.ExcelPaceProjectConstants;
import com.pace.base.project.ExcelProjectDataErrorException;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PaceProjectWriteException;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.excel.PafExcelInput;
import com.pace.base.project.excel.PafExcelRow;
import com.pace.base.project.excel.PafExcelValueObject;
import com.pace.base.project.utils.PafExcelUtil;


public class UserMemberListExcelElementItem<T extends UserMemberLists> extends PafExcelElementItem<T> {

	public UserMemberListExcelElementItem(Workbook workbook) {
		super(workbook);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void createHeaderListMapEntries() {
		getHeaderListMap().put(getSheetName(), Arrays.asList("User Member Alias", "Dimension Name","Member List"));
	}

	@Override
	public ProjectElementId getProjectElementId() {
		return ProjectElementId.UserMemberLists;
	}

	@Override
	protected T readExcelSheet() throws PaceProjectReadException, PafException {
		// TODO Auto-generated method stub
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
		.headerListMap(getHeaderListMap())
		.excludeHeaderRows(true)
		.excludeEmptyRows(true)
		.sheetRequired(true)
		.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
		.multiDataRow(true)
		.build();
		
		UserMemberLists usrMemLists = new UserMemberLists();
		
		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);
		
		PafMemberList memberList = null;
		
		for ( PafExcelRow row : excelRowList ) {
		
			String label = null;
			memberList = new PafMemberList();
			for ( Integer rowIndex : row.getRowItemOrderedIndexes()) {
			
				List<PafExcelValueObject> rowItemList = row.getRowItem(rowIndex);
				PafExcelValueObject firstValueObject = rowItemList.get(0);
		
				try {
				
					switch (rowIndex) {
					
						//User Member Alias
						case 0:											
						
							label = PafExcelUtil.getString(getProjectElementId(), firstValueObject, true);
							break;
						
						//Dimension Name
						case 1:											
						
							memberList.setDimName(PafExcelUtil.getString(getProjectElementId(), firstValueObject, true));
							break;
							
						//Member List
						case 2:						
							
							memberList.setMemberNames(PafExcelUtil.getStringAr(getProjectElementId(), rowItemList));
							break;
							
						default:
							
							break;							
					}			
				
				
				} catch (ExcelProjectDataErrorException epdee) {
					
					addProjectDataErrorToList(epdee.getProjectDataError());
					
				}
			}
			usrMemLists.addMemberList(label, memberList);
			
		
		}
		
		return (T) usrMemLists;
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException,
			PafException {
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
		.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
		.build();

		UserMemberLists usrMemLists = t;
		Map<String, PafMemberList> memberLists = usrMemLists.getMemberLists();
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();

		PafExcelRow headerRow = PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName()));
		excelRowList.add(headerRow);
		for ( String alias : memberLists.keySet() ) {
			
			PafMemberList memberList = usrMemLists.getMemberList(alias);
			
			PafExcelRow excelRow = new PafExcelRow();
			
			//User Member Alias
			excelRow.addRowItem(0, PafExcelValueObject.createFromString(alias));
											
			//Dimension Name
			excelRow.addRowItem(1, PafExcelValueObject.createFromString(memberList.getDimName()));
											
			//Member List
			//go thru dimension-security list
			String members[] = memberList.getMemberNames();
			for (int i = 0; i < memberList.getMemberNames().length; i++ ) {
				excelRow.addRowItem(2, PafExcelValueObject.createFromString(members[i]));
			}
			excelRowList.add(excelRow);	
		}
		PafExcelUtil.writeExcelSheet(input, excelRowList);
	}

}
