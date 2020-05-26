package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("C:\\dev\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\FileDemo2.java");

			/*
			 * int readChar = 0; while ((readChar = fr.read()) != -1) {
			 * System.out.print((char)readChar); // 읽어서 monitor로 출력하고 싶을때 //표준 출력장치
			 * fw.write(readChar); // File로 출력하고 싶다. // 파일 출력장치 }
			 */

			int readCharCount = 0;
			char[] readChars = new char[1024];

			while ((readCharCount = fr.read(readChars)) != -1) {
				System.out.print(new String(readChars,0,readCharCount));
				// fw.write(readChars, 0, readCharCount); // 아랫줄이랑 같은의미.
				fw.write(new String(readChars,0,readCharCount));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
