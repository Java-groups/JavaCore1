package HW10.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask {
    public static void main(String[] args) {
        String s1 = "I love JavaCore";
        String s2 = "JavaCore";
        System.out.println("Start of first practical task");
        if(s1.contains(s2)){
            System.out.println(true);
        }// перший спосіб
        System.out.println(s1.contains(s2));//другий спосіб
        System.out.println("Start of second practical task");
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String firstName = sc.next();
        System.out.println("Enter surname:");
        String surName = sc.next();
        System.out.println("Enter patronymic:");
        String patronymic = sc.next();
        char initialOfFirstName = firstName.charAt(0);
        char initialOfMiddleName = patronymic.charAt(0);
        System.out.println(surName + " " + initialOfFirstName + "." + initialOfMiddleName + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + patronymic + " " + surName);
        System.out.println("Start of third practical task");
        Pattern p =Pattern.compile("\\w{3,15}");


        List<String> name = new ArrayList<>();
        name.add("Anna");
        name.add("Polina___");
        name.add("Andrey");
        name.add("Alex45");
        name.add("Kate@");
        for (int i = 0; i < name.size(); i++) {
            Matcher m = p.matcher(name.get(i));
            if (m.matches()) {
                System.out.println("This name is valid: " + name.get(i));
            } else System.out.println("This name is not valid: " + name.get(i));
        }


    }
}
