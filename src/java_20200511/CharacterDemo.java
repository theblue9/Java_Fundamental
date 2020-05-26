package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		// 1. 유니코드 표현 => '\u0000'
		char c1 = '\uCD5C';
		char c2 = '\uC7AC';
		char c3 = '\uD638';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		// 2. 아스키코드 표현
		// 48 - 57 => 0 - 9
		// 65 - 90 => A - Z
		// 97 - 122 => a - z
		
		char c4 = 97;
		System.out.println(c4);
		
		// 3. 문자 표현법
		char c5 = '최';
		System.out.println(c5);
		
		char c6 = '\'';
		System.out.println(c6);
		
		char c7 = '\"'; // String s1 = "\\"; 가능.
		
		
		// OO를 출력하는법
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "\'";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		// 띄어쓰기를 및 다음칸으로 옮기는 방법.
		System.out.println("aa" + '\t' + "bb");
		System.out.println("aa" + '\n' + "bb");
		System.out.println("aa" + '\r' + "bb");
		
		}
}
