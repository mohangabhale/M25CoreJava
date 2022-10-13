package com.tnsindia.strings;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		System.out.println(10+20+" mohan"+" gabhale "+10+20);
		System.out.print(str1.concat(str2));
		s.close();
	}

}
