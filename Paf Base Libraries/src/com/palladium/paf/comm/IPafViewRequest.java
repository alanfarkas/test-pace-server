package com.palladium.paf.comm;

import com.palladium.paf.view.PafUserSelection;

public interface IPafViewRequest {
	
	public String getViewName();
	public String getClientId();
	public PafUserSelection[] getUserSelections();
	public boolean getRowsSuppressed();
	public boolean getColumnsSuppressed();

}
