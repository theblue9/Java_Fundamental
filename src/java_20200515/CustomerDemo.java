package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		// 클래스 객체 생성
		// Custom => 타입
		// c1 => 변수 (=레퍼런스)
		// new Customer() => 객체 생성
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.email = "syh@hbilab.org";
		c1.phone = "010-3024-1703";
		c1.balance = 1_000_000;
		c1.isReleased = false;

		System.out.println(" ========고객님의 정보========");
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);

		Customer c2 = new Customer(); // c1 객체와 c2객체는 서로 다른 개체이다. (=서로 다른 정보를 가지고 있다.)
		c2.name = "최재호";
		c2.email = "cjh930310@naver.com";
		c2.phone = "010-5397-4570";
		c2.balance = 100_000;
		c2.isReleased = false;

		System.out.println("========고객님의 정보========");
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);

		Customer c3 = c2; // c2가 가리키는곳을 c3로 가리켜라. (배열에서 배운 개념)
		c3.name = "손마사요시";
		System.out.println(c2.name);

		System.out.println("========고객님의 정보========");
		System.out.println(c3.name);
		System.out.println(c3.email);
		System.out.println(c3.phone);
		System.out.println(c3.balance);
		System.out.println(c3.isReleased);

	}

}
