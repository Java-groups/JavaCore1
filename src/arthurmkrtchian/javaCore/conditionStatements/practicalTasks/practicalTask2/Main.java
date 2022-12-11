package arthurmkrtchian.javaCore.conditionStatements.practicalTasks.practicalTask2;

import helper.Reader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int theDayOfTheWeek;

        System.out.println("Enter the number of the day of the week:");
        theDayOfTheWeek = reader.readFromRange("There is no such day of the week, try again.", 1,7);

        switch (theDayOfTheWeek){
            case 1:
                System.out.println(DaysOfTheWeek.MONDAY.toString());
                break;
            case 2:
                System.out.println(DaysOfTheWeek.TUESDAY.toString());
                break;
            case 3:
                System.out.println(DaysOfTheWeek.WEDNESDAY.toString());
                break;
            case 4:
                System.out.println(DaysOfTheWeek.THURSDAY.toString());
                break;
            case 5:
                System.out.println(DaysOfTheWeek.FRIDAY.toString());
                break;
            case 6:
                System.out.println(DaysOfTheWeek.SATURDAY.toString());
                break;
            case 7:
                System.out.println(DaysOfTheWeek.SUNDAY.toString());
                break;
        }

    }
}
