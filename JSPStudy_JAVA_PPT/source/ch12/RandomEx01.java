package ch12;

import java.util.Random;

public class RandomEx01 {
	public static void main(String[] args) {
		Random r = new Random();
		int n1 = r.nextInt();
		System.out.println("n1 : " + n1);
		int n2 = r.nextInt(45)+1;
		System.out.println("n2 : " + n2);
		double d1 = r.nextDouble();
		System.out.println("d1 : " + d1);
		boolean b1 = r.nextBoolean();
		System.out.println("b1 : " + b1);
		Random r1 = new Random(3);
		Random r2 = new Random(3);
		System.out.println("r1의 난수 : " + r1.nextInt(100));
	    System.out.println("r2의 난수 : " + r2.nextInt(100));
	}
}