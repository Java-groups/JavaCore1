package Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(".\\Lesson16\\Task_2.txt");
        Scanner sc = new Scanner(file);

        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        lines.forEach(System.out::println);
        List<String> words = lines.stream()
                .map(str -> str.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        words.stream()
                .filter(w -> w.substring(0, 1).matches("[AaEeUuIiOoYy]"))
                .forEach(System.out::println);


        System.out.println("Words for which the last letter of one word matches the first letter of the next word:");
        for (int i = 0; i < words.size() - 1; i++) {
            String word1 = words.get(i);
            String word2 = words.get(i + 1);
            if (word1.charAt(word1.length() - 1) == (word2.charAt(0))) {
                System.out.println(word1);
            }
        }
        sc.close();
    }
}
