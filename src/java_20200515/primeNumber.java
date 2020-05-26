package java_20200515;

public class primeNumber {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 2; i <= 100; i++) {  // 100이하의 숫자중 소수가 아닐때 1씩증가시키는 이중for문
			for (int j = 2; j < i ; j++)
				if (i % j == 0) { // 소수의 조건중 부합되지않는 if문(나누었을떄 나머지 값이 0일경우)
					
					count++;
				}
			if (count == 0) { //소수의 조건중 부합될때 출력
				System.out.println(i);
			}
			count =0;
		}
	}

}
