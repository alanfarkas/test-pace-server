package com.pace.server;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.comm.SessionFactoryType;
import com.pace.base.db.RdbProps;

public class HibernateUtil {

	private static Map<SessionFactoryType, SessionFactory> sessionFactoryMap = new HashMap<SessionFactoryType, SessionFactory>();
	
	public static Map<SessionFactoryType, ThreadLocal> sessionMap = new HashMap<SessionFactoryType, ThreadLocal>();

	static {
		
		String databaseName = null;
		
		try {

			// Create the SessionFacotry from <filename>.cfg.xml
			SessionFactory sessionFactory = null;
            final String conPrefix = "jdbc:derby:";            
            final String propKey = "hibernate.connection.url";
            String conSuffix = "";
            RdbProps rdbProps = null;
            
			for (SessionFactoryType sessionFactoryType : SessionFactoryType
					.values()) {

				String configurationFileName = null;



				if (sessionFactoryType.equals(SessionFactoryType.PafDB)) {

					configurationFileName = PafBaseConstants.HIBERNATE_PAF_DB_CONFIG_FL;
					databaseName = PafBaseConstants.PAF_CACHE_DB;
                    conSuffix = "";
                    rdbProps = (RdbProps) PafMetaData.getAppContext().getBean("pafDB");
                    
				} else if (sessionFactoryType.equals(SessionFactoryType.PafSecurityDB)) {

					configurationFileName = PafBaseConstants.HIBERNATE_PAF_SECURITY_DB_CONFIG_FL;
					databaseName = PafBaseConstants.PAF_SECURITY_DB;
                    conSuffix = ";bootPassword=xIdk82723Sdfke83";
                    rdbProps = (RdbProps) PafMetaData.getAppContext().getBean("pafSecurity");
                    
				} else if (sessionFactoryType.equals(SessionFactoryType.PafExtAttrDB)) {

					configurationFileName = PafBaseConstants.HIBERNATE_PAF_EXT_ATTR_DB_CONFIG_FL;
					databaseName = PafBaseConstants.PAF_EXT_ATTR_DB;
                    conSuffix = "";
                    rdbProps = (RdbProps) PafMetaData.getAppContext().getBean("pafExtAttr");
                    
				} else if ( sessionFactoryType.equals(SessionFactoryType.PafClientCacheDB)) {

					configurationFileName = PafBaseConstants.HIBERNATE_PAF_CLIENT_CACHE_DB_CONFIG_FL;
					databaseName = PafBaseConstants.PAF_CLIENT_CACHE_DB;
                    conSuffix = "";
                    rdbProps = (RdbProps) PafMetaData.getAppContext().getBean("pafClientCache");
					
				}
				
				if (configurationFileName != null && databaseName != null) {

					Configuration conf = new Configuration();
					conf.setProperties(rdbProps.getHibernateProperties());
					for (String r: rdbProps.getMappingResources() )
						conf.addResource(r);

                    
                    if (conf.getProperty(propKey) == null || conf.getProperty(propKey).trim().equals("")) {
                        String propVal = conPrefix + PafMetaData.getServerSettings().getPafServerHome() 
                            + databaseName + conSuffix;
                        conf.setProperty(propKey, propVal);
                    }

                        
					sessionFactory = conf.buildSessionFactory();

					sessionFactoryMap.put(sessionFactoryType, sessionFactory);

				}

			}

		} catch (Throwable ex) {
			PafErrHandler.handleException(new PafException(
					"Error initializing hibernate for " + databaseName + ". "
							+ ex.getMessage(), PafErrSeverity.Fatal));
		}
	}

	public static SessionFactory getSessionFactory(SessionFactoryType sessionFactoryType) {
		
		return sessionFactoryMap.get(sessionFactoryType);
	}

	public static void shutdown(SessionFactoryType sessionFactoryType) {

		// Close caches and connection pools
		getSessionFactory(sessionFactoryType).close();
		
	}
	
	@SuppressWarnings({"unchecked","unchecked"})
	public static Session currentSession(SessionFactoryType sessionFactoryType) throws HibernateException {
		
		ThreadLocal localThread = sessionMap.get(sessionFactoryType); 
		
		Session s = null;
		
		if ( localThread != null ) {
			
			s = (Session) localThread.get();
			
		}
		
		// open a new session, if this thread has none yet
		if (localThread == null || s == null) {
			
			final ThreadLocal threadLocal = new ThreadLocal();
			
			s = sessionFactoryMap.get(sessionFactoryType).openSession();
			
			threadLocal.set(s);
			
			sessionMap.put(sessionFactoryType, threadLocal);
		}
		
		return s;
	}
	
	@SuppressWarnings("unchecked")
	public static void closeSession(SessionFactoryType sessionFactoryType) throws HibernateException {
		
		//if thread local exist in map
		if ( sessionMap.containsKey(sessionFactoryType)) {
		
			//get thread local from map
			ThreadLocal threadLocal = sessionMap.get(sessionFactoryType);
			
			//if not null
			if ( threadLocal != null ) {
			
				//get session from thread local
				Session s = (Session) threadLocal.get();
				
				//if session is not null, close it
				if (s != null) {
					s.close();
				}
				
				//set thread local's obj to null
				threadLocal.set(null);
				
				//push back into map
				sessionMap.put(sessionFactoryType, threadLocal);
			}
		}
		
	}
	
	
}