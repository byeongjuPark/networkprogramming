package messenger.udp;

import javax.swing.JOptionPane;

public class Run {
	public static void main(String[] args) {
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트번호를입력하세요"));
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("상대방 포트 번호를 입력하세요"));
		Messenger a = new Messenger(myPort, otherPort);
		MyFrame f = a.getMyFrame();
		f.process();
	}
}
