package arthurmkrtchian.javaCore.HW3.conditionStatements.homeWorks.homeWork2;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        String repeatedNames = "";

        //Create 3 instances of type Dog
        Dog[] dogs = new Dog[] {
            new Dog("Sharik", 4, Breed.ESKIMO),
            //Dog dog2 = new Dog("Mukhtar", 2, Breed.MALAMUTE);
            new Dog("Sharik", 2, Breed.MALAMUTE),
            new Dog("Gina", -1, Breed.AKITA)
        };

        //Check if there is no two dogs with the same name
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = 0; j < dogs.length -1; j++) {
                if (dogs[i].equals(dogs[j])){
                    count++;
                }
                if (count > 1 && !repeatedNames.contains(dogs[i].getName())){
                    repeatedNames = repeatedNames + "\t" + dogs[i].getName() + "\n";
                }
            }
            count = 0;
        }

        if (repeatedNames != "") {
            System.out.printf("The following names are repeated:\n%s", repeatedNames);
        }

        //Display the name and the kind of the oldest dog
        Dog oldest = new Dog("Oldest", Integer.MIN_VALUE, Breed.POOCH);
        for (int i = 0; i < dogs.length - 1; i++) {
            if (dogs[i].getAge() > oldest.getAge()){
                oldest = dogs[i];
            }
        }

        System.out.printf(
                "Oldest dog name is %s and his/her breed is %s\n",
                oldest.getName(),
                oldest.getAge(),
                oldest.getBreed().toString()
        );

    }

}
