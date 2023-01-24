package AllHomeWorks.HomeWork14;

import AllHomeWorks.HomeWork14.Task1.Task1;

import java.io.BufferedReader;

public class HomeWork14 {
        public static void doSelectTask(BufferedReader br) throws Exception {
            int x = -1;
            do {
                System.out.println();
                System.out.println("Please, put the number of task:");
                System.out.println("1. 3 pigs in a thread");
                System.out.println("2. 2 sheep on a bridge");
                System.out.println("3. Pinball");

                try {
                    x = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {

                }

                switch (x) {
                    case 1 -> Task1.doTask(br);
                    case 2 -> Task2.doTask(br);
                    case 3 -> Task3.doTask(br);

                    case 0 -> {
                    }
                    default -> System.out.println("Wrong task number selected.");
                }
            }
            while (x != 0);

        }
    }
