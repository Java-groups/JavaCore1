public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[4] = new Person();

        for(int i=0;i<=persons.length;i++){
            persons[i].input();
            System.out.println(persons[i].output());
            System.out.println(persons[i].getAge());
            System.out.println(persons[0].chanceName("Alex","Brown"));
        }

    }
}