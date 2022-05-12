package com.chainsys.introduction;

public class Fourthjava {
	public static void main(String []args){
		java.util.Scanner sc =new java.util.Scanner(System.in);
		System.out.println("what is your name ?");
		String name =sc.next();
taskb();
		sc.close();
		System.out.println(name);
	}
public static void taskA() {
	java.util.Scanner sc =new java.util.Scanner(System.in);
	System.out.println("enter no ?");
	int  name1 =sc.nextInt();
	int result = name1 *100;

	System.out.println(name1);
sc.close();
	
}
public static void taskb() {
	java.util.Scanner sc =new java.util.Scanner(System.in);

	String  s1 ="100";
	String  s2 ="100";

	System.out.println(s1+s2);
	int a =Integer.parseInt(s1);
	int b =Integer.parseInt(s2);;
	
	int c=a+b;
			System.out.println(c);
}
}