/**
 * @(#) NumericMemberFormat.java
 */

package com.palladium.paf.view;


public class NumericMemberFormat
{
	private String dimensionName;
	private String memberName;
	private PafNumberFormat numberFormat;
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public PafNumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(PafNumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
	}

	public String getDimensionName( )
	{
		return dimensionName;
	}
	
	
}
