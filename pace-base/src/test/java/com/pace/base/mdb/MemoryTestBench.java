/**
 * 
 */
package com.pace.base.mdb;

/**
 * @author Alan
 *
 */
public abstract class MemoryTestBench {
	final static int MEGABYTE = 1048576;
	  public static long calculateMemoryUsage(ObjectTestFactory factory) {
	    Object handle = factory.makeObject();
	    long mem0 = Runtime.getRuntime().totalMemory() -
	      Runtime.getRuntime().freeMemory();
	    long mem1 = Runtime.getRuntime().totalMemory() -
	      Runtime.getRuntime().freeMemory();
	    handle = null;
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    mem0 = Runtime.getRuntime().totalMemory() -
	      Runtime.getRuntime().freeMemory();
	    handle = factory.makeObject();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    System.gc(); System.gc(); System.gc(); System.gc();
	    mem1 = Runtime.getRuntime().totalMemory() -
	      Runtime.getRuntime().freeMemory();
	    return mem1 - mem0;
	  }
	  public static void showMemoryUsage(ObjectTestFactory factory) {
	    long mem = calculateMemoryUsage(factory);
	    System.out.println(
	      factory.getClass().getName() + " produced " +
	      factory.makeObject().getClass().getName() +
	      " which took " + mem + " bytes OR " + String.format("%.2f", (float)mem/(MEGABYTE)) + " MB" );
	  }
	}
