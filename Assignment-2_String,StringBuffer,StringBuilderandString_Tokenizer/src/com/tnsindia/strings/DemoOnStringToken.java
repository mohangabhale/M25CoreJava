package com.tnsindia.strings;

import java.util.StringTokenizer;

public class DemoOnStringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Lets try this");  
	    System.out.println(st.nextToken());  
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	}

}
