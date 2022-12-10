package AllHomeWorks.Homework4.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void doTask(BufferedReader br) throws IOException {
        ArrayList<Car> carList = new ArrayList<>(
            Arrays.asList(
                new Car("Audi", 2005, 2),
                new Car("Ford", 2001, 2),
                new Car("Fiat", 2010, 2),
                new Car("Lada", 2001, 2)
            )
        );

        int yearOfProductionCar;
        ArrayList<String> modelsList = new ArrayList<>();


        yearOfProductionCar = Car.inputYearOfProduct(br);
        for (Car car: carList){

                if (yearOfProductionCar == car.getYearOfProduction()){
                    modelsList.add(car.getType());
            }
        }
        if (modelsList.size() > 0){
            System.out.println("Models cars for selected year:" +modelsList);

        }else{
            System.out.println("There are no cars of this year");

        }

        carList.sort(Comparator.comparingInt(Car::getYearOfProduction));
        System.out.println("Models cars for selected year:" + carList.stream().map(car -> car.getType() + ": " + car.getYearOfProduction()).toList());
    }
}
