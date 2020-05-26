package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		// 1. 배열을 선언및 생성한다.
		int[] a = new int[4];

		// 2. 배열 할당.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		System.out.println(123);
		System.out.println(123);// ctr + alt +방향키 밑으로 하면 자동복붙이 가능해해진다.
								// alt 방향키 위아래로 이동하면 해당 줄이 옮겨진다.

		// 3. 배열 출력
		// a.length => 배열의 길이
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// 배열선언, 생성과 할당을 동시에 이루어짐
		int[] b = { 100, 200, 300, 400, 500 };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// 배열의 값 변경(각각 할당 하는법.)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;

		// 배열 출력 => for loop 모든배열의 값을 출력시키는게아닌 원하는 부분만 출력할 수 있다. 아래랑 차이점은 원하는 만큼 출력가능.
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// 배열 출력 => enhanced for loop => 모든 배열의 값을 쉽게 출력을 할 수 있다. 위에랑 차이점은 모든수를 출력 할 수 밖에 없음.
		for (int temp : b) {
			System.out.println(temp);
		}

		int[] c = a;  //reference(참조값)은 각각의 변수에 값을 할당 할수 있으므로, 11을 할당하게되면 a에서도 11의 값을 참조할 수 있다.
		c[0] = 11;

		System.out.println(a[0]);
		System.out.println(c[0]);

	}

}
