package com.tnsindia.strings;

import java.util.Scanner;

public class ExampleOnEqualString {

	public static void main(String[] args) {
		String str="mohan";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("String is Matching");
		}
		else
		{
			System.out.println("String is Not Matching");
		}
		s.close();
	}

}
