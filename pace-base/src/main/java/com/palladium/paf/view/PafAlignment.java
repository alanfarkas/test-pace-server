/**
 * @(#) PafAlignment.java
 */

package com.palladium.paf.view;

/**
 * @Deprecated As of 2.8.2.0, replace with {@link #com.pace.base.PafAlignment#} 
 * This is only here as a tool for upgrading current projects.
 *
 *
 */
public class PafAlignment implements Cloneable { 
	
	@Deprecated
    public static final String LEFT = "Left";
	@Deprecated
    public static final String RIGHT = "Right";
	@Deprecated
    public static final String FULL = "Full";
	@Deprecated
    public static final String CENTER = "Center";
	@Deprecated
    private String value = LEFT;
    
	@Deprecated
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
    
	public com.pace.base.view.PafAlignment convert()
	{
		com.pace.base.view.PafAlignment newObject = new com.pace.base.view.PafAlignment();
		
		if(this.value != null){
			newObject.setValue(this.value);
		}
		
		return newObject;
	}
 }


