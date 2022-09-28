package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {

		//creating objects for employee class
		Employee employee; //a reference variable
		employee = new Employee(121554, "Nancy", "Marketing", 125364, (byte) 32, 'F' );  //Employee object is created
		employee.displayEmploteeInfo();
		double incremntsalary  = employee.incrementsalary();
		
		System.out.println(employee.name + "'s total Salary is : " + employee.totalSalary());
		
		/*
		 * System.out.println("ID: " + employee.id); System.out.println("Department: " +
		 * employee.depratment); System.out.println("Gender: "+ employee.gender);
		 * System.out.println("Name: " + employee.name); System.out.println("Salary: " +
		 * employee.salary); System.out.println("Age: " + employee.age);
		 */
		
		/*employee.id = 1235652;
		employee.name = "Nancy";
	    employee.depratment = "Marketing";
		employee.salary = 25631433;
		employee.age = 32; 
		employee.gender = 'F';*/
		
		/*
		 * System.out.println("ID: " + employee.id); System.out.println("Department: " +
		 * employee.depratment); System.out.println("Gender: "+ employee.gender);
		 * System.out.println("Name: " + employee.name); System.out.println("Salary: " +
		 * employee.salary); System.out.println("Age: " + employee.age);
		 */
		
		
		
		Employee employee2 = new Employee(251346, "Mark", "HR", 241656, (byte) 42, 'M');
		employee2.displayEmploteeInfo();
		System.out.println(employee2 + "'s incremented salary: " + employee2.incrementsalary());
		System.out.println(employee2.name + "'s total Salary is: " + employee2.totalSalary());
		
		/*employee2.id = 122564;
		employee2.name = "Mark";
	    employee2.depratment = "Marketing";
		employee2.salary = 15631433;
		employee2.age = 42; 
		employee2.gender = 'M';*/
		
		/*
		 * System.out.println("ID: " + employee2.id); System.out.println("Department: "
		 * + employee2.depratment); System.out.println("Gender: "+ employee2.gender);
		 * System.out.println("Name: " + employee2.name); System.out.println("Salary: "
		 * + employee2.salary); System.out.println("Age: " + employee2.age);
		 */
		
	}

}
