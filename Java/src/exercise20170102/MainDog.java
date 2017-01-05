/**
 * 
 */
package exercise20170102;

/**
 * @author Dan Aronson
 *
 */
public class MainDog {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Dog d1 = new Dog();
	
	try {
	    d1.run(101);
	} catch (DogException e) {
	    e.printStackTrace();
	}
	
	try {
	    d1.run(-1);
	} catch (DogException e) {
	    e.printStackTrace();
	}

	try {
	    d1.run(10);
	} catch (DogException e) {
	    e.printStackTrace();
	}
    }

}
