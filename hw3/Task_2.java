package hw3;

public class Task_2 {

    enum Breed {
        RETRIEVER, LABRADOR, BULL_TERRIER, BOXER, MALTIPOO, CORGI
    }

    static class Dog {
        private final String name;
        private final Breed breed;
        private final int age;

        Dog(String name, Breed breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Breed getBreed() {
            return breed;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Leo", Breed.CORGI, 5);
        Dog dog2 = new Dog("Charlie", Breed.MALTIPOO, 3);
        Dog dog3 = new Dog("Max", Breed.LABRADOR, 7);

        boolean allNamesUnique = !dog1.getName().equals(dog2.getName()) && !dog2.getName().equals(dog3.getName());
        Dog oldestDog;
        if (dog1.getAge() > dog2.getAge()) {
            oldestDog = dog1.getAge() > dog3.getAge() ? dog1 : dog3;
        } else {
            oldestDog = dog2.getAge() > dog3.getAge() ? dog2 : dog3;
        }

        System.out.println("The oldest dog is " + oldestDog.getName() + ", " + oldestDog.getBreed());
    }
}
