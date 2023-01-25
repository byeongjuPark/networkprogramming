package test.tcp;

import java.io.*;
import java.net.*;

public class TCPEchoServer {
	public void tcpServer(int port) {
		// 서버 소켓 관련 객체 
		ServerSocket serverSock = null;
		Socket sock = null;
		InetAddress inetAddr = null;
		
		// 입출력 객체
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		
		try {
			// 서버 소켓 생성
			serverSock = new ServerSocket(port);
			while (true) {
				// 클라이언트의 접속 대기
				System.out.println("====== 클라이언트 접속 대기 중" + "(port:" + serverSock.getLocalPort() + ")=====");
				sock = serverSock.accept();
				
				
				// 클라이언트의 접속 요청
				// 사실상... 필요없는 구문...
				inetAddr = sock.getInetAddress();
				System.out.println("클라이언트(" + inetAddr.getHostAddress() + ") 접속");
				
				
				// 클라이언트와 통신을 위한 stream 생성
				// Input스트림과 Output스트림은 기능이 적기때문에 보조스트림에 담아서 스트림 형성
				//in = sock.getInputStream();
				//out = sock.getOutputStream();
				br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				wr = new PrintWriter(sock.getOutputStream());
				String msg = null;
				
				
				// 클라이언트와 통신
				while ((msg = br.readLine()) != null) {
					System.out.println("\tCLIENT> " + msg);
					wr.println(msg);
					wr.flush();
				}
				
			}
		} catch (IOException ie) {
			System.out.println(ie);
		} finally {
			try {
				if(br != null)br.close();
				if(wr != null)wr.close();
				//if(in != null)in.close();
				//if(out != null)out.close();
				if(sock != null)sock.close();
				if(serverSock != null)serverSock.close();
				System.out.println("종료.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
