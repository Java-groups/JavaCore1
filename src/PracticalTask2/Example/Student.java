package PracticalTask2.Example;

public class Student {

    private static int count = 0;
    private static double sum = 0;


    private String name;
    private double rating;


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        sum = sum + this.rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //todo
    public static double avgRating() {
        return sum/count;
    }

    public Student(String name, double rating) {
        count++;
        this.name = name;
        this.rating = rating;
        sum = sum + this.rating;
    }
    public Student(String name) {
        count++;
        this.name = name;
    }
    public Student(){
        count++;
    }

    //todo
    public boolean betterStudent(Student s){
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student [name="+name+", rate="+rating+"]";
    }
}
