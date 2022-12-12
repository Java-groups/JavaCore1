package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Car {

    private String type;
    private int yearOfProduction;
    private String engineCapacity;
    private static final int qty = 2;
    public static Car[] car = new Car[qty];
    public Car () {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return " Car {" +
                "type = '" + type + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", engineCapacity = '" + engineCapacity + '\'' +
                '}' + "\n";
    }

    public void inputCar(BufferedReader br, int i) throws IOException {
        System.out.println("input car" + (i+1) +" :");
        System.out.print("type: ");
        this.type = br.readLine();
        System.out.print("yearOfProduction: ");
        this.yearOfProduction = Integer.parseInt(br.readLine());
        System.out.print("engineCapacity: ");
        this.engineCapacity = br.readLine();
    }

    public static void createCar(BufferedReader br, Car[] car) throws IOException {

        for (int i =0; i < car.length; i++) {
            car[i] = new Car();
            car[i].inputCar(br, i);
        }
        //System.out.println(Arrays.toString(car));
    }

    public static void orderedFieldYear(Car[] car) {
        Car tmp;
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(car));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        createCar(br, car);

        orderedFieldYear(car);
    }
}
