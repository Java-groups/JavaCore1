package AllHomeWorks.HomeWork12;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void doTask(BufferedReader br) throws IOException {
        System.out.println("\nInput string: ");
        String s = br.readLine();
        System.out.println("\nInput n: ");
        int n = Integer.parseInt(br.readLine());
        String encryptedString = encrypt(s, n);
        System.out.printf("\nEncrypted String: %s", encryptedString);
        String decryptedString = decrypt(encryptedString, n);
        System.out.printf("\nDecrypted String: %s", decryptedString);
    }

   public static String encrypt(String s, int n) throws IllegalArgumentException {
       Pattern p = Pattern.compile("[^a-zA-Z]+");

       Matcher m  = p.matcher(s);
       if (m.find()) {
           System.out.println(p.matcher(s));
               throw new IllegalArgumentException("{"+ s + "} Must contains only latin letters");
       }

       String[] letters = s.split("");
       String alphabet = "abcdefghijklmnopqrstuvwxyz";

       List<String> encryptedLetters = Arrays.stream(letters)
               .map(letter -> {
                   int pos = alphabet.indexOf(letter.toLowerCase());
                   int encryptedLetterPos = (pos+n)%alphabet.length();

                   String encryptedLetter = String.valueOf(alphabet.charAt(encryptedLetterPos));
                   if (!letter.toLowerCase().equals(letter)) {
                       encryptedLetter = encryptedLetter.toUpperCase();
                   }
                   return encryptedLetter;
               }).toList();

       return String.join("", encryptedLetters);
    }

    public static String decrypt(String s, int n) {
        String[] letters = s.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        List<String> decryptedLetters = Arrays.stream(letters)
                .map(letter -> {
                    int pos = alphabet.indexOf(letter.toLowerCase());
                    int decryptedLetterPos = (pos - n);
                    if (decryptedLetterPos < 0){
                        decryptedLetterPos += 26;
                    }

                    String decryptedLetter = String.valueOf(alphabet.charAt(decryptedLetterPos));
                    if (!letter.toLowerCase().equals(letter)) {
                        decryptedLetter = decryptedLetter.toUpperCase();
                    }
                    return decryptedLetter;
                }).toList();
        return String.join("", decryptedLetters);

    }
}
