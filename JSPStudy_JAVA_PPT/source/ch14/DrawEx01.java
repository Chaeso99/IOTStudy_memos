package ch14;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawEx01 extends MFrame{
	
	MCanvas canvas;
	
	public DrawEx01() {
		super(500, 300);
		setTitle("Draw Example");
		setBackground(Color.WHITE);
		add(canvas = new MCanvas());
	}

	class MCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.drawLine(10, 10, 100, 100);
			g.setColor(Color.GREEN);
			g.fillRect(150, 30, 150, 100);
			g.setColor(Color.BLUE);
			g.drawOval(320, 30, 150, 100);
			g.setColor(MColor.rColor());
			g.fillArc(50, 150, 150, 200, 30, 130);
			g.setColor(MColor.rColor());
			g.fillRoundRect(250, 150, 150, 100, 70, 70);
		}
	}
	
	public static void main(String[] args) {
		new DrawEx01();
	}
}
