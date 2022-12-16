package AllHomeWorks.HomeWork6Practical.Task2;

abstract public class Staff extends Person{

    final String TYPE_PERSON = "Staff";
    abstract public int salary(int salary);

    public Staff(String name) {
        super(name);
    }

    public  void print(){
        System.out.println("I am a " +TYPE_PERSON + ".");
    }
}
