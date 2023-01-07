package HM10.HomeWorkTask2;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java     Core";

        System.out.println(sentence.replaceAll("\\s+", " "));
    }
}
