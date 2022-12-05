package AllHomeWorks.HomeWork3Practical.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void doTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 3; i++) {
            Number number = new Number();
            number.input();
            System.out.println("Number:" + number.getNumber());

            if (number.numberOdd()) {
                count++;
            }
        }
        System.out.println("Number of odd numbers =" +count);

    }
}
