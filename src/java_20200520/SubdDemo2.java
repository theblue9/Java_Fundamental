package java_20200520;

public class SubdDemo2 {

	public static void change(Super sup) {  // Super sup = s1; => Super를 가르킨다.
		sup.age = 20;
		sup.playBadook();
		sup.work(); // Sub work() 호출 =>이유 : overriding 메서드는 자식 메서드가 호출됨.
	}

	public static void main(String[] args) {
		
		Sub s1 = new Sub();
		System.out.println(s1.age);

		change(s1);
		System.out.println(s1.age);
		
	}
	
}
