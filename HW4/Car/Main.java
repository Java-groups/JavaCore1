import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car[] cars = new Car[4];
        out.println("Please enter engines' capacities: ");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("type"+(i+1), 1500+i);
            out.print((i+1)+" : ");
            cars[i].setYearOfProduction(parseInt(br.readLine()));
        }
        Car tmp;
        for (int i = 0; i < cars.length-1; i++){
            for (int j = i+1; j < cars.length; j++) {
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            out.println(cars[i].getYearOfProduction());
        }
    }
}