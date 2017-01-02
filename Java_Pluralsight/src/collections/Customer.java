/**
 * 
 */
package collections;

/**
 * @author Dan Aronson
 *
 */
public class Customer {

    public final String name;

    public static final Customer jack = new Customer("Jack");
    public static final Customer jill = new Customer("Jill");
    public static final Customer mary = new Customer("Mary");

    /**
     * @param name
     */
    public Customer(String name) {
	this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
	return this.name;
    }

    public void reply(final String message) {
	System.out.println("Reply: " + message);
    }
}
