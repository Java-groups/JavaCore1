package HW10.HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str = "I    am     learning      Java     Core";
        System.out.println(str);
        Pattern p = Pattern.compile("[^ ]+");
        Matcher m = p.matcher(str);
        String str1 = "";
        while (m.find()) {
            str1 += str.substring(m.start(), m.end()) + " ";
        }
        System.out.println(str1);

        Pattern p1 = Pattern.compile("I am");
        Matcher m1 = p1.matcher(str1);
        String str2 = "";
        while (m1.find()) {
            str2 += "I'm" + str1.substring(m1.end());

        }
        System.out.println(str2);

    }

}
