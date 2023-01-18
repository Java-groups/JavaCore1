package HW10;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/* Enter in the console sentence of five words.
         display the longest word in the sentence
         determine the number of its letters
         bring the second word in reverse order
 */
public class Task1 {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("Enter the sentence which contain five words ");
                String text = br.readLine();
                String[] words = text.split(" ");

        int longestWord = words[0].length();
        int temp = 0;

        for (int i = 0; i < words.length; i++) {
        if (words[i].length() > longestWord){
            longestWord=words[i].length();
             temp = i;
           }
        }

         System.out.println("Longest word in the sentence " + words[temp] + " , " + " its size " + longestWord);

         String reversedWord = new StringBuilder(words[1]).reverse().toString();

        System.out.println("Second word in revers order: '" + reversedWord + "'");
        }
}

