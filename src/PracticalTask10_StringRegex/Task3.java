package PracticalTask10_StringRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    // The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
    // Using regular expressions implement checking the user name for validity.
    // Input five names in the main method .
    // Output a message to the console of the validation of each of the entered names.
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println();
        List<String> name = new ArrayList<>();
        name.add("Sasa123_678sd3455ft");
        name.add("EleS5857788558");
        name.add("@fnfdh#234");
        name.add("Qwerty_ertyu");
        String pat = "[a-zA-Z0-9_]{3,15}";
        Pattern pattern = Pattern.compile(pat);
        for (String str : name) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.printf("\n%5s%19s%8s", "Name: ", str, " - valid");
            } else {
                System.out.printf("\n%5s%19s%8s", "Name: ", str, " - not valid");
            }
        }
    }

}
