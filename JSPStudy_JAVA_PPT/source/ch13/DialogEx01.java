package ch13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEx01 extends MFrame implements ActionListener{
	
	Button btn;
	String title = "대화상자";
	MyDialog md;
	
	public DialogEx01() {
		super(300,200);
		setTitle("Dialog Example");
		setLayout(new BorderLayout());
		add(btn=new Button("보이기"), "South");
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(md==null)
			md = new MyDialog(this, title, true);
		int w = 100;
		int h = 100;
		int x = getX()+getWidth()/2-w/2;
		int y = getY()+getHeight()/2-h/2;
		md.setBounds(x, y, w, h);
		md.setVisible(true);
	}

	class MyDialog extends Dialog implements ActionListener{
		
		Button ok;
		
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			ok = new Button("확인");
			ok.addActionListener(this);
			add(ok);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
	}//class MyDialog
	
	public static void main(String[] args) {
		new DialogEx01();
	}
}
