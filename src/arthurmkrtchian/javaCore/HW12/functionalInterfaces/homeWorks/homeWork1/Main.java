package arthurmkrtchian.javaCore.HW12.functionalInterfaces.homeWorks.homeWork1;


//        1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//        Method encrypt should take a string and return coded string where every letter is moved
//        on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
//        return decoded value


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String st = "Hello my dear friend! abcd";
        String encryptedString = encrypt(st);
        System.out.println(encryptedString);

        String decryptedString = decrypt(encryptedString);
        System.out.println(decryptedString);
    }


    public static String encrypt(String string){
        char[] input = string.toCharArray();
        char[] output = new char[input.length];
        Function<Integer, Integer> encrypt = x ->  x + 3 ;
        for (int i = 0; i < input.length; i++) {
            output[i] = (char) (int) encrypt.apply((int) input[i]);
        }
        return charToString(output);
    }

    public static String decrypt(String string){
        char[] input = string.toCharArray();
        char[] output = new char[input.length];
        Function<Integer, Integer> decrypt = x -> x - 3;
        for (int i = 0; i < input.length; i++) {
            output[i] = (char) (int) decrypt.apply((int) input[i]);
        }
        return charToString(output);
    }

    public static String charToString(char[] charset){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charset.length; i++) {
            stringBuilder.append(charset[i]);
        }

        return stringBuilder.toString();
    }


}
