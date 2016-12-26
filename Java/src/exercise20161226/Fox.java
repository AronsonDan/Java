/**
 * 
 */
package exercise20161226;

/**
 * @author Dan Aronson
 *
 */
public class Fox extends Animal {

    /**
     * 
     */
    public Fox() {
	// TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see exercise20161226.Animal#run(int)
     */
    @Override
    public void run(int distance) {
	super.getMethodName();
	super.run(distance * 2);
    }

    /* (non-Javadoc)
     * @see exercise20161226.Animal#walk(int)
     */
    @Override
    public void walk(int i) {
	// TODO Auto-generated method stub
	
    }

    
}
