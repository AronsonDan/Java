/**
 * 
 */
package javathecoreplatform;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author Dan Aronson
 *
 */
public class ReadingAndWritingWithStreams {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	InputStream input = new InputStream() {
	    
	    @Override
	    public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	    }
	};
	int intVal;
	while ((intVal = input.read()) > 0) {
	    byte byteVal = (byte) intVal;
	    System.out.println(intVal);
	    System.out.println(byteVal);
	}
	
	Reader read = new Reader() {
	    
	    @Override
	    public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	    }
	    
	    @Override
	    public void close() throws IOException {
		// TODO Auto-generated method stub
		
	    }
	};
	int intVal1;
	while ((intVal1 = read.read()) > 0) {
	    char charVal = (char) intVal1;
	    System.out.println(intVal1);
	    System.out.println(charVal);
	}
    }

}
