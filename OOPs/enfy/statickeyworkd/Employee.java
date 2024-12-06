package com.enfy.statickeyworkd;

import static java.util.Arrays.*;

//import java.util.Arrays;

public class Employee extends User {
	
	public static void doAnyStaticAction() {
		System.out.println("Static method in Employee class is called.");
	}
}