package HW15.PracticalTasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        File file = new File("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/mytext.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }
//        1) find and output to the console all words starting with a vowel.
            String[] lines = list.toArray(new String[0]);
            for (int i = 0; i < lines.length; i++) {
                String[] words = lines[i].split(" ");
                for (int j = 0; j < words.length; j++) {
                    if (words[j].startsWith("A") || words[j].startsWith("a")
                            || words[j].startsWith("E") || words[j].startsWith("e")
                            || words[j].startsWith("I") || words[j].startsWith("i")
                            || words[j].startsWith("O") || words[j].startsWith("o")
                            || words[j].startsWith("U") || words[j].startsWith("u")) {
                        System.out.println(words[j]);
                    }
                }
            }

//      2) find and output to the console all words for which the last letter of one word matches
//      the first letter of the next word.
            for (int i = 0; i < lines.length; i++) {
                String[] words = lines[i].split(" ");
                for (int j = 0; j < words.length - 1; j++) {
                    if (words[j].length() > 0 && words[j + 1].length() > 0 && words[j].charAt(words[j].length() - 1) == (words[j + 1].charAt(0))) {
                        System.out.println(words[j] + " " + words[j + 1]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

