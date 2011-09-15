/**
 * Data Block Response Object
 */
package com.pace.base.mdb;

/**
 * @author Alan Farkas
 *
 */
public class DoubleDataBlockResp {
	
	private Integer surrogateKey = null;
	private Double[][] dataBlock = null;

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
	public Double[][] getDataBlock() {
		return dataBlock;
	}
	/**
	 * @param dataBlock2 the dataBlock to set
	 */
	public void setDataBlock(Double[][] dataBlock) {
		this.dataBlock = dataBlock;
	}

}
