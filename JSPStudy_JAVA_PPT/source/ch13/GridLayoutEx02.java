package ch13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class GridLayoutEx02 extends MFrame {
	
	String str = "GridLayout Example";
	Label label;
	Button btn[];
	String s[] = {"add", "remove", "removeall", "exit"};
	List list;
	
	public GridLayoutEx02() {
		setTitle(str);
		setLayout(new BorderLayout());	
		label = new Label(str, Label.CENTER);
		add(label, BorderLayout.NORTH);
	
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		btn = new Button[4];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(s[i]);
			p.add(btn[i]);
		}
		add(BorderLayout.EAST,p);

		list = new List();
		list.add("¹°¹Ð¸é");
		list.add("ºñºö¹Ð¸é");
		list.add("¿Õ¸¸µÎ");
		add(list,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx02();
	}
}
