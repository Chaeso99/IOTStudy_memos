package ch10;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
		} catch (Exception e) {
			System.err.println("배열 에러입니다.");
		} finally {
			System.out.println("finally");
		}
	}
}