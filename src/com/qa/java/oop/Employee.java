package com.qa.java.oop;

public class Employee {
	// state(data)
	int id;
	String name;
	String depratment;
	double salary;
	byte age; 
	char gender;
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
	}
	
	//arg constructor 
	
	

}
