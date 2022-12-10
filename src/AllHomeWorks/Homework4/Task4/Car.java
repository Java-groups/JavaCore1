package AllHomeWorks.Homework4.Task4;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
    private String type;
    private int yearOfProduction;
    private  int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter Type of car::");
        String type = br.readLine();

        while (type.isEmpty()) {
            System.out.println("Type of car cannot be empty. Enter Type:");
            type = br.readLine();
        }
        this.setType(type);

    System.out.println("Enter year of production car:");
    int yearOfProduction = -1;
    boolean enteredFloat = false;
        try {
            yearOfProduction = Integer.parseInt(br.readLine());
        enteredFloat = true;

    } catch (NumberFormatException ignored) {}
        while (!enteredFloat) {
        System.out.println("Incorrect Value!");
        System.out.println("Please input year of production car:");
        try {
            yearOfProduction = Integer.parseInt(br.readLine());
            enteredFloat = true;

        } catch (NumberFormatException ignored) {}
    }
        this.setYearOfProduction(yearOfProduction);

        System.out.println("Enter engine capacity:");
        int engineCapacity = -1;
        enteredFloat = false;

        try {
            engineCapacity = Integer.parseInt(br.readLine());
        enteredFloat = true;

    } catch (NumberFormatException e) {}

        while (!enteredFloat) {
        System.out.println("Incorrect Value!");
        System.out.println("Please input engine capacity:");
        try {
            engineCapacity = Integer.parseInt(br.readLine());
            enteredFloat = true;

        } catch (NumberFormatException ignored) {}
    }
        this.setEngineCapacity(engineCapacity);
}

public static int inputYearOfProduct (BufferedReader br) throws IOException{
    System.out.println("***********************");
    System.out.println("Enter year of production car:");
    int yearOfProduction = -1;
    boolean enteredFloat = false;
    try {
        yearOfProduction = Integer.parseInt(br.readLine());
        enteredFloat = true;

    } catch (NumberFormatException ignored) {}
    while (!enteredFloat) {
        System.out.println("Incorrect Value!");
        System.out.println("Please input year of production car:");
        try {
            yearOfProduction = Integer.parseInt(br.readLine());
            enteredFloat = true;

        } catch (NumberFormatException ignored) {}
    }
   return yearOfProduction;
}
}
