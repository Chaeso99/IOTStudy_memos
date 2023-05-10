package ch06;

public class StaticTest01 {

	static int num;
	int count;

	public static void main(String[] args) {
		//count = 1;
		StaticTest01 st1 = new StaticTest01();
		st1.count = 1;
		num = 1;
		
		System.out.println("°´Ã¼»ý¼º count : "+ st1.count);
		System.out.println("static num : "+ num);
	}
}