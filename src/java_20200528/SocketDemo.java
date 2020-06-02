package java_20200528;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {
	public static void main(String[] args) {
		Socket socket = null;

		for (int i = 22; i <= 80; i++) {

			try {
				socket = new Socket("192.168.0.128", i); // 80 443 22
				System.out.println(i + "번 포트가 열려있습니다.");
			} catch (UnknownHostException e) {
				System.err.println("호스트가 없습니다.");
			} catch (IOException e) {
				System.err.println(i+ "번포트가 닫혀 있습니다.");
			}
		}
	}

}
