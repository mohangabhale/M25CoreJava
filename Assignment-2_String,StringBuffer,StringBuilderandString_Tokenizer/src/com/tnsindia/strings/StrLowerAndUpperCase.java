package com.tnsindia.strings;

import java.util.Scanner;

public class StrLowerAndUpperCase {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		s.close();
	}

}
