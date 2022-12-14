package com.home_work_4_Loops;

import static org.junit.Assert.*;

import java.util.Scanner;
import org.junit.Test;

public class TestCar 
{

	Scanner sc1 = new Scanner(System.in);

	@Test
	public void TESTcreateCarInstanceList() throws Exception
	{
		Car.createCarInstanceList(sc1, Loops_HW.car_map_list );
		int getCarYear = Loops_HW.car_map_list.get(0).getCar_year();
		double getEngineCapacity = Loops_HW.car_map_list.get(0).getEngine_capacity();
		double testEngineCapacity = 1.2;
		assertEquals(12, getCarYear);
		assertEquals(testEngineCapacity, getEngineCapacity);

		sc1.close();
	}

}