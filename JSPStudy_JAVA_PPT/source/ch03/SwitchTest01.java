package ch03;

public class SwitchTest01 {
	public static void main(String[] args) {
		String myDream = "DBA";
		switch (myDream) {
		case "Programer":
			System.out.println("나의 꿈이 아닙니다.");
			break;
		case "Doctor":
			System.out.println("나의 꿈이 아닙니다.");
			break;
		case "DBA":
			System.out.println("저는 DATABASE 전문가가 되고 싶습니다.");
			break;
		default:
			System.out.println("저는 꿈이 없습니다.");
			break;
		}
	}
}
