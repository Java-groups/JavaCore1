package HW15.HW;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class HW1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Start of the first homework task");
        File file = new File("file1");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        StringBuilder stringBuilder;
        int count = 0;
        int maxSymbols = 0;
        String longestLine = "";
        for (int i = 0; i < stringArr.length; i++) {
            count++;
            stringBuilder = new StringBuilder(stringArr[i]);
            if (maxSymbols < stringBuilder.capacity()) {
                longestLine = stringArr[i];
            }
        }

        List<String> resultList = new ArrayList<>();
        resultList.add("There is " + count + " lines in file1.txt");
        resultList.add("The longest line is: " + longestLine);
        resultList.add("Hi!My name is Polina and I was born on 10th December");
        Path path = Paths.get("file2");
        Files.write(path, resultList, StandardCharsets.UTF_8, StandardOpenOption.WRITE);

    }
}
