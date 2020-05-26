package java_20200518;

public class MethodOverLoadingDemo {

	// MethodOverLoadingDemo 클래스에서는 print 메서드를 4가지로 오버로딩
	// 오버로딩 작성규칙
	// 1. 같은 클래스 내에서
	// 2. 메서드 이름은 같아야 한다.
	// 3. 매개변수 객수가 같으면 자료형이 달라야 한다.
	// 4. 매개변수 객수가 달라야 한다.
	// 5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.

	public void print(String str) { // 메서드를 정할떈 영어 문법식으로 정한다 ex)String str을 print한다.
		System.out.print(str);
	}

	public void print(int i) {
		System.out.print(i);
	}

	public void print(double d) {
		System.out.print(d);
	}

	public void print(boolean b) {
		System.out.print(b);
	}
	
	public void test(int...a) {
		for(int temp : a) {
			System.out.print(temp);
		}
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo m = new MethodOverLoadingDemo();
		m.print("hellow");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.test(1);  //test의 값들을 출력
		m.test(1,2);
		m.test(1,2,3);
		m.test(1,2,3,4);
		
		System.out.printf("%d %d %s", 1,2, "hellow");
	}

}
