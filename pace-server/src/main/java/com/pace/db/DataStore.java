/**
 * 
 */
package com.pace.db;

import java.util.ArrayList;
import java.util.List;

import com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pace.server.PaceDataSet;
import com.pace.server.assortment.AsstSet;

/**
 * @author jim
 * Simple implementation of an object datastore
 */
public class DataStore {
	static OObjectDatabaseTx db = new OObjectDatabaseTx("local:odb/paceCache");

	public DataStore() {
		if (!db.exists()) {
			db.create();
		}		
	
		db.open("admin", "admin");
		
		db.getEntityManager().registerEntityClass(PaceDataSet.class);
		db.getEntityManager().registerEntityClass(AsstSet.class);			
	}
	
	
	public AsstSet initAsstSet(String clientId, String sessionId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		AsstSet asst = db.newInstance(AsstSet.class);
		asst.setClientId(clientId);
		asst.setSessionId(sessionId);
		db.save(asst);
		return asst;
	}
	
	public AsstSet getAsstSet(String clientId, String sessionId) {
		AsstSet asst = null;
		for (AsstSet a : db.browseClass(AsstSet.class)) {
			if (a.getClientId().equals(clientId)) {
				asst = a;
				break;
			}
		}
		return asst;		
	}
	
	public void delAsstSet(String clientId) {
		for (AsstSet asst : db.browseClass(AsstSet.class)) {
			if (asst.getClientId().equals(clientId)) {
				db.delete(asst);
			}
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
