package com.pace.base.mdb;

import java.util.Properties;

/**
 * 
 * @author JMilliron
 *
 */
public class PafConnectionProps implements IPafConnectionProps, Cloneable {
	
	private String name;
    private String connectionString;
    private transient Properties properties;
    private String metaDataServiceProvider;
    private String dataServiceProvider;
    private String mdbClassLoader;

    public PafConnectionProps() {
    }
        
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * 
	 */
	public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        this.properties = parseConnString(connectionString); 
    }
	
	

    /**
	 * @return the connectionString
	 */
	public String getConnectionString() {
		return connectionString;
	}



	public Properties getProperties() {
        return properties;
    }
    
    /**
     * For testing purposes only
     * 
     * @param properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties; 
    }

    public static Properties parseConnString(String str) {
    	
        Properties p = new Properties();
        
        if ( str != null ) {
	        String[] terms = str.split(";");
	        String[] kvPair;
	        for (String term : terms) {
	            kvPair = term.split("=");
	            if (kvPair.length != 2) { 
	            	throw new IllegalArgumentException ("Invalid Connection String Term: " + term + " in: " + str);            
	            }
	            p.put(kvPair[0].toUpperCase(), kvPair[1]);
	        }
        }
        return p;
    }

    /**
     * @return Returns the dataServiceProvider.
     */
    public String getDataServiceProvider() {
        return dataServiceProvider;
    }

    /**
     * @param dataServiceProvider The dataServiceProvider to set.
     */
    public void setDataServiceProvider(String dataServiceProvider) {
        this.dataServiceProvider = dataServiceProvider;
    }

    /**
     * @return Returns the metaDataServiceProvider.
     */
    public String getMetaDataServiceProvider() {
        return metaDataServiceProvider;
    }

    /**
     * @param metaDataServiceProvider The metaDataServiceProvider to set.
     */
    public void setMetaDataServiceProvider(String metaDataServiceProvider) {
        this.metaDataServiceProvider = metaDataServiceProvider;
    }

    /**
	 * @return the mdbClassLoader
	 */
	public String getMdbClassLoader() {
		return mdbClassLoader;
	}

	/**
	 * @param mdbClassLoader the mdbClassLoader to set
	 */
	public void setMdbClassLoader(String mdbClassLoader) {
		this.mdbClassLoader = mdbClassLoader;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PafConnectionProps [name=" + name + ", connectionString="
				+ connectionString + ", metaDataServiceProvider="
				+ metaDataServiceProvider + ", dataServiceProvider="
				+ dataServiceProvider + ", mdbClassLoader=" + mdbClassLoader
				+ ", properties=" + properties + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PafConnectionProps clone() throws CloneNotSupportedException {

		return (PafConnectionProps) super.clone();
	}
	
	

}
