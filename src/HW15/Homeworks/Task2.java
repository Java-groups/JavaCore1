package HW15.Homeworks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/file3.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }

            List<String> resultList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                resultList.add(list.get(i).replaceAll("public", "private"));
            }
            Path path = Paths.get("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/file4.txt");
            Files.write(path, resultList, StandardCharsets.UTF_8, StandardOpenOption.WRITE);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
