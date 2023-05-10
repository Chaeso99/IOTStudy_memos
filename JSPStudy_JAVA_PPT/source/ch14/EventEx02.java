package ch14;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx02 extends MFrame{
	
	Checkbox rcb, gcb, bcd;
	CheckboxGroup grp;
	
	public EventEx02() {
		setTitle("Event Example");
		Panel p = new Panel();
		grp = new CheckboxGroup();
		p.add(rcb = new Checkbox("RED",grp,false));
		p.add(gcb = new Checkbox("GREEN",grp,false));
		p.add(bcd = new Checkbox("BLUE",grp,false));
		add(p, BorderLayout.SOUTH);
		MyItem mi = new MyItem();
		rcb.addItemListener(mi);
		gcb.addItemListener(mi);
		bcd.addItemListener(mi);
	}
	
	class MyItem implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getSource();
			if(cb==rcb){
				setBackground(Color.RED);
			}else if(cb==gcb){
				setBackground(Color.GREEN);
			}else if(cb==bcd){
				setBackground(Color.BLUE);
			}
		}
	}
	
	public static void main(String[] args) {
		new EventEx02();
	}
}