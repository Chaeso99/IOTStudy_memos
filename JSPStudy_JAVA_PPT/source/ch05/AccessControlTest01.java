package ch05;

public class AccessControlTest01 {
	
	public static void main(String[] args) {
		PrivateTest01 pv = new PrivateTest01();
		String id = pv.getId();
		System.out.println("아이디는 "+ id);
	}
}

class PrivateTest01 {
	String id;
	private void myIdPw(){
		String pw;
		this.id = "ssarmango";
		pw = "1234";
	}

	 public String getId(){
		myIdPw();
		return id;
	}
}