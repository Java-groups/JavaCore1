package com.softserve.hw10_StringRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringService {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    private String sentence = "";

    private String[] words;

    private String longestWord = " ";

    private int longestWordLength = 0;

    public String input() throws IOException {
        System.out.println("Input 5 words sentence: ");
        sentence = input.readLine();
        return sentence;
    }

    public String longestWord() {
        words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            if (length > longestWordLength) {
                longestWord = word;
                longestWordLength = length;
            }
        }
        return "The longest word is: " + longestWord + '\n' + "It's length is: " + longestWordLength;
    }

    public String reverseOrder() {
        String reverse = new StringBuilder(words[1]).reverse().toString();
        return "The 2nd word in reverse order: " + reverse;
    }

    public String replacement() throws IOException {
        System.out.println("Input sentence with 2 spaces: ");
        String sentence = input.readLine();
        return sentence.replaceAll("  ", " ");
    }

    public void currency() throws IOException {
        System.out.println("Input dollars amount: ");
        String dollarsAmount = input.readLine();
        String regexp = "\\$\\d+\\.[0-9]{2} ";
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(dollarsAmount);
        while (m.find()) {
            for (int i = 0; i < m.groupCount() + 1; i++)
                System.out.println(m.group(i));
        }
    }
}
