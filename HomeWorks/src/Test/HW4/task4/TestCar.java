package Test.HW4.task4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import HW4.task4.Car;


class TestCar {
	
	@Test
	void testByYearOfProduction() {
		List<Car> cars = new ArrayList<>();
	        cars.add(new Car("Volkswagen Golf", 2010, 1.6));
	        cars.add(new Car("Subaru Forester", 2015, 2.5));
	        cars.add(new Car("Mitsubishi Outlander", 2018, 2.4));
	        cars.add(new Car("Toyota Prius", 2015, 1.5));
	        cars.add(new Car("Skoda Octavia", 2018, 2.0));
	        
		List<Car> actual = Car.getByYearOfProduction(cars, 2010);
		List<Car> expected = new ArrayList<>();
		    expected.add(new Car("Volkswagen Golf", 2010, 1.6));
		    for (int i = 0; i < expected.size(); i++) {
		    	assertEquals(expected.get(i), actual.get(i));
		    }
	}
	
	@Test
	void testSort() {
	    List<Car> cars = new ArrayList<>();
            cars.add(new Car("Volkswagen Golf", 2010, 1.6));
            cars.add(new Car("Subaru Forester", 2015, 2.5));
            cars.add(new Car("Mitsubishi Outlander", 2018, 2.4));
            cars.add(new Car("Toyota Prius", 2015, 1.5));
            cars.add(new Car("Skoda Octavia", 2018, 2.0));
	
    		List<Car> actual = Car.getSort(cars);
    		
    		List<Car> expected = new ArrayList<>();
    		    expected.add(new Car("Volkswagen Golf", 2010, 1.6));
    		    expected.add(new Car("Subaru Forester", 2015, 2.5));
    		    expected.add(new Car("Toyota Prius", 2015, 1.5));
    		    expected.add(new Car("Mitsubishi Outlander", 2018, 2.4));
    		    expected.add(new Car("Skoda Octavia", 2018, 2.0));

    		    for (int i = 0; i < expected.size(); i++) {
    		    	assertEquals(expected.get(i), actual.get(i));
    		    }

	}

}
