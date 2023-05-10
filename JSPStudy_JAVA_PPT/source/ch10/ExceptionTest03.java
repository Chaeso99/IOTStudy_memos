package ch10;

import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			int a, b;
			s = new Scanner(System.in);
			System.out.println("입력 받은 두수를 나누기");
			System.out.print("첫번째숫자 : ");
			a = s.nextInt();
			System.out.print("두번째숫자 : ");
			b = s.nextInt();
			System.out.println(a + "/"+b+"="+(a/b));
		} catch (ArithmeticException e) {
			System.err.println("계산예외");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("숫자포맷예외");
		} finally {
			s.close();
		}
	}
}