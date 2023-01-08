package hw10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text that contains several occurrences of US currency");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile("\\$[0-9]*.?[0-9]{2}");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
}
