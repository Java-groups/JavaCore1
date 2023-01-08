package PracticalTask11_Exception.Plant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainPlant {
    public static void main(String[] args) {
        int longArray = 2;
        int count;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Plant[] plants = new Plant[longArray];

        for (int i = 0; i < plants.length; i++) {
            plants[i] = new Plant();
            count = 0;
            while (count == 0) {
                System.out.print("Input size [plant № " + (i + 1) + "]: ");
                try {
                    plants[i].setSize(Integer.parseInt(bufferedReader.readLine()));
                    count++;
                } catch (IllegalArgumentException | IOException e) {
                    System.out.println("Помилка розміру: " + e.getMessage());
                }
            }

            count = 0;
            while (count == 0) {
                System.out.print("Input color {RED, BLUE, ORANGE, WHITE, YELLOW, PINK} [i = " + (i + 1) + "]:  ");
                try {
                    plants[i].setColor(bufferedReader.readLine().toUpperCase());
                    count++;
                } catch (ColorException | IOException e) {
                    System.out.println("Помилка кольору : " + e.getMessage());
                }
            }

            count = 0;
            while (count == 0) {
                System.out.print("Input type {TYPE1, TYPE2, TYPE3} [i = " + (i + 1) + "]:  ");
                try {
                    plants[i].setType(bufferedReader.readLine().toUpperCase());
                    count++;
                } catch (TypeException | IOException e) {
                    System.out.println("Помилка типу: " + e.getMessage());
                }
            }
        }
        System.out.println(Arrays.toString(plants));
    }
}
