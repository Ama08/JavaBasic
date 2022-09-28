package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {

		//creating objects for employee class
		Employee employee; //a reference variable
		employee = new Employee();  //Employee object is created
		System.out.println("ID: " + employee.id);
		System.out.println("Department: " + employee.depratment);
		System.out.println("Gender: "+ employee.gender);
		System.out.println("Name: " + employee.name);
		System.out.println("Salary: " + employee.salary);
		System.out.println("Age: " + employee.age);
		
		employee.id = 1235652;
		employee.name = "Nancy";
	    employee.depratment = "Marketing";
		employee.salary = 25631433;
		employee.age = 32; 
		employee.gender = 'F';
		
		System.out.println("ID: " + employee.id);
		System.out.println("Department: " + employee.depratment);
		System.out.println("Gender: "+ employee.gender);
		System.out.println("Name: " + employee.name);
		System.out.println("Salary: " + employee.salary);
		System.out.println("Age: " + employee.age);
		
		Employee employee2 = new Employee();
		
		employee2.id = 122564;
		employee2.name = "Mark";
	    employee2.depratment = "Marketing";
		employee2.salary = 15631433;
		employee2.age = 42; 
		employee2.gender = 'M';
		
		System.out.println("ID: " + employee2.id);
		System.out.println("Department: " + employee2.depratment);
		System.out.println("Gender: "+ employee2.gender);
		System.out.println("Name: " + employee2.name);
		System.out.println("Salary: " + employee2.salary);
		System.out.println("Age: " + employee2.age);
		
	}

}
