package HW10;
/* Implement a pattern for US currency: the first symbol "$",
then any number of digits, dot and two digits after the dot.
Enter the text from the console that contains several occurrences of US currency.
 Display all occurrences on the screen
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text that contains several occurrences of US currency");
        String sentence = sc.nextLine();

        String pattern = "\\$[0-9]+(\\.[0-9]{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            System.out.println(sentence.substring(m.start(), m.end()));
        }
    }
}

