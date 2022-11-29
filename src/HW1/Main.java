package HW1;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Practical task № 1");
        System.out.println("Enter a");
        float a = sc.nextFloat();
        System.out.println("Enter b");
        float b = sc.nextFloat();
        System.out.println(" Result a+b = " + (a + b));
        System.out.println(" Result a-b = " + (a - b));
        System.out.println(" Result a*b = " + (a * b));
        System.out.println(" Result a/b = " + (a / b));

        System.out.println("Practical task № 2");
        System.out.println("How are you?");
        String answer = sc.next();
        System.out.println("You are " + answer);

        System.out.println("Homework № 1, task 1");
        System.out.println("Enter radius of the flowering bed:");
        float radius = sc.nextFloat();
        double pi = 3.1415926536;
        double perimeter = 2 * radius * pi;
        System.out.println("Perimeter of bed = " + perimeter);
        double area = pow(radius,2) * pi;
        System.out.println("Area of bed = " + area);

        System.out.println("Homework № 1, task 2");
        System.out.println("What is your name?");
        String answer1 = sc.next();
        System.out.println("Your name is " + answer1);
        System.out.println("Where are you live," + answer1 + "?");
        String answer2 = sc.next();
        System.out.println("You live in " + answer2);

        System.out.println("Homework № 1, task 3");
        System.out.println("What is the tariff for minute for first?");
        Float c1 = sc.nextFloat();
        System.out.println("What is the tariff for minute for second?");
        Float c2 = sc.nextFloat();
        System.out.println("What is the tariff for minute for third?");
        Float c3 = sc.nextFloat();
        System.out.println("How many minutes was call during for first?");
        Float t1 = sc.nextFloat();
        System.out.println("How many minutes was call during for second?");
        Float t2 = sc.nextFloat();
        System.out.println("How many minutes was call during for third?");
        Float t3 = sc.nextFloat();

        System.out.println("Separately for first = " + (c1 * t1));
        System.out.println("Separately for second = " + (c2 * t2));
        System.out.println("Separately for third  = " + (c3 * t3));
        System.out.println("For all = " + ((c1 * t1) + (c2 * t2) + (c3*t3)));




    }
}