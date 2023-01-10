package com.edu.hometask10;
/*
     2. Enter a sentence that contains the words between more than one space. Convert all
        spaces, consecutive, one. For example, if we introduce the sentence "I am learning
        Java Core», we have to get the "I'm learning Java Core
*/

public class Space2 {

    public static void main(String[] args) {

        String sentence = "I  am  learning       Java   Core";

        String spaceRemoved = sentence.replaceAll("[\\s]+", " ");

        System.out.println(spaceRemoved.replace("I am", "I`m"));

    }
}
