package Test.HW4.task1_2_3;



import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import HW4.task1_2_3.Main;

class TestMainCar {

	@Test
	void testDaysInMonth() throws NumberFormatException, IOException {
	    assertEquals(31, Main.getDaysInMonth(3));
	}
    
	@Test
	void testSum() throws NumberFormatException, IOException {
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		assertEquals(15, Main.getSum(numbers));
	}
	
	@Test
	void testSecondPositiveNumberId() throws NumberFormatException, IOException {
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		assertEquals(2, Main.getSecondPositiveNumberId(numbers));
	}
	
	@Test
	void testMinNumberPositionInArray() throws NumberFormatException, IOException {
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		assertEquals(0, Main.getMinNumberPositionInArray(numbers));
	}
	
	@Test
	void testSumOfOddNumbers() throws NumberFormatException, IOException {
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		assertEquals(9, Main.getSumOfOddNumbers(numbers));
	}
}
