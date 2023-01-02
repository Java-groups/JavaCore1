package HW10_StringRegex;

import java.util.Scanner;

public class Task2 {
    // Enter a sentence that contains the words between more than one space.
    // Convert all spaces, consecutive, one.
    // For example, if we introduce the sentence "I    am      learning     Java     Core»,
    // we have to get the "I'm learning Java Core»

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence that contains the words between more than one space: ");
        String sentence = scanner.nextLine();
        int countSpace = 0;
        char[] arrCharSentence = sentence.toCharArray();
        for (int i = 0; i < arrCharSentence.length; i++) {
            if (arrCharSentence[i] != 32) {
                countSpace = 0;
                System.out.print(arrCharSentence[i]);
            } else {
                if (countSpace < 1) {
                    System.out.print(arrCharSentence[i]);
                    countSpace++;
                }
            }
        }
    }
}
