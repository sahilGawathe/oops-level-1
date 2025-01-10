package com.Leval1Problems;

import java.util.Scanner;

public class Dog {
	String Breed;
	int age, weight;
	
	private double toHumanAge(int dogAge) {
		return 16*Math.log(dogAge)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog obj = new Dog();
		
		//taking user input
		System.out.println("Enter the Breed of Dog : ");
		obj.Breed = sc.nextLine();
		System.out.println("Enter the age of Dog : ");
		obj.age = sc.nextInt();
		System.out.println("Enter the Weight of Dog : ");
		obj.weight = sc.nextInt();
		
		//output
		System.out.println("The Breed of the Dog is : " + obj.Breed);
		System.out.println("The Weight of the Dog is : "+ obj.weight);
		System.out.println("The Age of the Dog is : "+ obj.age);
		System.out.println("The Human Age of the Dog is : " + obj.toHumanAge(obj.age));
	}
}
