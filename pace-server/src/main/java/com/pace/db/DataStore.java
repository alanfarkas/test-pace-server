/**
 * 
 */
package com.pace.db;

import java.util.ArrayList;
import java.util.List;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pace.server.PaceDataSet;

/**
 * @author jim
 * Simple implementation of an object datastore
 */
public class DataStore {
	OObjectDatabaseTx db = new OObjectDatabaseTx("local:paceCache");

	public DataStore() {
		if (!db.exists()) {
			db.create();
			db.getEntityManager().registerEntityClass(PaceDataSet.class);			
		}
	}
	
	

	public void storePaceDataSet(String clientId, PaceDataSet dataSet) {
		
		PaceDataSet pDataSet = db.newInstance(PaceDataSet.class);
		
		pDataSet.setData(dataSet.getData());
		pDataSet.setClientId(clientId);
		
		db.save(pDataSet);
		
	}
	
	public void delPaceDataSet(PaceDataSet ds) {
		db.delete(ds);
	}
	
	public void delAllUserData(String clientId) {
		for (PaceDataSet ds : db.browseClass(PaceDataSet.class)) {
			if (ds.getClientId().equals(clientId)) {
				db.delete(ds);
			}
		}
	}
	
	public List<PaceDataSet> getPaceDataSets(String clientId) {
		List<PaceDataSet> dataSets = new ArrayList<PaceDataSet>();
		for (PaceDataSet ds : db.browseClass(PaceDataSet.class)) {
			if (ds.getClientId().equals(clientId)) {
				dataSets.add(ds);
			}
		}
		return dataSets;
	}
	

	
}
