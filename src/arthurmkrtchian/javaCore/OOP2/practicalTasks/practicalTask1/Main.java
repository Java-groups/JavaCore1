package arthurmkrtchian.javaCore.OOP2.practicalTasks.practicalTask1;


//        Create interface Animal with methods voice() and feed().
//        Create two classes Cat and Dog, which implement this interface.
//        Create array of Animal and add some Cats and Dogs to it.
//        Call voice() and feed() method for all of it



public class Main {

    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Barsik", 2),
                new Dog("Sharik", 5),
                new Dog("Mukhtar", 3),
                new Cat("Luna", 7)
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println();
            animals[i].voice();
            animals[i].feed();
        }
    }

}
