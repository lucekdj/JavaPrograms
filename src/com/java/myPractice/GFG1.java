package com.java.myPractice;// Java program to demonstrate working
// of java.lang.Math.pow() method

import java.lang.Math;

class PowMethodRiseThePower {
	//The java.lang.Math.pow() is used to calculate a number raise to
	// the power of some other number. This function accepts two parameters
	// and returns the value of first parameter raised to the second parameter. There are some special cases as listed below:
	//
	//If the second parameter is positive or negative zero then the result will be 1.0.
	//If the second parameter is 1.0 then the result will be same as that of the first parameter.
	//If the second parameter is NaN then the result will also be NaN

	// driver code
	public static void main(String args[])
	{
		double a = 30;
		double b = 2;
		System.out.println(Math.pow(a, b));

		a = 3;
		b = 4;
		System.out.println(Math.pow(a, b));

		a = 2;
		b = 6;
		System.out.println(Math.pow(a, b));
	}
}
