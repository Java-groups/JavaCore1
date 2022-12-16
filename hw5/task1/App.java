package hw5.task1;

public class App {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle("Golden feathers", 2),
                new Swallow("Black and white feathers", 5),
                new Penguin("Black and white feathers", 2),
                new Chicken("Red feathers", 100)};

        for (Bird el : birds) {
            el.fly();
            System.out.println(el.toString());
        }
    }
}
