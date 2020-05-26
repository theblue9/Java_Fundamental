package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		InputStream in = System.in; // 표준 입력장치와 연결 => 키보드. System.in : 키보드랑 연결되어있다.
		InputStreamReader isr = null;	// 1바이트를 2바이트로 바꿔주는 클래스.
		BufferedReader br = null;
		
		try {
			// readByteCount : 반환값
			// in.read(b) : 입력을 기다리고있고,키보드 입력중에 enter치면 키보드에 입력한 데이터를 b에 저장시킨다.
			/*
			 * byte[] b = new byte[100];
			System.out.print("입력하세요>");
			
			
			int readByteCount = 0; // 입력을 기다리고있다.
			
			while((readByteCount = in.read(b)) != -1) {
			String str = new String(b,0,readByteCount);
			System.out.println(str); // str로 출력시키겠습니다.
			System.out.print("입력하세요>");
			}
			*/
			isr = new InputStreamReader(in);	// in은 키보드에 연결되어있음.
			br = new BufferedReader(isr);
			String readLine = null;
			System.out.println("입력하세요>");
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 키보드값을 얻으려면 이것을 선언해야된다.

	}

}