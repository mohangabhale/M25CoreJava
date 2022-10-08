package org.tnsindia.packagexample;

import java.util.Scanner;

// Importing the package
import org.tnsindia.packagedemo.*;

//import org.tnsindia.packagedemo.PackageDemo;

public class PackageClient {

	public static void main(String[] args) {
		/* we are accessing the method of packageDemo class
		   import the package of the specified class */
		// object creation
		
		//user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();
	}

}
