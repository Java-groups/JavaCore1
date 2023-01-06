package AllHomeWorks.HomeWork7Practical;

public class Department implements Cloneable {
    public String name;
    public Adress adress;

    public Department(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public static class Adress {
        protected String city;
        protected String street;
        protected int building;

        public Adress(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;

        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void info() {
        System.out.println(name + ": " + adress.city +", " +adress.street + ", " +adress.building);
    }

}
