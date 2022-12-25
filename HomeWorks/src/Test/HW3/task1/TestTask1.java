package Test.HW3.task1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import HW3.task1.Task1;

class TestTask1 {

	@Test
	void testSetFloat() {
		Task1 t = new Task1();
		List<Double> expected = new ArrayList<>();
		    expected.add(3.2);
		    expected.add(2.3);
		    expected.add(7.5);

		assertEquals(expected, t.setFloat(3.2, 2.3, 7.5));
	}
	
	@Test 
	void testSetInteger() {
		Task1 t = new Task1();
		List<Integer> expected = new ArrayList<>();
		    expected.add(6);
		    expected.add(8);
		    expected.add(1);

		assertEquals(expected, t.setInteger(6, 8, 1));
	}
	
	@Test
	void testGetMin() {
		Task1 t = new Task1();
		List<Integer> actual = new ArrayList<>();
	        actual.add(6);
	        actual.add(8);
	        
	    assertEquals(6, t.getMin(actual));
	}
	
	@Test
	void testGetMax() {
		Task1 t = new Task1();
		List<Integer> actual = new ArrayList<>();
	        actual.add(3);
	        actual.add(7);
	        
	    assertEquals(7, t.getMax(actual));
	}
	
	@Test
	void testCheck() {
		Task1 t = new Task1();
		List<Boolean> expected = new ArrayList<>();
		    expected.add(true);
		    expected.add(true);
		    expected.add(false);
		    
		assertEquals(expected, t.checkFloat(t.setFloat(3.4, 4.8, 6.1)));
	}
}
