/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author Dan Aronson
 *
 */
public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();

    /**
     * 
     */
    public void add(Product product) {
	products.add(product);
    }

    /**
     * 
     */
    public void replace(Product oldProduct, Product newProduct) {
    }

    public List<Product> getHeavyVanProducts() {
	return null;
    }

    public List<Product> getLightVanProducts() {
	return null;
    }

    public Iterator<Product> iterator() {
	return products.iterator();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Iterable#forEach(java.util.function.Consumer)
     */
    @Override
    public void forEach(Consumer action) {
	// TODO Auto-generated method stub
	Iterable.super.forEach(action);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Iterable#spliterator()
     */
    @Override
    public Spliterator spliterator() {
	// TODO Auto-generated method stub
	return Iterable.super.spliterator();
    }

}
