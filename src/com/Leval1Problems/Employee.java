package com.Leval1Problems;

public class Employee {
	String name;
	float salary;
	int id;
	
	public float calculate() {
		return salary*12;
	}
	public void display(float anualSalary) {
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Anual Salary = "+ anualSalary);
	}
	
	public static void main(String args[]) {
		Employee obj = new Employee();
		obj.name = "Abhishek";
		obj.salary = 30000;
		obj.id = 1;
		float anualSalary = obj.calculate();
		obj.display(anualSalary);
	}
}
