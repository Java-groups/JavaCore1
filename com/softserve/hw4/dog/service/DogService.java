package com.softserve.hw4.dog.service;

import com.softserve.hw4.dog.DogMain;
import com.softserve.hw4.dog.model.Dog;

public class DogService {
    public boolean compareDogNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i+1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Dog oldestDogNameAndBreed(Dog[] dogs) {
        Dog dogsMaxAge = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            if (dogsMaxAge.getAge() < dogs[i].getAge()) {
                dogsMaxAge = dogs[i];
            }
        }
        return dogsMaxAge;
    }

    public void maxAge(DogMain dog1, DogMain dog2, DogMain dog3) {
//        DogMain dog;
//
//        if (dog1.age > dog2.age && dog1.age > dog3.age) {
//            dog = dog1;
//            System.out.println(dog);
//        }
    }
}
