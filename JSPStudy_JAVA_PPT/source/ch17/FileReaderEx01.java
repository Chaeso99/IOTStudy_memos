package ch17;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx01 {
	
	public static void main(String args[])throws IOException{
		
		File file = new File("ch17/abc.txt");
		FileReader fr = new FileReader(file); 
		char [] values = new char[50]; 
		fr.read(values); //
		for (int i = 0; i < values.length; i++) { 
			char c = values[i];
			System.out.print(c);
		}
		fr.close();
	}
}