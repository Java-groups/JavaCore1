package arthurmkrtchian.javaCore.HW12.functionalInterfaces.homeWorks.homeWork3;


//        3. Create method which take year as a parameter and return true if year is a leap


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Please enter year (for example: 2023) to check if that year is leap");
        try {
            if (isLeap(reader.readLine())){
                System.out.println("Yes, the year is leap");
            } else{
                System.out.println("No, the year is not leap");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static boolean isLeap(String year){
        while(true) {
            try {
                LocalDate d = LocalDate.of(Integer.parseInt(year), 1,1);
                return d.isLeapYear();
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                System.err.println("Invalid input. Please try again.");
            }
        }
    }
}
