package com.chainsys.variables;

import java.util.Scanner;

public class BankDemo {
	private static int balance =12000;
	public static long totalAmount;
	public static void deposite() {
		long  priveousAmount = totalAmount;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your deposite amount ");
		long enterAmount =sc.nextLong();
		long currentAmount =	totalAmount + enterAmount;
	totalAmount=currentAmount;
	if (priveousAmount< currentAmount) {
	System.out.println(" your  transaction  is successful ");
	System.out.println(" your  current balance is " + currentAmount);
	}
	else {
		System.out.println(" your  transaction  is failed ");	
	}
	}
	

public static void withdraw() {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your withdraw amount ?");
		long draw =sc.nextLong ();
		totalAmount= balance - draw ;
		if (draw <= balance ) {
		
		System.out.println(" your  transaction  is successful");
		System.out.println(" your  current balance is " + totalAmount);
		}else {
			System.out.println(" your  transaction  is failed");
			}
		
	}
public static void openAccount() {
	Scanner name = new Scanner(System.in);


	 System.out.println("Enter Your Name ?");
	 String userName = name.nextLine();
	 
		System.out.println("Enter your account Number ?");
		long accountNumber = name.nextLong();
	
}

}
