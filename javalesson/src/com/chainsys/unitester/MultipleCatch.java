package com.chainsys.unitester;

import java.util.Scanner;

public class MultipleCatch {
public static void m4() throws Exception 
{
	/* Exception e1 =new Exception("Error1");
	// Inner Exception
	// e1 is nested inside e2
	Exception e2 =new Exception("Error 2",e1); 
	throw e2; */
	System.out.println("Before Try");
	int x=0, y = 0,z = 0;
	String s1 =null, s2 = null;
	java.util.Scanner sc=null;
	try {
		sc =new Scanner(System.in);
		System.out.println("Enter value for X");
		s1 =sc.nextLine();
		System.out.println("Enter value for Y");
		s2 =sc.nextLine();
		x =Integer.parseInt(s1);
		y= Integer.parseInt(s2);
		z=x/y;
		System.out.println("Result" +z);
		
	
	}catch (ArithmeticException err) {
		System.out.println("Inside catch1"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
		
	}catch (NumberFormatException err) {
		System.out.println("Inside catch2"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());	
		}catch (Exception err) {
		System.out.println("Inside catch3"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());		
}finally
	{System.out.println("After Finally");
	}
}
public static void m1()
{

	try {
		m2();
		
}catch(Exception err) {
	System.out.println("getMessage"+ err.getMessage());
	err.printStackTrace();
	/* Throwable t1 =err.getCause();
	 * if(null!=t1)
	 * {
	 * class c1} 
	 */
	}finally {
		System.out.println("Inside m1 Finally");
	}
}public static void m2() {
	m3();
}public static void m3() {

	try {
		m4();
		
}catch(Exception e) {
	System.out.println("Inside  Catch"+ e.getMessage());
	Throwable t1 =e.getCause();
	System.out.println("Cause" +t1.getMessage());
	
}



	}}