package com.pace.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.stat.clustering.Cluster;
import org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint;

public class PaceClusteredDataSet {
	private PaceDataSet clusterData;
	private Map<Integer, String[]>clusterKeys = new HashMap<Integer, String[]>();
	
	private List<Cluster<EuclideanIntegerPoint>> clusters;

	public PaceDataSet getClusterData() {
		return clusterData;
	}

	public void setClusterData(PaceDataSet clusterData) {
		this.clusterData = clusterData;
	}

	public Map<Integer, String[]> getClusterKeys() {
		return clusterKeys;
	}

	public void setClusterKeys(Map<Integer, String[]> clusterKeys) {
		this.clusterKeys = clusterKeys;
	}

	public List<Cluster<EuclideanIntegerPoint>> getClusters() {
		return clusters;
	}

	public void setClusters(List<Cluster<EuclideanIntegerPoint>> clusters) {
		this.clusters = clusters;
	}
	
}
