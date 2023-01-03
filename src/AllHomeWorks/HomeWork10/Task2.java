package AllHomeWorks.HomeWork10;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println();
        System.out.println("Please input Sentence with more than one space between the words:");

        String space = " ";
        String sentence = br.readLine();
        sentence = sentence.replaceAll("\\s+", space);
        System.out.println(sentence);
    }
}
