package HM7.PracticalTask1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat()};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].feed());
            System.out.println(animals[i].voice());
        }
    }
}
