package PracticalTask11_Exception.Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAreaRectangle {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AreaRectangle sR = new AreaRectangle();

        try {
            System.out.print("Input int a: ");
            sR.setA(Integer.parseInt(br.readLine()));
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error input, not a number: " + e.getMessage());
        }

        try {
            System.out.print("Input int b: ");
            sR.setB(Integer.parseInt(br.readLine()));
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error input, not a number: " + e.getMessage());
        }
        if(sR.squareRectangle(sR.getA(), sR.getB()) == 0) {
            System.out.println("Input nonnumeric value, can not calculate AreaRectangle");
        } else if (sR.squareRectangle(sR.getA(), sR.getB()) == -1) {
            System.out.println("Input negative number, can not вычислить AreaRectangle");
        } else {
            System.out.println("AreaRectangle = " + sR.squareRectangle(sR.getA(), sR.getB()));
        }
    }
}
