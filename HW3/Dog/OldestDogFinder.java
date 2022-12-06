import static java.lang.System.out;

public class OldestDogFinder {
    public void find(Dog[] dogs) {
        Dog oldestDog = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (oldestDog.getAge() < dogs[i].getAge()) {
                oldestDog = dogs[i];
            }
        }
        out.println(oldestDog.getName());
    }
}
