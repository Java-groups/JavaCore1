package HW1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the circle's radius to calculate perimeter and area: ");
		Integer radius = Integer.parseInt(br.readLine());
		
		Float perimeter = (float) (2 * 3.14 * radius);
		Float area = (float) (3.14 * (radius * radius));
		
		System.out.println("Entered radius: " + radius);
		System.out.println("Circle's perimeter is: " + perimeter);
		System.out.println("Circle's area is: " + area);
	}

}
