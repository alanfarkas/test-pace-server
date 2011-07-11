package com.pace.base.mdb;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.pace.base.data.Intersection;


public class BlockDCFactory implements ObjectTestFactory {

	private static final Logger logger = Logger.getLogger(BlockDCFactory.class);

	public static final int NUM_INTERSECTIONS = 1;
	public static final int INTERSECTION_SIZE = 7;
	public static final int MEMBER_LENGTH = 12;
	public static final int MEMBER_POOL_SIZE = 10000;
	public static final String[] DIMENSION_LIST = 
				new String[]{"MEASURES","TIME","PRODUCT","DEPARTMENT","YEAR", "PLANTYPE","SCENARIO","CURRENCY", "VIEW", "MARKET","BUSINESS.UNIT"};
	public int numIS;
	public int intersectSize;
	public int memberLength;
	public int memberPoolSize;
	
	public BlockDCFactory () {
		this(NUM_INTERSECTIONS, INTERSECTION_SIZE, MEMBER_LENGTH, MEMBER_POOL_SIZE);
	}
	

	/**
	 * @param numIS
	 * @param intersectSize
	 * @param memberLength
	 */
	public BlockDCFactory (int numIS, int intersectSize, int memberLength, int memberPoolSize) {
		this.numIS = numIS;
		this.intersectSize = intersectSize;
		this.memberLength = memberLength;
		this.memberPoolSize = memberPoolSize;
	}
	
	@Override
	public Object makeObject() {
		
		String msg = null;
		String[] dimensions = Arrays.copyOf(DIMENSION_LIST, intersectSize);
		BlockDC blockDC = new BlockDC(this.numIS);
		long begTime, elapsedTime;
		
		begTime = System.currentTimeMillis();
		RandomIntersection ri = new RandomIntersection(memberPoolSize, dimensions, memberLength);
		for (int i = 1; i <= this.numIS; i++) {
			Intersection blockIs = ri.getIntersection();
			blockDC.addIntersection(blockIs);
		}
		
		elapsedTime = System.currentTimeMillis() - begTime;
		msg = "Block Data Cache created in " + elapsedTime + "ms with " + numIS + " blocks, "
			+ "an intersection size of: " + intersectSize + ", and a member length of: "
			+ memberLength;
		logger.info(msg);
		
		// TODO Auto-generated method stub
		return blockDC;
	}

}
