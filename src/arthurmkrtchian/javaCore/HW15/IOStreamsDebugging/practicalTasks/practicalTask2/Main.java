package arthurmkrtchian.javaCore.HW15.IOStreamsDebugging.practicalTasks.practicalTask2;

//        Prepare a file with text:
//        1) find and output to the console all words starting with a vowel.
//        2) find and output to the console all words for which the last letter of one word
//        matches the first letter of the next word.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static File file = new File("src/arthurmkrtchian/javaCore/HW15/IOStreamsDebugging/practicalTasks/practicalTask1/mytext.txt");

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(file.toPath());
        System.out.println("All words which starts with a vowel:");
        printAllStartsWithAVowel(getWords(list));
        printAllMatches(getWords(list));
    }

    private static void printAllStartsWithAVowel(List<String> words){
        String vowels = "aeiou";
        for (String word: words){
            if (word.length() >0 ) {
                if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                    System.out.printf("The word \"%s\" starts with a vowel.\n", word);
                }
            }
        }
    }

    private static List<String> getWords(List<String> lines){
        List<String> result = new ArrayList<>();
        for (String l: lines){
            result.addAll(Arrays.asList(l.split("[^A-Za-zА-Яа-я]+")));
        }
        return result;
    }

    private static void printAllMatches(List<String> words){
        System.out.println("\nWords pairs with common symbols at the end and the beginning: ");
        for (int i = 0; i < words.size(); i++) {
            if (i + 1 < words.size() && words.get(i).length() > 0 && words.get(i+1).length() > 0){
                if (words.get(i).endsWith(String.valueOf(words.get(i+1).toCharArray()[0]))) {
                    String w = words.get(i);
                    System.out.printf("First word: %s Second word: %s\n", words.get(i), words.get(i+1));
                }
            }
        }
    }
}
