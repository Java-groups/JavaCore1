package com.softserve.hw3.dog.service;

import com.softserve.hw3.dog.model.Dog;

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
}

