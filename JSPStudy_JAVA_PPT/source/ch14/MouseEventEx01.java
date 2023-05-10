package ch14;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx01 extends MFrame implements MouseListener{

	public MouseEventEx01() {
		setTitle("Mouse Example");
		addMouseListener(this);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(MColor.rColor());
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(MColor.rColor());
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	public static void main(String[] args) {
		new MouseEventEx01();
	}
}