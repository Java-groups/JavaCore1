package edu.homeworks.hw7.task1;

public class FullName {
    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    FullName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
