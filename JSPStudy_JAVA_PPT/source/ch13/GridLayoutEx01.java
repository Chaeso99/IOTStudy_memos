package ch13;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

public class GridLayoutEx01 extends MFrame {
	
	public GridLayoutEx01() {
		setTitle("GridLayout Example");
		setLayout(new GridLayout(3,2));
		add(new Button("1"));
		add(new Button("2"));
		add(new Label("호호"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Label("하하"));
	}

	public static void main(String[] args) {
		new GridLayoutEx01();
	}
}
