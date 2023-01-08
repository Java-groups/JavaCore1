import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String sentence = "Sentence which contain five words";
        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Longest word is: "+longest);
        System.out.println("Length longest word is: "+longest.length());
        StringBuilder sb = new StringBuilder(sentence.split(" ")[1]).reverse();
        System.out.println("Reverse second word: "+sb);
    }
}