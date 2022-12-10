package HW3;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setBreed((Breed.Bulldog));
        dog1.setName("art");
        dog1.setAge(1);

        Dog dog2 = new Dog();
        dog2.setBreed((Breed.Dobermann));
        dog2.setName("ART");
        dog2.setAge(4);

        Dog dog3 = new Dog();
        dog3.setBreed((Breed.Poodle));
        dog3.setName("tom");
        dog3.setAge(3);

      if (dog1.getName().equalsIgnoreCase(dog2.getName())) {
          System.out.println("dog1 and dog2 have the same name");
      } else if (dog1.getName().equalsIgnoreCase(dog3.getName())) {
          System.out.println("dog1 and dog3 have the same name");
      } else if (dog2.getName().equalsIgnoreCase(dog3.getName())) {
          System.out.println("dog2 and dog3 have the same name");
      } else System.out.println("all dogs have different names");

        System.out.println();

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println(dog1 + " is the oldest");
        } else if (dog2.getAge() > dog3.getAge()) {
            System.out.println(dog2 + " is the oldest");
        } else  { System.out.println(dog3 + " is the oldest");
        } // did not do if they have the same age. too much if-else :)





    }
}
