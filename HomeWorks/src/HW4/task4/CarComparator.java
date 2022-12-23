package HW4.task4;

import java.util.Comparator;

public class CarComparator  implements Comparator <Car> {

	@Override
	public int compare(Car firstCar, Car secondCar) {
		return Integer.compare(firstCar.getYearOfProduction(), secondCar.getYearOfProduction());
	}

}
