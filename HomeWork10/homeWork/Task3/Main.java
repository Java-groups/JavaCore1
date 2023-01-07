package edu.homeworks.hw10.homeWork.Task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currency = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+(\\.)+\\d{2}");

        Matcher matcher = pattern.matcher(currency);
        while (matcher.find()){
            System.out.println(currency.substring(matcher.start(), matcher.end()));
        }



    }
 }
