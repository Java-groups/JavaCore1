package HM3.HomeWork.Task2;

public class Main {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Polly", Dog.Breed.poodle, 5);
        Dog Dog2 = new Dog("Snowflake", Dog.Breed.labrador, 2);
        Dog Dog3 = new Dog("Pickle", Dog.Breed.bulldog, 7);

        if ((Dog1.name == Dog2.name) || (Dog1.name == Dog3.name) || (Dog2.name == Dog3.name)) {
            System.out.println("There are 2 dogs with the same name");
        }
        else {
            System.out.println("There are no 2 dogs with the same name");
        }


        if ((Dog1.age > Dog2.age) && (Dog1.age > Dog3.age)) {
            System.out.println("The " + Dog1.breed + " is the oldest dog");
        }
        if ((Dog2.age > Dog1.age) && (Dog2.age > Dog3.age)) {
            System.out.println("The " + Dog2.breed + " is the oldest dog");
        }
        if ((Dog3.age > Dog2.age) && (Dog3.age > Dog1.age)) {
            System.out.println("The " + Dog3.breed + " is the oldest dog");
        }
    }
}
