package com.Leval1Problems;

import java.util.Scanner;

public class BankAccount {
	int balance;
	String accountNumber;
	BankAccount(int balance,String accountNumber){
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	private void depositeMoney(int depositeAmount) {
		this.balance += depositeAmount;
	}
	private void withdrawMoney(int withdrawAmount) {
		this.balance -= withdrawAmount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Bank!");
		System.out.println("Enter the Account Number :");
		String acNo = sc.nextLine();
		System.out.println("Enter the Balance :");
		int balance = sc.nextInt();
		
		BankAccount obj = new BankAccount(balance, acNo);
		System.out.println("Enter the amount you want to Deposite :");
		int depoAmount = sc.nextInt();
		obj.depositeMoney(depoAmount);
		System.out.println("Account Number : "+obj.accountNumber);
		System.out.println("Balance : "+obj.balance);
		
		System.out.println("Enter the amount you want to Withdraw :");
		int WithdrawAmount = sc.nextInt();
		obj.withdrawMoney(WithdrawAmount);
		System.out.println("Account Number : "+obj.accountNumber);
		System.out.println("Balance : "+obj.balance);
		
		BankAccount obj1 = new BankAccount(3000, "a456");
		System.out.println("Account Number : "+obj1.accountNumber);
		System.out.println("Balance : "+obj1.balance);


		
	}
		
	
}
