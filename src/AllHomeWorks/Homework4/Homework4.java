package AllHomeWorks.Homework4;

import AllHomeWorks.Homework4.Task1.Task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Homework4 {
    public static void doSelectTask(BufferedReader br) throws IOException {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task or 0 for exit:");
            System.out.println("1. Days in Month.");
//            System.out.println("2. Sum of 5 element");
 //           System.out.println("3. Work with elements of array");
//            System.out.println("4. About Car");


            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Task1.doTask(br);
  //              case 2 -> Task2.doTask(br);
  //              case 3 -> Task3.doTask(br);
 //               case 4 -> Task4.doTask(br);

                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}
