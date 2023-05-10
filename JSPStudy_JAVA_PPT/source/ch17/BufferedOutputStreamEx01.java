package ch17;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx01 {
	
	public static void main(String args[]){ 
		try {
			FileOutputStream fout = new FileOutputStream("ch17/abc.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String str = "Java Programming"; 
			byte[] values = str.getBytes();
			bout.write(values);

			bout.flush(); 
			bout.close();
			fout.close(); 
			System.out.println("파일 작성 완료");  
		} catch (Exception e) {
			System.out.println(e);
		}
	} 
}