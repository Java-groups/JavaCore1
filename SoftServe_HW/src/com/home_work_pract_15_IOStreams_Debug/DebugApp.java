package com.home_work_pract_15_IOStreams_Debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DebugApp
{
	public static void main(String[] args)
	{
		int countCharacters = 0;
		String testWord;
		String inWord;
		String character = "";
		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input word.");
		try
		{
			testWord = br_1.readLine();
			System.out.println("Input character.");
			inWord = br_1.readLine();
			for (int i = 0; i < testWord.length(); i++)
			{
				character = (String) testWord.subSequence(i, i+1);
				if(character.equals(inWord)) countCharacters++;
			}
			System.out.println("There are character " + 
								inWord + 
								" " + 
								countCharacters + 
								" times in the world " + 
								testWord);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}