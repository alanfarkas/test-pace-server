package com.pace.base.mdb;

public class SizeTesting {

	public static void main(String[] args) {

		final int memberPoolSize = 300;
		final int memberNameLength = 12;
		final int dimCount = 7;
		final int sparseDimCount = dimCount - 2;
//		MemoryTestBench.showMemoryUsage(new BasicObjectFactory());
//		MemoryTestBench.showMemoryUsage(new BooleanArrayFactory());
		MemoryTestBench.showMemoryUsage(new EmptyBlockDC());
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory());
		MemoryTestBench.showMemoryUsage(new BlockDCFactory(1000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(10000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(10811,sparseDimCount,memberNameLength,memberPoolSize));
		MemoryTestBench.showMemoryUsage(new BlockDCFactory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDC2Factory(20000,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(30000,sparseDimCount,memberNameLength, memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(40000,sparseDimCount,memberNameLength, memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDCFactory(21622,sparseDimCount,memberNameLength,memberPoolSize));
		MemoryTestBench.showMemoryUsage(new BlockDCFactory(43244,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new BlockDC2Factory(43244,sparseDimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(10000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(20000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(50000,dimCount,memberNameLength,memberPoolSize));
		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(80000,dimCount,memberNameLength,memberPoolSize));
		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(8000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(20000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(35000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(40000000,dimCount,memberNameLength,memberPoolSize));
//		MemoryTestBench.showMemoryUsage(new IntersectionDCFactory(8100000,dimCount,memberNameLength,memberPoolSize));
	}

}
