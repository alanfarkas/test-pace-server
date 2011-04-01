/**
 * @(#) ViewTuple.java
 */

package com.pace.base.view;

import java.io.IOException;
import java.util.List;

import com.pace.base.IPafCompressedObj;
import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.utility.PafXStream;
import com.pace.base.utility.StringUtils;

public class ViewTuple implements Cloneable, IPafCompressedObj {
	
	private Short order;

	private PafStyle dataStyle;

	private PafStyle headerStyle;

	private String dataGlobalStyleName;

	private String headerGlobalStyleName;

	private Boolean visible;

	private boolean memberTag;
	
	private Boolean isMemberTagEditable;
	
	private PafBorder border;

	private PafBorder dataBorder;
	
	private PafBorder headerBorder;

	private Boolean plannable;

	private Boolean drillable;

	private Boolean expanded;

	private Boolean parentFirst;

	private PafNumberFormat numberFormat;

	private String overrideLabel;

	private String numberFormatOverrideLabel;

	private Integer axis;

	private String[] memberDefs;
	
	private List<String> memberTagCommentNames;
	
	private List<String> memberTagCommentValues;
	
	private Float rowHeight;
	
	private Float columnWidth;
	
	private Integer[] symetricGroupNo;

	private Integer[] derivedHeaderGroupNo;
	
	private String compMemberDefs;
	
	private String compMemberTagComments;
	
	private boolean isCompressed;
	
	private String elementDelimiter;
	
	private String groupDelimiter;
	
	public ViewTuple() {
	}

	public ViewTuple(Integer axis, String[] members) {
		memberDefs = members;
		this.axis = axis;
	}

	public Integer getAxis() {
		return axis;
	}

	public void setAxis(Integer axis) {
		this.axis = axis;
	}

	public PafBorder getBorder() {
		return border;
	}

	public void setBorder(PafBorder border) {
		this.border = border;
	}

	public Boolean getDrillable() {
		return drillable;
	}

