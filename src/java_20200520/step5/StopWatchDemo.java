package java_20200520.step5;

//ctr + shift + o => 상위 줄에import 변수 생성
import java.io.BufferedReader;
import java.io.FileReader;

public class StopWatchDemo {

	public static void run(StopWatch s1) {
		
		s1.execute();
	}
	public static void main(String[] args) throws Exception{
		
		//StopNanoWatch s1 = new StopNanoWatch();
		// StopMilliWatch s1 = new StopMilliWatch();
		// StopMicroWatch s1 = new StopMicroWatch();
		// run(s1);

		// Java IO 21-22
		BufferedReader br = new BufferedReader(        //ctr + shift + o => 상위 줄에import 변수 생성
				new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));
		
		String readLine = br.readLine();
		
		// Java Reflection 27-28
		Class clazz = Class.forName(readLine);
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
	}

}
