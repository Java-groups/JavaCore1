package HW12_Funtional_Data_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validate_Date {
    // Create method to validate date according to format "mm.dd.yy"
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput data format mm.dd.yy; ");
        String newData = scanner.nextLine();
        System.out.println(validateDate(newData));
    }

    public static boolean validateDate(String string) {
        LocalDate localDate = LocalDate.now();
        String localDateFormat = localDate.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
        return localDateFormat.equals(string);
    }
}
