package ch14;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageEx01 extends MFrame{
	
	Image img;
	
	public ImageEx01() {
		super(500, 350);
		setTitle("Image Example");
		img = Toolkit.getDefaultToolkit().getImage("ch14/aaa.jpg");
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageEx01();
	}
}