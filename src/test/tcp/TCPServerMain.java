package test.tcp;

public class TCPServerMain {
	public static void main(String[] args) {
		new TCPEchoServer().tcpServer(9007);
	}

}
