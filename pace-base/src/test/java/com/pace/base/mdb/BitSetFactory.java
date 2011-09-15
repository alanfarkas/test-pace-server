package com.pace.base.mdb;

import java.util.BitSet;

public class BitSetFactory implements ObjectTestFactory {
	
	private int size;
	
	public BitSetFactory(int size) {
		this.size = size;
	}

	@Override
	public Object makeObject() {
		// TODO Auto-generated method stub
		return new BitSet(size);
	}

}
