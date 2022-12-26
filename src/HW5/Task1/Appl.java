package HW5.Task1;

public class Appl {


	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("gray", "1-2 eggs");
		birds[1] = new Swallow("dark, glossy-blue", "4-5 eggs");
		birds[2] = new Penguin("dark black-brown", "2 eggs");
		birds[3] = new Chicken("golden brown", "1 egg a day");

		for (int i = 0; i < birds.length; i++) {
			//bird[i].fly();
			//bird[i].toString();
			birds[i].fly();
			System.out.println(birds[i].toString());
		}

	}

}