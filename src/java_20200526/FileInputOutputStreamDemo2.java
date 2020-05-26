package java_20200526;
// 꼭 외워야할 코드
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {

		FileInputStream fis = null; // try 블록 바깥에서 선언하는 이유 : Finally 블록에서 사용하기 위해서.
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jre-8u251-windows-x64.exe"); // 객체생성.
			fos = new FileOutputStream("c:\\dev\\jre2.exe"); // 객체생성.

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8]; // 읽은 값은 다 readByte에 저장한다.

			// fis.read(readBytes) : FileInputStram에 8192바이트를 (계속)읽어서
			// readBytes에 저장하고 은 바이트수를 반환한다.

			while ((readByteCount = fis.read(readBytes)) != -1) {
				// ((readBytes,0,readByteCount) : 0바이트 수 부터 readByteCunt 수만큼 반환한다.
				fos.write(readBytes, 0, readByteCount);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
