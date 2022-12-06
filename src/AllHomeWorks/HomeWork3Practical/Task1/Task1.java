package AllHomeWorks.HomeWork3Practical.Task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            Number number = new Number();
            number.input(br);
            System.out.println("Number:" + number.getNumber());

            if (number.numberOdd()) {
                count++;
            }
        }
        System.out.println("Number of odd numbers =" +count);

    }
}
