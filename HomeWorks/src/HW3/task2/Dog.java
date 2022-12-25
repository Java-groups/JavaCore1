package HW3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dog {

    public enum Breeds {
    	AMERICAN_BULDOG,
    	EIREDALE_TERRIER,
    	AKITA,
    	APPENZELER_SENNENHUND,
    	AUSTRALIAN_KELPIE,
    	BEAGLE,
    	BORDER_COLLIE,
    	BOSTON_TERRIER,
    	BULL_TERRIER,
    	BULLMASTIFF,
    	CANE_CORSO;
    }
    
    public Breeds breed;
	public String name;
	public Integer age;
	public List<Dog> sameDogsAge = new ArrayList<>();
	public List<Dog> sameDogsName = new ArrayList<>();
	
	public Dog() {}
	
	public Dog(String name, Breeds breed, Integer age) {
        this.breed = breed;
    	this.name = name;
    	this.age = age;
	}
	
	public String getName() {
        return name;
    }
	
    public Breeds getBreed() {
        return breed;
    }
    
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public List<Dog> findMatches(List<Dog> dogs, String name) {

        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).name.equals(name)) {
                sameDogsName.add(dogs.get(i));
            }
        }
        return sameDogsName;
    }
    
    public List<Dog>  findOldest (List<Dog> dogs, Integer age) {
    	
    	for (int i = 0; i < dogs.size(); i++) {
    	    if (dogs.get(i).age == age) {
	    	    sameDogsAge.add(dogs.get(i));
	    	} 

    	    }
    	    return sameDogsAge;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(age, breed, name, sameDogsAge, sameDogsName);
	}

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog otherDog = (Dog) obj;

        if(name != this.name) return false;

        return name.equals(otherDog.name);
    }

	@Override
    public String toString() {
    	return "\n Name: " + getName().toUpperCase() + " \n Breed: " + getBreed() + " \n Age: " + getAge() + " YEARS\n";
    }
}
