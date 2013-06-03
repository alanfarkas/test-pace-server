package com.pace.server.comm;

import java.util.List;
import java.util.Map;

import com.pace.base.comm.PafRequest;

public class ClusteredResultSetSaveRequest extends PafRequest {

	private String assortment;
	private StringRow header;
	private StringRow[] data;
	private String productDim;
	private String locationDim;
	private List<String> measures;
	private List<String> dimToCluster;
	private List<String> dimToMeasure;
	private List<String> years;
	private List<String> time;
	private List<String> version;
	private Map<String, Integer> clusters;
	
	public ClusteredResultSetSaveRequest(){super();}
	public ClusteredResultSetSaveRequest(String assortment, StringRow header, StringRow[] data, List<String> measures, List<String> dimToCluster, List<String> dimToMeasure, 
			List<String> years, List<String> time, List<String> version, Map<String, Integer>  clusters){
		super();
		this.assortment = assortment;
		this.header = header;
		this.data = data;
		this.measures = measures;
		this.dimToCluster = dimToCluster;
		this.dimToMeasure = dimToMeasure;
		this.years = years;
		this.time = time;
		this.version = version;
		this.clusters = clusters;
	}

	
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

	/**
	 * @return the clusters
	 */
	public Map<String, Integer>  getClusters() {
		return clusters;
	}

	/**
	 * @param clusters the clusters to set
	 */
	public void setClusters(Map<String, Integer>  clusters) {
		this.clusters = clusters;
	}
	/**
	 * @return the assortment
	 */
	public String getAssortment() {
		return assortment;
	}
	/**
	 * @param assortmentName the assortment to set
	 */
	public void setAssortment(String assortment) {
		this.assortment = assortment;
	}
	/**
	 * @return the productDim
	 */
	public String getProductDim() {
		return productDim;
	}
	/**
	 * @param productDim the productDim to set
	 */
	public void setProductDim(String productDim) {
		this.productDim = productDim;
	}
	/**
	 * @return the locationDim
	 */
	public String getLocationDim() {
		return locationDim;
	}
	/**
	 * @param locationDim the locationDim to set
	 */
	public void setLocationDim(String locationDim) {
		this.locationDim = locationDim;
	}

}
