package com.edu.practicaltask10;
/*
     3. The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        Using regular expressions implement checking the user name for validity. Input five names in
        the main method . Output a message to the console of the validation of each of the entered
        names.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = ("Bart_Simpson");
        names[1] = ("Homer Simpson");
        names[2] = ("Lisa_Simpson___");
        names[3] = ("MargeBouvier12345");
        names[4] = ("!@#EdnaKrabappel");

        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");

        for (String n : names) {
            Matcher m = p.matcher(n);
            if (m.matches()) {
                System.out.println("User name: " + n + " :is valid");
            } else {
                System.out.println("User name: " + n + " :is not valid");
            }
        }
    }
}