	public void setDrillable(Boolean drillable) {
		this.drillable = drillable;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public String[] getMemberDefs() {
		return memberDefs;
	}

	public void setMemberDefs(String memberDefs[]) {
		this.memberDefs = memberDefs;
	}

	public PafNumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(PafNumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	public Short getOrder() {
		return order;
	}

	public void setOrder(Short order) {
		this.order = order;
	}

	public String getOverrideLabel() {
		return overrideLabel;
	}

	public void setOverrideLabel(String overrideLabel) {
		this.overrideLabel = overrideLabel;
	}

	public Boolean getParentFirst() {
		return parentFirst;
	}

	public void setParentFirst(Boolean parentFirst) {
		this.parentFirst = parentFirst;
	}

	public Boolean getPlannable() {
		return plannable;
	}

	public void setPlannable(Boolean plannable) {
		this.plannable = plannable;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public ViewTuple clone() {
		
		ViewTuple newTuple = null;

		try {
			newTuple = (ViewTuple) super.clone();
			
			if ( this.memberDefs != null ) {
				newTuple.memberDefs = this.memberDefs.clone();
			}

			if (this.dataStyle != null) {
				newTuple.dataStyle = (PafStyle) this.dataStyle.clone();
			}

			if (this.headerStyle != null) {
				newTuple.headerStyle = (PafStyle) this.headerStyle.clone();
			}

			if (this.numberFormat != null) {
				newTuple.numberFormat = (PafNumberFormat) this.numberFormat
						.clone();
			}

			if (this.border != null) {
				newTuple.border = (PafBorder) this.border.clone();
			}
		} catch (CloneNotSupportedException cex) {
			// this should never happen
			PafErrHandler.handleException(cex, PafErrSeverity.Error);
		}

		return newTuple;
	}

	/**
	 * @return Returns the dataGlobalStyle.
	 */
	public String getDataGlobalStyleName() {
		return dataGlobalStyleName;
	}

	/**
	 * @param dataGlobalStyleName The dataGlobalStyle to set.
	 */
	public void setDataGlobalStyleName(String dataGlobalStyleName) {
		this.dataGlobalStyleName = dataGlobalStyleName;
	}

	/**
	 * @return Returns the dataStyle.
	 */
	public PafStyle getDataStyle() {
		return dataStyle;
	}

	/**
	 * @param dataStyle
	 *            The dataStyle to set.
	 */
	public void setDataStyle(PafStyle dataStyle) {
		this.dataStyle = dataStyle;
	}

	/**
	 * @return Returns the headerGlobalStyle.
	 */
	public String getHeaderGlobalStyleName() {
		return headerGlobalStyleName;
	}

	/**
	 * @param headerGlobalStyleName
	 *            The headerGlobalStyle to set.
	 */
	public void setHeaderGlobalStyleName(String headerGlobalStyleName) {
		this.headerGlobalStyleName = headerGlobalStyleName;
	}

	/**
	 * @return Returns the headerStyle.
	 */
	public PafStyle getHeaderStyle() {
		return headerStyle;
	}

	/**
	 * @param headerStyle
	 *            The headerStyle to set.
	 */
	public void setHeaderStyle(PafStyle headerStyle) {
		this.headerStyle = headerStyle;
	}

	public String getNumberFormatOverrideLabel() {
		return numberFormatOverrideLabel;
	}

	public void setNumberFormatOverrideLabel(String numberFormatOverrideLabel) {
		this.numberFormatOverrideLabel = numberFormatOverrideLabel;
	}

	public PafBorder getHeaderBorder() {
		return headerBorder;
	}

	public void setHeaderBorder(PafBorder headerBorder) {
		this.headerBorder = headerBorder;
	}

	public Float getColumnWidth() {
		return columnWidth;
	}

	public void setColumnWidth(Float columnWidth) {
		this.columnWidth = columnWidth;
	}

	public Float getRowHeight() {
		return rowHeight;
	}

	public void setRowHeight(Float rowHeight) {
		this.rowHeight = rowHeight;
	}

	/**
	 * @return Returns the symetricGroupNo.
	 */
	public Integer[] getSymetricGroupNo() {
		return symetricGroupNo;
	}

	/**
	 * @param index Element index corresponding to a hiearchical group level
	 * 
	 * @return Returns the symetricGroupNo for the specified index
	 */
	public Integer getSymetricGroupNo(int index) {
		
		// Check for invalid index
		if (symetricGroupNo == null || index >= symetricGroupNo.length) {
			String errMsg = "Can not retrieve element [" + index + "] from the array: [symetricGroupNo]."; 
			if (symetricGroupNo == null) {
				errMsg = errMsg + " The array is null";
			} else {
				errMsg = errMsg + " The array only has [" + index + "] elements";				
			}
			throw new IllegalArgumentException(errMsg);
		}
		
		return symetricGroupNo[index];
	}

	/**
	 * @param symetricGroupNo The symetricGroupNo to set.
	 */
	public void setSymetricGroupNo(Integer[] symetricGroupNo) {
		this.symetricGroupNo = symetricGroupNo;
	}

	/**
	 *	Set the specified element of the symetricGroupNo array
	 *
	 * @param index Element index corresponding to a hiearchical group level
	 * @param groupNo
	 */
	public void setSymetricGroupNo(int index, Integer groupNo) {
		
		// Check for invalid index
		if (symetricGroupNo == null || index >= symetricGroupNo.length) {
			String errMsg = "Can not set element [" + index + "] from the array: [symetricGroupNo]."; 
			if (symetricGroupNo == null) {
				errMsg = errMsg + " The array is null";
			} else {
				errMsg = errMsg + " The array only has [" + index + "] elements";				
			}
			throw new IllegalArgumentException(errMsg);
		}
		symetricGroupNo[index] = groupNo;
	}

	
	/**
	 * @return Returns the derivedHeaderGroupNo.
	 */
	public Integer[] getDerivedHeaderGroupNo() {
		return derivedHeaderGroupNo;
	}

	/**
	 * @param index Element index corresponding to a hiearchical group level
	 * 
	 * @return Returns the derivedHeaderGroupNo for the specified index
	 */
	public Integer getDerivedHeaderGroupNo(int index) {
		
		// Check for invalid index
		if (derivedHeaderGroupNo == null || index >= derivedHeaderGroupNo.length) {
			String errMsg = "Can not retrieve element [" + index + "] from the array: [derivedHeaderGroupNo]."; 
			if (symetricGroupNo == null) {
				errMsg = errMsg + " The array is null";
			} else {
				errMsg = errMsg + " The array only has [" + index + "] elements";				
			}
			throw new IllegalArgumentException(errMsg);
		}
		
		return derivedHeaderGroupNo[index];
	}

	/**
	 * @param derivedHeaderGroupNo The derivedHeaderGroupNo to set.
	 */
	public void setDerivedHeaderGroupNo(Integer[] derivedHeaderGroupNo) {
		this.derivedHeaderGroupNo = derivedHeaderGroupNo;
	}

	/**
	 *	Set the specified element of the derivedHeaderGroupNo array
	 *
	 * @param index Element index corresponding to a hiearchical group level
	 * @param headerGroupNo Used to properly group header info for the presentation layer
	 */
	public void setDerivedHeaderGroupNo(int index, Integer headerGroupNo) {
		
		// Check for invalid index
		if (derivedHeaderGroupNo == null || index >= derivedHeaderGroupNo.length) {
			String errMsg = "Can not set element [" + index + "] from the array: [derivedHeaderGroupNo]."; 
			if (derivedHeaderGroupNo == null) {
				errMsg = errMsg + " The array is null";
			} else {
				errMsg = errMsg + " The array only has [" + index + "] elements";				
			}
			throw new IllegalArgumentException(errMsg);
		}
		derivedHeaderGroupNo[index] = headerGroupNo;
	}

	public static void main (String[] args) {
		
		ViewTuple vt = new ViewTuple();
		
		vt.setBorder(new PafBorder(PafBorder.BORDER_RIGHT));
		vt.setDataBorder(new PafBorder(PafBorder.BORDER_RIGHT));
		vt.setHeaderBorder(new PafBorder(PafBorder.BORDER_LEFT));
		
		
		PafXStream.exportObjectToXml(vt, "c:\\tmp\\vt.xml");
		
	}

	/**
	 * @return the dataBorder
	 */
	public PafBorder getDataBorder() {
		return dataBorder;
	}

	/**
	 * @param dataBorder the dataBorder to set
	 */
	public void setDataBorder(PafBorder dataBorder) {
		this.dataBorder = dataBorder;
	}


	/**
	 * @return the memberTag
	 */
	public boolean isMemberTag() {
		return memberTag;
	}

	/**
	 * @param memberTag the memberTag to set
	 */
	public void setMemberTag(boolean memberTag) {
		this.memberTag = memberTag;
	}

	/**
	 * @return the isMemberTagEditable
	 */
	public Boolean getIsMemberTagEditable() {
		return isMemberTagEditable;
	}

	/**
	 * @param isMemberTagEditable the isMemberTagEditable to set
	 */
	public void setIsMemberTagEditable(Boolean isMemberTagEditable) {
		this.isMemberTagEditable = isMemberTagEditable;
	}	

	/**
	 * @return the memberTagCommentNames
	 */
	public List<String> getMemberTagCommentNames() {
		return memberTagCommentNames;
	}

	/**
	 * @param memberTagCommentNames the memberTagCommentNames to set
	 */
	public void setMemberTagCommentNames(List<String> memberTagCommentNames) {
		this.memberTagCommentNames = memberTagCommentNames;
	}

	/**
	 * @return the memberTagCommentValues
	 */
	public List<String> getMemberTagCommentValues() {
		return memberTagCommentValues;
	}

	/**
	 * @param memberTagCommentValues the memberTagCommentValues to set
	 */
	public void setMemberTagCommentValues(List<String> memberTagCommentValues) {
		this.memberTagCommentValues = memberTagCommentValues;
	}
	
	public boolean containsPafBlank() {

		String[] memberDefsAr = getMemberDefs();

		if (memberDefsAr != null) {

			for (String memberDef : memberDefsAr) {
				if (memberDef.equals(PafBaseConstants.PAF_BLANK)) {
					return true;
				}
			}

		}

		return false;

	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#compressData()
	 */
	public void compressData() throws IOException {

		StringBuffer sb = null;
		final int AVG_TEXT_LENGTH = 20;
		
		
		// Compress member definitions
		if (memberDefs != null && memberDefs.length > 0) {
			compMemberDefs = StringUtils.arrayToString(memberDefs, "", "", "", "", PafBaseConstants.DELIMETER_ELEMENT);
			memberDefs = null;
		}
		
		
		// Compress member tag comments (names and values) into a single string property
		if (memberTagCommentNames != null && memberTagCommentNames.size() > 0 
				&& memberTagCommentValues  != null && memberTagCommentValues.size() > 0) {
			
			// Check that comment names and comment values are the same size
			if (memberTagCommentNames.size() != memberTagCommentValues.size()) {
				throw new IOException("Error compressing member tag comments - memberTagCommentNames and memberTagCommentValues arrays are not the same size");
			}
			
			// Merge memberTagCommentNames and memberTagCommentValues arrays into a single string
			sb = new StringBuffer(memberTagCommentNames.size() * AVG_TEXT_LENGTH);
			for (int i = 0; i < memberTagCommentNames.size(); i++) {
				sb.append(memberTagCommentNames.get(i));
				sb.append(this.elementDelimiter);
				sb.append(memberTagCommentValues.get(i));
				sb.append(this.groupDelimiter);
			}
	
			// Remove trailing delimiter
			sb.delete(sb.length()- this.groupDelimiter.length(), sb.length());
			
			// Clean up
			compMemberTagComments = sb.toString();
			memberTagCommentNames = null;
			memberTagCommentValues = null;
		}
		
		
		// Completed
		isCompressed = true;
	
		
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#isCompressed()
	 */
	public boolean isCompressed() {
		return isCompressed;
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#setCompressed(boolean)
	 */
	public void setCompressed(boolean isCompressed) {
		this.isCompressed = isCompressed;
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the compMemberDefs
	 */
	public String getCompMemberDefs() {
		return compMemberDefs;
	}

	/**
	 * @param compMemberDefs the compMemberDefs to set
	 */
	public void setCompMemberDefs(String compMemberDefs) {
		this.compMemberDefs = compMemberDefs;
	}

	/**
	 * @return the compMemberTagComments
	 */
	public String getCompMemberTagComments() {
		return compMemberTagComments;
	}

	/**
	 * @param compMemberTagComments the compMemberTagComments to set
	 */
	public void setCompMemberTagComments(String compMemberTagComments) {
		this.compMemberTagComments = compMemberTagComments;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return StringUtils.arrayToString(memberDefs,"[","]","","",", ");
	}

	public void setElementDelimiter(String elementDelimiter) {
		this.elementDelimiter = elementDelimiter;
	}

	public String getElementDelimiter() {
		return elementDelimiter;
	}

	public void setGroupDelimiter(String groupDelimiter) {
		this.groupDelimiter = groupDelimiter;
	}

	public String getGroupDelimiter() {
		return groupDelimiter;
	}

	/**
	 * Find the member for the specified dimension. If the member is
	 * not found then a null will be returned.
	 * 
	 * @param dim name
	 * @return Found member name (String)
	 */
	public String findMember(String dim) {
		// TODO Auto-generated method stub
		return null;
	}



}
