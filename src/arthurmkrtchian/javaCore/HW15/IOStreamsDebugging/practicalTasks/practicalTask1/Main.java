package arthurmkrtchian.javaCore.HW15.IOStreamsDebugging.practicalTasks.practicalTask1;

//        Prepare mytext.txt file with a lot of text inside.
//        Read context from file into array of strings.
//        Each array item contains one line from file.
//        Complete next tasks:
//        1) count and write the number of symbols in every line.
//        2) find the longest and the shortest line.
//        3) find and write only that lines, which consist of word «var»

import java.io.*;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;

public class Main {
    static File file = new File("src/arthurmkrtchian/javaCore/HW15/IOStreamsDebugging/practicalTasks/practicalTask1/mytext.txt");


    public static void main(String[] args) throws IOException {
        completeTasks(Files.readAllLines(file.toPath()));
    }

    private static void completeTasks(List<String> lines) {
        System.out.println("The last line which contains min symbols");
        System.out.println(lines.stream().min(Comparator.comparingInt(String::length)).toString()); //чомусь get() не працює... Можливо пробелма в IDE...

        System.out.println("\nThe last line which contains max symbols");
        System.out.println(lines.stream().max(Comparator.comparingInt(String::length)).toString());

        System.out.println("\nLength of each line:");
        lines.forEach(s -> System.out.println("Length: " + s.length() + " String: " + s));

        System.out.println("\nContains \"var\":");
        lines.stream().filter(s -> s.contains("var")).forEach(System.out::println);


    }
}
