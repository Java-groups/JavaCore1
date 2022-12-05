package AllHomeWorks.HomeWork3Practical;

import AllHomeWorks.HomeWork3Practical.NumberOdd.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3Practical {
public static void doSelectTask() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = -1;
        do {
        System.out.println();
        System.out.println("Please, put the number of task:");
        System.out.println("1. Check numbers on odd.");
//        System.out.println("2. Day of week");
//        System.out.println("3. Continent.");
//        System.out.println("4. About Product");


        try {
        x = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {

        }

        switch (x) {
        case 1 -> Task1.doTask();
//        case 2 -> Task2.doTask();
//        case 3 -> Task3.doTask();
//        case 4 -> Task4.doTask();

        case 0 -> {
        }
default -> System.out.println("Wrong task number selected.");
        }
        }
        while (x != 0);

        }
}
