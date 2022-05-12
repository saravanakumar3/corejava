package com.chainsys.collections;
import java.util.Enumeration;
import java.util.Vector;
public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v =new Vector <Integer>(3,2);
System.out.println("Initial size :" + v.size());
System.out.println("Initial capcity :" + v.capacity());
	v.addElement(1);
	v.addElement(2);
	v.addElement(3);
	v.addElement(4);
	System.out.println("Initial capcity :" + v.capacity());
	v.addElement(5);
	v.addElement(6);
	System.out.println("Initial capcity :" + v.capacity());
	System.out.println("First element :" + (Integer)v.firstElement());
	System.out.println("last element :" + (Integer)v.lastElement());
	if(v.contains(3))
		System.out.println("Vector contains 3.");
	Enumeration<Integer> vEnum =v.elements();
	System.out.println(vEnum.nextElement()+" ");
	
	
	
	
	}

}
