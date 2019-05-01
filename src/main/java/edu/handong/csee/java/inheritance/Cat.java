package edu.handong.csee.java.inheritance;

public class Cat extends Animal{

	public static void testCalssMethod() {
		System.out.println("The static method in Cat");
	}//hiding //static method cannot be override 
	@Override
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}//overriding it overrides Animals class method
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;//polymorphism 
		Animal dog = new Dog();////polymorphism
	
		Animal.testClassMethod();//polymorphism (use Aniaml static method)
		Cat.testCalssMethod();//use Cat static method
		Cat.testClassMethod();//use animal static method
		// static method can be used both in Cat and Animal
		myAnimal.testInstanceMethod();//polymorphism (use Cat method)
		dog.testInstanceMethod();//polymorphism (use Dog method)
		}
}

//Write comments showing overriding, hiding, and polymorphism concepts for each corresponding lines.