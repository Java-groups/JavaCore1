package AllHomeWorks.HomeWork10;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println();
        System.out.println("Please input Sentence with US currency:");
        String sentence = br.readLine();

        Pattern pattern = Pattern.compile("\\$\\w+\\.\\w{2}");
        Matcher matcher = pattern.matcher(sentence);
        boolean flagFind = false;

        while(matcher.find()) {
            flagFind = true;
            System.out.printf("\nUS currency - %s", sentence.substring(matcher.start(), matcher.end()));
        }
        if (!flagFind){
            System.out.println("Nothing found");
        }
    }
}
