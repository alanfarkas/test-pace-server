/**
 * 
 */
package com.pace.base.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.ViewPrintState;
import com.pace.base.view.IPafView;
import com.pace.base.view.PafUserSelection;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewHeader;
import com.pace.base.view.PafViewSection;

/**
 * @author jmilliron
 * 
 */
public class PafAdminConsoleView implements IPafView, Cloneable {

	private static Logger logger = Logger.getLogger(PafAdminConsoleView.class);

	private Set<String> viewSectionNames;
	
	private ArrayList<PafViewHeader> headers;

	private String name;

	private String desc;

	private String backGroundColor;

	private ArrayList<PafUserSelection> userSelections;
	
	@Deprecated
	private String pageOrientation;	
	@Deprecated
	private Integer pagesTall;	
	@Deprecated
	private Integer pagesWide;

	private PrintStyle printStyle;
	private String globalPrintStyleGUID;
	private ViewPrintState viewPrintState;
	
	public PafAdminConsoleView() {
		viewSectionNames = new HashSet<String>();
		headers = new ArrayList<PafViewHeader>();
		userSelections = new ArrayList<PafUserSelection>();
		printStyle = new PrintStyle();
	}

	public PafAdminConsoleView(PafView view) {

		if (view != null) {
			// this sets the view sections names
			this.setViewSections(view.getViewSectionNames());
			this.setHeaders(view.getHeaders());
			this.setName(view.getName());
			this.setDesc(view.getDesc());
			this.setBackGroundColor(view.getBackGroundColor());
			PafUserSelection[] userSelectionsAr = view.getUserSelections();
			this.userSelections = new ArrayList<PafUserSelection>();
			//TTN 900
			this.setGlobalPrintStyleGUID(view.getGlobalPrintStyleGUID());
			this.setPrintStyle(view.getPrintStyle());
			this.setViewPrintState(view.getViewPrintState());
			
			if (userSelectionsAr != null) {

				for (PafUserSelection userSelection : userSelectionsAr) {
					logger.debug("userSelection: adding " + userSelection.getId());
					this.userSelections.add(userSelection);
				}

			} else {
				logger.debug("userSelection was null");
			}
		}
	}

	public void addHeader(PafViewHeader header) {
		headers.add(header);
	}

	public List<PafViewHeader> getHeaderList() {

		return headers;

	}

	public void deleteHeader(PafViewHeader header) {
		headers.remove(header);
	}

	public void updateHeader(PafViewHeader header) {

		if (headers.contains(header)) {
			headers.add(header);
		}
	}

	public PafViewHeader getHeader(int index) {
		return headers.get(index);
	}

	public String getBackGroundColor() {
		return backGroundColor;
	}

