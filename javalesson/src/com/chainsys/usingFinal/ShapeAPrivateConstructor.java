package com.chainsys.usingFinal;

public class ShapeAPrivateConstructor {
public int height;
public int width;
private ShapeAPrivateConstructor() {
	System.out.println("ShapeA CreateA"+ hashCode());
	
}private ShapeAPrivateConstructor(int x){
	height=x;width=x;
	System.out.println(x +"ShapeA CreateB"+ hashCode());
}
public void echo() {
	System.out.println("hello");
}
public static ShapeAPrivateConstructor getObject() {
return new ShapeAPrivateConstructor();  //call to private constructor
}
}