package AllHomeWorks.HomeWork12;

import java.io.BufferedReader;

public class HomeWork12 {
    public static void doSelectTask(BufferedReader br) throws Exception {
        int x = -1;
        do {
            System.out.println();
            System.out.println("Please, put the number of task:");
            System.out.println("1. About encrypt/decrypt");
            System.out.println("2. About validate data to format mm.dd.yy");
//            System.out.println("3. About leap year");
//            System.out.println("4. About Local Date Birthday");

            try {
                x = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {

            }

            switch (x) {
                case 1 -> Task1.doTask(br);
                case 2 -> Task2.doTask(br);
//                case 3 -> Task3.doTask(br);
//                case 4 -> Task4.doTask(br);


                case 0 -> {
                }
                default -> System.out.println("Wrong task number selected.");
            }
        }
        while (x != 0);

    }
}
