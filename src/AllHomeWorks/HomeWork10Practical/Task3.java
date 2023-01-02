package AllHomeWorks.HomeWork10Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Task3 {
    public static void doTask(BufferedReader br) throws IOException {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Please input Name0:");
            String name = br.readLine();
            if (p.matcher(name).find()) {
                System.out.print("Your Name is correct.");
            } else {
                System.out.print("Your name is incorrect");
            }

        }
    }
}
