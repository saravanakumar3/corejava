package com.chainsys.unitester;

import com.chainsys.variables.Demo;

public class VariableTester {


public static void testGlobalVariable() {
	//display value of static field
	System.out.println("DataA: " +Demo.DataA);
	/*display the value of immutable field
	 this is not possible without an object*/
//	System.out.println("DataB: " +Demo.DataB);
	//display the value of constant field
	System.out.println("DataC: " +Demo.DataC);
	//modifying static value of DataA
	Demo.DataA=2345;
	System.out.println("DataA:"+Demo.DataA);
	
	
	
}public static void testImmutableVariable(){
	/* connot make a static refrence to the non -static field demoa.dataB
	 * Demo.DataB=123;
	 * first create  an object  or class
	 * pass an int value as an argument to the constructor
	 * acess the immutale instance field using object reference*/

Demo firstObject=new Demo(123);
System.out.println(firstObject.DataB);
/*
 * value assigned to an immutable field can not be changed
 * value for immutable field can be assigned only through the onstructor*/
// firstObject.DataB=567; it does work because it is immutable variable
}
public static void testStaticMethod()
{
	Demo.sayHello();
}
public static void testNonStaticMethod() {
 //ERROR	// Demo.greetUsedr();
	Demo firstObject = new Demo (111);
	//call the non static methodObject.greetUser();
	firstObject.greetUser();
}
}
