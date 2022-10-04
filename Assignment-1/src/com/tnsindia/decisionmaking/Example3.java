package com.tnsindia.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		int age=15, weight=55;
		//Nested if
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=100)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("Extra rope will be added");

				}
					
			}
			else
			{
				System.out.println("Not Eligible to bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not Eligible to bunjee jumping");

		}
	}

}
