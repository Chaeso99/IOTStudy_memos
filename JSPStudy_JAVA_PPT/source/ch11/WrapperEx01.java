package ch11;

public class WrapperEx01 {
	public static void main(String[] args) {
		Integer it1 = new Integer(10);
		Integer it2 = new Integer("20");
		int n1 = it1.intValue();
		int n2 = it2.intValue();
		int n3 = n1+n2;
		System.out.println("n3 : " + n3);
		String s1 = "30";
		String s2 = "30";
		System.out.println(s1+s2);
		int n4 = Integer.parseInt(s1);
		int n5 = Integer.parseInt(s2);
		System.out.println("n4 + n5 : " + (n4+n5));
		System.out.println("int형의 최소값 : " + Integer.MAX_VALUE);
		System.out.println("n5의 2진수값 : " + Integer.toBinaryString(n5));
	}
}