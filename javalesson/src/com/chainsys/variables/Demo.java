package com.chainsys.variables;

public class Demo {
	public static int DataA; // static global variable
	public final int DataB; // immutable global variable
	public final static int DataC = 300;// constant
	// construction
	/* Constructor is special method.
	 * the name of the constructor and the name of the class will be same
	 * it does npot have return type
	 * constructors can take parameters
	 * */

	public Demo(int dataB) {
		this.DataB = dataB;
		
	}
	/* static method can be called without an object*/

	public static void sayHello() {
		System.out.println("Hello developer !!");

	}

	public void greetUser() {
		System.out.println("Greetings USER !!!");
	}

}
