/**
 * 
 */
package exercise20170102;

import java.io.IOException;

/**
 * @author Dan Aronson
 *
 */
public class Calculator {
 
    public static int divide(int x, int y) {
	int i;
	try {
	    i = x/y;
	} catch (Exception e) {
	    throw new ArithmeticException();
	}
	return i;
    }
    
    public int getInput() throws IOException {
	byte[] b = new byte[10];
	System.in.read(b);
	return Integer.parseInt(new String(b).trim());
	
    }
    
}
