/**
 * 
 */
package exercise20170102;

/**
 * @author Dan Aronson
 *
 */
public class Dog {

    public void run(int distance) throws DogException {
	if (distance > 100) {
	    throw new DogException("To Far");
	} else if (distance < 1) {
	    throw new DogException("Illegal distance");
	} else {
	    System.out.println("Dog ran:" + distance + " KM's");
	}
    }
}
