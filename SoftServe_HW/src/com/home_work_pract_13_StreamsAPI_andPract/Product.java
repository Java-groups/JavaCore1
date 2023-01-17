package com.home_work_pract_13_StreamsAPI_andPract;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product
{
	private String manufacture_category;
	private LocalDate date;
	private double price;
	private static int count;

	public Product(String manufacture_category)
	{
		this.manufacture_category = manufacture_category;
		count++;
	}
	public String getManufacture_category()
	{
		return manufacture_category;
	}
	public void setManufacture_category(String manufacture_category)
	{
		this.manufacture_category = manufacture_category;
	}
	public LocalDate getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	protected static void fillOutProductList(BufferedReader br, TreeMap<Integer, Product> new_product_list) throws IOException
	{
		boolean exit=false;
		String  in_manufacture_cat;
		String  in_product_date;
		double  in_product_price;
		String str;

	out: do
		{
			System.out.println("Please, to fill out the product list and add new product in it,\nenter manufacture category, date and then price, or word `exit` to quit without changes.");
			System.out.println("Please, enter manufacture category.");
			in_manufacture_cat = ( str = br.readLine() ).isEmpty() ? "empty" : str ;
			while(in_manufacture_cat.equals("empty")) 
			{
				System.out.println("Field is empty, please enter student Name, or word `exit` to quit.");
				continue out;
			}
			if( "exit".equals( in_manufacture_cat ))
			{
				exit = true;
			}
			else
			{									
					new_product_list.put(count, new Product(in_manufacture_cat));
			out_1: do
					{
						System.out.println("Please, enter product date in format dd-mm-yyyy.");
						try
						{
							in_product_date = ( str = br.readLine() ).isEmpty() ? "empty" : str ;
							new_product_list.get(count-1).setDate(in_product_date);
							break;
						}
						catch(DateTimeParseException e)
						{
							System.out.println("Was entered wrong date format, please enter date in format `day-month number-year`");
							continue out_1;
						}
					}while(true);
			 out_2: do
					{
					 	System.out.println("Please, enter product price.");
						try
						{
							in_product_price = checkInFormatDoubleOrExit(br);
							new_product_list.get(count-1).setPrice(in_product_price);
							break;
						}
						catch(IOException  e)
						{
							System.out.println("IOException in fillOutProductList method.");
							continue out_2;
						}
					}while(true);
			}
		}while(!exit);
	}
	
	protected static double checkInFormatDoubleOrExit(BufferedReader in) throws IOException
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter value greater than zero, or q for exit.");
			try 
			{
				if ("q".equals(in_word=in.readLine())) 
				{
					return -1;
				}
				else if(Double.parseDouble(in_word)>0)
				{
					return Double.parseDouble(in_word);
				}
				else 
				{
					Double.parseDouble("-1");
				}
			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}
	
	protected static List<Product> sortListByPrice(TreeMap<Integer, Product> new_product_list)
	{
		Stream<Product> sorted_stream = new_product_list.values().stream();
		List<Product> l;
		 l =sorted_stream.filter(t -> t.getManufacture_category().
				equalsIgnoreCase("Phone")).
				sorted(Comparator.comparingDouble(t -> t.getPrice())).
				filter(t -> t.getPrice()>3000).collect(Collectors.toList());
		 return l;
	}
	
	protected static void showProductList(TreeMap<Integer, Product> new_product_list)
	{
		new_product_list.forEach((k, v) -> 
			System.out.println(k + "." + " Category: " + v.getManufacture_category() + ";\tDate: " + v.getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyy"))  + ";\tPrice: " + v.getPrice()));
	}

}