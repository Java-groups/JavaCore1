package HW12_Funtional_Data_Time;

import static java.lang.Math.abs;

public class Encrypt_Decrypt {

    private static int move = - 3;

    public static void main(String[] args) {

        String text = "Method encrypt should take a string and return coded string";
        System.out.println("\ntext: " + "\n" + text);

        String encryptText = encrypt_decrypt(text, abs(move));
        System.out.println("\nEncrypt: " + "\n" + encryptText);

        String decryptText = encrypt_decrypt(encryptText, move);
        System.out.println("\nDecrypt: " + "\n" + decryptText);

    }

    public static String encrypt_decrypt(String s, int n) {
        String textConvert = "";
        for (int i = 0; i < s.length(); i++) {
            textConvert = textConvert + ((char) ((int) s.charAt(i) + n));
        }
        return textConvert;
    }
}
