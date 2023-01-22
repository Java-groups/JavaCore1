package HW11.Task2;

import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class ReadTheNumber {
    static int readTheNumber(int start, int end, BufferedReader br) throws IOException {
        System.out.println("Input number in the range: " + start + " - " + end);
        int number = parseInt(br.readLine());
        if (number <= start || number >= end) {
           throw new IOException("Input value is out of the range");
        } else {
            return number;
        }
    }
}
