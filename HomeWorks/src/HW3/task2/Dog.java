package HW3.task2;

public class Dog {

    enum Breeds {
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
    
    private Breeds breed;
	private String name;
	private Integer age;
	public  String resultName;
	public String resultAge;
	
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
    
    public void findMatches(Dog dog1, Dog dog2) {
    	
    	if (dog1.name.equals(dog2.name)) {
	    	  this.resultName = "The next dogs have the same name:\n\n" + dog1.toString() + "\n" + dog2.toString();
	    } else this.resultName = "No matches found";
    }
    
    public void findOldest (Dog dog1, Dog dog2) {
    	if (dog1.age < dog2.age) { 
    		this.resultAge = "The oldest dog is:\n" + dog1.toString();
	    } else if (dog1.age > dog2.age) {
	        this.resultAge = "The oldest dog is:\n" + dog2.toString();
	    } else this.resultAge = "Dogs are the same age!";
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		Dog dog = (Dog)obj;
		if (getClass() != obj.getClass()) return false;
		if (name == null) {
			if (dog.getName() != null) return false;
		} else if (!name.equals(dog.getName()))return false;
		return true;
		}
    
    @Override
    public String toString() {
    	return " Name: " + getName().toUpperCase() + " \n Breed: " + getBreed() + " \n Age: " + getAge() + " YEARS\n";
    }
   
}
