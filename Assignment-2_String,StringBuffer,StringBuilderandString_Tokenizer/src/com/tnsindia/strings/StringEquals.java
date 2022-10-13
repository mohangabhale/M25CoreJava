package com.tnsindia.strings;

public class StringEquals {

	public static void main(String[] args) {
		//String str="hi";
		//String str1="hi";
		String str=new String("mohan");
		String str3=new String("mohan");
		//both the string is created using new keyword if we have use == we get the false
		System.out.println(str==str3);
		System.out.println(str.equals(str3));
	}

}
