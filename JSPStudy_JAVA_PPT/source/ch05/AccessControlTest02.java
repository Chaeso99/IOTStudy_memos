package ch05;

public class AccessControlTest02 {
	
	public static void main(String[] args) {
		PrivateTest02 pv = new PrivateTest02();
		String id = pv.getId("최주호");
		System.out.println("아이디는 "+ id);
	}
}

class PrivateTest02 {

	String id;
	String key;

	private void myIdPw(){
		String pw;
		this.id = "ssarmango";
		pw = "1234";
		if(key == "최주호") {
			System.out.println("비밀번호는 "+pw);
		}
	}

	 public String getId(String key){
		this.key = key;
		myIdPw();
		return id;
	}
}