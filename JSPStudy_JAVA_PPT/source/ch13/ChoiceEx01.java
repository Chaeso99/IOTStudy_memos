package ch13;

import java.awt.Choice;

public class ChoiceEx01 extends MFrame {
	
	String city[] = {"도시를 선택하세요.","베를린","파 리",
			"하와이","런 던","서 울","뉴 욕"};
	Choice ch;
	
	public ChoiceEx01() {
		super(300, 200);
		setTitle("Choice Example");
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]);
		}
		add(ch);
	}

	public static void main(String[] args) {
		new ChoiceEx01();
	}
}