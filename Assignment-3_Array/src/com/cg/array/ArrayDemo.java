package com.cg.array;



public class ArrayDemo {

	public static void main(String[] args) {
		
		/*int arr[]= new int[3] {11,22,33};
		 * do not declare the size at the end if you are initializing array
		 */
		int arr[]= new int[] {11,22,33};
		System.out.println("The array index value is: "+arr[2]);
		/*Array index out of bound exception as index is 3 we are accessing 
		 and last index is 2
		System.out.println("The array index value is: "+arr[3]); */
		
	}

}
