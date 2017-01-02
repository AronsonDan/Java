/**
 * 
 */
package exercise20170102;

/**
 * @author Dan Aronson
 *
 */
public class CalculatorDemo {
    public static void main(String[] args) {
	
	int results = 0;
	
	try {
	   results = Calculator.divide(10, 0);
	} catch (ArithmeticException e) {
	    System.out.println("Division by zero Error!!!");
	    e.printStackTrace();
	}
	
	 
    }
}
