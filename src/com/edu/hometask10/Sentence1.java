package com.edu.hometask10;
/*
      1. Enter in the console sentence of five words.
        • display the longest word in the sentence
        • determine the number of its letters
        • bring the second word in reverse order
*/
public class Sentence1 {
    public static void main(String[] args) {

        String sentence = "Word that are put together";

        String[] arr = sentence.split(" ");

        int longestWord = arr[0].length();
        int tempInd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longestWord) {
                longestWord = arr[i].length();
                tempInd = i;
            }
        }
        System.out.println("Longest word in the sentence: '" + arr[tempInd] + "', " + " its size: " + longestWord);

        String reversedWord = new StringBuilder(arr[1]).reverse().toString();

        System.out.println("Second word in revers order: '" + reversedWord + "'");
    }


}
