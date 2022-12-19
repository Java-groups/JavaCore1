package com.home_work_5_OOP_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HW_OOP_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Object> bird_list = new HashMap<Integer, Object>();

		CreateBirdList.createBirdList(br_1, bird_list);

		Developer dev1 = new Developer(br_1, "Developer", "Junior developer");

		System.out.println(dev1.report());

		br_1.close();
	}
}