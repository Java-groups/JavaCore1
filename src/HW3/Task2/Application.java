package HW3.Task2;

public class Application {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Phibi", Breed.TERRIER, 2);
        Dog dog2 = new Dog("Chappi", Breed.JACK_RUSSEL, 5);
        Dog dog3 = new Dog("Jack", Breed.SPANIEL, 6);


        Dog.theSameName(dog1, dog2, dog3);
        Dog.theOldestDog(dog1, dog2, dog3);
    }
}
