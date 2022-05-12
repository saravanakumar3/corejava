package com.chainsys.strings;

import java.util.Scanner;

public class StringlessonA {
	public static void lesssonOne() {
		// String is an array of characters
		String firstString="Chainsys";
		System.out.println(firstString);
		char dataOne[]= {'c','h','a','i'};
		String secondString =new String (dataOne);
		System.out.println(secondString);
		String thirdString =new String(new char [] {'c','h','a','i','n'});
		System.out.println(thirdString);
		
	}
public static void lessonTwo() {
	String firstString ="hello";
	String secondString ="hello";
	String thirdString ="hello";
	int firstNumber =100;
	int SecondNumber =100;
	int thirdNumber =100;
}

public static void creatingStringInaForLoop(){
	for (int count =0;count<10;count++) {
		String s1 ="hello";
	}}

	public void StringToCharArray() {
		java.util.Scanner  scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString =scanner.nextLine();
		scanner.close();
		int stringlength=firstString.length();
		
		char[] data =firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("lenght" + dataarraylength);
	}
public static void testSplit() {
	String firstString =" Tom and Jerry";
	String trimmedString =firstString.trim();
	String [] data =trimmedString.split("");
	int count =data.length;
	System.out.println("Word count " +count);
	for (int index =0;index < count;index++) {
		System.out.println(data[index]);
	}}
	public static void testSplitDAys() {
		String firstString =" Mon;wed;thu;fri;sat;sum";
		String trimmedString =firstString.trim();
		String [] data =trimmedString.split(" ;");
		int count =data.length;
		System.out.println("Word count " +count);
		for (int index =0;index < count;index++) {
			System.out.println(data[index]);
		}
		
}
	public static void reverse() {
		java.util.Scanner  scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String sentance ="";
				try{
					sentance =scanner.nextLine();
				}finally
				{
					scanner.close();
				}
		char str[]= sentance.toCharArray();
		 int n = str.length; // length of character array
	       int start=0,end = n-1;
	       while(start<=end){
	           char temp = str[start];
	           str[start] = str[end];
	           str[end] = temp;
	           start++;
	           end--;
	       }
	       String reversedString = String.valueOf(str);
	       System.out.println("Reversed string: "+reversedString); //  Printing the reversed String
	   }	
	}
	




 