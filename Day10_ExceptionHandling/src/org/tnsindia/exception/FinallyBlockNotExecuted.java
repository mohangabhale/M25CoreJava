package org.tnsindia.exception;

public class FinallyBlockNotExecuted {
	
	//it is static because its is outside the main function
	public static void print()
	{
		try 
		{
			int x=12;
			int y=0;
			System.out.println("Inside try block"+x/y);
			//1.no any further statement will execute
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	public static void main(String[] args) {
		print();
	}

}
