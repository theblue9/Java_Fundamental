package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStramDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\dev\\jre-8u251-windows-x64.exe");	//읽을대상 : 소스
			fos = new FileOutputStream("C:\\dev\\jre-8u251-windows-x64.exe");	//출력대상 : destination

			// 외워야될 코드.(18~23)
			int readByte = 0;	// 변수 선언 읽을 값이 없으므로 값이 0
			// fis.read() : 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면 -1을 반환한다.
			while ((readByte = fis.read()) != -1) { // fis.read() = 읽을 바이트를  // readByte = 저장해줌.
				// fos.write(~) : 한 바이트 쓰기
				fos.write(readByte);	// fos.write : 읽은 바이트를 // readByte : 써준다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
