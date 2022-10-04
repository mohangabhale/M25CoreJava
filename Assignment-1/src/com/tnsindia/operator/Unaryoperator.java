package com.tnsindia.operator;

public class Unaryoperator {

	public static void main(String[] args) {
		int a=5, b=3;
		int x=a++;//5
		int y=++b;//4
		int z=a+x;//6+5=11
		System.out.println(z);
		
		int x1=a--;//5
		int y1=--b;//4
		int z1=y1+a;//4+4=8
		System.out.println(z1);
	}

}
