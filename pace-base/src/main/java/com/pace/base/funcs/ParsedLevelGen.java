/**
 * 
 */
package com.pace.base.funcs;

import com.pace.base.mdb.PafDimTree.LevelGenType;

/**
 * @author Alan Farkas
 *
 */
public class ParsedLevelGen {

	private LevelGenType levelGenType = null; 
	private int levelGen = 0;

	public ParsedLevelGen(LevelGenType levelGenType, int levelGen) {
		this.levelGenType = levelGenType;
		this.levelGen = levelGen;
	}
	
	/**
	 * @return the levelGenType
	 */
	public LevelGenType getLevelGenType() {
		return levelGenType;
	}
	/**
	 * @param levelGenType the levelGenType to set
	 */
	public void setLevelGenType(LevelGenType levelGenType) {
		this.levelGenType = levelGenType;
	}
	/**
	 * @return the levelGen
	 */
	public int getLevelGen() {
		return levelGen;
	}
	/**
	 * @param levelGen the levelGen to set
	 */
	public void setLevelGen(int levelGen) {
		this.levelGen = levelGen;
	}
}
