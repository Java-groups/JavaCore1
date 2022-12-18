package HM5.HomeWorkTask1;

//Task description
//        Develop abstract class Bird with attributes feathers and layEggs and an abstract method fly().
//        Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//        Create array Bird and add different birds to it.
//        Call fly() method for all of it. Output the information about each type of created bird.

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle("Brown", "3 eggs per year"),
                new Swallow("Brown", "8 eggs per year"),
                new Penguin("Brown", "1 egg per year"),
                new Chicken("Brown", "1 egg per day")
        };

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
            System.out.println(birds[i].fly() + "\n");
        }
    }
}
