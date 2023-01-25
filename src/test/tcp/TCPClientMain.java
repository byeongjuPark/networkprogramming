package test.tcp;

public class TCPClientMain {
	public static void main(String[] args) {
		new TCPEchoClient().clientTCP("localhost", 9007);
	}

}
