package ch05;

public class OverRidingTest01 extends Over{

	public static void main(String args[]){
		OverRidingTest01 ov = new OverRidingTest01();
		ov.use();
	}

	@Override
	void use() {
		super.use();
	}
}

class Over {
	void use(){
		System.out.println("부모입니다.");
	}
}