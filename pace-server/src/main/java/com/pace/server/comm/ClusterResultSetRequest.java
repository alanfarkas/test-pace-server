/**
 * 
 */
package com.pace.server.comm;

import com.pace.base.app.PafDimSpec;
import com.pace.base.comm.PafRequest;

/**
 * @author jim
 *
 * Just a stub to kick off the clustering behavior
 */
public class ClusterResultSetRequest extends PafRequest {
	
	private String label;
	private PafDimSpec timeDimSpec;
	private PafDimSpec yearsDimSpec;
	private PafDimSpec measuresDimSpec;
	private PafDimSpec versionDimSpec;
	private int numOfClusters;
	private int maxIterations;
	
	public ClusterResultSetRequest(){super();}

	public ClusterResultSetRequest(String label, PafDimSpec timeDimSpec, PafDimSpec yearsDimSpec, PafDimSpec measuresDimSpec, PafDimSpec versionDimSpec,
			int numOfClusters, int maxIterations){
		super();
		this.label = label;
		this.timeDimSpec = timeDimSpec;
		this.yearsDimSpec = yearsDimSpec;
		this.measuresDimSpec = measuresDimSpec;
		this.versionDimSpec = versionDimSpec;
		this.numOfClusters = numOfClusters;
		this.maxIterations = maxIterations;
	}
	
	public PafDimSpec getTimeDimSpec() {
		return timeDimSpec;
	}

	public void setTimeDimSpec(PafDimSpec timeDimSpec) {
		this.timeDimSpec = timeDimSpec;
	}

	public PafDimSpec getYearsDimSpec() {
		return yearsDimSpec;
	}

	public void setYearsDimSpec(PafDimSpec yearsDimSpec) {
		this.yearsDimSpec = yearsDimSpec;
	}

	public PafDimSpec getMeasuresDimSpec() {
		return measuresDimSpec;
	}

	public void setMeasuresDimSpec(PafDimSpec measuresDimSpec) {
		this.measuresDimSpec = measuresDimSpec;
	}

	public PafDimSpec getVersionDimSpec() {
		return versionDimSpec;
	}

	public void setVersionDimSpec(PafDimSpec versionDimSpec) {
		this.versionDimSpec = versionDimSpec;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public int getNumOfClusters() {
		return numOfClusters;
	}

	public void setNumOfClusters(int numOfClusters) {
		this.numOfClusters = numOfClusters;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}

}
