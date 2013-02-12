package com.pace.base.comm;

import com.pace.base.view.PafUserSelection;

public interface IPafViewRequest {
	
	public String getViewName();
	public String getClientId();
	public PafUserSelection[] getUserSelections();
	public boolean getRowsSuppressed();
	public boolean getColumnsSuppressed();
	public SimpleCoordList[] getSessionLockedCells();

}
