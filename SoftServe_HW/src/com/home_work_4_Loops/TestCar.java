package com.home_work_4_Loops;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.junit.Test;

public class TestCar 
{

	Scanner sc1 = new Scanner(System.in);
	BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

	@Test
	public void TESTcreateCarInstanceList() throws Exception
	{

		try
		{
			Car.createCarInstanceList(br_1, Loops_HW.car_map_list );
			int getCarYear = Loops_HW.car_map_list.get(0).getCar_year();
			double getEngineCapacity = Loops_HW.car_map_list.get(0).getEngine_capacity();
			double testEngineCapacity = 1.2;
			assertEquals(12, getCarYear);
			assertEquals(testEngineCapacity, getEngineCapacity);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			br_1.close();
		}

		sc1.close();
	}

}