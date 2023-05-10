package ch10;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int a = 22;
		int b = 0;
		try {
			System.out.println("a+b = " + (a+b));
			System.out.println("a-b = " + (a-b));
			System.out.println("a*b = " + (a*b));
			System.out.println("a/b" + (a/b));
			System.out.println("계산이 끝났습니다.");
		} catch (Exception e) {
			System.err.println("0으로 나누면 안되요.");
			System.err.println("예외 메세지: "+e.getMessage());
		}
	}
}