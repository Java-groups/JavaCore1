package com.edu.practicaltask7;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building) {

        this.name = name;
        address = new Address(city, street, building);

    }

    public Address getAddress() {
        return address;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;

    }


    class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }


        public void setCity(String city) {
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();

        }
    }

    public void info() {
        System.out.println("Department: " +
                "name: " + name + ", city: " + address.city + ", street: " + address.street + ", building: " + address.building);

    }
}
