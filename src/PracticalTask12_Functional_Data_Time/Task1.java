package PracticalTask12_Functional_Data_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task1 {
    // Show which today is a day of a week
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfWeek());
    }
}
