package ch12;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요. : ");
		int age = sc.nextInt();
		System.out.print("애인이 있으면 true 없으면 false를 입력하세요. : ");
		boolean lover  = sc.nextBoolean();
		System.out.println(name + " : " + age + " : " + (lover ? "애인있음":"애인없음"));
		sc.close();
	}
}