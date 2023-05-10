package ch17;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx01 {
	
	public static void main(String args[]){  
		try{  
			FileInputStream fin=new FileInputStream("ch17/abc.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int value = 0;
			while((value = bin.read())!=-1){
				System.out.print((char)value);
			}  
			bin.close();
			fin.close();
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}