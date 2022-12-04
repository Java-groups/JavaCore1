import java.time.YearMonth;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String secondName;
    private static int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birtYear) {
        this.birthYear = birtYear;
    }


    public Person(String firstName,String secondName,int birtYear){
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birtYear;
    }
    public Person(String firstName,String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(){

    }



    public static int getAge(){
        return YearMonth.now().getYear()-birthYear;
    }


    public void input(Scanner inputs){
        System.out.println("Enter your first name = ");
        this.firstName = inputs.nextLine();
        System.out.println("Enter your second name = ");
        this.secondName = inputs.nextLine();
        System.out.println("Enter your birth = ");
        this.birthYear = inputs.nextInt();
    }

    public String output(){
        return "Your name = "+ firstName + ".Your second name = "+ secondName + ".Your age = " + getAge() ;
    }

    public String chanceName(String fn, String sf){
            this.firstName = fn;
            this.secondName = sf;
            return "Your first with change = " + fn + ". Your second name with change = " + sf;

    }


}
