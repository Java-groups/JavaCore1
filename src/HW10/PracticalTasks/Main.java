package HW10.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String str1 = "I like to learn Java";
        String str2 = "I like";
        System.out.println(str1.startsWith(str2));

        System.out.println("=====================");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Last Name:");
        String lastName = br.readLine();
        System.out.println("Enter your First Name:");
        String firstName = br.readLine();
        System.out.println("Enter your Middle Name:");
        String middleName = br.readLine();
        char initialOfFirstName = firstName.charAt(0);
        char initialOfMiddleName = middleName.charAt(0);
        System.out.println(lastName + " " + initialOfFirstName + "." + initialOfMiddleName + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);

        Pattern p = Pattern.compile("\\w{3,15}");

        List<String> names = new ArrayList<>();
        names.add("Den");
        names.add("Bob");
        names.add("Ben");
        names.add("Adam");
        names.add("Ra");
        for (int i = 0; i < names.size(); i++) {
            Matcher m = p.matcher(names.get(i));
            if (m.matches()) {
                System.out.println("This name is valid: " + names.get(i));
            } else System.out.println("This name is not valid: " + names.get(i));
        }

    }
}
