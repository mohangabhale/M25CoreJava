package com.cg.array;

public class CharArryDemo {

	public static void main(String[] args) {
		char arr[]= {'A','b','1','?',' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(i));
			{
				System.out.println(arr[i]+" is a digit");
			}
		}
	}
}
