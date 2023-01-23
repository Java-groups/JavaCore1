package hw15.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\hw15\\task1\\file1.txt");

        Scanner sc = new Scanner(file);

        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        lines.forEach(System.out::println);
        File output = new File(".\\hw15\\task1\\output.txt");
        FileWriter fw = new FileWriter(output);
        lines.sort(Comparator.comparingInt(String::length).reversed());
        fw.write("Number of lines in input file: " + lines.size() + "\n");
        fw.write("The longest string in input file: " + lines.get(0) + "\n");
        fw.write("Anna Mykhaltsova, 09 of February");
        fw.flush();
        fw.close();

    }
}
