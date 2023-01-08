package HM11.PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant("rose", "blue", 50);
            System.out.println(plants[0]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }

        try {
            plants[1] = new Plant("tulip", "red", 35);
            System.out.println(plants[1]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }

        try {
            plants[2] = new Plant("car", "black", 500);
            System.out.println(plants[2]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }

        try {
            plants[3] = new Plant("rose", "orange", 50);
            System.out.println(plants[3]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }

        try {
            plants[4] = new Plant("gardenia", "white", 70);
            System.out.println(plants[4]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
