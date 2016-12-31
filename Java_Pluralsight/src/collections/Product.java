/**	
 * 
 */
package collections;

/**
 * @author Dan Aronson
 *
 */
public class Product {

    private String name;
    private double weight;

    /**
     * @param name
     * @param weight
     */
    public Product(String name, double weight) {
	this.setName(name);
	this.setWeight(weight);
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
	return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(double weight) {
	this.weight = weight;
    }

}
