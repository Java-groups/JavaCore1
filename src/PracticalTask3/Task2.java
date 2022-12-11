package PracticalTask3;

import java.util.Scanner;

import static java.lang.System.*;

// Enter the name of the country. Print the name of the continent (Declare enum with names of continents)
public class Task2 {

    public enum Continent {
        EURASIA, AMERICA, AFRICA, AUSTRALIA, ANTARCTICA
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(in);
        out.println("Input name country: ");
        String country = scanner.nextLine();
        switch (country) {
            case "Ukraine", "Italy", "Poland" -> out.print(Continent.EURASIA);
            case "Canada", "PMexico", "USA" -> out.print(Continent.AMERICA);
            case "Nigeria", "Egypt", "Congo" -> out.print(Continent.AFRICA);
            case "Australia" -> out.print(Continent.AUSTRALIA);
            case "no country" -> out.print(Continent.ANTARCTICA);
            default -> out.println("We not know this country (((");
        }


    }
}
