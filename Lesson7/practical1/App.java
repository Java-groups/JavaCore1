package Lesson7.practical1;

public class App {
    public static void main(String[] args) {
        Animals[] animals = new Animals[]{
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };
        for (Animals el : animals) {
            el.voice();
            el.feed();
        }
    }
}
