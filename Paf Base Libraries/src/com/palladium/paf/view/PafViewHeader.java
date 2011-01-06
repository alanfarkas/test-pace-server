/**
 * @(#) PafViewHeader.java
 */

package com.palladium.paf.view;


public class PafViewHeader implements Cloneable
{
	private String label;
	
	private String globalStyleName;
    
    public PafViewHeader() {}
    
    public PafViewHeader(String text) {
        this.label = text;
    }
    
    public PafViewHeader(String label, String globalStyleName) {
    	this.label = label;
    	this.globalStyleName = globalStyleName;
    }

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}	

	public String getGlobalStyleName() {
		return globalStyleName;
	}

	public void setGlobalStyleName(String globalStyleName) {
		this.globalStyleName = globalStyleName;
	}

	@Override
	public PafViewHeader clone() throws CloneNotSupportedException {
		return (PafViewHeader) super.clone();
	}
	
	public String toString() {
		
		return label + "|" + globalStyleName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((globalStyleName == null) ? 0 : globalStyleName.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
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
		PafViewHeader other = (PafViewHeader) obj;
		if (globalStyleName == null) {
			if (other.globalStyleName != null)
				return false;
		} else if (!globalStyleName.equals(other.globalStyleName))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}
	
	
}
