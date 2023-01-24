package PracticalTask15_IO_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    // Prepare a file with text:
    //1) find and output to the console all words starting with a vowel.

    public static void main(String[] args) throws IOException {

        String fileName = "src/PracticalTask15_IO_Stream/mytext2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = null;
            System.out.println("All words starting with a vowel: ");
            while ((line = br.readLine()) != null) {
                String[] wordArray = line.toLowerCase().split("[\\s,.:!?]+");

                Pattern pattern = Pattern.compile("^[eyuioa].");
                for (String word : wordArray) {
                    Matcher matcher = pattern.matcher(word);
                    if (matcher.find()) {
                        System.out.println(word);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
