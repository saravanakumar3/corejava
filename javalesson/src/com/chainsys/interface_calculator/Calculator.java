/**
 * 
 */
package com.chainsys.interface_calculator;

/**
 * @author sara3113
 *
 */
	
		public  class Calculator implements  InterfaceCalculator {
		public int variable1;
		public int variable2;

		public int add(int variable1,int variable2) 
		{
		    System.out.println( variable1  + variable2);
		    return variable1 +variable2;
		}
		public int multiply(int variable1,int variable2)
		{
		    System.out.println( variable1  * variable2);
		    return variable1 * variable2;

		}

		public int divide(int variable1, int variable2) {
		    System.out.println(variable1 / variable2);
		    return variable1 / variable2;
		}
		}

		    

