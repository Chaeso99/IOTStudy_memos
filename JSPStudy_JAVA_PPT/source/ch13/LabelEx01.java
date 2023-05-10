package ch13;

import java.awt.Color;
import java.awt.Label;

public class LabelEx01 extends MFrame {
	
	Label label1, label2, label3;
	
	public LabelEx01() {
		super(250,200);
		setTitle("Label Example");
		String s = "오늘은 기분 좋은 목요일";
		label1 = new Label(s);
		label2 = new Label(s,Label.CENTER);
		label3 = new Label(s,Label.RIGHT);
		label1.setBackground(Color.RED);
		label2.setBackground(Color.GREEN);
		label3.setBackground(Color.BLUE);
		label3.setForeground(Color.WHITE);
		add(label1);
		add(label2);
		add(label3);
	}

	public static void main(String[] args) {
		new LabelEx01();
	}
}
