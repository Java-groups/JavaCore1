package HW5.OOP1.Bird;

public class MainBird {
    public static void main(String[] args) {

        Bird[] birds = new Bird[8];
        birds[0] = new Chicken("Semiplumes", "4 - 7", "nonflying");
        birds[1] = new Chicken("Down", "3 - 5", "nonflying");
        birds[2] = new Eagle("Flight", "2 - 3", "flying");
        birds[3] = new Eagle("Contour", "3 - 4", "flying");
        birds[4] = new Penguin("Down ", "1 - 2", "nonflying");
        birds[5] = new Penguin("Bristle", "2 - 3", "nonflying");
        birds[6] = new Swallow("Filoplumes", "4 - 5", "flying");
        birds[7] = new Swallow("Semiplumes", "3 - 4", "flying");

        for (Bird bird : birds) {
            bird.fly();
        }
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
