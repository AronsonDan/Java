/**
 * 
 */
package exercise20161226;

/**
 * @author Dan Aronson
 *
 */
public abstract class Animal {

    private int distance;

    /**
     * @return the distance
     */
    public int getDistance() {
	return distance;
    }

    /**
     * @param distance
     *            the distance to set
     */
    public void setDistance(int distance) {
	this.distance = distance;
    }

    public void run(int distance) {

	System.out.println(getMethodName());
	this.distance += distance;
    }

    public static String getMethodName() {
	String returnString = Thread.currentThread().getStackTrace()[2].getClassName() + "."
		+ Thread.currentThread().getStackTrace()[2].getMethodName();
	return returnString;
    }
    
    public abstract void walk(int i);
}
