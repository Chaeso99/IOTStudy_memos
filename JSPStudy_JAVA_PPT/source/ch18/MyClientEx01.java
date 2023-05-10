package ch18;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClientEx01 {

	public static void main(String[] args) {
		try{      
			Socket s = new Socket("localhost", 15000); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("메세지를 입력하세요 : ");
			String str = br.readLine(); 
			dout.writeUTF(str); 
			dout.flush(); 
			dout.close();
			s.close(); 
		}catch(Exception e){
			System.out.println(e);
		}
	}  
}  