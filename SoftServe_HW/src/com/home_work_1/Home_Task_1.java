package com.home_work_1;

import java.util.Scanner;

public class Home_Task_1 
{
	public static void main(String[] args) 
	{
		Scanner in_stream_scanner_1 = new Scanner(System.in);
		boolean exit=false;
		double radius;
		String in_word;
		
		System.out.println("\t \t HOME WORK 1 TASK 1");
		System.out.println("Flower bed is shaped like a circle. For calculating perimeter and area, please enter the radius: ");
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next()))
				{
					exit=true;
				}
				else 
				{
					radius = Double.parseDouble(in_word);
					System.out.println("If flower bed radius is: " + String.format("%8.4f", radius)  + "\nPerimeter is: " + String.format("%8.4f", 2*Math.PI*radius) + "\nArea is: " + String.format("%8.4f", Math.PI*Math.pow(radius, 2)));
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);
		
		
		
		System.out.println("\n\t \t HOME WORK 1 TASK 2");
		
		String name, 
			   address;
		
		
		System.out.println("What is your name?");
		name=in_word=in_stream_scanner_1.next();
		System.out.println("Where are you live, "+ name + "?");
		address=in_word=in_stream_scanner_1.next();
		System.out.println("Hello, I am " + name + " and I live in " + address + ".");
		
		
		
		System.out.println("\n\t \t HOME WORK 1 TASK 3");
		
		double c1=0,
				c2=0,
				c3=0,
				t1=0,
				t2=0,
				t3=0,
				res_cost;



		System.out.println("Please, enter phone calls costs of three different countries.");

		System.out.print("Enter phone call cost of 1st country, c1: ");
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					c1=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of c1, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);
		
		System.out.print("Enter phone call time of 1st country, t1: ");
		
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					t1=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of t of c11, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);

		System.out.print("Enter phone call cost of 2d country, c2: ");
		
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					c2=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of c2, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);
		
		
		System.out.print("Enter phone call time of 2d country, t2: ");
		
		
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					t2=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of t2, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);
		

		System.out.print("Enter phone call cost of 3d country, c3: ");
				
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					c3=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of c3, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);
		
		System.out.print("Enter phone call time of 3d country, t3: ");
		
		
		do 
		{
			try 
			{
				if ("exit".equals(in_word=in_stream_scanner_1.next())) 
				{
					exit=true;
				}
				else 
				{
					t3=Double.parseDouble(in_word);
					exit=true;
				}
			}
			catch(NumberFormatException exc) 
			{
				System.out.println("Please, enter numeric value of t3, or for exit enter word: exit.");
				exit=false;
			}
		}while(!exit);

		res_cost=c1*t1+c2*t2+c3*t3;

		System.out.println("Phone call cost of 1st country is: " + String.format("%4.4f",c1*t1) + 
							"\nPhone call cost of 2d country is: " + String.format("%4.4f",c2*t2) + 
							"\nPhone call cost of 3d country is: " + String.format("%4.4f",c3*t3));
		System.out.println("Cost of all phone calls is: " + String.format("%4.4f",res_cost));

		in_stream_scanner_1.close();

	}
}
