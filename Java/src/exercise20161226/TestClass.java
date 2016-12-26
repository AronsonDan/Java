/**
 * 
 */
package exercise20161226;

/**
 * @author Dan Aronson
 *
 */
public class TestClass {

    /**
     * 
     */
    public TestClass() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Animal a = new Fox();
	a.run(10);
	System.out.println(a.getDistance());
	Fox f = new Fox();
	f.run(10);
	System.out.println(f.getDistance());
    }

}
