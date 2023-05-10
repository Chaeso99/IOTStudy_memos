package ch05;

public class OverRidingTest02 extends Over2{

	public static void main(String args[]){
		OverRidingTest02 ov = new OverRidingTest02();
		ov.use();
	}

	@Override
	void use() {
		System.out.println("자식입니다.");
	}
}

class Over2 {
	void use(){
		System.out.println("부모입니다.");
	}
}