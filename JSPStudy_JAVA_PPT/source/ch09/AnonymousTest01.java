package ch09;

interface MyInter{
	void prn();
}

public class AnonymousTest01 {
	public static void main(String[] args) {
		new MyInter() {
			@Override
			public void prn() {
				System.out.println("객체 선언과 동시에 생성을 하고 메소드를 실행합니다.");
			}
		}.prn();
	}
}