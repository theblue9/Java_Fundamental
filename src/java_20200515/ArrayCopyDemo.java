package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };

		
		
		//배열의 길이를 변경하는 방법;
		//1. 더큰 배열을 새로 생성한다.
		//2. 기존 배열의 내용을 새로운 배열에 복사한다.
		
		String[] temp = new String[6]; 
		
		
		
		//배열의 길이 =>length , 문자열의 길이 => length()
		System.arraycopy(fruits, 0, temp, 2, 4);// fruits => 원본배열, 0 => 원본배열의 위치, temp => 복사할 배열, 
												//2 => 복사할 배열의 위치, //4 => 원본배열의 4개요소를 복사

		temp[0] = "peach";
		temp[1] = "pear";

		for (int i = 0; i < temp.length; i++) { // 인덱스를 임의로 조정하여 결과값이 빼먹을 수 있다.
			System.out.println(temp[i]);
		}

		for (String value : temp) {
			System.out.println(value);	//인덱스를 조정하지않고 전체를 출력하기 떄문에 결과값을 뺴먹을 일이없다.
		}
	}

}
