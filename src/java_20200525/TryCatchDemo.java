package java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {

			// System.out.println("예외메세지 : " + e.getMessage());
			// System.err.println("2개넣어!");
			e.printStackTrace(); // 어디서 에러가 났는지확인해주는 코드.
			/*
			 * 일반출력 : System.out / 에러출력 : System.err
			 */
		} catch (NumberFormatException e) {
			System.err.println("문자넣지말고 숫자 넣어!!");
		} finally {
			System.out.println("finally");
		}
		
			// catch 블럭이 여러 있을경우 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.

	}
}