package com.qa.java.oopproduct;

public class Product {
	
	int id;
	String name;
	double price;
	double rating;
	double discountPercentage;
	boolean isAvailable;
	
	
	//no argument
	
	Product() {
		System.out.println("Product() constructor is called ");
		id = 125364;
		name = "Milk";
		price = 2.35;
		rating = 3;
		discountPercentage = 10;
		isAvailable = true;
		
			
	}


	public Product(int id, String name, double price, double rating, double discountPercentage, boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	void displayProductInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + "£" + price);
		System.out.println("Discount: " + discountPercentage);
		System.out.println("Availability: " + isAvailable);
		System.out.println("Rating: " + rating);
		System.out.println();
	}
	
	double productDiscountPrice() {
		return (price* discountPercentage/100);
	}
	
	double productFinal() {
		return price - productDiscountPrice();
	}

}
