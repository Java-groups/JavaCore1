package AllHomeWorks.HomeWork10;

import java.io.BufferedReader;
import java.io.IOException;


public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println();
        System.out.println("Please input Sentence of 5 words:");

        String space = " ";
        String sentence = br.readLine();
        String maxWord = "";

        String[] wordArray = sentence.split(space);

        for (String word : wordArray) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.printf("\n Longest word is %s", maxWord);
        System.out.printf("\n Length of longest word is %d", maxWord.length());

        StringBuilder word2 = new StringBuilder(wordArray[1]);
        String wordReverse = word2.reverse().toString();
        System.out.printf("\n Second word reverted is %s", wordReverse);

    }
}
