package HW7.Task2v2;



abstract public class Person implements Cloneable{
    private FullName fullName = new FullName();
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

     private class FullName implements Cloneable{
        private String firstName;
        private String lastName;

         public FullName(String firstName, String lastName) {
             this.firstName = firstName;
             this.lastName = lastName;
         }

         public FullName() {
         }

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

         @Override
         protected Object clone() throws CloneNotSupportedException {
             return super.clone();
         }
     }

    public Person(String firstName,String lastName, int age) {
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }
    public String info() {return "First name " + fullName.getFirstName() + ", Last name " + fullName.getLastName() + ", Age " + age;}
    abstract public String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
