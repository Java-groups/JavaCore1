import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].input();
        }
    }
}