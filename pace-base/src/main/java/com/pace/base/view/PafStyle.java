/*
 *	File: @(#)PafStyle.java 	Package: com.pace.base.view 	Project: Paf Base Libraries
 *	Created: Feb 16, 2005  		By: JavaJ
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */

package com.pace.base.view;

/**
 * 
 * Global Style.
 *
 * @version	x.xx
 * @author JavaJ
 *
 */
public class PafStyle implements Cloneable {

	private String name;

	private String fontName;

	private String fontColor;

	private String bgFillColor;

	private PafAlignment alignment;

	private Boolean bold;

	private Boolean italics;

	private Boolean underline;

	//TODO set to false for now, will remove later
	private Boolean doubleUnderline = new Boolean(false);

	private Boolean strikeOut;

	private Integer size;

	private String bgHexFillColor;
	
	private String fontHexColor;
	
	/**
	 * @return the bgHexFillColor
	 */
	public String getBgHexFillColor() {
		return bgHexFillColor;
	}

	/**
	 * @param bgHexFillColor the bgHexFillColor to set
	 */
	public void setBgHexFillColor(String bgHexFillColor) {
		this.bgHexFillColor = bgHexFillColor;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public PafAlignment getAlignment() {
		return alignment;
	}

	public void setAlignment(PafAlignment alignment) {
		this.alignment = alignment;
	}

	
	/**
	 * @deprecated  As of release 2.0.24.0, replaced by {@link #getBgHexFillColor()}
	 */
	public String getBgFillColor() {
		return bgFillColor;
	}

	/**
	 * @deprecated  As of release 2.0.24.0, replaced by {@link #setBgHexFillColor()}
	 */	
	public void setBgFillColor(String bgFillColor) {
		this.bgFillColor = bgFillColor;
	}

	/**
	 * @deprecated  As of release 2.0.24.0, replaced by {@link #getFontHexColor()}
	 */
	public String getFontColor() {
		return fontColor;
	}

	/**
	 * @deprecated  As of release 2.0.24.0, replaced by {@link #setFontHexColor()}
	 */
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getBold() {
		return bold;
	}

	public void setBold(Boolean bold) {
		this.bold = bold;
	}

	public Boolean getDoubleUnderline() {
		return doubleUnderline;
	}

	public void setDoubleUnderline(Boolean doubleUnderline) {
		this.doubleUnderline = doubleUnderline;
	}

	public Boolean getItalics() {
		return italics;
	}

	public void setItalics(Boolean italics) {
		this.italics = italics;
	}

	public Boolean getStrikeOut() {
		return strikeOut;
	}

	public void setStrikeOut(Boolean strikeOut) {
		this.strikeOut = strikeOut;
	}

	public Boolean getUnderline() {
		return underline;
	}

	public void setUnderline(Boolean underline) {
		this.underline = underline;
	}

	/**
	 * @return the fontHexColor
	 */
	public String getFontHexColor() {
		return fontHexColor;
	}

	/**
	 * @param fontHexColor the fontHexColor to set
	 */
	public void setFontHexColor(String fontHexColor) {
		this.fontHexColor = fontHexColor;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		PafStyle clonedStyle = (PafStyle) super.clone();
		if (this.alignment != null ) {
			clonedStyle.alignment = (PafAlignment) this.alignment.clone();
		}
		
		return clonedStyle;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((alignment == null) ? 0 : alignment.hashCode());
		result = prime * result
				+ ((bgFillColor == null) ? 0 : bgFillColor.hashCode());
		result = prime * result
				+ ((bgHexFillColor == null) ? 0 : bgHexFillColor.hashCode());
		result = prime * result + ((bold == null) ? 0 : bold.hashCode());
		result = prime * result
				+ ((doubleUnderline == null) ? 0 : doubleUnderline.hashCode());
		result = prime * result
				+ ((fontColor == null) ? 0 : fontColor.hashCode());
		result = prime * result
				+ ((fontHexColor == null) ? 0 : fontHexColor.hashCode());
		result = prime * result
				+ ((fontName == null) ? 0 : fontName.hashCode());
		result = prime * result + ((italics == null) ? 0 : italics.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result
				+ ((strikeOut == null) ? 0 : strikeOut.hashCode());
		result = prime * result
				+ ((underline == null) ? 0 : underline.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafStyle other = (PafStyle) obj;
		if (alignment == null) {
			if (other.alignment != null)
				return false;
		} else if (!alignment.equals(other.alignment))
			return false;
		if (bgFillColor == null) {
			if (other.bgFillColor != null)
				return false;
		} else if (!bgFillColor.equals(other.bgFillColor))
			return false;
		if (bgHexFillColor == null) {
			if (other.bgHexFillColor != null)
				return false;
		} else if (!bgHexFillColor.equals(other.bgHexFillColor))
			return false;
		if (bold == null) {
			if (other.bold != null)
				return false;
		} else if (!bold.equals(other.bold))
			return false;
		if (doubleUnderline == null) {
			if (other.doubleUnderline != null)
				return false;
		} else if (!doubleUnderline.equals(other.doubleUnderline))
			return false;
		if (fontColor == null) {
			if (other.fontColor != null)
				return false;
		} else if (!fontColor.equals(other.fontColor))
			return false;
		if (fontHexColor == null) {
			if (other.fontHexColor != null)
				return false;
		} else if (!fontHexColor.equals(other.fontHexColor))
			return false;
		if (fontName == null) {
			if (other.fontName != null)
				return false;
		} else if (!fontName.equals(other.fontName))
			return false;
		if (italics == null) {
			if (other.italics != null)
				return false;
		} else if (!italics.equals(other.italics))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (strikeOut == null) {
			if (other.strikeOut != null)
				return false;
		} else if (!strikeOut.equals(other.strikeOut))
			return false;
		if (underline == null) {
			if (other.underline != null)
				return false;
		} else if (!underline.equals(other.underline))
			return false;
		return true;
	}
	
	

}
