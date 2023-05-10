package ch10;

public class ExceptionTest06 {
	
	int a = 100;

	public void tMethod(int b) throws Exception{
		if(b==0) {
			throw new Exception("a는 0으로 나누면 안되요.");
		} else {
			System.out.println(a+"/"+ b +" = " + (a/b));
		}
	}

	public static void main(String[] args) {
		ExceptionTest06 et = new ExceptionTest06();
		try {
			et.tMethod(10);
			et.tMethod(0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}