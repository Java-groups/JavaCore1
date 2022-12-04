package AllHomeWorks.HomeWork2Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Employee {
    private String name;
    private int rate;
    private int hours;

    static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        String name = br.readLine();

        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Enter Name:");
            name = br.readLine();
        }
        this.setName(name);


        System.out.println("Enter Rate:");
        int rate = -1;
        try {
            rate = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ignored) {}
        while (rate < 0) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Hours:");
            try {
                rate = Integer.parseInt(br.readLine());
            } catch (NumberFormatException ignored) {}
        }
        this.setRate(rate);

        System.out.println("Enter Hours:");
        int hours = -1;
        try {
            hours = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {}

        while (hours < 0) {
            System.out.println("Incorrect Value!");
            System.out.println("Please input Hours:");
            try {
                hours = Integer.parseInt(br.readLine());
            } catch (NumberFormatException ignored) {}
        }
        this.setHours(hours);
    }

    public int getSalary() {
        return this.hours * this.rate;
    }

    public String toString() {

        return this.name + "  Rate: "
                + this.rate + " Hours:  "
                + this.hours + " Salary:  "
                + this.getSalary() + " Bonuses:  "
                + this.getBonuses();
    }

    public int getBonuses() {
        return Math.toIntExact((Math.round(this.getSalary() * 0.1)));
    }
}
