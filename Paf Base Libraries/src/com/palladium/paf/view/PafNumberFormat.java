/**
 * @(#) PafNumberFormat.java
 */

package com.palladium.paf.view;

public class PafNumberFormat implements Cloneable {
	
	private String name;

	private String pattern;

	private boolean defaultFormat;

	public PafNumberFormat() {
	}

	public PafNumberFormat(String name, String pattern) {
		this.name = name;
		this.pattern = pattern;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public boolean isDefaultFormat() {
		return defaultFormat;
	}

	public void setDefaultFormat(boolean defaultFormat) {
		this.defaultFormat = defaultFormat;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "Name: " + name + ", Pattern: " + pattern + ", Default: "
				+ defaultFormat;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (defaultFormat ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
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
		PafNumberFormat other = (PafNumberFormat) obj;
		if (defaultFormat != other.defaultFormat)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		return true;
	}
	
	
}
