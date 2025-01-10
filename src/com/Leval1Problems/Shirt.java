package com.Leval1Problems;

public class Shirt {
String size,color;
double price;
	

	private void print(double price, String size, String color) {
		System.out.println("The Color of Shirt is : "+ color);
		System.out.println("The Size of Shirt is : "+ size);
		System.out.println("The Discounted Price of Shirt is : "+price);
	}
	
	private double calDiscount(String size, double price) {
		double discountedPrice = price;
		if(size.trim().toLowerCase() == "xxl") {
			return discountedPrice -= price * 0.30;
		}
		else if(size.trim().toLowerCase() == "xl"){
			return discountedPrice -= price * 0.20;
		}
		else if (size.trim().toLowerCase() == "l"){
			return discountedPrice -= price * 0.10;
		}
		else {
			return discountedPrice; 
		}
	}
	
	public static void main(String[] args) {
		Shirt obj = new Shirt();
		obj.color = "Black";
		obj.price = 700;
		obj.size = "xl";
		
		System.out.println("Price Before Discount : "+ obj.price);
		obj.price = obj.calDiscount(obj.size,obj.price);
		obj.print(obj.price,obj.size, obj.color);

	}
}
