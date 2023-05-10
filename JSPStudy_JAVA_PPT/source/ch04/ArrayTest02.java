package ch04;

public class ArrayTest02{

	public static void main(String[] args) {
		int num[] = new int[3];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		ArrayTest02 arr = new ArrayTest02();
		arr.use(num);
		System.out.println("메인num[0] : " +num[0]);
		System.out.println("메인num[1] : " +num[1]);
		System.out.println("메인num[2] : " +num[2]);
	}

	void use(int[] num){
		num[0] = num[0] + 10;
		num[1] = num[1] + 10;
		num[2] = num[2] + 10;
		System.out.println("메서드num[0] : " +num[0]);
		System.out.println("메서드num[1] : " +num[1]);
		System.out.println("메서드num[2] : " +num[2]);
	}
}