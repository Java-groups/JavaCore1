package hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text that contains several occurrences of US currency");
        String input = sc.nextLine();

        List<String> currencyValues = findCurrencyValues(input);
        for (String el : currencyValues) {
            System.out.println(el);
        }
    }

    public static List<String> findCurrencyValues(String input) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\$[0-9]*.?[0-9]{0,2}");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            result.add(m.group(0).trim());
        }
        return result;
    }
}
