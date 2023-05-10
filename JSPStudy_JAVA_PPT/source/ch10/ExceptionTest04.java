package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04 {

	public static void main(String[] args) {
		try {
			FileReader fr = 
					new FileReader("ch10/test.txt");
			int i;
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일이 없네요.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}