package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue; // continue을적용되면 if문에 입력한 값을 제외한 나머지 입력값만 출력한다.
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.(단 6은 제외한다.)%n", sum);

		outter: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					continue outter;
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}

}
