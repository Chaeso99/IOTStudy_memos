package ch13;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TextEx01 extends MFrame {
	
	TextField tf1, tf2;
	TextArea ta;
	Label label1, label2;
	
	public TextEx01() {
		super(250, 300);
		setTitle("Text Example");
		add(label1 = new Label("성명"));
		add(tf1 = new TextField("JSPStudy", 20));
		add(label2 = new Label("암호"));
		add(tf2 = new TextField("", 20));
		tf2.setEchoChar('@');
		add(ta=new TextArea(10, 30));
	}

	public static void main(String[] args) {
		new TextEx01();
	}
}