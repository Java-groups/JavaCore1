package org.HomeWorks.HomeWork15.HomeWork.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path pathOne = Path.of("E:\\Users\\7stet\\IdeaProjects\\MyHomeWorks\\src\\main\\java\\org\\HomeWorks\\HomeWork15\\HomeWork\\Task2\\App.java");
        Path pathTwo = Path.of("E:\\Users\\7stet\\IdeaProjects\\MyHomeWorks\\src\\main\\java\\org\\HomeWorks\\HomeWork15\\HomeWork\\Task2\\Result.java");
        try {
            String file = Files.readString(pathOne);
            System.out.println(file);
            Files.write(pathTwo, (file.substring(0, file.indexOf("class"))
                    + file.substring(file.indexOf("class"))
                    .replaceAll("public", "private")).getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
}
}
