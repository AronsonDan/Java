/**
 * 
 */
package homework20161228;

/**
 * @author Dan Aronson
 *
 */
public class Rabbit extends Animal {

    /**
     * @param name
     * @param age
     */
    public Rabbit(String name, int age) {
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
	return "Snuffle snuffle";
    }

    /*
     * (non-Javadoc)
     * 
     * @see homework20161228.Animal#move()
     */
    @Override
    public String move() {
	// TODO Auto-generated method stub
	return "Hop hop hop";
    }

    @Override
    public String toString() {
	return "Rabbit: " + super.toString();
    }
}
