package hw12;

import java.util.function.BiFunction;

public class Task_1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> encrypt = (str, shift) -> {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (chars[i] + shift);
            }
            return String.valueOf(chars);
        };
        BiFunction<String, Integer, String> decrypt = (str, shift) -> {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (chars[i] - shift);
            }
            return String.valueOf(chars);
        };
        String s = "abc";
        String encrypted = encrypt.apply(s, 4);
        System.out.println(encrypted);
        String decrypted = decrypt.apply(encrypted, 4);
        System.out.println(decrypted);
    }
}
