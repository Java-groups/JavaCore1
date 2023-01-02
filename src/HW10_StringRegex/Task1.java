package HW10_StringRegex;

import java.util.Scanner;

public class Task1 {
    // Enter in the console sentence of five words.
    //display the longest word in the sentence
    //determine the number of its letters
    //bring the second word in reverse order
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in the console sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] arrSentence = sentence.split(" ");

        //display the longest word in the sentence
        //determine the number of its letters
        int countLetter = 0;
        String maxWord = null;
        for (int i = 0; i < arrSentence.length; i++) {
            if (countLetter < arrSentence[i].length()) {
                countLetter = arrSentence[i].length();
                maxWord = arrSentence[i];
            }
        }
        System.out.println("\nThe longest word in the sentence: " + maxWord);
        System.out.println("The number of its letters: " + countLetter);

        //bring the second word in reverse order
        StringBuffer word2 = new StringBuffer(arrSentence[1]);
        String wordReverse = word2.reverse().toString();
        System.out.println("\nThe second word in reverse order: " + wordReverse);
    }
}
