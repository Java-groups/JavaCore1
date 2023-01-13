package HW12_Funtional_Data_Time;

import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Year_Leap {
    // Create method which take year as a parameter and return true if year is a leap
    // 2016 2020 2024

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput year: ");
        String newYear = scanner.nextLine();
        System.out.println(yearLeap(newYear));
    }
    public static boolean yearLeap(String year) {
            Year newYear = Year.parse(year, DateTimeFormatter.ofPattern("y"));
            return newYear.isLeap();
    }
}
