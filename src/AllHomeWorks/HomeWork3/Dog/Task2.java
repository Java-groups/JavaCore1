package AllHomeWorks.HomeWork3.Dog;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static void doTask(BufferedReader br) throws IOException {
        int count = 0;
        Dog[] dogs = new Dog[3];
        Dog oldestDog = null;
        boolean nameMarker = false;

        for (int i = 0; i < 3; i++) {
            count = i;
            Dog dog = new Dog();
            dog.input(br);
            dogs[count] = dog;
            if ((oldestDog == null) || (dog.getAge() > oldestDog.getAge())){
                oldestDog = dog;
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = (i+1); j < 3; j++){

                if (dogs[i].getName().equals(dogs[j].getName())) {
                    nameMarker = true;
                    break;
                }
            }
        }
        if (nameMarker) {
            System.out.println("Dogs have the same names!");
        }
        else {
            System.out.println("Dogs have not the same names!");
            System.out.println("Oldest dog is " + oldestDog.getName() + ". His breed is -  " + oldestDog.getBreed());
        }
    }
}