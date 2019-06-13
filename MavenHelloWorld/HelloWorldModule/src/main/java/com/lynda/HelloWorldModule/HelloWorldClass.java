package com.lynda.HelloWorldModule;
import com.lynda.GetNameModule.GetLastNameClass;
import com.lynda.GetNameModule.GetNameClass;

public class HelloWorldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Java programmers!");
		System.out.println("Thanks for joining " + GetNameClass.getName() + " " + GetLastNameClass.getLastName());
	}

}
