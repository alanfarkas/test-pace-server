package com.pace.base.ui;

import org.apache.log4j.Logger;

import com.pace.base.utility.GUIDUtil;
import com.pace.base.view.IPrintStyle;
import com.pace.base.view.PafStyle;
public class PrintStyle implements IPrintStyle, Cloneable {
	private transient static final Logger logger = Logger.getLogger(PrintStyle.class);

	private String GUID;
	private String name;
	private Boolean defaultStyle;
	//Page tab
	private Boolean portrait;
	private Boolean landscape;
	private Boolean adjustTo;
	private Integer percentNormalSize;
	private Boolean fitTo;
	private Integer pageWide;
	private Integer pageTall;
	private String paperSize;
	private String firstPageNumber;
	//Margins tab
	private Float header;
	private Float top;
	private Float left;
	private Float right;
	private Float bottom;
	private Float footer;
	private Boolean centerHorizontally;
	private Boolean centerVertically;
	//Header/Footer tab
	private String headerText;
	private String footerText;
	private Boolean diffOddAndEvenPages;
	private Boolean diffFirstPage;
	private Boolean scaleWithDocument;
	private Boolean alignWithPageMargin;
	//Sheet tab
	private Boolean entireView;
	private Boolean userSelection;
	private String userSelectionText;
	private String colsToRepeatAtLeft;
	private String rowsToRepeatAtTop;
	private Boolean gridlines;
	private Boolean blackAndWhite;
	private Boolean draftQuality;
	private Boolean rowAndColHeadings;
	private String comment;
	private String cellErrorsAs;
	private Boolean downThenOver;
	private Boolean overThenDown;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPortrait() {
		return portrait;
	}
	public void setPortrait(Boolean portrait) {
		this.portrait = portrait;
	}
	public Boolean getAdjustTo() {
		return adjustTo;
	}
	public Boolean getLandscape() {
		return landscape;
	}
	public void setLandscape(Boolean landscape) {
		this.landscape = landscape;
	}
	public void setAdjustTo(Boolean adjustTo) {
		this.adjustTo = adjustTo;
	}
	public Integer getPercentNormalSize() {
		return percentNormalSize;
	}
	public void setPercentNormalSize(Integer percentNormalSize) {
		this.percentNormalSize = percentNormalSize;
	}
	public Boolean getFitTo() {
		return fitTo;
	}
	public void setFitTo(Boolean fitTo) {
		this.fitTo = fitTo;
	}
	public Integer getPageWide() {
		return pageWide;
	}
	public void setPageWide(Integer pageWide) {
		this.pageWide = pageWide;
	}
	public Integer getPageTall() {
		return pageTall;
	}
	public void setPageTall(Integer pageTall) {
		this.pageTall = pageTall;
	}
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public String getFirstPageNumber() {
		return firstPageNumber;
	}
	public void setFirstPageNumber(String firstPageNumber) {
		this.firstPageNumber = firstPageNumber;
	}
	public Boolean getDefaultStyle() {
		return defaultStyle;
	}
	public void setDefaultStyle(Boolean defaultStyle) {
		this.defaultStyle = defaultStyle;
	}
	public Float getHeader() {
		return header;
	}
	public void setHeader(Float header) {
		this.header = header;
	}
	public Float getTop() {
		return top;
	}
	public void setTop(Float top) {
		this.top = top;
	}
	public Float getLeft() {
		return left;
	}
	public void setLeft(Float left) {
		this.left = left;
	}
	public Float getRight() {
		return right;
	}
	public void setRight(Float right) {
		this.right = right;
	}
	public Float getBottom() {
		return bottom;
	}
	public void setBottom(Float bottom) {
		this.bottom = bottom;
	}
	public Float getFooter() {
		return footer;
	}
	public void setFooter(Float footer) {
		this.footer = footer;
	}
	public Boolean getCenterHorizontally() {
		return centerHorizontally;
	}
	public void setCenterHorizontally(Boolean centerHorizontally) {
		this.centerHorizontally = centerHorizontally;
	}
	public Boolean getCenterVertically() {
		return centerVertically;
	}
	public void setCenterVertically(Boolean centerVertically) {
		this.centerVertically = centerVertically;
	}
	public String getHeaderText() {
		return headerText;
	}
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}
	public String getFooterText() {
		return footerText;
	}
	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}
	public Boolean getDiffOddAndEvenPages() {
		return diffOddAndEvenPages;
	}
	public void setDiffOddAndEvenPages(Boolean diffOddAndEvenPages) {
		this.diffOddAndEvenPages = diffOddAndEvenPages;
	}
	public Boolean getDiffFirstPage() {
		return diffFirstPage;
	}
	public void setDiffFirstPage(Boolean diffFirstPage) {
		this.diffFirstPage = diffFirstPage;
	}
	public Boolean getScaleWithDocument() {
		return scaleWithDocument;
	}
	public void setScaleWithDocument(Boolean scaleWithDocument) {
		this.scaleWithDocument = scaleWithDocument;
	}
	public Boolean getAlignWithPageMargin() {
		return alignWithPageMargin;
	}
	public void setAlignWithPageMargin(Boolean alignWithPageMargin) {
		this.alignWithPageMargin = alignWithPageMargin;
	}
	public Boolean getEntireView() {
		return entireView;
	}
	public void setEntireView(Boolean entireView) {
		this.entireView = entireView;
	}
	public Boolean getUserSelection() {
		return userSelection;
	}
	public void setUserSelection(Boolean userSelection) {
		this.userSelection = userSelection;
	}
	public String getUserSelectionText() {
		return userSelectionText;
	}
	public void setUserSelectionText(String userSelectionText) {
		this.userSelectionText = userSelectionText;
	}
	public Boolean getGridlines() {
		return gridlines;
	}
	public void setGridlines(Boolean gridlines) {
		this.gridlines = gridlines;
	}
	public Boolean getBlackAndWhite() {
		return blackAndWhite;
	}
	public void setBlackAndWhite(Boolean blackAndWhite) {
		this.blackAndWhite = blackAndWhite;
	}
	public Boolean getDraftQuality() {
		return draftQuality;
	}
	public void setDraftQuality(Boolean draftQuality) {
		this.draftQuality = draftQuality;
	}
	public Boolean getRowAndColHeadings() {
		return rowAndColHeadings;
	}
	public void setRowAndColHeadings(Boolean rowAndColHeadings) {
		this.rowAndColHeadings = rowAndColHeadings;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCellErrorsAs() {
		return cellErrorsAs;
	}
	public void setCellErrorsAs(String cellErrorsAs) {
		this.cellErrorsAs = cellErrorsAs;
	}
	public Boolean getDownThenOver() {
		return downThenOver;
	}
	public void setDownThenOver(Boolean downThenOver) {
		this.downThenOver = downThenOver;
	}
	public Boolean getOverThenDown() {
		return overThenDown;
	}
	public void setOverThenDown(Boolean overThenDown) {
		this.overThenDown = overThenDown;
	}
	
	/**
	 * @return the colsToRepeatAtLeft
	 */
	public String getColsToRepeatAtLeft() {
		return colsToRepeatAtLeft;
	}
	/**
	 * @param colsToRepeatAtLeft the colsToRepeatAtLeft to set
	 */
	public void setColsToRepeatAtLeft(String colsToRepeatAtLeft) {
		this.colsToRepeatAtLeft = colsToRepeatAtLeft;
	}
	/**
	 * @return the rowsToRepeatAtTop
	 */
	public String getRowsToRepeatAtTop() {
		return rowsToRepeatAtTop;
	}
	/**
	 * @param rowsToRepeatAtTop the rowsToRepeatAtTop to set
	 */
	public void setRowsToRepeatAtTop(String rowsToRepeatAtTop) {
		this.rowsToRepeatAtTop = rowsToRepeatAtTop;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result	+ ((portrait == null) ? 0 : portrait.hashCode());
		result = prime * result	+ ((landscape == null) ? 0 : landscape.hashCode());
		result = prime * result + ((adjustTo == null) ? 0 : adjustTo.hashCode());
		result = prime * result	+ ((percentNormalSize == null) ? 0 : percentNormalSize.hashCode());
		result = prime * result	+ ((fitTo == null) ? 0 : fitTo.hashCode());
		result = prime * result	+ ((pageWide == null) ? 0 : pageWide.hashCode());
		result = prime * result	+ ((pageTall == null) ? 0 : pageTall.hashCode());
		result = prime * result + ((paperSize == null) ? 0 : paperSize.hashCode());
		result = prime * result	+ ((firstPageNumber == null) ? 0 : firstPageNumber.hashCode());
		result = prime * result	+ ((header == null) ? 0 : header.hashCode());
		result = prime * result	+ ((top == null) ? 0 : top.hashCode());
		result = prime * result	+ ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + ((bottom == null) ? 0 : bottom.hashCode());
		result = prime * result + ((footer == null) ? 0 : footer.hashCode());
		result = prime * result	+ ((centerHorizontally == null) ? 0 : centerHorizontally.hashCode());
		result = prime * result	+ ((centerVertically == null) ? 0 : centerVertically.hashCode());
		result = prime * result	+ ((headerText == null) ? 0 : headerText.hashCode());
		result = prime * result	+ ((footerText == null) ? 0 : footerText.hashCode());
		result = prime * result	+ ((diffOddAndEvenPages == null) ? 0 : diffOddAndEvenPages.hashCode());
		result = prime * result + ((diffFirstPage == null) ? 0 : diffFirstPage.hashCode());
		result = prime * result	+ ((scaleWithDocument == null) ? 0 : scaleWithDocument.hashCode());
		result = prime * result	+ ((alignWithPageMargin == null) ? 0 : alignWithPageMargin.hashCode());
		result = prime * result	+ ((entireView == null) ? 0 : entireView.hashCode());
		result = prime * result	+ ((userSelection == null) ? 0 : userSelection.hashCode());
		result = prime * result + ((colsToRepeatAtLeft == null) ? 0 : colsToRepeatAtLeft.hashCode());
		result = prime * result + ((rowsToRepeatAtTop == null) ? 0 : rowsToRepeatAtTop.hashCode());
		result = prime * result + ((gridlines == null) ? 0 : gridlines.hashCode());
		result = prime * result	+ ((blackAndWhite == null) ? 0 : blackAndWhite.hashCode());
		result = prime * result	+ ((draftQuality == null) ? 0 : draftQuality.hashCode());
		result = prime * result	+ ((rowAndColHeadings == null) ? 0 : rowAndColHeadings.hashCode());
		result = prime * result	+ ((comment == null) ? 0 : comment.hashCode());
		result = prime * result	+ ((cellErrorsAs == null) ? 0 : cellErrorsAs.hashCode());
		result = prime * result	+ ((downThenOver == null) ? 0 : downThenOver.hashCode());
		result = prime * result	+ ((overThenDown == null) ? 0 : overThenDown.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj ) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrintStyle other = (PrintStyle) obj;
		if( ! this.portrait.equals(other.portrait) )
			return false;
		if( ! this.landscape.equals(other.landscape ) )
			return false;
		if( ! this.adjustTo.equals(other.adjustTo) )
			return false;
		if( ! this.percentNormalSize.equals(other.percentNormalSize) )
			return false;
		if( ! this.fitTo.equals(other.fitTo) )
			return false;
		if( ! this.pageWide.equals(other.pageWide) )
			return false;
		if( ! this.pageTall.equals(other.pageTall) )
			return false;
		if( ! this.paperSize.equalsIgnoreCase(other.paperSize ) )
			return false;
		if( ! this.firstPageNumber.equalsIgnoreCase(other.firstPageNumber ) )
			return false;
		if( ! this.header.equals(other.header) )
			return false;
		if( ! this.top.equals(other.top) )
			return false;
		if( ! this.left.equals(other.left) )
			return false;
		if( ! this.right.equals(other.right) )
			return false;
		if( ! this.bottom.equals(other.bottom) )
			return false;
		if( ! this.footer.equals(other.footer) )
			return false;
		if( ! this.centerHorizontally.equals(other.centerHorizontally) )
			return false;
		if( ! this.centerVertically.equals(other.centerVertically) )
			return false;
		if( ! this.headerText.equalsIgnoreCase(other.headerText ) )
			return false;
		if( ! this.footerText.equalsIgnoreCase(other.footerText ) )
			return false;
		if( ! this.diffOddAndEvenPages.equals(other.diffOddAndEvenPages) )
			return false;
		if( ! this.diffFirstPage.equals(other.diffFirstPage) )
			return false;
		if( ! this.scaleWithDocument.equals(other.scaleWithDocument) )
			return false;
		if( ! this.alignWithPageMargin.equals(other.alignWithPageMargin) )
			return false;
		if( ! this.entireView.equals(other.entireView) )
			return false;
		if( ! this.userSelection.equals(other.userSelection) )
			return false;
		if( ! this.userSelectionText.equalsIgnoreCase(other.userSelectionText ) )
			return false;
		if( ! this.colsToRepeatAtLeft.equalsIgnoreCase(other.colsToRepeatAtLeft) )
			return false;
		if( ! this.rowsToRepeatAtTop.equalsIgnoreCase(other.rowsToRepeatAtTop) )
			return false;
		if( ! this.gridlines.equals(other.gridlines) )
			return false;
		if( ! this.blackAndWhite.equals(other.blackAndWhite) )
			return false;
		if( ! this.draftQuality.equals(other.draftQuality) )
			return false;
		if( ! this.rowAndColHeadings.equals(other.rowAndColHeadings) )
			return false;
		if( ! this.comment.equalsIgnoreCase(other.comment ) )
			return false;
		if( ! this.cellErrorsAs.equalsIgnoreCase(other.cellErrorsAs) )
			return false;
		if( ! this.downThenOver.equals(other.downThenOver) )
			return false;
		if( ! this.overThenDown.equals(other.overThenDown) )
			return false;
		return true;
	}
	@Override
	public PrintStyle clone() {

		try {
			return (PrintStyle) super.clone();
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		return null;
		
	}
	@Override
	public String getGUID() {
		// TODO Auto-generated method stub
		return this.GUID;
	}
	@Override
	public void setGUID(String GUID) {
		// TODO Auto-generated method stub
		this.GUID = GUID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Print Style: " +  this.getName();
	}
	
	
}
