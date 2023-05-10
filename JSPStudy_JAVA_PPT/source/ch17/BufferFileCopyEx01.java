package ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopyEx01 {
	
	public static void main(String[] args){
		try {
			InputStream in = new FileInputStream("ch17/org.txt");
			OutputStream out = new FileOutputStream("ch17/cpy.txt");

			int copyByte = 0; 
			int readLen = 0;
			byte buf[] = new byte[1024];

			while(true){
				readLen=in.read(buf); 
				if(readLen == -1){ 
					break; 
				}
				out.write(buf, 0, readLen); 
				copyByte+=readLen; 
			}
			in.close();
			out.close(); 
			System.out.println("복사된 바이트 크기 : "+ copyByte);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}