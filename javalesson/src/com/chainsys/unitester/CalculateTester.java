package com.chainsys.unitester;
// created on :25 mr 2022
public class CalculateTester {
	public static void testAdd() {
		int arg1 =100;
		int arg2 = 50;
		int output =Calculator.add(arg1, arg2);
		System.out.println("result of Add is : " + output);	
	}
public static void testMultiply() {
	int arg1 =100;
	int arg2 = 50;
	int output =Calculator.multiply(arg1, arg2);
	System.out.println("result of multipy is : " + output);			
	}
public static void testDivide() {
	int arg1 =100;
	int arg2 = 50;
	int output =Calculator.divide(arg1, arg2);
	System.out.println("result of divide is : " + output);	
}
public static void testSubtract() {
	int arg1 =100;
	int arg2 = 50;
	int output =Calculator.sub(arg1, arg2);
	System.out.println("result of subtraction is : " + output);		
}
}
