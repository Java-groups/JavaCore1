package com.softserve.practicaltask.pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatementPractical {
    private float a;
    private float b;
    private float c;
    private int i;

    private int dayNumber;
    private String dayName;
    private String dayNameUA;
    private String country;
    private Continents continents;


    public static void main(String[] args) throws IOException {
        ConditionalStatementPractical cs = new ConditionalStatementPractical();
        cs.oddNumbers();
        cs.dayOfTheWeek();
        cs.continentCountry();
    }

    public void oddNumbers() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 1st number: ");
        a = Float.parseFloat(bf.readLine());
        System.out.println("Input 2nd number: ");
        b = Float.parseFloat(bf.readLine());
        System.out.println("Input 3rd number: ");
        c = Float.parseFloat(bf.readLine());
        if (a % 2 == 0) {
            i++;
        }
        if (b % 2 == 0) {
            i++;
        }
        if (c % 2 == 0) {
            i++;
        }
        System.out.println("Count of odd numbers is: " + i + "\n");
    }

    public void dayOfTheWeek() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter day of the week number: ");
        dayNumber = Integer.parseInt(br.readLine());
        switch (dayNumber) {
            case 1: dayName = "Monday"; dayNameUA = "Понеділок";
                break;
            case 2: dayName = "Tuesday"; dayNameUA = "Вівторок";
                break;
            case 3: dayName = "Wednesday"; dayNameUA = "Середа";
                break;
            case 4: dayName = "Thursday"; dayNameUA = "Четвер";
                break;
            case 5: dayName = "Friday"; dayNameUA = "П'ятниця";
                break;
            case 6: dayName = "Saturday"; dayNameUA = "Субота";
                break;
            case 7: dayName = "Sunday"; dayNameUA = "Неділя";
                break;
            default: dayName = "There is no day in the week with your number";
        }
        System.out.println("Your day name is: " + dayName + "\n" + dayNameUA);
    }

    public enum Continents {
        EUROPE, ASIA, AFRICA, AUSTRALIA, NORTHAMERICA, SOUTHAMERICA, ANTARCTICA
    }

    public void continentCountry() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter country name: ");
        country = bf.readLine();
        switch (country) {
            case "Ukraine": continents = Continents.EUROPE;
            break;
            case "USA": continents = Continents.SOUTHAMERICA;
            break;
            default:
                System.out.println("No such country in the world!");
        }
        System.out.println(continents);
    }
}