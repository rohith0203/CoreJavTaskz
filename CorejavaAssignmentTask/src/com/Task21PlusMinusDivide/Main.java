package com.Task21PlusMinusDivide;
//Class named Operations have final variables like plus,minus,divide and multiply.
//This class has a method named calculate which takes 2 inputs of type double and return value in double
//inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
//AssertionError is also thrown when user doesn't perform any of these operations in default.
//In your main method: calculate all 4 results and have these printed in console.
//Make sure to have dynamic inputs.

import java.util.Scanner;



public class Main {




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		System.out.println("Enter 1 for plus ,2 for minus, 3 for multiple , 4 for divide");
		int i = sc.nextInt();
		if(i == 1||i == 2|| i == 3||i == 4) {
			System.out.println("enter the  2 value in decimal ");
			double t= op.calculate(i, sc.nextDouble(), sc.nextDouble());
			System.out.println(t);
		} else {
			try {
				throw new AssertionError("Enter valid input");
			}
			catch(AssertionError e) {
				System.out.println(e);
			}
		}
	}
}