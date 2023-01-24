package PracticalTask15_IO_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task22 {
    // Prepare a file with text:
    //2) find and output to the console all words for which the last letter of one word matches the first letter of the next word.

    public static void main(String[] args) throws IOException {

        String fileName = "src/PracticalTask15_IO_Stream/mytext2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = null;
            System.out.println("All words for which the last letter of one word matches the first letter of the next word: ");
            while ((line = br.readLine()) != null) {
                String[] wordArray = line.toLowerCase().split("[\\s,.:!?]+");
                for (int i =0; i <wordArray.length-1; i++) {
                    String s1 = wordArray[i].substring(wordArray[i].length()-1);
                    char s2 = wordArray[i+1].charAt(0);
                    if (s1.equals(s2+"")) {
                        System.out.println(wordArray[i] + " " + wordArray[i+1]);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

