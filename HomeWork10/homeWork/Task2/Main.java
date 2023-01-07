package edu.homeworks.hw10.homeWork.Task2;


import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String words;
        words = "I  am  learning  Java   Core";
        words = words.trim().replaceAll("\\s+"," ");
        System.out.println(words);
        words = words.replaceAll("(?i)\\b"+"am" + "\\b", "'m");
        System.out.println(words);



       /* String[] elements = words.split(" ");
        for (int i=0;i<elements.length;i++){
            if(elements[i].toLowerCase().equals("am")){
                elements[i] = "'m";
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String e:elements) {
            stringBuilder.append(e);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);*/



    }
 }
