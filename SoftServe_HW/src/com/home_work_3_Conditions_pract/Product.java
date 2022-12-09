package com.home_work_3_Conditions_pract;

import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class Product
{
	private String name;
	private double price;
	private double quantity;

	Product() 
	{
		
	}

	Product(String name) 
	{
		this.name = name;
	}

	public Product(double price, double quantity) 
	{
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	private static HashMap<String, Product> name_list = new HashMap<String, Product>();
	private static HashMap<String, Double> name_price = new HashMap<String, Double>();
	private static  HashMap<String, Double> name_quantity = new HashMap<String, Double>();

	public void fillOutProductList(Scanner sc)
	{
		boolean exit;
		String  in_product_name;
		double  in_product_price;
		double  in_product_quantity;

		do
		{
			System.out.println("Please, to fill out the product list and add new product in it, enter name, price and then quntity of product, or word `exit` to quit without changes.");

			if("exit".equals(in_product_name=sc.next())) 
			{
				exit=true;
			}
			else
			{
				name_list.put(in_product_name, new Product(in_product_name));

				do 
				{
					System.out.println("Please, enter price of new product.");
					in_product_price=CheckCondition.checkInFormatDoubleOrExit(sc);
				}while(in_product_price != -1 & in_product_price < 0);
				
				if(in_product_price > 0) 
				{
					name_list.get(in_product_name).setPrice(in_product_price);
				}

				do 
				{
					System.out.println("Please, enter quantity of new product.");
					in_product_quantity=CheckCondition.checkInFormatDoubleOrExit(sc);
				}while(in_product_quantity != -1 & in_product_quantity < 0);
				
				if(in_product_quantity > 0) 
				{
					name_list.get(in_product_name).setQuantity(in_product_quantity);
				}

				exit=false;
			}
		}while(!exit);
	}

	private static void buffer(){

		name_list.forEach((key,value) -> 
		{
			name_price.put(key, value.getPrice());
		}); 
		name_list.forEach((key,value) -> 
		{
			name_quantity.put(key, value.getQuantity());
		});
	}

	public void getPrices() 
	{
		name_price.forEach((k,v)-> {System.out.println("name: " + k + "; " + "price: " + v + ";");});
	}

	public void getQuantities() 
	{
		name_quantity.forEach((k,v)-> {System.out.println("name: " + k + "; " + "quantity: " + v + ";");});
	}

	public String getMaxPriceProduct() 
	{
		buffer();
		double maxValue = Collections.max(name_price.values());
		String maxPriceStr="";
		
		for(Map.Entry<String,Double> m : name_price.entrySet()) 
		{
			if(m.getValue() == maxValue) 
			{
				maxPriceStr =  "product name: " + m.getKey() + "; max price: " + maxValue + ";";
			}
		}
		return maxPriceStr;
		
	}

	public String getMaxQuantityProduct() 
	{
		buffer();
		double maxQuntity = Collections.max(name_quantity.values());
		String maxQuantityStr="";
		
		for(Map.Entry<String,Double> m : name_quantity.entrySet()) 
		{
			if(m.getValue() == maxQuntity) 
			{
				maxQuantityStr =  "product name: " + m.getKey() + "; max quantity: " + maxQuntity + ";";
			}
		}
		return maxQuantityStr;
		
	}

}
