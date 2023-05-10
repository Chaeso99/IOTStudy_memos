package ch18;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx01 {

	public static void main(String[] args) {
		try{  
			ServerSocket ss = new ServerSocket(15000); 
			System.out.println("서버시작~~ 클라이언트 접속 대기중!!!"); 
			Socket s = ss.accept(); 
			System.out.println(s.getRemoteSocketAddress()+" 클라이언트가 접속됨");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println("메세지 수신대기중..."); 
			String  str = dis.readUTF();
			System.out.println("메세지= "+str);  
			ss.close(); 
		}catch(Exception e){
			System.out.println(e);
		}  
	}    
}