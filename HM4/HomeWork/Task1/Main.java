package HM4.HomeWork.Task1;
import java.util.Scanner;

//Task description
//Ask user to enter the number of month. Read the value and write the number of days in this month (create array with amount days of each month).


public class Main {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the month");

        int monthNumber = sc.nextInt();

        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("There is no such a month");
        }
        else {System.out.println("There are " + monthDays[monthNumber-1] + " days in this month");}
    }
}
