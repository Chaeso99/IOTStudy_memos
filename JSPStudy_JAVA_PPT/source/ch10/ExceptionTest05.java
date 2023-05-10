package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {
	
	public static void main(String[] args) {
		try {
			FileReader fr = myRead("ch10/test2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static FileReader myRead(String name) 
			throws FileNotFoundException{
		FileReader fr = new FileReader(name);
		return fr;
	}
}