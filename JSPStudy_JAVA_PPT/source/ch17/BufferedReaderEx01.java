package ch17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch17/abc.txt"); 
			BufferedReader br = new BufferedReader(fr);
			String value =""; 
			while ((value = br.readLine()) != null) {
				System.out.println(value); 
			}
			br.close(); 
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
}