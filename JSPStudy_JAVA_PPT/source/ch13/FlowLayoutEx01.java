package ch13;

import java.awt.Button;
import java.awt.FlowLayout;

public class FlowLayoutEx01 extends MFrame{
	
	Button btn[];
	String str[] = {"첫번째", "두번째", "세번째", "네번째", "다섯번째"};
	FlowLayout fl = null;
	
	public FlowLayoutEx01() {
		super(300,100);
		setTitle("FlowLayout Example");
		setLayout(fl = new FlowLayout());
		fl.setHgap(0);
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			add(btn[i]);
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx01();
	}
}