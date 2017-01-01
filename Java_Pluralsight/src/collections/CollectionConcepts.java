/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

	System.out.println("************* Printing the collection as default *************");
	System.out.println("");
	System.out.println(products);
	System.out.println("");

	System.out.println("************* Printing using an iterator with an iterator *************");
	/*
	 * // Usually not in use final Iterator<Product> productIterator =
	 * products.iterator(); while (productIterator.hasNext()) { Product
	 * product = (Product) productIterator.next();
	 * System.out.println(product);
	 */

	for (Product product : products) {
	    System.out.println(product);
	}
	System.out.println("");
	
	// with an iterator you can remove under a condition a member of the collection
	final Iterator<Product> productIterator = products.iterator();
	while (productIterator.hasNext()) {
	    Product product = (Product) productIterator.next();
	    if (product.getWeight() > 20) {
		System.out.println(product);
	    } else {
		productIterator.remove();
	    }

	}
	System.out.println("");
	
	System.out.println("Print the size of the collection");
	System.out.println(products.size());
	System.out.println("");
	
	System.out.println("Print wether the collection is empty or not");
	System.out.println(products.isEmpty());
	System.out.println("");
	
	System.out.println("Print wether the collection has a certain element");
	System.out.println(products.contains(window));
	System.out.println(products.contains(door));
	
	Collection<Product> otherProducts= new ArrayList<>();
	otherProducts.add(floorPanel);
	otherProducts.add(door);
	System.out.println("Print collection before removale");
	System.out.println(otherProducts);
	System.out.println("");
	otherProducts.removeAll(otherProducts);
	System.out.println("Print collection after removale");
	System.out.println(products.isEmpty());
	System.out.println("");
	
    }

}
