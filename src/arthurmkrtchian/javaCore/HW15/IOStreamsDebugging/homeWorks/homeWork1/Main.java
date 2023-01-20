package arthurmkrtchian.javaCore.HW15.IOStreamsDebugging.homeWorks.homeWork1;

//        1. Create file1.txt file with a text about your career.
//        Read context from file into array of strings. Each array item contains one line from file.
//        Write in to the file2.txt
//        1) number of lines in file1.txt.
//        2) the longest line in file1.txt.
//        3) your name and birthday date.


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

public class Main {
    static File fromFile = new File("src/arthurmkrtchian/javaCore/HW15/IOStreamsDebugging/homeWorks/homeWork1/file1.txt");
    static File toFile = new File("src/arthurmkrtchian/javaCore/HW15/IOStreamsDebugging/homeWorks/homeWork1/file2.txt");
    static final String authorName = "Arthur Mkrtchian";
    static final LocalDate birthDate = LocalDate.of(1990, 7, 12);


    public static void main(String[] args) {
        List<String> list = readFromFile(fromFile);
        System.out.println("2. Counting lines in file.");
        writeToFile(toFile, "Text contains " + list.size() + " lines\n" +
                getLongestLine(list) + "\n\t" +
                authorName + getBirthDate()
        );

    }

    private static String getLongestLine(List<String> list) {
        System.out.println("3. Getting longest line.");
        return list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    private static void writeToFile(File file, String text) {
        try {
            Files.writeString(file.toPath(), text);
            System.out.println("5. Well done. All data successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readFromFile(File file) {
        try {
            System.out.println("1. Trying to read file.");
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getBirthDate() {
        System.out.println("4. Getting author`s birth date");
        return "\t" + birthDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}
