package edu.handong.csee.java.inheritance;

public class Cat extends Animal{

	public static void testCalssMethod() {
		System.out.println("The static method in Cat");
	}//hiding
	@Override
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}//overriding
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal dog = new Dog();
	
		Animal.testClassMethod();//polymorphism (use Aniaml static method)
		Cat.testCalssMethod();//use Cat static method
		Cat.testClassMethod();//use animal static method
		myAnimal.testInstanceMethod();//polymorphism (use Cat method)
		dog.testInstanceMethod();//polymorphism (use Dog method)
	}
}

//Write comments showing overriding, hiding, and polymorphism concepts for each corresponding lines.