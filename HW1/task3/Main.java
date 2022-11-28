package com.edu.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// the input data of the first call
		System.out.println("What is the cost of a call minute from the first country?");
		Integer firstcall = Integer.parseInt(br.readLine());
		
		System.out.println("What is the call time from the first country?");
		Integer firstcalltime = Integer.parseInt(br.readLine());
		
		// the input data of the second call
		System.out.println("What is the cost of a call minute from the second country?");
		Integer secondcall = Integer.parseInt(br.readLine());
		
		System.out.println("What is the call time from the second country?");
		Integer secondcalltime = Integer.parseInt(br.readLine());
		
		// the input data of the third call
		System.out.println("What is the cost of a call minute from the third country?");
		Integer thirdcall = Integer.parseInt(br.readLine());
		
		System.out.println("What is the call time from the third country?");
		Integer thirdcalltime = Integer.parseInt(br.readLine());
		
		
		System.out.println("First call price is: " + (firstcall * firstcalltime));
		System.out.println("Second call price is: " + (secondcall * secondcalltime));
		System.out.println("Third call price is: " + (thirdcall * thirdcalltime));

	}

}
