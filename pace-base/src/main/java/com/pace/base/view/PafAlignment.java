/**
 * @(#) PafAlignment.java
 */

package com.pace.base.view;

public class PafAlignment implements Cloneable { 
	
    public static final String LEFT = "Left";
    public static final String RIGHT = "Right";    
    public static final String FULL = "Full";   
    public static final String CENTER = "Center";
        
    private String value = LEFT;
    
    public PafAlignment() {}
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		PafAlignment other = (PafAlignment) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
    

 }


