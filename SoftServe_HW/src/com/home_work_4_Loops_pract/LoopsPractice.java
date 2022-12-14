package com.home_work_4_Loops_pract;

import java.util.Scanner;

public class LoopsPractice 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int arr[] = {-1,-21,-17,-91,-4,2,3,8,7,9};

		System.out.println("\t\t\t HOME WORK 4 PRACTICAL TASK 1_1");
		System.out.println("Max value in array: " + CheckInput.getMax(arr));
		System.out.println("\t\t\t HOME WORK 4 PRACTICAL TASK 1_2");
		System.out.println("Sum of positive numbers in array: " + CheckInput.getSumOfPositive(arr));
		System.out.println("\t\t\t HOME WORK 4 PRACTICAL TASK 1_3");
		System.out.println("Amount of negative numbers in array: " + CheckInput.getAmountOfNeg(arr));
		System.out.println("\t\t\t HOME WORK 4 PRACTICAL TASK 1_4");
		System.out.println(CheckInput.getPosOrNeg(arr) ? "Positive." : "Negative.");
		System.out.println("\t\t\t HOME WORK 4 PRACTICAL TASK 2_1");

		Employee.createDogInstanceList(sc);

		Employee.getSortedList();

		Employee.getEmployeeByDepart(sc);

	}
}