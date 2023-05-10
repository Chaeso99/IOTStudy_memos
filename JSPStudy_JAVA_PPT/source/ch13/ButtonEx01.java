package ch13;

import java.awt.Button;

public class ButtonEx01 extends MFrame {
	
	Button btn1, btn2;

	public ButtonEx01() {
		super(250,150);
		setTitle("Button Example");
		add(btn1 = new Button("Start"));
		add(btn2 = new Button("Stop"));
	}

	public static void main(String[] args) {
		new ButtonEx01();
	}
}
