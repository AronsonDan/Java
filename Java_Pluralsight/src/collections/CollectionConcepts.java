/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Dan Aronson
 *
 */
public class CollectionConcepts {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Product door = new Product("wooden door", 35);
	    Product floorPanel = new Product("Floor Panel", 25);
	    Product window = new Product("Glass Window", 10);
	    
	    Collection<Product> products = new ArrayList<>();
	    products.add(door);
	    products.add(floorPanel);
	    products.add(window);

    }
    
    
}
