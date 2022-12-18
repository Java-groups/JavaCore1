package HM5.PracticalTask1;

//Task description
//        Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
//        Develop classes Truck and Sedan which extend class Car.
//        In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car1[] cars = {
                new Sedan("Astra", 190, 1998),
                new Truck("Bordo", 140, 2011),
                new Truck("Vidro", 205, 1980),
                new Sedan("Boom", 168, 1993)
        };

        System.out.println(Arrays.toString(cars));
    }
}
