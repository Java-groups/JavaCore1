package arthurmkrtchian.javaCore.HW12.functionalInterfaces.homeWorks.homeWork2;



//        2. Create method to validate date according to format "mm.dd.yy"


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Main {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("Please enter date in following format: month.day.year (MM.dd.yy)");

        if (isValid(reader.readLine())){
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is invalid");
        }
    }
//Чи можливо десь тут використати predicate? Я ще бі трішки і голову б собі зламав міркуючи над цим питанням, але вчасно зупинився:)
    private static boolean isValid(String date){
        try {
            formatter.parse(date);
            return true;
        } catch (DateTimeParseException e){
            e.printStackTrace();
            System.err.println("Invalid input!");
        }
        return false;
    }
}
