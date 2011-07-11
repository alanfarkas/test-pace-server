/**
 * 
 */
package com.pace.base.mdb;

/**
 * @author Alan
 *
 */
public class BooleanArrayFactory implements ObjectTestFactory {
	public Object makeObject() {
		Boolean[] objs = new Boolean[1000];
		for (int i=0; i<objs.length; i++)
			objs[i] = new Boolean(true);
		return objs;
	}
}