package com.pace.base;

import java.io.IOException;

public interface IPafCompressedObj {

	public void compressData() throws IOException;
	public void uncompressData();
    public boolean isCompressed();
    public void setCompressed(boolean isCompressed);
    
}
