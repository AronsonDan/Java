/**
 * 
 */
package homework20161228;

/**
 * @author Dan Aronson
 *
 */
public class Dog extends Animal {

    /**
     * @param name
     * @param age
     */
    public Dog(String name, int age) {
	super(name, age);
	// TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see homework20161228.Animal#sayHello()
     */
    @Override
    public String sayHello() {
	// TODO Auto-generated method stub
	return "Oh Hello! Your'e back! Hello! I missed you! Hello!";
    }

    /*
     * (non-Javadoc)
     * 
     * @see homework20161228.Animal#move()
     */
    @Override
    public String move() {
	// TODO Auto-generated method stub
	return "Ruuuuuuuuuuuuun!";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Dog: " + super.toString();
    }
    
    
}
