package AllHomeWorks;
import AllHomeWorks.HomeWork1.HomeWork1;
import AllHomeWorks.HomeWork10.HomeWork10;
import AllHomeWorks.HomeWork10Practical.HomeWork10Practical;
import AllHomeWorks.HomeWork11.HomeWork11;
import AllHomeWorks.HomeWork11Practical.HomeWork11Practical;
import AllHomeWorks.HomeWork2.HomeWork2;
import AllHomeWorks.HomeWork2Practical.HomeWork2Practical;
import AllHomeWorks.HomeWork3.HomeWork3;
import AllHomeWorks.HomeWork3Practical.HomeWork3Practical;
import AllHomeWorks.HomeWork5.HomeWork5;
import AllHomeWorks.HomeWork5Practical.HomeWork5Practical;
import AllHomeWorks.HomeWork6.HomeWork6;
import AllHomeWorks.HomeWork6Practical.Homework6Practical;
import AllHomeWorks.HomeWork7.HomeWork7;
import AllHomeWorks.HomeWork7Practical.HomeWork7Practical;
import AllHomeWorks.HomeWork8.HomeWork8;
import AllHomeWorks.HomeWork8Practical.HomeWork8Practical;
import AllHomeWorks.HomeWork9.HomeWork9;
import AllHomeWorks.HomeWork9Practical.HomeWork9Practical;
import AllHomeWorks.Homework4.Homework4;
import AllHomeWorks.Homework4Practical.Homework4Practical;
import AllHomeWorks.ProjectFruits.ProjectFruits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllHomeWorks {
    public static void main(String[] args) throws Exception {
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
                System.out.println("6. HomeWork #4. Practical");
                System.out.println("7. HomeWork #4.");
                System.out.println("8. HomeWork #5. Practical");
                System.out.println("9. HomeWork #5.");
                System.out.println("10. Homework #6. Practical");
                System.out.println("11. Homework #6.");
                System.out.println("12. Homework #7. Practical");
                System.out.println("13. Homework #7.");
                System.out.println("14. Homework #8. Practical");
                System.out.println("15. Homework #8.");
                System.out.println("16. Homework #9. Practical");
                System.out.println("17. Homework #9.");
                System.out.println("18. Homework #10. Practical");
                System.out.println("19. Homework #10.");
                System.out.println("20. Homework #11. Practical");
                System.out.println("21. Homework #11.");



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
                    case 6 -> Homework4Practical.doSelectTask(br);
                    case 7 -> Homework4.doSelectTask(br);
                    case 8 -> HomeWork5Practical.doSelectTask(br);
                    case 9 -> HomeWork5.doSelectTask(br);
                    case 10 -> Homework6Practical.doSelectTask(br);
                    case 11 -> HomeWork6.doSelectTask(br);
                    case 12 -> HomeWork7Practical.doTask(br);
                    case 13 -> HomeWork7.doTask(br);
                    case 14 -> HomeWork8Practical.doTask(br);
                    case 15 -> HomeWork8.doTask(br);
                    case 16 -> HomeWork9Practical.doTask(br);
                    case 17 -> HomeWork9.doSelectTask(br);
                    case 18 -> HomeWork10Practical.doSelectTask(br);
                    case 19 -> HomeWork10.doSelectTask(br);
                    case 20 -> HomeWork11Practical.doSelectTask(br);
                    case 21 -> HomeWork11.doSelectTask(br);

                    case 100 -> ProjectFruits.doTask(br);



                    case 0 -> {
                    }
                    default -> System.out.println("Wrong task number selected.");
                }
            }
            while (x != 0);

        }
    }
