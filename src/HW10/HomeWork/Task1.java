package HW10.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws IOException {
//        String str = "I like to learn Java";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Enter one sentence of five words:");

        String[] array = str.split(" ");
        for (String s : array) {
            System.out.println(s);
        }
        int max = array[0].length();
        String longestWord = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                longestWord = array[i];
            }
        }
        System.out.println("The longest word is " + longestWord + ", and it has " + max + " letters");

        StringBuilder secondWord = new StringBuilder(array[1]);
        System.out.println("Second word in reverse order is " + secondWord.reverse());


    }
}
