package Test.HW4.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import HW4.task4.Car;
import HW4.task4.CarComparator;

class TestCarComparator {

	@Test
	void testCompare() {
		List<Car> cars = new ArrayList<>();
            cars.add (new Car("Subaru Forester", 2015, 2.5));
	        cars.add (new Car("Volkswagen Golf", 2010, 1.6));

        List<Car> expected = new ArrayList<>(); 
            expected.add (new Car("Volkswagen Golf", 2010, 1.6));
            expected.add (new Car("Subaru Forester", 2015, 2.5));
            
        Collections.sort(cars, new CarComparator());
        
	    assertEquals(expected, cars);
	}

}
