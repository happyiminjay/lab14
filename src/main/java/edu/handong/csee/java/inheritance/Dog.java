package edu.handong.csee.java.inheritance;

public class Dog extends Animal{
	public static void testCalssMethod() {
		System.out.println("The static method in Dog");
	}//hiding
	@Override
	public void testInstanceMethod() {
		System.out.println("The instance method in Dog");
	}//overriding
}
