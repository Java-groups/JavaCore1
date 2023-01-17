package com.edu.hometask12;
/*
     1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
        Method encrypt should take a string and return coded string where every letter is moved
        on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
        return decoded value
 */


public class Crypto1 {

    private static int key = 3;

    public static void main(String[] args) {

        String s = "ABC";

        System.out.println(encrypt(s, key));
        System.out.println(decrypt(encrypt(s, key), key));

    }

    public static String encrypt(String s, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((char) (s.charAt(i) + key));

        }
        return sb.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((char) (s.charAt(i) - key));

        }
        return sb.toString();

    }
}
