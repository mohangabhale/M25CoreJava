package org.tnsindia.thiskeyword;
//2. this can be passed as argument in the constructor call
class B
{
	public String name;
	public int id;
	B (String name,int id)
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
public class DemoOnThisKeywordConstructor {

	public static void main(String[] args) {
		B b=new B("Mohan",12);
		b.print();
	}

}
