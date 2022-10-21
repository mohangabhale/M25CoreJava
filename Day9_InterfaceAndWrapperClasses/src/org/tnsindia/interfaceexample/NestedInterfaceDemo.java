package org.tnsindia.interfaceexample;
import java.util.Scanner;

import org.tnsindia.interfaceexample.interfaceouter;
//program on nested interface
interface interfaceouter
{
	//abstract method by default
	void print();
	interface InnerInterface
	{
		//abstract method by default
		void display();
	}
	
}
class ImplementableClass implements org.tnsindia.interfaceexample.interfaceouter.InnerInterface
{

	@Override
	public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		s.close();
	}
	
}
class ImplementableClassp implements interfaceouter
{

	@Override
	public void print() {
		System.out.println("working on nested interface");
	}

	
	}
public class NestedInterfaceDemo {

	public static void main(String[] args) {
		ImplementableClass i=new ImplementableClass();
		i.display();
		ImplementableClassp i1=new ImplementableClassp();
		i1.print();
	
		
	}

}
