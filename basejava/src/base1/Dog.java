package base1;

abstract class Animal{
	abstract void sound();
	abstract void speak();
	void behave() {
		System.out.println("This is abstarct method demo");
	}
	
}
class Human extends Animal{
	void sound() {
		System.out.println("Man sounds good");
	}
	void speak() {
		System.out.println("Man speaks English");
	}
}
public class Dog extends Animal  {

	  void sound() {
		System.out.println("Woof");
	}
	void speak() {
		System.out.println("Dogs never speaks");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.speak();
		Human h = new Human();
		h.sound();
		h.speak();
		Dog a = new Dog();
	}
}
