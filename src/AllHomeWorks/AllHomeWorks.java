package AllHomeWorks;
import AllHomeWorks.HomeWork1.HomeWork1;
import AllHomeWorks.HomeWork2.HomeWork2;
import AllHomeWorks.HomeWork2Practical.HomeWork2Practical;
import AllHomeWorks.HomeWork3.HomeWork3;
import AllHomeWorks.HomeWork3Practical.HomeWork3Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllHomeWorks {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = -1;
            do {
                System.out.println();
                System.out.println("Please, put the number of HomeWork:");
                System.out.println("1. HomeWork #1");
                System.out.println("2. HomeWork #2");
                System.out.println("3. HomeWork #2. Practical");
                System.out.println("4. HomeWork #3. Practical");
                System.out.println("5. HomeWork #3");

                try {
                    x = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {

                }

                switch (x) {
                    case 1 -> HomeWork1.doSelectTask(br);
                    case 2 -> HomeWork2.doTask(br);
                    case 3 -> HomeWork2Practical.doTask(br);
                    case 4 -> HomeWork3Practical.doSelectTask(br);
                    case 5 -> HomeWork3.doSelectTask(br);

                    case 0 -> {
                    }
                    default -> System.out.println("Wrong task number selected.");
                }
            }
            while (x != 0);

        }
    }
