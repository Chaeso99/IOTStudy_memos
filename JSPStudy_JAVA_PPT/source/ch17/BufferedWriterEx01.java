package ch17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx01 {
	
	public static void main(String[] args) throws IOException {
		try{
			FileWriter fw = new FileWriter("ch17/abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Java Programming"); 
			bw.flush();
			bw.close(); 
			fw.close(); 
			System.out.println("파일 작성 완료");
		}catch(IOException e){
			System.out.println(e);
		}
	}
}