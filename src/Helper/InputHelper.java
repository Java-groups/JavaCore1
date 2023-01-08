package Helper;

import java.io.BufferedReader;
import java.io.IOException;

public class InputHelper {

    public static int inputInteger(BufferedReader br) throws IOException {

        int number = 0;
        boolean enteredInt = false;

        while (!enteredInt) {

            try {
                number = Integer.parseInt(br.readLine());
                enteredInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Please input number!");
            }
        }
        return number;

    }

    public static double inputDouble(BufferedReader br) throws IOException {

        double number = 0;
        boolean enteredDouble = false;

        while (!enteredDouble) {
            try {
                number = Double.parseDouble(br.readLine());
                enteredDouble = true;
            } catch (NumberFormatException e) {
                System.out.println("Please input double number!");
            }
        }
        return number;
    }

    public static float inputFloat(BufferedReader br) throws IOException {

        float number = 0;
        boolean enteredFloat = false;

        while (!enteredFloat) {
            try {
                number = Float.parseFloat(br.readLine());
                enteredFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Please input float number!");
            }
        }
        return number;
    }

}
