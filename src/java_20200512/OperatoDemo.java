package java_20200512;

// ctl + shifr + f => 자동으로 줄 맞추기 설정키.
public class OperatoDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		// short circuit 발생.
		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = (double) b / (double) a; // b / (double)a;로 해도 결과값은 같다.
		System.out.println(d);

		c = a * b;
		System.out.println(c);

		c = b % a;
		System.out.println(c);

		a += b; // a = a + b;
		System.out.println(a);

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			// sum = sum + i; 밑에줄과 같은의미지만 하수의 느낌이 난다.
			sum += i;

		}
		System.out.println(sum);

		a = 10;
		b = 20;

		a++; // a = a+1;
		++b; // b = b+1;

		System.out.println(a); // 11
		System.out.println(b); // 21

		// 대입후 증가
		c = a++; // c => 11
		System.out.println(c);

		// 증가후 대입
		c = ++b; // c => 22
		System.out.println(c);

		a = 10;
		b = 20;
		d = 10.0;

		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == b;
		System.out.println(isSuccess);
		// primitivedata type의 ==연산자는 자료형에 상관없이 값만 같으면
		// true를 반환한다.

		isSuccess = a == d; // isSuccess = a!= b; => 같지 않냐에대한 입력값.
		System.out.println(isSuccess);

		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);

		a = 10;
		b = 20;

		// a && b => a가 false 이면 b를 연산하지 않음 (short circuit발생)
		// a || b => a가 true 이면 b를 연산하지 않음 (short circuit발생)
		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		// + => 연결연산자 (ㄷ개중 1갸 이상이 문자열일 경우)
		// , 산술연산자 (두개 모두 숫자일 경우)

		System.out.println(1 + 2 + 3 + "456");
		System.out.println("123" + 4 + 5 + 6);

	}

}
