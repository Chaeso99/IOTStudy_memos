package ch11;

public class MathEx01 {
	public static void main(String[] args) {
		int a = -3;
		int b = 2;
		int c = 9;
		double d = 3.45;
		
		System.out.println("반지름 5인 원의 넓이 : " + 5*5*Math.PI);
		System.out.println("절대값 : " + Math.abs(a));
		System.out.println("최대값 : " + Math.max(a,b));
		System.out.println("제곱근값 : " + Math.sqrt(c));
		System.out.println("반올림값 : " + Math.round(d));
		System.out.println("버림값 : " + Math.floor(d));
		System.out.println("올림값 : " + Math.ceil(d));
		System.out.println("1~6사이의 난수: "+((int)(Math.random()*6)+1));
	}
}