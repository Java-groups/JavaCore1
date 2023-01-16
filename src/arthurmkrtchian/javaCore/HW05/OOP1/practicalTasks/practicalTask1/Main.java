package arthurmkrtchian.javaCore.HW05.OOP1.practicalTasks.practicalTask1;


//        1. Create abstract class Car with model, maxSpeed and yearOfManufacture
//        properties and run() and stop() methods.
//        2. Develop classes Truck and Sedan which extend class Car.
//        3. In main method create array of Car’s objects. Add to this array some
//        trucks and sedans and print info about it.


public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan(Model.AUDI, 280, 2017),
                new Truck(Model.DAF, 110, 2020, 24000),
                new Sedan(Model.OPEL, 210, 2021),
                new Truck(Model.VOLVO, 130, 2018, 24000),
                new Sedan(Model.AUDI, 320, 2022)
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

    }
}
