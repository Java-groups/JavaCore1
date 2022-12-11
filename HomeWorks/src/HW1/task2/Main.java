package HW1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What's your name?");
		String name = br.readLine();
		System.out.println("Where are you from, " + name + "?");
		String adress = br.readLine();
		System.out.println(name + ", you are from " + adress + ".");
	}

}
