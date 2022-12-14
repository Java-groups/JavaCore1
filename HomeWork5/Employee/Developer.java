package edu.homeworks.hw5.task2;

public class Developer extends Employee{
    private String positon;


    public String getPositon() {
        return positon;
    }


    public void setPositon(String positon) {
        this.positon = positon;
    }

    public Developer(String name,int age,double salary,String positon){
        super(name,age,salary);
        this.positon = positon;


    }


    @Override
    public String report(){
        return "Name = " + getName() + "\n Position = " + getPositon() + "\n Salary = " + getSalary();
    }
}
