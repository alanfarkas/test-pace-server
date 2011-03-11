package com.pace.base.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoundingRule {
	
	private List<MemberSet> memberList = new ArrayList<MemberSet>();
	private String roundingFunction;
	private Integer digits;
	
	public void setMemberList(List<MemberSet> memberList) {
		this.memberList = memberList;
	}
	public List<MemberSet> getMemberList() {
		return memberList;
	}
	public void setRoundingFunction(String roundingFunction) {
		this.roundingFunction = roundingFunction;
	}
	public String getRoundingFunction() {
		return roundingFunction;
	}
	public void setDigits(Integer digits) {
		this.digits = digits;
	}
	public Integer getDigits() {
		return digits;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((digits == null) ? 0 : digits.hashCode());
	
		for ( MemberSet memberSet : memberList ) {
			
			result = prime * result
				+ ((memberSet == null) ? 0 : memberSet.hashCode());
			
		}
		
		result = prime
				* result
				+ ((roundingFunction == null) ? 0 : roundingFunction.hashCode());
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
		RoundingRule other = (RoundingRule) obj;
		if (digits == null) {
			if (other.digits != null)
				return false;
		} else if (!digits.equals(other.digits))
			return false;
		if (memberList == null) {
			if (other.memberList != null)
				return false;
		} else if ( ! Arrays.equals(memberList.toArray(), other.memberList.toArray()) ) {
			return false;
		}
		if (roundingFunction == null) {
			if (other.roundingFunction != null)
				return false;
		} else if (!roundingFunction.equals(other.roundingFunction))
			return false;
		return true;
	}

	
	

}
