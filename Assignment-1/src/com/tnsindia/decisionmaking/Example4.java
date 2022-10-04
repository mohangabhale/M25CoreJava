package com.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//switch case used for multibranching statement
		Scanner s=new Scanner(System.in);
		//int a=s.nextInt();
		char a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Mohan");
			break;
		
		case 'b':
			System.out.println("Supriya");
			break;
		case 'c':
			System.out.println("Mangesh");
			break;
		default:
			System.out.println("invalid inpur");
			s.close();
		}
	}

}
