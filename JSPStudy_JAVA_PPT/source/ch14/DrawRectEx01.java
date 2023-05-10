package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawRectEx01 extends MFrame implements ActionListener {

	TextField tx, ty, tw, th;
	Checkbox chk;
	Checkbox rChk;
	Button btn;
	MCanvas canvas;

	public DrawRectEx01() {
		super(500, 300);
		setTitle("DrawRect Example");
		Panel p1, p2;
		p1 = new Panel();
		p1.setBackground(Color.CYAN);
		tx = new TextField("10", 3);
		ty = new TextField("10", 3);
		tw = new TextField("70", 3);
		th = new TextField("70", 3);
		Label l = new Label("x");
		p1.add(l);
		p1.add(tx);
		l = new Label("y");
		p1.add(l);
		p1.add(ty);
		l = new Label("너비");
		p1.add(l);
		p1.add(tw);
		l = new Label("높이");
		p1.add(l);
		p1.add(th);
		chk = new Checkbox("채우기");
		p1.add(chk);
		btn = new Button("그리기");
		btn.addActionListener(this);
		p1.add(btn);
		add(p1, BorderLayout.NORTH);
		canvas = new MCanvas();
		add(canvas, BorderLayout.CENTER);
		p2 = new Panel();
		p2.add(rChk = new Checkbox("색상 랜덤"));
		p2.setBackground(Color.GREEN);
		add(p2, BorderLayout.SOUTH);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		canvas.repaint();
	}

	class MCanvas extends Canvas {
		@Override
		public void paint(Graphics g) {
			int x, y, w, h;
			x = Integer.parseInt(tx.getText());
			y = Integer.parseInt(ty.getText());
			w = Integer.parseInt(tw.getText());
			h = Integer.parseInt(th.getText());
			if(rChk.getState()){
				g.setColor(MColor.rColor());
			}else{
				g.setColor(Color.BLUE);
			}
			if (chk.getState()) {
				g.fillRect(x, y, w, h);
			} else {
				g.drawRect(x, y, w, h);
			}
		}
	}

	public static void main(String[] args) {
		new DrawRectEx01();
	}
}
