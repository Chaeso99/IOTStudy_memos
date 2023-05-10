package ch03;
public class PassWord {
	public static void main(String[] args) {
		int pw = 86215334;
		for (int i = 0; i<100000000; i++){
			if (i == pw){
				System.out.println("당신의 현관문의 비밀번호는 "+i+"입니다.");
			}
		}
	}
	void ss(){
		System.out.println("하이");
	}
}