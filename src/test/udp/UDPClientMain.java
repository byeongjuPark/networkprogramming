package test.udp;

public class UDPClientMain {
	public static void main(String[] args) {
		new UDPEchoClient().clientUDP("localhost");
		}
}
