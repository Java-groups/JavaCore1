package AllHomeWorks.HomeWork6.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Passengers> passengersList = new ArrayList<>(
                Arrays.asList(
                        new Liner(11, 0),
                        new Boat(28, 6),
                        new Plane(12, 10),
                        new Helicopter(13, 400, 80),
                        new Motorcycle(59, 450),
                        new Car(54, "audi"),
                        new Bus(62,"Kyiv-Rivne-Madagaskar")
                )
        );

        for (Passengers passengers: passengersList) {
            System.out.println(passengers);
        }
    }
}
