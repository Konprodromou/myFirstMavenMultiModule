package com.lynda.GetNameModule;

import java.util.Scanner;

public class GetLastNameClass {

	
	public static String getLastName() {
		
		
		System.out.println("Enter your last name");
		Scanner in = new Scanner(System.in);
		String lastName = in.nextLine();
		
		return lastName;
		
		
	}
	
}
