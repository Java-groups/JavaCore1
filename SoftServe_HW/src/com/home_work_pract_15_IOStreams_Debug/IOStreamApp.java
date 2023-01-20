package com.home_work_pract_15_IOStreams_Debug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class IOStreamApp
{
	public static void main(String[] args)
	{
		String fileName = "mytext.txt";
		String fileName_1 = "mytext1.txt";
		String fileName_2 = "mytext2.txt";
		String fileName_3 = "myfile.txt";
		String fileName_4 = "mytext3.txt";
		String fileName_5 = "mytext4.txt";

		int count = 0;
		int lines = 0;

		System.out.println();
		System.out.println("\t\t\tPractical_task_1");
		System.out.println();

		try( BufferedReader br_1 = new BufferedReader( new FileReader(fileName) ))
		{
			count=0;
			lines = (int) Files.lines(Paths.get(fileName)).count();
			String[] fileContent = new String[lines];
			int[] charsInString = new int[lines];

			while(br_1.ready())
			{
				fileContent[count] = br_1.readLine();
				charsInString[count] = fileContent[count].length(); 
				System.out.println(fileContent[count]);
				count++;
			}

			System.out.println("Longest line: " + Arrays.stream(charsInString).max().toString());
			System.out.println("Shortest line: " + Arrays.stream(charsInString).min().toString());

			for(String str : fileContent)
			{
				if(str.contains("var")) System.out.println(str);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("\t\t\tPractical_task_2");
		System.out.println();

		try( BufferedReader br_1 = new BufferedReader( new FileReader(fileName_1) ))
		{
			lines = (int) Files.lines(Paths.get(fileName)).count();

			while(br_1.ready())
			{
				for(String word : br_1.readLine().split(" "))
				{
					if( word.startsWith("a") | 
						word.startsWith("e") | 
						word.startsWith("i") | 
						word.startsWith("o") | 
						word.startsWith("u") |
						word.startsWith("A") | 
						word.startsWith("E") | 
						word.startsWith("I") | 
						word.startsWith("O") | 
						word.startsWith("U") 
					   ) 
						System.out.println(word);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try( BufferedReader br_1 = new BufferedReader( new FileReader(fileName_1) ))
		{
			lines = (int) Files.lines(Paths.get(fileName)).count();
			String[] fileContent;
			String str;

			while(br_1.ready())
			{
				str = br_1.readLine();
				fileContent = str.split(" ");

				for(int i=1; i < str.split(" ").length; i++)
				{
					if(Character.valueOf(fileContent[i-1].charAt(fileContent[i-1].length()-1)).equals(fileContent[i].charAt(0)))
						System.out.println(fileContent[i-1] + " : " + fileContent[i]);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("\t\t\tHome_work_task_1");
		System.out.println();

		try( BufferedReader br_1 = new BufferedReader( new FileReader(fileName_2) ))
		{
			count=0;
			lines = (int) Files.lines(Paths.get(fileName_2)).count();
			String[] fileContent = new String[lines];
			int[] charsInString = new int[lines];

			while(br_1.ready())
			{
				
				fileContent[count] = br_1.readLine();
				charsInString[count] = fileContent[count].length();
				count++;
			}

			Path outFilePath = Paths.get("src/myfile.txt");

			if(Files.exists(outFilePath))
			{
				System.out.println("File exist.");
			}
			else
			{
				try
				{
					Files.createFile(outFilePath);
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				System.out.println("File created.");
			}

			try (BufferedWriter bw_1 = new BufferedWriter(new FileWriter(fileName_3)))
			{
				bw_1.write(String.valueOf(fileContent.length));
				bw_1.newLine();
				bw_1.write(String.valueOf(Arrays.stream(charsInString).max().getAsInt()));
				bw_1.newLine();
				bw_1.write("Oleksii, birth date: 17.07.1989.");
				bw_1.newLine();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("\t\t\tHome_work_task_2");
		System.out.println();

		try( BufferedReader br_1 = new BufferedReader( new FileReader(fileName_4) ))
		{
			lines = (int) Files.lines(Paths.get(fileName_4)).count();
			String str;

			Path outFilePath = Paths.get("src/mytext4.txt");

			if(Files.exists(outFilePath))
			{
				System.out.println("File exist.");
			}
			else
			{
				try
				{
					Files.createFile(outFilePath);
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				System.out.println("File created.");
			}

			try (BufferedWriter bw_1 = new BufferedWriter(new FileWriter(fileName_5))) 
			{
				while(br_1.ready())
				{
					str = br_1.readLine();
					str = str.replace("public", "private");

					bw_1.write(str);
					bw_1.newLine();
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}