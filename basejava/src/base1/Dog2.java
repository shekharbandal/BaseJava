package base1;

abstract class Animal1{
	abstract void sound();
	abstract void speak();
	void behave() {
		System.out.println("This is abstarct method demo");
	}
	
}
class Human1 extends Animal1{
	void sound() {
		System.out.println("Man sounds good");
	}
	void speak() {
		System.out.println("Man speaks English");
	}
}
public class Dog2 extends Animal1  {

	  void sound() {
		System.out.println("Woof");
	}
	void speak() {
		System.out.println("Dogs never speaks");
	}
	
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.sound();
		d.speak();
		Human1 h = new Human1();
		h.sound();
		h.speak();
		Dog2 a = new Dog2();
	}
}
