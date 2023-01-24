package org.HomeWorks.HomeWork15.HomeWork.Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("E:\\Users\\7stet\\IdeaProjects\\MyHomeWorks\\src\\main\\java\\org\\HomeWorks\\HomeWork15\\HomeWork\\Task1\\file1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }
            String[] lines = list.toArray(new String[0]);
            int count = 0;
            int maxSymbols = 0;
            String longestLine = "";
            StringBuilder sb;
            for (int i = 0; i < lines.length; i++) {
                count++;
                sb = new StringBuilder(lines[i]);
                if (maxSymbols < sb.capacity()) {
                    maxSymbols = sb.capacity();
                    longestLine = lines[i];
                }
            }

            List<String> resultList = new ArrayList<>();
            resultList.add("There is " + count + " lines in file1.txt");
            resultList.add("The longest line is: " + longestLine);
            resultList.add("My name - Stepan Bilashuk, my birthday date - 01/10/2002");
            Path path = Paths.get("E:\\Users\\7stet\\IdeaProjects\\MyHomeWorks\\src\\main\\java\\org\\HomeWorks\\HomeWork15\\HomeWork\\Task1\\file2.txt");
            Files.write(path, resultList, StandardCharsets.UTF_8, StandardOpenOption.WRITE);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
