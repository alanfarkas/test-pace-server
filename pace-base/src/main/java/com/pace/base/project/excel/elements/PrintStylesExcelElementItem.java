package com.pace.base.project.excel.elements;

import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.pace.base.PafException;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PaceProjectWriteException;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.excel.IExcelDynamicReferenceElementItem;
import com.pace.base.ui.PrintStyle;

public class PrintStylesExcelElementItem<T extends Map<String, PrintStyle>> extends PafExcelElementItem<T> 
		implements IExcelDynamicReferenceElementItem {

	public PrintStylesExcelElementItem(Workbook workbook) {
		super(workbook);
		// TODO Auto-generated constructor stub
	}

	public PrintStylesExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, String> getDynamicReferenceMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected T readExcelSheet() throws PaceProjectReadException,
			PafException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException,
			PafException {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createHeaderListMapEntries() {
		// TODO Auto-generated method stub

	}

	@Override
	public ProjectElementId getProjectElementId() {
		// TODO Auto-generated method stub
		return ProjectElementId.PrintStyles;
	}

}
