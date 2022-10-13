package com.tnsindia.strings;

import java.util.Scanner;

public class StringObject {

	public static void main(String[] args) {
		//String str="Mohan Gabhale";
		//System.out.println(str);
		System.out.print("Enter the String: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("The string is: "+str);
		s.close();
		
	}

}
