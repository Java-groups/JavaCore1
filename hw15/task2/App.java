package hw15.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\hw15\\task2\\Student.java");
        File output = new File(".\\hw15\\task2\\StudentPrivate.java");


        Scanner sc = new Scanner(file);
        FileWriter fw = new FileWriter(output);


        while (sc.hasNextLine()) {
            String replaced = replacePublicWithPrivate(sc.nextLine());
            fw.write(replaced);
            fw.write("\n");
        }
        fw.flush();
        fw.close();
    }

    private static String replacePublicWithPrivate(String line) {
        return line.replace("public", "private");
    }
}
