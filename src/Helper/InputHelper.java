package Helper;

import java.io.BufferedReader;
import java.io.IOException;

public class InputHelper {

    public static int inputInteger(BufferedReader br) throws IOException {

        int number = 0;
        boolean enteredInt = false;

        try {
            number = Integer.parseInt(br.readLine());
            enteredInt = true;
        } catch (NumberFormatException e) {

        }

        while (!enteredInt) {
            System.out.println("Please input number!");
            try {
                number = Integer.parseInt(br.readLine());
                enteredInt = true;
            } catch (NumberFormatException e) {

            }
        }
        return number;
    }


}
