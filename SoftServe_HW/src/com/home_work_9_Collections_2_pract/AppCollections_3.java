package com.home_work_9_Collections_2_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AppCollections_3
{
	public static void main(String[] args) throws IOException
	{
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

		try(BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)))
		{
			CreateEmployeeList.createEmployeeInstanceList(br_1, employeeMap);
			CreateEmployeeList.showEmployeeList(employeeMap);
			CreateEmployeeList.getIDsFromName(employeeMap, br_1).forEach(id -> System.out.println((int)id==0 ? "Employee ID not exist" : "Employee id: "+id)); 
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}