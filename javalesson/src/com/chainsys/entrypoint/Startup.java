/**
 * 
 */
package com.chainsys.entrypoint;

import com.chainsys.strings.StringlessonA;
import com.chainsys.unitester.CalculateTester;
import com.chainsys.unitester.Calculator;
import com.chainsys.unitester.CarTester;
import com.chainsys.unitester.EmpTest;
//import com.chainsys.unitester.Encapsulation.Customer;
import com.chainsys.unitester.VariableTester;
import com.chainsys.unitester.MultipleCatch;
import com.chainsys.variables.BankDemo;

/**
 * @author sara3113
 *date:mar 3 2022
 * purpose: entry points class for the entire project  */
public class Startup {

	private static Object calculateTester;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*VariableTester.testGlobalVariable();
	
VariableTester.testImmutableVariable();
VariableTester.testStaticMethod();
VariableTester.testNonStaticMethod(); */

	/*System.out.println( "Result of addition : " +Calculator.add(10, 11));
	System.out.println( "Result of substration : "+Calculator.sub(10, 11));
	
	System.out.println("Result of division : " + Calculator.divide(10, 11));}
*/
/*CalculateTester.testAdd();
 CalculateTester.testSubtract();
 CalculateTester.testMultiply();
 CalculateTester.testDivide(); */
/*BankDemo.openAccount();EmpTest
BankDemo.withdraw();
BankDemo.deposite(); 
*/
		//CarTester.testcar();
		
		//StringlessonA.reverse();
	/*	try {
			MultipleCatch.m4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MultipleCatch.m3();
		MultipleCatch.m2();MultipleCatch.m1();
		
		*/
	
		EmpTest.testCity();
		EmpTest.testEmpName();
		EmpTest.testSalary();
	}	
 }