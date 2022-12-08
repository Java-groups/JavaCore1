package HM3.PracticalTasks.PracticalTask3;

import java.util.Scanner;

public class Main {

    public enum Continents {
        Asia, Africa, Europe, NorthAmerica, SouthAmerica, Australia, Antarctica
    }

    public static void main(String[] args) {
        System.out.println("Enter the country name");

        Scanner sc = new Scanner(System.in);
        String country = sc.next();

        var result = switch (country) {
            case "Ukraine", "Poland", "Germany", "Spain" -> Continents.Europe;
            case "USA", "Canada" -> Continents.NorthAmerica;
            case "Australia" -> Continents.Australia;
            default -> "Couldn't recognize such a country";
        };
        System.out.println(result);
    }
}
