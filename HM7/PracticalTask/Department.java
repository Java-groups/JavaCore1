package HM7.PracticalTask;

public class Department implements Cloneable{
    String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Department copy = (Department) super.clone();
        copy.address.city = (Address)copy.address.city.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "Department name: " + name + "; City: " + address.city + "; Street: " + address.street + "; Building: " + address.building;
    }

    public static class Address implements Cloneable{
        String city, street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

//        @Override
//        public Object clone() throws CloneNotSupportedException {
//            Address copy = (Address) super.clone();
//            copy.city = (Address)copy.city.clone();
//            copy.street = (Address)copy.street.clone();
//            return copy;
//        }
    }
}
