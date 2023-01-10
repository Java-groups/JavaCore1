package com.home_work_pract_11_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppExceptions
{
	public static void main(String[] args)
	{

		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\t\t\tPRACTICAL_TASK_11");
		int squareSides[] = new int[2];

		try 
		{
			squareSides = ExceptClass.enterIntValue(br_1);
			System.out.println(ExceptClass.squareRectangle(squareSides[0], squareSides[1]));
			br_1.close();
		} 
		catch (ArithmeticException | IOException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


		String color = "azure".toUpperCase();
		String type = "mOss".toUpperCase();

		try
		{
			
			
			System.out.println(Color.values()[Color.getColorNumber(color)].getColor()  );

			System.out.println(Type.values()[Type.getTypeNumber(type)].getPlant_type());

			double[] double_arr = CheckInput.enterDoubleValue(br_1);
			
			System.out.println("\t\t\tHOWE_WORK_11");
			
			System.out.println(CheckExcept.div(double_arr[0], double_arr[1]));

			int int_arr[] = CheckInput.enterIntValue(br_1);

			CheckInput.readNumber(int_arr, 0, 100);

		}
		catch(ColorException | TypeException | NotInRangeExcept | ArithmeticException | IOException e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				br_1.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}