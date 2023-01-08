package hw10;

public class Task_1 {
    public static void main(String[] args) {

        String sentence = "Creativity is intelligence having fun";
        String[] words = sentence.split(" ");

//        for (String el : words) {
//            System.out.println(el);
//        }

        int maxLength = 0;
        String longestWord = null;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        System.out.printf("The longest word is %s\n", longestWord);
        System.out.printf("This word contain %d letters\n", maxLength);

        StringBuilder text = new StringBuilder(words[1]);
        System.out.println("Reversed second word is: " + text.reverse());
    }
}

