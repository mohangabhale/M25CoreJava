package org.tnsindia.interfaceexample;

import java.util.Scanner;

//child class to implements the method of interface
public class ShapeArea implements Area {

	@Override
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r=s.nextDouble();
		System.out.println("The area of circile is: "+3.142*r*r);
		
	}

	@Override
	public void square() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of the square");
		double side=s.nextDouble();
		System.out.println("The area of square: "+side*side);
		
	}
	
}
