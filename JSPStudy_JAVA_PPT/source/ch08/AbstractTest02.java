 package ch08;

 abstract class Animal { 
 
	 abstract void speak(); 
	
	 void listen() { 
		System.out.println("µè´Ù"); 
	 }
 }
 
 public class AbstractTest02 extends Animal{

 	@Override
 	void speak() {
 		System.out.println("¸»ÇÏ´Ù");
	}

	public static void main(String[] args) {
		AbstractTest02 abs = new AbstractTest02(); 
		abs.speak(); 
		abs.listen(); 
	}
}