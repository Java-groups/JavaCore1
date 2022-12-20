package edu.homeworks.hw7.practicaltasks;

public class Department implements Cloneable{
    private String name;
    private Address address = new Address();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department copyDep = (Department) super.clone();
        return copyDep;
    }
}


     class Address{
        private String city;
        private String street;
        private int building;

        public String getCity() {
            return city;
        }

        public String setCity(String city) {
            this.city = city;
            return city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }
}
