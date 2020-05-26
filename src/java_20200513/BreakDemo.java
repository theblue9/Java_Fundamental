package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6) break; // break문 적용. 이중for문이면 아래처럼 레이블명을 표시 해줘야한다.
			sum += i;
		}
		System.out.printf("1부터 5까지 합은 %d 입니다.%n", sum);

		outter: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5 && j == 6)
					break outter; // 레이블 표시를 반복문앞과 break 뒤에 붙이면 원하는 if문에조건을 맞출수이다
				System.out.printf("%d + %d = %d%n", i, j, i * j);
			}
	}
	}

}
