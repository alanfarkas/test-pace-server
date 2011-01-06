package com.palladium.paf.migration.providers;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.palladium.paf.migration.MigrationAction;
import com.palladium.paf.migration.MigrationActionStatus;

public class TableLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	public String getColumnText(Object element, int columnIndex) {
		
		String columnText = null;
		
		if ( element instanceof MigrationAction) {
		
			MigrationAction action = (MigrationAction) element;
		
			switch (columnIndex ) {
			
			case 0: 
				
				columnText = getStringStatusName(action.getStatus());
				break;
				
			case 1:
				
				columnText = action.getActionName();
				break;
						
			}
		}
		return columnText;
	}

	public Image getColumnImage(Object element, int columnIndex) {
		
		return null;

	}
	
	private String getStringStatusName(MigrationActionStatus migStatus)	 {
		
		String strVal = null;
		
		if ( migStatus != null ) {
			
			switch(migStatus) {
			
			case NotStarted: 
					strVal = "Not Started";
					break;
			case Completed: 
					strVal = "Completed";
					break;
			case Failed:
					strVal = "Failed";
					break;
			
			}
		}
		
		return strVal;		
	}
}
