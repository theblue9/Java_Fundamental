package java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	// instance 메서드에서는 instance 변수, static 변수 몯 사용가능.
	// instance 메서드에서는 instance 메서드, static메서드 모두 호출가능.
	public void m1() {
		this.name = "성영한"; // 자기자신 객체
		StaticMethodDemo.interestRate = 4.2;
		this.m2();
		StaticMethodDemo.m4();
	}

	public void m2() {
		System.out.println("m2() 인스턴스에서도 호출");
	}

	public static void m3() {
		// static 메서드 에서는 static 변수만 사용가능, instance 변수 사용불가
		// static 메서드에서는 static 메서드만 호출 가능, instance 메서드 호출 불가
		// static 메서드에서는 this를 사용할 수 없음.
		// name = "홍길동"; =>안됨.
		StaticMethodDemo.interestRate = 3.9;
		// m2(); => 안됨
		StaticMethodDemo.m4();
		// static 메서드에서 instance 변수와 instance 메서드를 호춣려면 객체를 생성 해야된다.
		
		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "홍길동";
		m1.m2();
		
	}

	public static void m4() {
		System.out.println("m4() statice에서도 호출");
	}

	
	public static void main(String[] args) {
		StaticMethodDemo.m4();
		StaticMethodDemo.m3();
		StaticMethodDemo.
		interestRate = 4.3;
		
		
		StaticMethodDemo m = new StaticMethodDemo();	// 객체 생
		m.m1();	// 객체를 생성해야만 한다.
		m.m2();	// 객체를 생성해야만 한다.
		m.name = "손정의";
				
	}
	
	
}
