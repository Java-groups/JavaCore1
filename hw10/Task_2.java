package hw10;

public class Task_2 {
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java     Core";
        String sentenceWithoutSpaces = sentence.replaceAll("[\\s]{2,}", " ");
        System.out.println(sentenceWithoutSpaces.replace("I am", "I'm"));
    }
}
