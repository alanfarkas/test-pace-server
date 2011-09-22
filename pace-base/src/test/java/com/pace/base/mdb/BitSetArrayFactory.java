package com.pace.base.mdb;

import java.util.BitSet;

import org.apache.log4j.Logger;

public class BitSetArrayFactory implements ObjectTestFactory {
	
	private int bitCount = 1;
	private int periodCount = 37;
	private int measureCount = 50;
	private int blockSize = periodCount * measureCount;
	private Logger logger = Logger.getLogger(BitSetArrayFactory.class);
	
//	public enum PropertyType {
//		Dirty(1),
//		Exists(1);
//		
//		private final int length;
//		
//		PropertyType(int length) {
//			this.length = length;
//		}
//		
//		public int length() {
//			return this.length;
//		}
//	}
	public BitSetArrayFactory(int bitCount) {
		this.bitCount = bitCount;
	}

	@Override
	public Object makeObject() {
		long begTime = System.currentTimeMillis(),elapsedTime; 
		BitSet[][] objs = new BitSet[measureCount][periodCount];
		for (int i=0; i<measureCount; i++) {
			for (int j=0; j<periodCount; j++) {
				BitSet bitSet = new BitSet(bitCount);
				bitSet.set(0, bitSet.size());
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
