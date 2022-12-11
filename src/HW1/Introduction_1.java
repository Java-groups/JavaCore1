package HW1;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Introduction_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте радіус кола: ");
        float radius = scanner.nextFloat();
        System.out.println("Довжина кола = " + (2*PI*radius));
        System.out.println("Площа круга = " +  (PI*radius*radius));
    }
}

