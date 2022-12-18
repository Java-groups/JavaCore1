package HW3.Task2;

public class Dog {

    private String name;
    private Breed type;
    int age;


    public Dog(String name, Breed type, int age) {;

        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getType() {
        return type;
    }

    public void setType(Breed type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog name = " + name + ", breed = " + type + " ,age = " + age;
    }


    // Check if there is no two dogs with the same name
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    public static void theSameName(Dog dog1, Dog dog2, Dog dog3){        boolean answer = false;
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())
                || dog2.getName().equals(dog3.getName()))
            answer = true;
        else
            answer = false;
        System.out.println("dogs with the same name availability is - "+ answer);

    }


    public static void theOldestDog(Dog dog1, Dog dog2, Dog dog3){
        Dog oldestDog = new Dog();
        if (dog1.age > dog2.age)
            oldestDog = dog1;
        else
            oldestDog = dog2;
        if (oldestDog.age < dog3.age)
            System.out.println("Oldest dog is " + dog3);
        else
            System.out.println("Oldest dog is " + oldestDog);
    }


}
