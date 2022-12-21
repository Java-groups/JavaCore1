package HW6.com.model.animal;

import HW6.com.model.animal.Animal;

public class Cat implements Animal {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public  void voice() {
        System.out.println("Cat "+getName()+ " meow meow");

    }

    @Override
    public void feed() {
        System.out.println("My cat "+getName()+" which is " + getAge()+" years old, eats fish ");

    }


}
