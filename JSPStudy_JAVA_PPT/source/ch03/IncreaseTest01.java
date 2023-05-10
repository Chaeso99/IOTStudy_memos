package ch03;
public class IncreaseTest01 {
	public static void main(String[] args) {
		//후증가
		int num1 = 10;
		int num2 = 2;
		System.out.println(num1++);
		System.out.println(num2--);
		System.out.println(num1);
		System.out.println(num2);
		//선증가
		int num3 = 10;
		int num4 = 2;
		System.out.println(++num3);
		System.out.println(--num4);
	}
}
