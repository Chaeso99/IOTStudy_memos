package ch04;

public class MethodTest02 {

	public static void main(String[] args) {
		MethodTest02 mt = new MethodTest02();
		mt.morningTest();
		System.out.println("학교를 갔다가");
		System.out.println("집에와서");
		mt.morningTest();
	}
	public void morningTest() {
		System.out.println("발을 씻고");
		System.out.println("세수를 하고");
		System.out.println("머리를 감고");
		System.out.println("이빨을 닦고");
	}
}