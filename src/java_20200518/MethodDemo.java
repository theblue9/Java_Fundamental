package java_20200518;

public class MethodDemo {
	// 5-10 라인까지 메서드를 정의
	// boolean 메서드의 반환값
	// instance 메서드
	// int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		// 메서드의 반환값이 boolean이기 떄문에 return value의
		// value도 boolean 이어야 한다.
		boolean isLeaf = year % 4 == 0 &&
				         year % 100 != 0 || 
				         year % 400 == 0;
		return isLeaf;
		
	}
	
	public long plus(int first, int second) {    // 반환값을  int로잡았을때, 2억+2억하게되면 int 값의 범위를 넘어간다 그러므로 long 값을 반환값 유형에 넣는다
		return (long)first +(long)second;
	}
	public double divide(int first, int second) {  // int끼리 나눈다고 int값이 나오지않을 수 있으니 double로 한다.
		return (double)first/(double)second;
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	
	public int[] ascending(int[] array) {      // 20200514 LottoryDemo 참고.
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}	
			}		
		}
		return array;
	}
	public static void main(String[] args) { 	//여기가 메인
		MethodDemo m = new MethodDemo();		//인스턴스 메서드 쓰려면 객체를 생성해야 된다.
		boolean test = m.isLeafYear(2100);		// 아규먼트(Argument) : 호출할때 쓰는 것 (2100);
		if(test) {
			m.println("윤년 입니다.");
		}else {
			m.println("윤년이 아닙니다.");
		}
		long result = m.plus(10000000, 12312331);
		System.out.println(result);
		
		double result2 = m.divide(12, 5);
		System.out.println(result2);
		
		int[] temp = {1,34,9,2,40,5,45};
		
		for(int value : temp) {
			System.out.print(value + "\t");
		}
		
		int[] result3 = m.ascending(temp);
		
		for(int value : result3) {
			System.out.print(value + "\t");
		}
				
	}
	
}
