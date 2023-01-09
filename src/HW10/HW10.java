package HW10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW10 {
    public static void main(String[] args) {
        System.out.println("Enter sentence of 5 words:");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] arrayOfWords = sentence.split(" ");
        int count = 0;
        String max = null;
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (count <  arrayOfWords[i].length()) {
                count = arrayOfWords[i].length();
                max = arrayOfWords[i];
            }
        }
        System.out.println("The longest word is: " + max);
        System.out.println("The number of letters in this word: " + count);
        System.out.println(new StringBuilder(arrayOfWords[1]).reverse());
        System.out.println("Start of second task");
        String sentence1 = "I    am      learning     Java     Core";

        System.out.println(sentence.replaceAll("\\s+", " "));
        System.out.println("Start of the third task");
        System.out.println("Enter US currency for 3 times:");
        String currency = sc.nextLine();
        String[] arrayOfCurrency = currency.split(" ");
        String pattern = "\\$\\d+.\\d{2}";

        Pattern p = Pattern.compile(pattern);
        List<String> listOfCurrency = List.of(arrayOfCurrency);

        for (String strOfCurrency : listOfCurrency) {
            Matcher m = p.matcher(strOfCurrency);
            if (m.matches()) {
                System.out.println("The currency is valid " + strOfCurrency);
            } else {
                System.out.println("The currency is not valid " + strOfCurrency);
            }


        }

    }
}





