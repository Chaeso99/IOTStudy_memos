package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx02 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(20000);
			System.out.println("서버시작~~ 클라이언트 접속 대기중!!!"); 
			Socket s = ss.accept(); 
			System.out.println(s.getRemoteSocketAddress()+" 클라이언트가 접속됨");
			DataInputStream din = new DataInputStream(s.getInputStream()); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			String strIn = "";
			String strOut = ""; 
			
			while(!strIn.equals("stop")){ 
				System.out.println("메세지 수신대기중..."); 
				strIn = din.readUTF(); 
				System.out.println("클라이언트로부터 오는 수신메세지: "+strIn);
				strOut = "echo: "+strIn; 
				dout.writeUTF(strOut); 
				dout.flush(); 
			}  
			
			din.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}