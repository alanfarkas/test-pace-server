package com.palladium.paf.server.comm;

import com.pace.base.app.VersionDef;

public class SimpleVersionDef {

	private String name;
	private String type;
	private String numericFormat;
	
	//used in WS
	public SimpleVersionDef() {}
	
	public SimpleVersionDef(VersionDef versionDef) {
		
		this.name = versionDef.getName();
		this.type = versionDef.getType().name();
		this.numericFormat = versionDef.getNumericFormatName();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumericFormat() {
		return numericFormat;
	}
	public void setNumericFormat(String numericFormat) {
		this.numericFormat = numericFormat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
}
