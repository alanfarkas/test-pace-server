package com.pace.base.mdb;


public class SizeTesting {

	public static void main(String[] args) {

		final int memberPoolSize = 300;
		final int memberNameLength = 12;
		final int dimCount = 7;
		final int sparseDimCount = dimCount - 2;
		MemoryTestBench.showMemoryUsage(new BooleanArrayFactory());
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(1));
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(8));
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(9));
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(64));
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(128));
		MemoryTestBench.showMemoryUsage(new BitArrayFactory(129));
		MemoryTestBench.showMemoryUsage(new BitSetArrayFactory(1));
		MemoryTestBench.showMemoryUsage(new BitSetArrayFactory(8));
		MemoryTestBench.showMemoryUsage(new BitSetArrayFactory(64));
		MemoryTestBench.showMemoryUsage(new BitSetArrayFactory(68));
		MemoryTestBench.showMemoryUsage(new BlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new EmptyDataCache());
//		MemoryTestBench.showMemoryUsage(new EmptyDCDouble());
//		MemoryTestBench.showMemoryUsage(new EmptyBlockDC());
//		MemoryTestBench.showMemoryUsage(new EmptyDoubleBlockDC());
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize, true));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(10000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(10000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(10000,sparseDimCount,memberNameLength,memberPoolSize, true));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new DoubleBlockDCFactory(20000,sparseDimCount,memberNameLength,memberPoolSize, true));
//		MemoryTestBench.showMemoryUsage(new BasicObjectFactory());
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory());
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(10000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(10811,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDC2Factory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(30000,sparseDimCount,memberNameLength, memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(40000,sparseDimCount,memberNameLength, memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(21622,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(43244,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDC2Factory(43244,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(10000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(20000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(50000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(80000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(8000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(20000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(35000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(40000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(8100000,dimCount,memberNameLength,memberPoolSize));
	}

}
