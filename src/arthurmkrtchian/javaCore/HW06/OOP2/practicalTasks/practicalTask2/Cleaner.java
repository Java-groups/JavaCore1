package arthurmkrtchian.javaCore.HW06.OOP2.practicalTasks.practicalTask2;

public class Cleaner extends Staff{

    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public double salary() {
        return 50; //Це так тільки щоб скорше. Можна звісно підставити формулу для розрахунку і отримувати дві змінні (кількість годин, вартість години)
    }

    @Override
    public void print() {
        System.out.println("Hi, I am a cleaner!");
    }
}
