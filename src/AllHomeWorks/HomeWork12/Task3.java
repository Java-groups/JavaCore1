package AllHomeWorks.HomeWork12;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Task3 {
    public static void doTask(BufferedReader br) throws IOException {
        LocalDate now = LocalDate.now();

        if (yearLeap(now)){
            System.out.println("Year is Leap");

        }else {
            System.out.println("Year is no Leap");
        }
    }
        public static boolean yearLeap(LocalDate date){

        int year = date.getYear();
         return year % 4 == 0;
    }

}
