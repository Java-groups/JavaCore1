package HW15.PracticalTasks;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/mytext.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }
            String[] lines = list.toArray(new String[0]);
//        1) count and write the number of symbols in every line.
            int count = 0;
            StringBuilder sb = new StringBuilder(lines[0]);
            int maxSymbols = sb.capacity();
            int minSymbols = sb.capacity();
            for (int i = 0; i < lines.length; i++) {
                sb = new StringBuilder(lines[i]);
                count++;
                System.out.println("Line number " + count + " has " + sb.capacity() + " symbols");
                if (maxSymbols < sb.capacity()) {
                    maxSymbols = sb.capacity();
                }
                if (minSymbols > sb.capacity()) {
                    minSymbols = sb.capacity();
                }
            }
            System.out.println(maxSymbols);
            System.out.println(minSymbols);
//        2) find the longest and the shortest line.
            for (int i = 0; i < lines.length; i++) {
                sb = new StringBuilder(lines[i]);
                if (maxSymbols == sb.capacity()) {
                    System.out.println("The longest line is: " + lines[i]);
                }
                if (minSymbols == sb.capacity()) {
                    System.out.println("The shortest line is: " + lines[i]);
                }
            }
//        3) find and write only that lines, which consist of word �var�
            String pattern = "var";
            Pattern p = Pattern.compile(pattern);
            for (int i = 0; i < lines.length; i++) {
                Matcher m = p.matcher(lines[i]);
                if (m.find()) {
                    System.out.println("The line, witch consist of word 'var' is: " + lines[i]);
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

