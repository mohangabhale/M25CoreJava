package org.tnsindia.junit5demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display()
	{
		System.setProperty("Mohan", "mont");
		//will evaluate the given assumption and if it results in true then the given test is allowed to execute 
		Assumptions.assumeTrue("m".equals(System.getProperty("Shiwani")));
	}
	@Test
	void display1()
	{
		System.setProperty("Shiwani", "mont");
		//Will evaluate the given assumption and test will run if result is false.
		Assumptions.assumeFalse("monty".equals(System.getProperty("Mohan")));
	}


}
