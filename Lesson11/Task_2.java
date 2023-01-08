package Lesson11;

public class Task_2 {
    public static void main(String[] args) {
        String userName = "Mykhaltsova Anna Serhiivna";
        String[] words = userName.split(" ");
        String surname = words[0];
        String name = words[1];
        String middleName = words[2];
        System.out.printf("%s %s. %s. \n", surname, name.charAt(0), middleName.charAt(0));
        System.out.println(name);
        System.out.printf("%s %s %s", name, middleName, surname);
    }
}
