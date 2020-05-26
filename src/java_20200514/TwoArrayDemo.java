package java_20200514;

public class TwoArrayDemo {
	public static void main(String[] args) {

		// 배열 선언 및 생성
		int[][] a = new int[3][2];

		// 배열 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		// 배열 선언 및 생성과 할당
		int[][] b = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
