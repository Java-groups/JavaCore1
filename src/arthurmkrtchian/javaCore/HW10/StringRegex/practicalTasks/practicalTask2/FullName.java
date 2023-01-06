package arthurmkrtchian.javaCore.HW10.StringRegex.practicalTasks.practicalTask2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    private final String firstName;
    private final String middleName;
    private final String lastName;

    private static String cleanString(String string){
        return string.trim().replaceAll("\\s+", " ");
    }

    public void printSurnamesAndInitials() {
        System.out.println(
                "\nName: " + lastName  +
                " " + firstName.charAt(0)  +
                ". " + middleName.charAt(0) + "."
        );
    }

    public void printName() {
        System.out.println(
                "\nFirst name: " + firstName
        );
    }

    public void printFirsMiddleLastNames() {
        System.out.println(
                "\n First name: " + firstName   +
                "\nMiddle name: " + middleName  +
                "\n  Last name: " + lastName
        );
    }

    private static String[] readFullName(String string){
        Matcher m = Pattern.compile("[a-z \\-A-Zа-яА-Я]+").matcher(string);
        if (m.matches() && string.split(" ").length == 3){
            return string.split(" ");
        }
        throw new IllegalArgumentException("Incorrect input");
    }

    public FullName(String fullName) {
        fullName = cleanString(fullName);
        String[] name = readFullName(fullName);

        for (String s : name) {
            if (s.length() < 3) {
                throw new IllegalArgumentException("Incorrect input");
            }
        }

        this.lastName   = capitalize(name[0]);
        this.firstName  = capitalize(name[1]);
        this.middleName = capitalize(name[2]);
    }

    private String capitalize(String string){
        return string.substring(0,1).toUpperCase() +
               string.substring(1).toLowerCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

}
