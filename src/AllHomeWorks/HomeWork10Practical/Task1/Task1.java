package AllHomeWorks.HomeWork10Practical.Task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {

        System.out.println();
        System.out.println("Please input String 1, or 0 - for exit:");
        String str1 = br.readLine();
        System.out.println();
        System.out.println("Please input String 2, or 0 - for exit:");
        String str2 = br.readLine();

        if (!str2.contains(str1)){
            System.out.printf("The %s isn't a part of %s", str1, str2);
        } else {
            System.out.printf("The %s is a part of %s", str1, str2);
        }

    }
}
