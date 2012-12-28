/**
 * 
 */
package com.pace.base.utility;


/**
 * @author Alan Farkas
 *
 */
public interface IOdometer {
	
	public void reset();     
	public boolean hasNext(); 
	public boolean hasNext(int i);
    public void increment();
	public Object[] nextValue();
	public Object[] getValue();    
    public boolean atTop();		
    public int getCount();

}
