import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) throws IOException {

        Path pathOne = Path.of("careerOne.txt");
        Path pathTwo = Path.of("careerTwo.txt");

        List<String> career = new ArrayList<>();
        career.add("My career");
        career.add("Education");
        career.add("Courses");
        career.add("Jobs");
        Files.write(pathOne, career, StandardCharsets.UTF_8,
                new StandardOpenOption[]{StandardOpenOption.CREATE});
        try {
            String amountOfLines = Files.readAllLines(pathOne).size() + "\n";
            String maxString = Files.readAllLines(pathOne).stream().max(Comparator.comparingInt(String::length)).get() + "\n";
            Files.write(pathTwo, amountOfLines.getBytes());
            Files.write(pathTwo, maxString.getBytes(), StandardOpenOption.APPEND);
            Files.write(pathTwo, "my name and birthday date".getBytes(), StandardOpenOption.APPEND);
            System.out.println(Files.readString(pathTwo));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}