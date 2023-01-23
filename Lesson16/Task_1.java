package Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(".\\Lesson16\\myText.txt");
        Scanner sc = new Scanner(file);

        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        lines.forEach(System.out::println);
        lines.stream()
                .map(String::length)
                .forEach(System.out::println);

        IntSummaryStatistics stats = lines.stream()
                .mapToInt(String::length).summaryStatistics();
        System.out.println("The longest line: " + stats.getMax());
        System.out.println("The shortest line: " + stats.getMin());

        List<String> filtered = lines.stream()
                .filter(line -> line.contains("var"))
                .collect(Collectors.toList());
        System.out.println(filtered);
        sc.close();
    }
}
