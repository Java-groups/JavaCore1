package AllHomeWorks;
import AllHomeWorks.HomeWork1.HomeWork1;
import AllHomeWorks.HomeWork2.HomeWork2;
import AllHomeWorks.HomeWork2Practical.HomeWork2Practical;

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

                try {
                    x = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {

                }

                switch (x) {
                    case 1 -> HomeWork1.doSelectTask();
                    case 2 -> HomeWork2.doTask();
                    case 3 -> HomeWork2Practical.doTask();
                    case 0 -> {
                    }
                    default -> System.out.println("Wrong task number selected.");
                }
            }
            while (x != 0);

        }
    }
