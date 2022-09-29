package org.tnsindia.userinput;

import java.util.Scanner;

////program on user-input for double data-type

public class DemoOnDouble {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		double x=s.nextDouble();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();
	}

}
