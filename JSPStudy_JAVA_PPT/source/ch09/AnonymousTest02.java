package ch09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MFrame extends Frame{
	
	public MFrame() {
		setTitle("AnonymousTest02");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
}

public class AnonymousTest02 {
	public static void main(String[] args) {
		new MFrame();
	}
}