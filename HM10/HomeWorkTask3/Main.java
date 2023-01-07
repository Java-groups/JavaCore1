package HM10.HomeWorkTask3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String sentence = "I earn $5000.0000 USD a year. It's better than $250.5089 a month";
        String pattern = "\\$[0-9]+(\\.[0-9]{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);

        while (m.find()) {
            System.out.println(sentence.substring(m.start(), m.end()));
        }
    }
}
