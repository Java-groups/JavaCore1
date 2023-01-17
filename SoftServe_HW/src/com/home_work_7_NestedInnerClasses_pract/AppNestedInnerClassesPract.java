package com.home_work_7_NestedInnerClasses_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AppNestedInnerClassesPract
{
	public static void main(String[] args) throws IOException
	{
		HashMap<Integer, Department> departments_map = new HashMap<Integer, Department>();

		try(BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)))
		{
			Department.createDepartmentList(br_1, departments_map);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}