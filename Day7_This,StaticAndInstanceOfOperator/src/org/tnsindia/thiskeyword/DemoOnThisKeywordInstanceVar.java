package org.tnsindia.thiskeyword;
//1. this keyword is used to refer the current class instance variable
class A
{
	public String name;
	public int id;
	public void accept(String name,int id)
	{
		// this keyword is used here to refer current class var
		this.name=name;
		this.id=id;
	}
	//User defined method
	public void print()
	{
		System.out.println("The name is: "+name);
		System.out.println("The id is: "+id);
	}
}
public class DemoOnThisKeywordInstanceVar {

	public static void main(String[] args) {
		A a=new A();
		a.accept("mohan",12);
		a.print();
	}

}
