package java_20200521;

public class ImplementClassDemo {
	public static void main(String[] args) {
		InterA i = new ImplementClass();
		
		i.mA();
		
		i.mB();

		i.mC(); //구현된 자식이 호출된다.
		
		//인터 페이스에 있는 변수는 변경불가 -이유 :final 변수
		//InterA.PI = 3.15;

		System.out.println(InterA.PI);
	}

}
