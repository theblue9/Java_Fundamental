package java_20200521;

public class StringDemo {
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = {1,2,3};
		String str = "abc";
		
		change(a,b,str);
		
		System.out.println(a); // 10
		System.out.println(b[0]); //10
		System.out.println(str); // abc
	}
	
	public static void change(int x, int[] array, String str) {
		x =20;
		array[0] = 10;
		str = str + "1234";
		System.out.println(str); // abc1234	// call by value 
	}
	

	

}
