package com.chainsys.unitester;

import com.chainsys.classandmethods.Car;

public class CarTester {
public static void testcar() {
	Car firstCar =new Car("Tn 10A 001");
	firstCar.setColor("Red");
	firstCar.setFuel("petrol");
	firstCar.setYearOfPurchase(2022);
	System.out.println(firstCar.getRegNo());
	System.out.println(firstCar.getColor());
	System.out.println(firstCar.getFuel());
	System.out.println(firstCar.getYearOfPurchase());
	
}
}
