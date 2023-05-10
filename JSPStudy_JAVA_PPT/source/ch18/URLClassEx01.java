package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLClassEx01 {

	public static void main(String[] args) {
		try{  
			URL url = new URL("http://www.naver.com"); 

			System.out.println("Protocol: "+url.getProtocol()); 
			System.out.println("Host Name: "+url.getHost()); 
			System.out.println("Port Number: "+url.getPort()); 

			BufferedReader br =	new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

			String line = "";
			while((line = br.readLine())!=null){ 
				System.out.println(line); 
			}
			br.close(); 
		}catch(Exception e){
			System.out.println(e);
		}
	}  
}