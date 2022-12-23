package Test.HW4.practical_tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import HW4.practical_tasks.Main;

class TestMainEmployee {

	@Test
	void testGetMax() {
		int[] numbers = {13, -21, 17, 11, -24, 7, 19, 3, -18, 5};
		assertEquals(19, Main.getMax(numbers));
	}
	
	@Test
	void testGetSum() {
		int[] numbers = {13, -21, 19, 11, -24, 8, 19, 3, -18, 5};
		assertEquals(15, Main.getSum(numbers));
	}
	
	@Test
	void testGetAmount() {
		int[] numbers = {13, -21, 17, 11, -24, 7, 19, -3, -18, 5};
		assertEquals(4, Main.getAmount(numbers));
	}
	
	@Test
	void testGetCompare() {
		int[] numbers = {17, -21, 15, 11, -24, 7, -19, -3, 8, 5};
		assertEquals(true, Main.getCompare(numbers));
	}


}
