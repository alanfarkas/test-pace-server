/**
 * 
 */
package com.pace.server.assortment;

import com.pace.db.PacePOJO;
import com.pace.server.PaceDataSet;

/**
 * @author jim
 *
 */
public class AsstSet extends PacePOJO {
	PaceDataSet dimToCluster = new PaceDataSet();
	PaceDataSet dimToMeasure = new PaceDataSet();
	PaceDataSet clusterSet = new PaceDataSet();	
	
	
	
	public PaceDataSet getDimToCluster() {
		return dimToCluster;
	}
	public void setDimToCluster(PaceDataSet dimToCluster) {
		this.dimToCluster = dimToCluster;
	}
	public PaceDataSet getDimToMeasure() {
		return dimToMeasure;
	}
	public void setDimToMeasure(PaceDataSet dimToMeasure) {
		this.dimToMeasure = dimToMeasure;
	}
	public PaceDataSet getClusterSet() {
		return clusterSet;
	}
	public void setClusterSet(PaceDataSet clusterSet) {
		this.clusterSet = clusterSet;
	}

}
