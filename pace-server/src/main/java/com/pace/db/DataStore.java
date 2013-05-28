/**
 * 
 */
package com.pace.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cern.colt.matrix.DoubleMatrix2D;

import com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal;
import com.orientechnologies.orient.core.serialization.serializer.object.OObjectSerializer;
import com.orientechnologies.orient.object.db.OObjectDatabasePool;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.orientechnologies.orient.object.serialization.OObjectSerializerContext;
import com.orientechnologies.orient.object.serialization.OObjectSerializerHelper;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.PafDimSpec2;
import com.pace.server.PaceDataSet;
import com.pace.server.assortment.AsstSet;

/**
 * @author jim
 * Simple implementation of an object datastore
 */
public class DataStore {
	
	private String URL = "local:odb/paceCache";
	private String USER_ID="admin";
	private String PASSWORD = "admin";

	private OObjectDatabaseTx db = new OObjectDatabaseTx("local:odb/paceCache");
	
	public DataStore() {
		
		
		if (!db.exists()) {
			db.create();
		}
		
		if (db.isClosed()) {
			db.open("admin", "admin");
		}
			
		
		OObjectSerializerContext serializerContext = new OObjectSerializerContext();
		serializerContext.bind(new OObjectSerializer<String[], List<String>>() {
		  
	
			@Override
			public List<String> serializeFieldValue(Class<?> iClass, String[] iFieldValue) {
				return Arrays.asList(iFieldValue);
			}
	
			@Override
			public String[] unserializeFieldValue(Class<?> iClass, List<String> iFieldValue) {
				return iFieldValue.toArray(new String[iFieldValue.size()]);
			}
		  
		});
		OObjectSerializerHelper.bindSerializerContext(PafDimSpec.class, serializerContext);
		
		  db.getEntityManager().registerEntityClass(PaceDataSet.class);
		  db.getEntityManager().registerEntityClass(AsstSet.class);
		  db.getEntityManager().registerEntityClass(PafDimSpec.class);
		  db.getEntityManager().registerEntityClass(PafDimSpec2.class);
		  db.getEntityManager().registerEntityClass(DoubleMatrix2D.class);
		  
		  //db.close();
	}
	
	
	public AsstSet initAsstSet(String clientId, String sessionId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		AsstSet asst = db.newInstance(AsstSet.class, clientId, sessionId);
		db.attachAndSave(asst);
		return asst;
	}
	
	
	public PafDimSpec2 createPafDimSpec(String dim, List<String> expressionList){
		// OPEN THE DATABASE
		  //OObjectDatabaseTx db= OObjectDatabasePool.global().acquire(URL, USER_ID, PASSWORD);
		  ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		  
		  try {
			  PafDimSpec2 temp = db.newInstance(PafDimSpec2.class, dim, expressionList);
				
				db.attachAndSave(temp);
				return temp;
		  } finally {
		    //db.close();
		  }
	}
	
	public AsstSet getAsstSet(String clientId, String sessionId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		AsstSet asst = null;
		for (AsstSet a : db.browseClass(AsstSet.class)) {
			if (a.getClientId().equals(clientId)) {
				asst = db.detachAll(a, false);
				break;
			}
		}
		return asst;		
	}
	

	public void clrAsstSets() {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		for (AsstSet asst : db.browseClass(AsstSet.class)) {
			db.delete(asst);
		}				
	}
	
	
	public void clrDimSets() {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		for (PafDimSpec2 asst : db.browseClass(PafDimSpec2.class)) {
			db.delete(asst);
		}				
	}
	
	public void delAsstSet(String clientId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		for (AsstSet asst : db.browseClass(AsstSet.class)) {
			if (asst.getClientId().equals(clientId)) {
				db.delete(asst);
			}
		}		
	}


	public void storePaceDataSet(String clientId, String sessionId, PaceDataSet dataSet) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
	
		PaceDataSet pDataSet = db.newInstance(PaceDataSet.class, dataSet.getData());
		
		pDataSet.setClientId(clientId);
		//pDataSet.setData(dataSet.getData());
		pDataSet.setSessionId(sessionId);
		
		pDataSet.setData(dataSet.getData());
		pDataSet.setClientId(clientId);
		
		db.attachAndSave(pDataSet);
		
	}
	
	public void delPaceDataSet(PaceDataSet ds) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());

		db.delete(ds);
	}
	
	public void delAllUserData(String clientId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());

		for (PaceDataSet ds : db.browseClass(PaceDataSet.class)) {
			if (ds.getClientId().equals(clientId)) {
				db.delete(ds);
			}
		}
	}
	
	public List<PaceDataSet> getPaceDataSets(String clientId) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());

		List<PaceDataSet> dataSets = new ArrayList<PaceDataSet>();
		for (PaceDataSet ds : db.browseClass(PaceDataSet.class)) {
			if (ds.getClientId().equals(clientId)) {
				//dataSets.add(ds);
				dataSets.add((PaceDataSet) db.detachAll(ds, false));
			}
		}
		return dataSets;
	}
	
	protected void finalize() throws Throwable
	{
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		
		this.clrAsstSets();
		db.close();
		super.finalize();

	}
	
	public void saveAsst(AsstSet asst) {
		ODatabaseRecordThreadLocal.INSTANCE.set(db.getUnderlying());
		db.attachAndSave(asst);
	} 
		
}
