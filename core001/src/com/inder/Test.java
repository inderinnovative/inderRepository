package com.inder;

/**
 * @author Lenovo
 *
 */
public class Test {
/**
 * @param arg
 */
public static void main(String arg[]) {
	System.out.println("JAY MAHADEV");
	// functional interface abstract method implementation
	InderFunctional ik =(x)->{System.out.println(x*2);};
	
	// call of implemented abstract method
	ik.absik(5);
	ik.ab(3, 4);
}
}
