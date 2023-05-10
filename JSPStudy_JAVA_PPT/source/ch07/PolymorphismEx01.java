package ch07;

class Animal{
	public void move(){
		System.out.println("동물아! 움직여라!"); 
	}
}

class Bird extends Animal{
	private String name="새";
	public void move(){
		System.out.println(name + "야! 날아라!");
	}
}

class Fish extends Animal{
	private String name="물고기"; 
	public void move(){
		System.out.println(name + "야! 헤엄쳐라!");
	}
}

class Cheetah extends Animal{
	private String name="치타"; 
	public void move(){
		System.out.println(name + "야! 달려라!");
	}
}

public class PolymorphismEx01 {
	static Animal[] animal;

	public static void createAnimal(int num){

		animal = new Animal[num];

		for (int i = 0; i < animal.length; i++) {

			if((i%3) == 0){
				animal[i] = new Bird();
			}else if((i%3)==1){
				animal[i] = new Fish();
			}else{
				animal[i] = new Cheetah();
			}
		}

		System.out.println(num + "마리의 동물이 생성되었습니다.");
		System.out.println("----------------(1초쉬고)------------------");

	}

	public static void moveAnimal(){

		System.out.println(animal.length + "마리의 동물을 이동시킵니다.");
		System.out.println("----------------(1초쉬고)------------------");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
	}

	public static void main(String[] args) {
		createAnimal(5);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		moveAnimal();
	}
}