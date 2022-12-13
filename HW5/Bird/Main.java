import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle("Eagle feathers", "Eagle lays eggs"),
                new Penguin("Penguin feathers", "Penguin lays eggs"),
                new Swallow("Swallow feathers", "Swallow lays eggs"),
                new Chicken("Chicken feathers", "Chicken lays eggs")
        };
        for (Bird bird : birds) {
            bird.fly();
            out.println(bird.getFeathers() + ". " + bird.getLayEggs() + ".");
        }
    }
}