package ch17;

import java.io.FileInputStream;

public class FileInputStreamEx01 {

	public static void main(String args[]){  
		try{  
			FileInputStream fin=new FileInputStream("ch17/abc.txt"); 
			int value = 0; 
			while((value = fin.read()) != -1){  
				System.out.print((char)value);  
			}  
			fin.close(); 
		}catch(Exception e){
			System.out.println(e); 
		}  
	}  
}