	public void setBackGroundColor(String backGroundColor) {
		this.backGroundColor = backGroundColor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// used to convert to/from PafView
	public PafViewHeader[] getHeaders() {

		return new PafViewHeader[headers.size()];

	}

	// used to convert to/from PafView
	public void setHeaders(PafViewHeader[] headerAr) {

		headers = new ArrayList<PafViewHeader>();

		if (headerAr != null) {

			for (PafViewHeader tmpHeader : headerAr) {

				logger.debug("Adding header: " + tmpHeader);

				headers.add(tmpHeader);
			}

		}

	}

	// this should not be used, will be merged later and by using set
	public PafViewSection[] getViewSections() {
		return null;
	}

	public void setViewSections(PafViewSection[] viewSections) {

		viewSectionNames = new HashSet<String>();

		if (viewSections != null) {

			for (PafViewSection viewSection : viewSections) {
				viewSectionNames.add(viewSection.getName());
			}

		}

	}

	public void setViewSections(String[] viewSectionNameAr) {

		viewSectionNames = new HashSet<String>();

		if (viewSectionNameAr != null && viewSectionNameAr.length > 0) {

			for (String viewSection : viewSectionNameAr) {
				viewSectionNames.add(viewSection);
			}

		}

	}

	public PafView getPafView() {

		PafView view = new PafView();
		view.setName(this.getName());
		view.setDesc(this.getDesc());
		view.setBackGroundColor(this.getBackGroundColor());
		view.setHeaders(this.getHeaders());
		view.setUserSelections(this.userSelections
				.toArray(new PafUserSelection[0]));
		//TTN 900
		view.setPrintStyle(this.getPrintStyle());
		view.setGlobalPrintStyleGUID(this.getGlobalPrintStyleGUID());
		view.setViewPrintState(this.getViewPrintState());
		
		return view;
	}

	public String toString() {

		StringBuffer strBuff = new StringBuffer(100);

		strBuff.append("View Name: " + this.name + "\n");
		strBuff.append("Desc: " + this.desc + "\n");
		strBuff.append("BackGround Color: " + this.backGroundColor + "\n");
		strBuff.append("\t************************************\n");
		strBuff.append("\t*Headers:\n");
		for (PafViewHeader header : getHeaderList()) {
			strBuff.append("\t*\t" + header.getLabel() + "\n");
		}
		strBuff.append("\t************************************\n\n");
		strBuff.append("\t************************************\n");
		strBuff.append("\t*View Sections:\n");
		for (String viewSectionName : viewSectionNames) {
			strBuff.append("\t*\t" + viewSectionName + "\n");
		}
		strBuff.append("\t************************************\n");
		strBuff.append("\t*User Selections:\n");
		for (PafUserSelection userSelection : userSelections) {
			strBuff.append("\t*\t" + userSelection + "\n");
		}
		strBuff.append("\t************************************\n");

		strBuff.append("\t************************************\n");
//		strBuff.append("\t*Page Orientation: " + this.getPageOrientation() + "\n");
//		strBuff.append("\t*Pages Tall: " + this.getPagesTall() + "\n");
//		strBuff.append("\t*Pages Wide: " + this.getPagesWide() + "\n");
		strBuff.append("\t************************************\n");
		
		return strBuff.toString();
	}

	public Object clone() throws CloneNotSupportedException {

		PafAdminConsoleView clonedView = (PafAdminConsoleView) super.clone();

		//PafViewHeader[] headers = getHeaders().clone();

		//System.out.println("First Header: " + getHeaders());
		
		ArrayList<PafViewHeader> headerList = new ArrayList<PafViewHeader>();
		
		for (PafViewHeader header : getHeaders() ) {
			
			System.out.println("Cloning Header: " + header);
			
			headerList.add((PafViewHeader) header.clone());
			
		}
		
		Set<String> clonedSet = new HashSet<String>();

		for (String viewSection : getViewSectionNames()) {
			clonedSet.add(viewSection);
		}

		clonedView.setHeaders(headerList.toArray(new PafViewHeader[0]));
		clonedView.setViewSectionNames(clonedSet);

		return clonedView;
	}

	public Set<String> getViewSectionNames() {
		return viewSectionNames;
	}

	public void setViewSectionNames(Set<String> viewSectionNames) {
		this.viewSectionNames = viewSectionNames;
	}

	public ArrayList<PafUserSelection> getUserSelections() {
		return userSelections;
	}

	public void setUserSelections(ArrayList<PafUserSelection> userSelections) {
		this.userSelections = userSelections;
	}
	
	public void addUserSelection(PafUserSelection userSelection) {
		this.userSelections.add(userSelection);
	}

	public void setPageOrientation(String pageOrientation) {
		this.pageOrientation = pageOrientation;
	}

	public Integer getPagesTall() {
		return pagesTall;
	}

	public void setPagesTall(Integer pagesTall) {
		this.pagesTall = pagesTall;
	}

	public Integer getPagesWide() {
		return pagesWide;
	}

	public void setPagesWide(Integer pagesWide) {
		this.pagesWide = pagesWide;
	}

	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(ArrayList<PafViewHeader> headers) {
		this.headers = headers;
	}


	@Override
	public ViewPrintState getViewPrintState() {
		// TODO Auto-generated method stub
		return this.viewPrintState;
	}

	@Override
	public void setViewPrintState(ViewPrintState viewPrintState) {
		// TODO Auto-generated method stub
		this.viewPrintState = viewPrintState;
	}

	@Override
	public PrintStyle getPrintStyle() {
		// TODO Auto-generated method stub
		return printStyle;
	}

	@Override
	public void setPrintStyle(PrintStyle printStyle) {
		// TODO Auto-generated method stub
		this.printStyle = printStyle;
	}

	@Override
	public String getGlobalPrintStyleGUID() {
		// TODO Auto-generated method stub
		return globalPrintStyleGUID;
	}

	@Override
	public void setGlobalPrintStyleGUID(String globalPrintStyleGUID) {
		// TODO Auto-generated method stub
		this.globalPrintStyleGUID = globalPrintStyleGUID;
	}

	public String getPageOrientation() {
		return pageOrientation;
	}
}
