package ch18;

import java.net.InetAddress;

public class InetAddressEx01 {

	public static void main(String[] args) {
		try {
			InetAddress inet = InetAddress.getByName("www.naver.com");
			System.out.println("Host Name: " + inet.getHostName());
			System.out.println("IP Address: " + inet.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}