package java_20200514;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 1. 배열을 생성한다.
		int[] a = new int [4];
		
		// 2. 배열을 할당.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		System.out.println(123);


		// 3. 배열 출력.
		// a.length 배열의 길이
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
		//배열선언, 생성과 할당을 동시에 이루어짐
		int []b = {100,200,300,400,500};
		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//배열의 출력 => for loop 모든 배열의 갑을 출력시키는게 아닌 원하는 부분만 출력할 수 있다. 아래랑 차이점은 원하는 만큼 출력가능.
		
		for (int i = 0; i<3; i++) {
			System.out.println(b[i]);
		}
		
		//배열의 출력 => enhanced for loop => 모든 배열의 값을 쉽게 출력을 할 수 있다. 위에랑 차이점은 모든수를 출력 할 수 밖에 없음.
		for (int temp : b) {
		 System.out.println(temp);
		}
		
		int[] c = a;
		c[0] = 11;

		System.out.println(a[0]);
		System.out.println(c[0]);		
		
	}

}
