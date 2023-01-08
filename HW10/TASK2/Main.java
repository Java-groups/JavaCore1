import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "I   am   learning   Java   Core";
        String strReplace = sentence.replaceAll("\\s+"," ");
        System.out.println(strReplace);

        String strReduce = Arrays.stream(sentence.split(" ")).reduce("", (el, oel) -> el.trim()+" "+oel);
        System.out.println(strReduce);

        String strIm = strReduce.replace("I am","I'm");
        System.out.println(strIm);
    }
}