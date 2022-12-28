package arthurmkrtchian.javaCore.HW3.conditionStatements.practicalTasks.practicalTask3;

import helper.Reader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        System.out.println("Hello! Let`s find out in what continent is some countries");
        System.out.print("Type the name of country here: ");
        String search = reader.readCleanString();

        switch (search){
            case "ukraine":
            case "germany":
            case "spain":
            case "italy":
            case "france":
                System.out.println("Located in " + Continents.EUROPE.toString());
                break;
            case "armenia":
            case "india":
            case "china":
                System.out.println("Located in " + Continents.ASIA.toString());
                break;
            case "usa":
            case "unitedstatesofamerica":
            case "mexico":
            case "canada":
                System.out.println("Located in " + Continents.NORTH_AMERICA.toString());
                break;
            case "algeria":
            case "egypt":
                System.out.println("Located in " + Continents.AFRICA.toString());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + search); //сама IDE підказала.

        }
    }
}