package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또 복권 1000원 예제
		// 중보고드 짜는코드
		// 1. 1부터 45까지의 숫자중 임의 숫자 6개를 생성한다.
		// 2. 6개의 숫자중 중복된 숫자ㅏ 나오면 안된다.
		// Math.random() => 0보다 크거나 같고 1보다 작은 양수를 double값으로 변환한다. 0.00000 ~ 0.99999

		// 1~45의 랜덤값을 반환
		// int random = (int) (Math.random() * 45) + 1;
		// System.out.print(random);

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;

			// 중복되는값이 있는지 체크하는 변수
			boolean isExisted = false;

			// 중복체크하는 코드
			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				lotto[i] = random;
			} else {
				i--;
			}
		}
		// 오름차순으로 정리하기.
		// buble sort(ascemding)
		int index = 1;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}
				index++;
			}
			index++;
		}
		System.out.println(index);

		
		// 내림차순 정리하기.

		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}

}
