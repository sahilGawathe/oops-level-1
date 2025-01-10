package com.Leval1Problems;

import java.util.Scanner;

public class Circle {
	double radius, PI = 3.14 ; // Initialize instance variable Radius and Constant PI = 22/7 
	
	// Calculate the Area of Circle
	private double areaOfCircle(double radius) {
		 return PI*(radius*radius);
	}
	
	// Calculate the Circumference of Circle
	private double circumferenceOfCircle(double radius) {
		return 2*PI*radius;
	}
	
	//Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle obj = new Circle();
		
		System.out.println("Enter The radius of Circle :");
		obj.radius = sc.nextInt(); // take input radius 
		
		System.out.println("The Area of Circle : "+obj.areaOfCircle(obj.radius));
		System.out.println("The Circumference of Circle : "+obj.circumferenceOfCircle(obj.radius));
		
				
		
	}
}
