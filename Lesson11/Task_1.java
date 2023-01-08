package Lesson11;

public class Task_1 {
    public static void main(String[] args) {
        String s1 = "Bond";
        String s2 = "James Bond";
        if (s2.contains(s1)) {
            System.out.println("The first variable is substring second variable");
        } else {
            System.out.println("The second variable doesn't contain first variable");
        }
    }
}
