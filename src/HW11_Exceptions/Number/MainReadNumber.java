package HW11_Exceptions.Number;

import java.io.IOException;
import java.util.Arrays;


public class MainReadNumber {
    public static void main(String[] args) throws InputException, InputException2 {
        int start = 1;
        int end = 100;
        int longArray = 10;
        int counter = 0;
        int[] number = new int[longArray];
        ReadNumber rm = new ReadNumber();
        while (longArray > counter) {
            try {
                number[counter] = rm.readNumber(start, end);
                System.out.println(number[counter] + ", ");
                counter++;
            } catch (InputException | InputException2 | IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("\nРяд чисел: " + Arrays.toString(number));
    }
}






