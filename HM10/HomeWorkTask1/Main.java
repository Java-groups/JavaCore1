package HM10.HomeWorkTask1;

import java.util.Arrays;
import java.util.Comparator;

//Enter in the console sentence of five words.
//        display the longest word in the sentence
//        determine the number of its letters
//        bring the second word in reverse order


public class Main {
    public static void main(String[] args) {
        String sentence = "I am learning Java Core";

        String[] arr = sentence.split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("The longest word is \"" + arr[arr.length - 1] + "\"");
        System.out.println("The longest word consists of \"" + arr[arr.length-1].length() + "\"" + " letters");
        System.out.println(new StringBuilder(arr[1]).reverse());
    }
}
