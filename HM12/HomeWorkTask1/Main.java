package HM12.HomeWorkTask1;

import java.util.Arrays;

public class Main {

    static String encrypt(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((int) chars[i] + n);
        }

        return new String(chars);
    }

    static String decrypt(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((int) chars[i] - n);
        }

        return new String(chars);
    }


    public static void main(String[] args) {

        System.out.println(encrypt("Roman", 5));
        System.out.println(decrypt(encrypt("Roman", 5), 5));

    }
}
