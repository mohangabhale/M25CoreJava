package org.tnsindia.inheritance;

import java.util.Scanner;

//Demo on single Inheritance
//parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The animal is: "+name);
	}
}
// child class
class Dog extends Animal
{
	public String Breed;
	public void print()
	{
		System.out.println("The Dog Breed Is: "+Breed);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of animal");
		String name1=s.nextLine();
		System.out.println("Enter the breed of the animal ");
		String Breed1=s.nextLine();
		Dog d=new Dog();
		d.Breed=Breed1;
		d.name=name1;
		
		d.display();
		d.print();
		s.close();
		
	}

}
