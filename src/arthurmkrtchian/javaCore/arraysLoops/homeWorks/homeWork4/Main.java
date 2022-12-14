package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork4;


//        Create class Car with fields type, year of production and engine capacity.
//        Create and initialize four instances of class Car.
//        Display cars
//          certain model year (enter year in the console);
//          ordered by the field year.


import helper.Reader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static Reader reader = new Reader();

    static boolean searchCarByYear(int year, Car[] cars){
        boolean isFound = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getProductionYear() == year){
                System.out.println(cars[i].toString());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No results");
        }
        return isFound;
    }

    static void displayAll(Car[] cars){
        System.out.println("------------------------------------------------------------------------------------------------------");
        Arrays.sort(cars);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    public static void main(String[] args) throws IOException {
        Car[] cars = {
                new Car(CarType.MINIVAN, 1987, 114),
                new Car(CarType.SPORT, 2001, 283),
                new Car(CarType.SEDAN, 1100, 1),
                new Car(CarType.SPACE_HYPERSONIC_TRUCK, 1963, Integer.MAX_VALUE)
        };

        System.out.print("Enter car year of production to search: ");
        searchCarByYear(reader.readInteger("It`s not an integer, please try again."), cars);
        // В пєкеджі helper в мене є спеціальний метод для считування числа із заданого інтервалу
        // можна було б скористатися ним, але в класі Car є своя більш цікава перевірка

        displayAll(cars);

    }
}
