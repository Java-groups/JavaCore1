package HM3.PracticalTasks.PracticalTask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OddNumbers Number1 = new OddNumbers();
        OddNumbers Number2 = new OddNumbers();
        OddNumbers Number3 = new OddNumbers();

        Scanner sc = new Scanner(System.in);
        int oddNumbers = 0;

        System.out.println("Please enter the first number");
        Number1.setNumber(sc.nextInt());

        System.out.println("Please enter the second number");
        Number2.setNumber(sc.nextInt());

        System.out.println("Please enter the third number");
        Number3.setNumber(sc.nextInt());

        if (Number1.getNumber() % 2 == 0) {
            oddNumbers = ++oddNumbers;
        }

        if (Number2.getNumber() % 2 == 0) {
            oddNumbers = ++oddNumbers;
        }

        if (Number3.getNumber() % 2 == 0) {
            oddNumbers = ++oddNumbers;
        }

        if (oddNumbers == 0)
        System.out.println("There are no odd numbers");

        if (oddNumbers == 1)
            System.out.println("There is 1 odd number");

        if (oddNumbers > 1)
            System.out.println("There are " + oddNumbers + " odd numbers");
    }
}
