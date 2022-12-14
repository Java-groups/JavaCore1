package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork4;


//        Create class Car with fields type, year of production and engine capacity.
//        Create and initialize four instances of class Car.
//        Display cars
//          certain model year  (enter year in the console);
//          ordered by the field year.

import helper.Reader;
import java.time.YearMonth;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private YearMonth ym = YearMonth.now();

    static void displayFirstCarInfo(){
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("On January 29, 1886, Carl Benz applied for a patent for his “vehicle powered by a gas engine.”\n" +
                           "The patent – number 37435 – may be regarded as the birth certificate of the automobile.\n" +
                           "For details: https://group.mercedes-benz.com/company/tradition/company-history/1885-1886.html");
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    static Reader reader = new Reader();

    private CarType type;
    private int productionYear;
    private int engineCapacity;

    public Car(CarType type, int productionYear, int engineCapacity) {
        this.type = type;
        setProductionYear(productionYear);
        this.engineCapacity = engineCapacity;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear >= 1886 && productionYear <= ym.getYear()){
            this.productionYear = productionYear;
        }
        if (productionYear <= 1886){
            System.out.println("\nOh no, the first car is registered only in 1886 year.\nThe value for this instance automatically set to 1886.");
            displayFirstCarInfo();
            this.productionYear = 1886;
        }
        if (productionYear > ym.getYear()){
            this.productionYear = ym.getYear();
            System.out.println("Is it some future concept car? This class supports only existing models.\n" +
                    "production year automatically set to "+ ym.getYear());
        }
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return  "type: " + type + ", productionYear: " + productionYear +
                ", engineCapacity: " + engineCapacity + "hp";
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity<0){
            System.out.println("No way! Engine capacity can`t be less than 0. It automatically set to 0.\n" +
                               "It means that your car is out of order.");
            this.engineCapacity = 0;
        }
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear &&
                engineCapacity == car.engineCapacity &&
                type == car.type;
    }

    @Override
    public int compareTo(Car o) {
        return  o.productionYear - this.productionYear;
    }
}
