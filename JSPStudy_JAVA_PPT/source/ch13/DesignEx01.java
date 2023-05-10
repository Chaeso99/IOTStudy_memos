package ch13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


public class DesignEx01 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx01() {
		super(250,150);
		setLayout(new BorderLayout());
		setTitle("AWT 실행");
		//////////////////////////////////////////////////////////
		label = new Label("과일중에 선택",Label.CENTER);
		label.setBackground(Color.green);
		//////////////////////////////////////////////////////////
		cbg = new CheckboxGroup();
		Panel p1 = new Panel();
		p1.add(cb1=new Checkbox("사과",cbg,false));
		p1.add(cb2=new Checkbox("딸기",cbg,true));
		p1.add(cb3=new Checkbox("앵두",cbg,false));
		//////////////////////////////////////////////////////////
		Panel p2 = new Panel();
		p2.add(btn1=new Button("Start"));
		p2.add(btn2=new Button("End"));
		//////////////////////////////////////////////////////////
		add("North",label);
		add(p1);
		add(p2,"South");
	}	

	public static void main(String[] args) {
		new DesignEx01();
	}

}

