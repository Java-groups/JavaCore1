import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        Path pathOne = Path.of("src/Student.java");
        Path pathTwo = Path.of("src/StudentTwo.java");
        try {
            String file = Files.readString(pathOne);
            System.out.println(file);
            Files.write(pathTwo, (file.substring(0, file.indexOf("class"))
                    + file.substring(file.indexOf("class"), file.length())
                    .replaceAll("public", "private")).getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
