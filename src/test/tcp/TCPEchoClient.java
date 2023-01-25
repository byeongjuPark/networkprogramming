package test.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPEchoClient {
	public void clientTCP(String ip, int port) {
		// 소켓 생성
		Socket sock = null;
		
		// 입출력 객체
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		BufferedReader stdin = null;
		
		try {
			// 서버로 접속
			sock = new Socket(ip, port);
			System.out.println("접속성공 !!");
			// 서버와 통신을 위한 stream, 표준입력 변수
			//in = sock.getInputStream();
			//out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			wr = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			//입력을 받아오기 위한 보조스트림 (스캐너 대신 쓰는 느낌...)
			stdin = new BufferedReader(new InputStreamReader(System.in));
			
			String msg = null;
			String echo = null;
			// 서버와 통신
			do {
				System.out.print("\tInsert Msg > ");
				msg = stdin.readLine();
				// "exit" 입력으로 접속 끊기
				if (msg.equals("exit")) {
					//msg = null; (do~while 탈출조건 대체 가능)
					sock.close();
					break;
				}
				// 에코 메시지 출력
				// 플러시 하고...???
				wr.println(msg);
				wr.flush();
				echo = br.readLine();
				//System.out.println("\tSERVER> " + echo);
			} while (msg != null);
		} catch (IOException ie) {
			System.out.println(ie);
		} finally {
			try {
				stdin.close();
				br.close();
				wr.close();
				//in.close();
				//out.close();
				sock.close();
				System.out.println("종료.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
