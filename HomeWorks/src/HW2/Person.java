package HW2;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer birthYear;
	
	public Person() {}
    
	public Person(String firstName, String lastName, Integer birthYear) {
		this.firstName = firstName;
	    this.lastName = lastName;
	    this.birthYear = birthYear;
	}
	
	public void setFirstName(String firstName) {
        this.firstName = firstName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	
	public String getFirstName() {
        return firstName;
    }
	
    public String getLastName() {
        return lastName;
    }

    public Integer getBirthYear() {
	    return birthYear;
    }
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if (firstName == null) {
		    System.out.println("Enter first name: ");
		    this.firstName = br.readLine();
		} 
		
		if (lastName == null) {
		    System.out.println("Enter last name: ");
		    this.lastName = br.readLine();
		} 
		
		if (birthYear == null) {
		    System.out.println("Enter birth year: ");
		    this.birthYear = Integer.parseInt(br.readLine());
		} else { System.out.println("You have already add personal information");}
	}
	
	public Integer getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
	
	public void output() throws IOException {
		if (firstName == null || lastName == null|| birthYear == null) {
			System.out.println("No personal data has been entered");
			input();
			output();
		} else {
			System.out.println(getFirstName() + " " + getLastName() + ", " + getAge() + " years old.");
		}
	}
    
	public void changePersonInfo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("To change personal information ENTER: \n'1' - first name \n'2' - last name \n'3' - birth year \n'4' - Exit");
		
		String answer = br.readLine();
		
		switch (answer) {
		
		case "1":
			System.out.println("Enter new first name: ");
			this.firstName = br.readLine();
			break;
			
		case "2":
			System.out.println("Enter new last name: ");
			this.lastName = br.readLine();
			break;
			
		case "3":
			System.out.println("Enter new birth year: ");
			this.birthYear = Integer.parseInt(br.readLine());
			break;
		case "4":
			break;
			
		default:
			System.out.println("There is no variable " + "'" + answer + "' !");
			changePersonInfo();
		}
	}
}
