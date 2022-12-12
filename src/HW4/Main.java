package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] carYears = new int[4];
        System.out.println("enter 4 years of car");
        for (int i = 0; i < carYears.length; i++){
            carYears[i] = Integer.parseInt(br.readLine());
        }



        Car car1 = new Car(carYears[0], 3.5, "Pickup" );
        System.out.println(car1);
        Car car2 = new Car(carYears[1], 2.5, "Sedan" );
        System.out.println(car2);
        Car car3 = new Car(carYears[2], 3.0, "Coupe" );
        System.out.println(car3);
        Car car4 = new Car(carYears[3], 2.0, "Minivan" );
        System.out.println(car4);

        Arrays.sort(carYears);

        Car[] cars = new Car[4];



    }
}
