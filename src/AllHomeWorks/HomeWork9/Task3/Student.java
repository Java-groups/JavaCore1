package AllHomeWorks.HomeWork9.Task3;

import java.util.*;

public class Student {
   public String name;
  public  Integer course;

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }
    public Student (Integer course, String name){
        this.name = name;
        this.course = course;
    }

    public String toString(){
        return getName() + ", course=" + getCourse();
    }

   public static void printStudents(List<Student> students, Integer course){
        Iterator<Student> studentsIterator = students.iterator();
        System.out.println("This is the list of students, which are taught on course " +course +": ");
        while (studentsIterator.hasNext()) {
            Student student = studentsIterator.next();
            if (Objects.equals(student.course, course)){
                System.out.println(student.getName());
            }
        }
   }

   public boolean equalsByName(Student other){
        return this.getName().equals(other.getName());
   }
   public boolean equalsByCourse(Student other){
       return this.getCourse().equals(other.getCourse());
   }

}
