package PracticalTasks.Task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (int i = 0;i < animals.length; i++) {

            System.out.println(animals[i].voise());
            System.out.println(animals[i].feed());

        }
    }
}
