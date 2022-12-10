package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("enter the number of month");
        int mounthNumber = Integer.parseInt(br.readLine());
        for (int i = 0; i < monthDays.length; i++) {
            if (i == mounthNumber) {
                System.out.println(monthDays[i-1] + " days in the month");
            }



        }
    }
}