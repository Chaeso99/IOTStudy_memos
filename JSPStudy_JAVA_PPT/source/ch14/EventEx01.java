package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx01 extends MFrame implements ActionListener{
	
	Button btn;
	
	public EventEx01() {
		setTitle("Event Example");
		btn = new Button("³­ ¹öÆ°");
		add(btn, BorderLayout.SOUTH);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	
	public static void main(String[] args) {
		new EventEx01();
	}
}
