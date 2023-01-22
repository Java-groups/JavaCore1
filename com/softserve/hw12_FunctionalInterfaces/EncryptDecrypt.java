package com.softserve.hw12_FunctionalInterfaces;

public class EncryptDecrypt {

    public String encrypt(String s, int n) {
        StringBuilder eString = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++){
            char c = (char)(s.charAt(i) + n);
            if (c > 'z') {
                eString.append((char) (s.charAt(i) - (26 - n)));
            } else {
                eString.append((char) (s.charAt(i) + n));
            }
        }
        return "Encrypted string: " + eString;
    }

    public String decrypt(String s, int n) {
        StringBuilder dString = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++){
            char c = (char)(s.charAt(i) - n);
            if (c > 'z') {
                dString.append((char) (s.charAt(i) - (26 - n)));
            } else {
                dString.append((char) (s.charAt(i) - n));
            }
        }
        return "Decrypted string: " + dString;
    }

}
