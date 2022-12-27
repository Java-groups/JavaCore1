/*
Task
• Create class Department which contains field name of String type and field address of
  Address type
• In class Department create inner class Address with city and street fields of String type and
  building of type int
• In main method create an instance for one department and initialize it.
• Create one more department by cloning previous created department, change city for this
  object
• Print information about all departments
  */

package com.edu.practicaltask7;

public class DepartmentStarter implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department dep = new Department("Manufacturing department", "Kyiv", "Glybochyc`ka", 10);
        Department depCopy = (Department) dep.clone();


        /*
       Could you please advice, if it is possible, which should be code below,
       if the class "Address" will be "private":
       */
        depCopy.getAddress().setCity("L`viv");

        dep.info();
        depCopy.info();
    }
}


//depCopy.setName("HR department");
//depCopy.setAddress(new Department.Address("L`viv", "Ivana Franka", 21));

