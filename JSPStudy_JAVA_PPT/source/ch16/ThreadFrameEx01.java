package ch16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ThreadFrameEx01 extends Frame implements Runnable{
	
	Random r = new Random();
	int x ,y;
	Color c;
	
	public ThreadFrameEx01(int x, int y, Color c) {
		this.c = c;
		setBounds(x, y, 300, 300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setResizable(false);
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				x = r.nextInt(300);
				y = r.nextInt(300);
				repaint();
				Thread.sleep(500);
			}
		} catch (Exception e) {}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	public static void main(String[] args) {
		ThreadFrameEx01 f1 = 
				new ThreadFrameEx01(0,0,Color.green);
		ThreadFrameEx01 f2 = 
				new ThreadFrameEx01(350,0,Color.pink);
		new Thread(f1).start();
		new Thread(f2).start();
	}
}