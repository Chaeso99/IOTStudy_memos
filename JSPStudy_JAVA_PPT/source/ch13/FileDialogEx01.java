package ch13;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogEx01 extends MFrame implements ActionListener{
	
	FileDialog openFile, saveFile;
	Button b1, b2;
	
	public FileDialogEx01() {
		setTitle("FileDialog Example");
		openFile = new FileDialog(this,"파일 열기",FileDialog.LOAD);
		saveFile = new FileDialog(this,"파일 저장",FileDialog.SAVE);
		Panel p = new Panel();
		p.add(b1= new Button("파일 열기"));
		p.add(b2= new Button("파일 저장"));
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(p);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			openFile.setVisible(true);
		}else if(e.getSource()==b2){
			saveFile.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new FileDialogEx01();
	}
}
