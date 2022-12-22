package arthurmkrtchian.javaCore.nestedClasses.homeWorks.homework;

//        Develop a FullName class with the firstName and lastName fields of type String, which
//        would correspond to the principle of encapsulation.
//        • Create an abstract Person class with fullName field of type FullName and age of type int.
//        • In the Person class, create a constructor
//        public Person(FullName fullName, int age)
//        and a method called info(), which will return a string in the format
//        "First name: <firstName>, Last name: <lastName>, Age: <age>"
//        and an abstract public activity() method with a String return type.
//
//        Develop a Student class with an int field that matches the course the student is taking.
//        • In the Student class, create a constructor with parameters to initialize all fields in the
//        class, and override the info() method (which would also add course information to the
//        previous line), and the activity() method from the Person class. The activity() method
//        should return a string value that is the type of activity for the corresponding Person
//        subtype, for example for a student - this could be the value "I study at university".
//        • In the main(...) method, create two instances of the Student class and output information
//        about them by calling the appropriate methods info() and activity()
//        • Create one more instance of Student class by cloning the first student,
//        change a course for this object and output full information about all of
//        created students

public abstract class Person {
    private FullName fullName;
    private int age;

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String activity();

    public String info(){
        return String.format(
                "First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(),
                fullName.getLastName(), age
        );
    }
}
