package HW3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task1 {
	
	Float numberOne;
	Float numberTwo;
	Float numberThree;
	
	List<Integer> intNumbers = new ArrayList<>();
	
	public Task1() {}

	public Task1(Float numberOne, Float numberTwo, Float numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
	}
	
	public Task1(Integer args) {
		this.intNumbers.add(args);
	}

	public void setFloat() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first float number: ");
		this.numberOne = Float.parseFloat(br.readLine());
		
		System.out.println("Enter second float number: ");
		this.numberTwo = Float.parseFloat(br.readLine());
		
		System.out.println("Enter third float number: ");
		this.numberThree = Float.parseFloat(br.readLine());
	}
	
	public void setInteger() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first integer number: ");
		this.intNumbers.add(Integer.parseInt(br.readLine()));
		
		System.out.println("Enter second integer number: ");
		this.intNumbers.add(Integer.parseInt(br.readLine()));
		
		System.out.println("Enter third integer number: ");
		this.intNumbers.add(Integer.parseInt(br.readLine()));
	}
	
	private static Integer findMin(List<Integer> numbers) {
	    int minNumber = Integer.MAX_VALUE;

	    for (Integer number : numbers) {
	      if (number < minNumber) {
	        minNumber = number;
	      }
	    }
	    return minNumber;
	  }
	
	private static Integer findMax(List<Integer> numbers) {
		int maxNumber = -1;

		for (Integer number : numbers) {
		    if (number > maxNumber) {
		        maxNumber = number;
		    }
		 }
		 return maxNumber;
	}
	
	public void getMinMax() {
		System.out.println("The bigest number is " + findMax(intNumbers));
		System.out.println("The smallest number is " + findMin(intNumbers));
	}
	
	public void checkFloat() {
		if (numberOne >= -5 && numberOne <= 5) {
			System.out.println("Number " + numberOne + " is in range -5 to 5");
		} else { System.out.println("Number " + numberOne + " is out of range!");}
		
		if (numberTwo >= -5 && numberTwo <= 5) {
			System.out.println("Number " + numberTwo + " is in range -5 to 5");
		} else { System.out.println("Number " + numberTwo + " is out of range!");}
		
		if (numberThree >= -5 && numberThree <= 5) {
			System.out.println("Number " + numberThree + " is in range -5 to 5");
		} else { System.out.println("Number " + numberThree + " is out of range!");}
	}

}
