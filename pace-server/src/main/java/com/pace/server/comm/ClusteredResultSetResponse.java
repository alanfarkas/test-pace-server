/**
 * 
 */
package com.pace.server.comm;

import java.util.List;

import com.pace.base.comm.PafResponse;

/**
 * @author jim
 *
 */
public class ClusteredResultSetResponse extends PafResponse {
	private StringRow header;
	private StringRow[] data;
	private List<String> measures;
	private List<String> dimToCluster;
	private List<String> dimToMeasure;
	private List<String> years;
	private List<String> time;
	private List<String> version;
	
	public ClusteredResultSetResponse(){super();}
	
	public StringRow[] getData() {
		return data;
	}
	public void setData(StringRow[] data) {
		this.data = data;
	}
	public StringRow getHeader() {
		return header;
	}
	public void setHeader(StringRow header) {
		this.header = header;
	}
	public List<String> getMeasures() {
		return measures;
	}
	public void setMeasures(List<String> measures) {
		this.measures = measures;
	}
	public List<String> getDimToCluster() {
		return dimToCluster;
	}
	public void setDimToCluster(List<String> dimToCluster) {
		this.dimToCluster = dimToCluster;
	}
	public List<String> getDimToMeasure() {
		return dimToMeasure;
	}
	public void setDimToMeasure(List<String> dimToMeasure) {
		this.dimToMeasure = dimToMeasure;
	}
	public List<String> getYears() {
		return years;
	}
	public void setYears(List<String> years) {
		this.years = years;
	}
	public List<String> getTime() {
		return time;
	}
	public void setTime(List<String> time) {
		this.time = time;
	}
	public List<String> getVersion() {
		return version;
	}
	public void setVersion(List<String> version) {
		this.version = version;
	}

}
