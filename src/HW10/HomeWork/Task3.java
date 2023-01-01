package HW10.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pattern = "\\$\\d+.\\d{2}";

        Pattern p = Pattern.compile(pattern);

        List<String> list = new ArrayList<>();
        System.out.println("Enter US currency three times");
        list.add(br.readLine());
        list.add(br.readLine());
        list.add(br.readLine());
        for (String str:list) {
            Matcher m = p.matcher(str);
            if (m.matches()) {
                System.out.println("The currency is valid " + str);
            }else System.out.println("The currency is not valid " + str);

        }
    }
}
