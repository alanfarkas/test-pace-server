/**
 * Data Block Response Object
 */
package com.pace.base.mdb;

/**
 * @author Alan Farkas
 *
 */
public class DataBlockResponse {
	
	private Integer surrogateKey = null;
	private DataBlock dataBlock = null;

	/**
	 * @return the surrogateKey
	 */
	public Integer getSurrogateKey() {
		return surrogateKey;
	}
	/**
	 * @param surrogateKey the surrogateKey to set
	 */
	public void setSurrogateKey(Integer surrogateKey) {
		this.surrogateKey = surrogateKey;
	}
	
	/**
	 * @return the dataBlock
	 */
	public DataBlock getDataBlock() {
		return dataBlock;
	}
	/**
	 * @param dataBlock the dataBlock to set
	 */
	public void setDataBlock(DataBlock dataBlock) {
		this.dataBlock = dataBlock;
	}

}
