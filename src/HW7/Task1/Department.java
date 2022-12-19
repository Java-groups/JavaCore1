package HW7.Task1;

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

    public void setAddress(String city,String street,int building) {
        address.city = city;
        address.street = street;
        address.building = building;
    }

    public Department(String name, String city,String street,int building) {
        address.city = city;
        address.street = street;
        address.building = building;
        this.name = name;

    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address)copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

    private class Address implements Cloneable{
        private String city;
        private String street;
        private int building;



        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address() {

        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
