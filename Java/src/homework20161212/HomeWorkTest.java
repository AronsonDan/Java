package homework20161212;

import static org.junit.Assert.*;
import org.junit.Test;

public class HomeWorkTest {

	@Test

	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}

	@Test

	public void testPowerAnInteger() {
		int numberinpower = homework20161212.HomeWork.powerAnInteger(2, 10);
		assertEquals(1024, numberinpower);
	}

	@Test

	public void testPrintToConsole() {
		String str = homework20161212.HomeWork.printToConsole(1, 10, 1024);
		assertEquals("Pair of numbers of exercise 1 are: 10 and 1024", str);
	}

	
}
