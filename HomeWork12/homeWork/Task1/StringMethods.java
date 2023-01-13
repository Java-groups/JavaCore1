package edu.homeworks.hw12.homeWork.Task1;

public class StringMethods {
    public String encrypt(String s, int n){
        char[] letters = s.toCharArray();
        for(int i=0;i<letters.length;i++){
            letters[i] += n;
        }
        return new String(letters);
    }

    public String decrypt(String s, int n){
        char[] letters = s.toCharArray();
        for(int i=0;i<letters.length;i++){
            letters[i] -= n;
        }
        return new String(letters);

    }
}
