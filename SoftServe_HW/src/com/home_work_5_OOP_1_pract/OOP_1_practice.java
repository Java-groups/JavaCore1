package com.home_work_5_OOP_1_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class OOP_1_practice 
{
	public static void main(String[] args) throws IOException
	{

	    BufferedReader sc1 = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Car> car_list = new HashMap<Integer, Car>();
		HashMap<Integer, Object> line_list = new HashMap<Integer, Object>();

		CreateCarList.createCarList(sc1, car_list);
		CreateLineList.createLineList(sc1, line_list);

		sc1.close();
	}
}