package HW3.task1;

import java.util.*;

public class Task1 {
	
	public Task1() {}

	public List<Double> setFloat(Double firstNumber, Double secondNumber, Double thirdNumber) {

		List<Double> floatNumbers = new ArrayList<>();
		    floatNumbers.add(firstNumber);
			floatNumbers.add(secondNumber);
	        floatNumbers.add(thirdNumber);
		
		return floatNumbers;
	}
	
	public List<Integer> setInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		
		List<Integer> intNumbers = new ArrayList<>();
	        intNumbers.add(firstNumber);
		    intNumbers.add(secondNumber);
            intNumbers.add(thirdNumber);
            
        return intNumbers;
	}
	
	public Integer getMin(List<Integer> numbers) {
	    int minNumber = Integer.MAX_VALUE;

	    for (Integer number : numbers) {
	      if (number < minNumber) {
	        minNumber = number;
	      }
	    }
	    return minNumber;
	  }
	
	public Integer getMax(List<Integer> numbers) {
		int maxNumber = -1;

		for (Integer number : numbers) {
		    if (number > maxNumber) {
		        maxNumber = number;
		    }
		}
		return maxNumber;
	}
	
	public List<Boolean> checkFloat(List<Double> num) {
		List <Boolean> numbers = new ArrayList<>();
		
		for (int i = 0; i < num.size(); i++) {
		    if (num.get(i) >= -5 && num.get(i) <= 5) {
			    numbers.add(true);
			    System.out.println("Number " + num.get(i) + " is in range -5 to 5");
		    } else {
		    	numbers.add(false);
		    	System.out.println("Number " + num.get(i) + " is out of range!");
	        }
	    } 
		return numbers;
		
}
}
