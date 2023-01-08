package com.edu.practicaltask10;

public class SubOfString {

    public static void main(String[] args) {

        String s1 = "string";
        String s2 = "java.lang.String.contains() method searches the sequence of characters in the given string.";


        if (s2.contains(s1)) {
            System.out.println("String: \n" + s2 + "\n contains: " + '"' + s1 + '"');
        } else {
            System.out.println("String: \n" + s2 + "\n does not contain: " + '"' + s1 + '"');

        }
    }
}

