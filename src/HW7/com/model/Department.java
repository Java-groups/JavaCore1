package HW7.com.model;

public class Department implements Cloneable{
    private  String name;

    private Adress adress;
    public class Adress implements Cloneable{
        private String city;
        private String street;
        private int building;


        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
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

        @Override
        public Object clone() throws CloneNotSupportedException {
            Adress copyOfAdress = (Adress) super.clone();

            return copyOfAdress;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.adress = (Adress) copyOfDepartment.getAdress().clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
