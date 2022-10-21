package org.tnsindia.customexception;
//Example on Custom Exception

class SimpleCustomException extends Exception
{
	public String str;

	//constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
	
	
}
public class SimpleCustomExceptionDemo {

	public static void main(String[] args)  {
		/* in oder to use our own custom Exception, we have to create a new object of the class
		 * and throw it using the  throw keyword
		 */
		try {
			throw new SimpleCustomException("user-defined Exception example Demo");

		}
		
		catch(SimpleCustomException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
