/**
 * 
 */
package homework20170104;

/**
 * @author Dan Aronson
 *
 */
public class BadLineException extends Exception {

    private String line;
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public BadLineException(String message, String line) {
	super(message);
	this.setLine(line);
    }
    
    /**
     * @return the line
     */
    public String getLine() {
	return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(String line) {
	this.line = line;
    }
    
    

}
