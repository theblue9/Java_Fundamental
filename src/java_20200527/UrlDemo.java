package java_20200527;


// 1.url에있는 각각의 정보를 얻어올수있는 각종의 메소드 제공
// 2. 
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://gdimg.gmarket.co.kr/1803177701/still/280?ver=1588749619");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol :" +protocol);
		System.out.println("host :"+host);
		System.out.println("port :"+port);
		System.out.println("path :"+path);
		System.out.println("query :"+query);
		System.out.println("reference :"+reference);
		
		System.out.println("===================================================================================");
		
		/* 
		 * 텍스트일떄 가져오는 법.
		InputStream in = url.openStream();	//	html 정보 (2byte)
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		InputStream in = url.openStream(); // html의 정보를 가져오는법 // 이미지정보
		FileOutputStream fos = new FileOutputStream("c:\\dev\\300.jpg");
		
		byte[] readBytes = new byte[1024*8];
		int readByteCount = 0;
		while((readByteCount = in.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteCount);
		}
		 in.close();
		 fos.close();
		 
	}

}
