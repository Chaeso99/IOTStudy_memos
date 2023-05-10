package ch13;

import java.awt.Canvas;
import java.awt.Color;

public class CanvasEx01 extends MFrame{
	
	Canvas cv;
	
	public CanvasEx01() {
		setTitle("Canvas Example");
		cv = new Canvas();
		cv.setSize(100, 100);
		cv.setBackground(Color.RED);
		add(cv);
	}
	
	public static void main(String[] args) {
		new CanvasEx01();
	}
}
