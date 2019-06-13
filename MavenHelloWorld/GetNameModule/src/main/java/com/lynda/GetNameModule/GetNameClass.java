package com.lynda.GetNameModule;

import java.util.Scanner;

public class GetNameClass {

	
	public static String getName() {
		
		
		System.out.println("Enter your name: ");
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		return name;
		
	}
	
	
}
