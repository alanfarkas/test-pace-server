/**
 * 
 */
package com.pace.base.utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author JMilliron
 *
 */
public class IOStreamUtil {

	/**
	 * Copies content from InputStream to OutputSTream.
	 * 
	 * @param input input stream
	 * @param output output stream
	 * @return
	 * @throws IOException
	 */
	public static int copy(final InputStream input, final OutputStream output) throws IOException {
        final byte[] buffer = new byte[4096];
        int n = 0;
        n = input.read(buffer);
        int total = 0;
        while (-1 != n) {
            output.write(buffer, 0, n);
            total += n;
            n = input.read(buffer);
        }
        return total;
    }
	
}
