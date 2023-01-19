package com.softserve.hw10_StringRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringService {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    private String sentence = "";
    private String[] words;
    private String longestWord = " ";
    int longestWordLength = 0;

    public void input() throws IOException {
        System.out.println("Input 5 words sentence: ");
        sentence = input.readLine();
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

}
