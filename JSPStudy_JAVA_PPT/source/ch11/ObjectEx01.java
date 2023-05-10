package ch11;

class Point01{
	
}

public class ObjectEx01 {
	public static void main(String[] args) {
		Point01 p = new Point01();
		System.out.println("클래스이름 : " + p.getClass());
		System.out.println("해쉬코드 : " + p.hashCode());
		System.out.println("객체문자열 : " + p.toString());
		System.out.println("=======================");
		Point01 p1 = new Point01();
		System.out.println("클래스이름 : " + p1.getClass());
		System.out.println("해쉬코드 : " + p1.hashCode());
		System.out.println("객체문자열 : " + p1.toString());
		String s = new String("하하");
		System.out.println(s.toString());//오버라이딩
	}
}