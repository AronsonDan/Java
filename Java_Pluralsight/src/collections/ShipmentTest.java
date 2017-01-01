/**
 * 
 */
package collections;

import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Dan Aronson
 *
 */
public class ShipmentTest {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
	shipment.add(ProductFixtures.door);
	shipment.add(ProductFixtures.window);

	assertThat(shipment, contains(ProductFixtures.door, ProductFixtures.window));
    }

    @Test
    public void shouldReplaceItems() throws Exception {
	shipment.add(ProductFixtures.door);
	shipment.add(ProductFixtures.window);

	shipment.replace(ProductFixtures.door, ProductFixtures.floorPanel);
    }
}
