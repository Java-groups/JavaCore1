package com.home_work_2_oop_intro_practical;

class App
{
	public static void main(String[] args) 
	{
		Employee emp_1 = new Employee("Robert");
		emp_1.setRate(3);
		emp_1.setHours(4);
		emp_1.setHours(5);   //if number of hours is changed
		emp_1.setHours(6);   //
		
		Employee emp_2 = new Employee("Daniel");
		emp_2.setRate(4);
		emp_2.setRate(6);   //if rate is changed
		emp_2.setHours(5);
		emp_2.setHours(6);  //if number of hours is changed
		
		Employee emp_3 = new Employee("Connor");
		emp_3.setRate(5);
		emp_3.setHours(6);
		
		System.out.println(emp_1.toString());
		System.out.println(emp_2.toString());
		System.out.println(emp_3.toString());
		System.out.println(emp_1.getName() + "'s salary = "+emp_1.getSalary());
		System.out.println(emp_1.getName() + "'s bonus = "+emp_1.getBonuses());
		System.out.println(emp_2.getName() + "'s salary = "+emp_2.getSalary());
		System.out.println(emp_2.getName() + "'s bonus = "+emp_2.getBonuses());
		System.out.println(emp_3.getName() + "'s salary = "+emp_3.getSalary());
		System.out.println(emp_3.getName() + "'s bonus = "+emp_3.getBonuses());
		System.out.println(Employee.getTotalSum());
		
		
	}
}