package hw10;

public class Task_1 {
    public static void main(String[] args) {

        String sentence = "Creativity is intelligence having fun";
        String[] words = sentence.split(" ");

//        for (String el : words) {
//            System.out.println(el);
//        }

        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.printf("The longest word is %s\n", longestWord);
        System.out.printf("This word contain %d letters\n", longestWord.length());

        StringBuilder text = new StringBuilder(words[1]);
        System.out.println("Reversed second word is: " + text.reverse());
    }
}

