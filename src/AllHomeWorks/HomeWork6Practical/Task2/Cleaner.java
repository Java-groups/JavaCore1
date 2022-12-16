package AllHomeWorks.HomeWork6Practical.Task2;

public class Cleaner extends Staff{

    final String TYPE_PERSON = "Cleaner";
    public int salaryChange = 50;


    @Override
    public int salary(int salary) {
        salaryChange = salary+10;
        return salaryChange;
    }


    public Cleaner(String name) {
        super(name);
    }

    public void print(){
        System.out.println("I am a " +TYPE_PERSON +"."
                + "Salary: " + salary(salaryChange));
    }
}
