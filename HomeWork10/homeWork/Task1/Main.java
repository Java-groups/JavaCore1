package edu.homeworks.hw10.homeWork.Task1;


import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words,longestWord;
        int max;
        System.out.println("Write 3 words with space");
        words = scanner.nextLine();
        String[] elements = words.split(" ");
        max=elements[0].length();
        longestWord = elements[0];
        for(int i=0;i<elements.length;i++) {
            if (elements[i].length() > max) {
                max = elements[i].length();
                longestWord = elements[i];
            }
        }
        System.out.println("Longest word = " + longestWord + " size = " + max);

        System.out.println(new StringBuilder(elements[1]).reverse());
    }
 }
