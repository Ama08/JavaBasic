package com.qa.java.oopproduct;

public class Product {
	
	int id;
	String name;
	double price;
	byte rating;
	double discountPercentage;
	char isAvailable;
	
	
	//no argument
	
	Product() {
		System.out.println("Product() constructor is called ");
		id = 125364;
		name = "Milk";
		price = 2.35;
		rating = 3;
		discountPercentage = 10;
		isAvailable = 'Y';
		
			
	}


	public Product(int id, String name, double price, byte rating, double discountPercentage, char isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	

}
