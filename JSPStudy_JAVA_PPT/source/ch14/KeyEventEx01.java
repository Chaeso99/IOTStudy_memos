package ch14;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx01 extends MFrame implements KeyListener {
	
	TextField tf;
	TextArea ta;

	public KeyEventEx01() {
		super(300, 300);
		setTitle("KeyEvent Example");

		ta = new TextArea();
		ta.setEditable(false);
		add(ta);
		
		tf = new TextField();
		tf.addKeyListener(this);
		add(tf ,BorderLayout.SOUTH);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		ta.append("##keyTyped  : " + e.getKeyChar()+"\n");
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		ta.append("##keyPressed  : " + KeyEvent.getKeyText(e.getKeyCode())+"\n");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		ta.append("##keyReleased  : " + e.getKeyCode()+"\n");
	}

	public static void main(String[] args) {
		new KeyEventEx01();
	}
}
