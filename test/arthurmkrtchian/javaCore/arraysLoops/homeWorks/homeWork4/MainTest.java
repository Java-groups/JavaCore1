package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork4;

import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork4.Car;
import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork4.CarType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void searchCarByYear() {
        Car[] cars = {
                new Car(CarType.MINIVAN, 1922, 114),
                new Car(CarType.SPORT, 2007, 283),
                new Car(CarType.SEDAN, 2022, 364),
                new Car(CarType.SPACE_HYPERSONIC_TRUCK, 1963, Integer.MAX_VALUE)
        };


       // assertTrue(Main.searchCarByYear(2022,cars));
    }
}