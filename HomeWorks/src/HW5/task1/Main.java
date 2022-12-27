package HW5.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Bird> birds = new ArrayList<>();
		birds.add(new Eagle(true, true));
		birds.add(new Swallow(true, true));
		birds.add(new Penguin(true, false));
		birds.add(new Chicken(true, false));

		birds.forEach(bird -> System.out
				.println("\n" + bird.toString() + bird.Fly() + "\n" + "Lay eggs: " + bird.getLayEgg()));
	}

}
