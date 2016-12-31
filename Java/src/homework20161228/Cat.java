/**
 * 
 */
package homework20161228;

/**
 * @author Dan Aronson
 *
 */
public class Cat extends Animal {

    /**
     * @param name
     * @param age
     */
    public Cat(String name, int age) {
	super(name, age);
	// TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see homework20161228.Animal#sayHello()
     */
    @Override
    public String sayHello() {
	// TODO Auto-generated method stub
	return "Oh. it's you. hello " + this.getName();
    }

    /* (non-Javadoc)
     * @see homework20161228.Animal#move()
     */
    @Override
    public String move() {
	// TODO Auto-generated method stub
	return "If you insist...";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Cat: " + super.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */

}
