package test.inet;

import java.net.*;
public class TestINetAddress {
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress test
		InetAddress ip1 = InetAddress.getLocalHost();
		System.out.println(ip1.getHostAddress());
		System.out.println(ip1.getHostName());
		InetAddress ip2 = InetAddress.getByName("www.naver.com");
		InetAddress[] ipes = InetAddress.getAllByName("www.google.com");
		System.out.println("naver : " + ip2.getHostAddress());
		System.out.println("google 의 서버는 " + ipes.length + "개 있습니다.");
		for(InetAddress ip : ipes)
		System.out.println(ip.getHostAddress());
		InetAddress[] ipes2 = InetAddress.getAllByName("www.naver.com");
		System.out.println("naver 의 서버 ip는" + ipes2.length + "개 있습니다.");
		for(InetAddress ip : ipes2)
		System.out.println(ip.getHostAddress());
	}
}
