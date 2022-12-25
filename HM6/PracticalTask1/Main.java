package HM6.PracticalTask1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat()};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].feed());
            System.out.println(animals[i].voice());
        }
    }
}
