package com.Leval1Problems;

public class Furniture {
	String material, type;
	double price;
	
	private double calDiscount(String material, double price) {
		double discountedPrice = price;
		if(material.trim().toLowerCase() == "plastic") {
			return discountedPrice -= price * 0.30;
		}
		else if(material.trim().toLowerCase() == "metal"){
			return discountedPrice -= price * 0.20;
		}
		else if (material.trim().toLowerCase() == "wood"){
			return discountedPrice -= price * 0.10;
		}
		else {
			return discountedPrice; 
		}
	}
	
	private void print(double price,String type, String material) {
		System.out.println("The Material of Furniture is : "+material);
		System.out.println("The type of Furniture is : "+ type );
		System.out.println("The DiscountedPrice of Furniture : "+ price);
	}
	
	public static void main(String[] args) {
		Furniture obj = new Furniture();
		obj.material = "plastic";
		obj.type = "Table";
		obj.price = 7000;
		System.out.println("Price Before Discount : "+ obj.price);
		obj.price = obj.calDiscount(obj.material,obj.price);
		obj.print(obj.price,obj.type, obj.material);

	}
	
}
