package HW11.practical_tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		List<Plant> plants = new ArrayList<> ();
		

		try {
			plants.add(new Plant("Spruce", "Green", 35));
		} catch (ColorException | TypeException e) {
			e.printStackTrace();
		}
		try {
			plants.add(new Plant("Oak", "Orange", 280));
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			plants.add(new Plant("Hornbeam", "Green", 52));
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			plants.add(new Plant("Maple", "Blue", 76));
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			plants.add(new Plant("Aspen", "Green", 128));
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(plants);
	}

}
