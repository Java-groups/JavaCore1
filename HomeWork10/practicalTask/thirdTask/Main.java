package edu.homeworks.hw10.practicalTask.thirdTask;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w{3,14}");
        ArrayList<String> list = new ArrayList();
        list.add("Be");
        list.add("Stepan");
        list.add("Boris");
        list.add("Alla");
        list.add("Anna");
        for (int i=0;i<list.size();i++){
            Matcher m = pattern.matcher(list.get(i));
            if(m.matches()){
                System.out.println("Valid element = " + list.get(i));
            } else System.out.println("This element not valid = " + list.get(i));
        }



    }
 }
