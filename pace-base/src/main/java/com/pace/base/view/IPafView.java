package com.pace.base.view;

import com.pace.base.ViewPrintState;
import com.pace.base.ui.PrintStyle;

public interface IPafView {

	public abstract String getDesc();

	public abstract void setDesc(String desc);

	public abstract PafViewHeader[] getHeaders();

	public abstract void setHeaders(PafViewHeader headers[]);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract PafViewSection[] getViewSections();

	public abstract void setViewSections(PafViewSection viewSections[]);

	/**
	 * @return Returns the backGroundColor.
	 */
	public abstract String getBackGroundColor();
	
	/**
	 * @param backGroundColor The backGroundColor to set.
	 */
	public abstract void setBackGroundColor(String backGroundColor);
	
	public PrintStyle getPrintStyle();
	
	public void setPrintStyle( PrintStyle printStyle );
	
	public String getGlobalPrintStyleGUID();
	
	public void setGlobalPrintStyleGUID( String guidGlobalPrintStyle );

	public abstract ViewPrintState getViewPrintState();

	public abstract void setViewPrintState(ViewPrintState printState);
}