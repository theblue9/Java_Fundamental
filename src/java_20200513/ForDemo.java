package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// sum = sum + i;
			sum += i;

		}
		System.out.printf("1부터 10까지의 합은 %d입니다.%n", sum); // 숫자일떄는 퍼센트d 문자일때는 퍼센트 s
		System.out.printf("띄어쓰기 하는법은 %n을하면됩니다.%n");

		sum = 0; // 다시 초기값으로 설정?
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += 1;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d입니다.%n", sum);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}

		// 9단 8단 7단,,,2단까지. 역순으로 짜기
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}

		}
		/*
		 *
		 **
		 ***
		 ****
		 ***** 만들기
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		/*
		 *****
		 ****
		 ***
		 **
		 * 만들기
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//내방법.
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	
		   /*
	      *
	     **
	    ***
	   ****
	  ***** 만들기
	  *****
	   ****
	    ***
	     **
	      * 만들기			다이아몬드 만들기 연습
	  	   */
		for (int i = 0; i < 5; i++) {
			int m = 5- (i+1);
			int n = i+1;
			for (int j = 0; j < m; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j<n; j++) {
				System.out.printf("*");
			}
		}
	}
	 
	
	
}
