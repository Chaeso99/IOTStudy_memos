package ch04;

public class ArrayTest01 {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 20;
		ArrayTest01 arr = new ArrayTest01();
		arr.use(a, b);
		System.out.println("메인a : " +a);
		System.out.println("메인b : " +b);
	}
	
	void use(int a, int b){
		a = a+5;
		b = b+5;
		System.out.println("메소드a : " + a);
		System.out.println("메소드b : " + b);
	}
}