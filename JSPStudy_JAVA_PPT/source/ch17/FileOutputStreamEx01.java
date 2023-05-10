package ch17;

import java.io.FileOutputStream;

public class FileOutputStreamEx01 {
	
	public static void main(String args[]){  
		try{  
			FileOutputStream fout=new FileOutputStream("ch17/abc.txt");
			String str="Java Programming";
			byte values[] = str.getBytes(); 
			fout.write(values); 
			fout.close();
			System.out.println("파일 작성 완료");
		}catch(Exception e){
			System.out.println(e); 
		}  
	}
}