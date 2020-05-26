package java_20200512;

public class SsnDemo {
	public static void main(String[] args) {

		/*
		 * 주민등록 번호 공식(111111-1111118)
		 * 
		 * 1. 주민번호의 끝자리를 뺀 나머지를 2-9 다시 2-5까지 각각 곱한 합을 구한다.
		 * 
		 * 예) 1 1 1 1 1 1 1 1 1 1 1 1 * 2 3 4 5 6 7 8 9 2 3 4 5 2+ 3+ 4+ 5+ 6+ 7+ 8+ 9+
		 * 2+ 3+ 4+ 5 = 58 2. 총합을 11로 나눈 나머지를 구한다. 예) 58 % 11 =>3
		 * 
		 * 3. 11에서 나머지를 뺀다. (단, 나머지가 10 또는 11일 경우 10으로 나눈 나머지를 구한다.) 예) 11-3 => 8 4. 3의
		 * 결과와 주민번호 마지막 숫자와 같으면 정상적인 주민번호
		 *
		 */
		int a1 = 9;
		int a2 = 3;
		int a3 = 0;
		int a4 = 3;
		int a5 = 1;
		int a6 = 0;

		int b1 = 1;
		int b2 = 2;
		int b3 = 2;
		int b4 = 3;
		int b5 = 5;
		int b6 = 1;
		int b7 = 8;

		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;

		int rest = sum % 11;

		rest = 11 - rest;

		rest = rest % 10; // rest = rest % 10;

		if (b7 == rest) {
			System.out.println("정상적인 주민번호");
		}else {
			System.out.println("비 정상적인 주민번호");
		}

	}

}
