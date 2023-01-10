package com.edu.hometask10;

/*   3. Implement a pattern for US currency: the first symbol "$", then any number of digits, dot
        and two digits after the dot. Enter the text from the console that contains several
        occurrences of US currency. Display all occurrences on the screen
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency3 {
    public static void main(String[] args) {

        String currency = "If you make $23.54 per hour, your Yearly salary" +
                " would be $48963.00. If you make $25.75 per hour, your Yearly " +
                "salary would be $53560.0.";

        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");

        Matcher matcher = p.matcher(currency);
        while (matcher.find()) {
            System.out.println(currency.substring(matcher.start(), matcher.end()));

        }
    }
}

