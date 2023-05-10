package ch13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx02 extends MFrame implements ActionListener{
	
	TextArea ta;
	TextField tf;
	Button btn;
	
	public TextEx02() {
		super(250, 200);
		setTitle("Text Example");
		setLayout(new BorderLayout());
		add(ta = new TextArea());
		ta.setEditable(false);
		Panel p = new Panel();
		p.add(tf = new TextField(22));
		p.add(btn = new Button("SEND"));
		tf.addActionListener(this);
		btn.addActionListener(this);
		add("South", p);
		tf.requestFocus();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = tf.getText();
		if(s.length()==0)
			s="입력을 하세요.";
		ta.append(s);
		ta.append("\n");
		tf.setText("");
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		new TextEx02();
	}
}