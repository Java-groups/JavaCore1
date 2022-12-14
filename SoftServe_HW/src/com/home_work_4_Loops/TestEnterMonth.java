package com.home_work_4_Loops;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class TestEnterMonth
{
	Scanner sc1 = new Scanner(System.in);

/*

	@Test
	public void TESTcreateMonthDaysList()
	{
		int[] arr = { 31, 30, 29, 31, 30, 29, 31, 30, 29, 31, 30, 29 };
		int [] arr1 = EnterMonth.createMonthDaysList(sc1);
		Assert.assertArrayEquals(arr, arr1);
		sc1.close();
	}

	@Test
	public void TESTfillOutValuesArr()
	{
		int [] arr = { 1,2,3,4,5 };
		int [] arr1 = EnterMonth.fillOutValuesArr(sc1, 5);
		Assert.assertArrayEquals(arr, arr1);
	}

	@Test
	public void TESTifFirstElementsPositive()
	{
		int [] arr = { 1,2,3,4,5 };
		int [] arr1 = EnterMonth.fillOutValuesArr(sc1, 5);
	}

*/

	@Test
	public void TESTnumbSecPositInArr()
	{
		int [] arr = { -1,-2,3,4,5,6,7,8,9 };
		int testPosition = EnterMonth.numbSecPositInArr(arr);
		int position = 3;
		assertEquals(position, testPosition);
	}

	@Test
	public void TESTgetMin() 
	{
		int [] arr = { 5,4,3,1,4,5 };
		int min = EnterMonth.getMin(arr);
		int minTest = 1;
		assertEquals(minTest, min);
	}

	@Test
	public void TESTgetMinPosition()
	{
		int [] arr = { 5,4,7,1,4,5 };
		int min = EnterMonth.getMinPosition(arr);
		int minPos = 3;
		assertEquals(minPos, min);
	}

	@Test
	public void TESTgetProdOfAllEven()
	{
		int [] arr = { 5,4,3,1,4,5 };
		int prodEven = EnterMonth.getProdOfAllEven(arr);
		int prodEvenTest = 16;
		assertEquals(prodEven, prodEvenTest);
	}
	
	

}