package arthurmkrtchian.javaCore.HW1.javaIntroduction.homeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi, dear! \nDo you want to calculate the perimeter and area of any flower bed which is shaped like a circle?");
        System.out.println("Just enter it`s radius here and get the answer!");
        System.out.print("Enter the radius here: ");

        double radius = Double.parseDouble(br.readLine());

        System.out.println("---------------------------------------------------------------");
        //calculate the flower bed`s perimeter and type it on display
        System.out.println("Flower bed perimeter is: " + ((double) 2*radius*3.14));

        //calculate the flower bed`s area and type it on display
        System.out.println("Flower bed area is: " + (Math.pow(radius,2) * 3.14));
    }
}
