package com.Leval1Problems;

public class Tv {
	double price,size;
	String brand;
	
	private double calDiscount(double size, double price) {
		double discountedPrice = price;
		if(size <= 32) {
			return discountedPrice -= price * 0.30;
		}
		else if(size>32 && size <= 45){
			return discountedPrice -= price * 0.20;
		}
		else{
			return discountedPrice -= price * 0.10;
		}
	}
	
	private void print(double price,double size, String brand) {
		System.out.println("The brand of Tv is : "+brand);
		System.out.println("The Size of Tv is : "+ size );
		System.out.println("The DiscountedPrice of Tv : "+ price);
	}
	
	public static void main(String[] args) {
		Tv obj = new Tv();
		obj.brand = "Samsung";
		obj.size = 32;
		obj.price = 30000;
		System.out.println("Price Before Discount : "+ obj.price);
		obj.price = obj.calDiscount(obj.size,obj.price);
		obj.print(obj.price,obj.size, obj.brand);

	}
}
