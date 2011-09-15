/**
 * 
 */
package com.pace.base.mdb;

/**
 * @author Alan
 *
 */
public class BooleanArrayFactory implements ObjectTestFactory {
	
	private int periodCount = 37;
	private int measureCount = 50;
	
	public BooleanArrayFactory() {
	}

	public Object makeObject() {
		boolean[][] objs = new boolean[measureCount][periodCount];
		for (int i=0; i<measureCount; i++) {
			for (int j=0; j<periodCount; j++) {
				objs[i][j] = true;
			}
		}
		return objs;
	}
}