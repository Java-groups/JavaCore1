package arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork1;


import helper.Reader;
import java.io.IOException;
import java.time.YearMonth;

//     1. Ask user to enter the number of month. Read the value and write the number of days in
//        this month (create array with amount days of each month).
public class Main {
    static Reader reader = new Reader();

    public static void main(String[] args) throws IOException {
        int[] daysInMonth = new int[12];


        for (int i = 0; i < 12; i++) {
            daysInMonth[i] = YearMonth.of(YearMonth.now().getYear(), i+1).lengthOfMonth();
        }

        System.out.print("Please enter the number of month to see how mach days in it: ");
        int month = reader.readFromRange("There is no such month. Please try again.",1,12);
        System.out.printf("There is %s days in %s.",
                daysInMonth[month-1],
                getMonth(month)
        );
    }

    public static String getMonth(int i) throws IOException {
        return Months.values()[i-1].toString();
    }
}
