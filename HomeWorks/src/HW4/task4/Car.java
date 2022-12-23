package HW4.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Car {
	private String type;
	private Integer yearOfProduction;
	private double engineCapacity;
	
	public Car() {}
	
	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
    
	public void setType(String type) {
		this.type = type; }
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction; }
	
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity; }
	
	public String getType() {
		return type; }
	
	public int getYearOfProduction() {
		return yearOfProduction; }
	
	public double getEngineCapacity() {
		return engineCapacity; }
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Car> cars = new ArrayList<>();
		    cars.add (new Car("Volkswagen Golf", 2010, 1.6));
		    cars.add (new Car("Subaru Forester", 2015, 2.5));
		    cars.add (new Car("Mitsubishi Outlander", 2018, 2.4));
		    cars.add (new Car("Toyota Prius", 2015, 1.5));
		    cars.add (new Car("Skoda Octavia", 2018, 2.0));
		
		
		System.out.print("Enter the year of production:\n"
				+ "'2010'\n"
				+ "'2015'\n"
				+ "'2018'\n");
		
        int yearOfProduction = Integer.parseInt(br.readLine());
        
        getByYearOfProduction(cars, yearOfProduction);
        getSort(cars);
        System.out.println(cars);
	}
		
	public static List<Car> getSort(List<Car> cars) {
		Collections.sort(cars, new CarComparator());
        return cars;
    }
    public static List<Car> getByYearOfProduction(List<Car> cars, Integer yearOfProduction) {
    	List<Car> byYear = new ArrayList<>();
    	for (int i = 0; i < cars.size(); i++) {
    		if (cars.get(i).getYearOfProduction() == yearOfProduction) {
    			byYear.add(cars.get(i));
    			System.out.println(cars.get(i));
    		}
    	} return byYear;
		
    }

	@Override
	public String toString() { 
	    return " Type: '" + type + "'\n Year of production: '" + yearOfProduction + "'\n Engine capacity: '" + engineCapacity + "'\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineCapacity, type, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Double.doubleToLongBits(engineCapacity) == Double.doubleToLongBits(other.engineCapacity)
				&& Objects.equals(type, other.type) && Objects.equals(yearOfProduction, other.yearOfProduction);
	} 
	
}
