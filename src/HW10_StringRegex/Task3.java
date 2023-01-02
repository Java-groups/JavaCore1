package HW10_StringRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    // Implement a pattern for US currency: the first symbol "$", then any number of digits,
    // dot and two digits after the dot.
    // Enter the text from the console that contains several occurrences of US currency.
    // Display all occurrences on the screen
    public static void main(String[] args) {

        String pattern = "\\$[0-9]+(.[0-9]+)";
        String text = "Current-dollar GDP increased 7.7 percent at an annual rate, or $475.5 billion, in the third quarter to a\nlevel of $25.72 trillion (table 1 and table 3), an upward revision of $25.0 billion from the previous\n" +
                "estimate. More information on the source data that underlie the estimates is available in the \"Key\nSource Data and Assumptions\" file on BEA’s website $139 old.";
        System.out.println(text);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println("\nAll occurrences $ on the text:");
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

    }


}
