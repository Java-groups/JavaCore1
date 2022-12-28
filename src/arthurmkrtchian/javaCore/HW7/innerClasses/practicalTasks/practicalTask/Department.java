package arthurmkrtchian.javaCore.HW7.innerClasses.practicalTasks.practicalTask;


//        Create class Department which contains field name of String type and field address of
//        Address type
//        • In class Department create inner class Address with city and street fields of String type and
//        building of type int
//        • In main method create an instance for one department and initialize it.
//        • Create one more department by cloning previous created department, change city for this
//        object
//        • Print information about all departments


public class Department implements Cloneable{
    private String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name: " + name  +
                ", address: " + address.getCity() +
                ", " + address.getStreet() +
                ", " + address.getBuilding() +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address{
        private String city;
        private String Street;
        private int building;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return Street;
        }

        public void setStreet(String street) {
            Street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        public Address(String city, String street, int building) {
            this.city = city;
            Street = street;
            this.building = building;
        }
    }
}
