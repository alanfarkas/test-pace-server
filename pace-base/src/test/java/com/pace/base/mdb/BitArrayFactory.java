package com.pace.base.mdb;

import java.util.BitSet;

import org.apache.log4j.Logger;

import sun.security.util.BitArray;

public class BitArrayFactory implements ObjectTestFactory {

	private int bitCount = 1;
	private int periodCount = 37;
	private int measureCount = 50;
	private int blockSize = periodCount * measureCount;
	private Logger logger = Logger.getLogger(BitSetArrayFactory.class);
	
	public BitArrayFactory(int bitCount) {
		this.bitCount = bitCount;
	}

	@Override
	public Object makeObject() {

		long begTime = System.currentTimeMillis(),elapsedTime; 
		BitArray[][] objs = new BitArray[measureCount][periodCount];
		for (int i=0; i<measureCount; i++) {
			for (int j=0; j<periodCount; j++) {
				BitArray bitSet = new BitArray(bitCount);
				objs[i][j] = bitSet;
			}
		}
		
		elapsedTime = System.currentTimeMillis() - begTime;
		String msg = "BitSize array created in " + elapsedTime + "ms with a blockSize of " + blockSize
			+ " and a bitcount of: " + bitCount;
		logger.info(msg);
		return objs;

	}

}
