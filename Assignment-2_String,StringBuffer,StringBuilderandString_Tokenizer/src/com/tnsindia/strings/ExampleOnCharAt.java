package com.tnsindia.strings;

import java.util.Scanner;

public class ExampleOnCharAt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=s.nextLine();
		System.out.println("String lenght is: "+str.length());
		System.out.println("Show index : "+str.charAt(3));
		s.close();
	}

}
