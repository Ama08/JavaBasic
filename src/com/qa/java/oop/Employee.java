package com.qa.java.oop;

public class Employee {
	// state(data)
	int id;
	String name;
	String depratment;
	double salary;
	byte age; 
	char gender;
	double incrementPercentage;
	
	//Each employee object will have its own state
	
	
	//no arg
	Employee(){
		System.out.println("Employee() constructor is called ");
		
		id = 1235652;
		name = "Nancy";
	    depratment = "Marketing";
		salary = 25631433;
		age = 32; 
		gender = 'F';
	}
	public Employee(int id, String name, String depratment, double salary, byte age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.depratment = depratment;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.incrementPercentage = incrementPercentage;
		
	}
	 void displayEmploteeInfo() {
		    System.out.println("ID: " + id);
			System.out.println("Department: " + depratment);
			System.out.println("Gender: "+ gender);
			System.out.println("Name: " + name);
			System.out.println("Salary: " + salary);
			System.out.println("Age: " + age);
	 }
	//arg constructor 
	
	 double incrementsalary() {
		 return(salary*incrementPercentage/100);
	 }
	
	 double totalSalary() {
		 
		 return salary + incrementsalary();
	 }

}
