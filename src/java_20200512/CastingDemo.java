package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		// 형변환을 하면 에러가 발생하지 않고, 서킷(circuit) 발생
		// byte 범위를 넘어가면 에러발생
		byte a = (byte)129;	//서킷(circuit)이 발생되어 129일경우   -128  ~  128에서 -127 로 출력된다. circuit 발생시 에러가 안뜸.
		System.out.println(a);
		
		
		// float, double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림.
		// cut 발생. => 소수점이 잘려나간다는 의미.
		int b = (int)128.5; // (int) 를 입력하면 형변환으로 인해 출력이 가능해진다.
		System.out.println(b);
		
	}

}
