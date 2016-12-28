/**
 * 
 */
package exercise20161228;

/**
 * @author Dan Aronson
 *
 */
public class AcountMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Account a = new Account();
	// System.out.println(a.getBalance());
	// System.out.println(a.getLog());

	for (int i = 0; i < 10; i++) {
	    a.deposit(100);
	    a.withdraw(50);

	    System.out.println(a);
	}
	a.withdraw(5000);
	System.out.println(a);

    }

}
