package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public void testInetAddress(String domain) {
		//InetAddress는 기본 생성자의 접근 제한자가 default이기 때문에 new로 생성하지 않음.
		//객체 생성을 해주는 5개의 스테틱 메서드를 제공한다.
		InetAddress ip = null;
		InetAddress localhostIp = null;

		try {
			//getByName -> 도메인명을 통해 IP주소를 얻음
			ip = InetAddress.getByName(domain);
			System.out.println("HostName : " + ip.getHostName()); //도메인 출력
			System.out.println("HostAddress : " + ip.getHostAddress()); //아이피 주소 출력
			System.out.println("HostName/HostAddress : \n\t" + ip.toString()); //도메인/아이피주소 출력 toString에 /로 구분하도록 오버라이딩 되어있음.

			System.out.println("-----------------------------------");
			byte[] ipAddr = ip.getAddress(); //getAddress 의 반환형이 byte[]임...
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			System.out.print("HostAddress : ");
			for (int i = 0; i < ipAddr.length; i++) {
				// ipAddr 변수가 byte[] 자료형을 사용해서 오버플로우가 발생하기 떄문에 +256을 해줌.
				// 시험에 나올법한... 조건문...
				if (ipAddr[i] < 0)
					System.out.print(ipAddr[i] + 256); 
				else
					System.out.print(ipAddr[i]);
				System.out.print(".");
			}
			System.out.println("");
			
			System.out.println("-----------------------------------");
			//자신의 아이피(localhost)를 얻음
			localhostIp = InetAddress.getLocalHost(); 
			System.out.println("LocalHostName : " + localhostIp.getHostName());
			System.out.println("LocalHostAddress() : " + localhostIp.getHostAddress());
			System.out.println("Local HostName/HostAddress : \n\t" + localhostIp.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
