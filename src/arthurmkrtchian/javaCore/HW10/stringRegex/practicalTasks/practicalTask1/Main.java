package arthurmkrtchian.javaCore.HW10.stringRegex.practicalTasks.practicalTask1;

//        Enter the two variables of type String. Determine whether the first variable substring second. For
//        example, if you typed «IT» and «IT Academy» you must receive true.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter substring to search");
        String substring = br.readLine();
        System.out.println("\nPlease enter string to search in");
        String string = br.readLine();

        Matcher m = Pattern.compile(substring).matcher(string);
        System.out.println(m.find());
    }
}
