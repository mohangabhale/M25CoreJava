package com.tnsindia.strings;

import java.util.Scanner;

public class DemoOnLenght {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=s.nextLine();
		System.out.println("String lenght is: "+str.length());
		s.close();
	}

}
