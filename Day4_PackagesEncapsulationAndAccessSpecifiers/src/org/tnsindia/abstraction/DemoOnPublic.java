package org.tnsindia.abstraction;
//Demo on Public access specifier

class B
{
	//if any data member is public the visibility is in any class
	public String dob="12-01-1995";
	public void display()
	{
		System.out.print("The DOB is: "+dob);
	}
}

public class DemoOnPublic {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}
