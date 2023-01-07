package HM10.PracticalTask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String pattern = "[A-Za-z1-9_]{3,15}";
        String[] names = {"Roman123", "Ir", "Bog_dan", "Pylyp&", "Vasyl5"};
        Pattern p = Pattern.compile(pattern);

        for (String nameFromArray : names) {
            Matcher m = p.matcher(nameFromArray);
            if (m.matches()) {
                System.out.println(nameFromArray + " is the name in valid format");
            } else {
                System.out.println(nameFromArray + " is the name in invalid format");
            }
        }
    }
}
