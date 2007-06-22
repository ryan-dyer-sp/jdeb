package org.vafer.jdeb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Utils {

	public static int copy( final InputStream pInput, final OutputStream pOutput ) throws IOException {
        final byte[] buffer = new byte[2048];
        int count = 0;
        int n = 0;
        while (-1 != (n = pInput.read(buffer))) {
                pOutput.write(buffer, 0, n);
                count += n;
        }
        return count;
     }

	public static String toHex( final byte[] pBytes ) {
    	final StringBuffer sb = new StringBuffer();

    	for (int i = 0; i < pBytes.length; ++i) {
    		sb.append(Integer.toHexString((pBytes[i]>>4) & 0x0f));
    		sb.append(Integer.toHexString(pBytes[i] & 0x0f));
    	}

    	return sb.toString();
    }

	public static String stripPath( final int p, final String s ) {

		if (p <= 0) {
			return s;
		}

		int x = 0;
		for (int i=0 ; i<p; i++) {
			x = s.indexOf('/', x);
			if (x < 0) {
				return s;
			}
		}

		return s.substring(x+1);
	}

	public static String stripLeadingSlash( final String s ) {
		if (s == null) {
			return s;
		}
		if (s.length() == 0) {
			return s;
		}
		if (s.charAt(0) == '/') {
			return s.substring(1);
		}
		return s;
	}

}