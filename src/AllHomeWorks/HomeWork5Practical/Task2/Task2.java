package AllHomeWorks.HomeWork5Practical.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Car> carsList = new ArrayList<>(
                Arrays.asList(
                        new Truck("Audi", 210, 2015),
                        new Sedan("Lada", 120, 1988),
                        new Sedan("Nissan", 110, 1960),
                        new Truck("Citroen", 180, 2019)
                )
        );

        for (Car car: carsList){
            car.run();
            car.stop();

        }
    }
}

