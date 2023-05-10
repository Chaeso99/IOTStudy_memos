package ch05;

public class AccessControlTest03 extends ProtectedTest01{
	
	public static void main(String[] args) {
		AccessControlTest03 ac = new AccessControlTest03();
		ac.myIdPw();
	}
}

class ProtectedTest01 {
	protected void myIdPw(){
		System.out.println("자식만 실행 가능하다");
	}
}
