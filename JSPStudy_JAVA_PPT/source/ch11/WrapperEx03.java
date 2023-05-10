package ch11;

public class WrapperEx03 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer it1 = Integer.valueOf(n1);
		int n2 = it1.intValue();
		System.out.println("n1 + n2 : "+ (n1+n2));
		System.out.println("n1 + it1 : "+ (n1+it1.intValue()));
		
		int n3 = 20;
		Integer it2 = n3;
		int n4 = it2;
		System.out.println("n3 + n4 : " + (n3+n4));
		System.out.println("n3 + it2 : " + (n3+it2));
	}
}