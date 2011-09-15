package com.pace.base.mdb;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.pace.base.data.Intersection;


public class DoubleBlockDCFactory implements ObjectTestFactory {

	private static final Logger logger = Logger.getLogger(DoubleBlockDCFactory.class);

	private static final int NUM_INTERSECTIONS = 1;
	private static final int INTERSECTION_SIZE = 7;
	private static final int MEMBER_LENGTH = 12;
	private static final int MEMBER_POOL_SIZE = 10000;
	private static final String[] DIMENSION_LIST = 
				new String[]{"MEASURES","TIME","PRODUCT","DEPARTMENT","YEAR", "PLANTYPE","SCENARIO","CURRENCY", "VIEW", "MARKET","BUSINESS.UNIT"};
	private int numIS;
	private int intersectSize;
	private int memberLength;
	private int memberPoolSize;
	private boolean isBlockFilled;
	
	
	public DoubleBlockDCFactory () {
		this(NUM_INTERSECTIONS, INTERSECTION_SIZE, MEMBER_LENGTH, MEMBER_POOL_SIZE);
	}
	

	/**
	 * @param numIS
	 * @param intersectSize
	 * @param memberLength
	 */
	public DoubleBlockDCFactory (int numIS, int intersectSize, int memberLength, int memberPoolSize) {
		this(numIS, intersectSize, memberLength, memberPoolSize, false);
	}
	
	/**
	 * @param numIS
	 * @param intersectSize
	 * @param memberLength
	 */
	public DoubleBlockDCFactory (int numIS, int intersectSize, int memberLength, int memberPoolSize, boolean isBlockFilled) {
		this.numIS = numIS;
		this.intersectSize = intersectSize;
		this.memberLength = memberLength;
		this.memberPoolSize = memberPoolSize;
		this.isBlockFilled = isBlockFilled;
	}
	
	@Override
	public Object makeObject() {
		
		String msg = null;
		String[] dimensions = Arrays.copyOf(DIMENSION_LIST, intersectSize);
		DoubleBlockDC doubleBlockDC = new DoubleBlockDC(this.numIS);
		long begTime, elapsedTime;
		
		begTime = System.currentTimeMillis();
		RandomIntersection ri = new RandomIntersection(memberPoolSize, dimensions, memberLength);
		for (int i = 1; i <= this.numIS; i++) {
			Intersection blockIs = ri.getIntersection();
			doubleBlockDC.addIntersection(blockIs);
			if (isBlockFilled) {
				doubleBlockDC.initBlock(blockIs);
			}
		}

		elapsedTime = System.currentTimeMillis() - begTime;
		msg = "Double Block DC created in " + elapsedTime + "ms with " + numIS + " blocks, "
			+ "an intersection size of: " + intersectSize + ", and a member length of: "
			+ memberLength;
		if (isBlockFilled) {
			msg = "POPULATED " + msg;
		}
		logger.info(msg);
		

		// TODO Auto-generated method stub
		return doubleBlockDC;
	}

}
