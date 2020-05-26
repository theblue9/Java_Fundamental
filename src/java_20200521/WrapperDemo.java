package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * 바자 1.4이전 버전에서는 primitive data type를 Collection에 저장
		 * 할 수 업었기 떄문에 primitive data type를 객체화 할 수 있는
		 * wrapper class가 필요함. 아래와 같이 1을 추가할 수 없음.
		 * Collection에 1을 저장하기 위해서는 primitive data type를 객체화
		 * 하는 Integer 클래스로 변환해야함.
		 * int[] temp = { 1, 2, 3, 4 };

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		int i3 = i1.intValue() + i2.intValue(); // primitieve로 바꾸면 값을 계산할 수 있다.
		 */
		ArrayList list = new ArrayList();
		list.add(1); // =>얘는 안된다. =>되는이유 : 1.5 이후 자동으로 boxing기능이 추가됨.
		list.add(new Integer(1)); // 생성자를 이용한다.
		// 1.primitive data type =>wrapper class ( new Integer(1) )
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		// 2.wrapper class => primitive data type( xxxValue())
		
		int i3 = i1.intValue() + i2.intValue();
		
		// 3. String => primitive data type
		
		String s1 = "10";
		String s2 = "20";
		
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2); //xxx.parseInt() => 문자열을 숫자로 바꿔주는 방법
		System.out.println(i4);
		
		// 4. primitive data type => String
		
		String s3 = 10+"";
		String s4 = String.valueOf(10);
		
		//primitive data type 자동으로 wrapper class 변환하는 것을 auto boxing이라고 한다.
		Integer i5 = 10;
		Integer i6 = 20;
		
		//자동 형변환 wrapper class가 자동으로  primitive data type 변환하는 것을 auto un-boxing이라고 한다.
		int i7 = i5 + i6;
		
		System.out.println(i7);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
